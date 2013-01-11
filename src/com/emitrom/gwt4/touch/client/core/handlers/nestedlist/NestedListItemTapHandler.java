/**************************************************************************
 * NestedListItemTapHandler.java is part of Touch4j 3.0. Copyright 2012 Emitrom
 * LLC
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
package com.emitrom.gwt4.touch.client.core.handlers.nestedlist;

import com.emitrom.gwt4.touch.client.core.EventObject;
import com.emitrom.gwt4.touch.client.core.handlers.AbstractHandler;
import com.emitrom.gwt4.touch.client.ui.ListDataView;
import com.emitrom.gwt4.touch.client.ui.NestedListDataView;
import com.emitrom.platform.util.client.core.BaseModel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public abstract class NestedListItemTapHandler extends AbstractHandler {

    final JavaScriptObject jsoPeer = createPeer(this);

    private static native JavaScriptObject createPeer(NestedListItemTapHandler listener) /*-{
		return function(source, list, index, target, record, event, eOpts) {
			var nestedList = @com.emitrom.gwt4.touch.client.ui.NestedListDataView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(source);
			var model = @com.emitrom.platform.util.client.core.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(record);
			var listJso = @com.emitrom.gwt4.touch.client.ui.ListDataView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(list);
			var eventObject = @com.emitrom.gwt4.touch.client.core.EventObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
			listener.@com.emitrom.gwt4.touch.client.core.handlers.nestedlist.NestedListItemTapHandler::fireOnEvent(Lcom/emitrom/gwt4/touch/client/ui/NestedListDataView;Lcom/emitrom/gwt4/touch/client/ui/ListDataView;ILcom/google/gwt/dom/client/Element;Lcom/emitrom/platform/util/client/core/BaseModel;Lcom/emitrom/gwt4/touch/client/core/EventObject;Ljava/lang/Object;)(nestedList, listJso, index, target, model, eventObject, eOpts);
		};
    }-*/;

    // Called from JSNI
    private final void fireOnEvent(NestedListDataView nestedList, ListDataView list, int index, Element target,
                    BaseModel record, EventObject event, Object eOpts) {
        UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
        if (handler != null) {
            fireOnEventAndCatch(nestedList, list, index, target, record, event, eOpts, handler);
        } else {
            onItemTap(nestedList, list, index, target, record, event, eOpts);
        }
    }

    private void fireOnEventAndCatch(NestedListDataView nestedList, ListDataView list, int index, Element target,
                    BaseModel record, EventObject event, Object eOpts, UncaughtExceptionHandler handler) {
        try {
            onItemTap(nestedList, list, index, target, record, event, eOpts);
        } catch (Throwable e) {
            handler.onUncaughtException(e);
        }
    }

    @Override
    public JavaScriptObject getJsoPeer() {
        return jsoPeer;
    }

    public abstract void onItemTap(NestedListDataView nestedList, ListDataView list, int index, Element target,
                    BaseModel record, EventObject event, Object eOpts);

}
