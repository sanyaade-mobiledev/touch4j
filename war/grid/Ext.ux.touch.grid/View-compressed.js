Ext.define("Ext.ux.touch.grid.View",{extend:"Ext.dataview.DataView",xtype:"touchgridpanel",requires:["Ext.ux.touch.grid.feature.Feature"],mixins:["Ext.ux.touch.grid.feature.Feature"],config:{columns:[],cls:"touchgridpanel",header:{xtype:"toolbar",docked:"top",cls:"x-grid-header"}},constructor:function(a){var d=this,b=a.columns||d.config.columns||d.columns,c=d.features=a.features||d.config.features||d.features;Ext.apply(a,{itemTpl:d._buildTpl(b,false)});if(typeof d.initFeatures==="function"&&typeof a.features==="object"){d.initFeatures(c,"constructor")}d.callParent([a]);d.setWidth(d._buildWidth())},initialize:function(){var a=this;a.callParent();if(typeof a.initFeatures==="function"&&typeof a.features==="object"){a.initFeatures(a.features,"initialize")}},applyHeader:function(a){Ext.apply(a,{docked:"top",cls:"x-grid-header",html:this._buildTpl(this.getColumns(),true)});return Ext.factory(a,Ext.Toolbar)},updateHeader:function(a){this.insert(0,a)},_buildWidth:function(){var f=this,b=f.getColumns(),i=0,h=b.length,g=0,a=false,e,d;for(;i<h;i++){e=b[i];d=e.width;if(!Ext.isNumber(d)){a=true;break}g+=d}return a?undefined:g},_defaultRenderer:function(a){return a},_buildTpl:function(g,i){var k=[],n=0,o=g.length,a=Ext.baseCSSPrefix,e={},f,j,p,h,d,m,b,l;for(;n<o;n++){f=g[n];j=[a+"grid-cell"],p=[];h=['dataindex="'+f.dataIndex+'"'];d=f.width;m=f.renderer||this._defaultRenderer;b=f.dataIndex+"_renderer";if(i){j.push(a+"grid-cell-hd");l=f.header}else{l="{[this."+b+"(values."+f.dataIndex+", values)]}";if(f.style){p.push(f.style)}if(f.cls){j.push(f.cls)}e[b]=m}if(d){p.push("width: "+d+(Ext.isString(d)?"":"px")+";")}if(p.length>0){h.push('style ="'+p.join(" ")+'"')}k.push('<div class="'+j.join(" ")+'" '+h.join("")+">"+l+"</div>")}k=k.join("");if(!i){return Ext.create("Ext.XTemplate",k,e)}return k},getColumn:function(b){var e=this,a=e.getColumns(),g=0,f=a.length,d;for(;g<f;g++){d=a[g];if(d.dataIndex===b){break}}return d}});