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


package org.slc.sli.sif.zis;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Request Handler for mock zis endpoint.
 *
 * @author jtully
 *
 */
public class MockZisRequestHandler extends AbstractRequestHandler {
    
    @Autowired
    private MockZis mockZis;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        System.out.println("GET MockZis");
        
        resp.setContentType("text/xml");
        
        writeResponseString(resp, mockZis.createAckString());
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {

        //System.out.println("POST MockZIS");
        
        String xmlString = getRequestString(req);
        
        mockZis.parseSIFMessage(xmlString);
        
        //System.out.println(xmlString);
        
        writeResponseString(resp, mockZis.createAckString());
    }
}
