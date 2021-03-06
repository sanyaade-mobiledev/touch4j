/**************************************************************************
 * InteractionType.java is part of Touch4j 4.0. Copyright 2012 Emitrom LLC
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
package com.emitrom.touch4j.charts.client.interactions;

public enum InteractionType {
    PANZOOM("panzoom"), ITEM_COMPARE("itemcompare"), ITEM_HIGHTLIGH("itemhighlight"), ITEM_INFO("iteminfo"), PIE_GROUPING(
                    "piegrouping"), ROTATE("rotate"), ROTATE_3D("rotate3d"), RESET("reset"), CROSS_ZOOM("crosszoom"), PAN_ZOOM(
                    "panzoom"), TOGGLE_STACKED("togglestacked");

    private String value;

    private InteractionType(String type) {
        this.value = type;
    }

    public String getValue() {
        return value;
    }
}
