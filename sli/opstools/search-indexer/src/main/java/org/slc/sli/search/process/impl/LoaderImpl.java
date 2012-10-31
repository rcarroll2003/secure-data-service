/*
 * Copyright 2012 Shared Learning Collaborative, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.slc.sli.search.process.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.slc.sli.search.entity.IndexEntity.Action;
import org.slc.sli.search.process.Indexer;
import org.slc.sli.search.process.Loader;
import org.slc.sli.search.transform.IndexEntityConverter;
import org.slc.sli.search.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoaderImpl implements FileAlterationListener, Loader {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static final long DEFAULT_INTERVAL_MILLIS = 1000L;
    private static final int DEFAULT_EXECUTOR_THREADS = 5;

    private Indexer indexer;

    private IndexEntityConverter indexEntityConverter;

    private String inboxDir = Constants.DEFAULT_INBOX_DIR;

    private long pollIntervalMillis = DEFAULT_INTERVAL_MILLIS;

    private FileAlterationMonitor monitor;

    private ExecutorService executor;

    private int executorThreads = DEFAULT_EXECUTOR_THREADS;

    public void init() throws Exception {
        logger.info("Loader started");
        monitor = new FileAlterationMonitor(pollIntervalMillis);
        // create thread pool to process files
        executor = Executors.newFixedThreadPool(executorThreads );
        File inbox = new File(inboxDir);
        inbox.mkdir();
        FileAlterationObserver observer = new FileAlterationObserver(inbox);
        monitor.addObserver(observer);
        observer.addListener(this);
        // watch directory for files
        for (File f : inbox.listFiles()) {
            processFile(f);
        }
        monitor.start();
    }

    public void destroy() throws Exception {
        monitor.stop();
        executor.shutdown();
    }

    /**
     * A worker to process an individual file
     * 
     */
    private class LoaderWorker implements Runnable {

        private final File inFile;
        private final Action action;
        private final String index;

        LoaderWorker(String index, Action action, File inFile) {
            this.inFile = inFile;
            this.action = action;
            this.index = index;
        }

        public void run() {
            // read records from file
            BufferedReader br = null;
            String entity;
            boolean success = false;
            try {
                br = new BufferedReader(new FileReader(inFile));
                while ((entity = br.readLine()) != null) {
                    try {
                        indexer.index(indexEntityConverter.fromEntityJson(index, action, entity));
                    } catch (Throwable e) {
                        logger.error("Error reading record", e); 
                    }
                }
                success = true;
            } catch (IOException e) {
                logger.error("Error loading from file", e);
            } finally {
                IOUtils.closeQuietly(br);
                logger.info("Done processing file: " + inFile.getName());
                if (success)
                    archive(inFile);
            }
        }
    }

    /**
     * What to do after processing
     * 
     * @param inFile
     */
    public void archive(File inFile) {
        if (!inFile.delete()) {
            logger.error("Unable to delete processed file: " + inFile.getAbsolutePath());
        }
    }
    
    public void processFile(File inFile) {
        String[] nameTokens = inFile.getName().split("_");
        if (nameTokens.length < 2) {
            throw new IllegalArgumentException("The filename must contain index name - {index}_{collection}_{optional id}");
        }
        processFile(nameTokens[0], Action.INDEX, inFile);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.slc.sli.search.process.Loader#processFile(java.io.File)
     */
    public void processFile(String index, Action action, File inFile) {

        logger.info("Processing file: " + inFile.getName());
        // protect from incomplete files
        long size1 = 0L, size2 = 1L;
        FileInputStream fis = null;
        while (size1 != size2) {
            size1 = inFile.length();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {}
            size2 = inFile.length();
            try {
                fis = new FileInputStream(inFile);
            } catch (IOException ioe) {
            }
            finally {
                IOUtils.closeQuietly(fis);
            }
        }
        executor.execute(new LoaderWorker(index, action, inFile));
    }

    public void onDirectoryChange(File inFile) {
    }

    public void onDirectoryCreate(File inFile) {
    }

    public void onDirectoryDelete(File inFile) {
    }

    public void onFileChange(File inFile) {
    }

    public void onFileCreate(File inFile) {
        processFile(inFile);
    }

    public void onFileDelete(File inFile) {
    }

    public void onStart(FileAlterationObserver arg0) {
    }

    public void onStop(FileAlterationObserver arg0) {
    }

    public void setIndexer(Indexer indexer) {
        this.indexer = indexer;
    }

    public void setIndexEntityConverter(IndexEntityConverter indexEntityConverter) {
        this.indexEntityConverter = indexEntityConverter;
    }

    public void setPollIntervalMillis(long pollIntervalMillis) {
        this.pollIntervalMillis = pollIntervalMillis;
    }
    
    public void setInboxDir(String inboxDir) {
        this.inboxDir = inboxDir;
    }
    
    public void setExecutorThreads(int executorThreads) {
        this.executorThreads = executorThreads;
    }
    
    public String getHealth() {
        ThreadPoolExecutor tpe = (ThreadPoolExecutor)executor;
        return getClass() + ": {active count:" + tpe.getActiveCount() + ", completed count:" + tpe.getCompletedTaskCount() + "}";
    }
}