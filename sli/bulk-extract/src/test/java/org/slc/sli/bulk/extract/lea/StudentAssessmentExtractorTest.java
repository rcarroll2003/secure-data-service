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

package org.slc.sli.bulk.extract.lea;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slc.sli.bulk.extract.extractor.EntityExtractor;
import org.slc.sli.bulk.extract.files.ExtractFile;
import org.slc.sli.bulk.extract.util.EdOrgExtractHelper;
import org.slc.sli.common.constants.EntityNames;
import org.slc.sli.common.constants.ParameterConstants;
import org.slc.sli.domain.Entity;
import org.slc.sli.domain.NeutralQuery;
import org.slc.sli.domain.Repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StudentAssessmentExtractorTest {
    
    private StudentAssessmentExtractor extractor;
    
    @Mock
    private Repository<Entity> mockRepo;
    @Mock
    private ExtractFileMap mockMap;
    @Mock
    private EntityExtractor mockExtractor;
    @Mock
    private ExtractFile mockFile;
    
    @Mock
    private EntityToEdOrgCache mockStudentCache;
    
    @Mock
    private Entity mockEntity;

    @Mock
    private EdOrgExtractHelper mockHelper;

    private Map<String, Object> entityBody;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        extractor = new StudentAssessmentExtractor(mockExtractor, mockMap, mockRepo, mockHelper);
        entityBody = new HashMap<String, Object>();
        Mockito.when(mockEntity.getBody()).thenReturn(entityBody);
        Mockito.when(mockMap.getExtractFileForEdOrg("LEA")).thenReturn(mockFile);
        Mockito.when(mockStudentCache.getEntriesById("student")).thenReturn(new HashSet<String>(Arrays.asList("LEA")));
    }
    
    
    @Test
    public void testWriteOneEntity() {
        Mockito.when(mockRepo.findEach(Mockito.eq(EntityNames.STUDENT_ASSESSMENT), Mockito.eq(new NeutralQuery())))
                .thenReturn(
                Arrays.asList(mockEntity).iterator());
        entityBody.put(ParameterConstants.STUDENT_ID, "student");
        extractor.extractEntities(mockStudentCache);
        Mockito.verify(mockExtractor).extractEntity(Mockito.eq(mockEntity), Mockito.eq(mockFile),
                Mockito.eq(EntityNames.STUDENT_ASSESSMENT));
    }
    
    @Test
    public void testWriteManyEntities() {
        Mockito.when(mockRepo.findEach(Mockito.eq(EntityNames.STUDENT_ASSESSMENT), Mockito.eq(new NeutralQuery())))
                .thenReturn(
                Arrays.asList(mockEntity, mockEntity, mockEntity).iterator());
        entityBody.put(ParameterConstants.STUDENT_ID, "student");
        extractor.extractEntities(mockStudentCache);
        Mockito.verify(mockExtractor, Mockito.times(3)).extractEntity(Mockito.eq(mockEntity), Mockito.eq(mockFile),
                Mockito.eq(EntityNames.STUDENT_ASSESSMENT));
    }
    
    @Test
    public void testExtractNoEntityBecauseOfLEAMiss() {
        Mockito.when(mockRepo.findEach(Mockito.eq(EntityNames.STUDENT_ASSESSMENT), Mockito.eq(new NeutralQuery())))
                .thenReturn(
                Arrays.asList(mockEntity).iterator());
        Mockito.when(mockMap.getExtractFileForEdOrg("LEA")).thenReturn(null);
        extractor.extractEntities(mockStudentCache);
        Mockito.verify(mockExtractor, Mockito.never()).extractEntity(Mockito.eq(mockEntity), Mockito.eq(mockFile),
                Mockito.eq(EntityNames.STUDENT_ASSESSMENT));
    }
    
    @Test
    public void testExtractNoEntityBecauseOfIdMiss() {
        entityBody.put(ParameterConstants.STUDENT_ID, "STUDENT1");
        Mockito.when(mockRepo.findEach(Mockito.eq(EntityNames.STUDENT_ASSESSMENT), Mockito.eq(new NeutralQuery())))
                .thenReturn(
                Arrays.asList(mockEntity).iterator());
        Mockito.when(mockMap.getExtractFileForEdOrg("LEA")).thenReturn(mockFile);
        extractor.extractEntities(mockStudentCache);
        Mockito.verify(mockExtractor, Mockito.never()).extractEntity(Mockito.eq(mockEntity), Mockito.eq(mockFile),
                Mockito.eq(EntityNames.STUDENT_ASSESSMENT));
    }

}
