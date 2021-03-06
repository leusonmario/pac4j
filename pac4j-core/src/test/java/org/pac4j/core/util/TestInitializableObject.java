/*
  Copyright 2012 -2013 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.pac4j.core.util;

import junit.framework.TestCase;

/**
 * This class tests the {@link InitializableObject} class.
 * 
 * @author Jerome Leleu
 * @since 1.4.0
 */
public final class TestInitializableObject extends TestCase {
    
    public void testInit() {
        CounterInitializableObject counterInitializableObject = new CounterInitializableObject();
        assertEquals(0, counterInitializableObject.getCounter());
        counterInitializableObject.init();
        assertEquals(1, counterInitializableObject.getCounter());
        counterInitializableObject.init();
        assertEquals(1, counterInitializableObject.getCounter());
    }
    
    public void testReinit() {
        CounterInitializableObject counterInitializableObject = new CounterInitializableObject();
        assertEquals(0, counterInitializableObject.getCounter());
        counterInitializableObject.reinit();
        assertEquals(1, counterInitializableObject.getCounter());
        counterInitializableObject.reinit();
        assertEquals(2, counterInitializableObject.getCounter());
    }
}
