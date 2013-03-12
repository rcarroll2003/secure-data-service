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

package org.slc.sli.api.jersey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.core.PathSegment;
import javax.xml.bind.DatatypeConverter;

import org.slc.sli.api.constants.EntityNames;
import org.slc.sli.api.constants.PathConstants;
import org.slc.sli.api.constants.ResourceNames;
import org.slc.sli.api.resources.generic.util.ResourceMethod;
import org.slc.sli.api.security.OauthSessionManager;
import org.slc.sli.api.security.SLIPrincipal;
import org.slc.sli.api.security.context.ContextValidator;
import org.slc.sli.api.security.context.resolver.EdOrgHelper;
import org.slc.sli.api.security.pdp.EndpointMutator;
import org.slc.sli.api.translator.URITranslator;
import org.slc.sli.api.util.SecurityUtil;
import org.slc.sli.api.validation.URLValidator;
import org.slc.sli.common.util.tenantdb.TenantContext;
import org.slc.sli.dal.MongoStat;
import org.slc.sli.domain.NeutralCriteria;
import org.slc.sli.domain.NeutralQuery;
import org.slc.sli.validation.EntityValidationException;
import org.slc.sli.validation.ValidationError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Component;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

/**
 * Pre-request processing filter. Adds security information for the user Records start time of the request
 * 
 * @author dkornishev
 */
@Component
public class PreProcessFilter implements ContainerRequestFilter {

    private static final List<String> WRITE_OPERATIONS = Arrays.asList(ResourceMethod.PUT.toString(), ResourceMethod.PATCH.toString(), ResourceMethod.DELETE.toString());
    private static final List<String> CONTEXTERS = Arrays.asList(PathConstants.STUDENT_SCHOOL_ASSOCIATIONS, PathConstants.STUDENT_SECTION_ASSOCIATIONS, PathConstants.STUDENT_COHORT_ASSOCIATIONS, PathConstants.STUDENT_PROGRAM_ASSOCIATIONS);
    
    @Resource(name = "urlValidators")
    private List<URLValidator> urlValidators;

    @Autowired
    private OauthSessionManager manager;

    @Autowired
    private ContextValidator contextValidator;

    @Autowired
    private MongoStat mongoStat;

    @Resource
    private EndpointMutator mutator;

    @Autowired
    private URITranslator translator;

    @Autowired
    private EdOrgHelper edOrgHelper;

    @Override
    public ContainerRequest filter(ContainerRequest request) {
        recordStartTime(request);
        validate(request);
        populateSecurityContext(request);
        mongoStat.clear();

        SLIPrincipal principal = (SLIPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        principal.setSubEdOrgHierarchy(edOrgHelper.getSubEdOrgHierarchy(principal.getEntity()));

        info("{} -> {}", request.getMethod(), request.getRequestUri().getPath());
        request.getProperties().put("original-request", request.getPath());
        mutator.mutateURI(SecurityContextHolder.getContext().getAuthentication(), request);
        contextValidator.validateContextToUri(request, principal);
        translator.translate(request);
        return request;
    }

    private void populateSecurityContext(ContainerRequest request) {
        OAuth2Authentication auth = manager.getAuthentication(request.getHeaderValue("Authorization"));
        SecurityContextHolder.getContext().setAuthentication(auth);
        TenantContext.setTenantId(((SLIPrincipal) auth.getPrincipal()).getTenantId());

        // Create obligations
        SLIPrincipal prince = SecurityUtil.getSLIPrincipal();
        
        for(PathSegment seg : request.getPathSegments()) {
            String resourceName = seg.getPath();
            if(ResourceNames.STUDENTS.equals(resourceName)) {
                break;
            }
            
            if(CONTEXTERS.contains(resourceName)) {               
                if(ResourceNames.STUDENT_SCHOOL_ASSOCIATIONS.equals(resourceName)) {                    
                    prince.addObligation(resourceName.replaceAll("s$",""), construct("exitWithdrawDate"));
                }
                else {
                    prince.addObligation(resourceName.replaceAll("s$",""), construct("endDate"));
                }
                
                info("Injected a date-based obligation on association: {}", resourceName);
            }
        }
        
    }

    /**
     * Creates a list of criteria which will be OR'ed when queries that are relevant are being executed
     * 
     * @param fieldName
     * @return
     */
    private List<NeutralQuery> construct(String fieldName) {
        String now = DatatypeConverter.printDate(Calendar.getInstance());

        NeutralQuery nq = new NeutralQuery(new NeutralCriteria(fieldName, NeutralCriteria.CRITERIA_GT, now));
        NeutralQuery nq2 = new NeutralQuery(new NeutralCriteria(fieldName, NeutralCriteria.CRITERIA_EXISTS, false));

        return Arrays.asList(nq, nq2);
    }

    /**
     * Returns true if the request is a write operation.
     * 
     * @param request Request to be checked.
     * @return True if the request method is a PUT, PATCH, or DELETE, false otherwise.
     */
    private boolean isWrite(String operation) {
        return WRITE_OPERATIONS.contains(operation);
    }

    private void recordStartTime(ContainerRequest request) {
        request.getProperties().put("startTime", System.currentTimeMillis());
    }

    /**
     * Validate the request url
     * 
     * @param request
     */
    private void validate(ContainerRequest request) {
        request.getProperties().put("logIntoDb", true);

        for (URLValidator validator : urlValidators) {
            if (!validator.validate(request.getRequestUri())) {
                request.getProperties().put("logIntoDb", false);
                List<ValidationError> errors = new ArrayList<ValidationError>();
                errors.add(0, new ValidationError(ValidationError.ErrorType.INVALID_VALUE, "URL", request.getRequestUri().toString(), null));
                throw new EntityValidationException("", "", errors);
            }
        }
    }

}
