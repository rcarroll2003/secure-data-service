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

package org.slc.sli.api.security.pdp;

import com.sun.jersey.core.header.InBoundHeaders;

import org.junit.Assert;
import org.junit.Test;


/**
 * Tests for MutatedContainer class.
 */
public class MutatedContainerTest {

    @Test
    public void testEquals() {

        MutatedContainer m1 = new MutatedContainer("a", "b", null);
        MutatedContainer m2 = new MutatedContainer("a", "b", null);
        Assert.assertTrue(m1.equals(m2));

        m1 = new MutatedContainer("a", "b", null);
        m2 = new MutatedContainer("c", "b", null);
        Assert.assertFalse(m1.equals(m2));

        m1 = new MutatedContainer("a", "b", null);
        m2 = new MutatedContainer("a", "c", null);
        Assert.assertFalse(m1.equals(m2));

        m1 = new MutatedContainer("a", "b", new InBoundHeaders());
        m2 = new MutatedContainer("a", "b", new InBoundHeaders());
        Assert.assertTrue(m1.equals(m2));

        m1 = new MutatedContainer("a", "b", new InBoundHeaders());
        m2 = new MutatedContainer("a", "b", null);
        Assert.assertFalse(m1.equals(m2));

        InBoundHeaders h1 = new InBoundHeaders();
        h1.putSingle("1", "1");
        InBoundHeaders h2 = new InBoundHeaders();
        h2.putSingle("1", "2");

        m1 = new MutatedContainer("a", "b", h1);
        m2 = new MutatedContainer("a", "b", h2);
        Assert.assertFalse(m1.equals(m2));

        h1 = new InBoundHeaders();
        h1.putSingle("1", "1");
        h2 = new InBoundHeaders();
        h2.putSingle("1", "1");

        m1 = new MutatedContainer("a", "b", h1);
        m2 = new MutatedContainer("a", "b", h2);
        Assert.assertTrue(m1.equals(m2));
    }

}