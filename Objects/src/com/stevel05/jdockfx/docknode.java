package com.stevel05.jdockfx;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class docknode extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("com.stevel05.jdockfx", "com.stevel05.jdockfx.docknode", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", com.stevel05.jdockfx.docknode.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.JavaObject _tjo = null;
public Object _mmodule = null;
public String _meventname = "";
public Object _mtag = null;
public anywheresoftware.b4j.object.JavaObject _mdocktitlebar = null;
public com.stevel05.jdockfx.main _main = null;
public com.stevel05.jdockfx.docknode  _initialize(com.stevel05.jdockfx.docknode __ref,anywheresoftware.b4a.BA _ba,Object _module,String _eventname,String _title,anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _node) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "initialize"))
	return (com.stevel05.jdockfx.docknode) Debug.delegate(ba, "initialize", new Object[] {_ba,_module,_eventname,_title,_node});
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Initialize(Module As Object,EventName A";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="mModule = Module";
__ref._mmodule = _module;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="If Node.IsInitialized Then";
if (_node.IsInitialized()) { 
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="TJO.InitializeNewInstance(\"org.dockfx.DockNode\",";
__ref._tjo.InitializeNewInstance("org.dockfx.DockNode",new Object[]{(Object)(_node.getObject()),(Object)(_title)});
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="If mEventName <> \"\" Then CallSubDelayed(Me,\"SetE";
if ((__ref._meventname).equals("") == false) { 
__c.CallSubDelayed(ba,this,"SetEventHandler");};
 }else {
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Dim P As Pane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="P.Initialize(\"AP\")";
_p.Initialize(ba,"AP");
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="TJO.InitializeNewInstance(\"org.dockfx.DockNode\",";
__ref._tjo.InitializeNewInstance("org.dockfx.DockNode",new Object[]{(Object)(_p.getObject()),(Object)(_title)});
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="If mEventName <> \"\" Then CallSubDelayed(Me,\"SetE";
if ((__ref._meventname).equals("") == false) { 
__c.CallSubDelayed(ba,this,"SetEventHandler");};
 };
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="Return Me";
if (true) return (com.stevel05.jdockfx.docknode)(this);
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="End Sub";
return null;
}
public com.stevel05.jdockfx.docknode  _graphic(com.stevel05.jdockfx.docknode __ref,String _filepath,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "graphic"))
	return (com.stevel05.jdockfx.docknode) Debug.delegate(ba, "graphic", new Object[] {_filepath,_filename});
anywheresoftware.b4j.objects.ImageViewWrapper _image1 = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub Graphic(FilePath As String,FileName As";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim Image1 As ImageView";
_image1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Image1.Initialize(\"\")";
_image1.Initialize(ba,"");
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Image1.SetImage(fx.LoadImage(FilePath,FileName))";
_image1.SetImage((javafx.scene.image.Image)(__ref._fx.LoadImage(_filepath,_filename).getObject()));
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="TJO.RunMethodJO(\"graphicProperty\",Null).RunMethod";
__ref._tjo.RunMethodJO("graphicProperty",(Object[])(__c.Null)).RunMethod("setValue",new Object[]{(Object)(_image1.getObject())});
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="Return Me";
if (true) return (com.stevel05.jdockfx.docknode)(this);
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="End Sub";
return null;
}
public com.stevel05.jdockfx.docknode  _prefsize(com.stevel05.jdockfx.docknode __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "prefsize"))
	return (com.stevel05.jdockfx.docknode) Debug.delegate(ba, "prefsize", new Object[] {_width,_height});
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub PrefSize(Width As Double,Height As Doub";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="TJO.RunMethod(\"setPrefSize\",Array(Width, Height))";
__ref._tjo.RunMethod("setPrefSize",new Object[]{(Object)(_width),(Object)(_height)});
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Return Me";
if (true) return (com.stevel05.jdockfx.docknode)(this);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getpane(com.stevel05.jdockfx.docknode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "getpane"))
	return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getpane", null);
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub getPane As Pane";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim N As Node = getContents";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_n = __ref._getcontents(null);
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="If N Is Pane Then Return N";
if (_n.getObjectOrNull() instanceof javafx.scene.layout.Pane) { 
if (true) return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_n.getObject()));};
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Log(\"Contents Node is not a Pane\")";
__c.Log("Contents Node is not a Pane");
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(__c.Null));
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="End Sub";
return null;
}
public com.stevel05.jdockfx.docknode  _dock(com.stevel05.jdockfx.docknode __ref,com.stevel05.jdockfx.dockpane _parent,String _location) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "dock"))
	return (com.stevel05.jdockfx.docknode) Debug.delegate(ba, "dock", new Object[] {_parent,_location});
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Dock(Parent As DockPane,Location As Str";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="TJO.RunMethod(\"dock\",Array(Parent.AsJO,Location))";
__ref._tjo.RunMethod("dock",new Object[]{(Object)(_parent._asjo(null).getObject()),(Object)(_location)});
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Return Me";
if (true) return (com.stevel05.jdockfx.docknode)(this);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="End Sub";
return null;
}
public String  _settag(com.stevel05.jdockfx.docknode __ref,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "settag"))
	return (String) Debug.delegate(ba, "settag", new Object[] {_tag});
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub setTag(Tag As Object)";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="mTag = Tag";
__ref._mtag = _tag;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public Object  _gettag(com.stevel05.jdockfx.docknode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "gettag"))
	return (Object) Debug.delegate(ba, "gettag", null);
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub getTag As Object";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Return mTag";
if (true) return __ref._mtag;
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _asjo(com.stevel05.jdockfx.docknode __ref,anywheresoftware.b4j.object.JavaObject _jo) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "asjo"))
	return (anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_jo});
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub AsJO(JO As JavaObject) As JavaObject";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Return JO";
if (true) return _jo;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(com.stevel05.jdockfx.docknode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Private TJO As JavaObject";
_tjo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Private mTag As Object";
_mtag = new Object();
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="Private mDockTitleBar As JavaObject";
_mdocktitlebar = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="End Sub";
return "";
}
public Object  _dockchanged_event(com.stevel05.jdockfx.docknode __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "dockchanged_event"))
	return (Object) Debug.delegate(ba, "dockchanged_event", new Object[] {_methodname,_args});
