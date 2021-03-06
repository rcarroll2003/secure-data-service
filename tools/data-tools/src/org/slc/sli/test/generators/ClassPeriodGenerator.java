/*
 * Copyright 2012-2013 inBloom, Inc. and its affiliates.
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


package org.slc.sli.test.generators;

import java.util.ArrayList;
import java.util.List;

import org.slc.sli.test.edfi.entities.ClassPeriod;

public class ClassPeriodGenerator {

    public List<ClassPeriod> getMultipleClassPeriods(int n)
    {
        List<ClassPeriod> periods = new ArrayList<ClassPeriod>();
        for(int i =0; i < n; i++)
        {
            ClassPeriod period = new ClassPeriod();
            period.setClassPeriodName("Period " + i);
            period.setId(String.valueOf(i));
            
            periods.add(period);
        }
        return periods;
    }
    
    public ClassPeriod getClassPeriod(String id)
    {
        ClassPeriod period = new ClassPeriod();
        period.setClassPeriodName("Period " + id);
        period.setId(String.valueOf(id));
        return period;
    }
}
