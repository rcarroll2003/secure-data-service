package org.slc.sli.api.security.context.validator;

import java.util.Collections;
import java.util.Set;

import org.apache.commons.lang.NotImplementedException;
import org.slc.sli.api.constants.EntityNames;
import org.slc.sli.api.util.SecurityUtil;
import org.springframework.stereotype.Component;

@Component
public class AdminValidator implements IContextValidator {
    
    @Override
    public boolean canValidate(String entityType, boolean through) {
        String userType = SecurityUtil.getSLIPrincipal().getEntity().getType();
        if (userType.equals("user")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean validate(String entityType, Set<String> ids) {
        if (entityType.equals(EntityNames.EDUCATION_ORGANIZATION)) {
            return true;
        }
        return false;
    }
    
    //TODO: implement it
    public Set<String> getValid(String entityType, Set<String> ids) {
    	 if (entityType.equals(EntityNames.EDUCATION_ORGANIZATION)) {
    		 return ids;
    	 }
    	 
    	 return Collections.emptySet();
    }
}
