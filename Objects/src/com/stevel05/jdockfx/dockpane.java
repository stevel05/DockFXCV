package com.stevel05.jdockfx;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class dockpane extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("com.stevel05.jdockfx", "com.stevel05.jdockfx.dockpane", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", com.stevel05.jdockfx.dockpane.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _eventname = "";
public Object _callback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.object.JavaObject _tjo = null;
public com.stevel05.jdockfx.main _main = null;
public String  _setdefaultuseragentstylesheet(com.stevel05.jdockfx.dockpane __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dockpane";
if (Debug.shouldDelegate(ba, "setdefaultuseragentstylesheet"))
	return (String) Debug.delegate(ba, "setdefaultuseragentstylesheet", null);
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub SetDefaultUserAgentStylesheet";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="TJO.RunMethod(\"initializeDefaultUserAgentStyleshe";
__ref._tjo.RunMethod("initializeDefaultUserAgentStylesheet",(Object[])(__c.Null));
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _asjo(com.stevel05.jdockfx.dockpane __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dockpane";
if (Debug.shouldDelegate(ba, "asjo"))
	return (anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", null);
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub AsJO As JavaObject";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Return TJO";
if (true) return __ref._tjo;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _asnode(com.stevel05.jdockfx.dockpane __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dockpane";
if (Debug.shouldDelegate(ba, "asnode"))
	return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) Debug.delegate(ba, "asnode", null);
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub AsNode As Node";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Return TJO";
if (true) return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._tjo.getObject()));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return null;
}
public String  _base_resize(com.stevel05.jdockfx.dockpane __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="dockpane";
if (Debug.shouldDelegate(ba, "base_resize"))
	return (String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height});
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="TJO.RunMethod(\"setPrefSize\",Array(Width,Height))";
__ref._tjo.RunMethod("setPrefSize",new Object[]{(Object)(_width),(Object)(_height)});
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.stevel05.jdockfx.dockpane __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dockpane";
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Private EventName As String 'ignore";
_eventname = "";
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Private CallBack As Object 'ignore";
_callback = new Object();
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Private TJO As JavaObject";
_tjo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(com.stevel05.jdockfx.dockpane __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="dockpane";
if (Debug.shouldDelegate(ba, "designercreateview"))
	return (String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props});
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="mBase.AddNode(TJO,0,0,mBase.Width,mBase.Height)";
__ref._mbase.AddNode((javafx.scene.Node)(__ref._tjo.getObject()),0,0,__ref._mbase.getWidth(),__ref._mbase.getHeight());
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(com.stevel05.jdockfx.dockpane __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dockpane";
if (Debug.shouldDelegate(ba, "getbase"))
	return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null);
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return null;
}
public String  _initialize(com.stevel05.jdockfx.dockpane __ref,anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dockpane";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vcallback,_veventname});
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="EventName = vEventName";
__ref._eventname = _veventname;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="CallBack = vCallback";
__ref._callback = _vcallback;
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="TJO.InitializeNewInstance(\"org.dockfx.DockPane\",N";
__ref._tjo.InitializeNewInstance("org.dockfx.DockPane",(Object[])(__c.Null));
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="End Sub";
return "";
}
public int  _nodecount(com.stevel05.jdockfx.dockpane __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dockpane";
if (Debug.shouldDelegate(ba, "nodecount"))
	return (Integer) Debug.delegate(ba, "nodecount", null);
anywheresoftware.b4j.agraham.reflection.Reflection _r = null;
anywheresoftware.b4j.object.JavaObject _sp = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub NodeCount As Int";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Dim R As Reflector";
_r = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="R.Target =  TJO";
_r.Target = (Object)(__ref._tjo.getObject());
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Dim Sp As JavaObject = R.GetField(\"root\")";
_sp = new anywheresoftware.b4j.object.JavaObject();
_sp.setObject((java.lang.Object)(_r.GetField("root")));
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Return Sp.RunMethodJO(\"getItems\",Null).RunMethod(";
if (true) return (int)(BA.ObjectToNumber(_sp.RunMethodJO("getItems",(Object[])(__c.Null)).RunMethod("size",(Object[])(__c.Null))));
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.SplitPaneWrapper  _splitpane(com.stevel05.jdockfx.dockpane __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dockpane";
if (Debug.shouldDelegate(ba, "splitpane"))
	return (anywheresoftware.b4j.objects.SplitPaneWrapper) Debug.delegate(ba, "splitpane", null);
anywheresoftware.b4j.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub SplitPane As SplitPane";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim R As Reflector";
_r = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="R.Target = TJO";
_r.Target = (Object)(__ref._tjo.getObject());
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Return R.GetField(\"root\")";
if (true) return (anywheresoftware.b4j.objects.SplitPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.SplitPaneWrapper(), (javafx.scene.control.SplitPane)(_r.GetField("root")));
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return null;
}
}