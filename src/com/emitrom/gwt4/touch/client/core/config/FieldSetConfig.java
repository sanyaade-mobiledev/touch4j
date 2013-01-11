/**************************************************************************
   FieldSetConfig.java is part of Touch4j 3.0.  Copyright 2012 Emitrom LLC

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 **************************************************************************/
package com.emitrom.gwt4.touch.client.core.config;

import com.emitrom.platform.util.client.core.JsoHelper;

/**
 *
 */
public class FieldSetConfig extends ContainerConfig {
    /**
     * Constructor.
     */
    public FieldSetConfig() {
        super();
    }
    
    /**
     * Optional fieldset instructions, rendered just below the grouped fields.
     * Defaults to: null
     * 
     * @param value
     */
    public void setInstructions(String value) {
        JsoHelper.setAttribute(jsObj, Attribute.INSTRUCTIONS.getValue(), value);
    }
    
    /**
     * Optional fieldset title, rendered just above the grouped fields
     * Defaults to: null.
     * 
     * @param value
     */
    public void setTitle(String value) {
        JsoHelper.setAttribute(jsObj, Attribute.TITLE.getValue(), value);
    }
}