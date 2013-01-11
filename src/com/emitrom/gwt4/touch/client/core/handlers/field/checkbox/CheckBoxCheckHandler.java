/**************************************************************************
 * CheckBoxCheckHandler.java is part of Touch4j 3.0. Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.gwt4.touch.client.core.handlers.field.checkbox;

import com.emitrom.gwt4.touch.client.core.handlers.AbstractHandler;
import com.emitrom.gwt4.touch.client.ui.CheckBox;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.core.client.JavaScriptObject;

public abstract class CheckBoxCheckHandler extends AbstractHandler {

    final JavaScriptObject jsoPeer = createPeer(this);

    private static native JavaScriptObject createPeer(CheckBoxCheckHandler listener) /*-{
		return function(source, eOpts) {
			var checkBox = @com.emitrom.gwt4.touch.client.ui.CheckBox::new(Lcom/google/gwt/core/client/JavaScriptObject;)(source);
			listener.@com.emitrom.gwt4.touch.client.core.handlers.field.checkbox.CheckBoxCheckHandler::fireOnEvent(Lcom/emitrom/gwt4/touch/client/ui/CheckBox;Ljava/lang/Object;)(checkBox, eOpts);
		};
    }-*/;

    // Called from JSNI
    private final void fireOnEvent(CheckBox checkBox, Object eOpts) {
        UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
        if (handler != null) {
            fireOnEventAndCatch(checkBox, eOpts, handler);
        } else {
            onCheck(checkBox, eOpts);
        }
    }

    private void fireOnEventAndCatch(CheckBox checkBox, Object eOpts, UncaughtExceptionHandler handler) {
        try {
            onCheck(checkBox, eOpts);
        } catch (Throwable e) {
            handler.onUncaughtException(e);
        }
    }

    @Override
    public JavaScriptObject getJsoPeer() {
        return jsoPeer;
    }

    public abstract void onCheck(CheckBox checkBox, Object eOpts);

}
