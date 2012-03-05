package org.slc.sli.ingestion.transformation;

import java.util.HashMap;
import java.util.Map;

import org.slc.sli.ingestion.NeutralRecord;
import org.slc.sli.ingestion.dal.NeutralRecordMongoAccess;
import org.slc.sli.ingestion.validation.DummyErrorReport;
import org.slc.sli.ingestion.validation.ErrorReport;
import org.slc.sli.ingestion.validation.ErrorReportSupport;
import org.slc.sli.ingestion.validation.Validator;

/**
 * @author ifaybyshev
 *
 * Abstract Combiner
 *
 * @param <T>
 * @param <O>
 */
public abstract class AbstractCombiner<T, O> implements TransformationStrategy<T, O> {

    Validator<T> preValidator;

    Validator<T> postValidator;
    
    protected Map<String, Map<Object, NeutralRecord>> collections = new HashMap<String, Map<Object, NeutralRecord>>();
    
    protected NeutralRecordMongoAccess neutralRecordMongoAccess;
    
    public AbstractCombiner(NeutralRecordMongoAccess neutralRecordMongoAccess) {
        this.neutralRecordMongoAccess = neutralRecordMongoAccess;
    }
    
    public void setNeutralRecordMongoAccess(NeutralRecordMongoAccess neutralRecordMongoAccess) {
        this.neutralRecordMongoAccess = neutralRecordMongoAccess;
    }
    
    abstract O doHandling(T item, ErrorReport errorReport);

    void pre(T item, ErrorReport errorReport) {
        if (preValidator != null) {
            preValidator.isValid(item, errorReport);
        }
    };

    void post(T item, ErrorReport errorReport) {
        if (postValidator != null) {
            preValidator.isValid(item, errorReport);
        }
    };
    
    @Override
    public void transform() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void loadData() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String persist() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public O handle(T item) {

        ErrorReport errorReport = null;
        if (item instanceof ErrorReportSupport) {
            errorReport = ((ErrorReportSupport) item).getErrorReport();
        } else {
            errorReport = new DummyErrorReport();
        }

        return handle(item, errorReport);
    }

    @Override
    public O handle(T item, ErrorReport errorReport) {

        O o = null;

        pre(item, errorReport);

        if (!errorReport.hasErrors()) {

            o = doHandling(item, errorReport);

            post(item, errorReport);
        }

        return o;
    }
    
}
