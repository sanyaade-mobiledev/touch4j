package com.emitrom.touch4j.ux.ubergrid.client.data;

import com.emitrom.touch4j.client.core.JsoHelper;
import com.emitrom.touch4j.client.data.BaseModel;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class for data to be used with the UberGrid
 * 
 * @author alainekambi
 * 
 */
public class UberGridModel extends BaseModel {

    protected static final String EVENT_TYPE = "EventType";

    public UberGridModel() {
        jsObj = JsoHelper.createObject();
    }

    UberGridModel(JavaScriptObject obj) {
        jsObj = obj;
    }

    public void setEventType(String value) {
        set(EVENT_TYPE, value);
    }
}
