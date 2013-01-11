/**************************************************************************
   ChartPanel.java is part of Touch4j 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.touch.charts.client;

import com.emitrom.gwt4.touch.client.core.config.Dock;
import com.emitrom.gwt4.touch.client.layout.Align;
import com.emitrom.gwt4.touch.client.layout.CardLayout;
import com.emitrom.gwt4.touch.client.layout.FitLayout;
import com.emitrom.gwt4.touch.client.ui.Button;
import com.emitrom.gwt4.touch.client.ui.Container;
import com.emitrom.gwt4.touch.client.ui.Panel;
import com.emitrom.gwt4.touch.client.ui.Spacer;

public class ChartPanel extends Container {
    
    private Panel headerPanel;
    private ChartPanelToolBar descriptionToolBar;
    private ChartPanelToolBar contentToolBar;
    private Chart chart;

    public ChartPanel() {

        setLayout(new FitLayout());
        contentToolBar = new ChartPanelToolBar();
        contentToolBar.add(new Spacer());
        descriptionToolBar = new ChartPanelToolBar();

        headerPanel = new Panel();
        headerPanel.setHeight("2.6em");
        headerPanel.setDocked(Dock.TOP);

        CardLayout layout = new CardLayout();
        layout.setAlign(Align.STRETCH);
        headerPanel.setLayout(layout);
        headerPanel.setItems(contentToolBar, descriptionToolBar);

        headerPanel.setActiveItem(0);
        add(headerPanel);

    }

    public ChartPanel(Chart chart) {
        this();
        this.chart = chart;
        this.setTitle("");
        this.add(chart);
    }

    public ChartPanel(String title, Chart chart) {
        this(chart);
        setTitle(title);
    }

    public void setTitle(String title) {
        this.contentToolBar.setTitle(title);
    }

    public void setDescriptionTitle(String title) {
        this.descriptionToolBar.setTitle(title);
    }

    public Panel getHeaderPanel() {
        return this.headerPanel;
    }

    public void addButton(Button button) {
        this.contentToolBar.add(button);
    }

    public Chart getChart() {
        return this.chart;
    }
}
