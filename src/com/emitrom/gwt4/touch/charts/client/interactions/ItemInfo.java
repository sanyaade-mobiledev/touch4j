/**************************************************************************
 * ItemInfo.java is part of Touch4j 3.0. Copyright 2012 Emitrom LLC
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
package com.emitrom.gwt4.touch.charts.client.interactions;

import com.emitrom.gwt4.touch.charts.client.handlers.ItemShowHandler;
import com.emitrom.gwt4.touch.client.core.config.PanelConfig;
import com.emitrom.platform.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class ItemInfo extends AbstractInteraction {

    public ItemInfo() {
        jsObj = JsoHelper.createObject();
        setType(InteractionType.ITEM_INFO);

    }

    ItemInfo(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void setPanelConfiguration(PanelConfig config)/*-{
		var jso = this.@com.emitrom.platform.util.client.core.JsObject::getJsObj()();
		jso.panel = config.@com.emitrom.platform.util.client.core.JsObject::getJsObj()();
    }-*/;

    public native void addItemShowHandler(ItemShowHandler handler)/*-{
		var jso = this.@com.emitrom.platform.util.client.core.JsObject::getJsObj()();
		jso.listeners = {
			show : function(itemInfo, item, panel) {
				var info = @com.emitrom.gwt4.touch.charts.client.interactions.ItemInfo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(itemInfo);
				var chartItem = @com.emitrom.gwt4.touch.charts.client.interactions.ChartItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(item);
				var p = @com.emitrom.gwt4.touch.client.ui.Panel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(panel);
				handler.@com.emitrom.gwt4.touch.charts.client.handlers.ItemShowHandler::onItemShow(Lcom/emitrom/gwt4/touch/charts/client/interactions/ItemInfo;Lcom/emitrom/gwt4/touch/charts/client/interactions/ChartItem;Lcom/emitrom/gwt4/touch/client/ui/Panel;)(info, chartItem,p);
			}
		};
    }-*/;

}