anywheresoftware.b4j.object.JavaObject _docked = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub DockChanged_Event(MethodName As String";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Dim Docked As JavaObject = Args(0)";
_docked = new anywheresoftware.b4j.object.JavaObject();
_docked.setObject((java.lang.Object)(_args[(int) (0)]));
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="If SubExists(mModule,mEventName & \"_DockChanged\")";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_DockChanged")) { 
__c.CallSubNew2(ba,__ref._mmodule,__ref._meventname+"_DockChanged",_docked.RunMethod("getValue",(Object[])(__c.Null)));};
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Return True";
if (true) return (Object)(__c.True);
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="End Sub";
return null;
}
public boolean  _getclosable(com.stevel05.jdockfx.docknode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "getclosable"))
	return (Boolean) Debug.delegate(ba, "getclosable", null);
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub getClosable As Boolean";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Return TJO.RunMethodJO(\"closableProperty\",Null).R";
if (true) return BA.ObjectToBoolean(__ref._tjo.RunMethodJO("closableProperty",(Object[])(__c.Null)).RunMethod("get",(Object[])(__c.Null)));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getcontents(com.stevel05.jdockfx.docknode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "getcontents"))
	return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) Debug.delegate(ba, "getcontents", null);
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub getContents As Node";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Return TJO.RunMethod(\"getContents\",Null)";
if (true) return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._tjo.RunMethod("getContents",(Object[])(__c.Null))));
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getdocktitlebar(com.stevel05.jdockfx.docknode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "getdocktitlebar"))
	return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) Debug.delegate(ba, "getdocktitlebar", null);
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub getDockTitleBar As Node";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Return TJO.RunMethod(\"getDockTitleBar\",Null)";
if (true) return (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._tjo.RunMethod("getDockTitleBar",(Object[])(__c.Null))));
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return null;
}
public boolean  _isdocked(com.stevel05.jdockfx.docknode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "isdocked"))
	return (Boolean) Debug.delegate(ba, "isdocked", null);
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub IsDocked As Boolean";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Return TJO.RunMethodJO(\"dockedProperty\",Null).Run";
if (true) return BA.ObjectToBoolean(__ref._tjo.RunMethodJO("dockedProperty",(Object[])(__c.Null)).RunMethod("get",(Object[])(__c.Null)));
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return false;
}
public Object  _paneresized_event(com.stevel05.jdockfx.docknode __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "paneresized_event"))
	return (Object) Debug.delegate(ba, "paneresized_event", new Object[] {_methodname,_args});
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub PaneResized_Event(MethodName As String";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim P As Pane = Sender";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p.setObject((javafx.scene.layout.Pane)(__c.Sender(ba)));
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="If SubExists(mModule,mEventName & \"_Resized\") The";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_Resized")) { 
__c.CallSubNew3(ba,__ref._mmodule,__ref._meventname+"_Resized",(Object)(_p.getWidth()),(Object)(_p.getHeight()));};
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Return True";
if (true) return (Object)(__c.True);
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return null;
}
public com.stevel05.jdockfx.docknode  _removedocktitlebar(com.stevel05.jdockfx.docknode __ref,boolean _archive) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "removedocktitlebar"))
	return (com.stevel05.jdockfx.docknode) Debug.delegate(ba, "removedocktitlebar", new Object[] {_archive});
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub RemoveDockTitleBar(Archive As Boolean)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If Archive Then mDockTitleBar = getDockTitleBar";
if (_archive) { 
__ref._mdocktitlebar.setObject((java.lang.Object)(__ref._getdocktitlebar(null).getObject()));};
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="TJO.RunMethod(\"setDockTitleBar\",Array(Null))";
__ref._tjo.RunMethod("setDockTitleBar",new Object[]{__c.Null});
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="Return Me";
if (true) return (com.stevel05.jdockfx.docknode)(this);
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="End Sub";
return null;
}
public com.stevel05.jdockfx.docknode  _restoredocktitlebar(com.stevel05.jdockfx.docknode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "restoredocktitlebar"))
	return (com.stevel05.jdockfx.docknode) Debug.delegate(ba, "restoredocktitlebar", null);
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub RestoreDockTitleBar As DockNode";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="If mDockTitleBar.IsInitialized Then";
if (__ref._mdocktitlebar.IsInitialized()) { 
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="setDockTitleBar(mDockTitleBar)";
__ref._setdocktitlebar(null,(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._mdocktitlebar.getObject())));
 }else {
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Log(\"Titlebar not archived, cannot restore it\")";
__c.Log("Titlebar not archived, cannot restore it");
 };
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Return Me";
if (true) return (com.stevel05.jdockfx.docknode)(this);
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="End Sub";
return null;
}
public String  _setdocktitlebar(com.stevel05.jdockfx.docknode __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _titlebar) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "setdocktitlebar"))
	return (String) Debug.delegate(ba, "setdocktitlebar", new Object[] {_titlebar});
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub setDockTitleBar(TitleBar As Node)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="TJO.RunMethod(\"setDockTitleBar\",Array(TitleBar))";
__ref._tjo.RunMethod("setDockTitleBar",new Object[]{(Object)(_titlebar.getObject())});
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public String  _setclosable(com.stevel05.jdockfx.docknode __ref,boolean _closable) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "setclosable"))
	return (String) Debug.delegate(ba, "setclosable", new Object[] {_closable});
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub setClosable(Closable As Boolean)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="TJO.RunMethodJO(\"closableProperty\",Null).RunMetho";
__ref._tjo.RunMethodJO("closableProperty",(Object[])(__c.Null)).RunMethod("set",new Object[]{(Object)(_closable)});
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public String  _setcontents(com.stevel05.jdockfx.docknode __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "setcontents"))
	return (String) Debug.delegate(ba, "setcontents", new Object[] {_n});
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub setContents(N As Node)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="TJO.RunMethod(\"setContents\",Array(N))";
__ref._tjo.RunMethod("setContents",new Object[]{(Object)(_n.getObject())});
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _seteventhandler(com.stevel05.jdockfx.docknode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="docknode";
if (Debug.shouldDelegate(ba, "seteventhandler"))
	return (String) Debug.delegate(ba, "seteventhandler", null);
anywheresoftware.b4j.agraham.reflection.Reflection _r = null;
anywheresoftware.b4j.object.JavaObject _dp = null;
Object _event = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub SetEventHandler";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim R As Reflector";
_r = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="R.Target = TJO";
_r.Target = (Object)(__ref._tjo.getObject());
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Dim DP As JavaObject =  R.GetField(\"dockedPropert";
_dp = new anywheresoftware.b4j.object.JavaObject();
_dp.setObject((java.lang.Object)(_r.GetField("dockedProperty")));
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Dim Event As Object = DP.CreateEvent(\"javafx.bean";
_event = _dp.CreateEvent(ba,"javafx.beans.value.ChangeListener","DockChanged",(Object)(__c.True));
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="DP.RunMethod(\"addListener\",Array(Event))";
_dp.RunMethod("addListener",new Object[]{_event});
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Dim N As Node = getContents";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_n = __ref._getcontents(null);
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="If N Is Pane Or N Is AnchorPane Then";
if (_n.getObjectOrNull() instanceof javafx.scene.layout.Pane || _n.getObjectOrNull() instanceof javafx.scene.layout.AnchorPane) { 
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="Dim Event As Object = AsJO(N).CreateEventFromUI(";
_event = __ref._asjo(null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n.getObject()))).CreateEventFromUI(ba,"javafx.beans.value.ChangeListener","PaneResized",(Object)(0));
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="AsJO(N).RunMethodJO(\"heightProperty\",Null).RunMe";
__ref._asjo(null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n.getObject()))).RunMethodJO("heightProperty",(Object[])(__c.Null)).RunMethod("addListener",new Object[]{_event});
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="AsJO(N).RunMethodJO(\"widthProperty\",Null).RunMet";
__ref._asjo(null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n.getObject()))).RunMethodJO("widthProperty",(Object[])(__c.Null)).RunMethod("addListener",new Object[]{_event});
 };
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="End Sub";
return "";
}
}