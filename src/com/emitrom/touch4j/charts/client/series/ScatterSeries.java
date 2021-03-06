/**************************************************************************
 * ScatterSeries.java is part of Touch4j 4.0. Copyright 2012 Emitrom LLC
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
package com.emitrom.touch4j.charts.client.series;

import com.emitrom.touch4j.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class ScatterSeries extends CartesianSeries {

    public ScatterSeries() {
        jsObj = JsoHelper.createObject();
        setType("scatter");
    }

    public native void setMarkerConfig(JavaScriptObject value)/*-{
		var series = this.@com.emitrom.touch4j.client.core.JsObject::getJsObj()();
		series.markerConfig = value;
    }-*/;

    public native void setStyle(Object value)/*-{
		var series = this.@com.emitrom.touch4j.client.core.JsObject::getJsObj()();
		series.style = value;
    }-*/;
}
