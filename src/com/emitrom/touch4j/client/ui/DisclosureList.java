/**************************************************************************
 * DisclosureList.java is part of Touch4j 4.0. Copyright 2012 Emitrom LLC
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
package com.emitrom.touch4j.client.ui;

import com.emitrom.touch4j.client.core.config.XType;
import com.emitrom.touch4j.client.core.template.Template;
import com.emitrom.touch4j.client.data.Store;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * ListDataView is a custom styled DataView which allows Grouping, Indexing,
 * Icons, and a Disclosure.
 * 
 */
public class DisclosureList extends ListDataView {

    private String listStyle;

    protected DisclosureList(JavaScriptObject config) {
        super(config);
    }

    @Override
    protected native void init()/*-{
		var c = new $wnd.Ext.dataview.List();
		this.@com.emitrom.touch4j.client.core.Component::configPrototype = c.initialConfig;
    }-*/;

    @Override
    public String getXType() {
        return XType.LIST.getValue();
    }

    /**
     * Create a new Disclosurelist.
     */
    public DisclosureList() {
    }

    public DisclosureList(Store store) {
        setStore(store);
    }

    public DisclosureList(String itemTemplate, Store store) {
        setStore(store);
        setItemTpl(itemTemplate);
    }

    public DisclosureList(String itemTemplate) {
        setItemTpl(itemTemplate);
    }

    public DisclosureList(Template itemTemplate, Store store) {
        setStore(store);
        setItemTpl(itemTemplate);
    }

    public DisclosureList(Template itemTemplate) {
        setItemTpl(itemTemplate);
    }

    @Override
    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		config.onItemDisclosure = {};
		return new $wnd.Ext.dataview.List(config);
    }-*/;

}
