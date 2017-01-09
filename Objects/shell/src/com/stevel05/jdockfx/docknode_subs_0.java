package com.stevel05.jdockfx;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class docknode_subs_0 {


public static RemoteObject  _asjo(RemoteObject __ref,RemoteObject _jo) throws Exception{
try {
		Debug.PushSubsStack("AsJO (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("asjo")) return __ref.runUserSub(false, "docknode","asjo", __ref, _jo);
Debug.locals.put("JO", _jo);
 BA.debugLineNum = 179;BA.debugLine="Private Sub AsJO(JO As JavaObject) As JavaObject";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="Return JO";
Debug.ShouldStop(524288);
if (true) return _jo;
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private fx As JFX";
docknode._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",docknode._fx);
 //BA.debugLineNum = 7;BA.debugLine="Private TJO As JavaObject";
docknode._tjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_tjo",docknode._tjo);
 //BA.debugLineNum = 8;BA.debugLine="Private mModule As Object";
docknode._mmodule = RemoteObject.createNew ("Object");__ref.setField("_mmodule",docknode._mmodule);
 //BA.debugLineNum = 9;BA.debugLine="Private mEventName As String";
docknode._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",docknode._meventname);
 //BA.debugLineNum = 10;BA.debugLine="Private mTag As Object";
docknode._mtag = RemoteObject.createNew ("Object");__ref.setField("_mtag",docknode._mtag);
 //BA.debugLineNum = 11;BA.debugLine="Private mDockTitleBar As JavaObject";
docknode._mdocktitlebar = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_mdocktitlebar",docknode._mdocktitlebar);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dock(RemoteObject __ref,RemoteObject _parent,RemoteObject _location) throws Exception{
try {
		Debug.PushSubsStack("Dock (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("dock")) return __ref.runUserSub(false, "docknode","dock", __ref, _parent, _location);
Debug.locals.put("Parent", _parent);
Debug.locals.put("Location", _location);
 BA.debugLineNum = 60;BA.debugLine="Public Sub Dock(Parent As DockPane,Location As Str";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="TJO.RunMethod(\"dock\",Array(Parent.AsJO,Location))";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tjo").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("dock")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_parent.runClassMethod (com.stevel05.jdockfx.dockpane.class, "_asjo").getObject()),(_location)})));
 BA.debugLineNum = 62;BA.debugLine="Return Me";
Debug.ShouldStop(536870912);
if (true) return (__ref);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dockchanged_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("DockChanged_Event (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("dockchanged_event")) return __ref.runUserSub(false, "docknode","dockchanged_event", __ref, _methodname, _args);
RemoteObject _docked = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 163;BA.debugLine="Private Sub DockChanged_Event(MethodName As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 165;BA.debugLine="Dim Docked As JavaObject = Args(0)";
Debug.ShouldStop(16);
_docked = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_docked.setObject(_args.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Docked", _docked);
 BA.debugLineNum = 166;BA.debugLine="If SubExists(mModule,mEventName & \"_DockChanged\")";
Debug.ShouldStop(32);
if (docknode.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_DockChanged")))).<Boolean>get().booleanValue()) { 
docknode.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_DockChanged"))),(Object)(_docked.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getValue")),(Object)((docknode.__c.getField(false,"Null"))))));};
 BA.debugLineNum = 167;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return (docknode.__c.getField(true,"True"));
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getclosable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getClosable (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("getclosable")) return __ref.runUserSub(false, "docknode","getclosable", __ref);
 BA.debugLineNum = 43;BA.debugLine="Public Sub getClosable As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Return TJO.RunMethodJO(\"closableProperty\",Null).R";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_tjo").runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("closableProperty")),(Object)((docknode.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)((docknode.__c.getField(false,"Null")))));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcontents(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContents (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("getcontents")) return __ref.runUserSub(false, "docknode","getcontents", __ref);
 BA.debugLineNum = 53;BA.debugLine="Public Sub getContents As Node";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Return TJO.RunMethod(\"getContents\",Null)";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_tjo").runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getContents")),(Object)((docknode.__c.getField(false,"Null")))));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdocktitlebar(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDockTitleBar (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("getdocktitlebar")) return __ref.runUserSub(false, "docknode","getdocktitlebar", __ref);
 BA.debugLineNum = 71;BA.debugLine="Public Sub getDockTitleBar As Node";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Return TJO.RunMethod(\"getDockTitleBar\",Null)";
Debug.ShouldStop(128);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_tjo").runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDockTitleBar")),(Object)((docknode.__c.getField(false,"Null")))));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpane(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPane (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("getpane")) return __ref.runUserSub(false, "docknode","getpane", __ref);
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
 BA.debugLineNum = 117;BA.debugLine="Public Sub getPane As Pane";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="Dim N As Node = getContents";
Debug.ShouldStop(2097152);
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
_n = __ref.runClassMethod (com.stevel05.jdockfx.docknode.class, "_getcontents");Debug.locals.put("N", _n);Debug.locals.put("N", _n);
 BA.debugLineNum = 119;BA.debugLine="If N Is Pane Then Return N";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("i",_n.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.layout.Pane"))) { 
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), _n.getObject());};
 BA.debugLineNum = 120;BA.debugLine="Log(\"Contents Node is not a Pane\")";
Debug.ShouldStop(8388608);
docknode.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Contents Node is not a Pane")));
 BA.debugLineNum = 121;BA.debugLine="Return Null";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), docknode.__c.getField(false,"Null"));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettag(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTag (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("gettag")) return __ref.runUserSub(false, "docknode","gettag", __ref);
 BA.debugLineNum = 138;BA.debugLine="Sub getTag As Object";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Return mTag";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_mtag");
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _graphic(RemoteObject __ref,RemoteObject _filepath,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Graphic (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("graphic")) return __ref.runUserSub(false, "docknode","graphic", __ref, _filepath, _filename);
RemoteObject _image1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
Debug.locals.put("FilePath", _filepath);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 99;BA.debugLine="Public Sub Graphic(FilePath As String,FileName As";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Dim Image1 As ImageView";
Debug.ShouldStop(8);
_image1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("Image1", _image1);
 BA.debugLineNum = 101;BA.debugLine="Image1.Initialize(\"\")";
Debug.ShouldStop(16);
_image1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 102;BA.debugLine="Image1.SetImage(fx.LoadImage(FilePath,FileName))";
Debug.ShouldStop(32);
_image1.runVoidMethod ("SetImage",(Object)((__ref.getField(false,"_fx").runMethod(false,"LoadImage",(Object)(_filepath),(Object)(_filename)).getObject())));
 BA.debugLineNum = 103;BA.debugLine="TJO.RunMethodJO(\"graphicProperty\",Null).RunMethod";
Debug.ShouldStop(64);
__ref.getField(false,"_tjo").runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("graphicProperty")),(Object)((docknode.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setValue")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_image1.getObject())})));
 BA.debugLineNum = 104;BA.debugLine="Return Me";
Debug.ShouldStop(128);
if (true) return (__ref);
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _module,RemoteObject _eventname,RemoteObject _title,RemoteObject _node) throws Exception{
try {
		Debug.PushSubsStack("Initialize (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "docknode","initialize", __ref, _ba, _module, _eventname, _title, _node);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Module", _module);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Title", _title);
Debug.locals.put("Node", _node);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize(Module As Object,EventName A";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="mModule = Module";
Debug.ShouldStop(1048576);
__ref.setField ("_mmodule",_module);
 BA.debugLineNum = 22;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(2097152);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 23;BA.debugLine="If Node.IsInitialized Then";
Debug.ShouldStop(4194304);
if (_node.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 24;BA.debugLine="TJO.InitializeNewInstance(\"org.dockfx.DockNode\",";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tjo").runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("org.dockfx.DockNode")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_node.getObject()),(_title)})));
 BA.debugLineNum = 25;BA.debugLine="If mEventName <> \"\" Then CallSubDelayed(Me,\"SetE";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_meventname"),BA.ObjectToString(""))) { 
docknode.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("SetEventHandler")));};
 }else {
 BA.debugLineNum = 27;BA.debugLine="Dim P As Pane";
Debug.ShouldStop(67108864);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");Debug.locals.put("P", _p);
 BA.debugLineNum = 28;BA.debugLine="P.Initialize(\"AP\")";
Debug.ShouldStop(134217728);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("AP")));
 BA.debugLineNum = 29;BA.debugLine="TJO.InitializeNewInstance(\"org.dockfx.DockNode\",";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tjo").runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("org.dockfx.DockNode")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_p.getObject()),(_title)})));
 BA.debugLineNum = 30;BA.debugLine="If mEventName <> \"\" Then CallSubDelayed(Me,\"SetE";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_meventname"),BA.ObjectToString(""))) { 
docknode.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("SetEventHandler")));};
 };
 BA.debugLineNum = 32;BA.debugLine="Return Me";
Debug.ShouldStop(-2147483648);
if (true) return (__ref);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isdocked(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsDocked (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("isdocked")) return __ref.runUserSub(false, "docknode","isdocked", __ref);
 BA.debugLineNum = 110;BA.debugLine="Public Sub IsDocked As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Return TJO.RunMethodJO(\"dockedProperty\",Null).Run";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_tjo").runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("dockedProperty")),(Object)((docknode.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)((docknode.__c.getField(false,"Null")))));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _paneresized_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("PaneResized_Event (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("paneresized_event")) return __ref.runUserSub(false, "docknode","paneresized_event", __ref, _methodname, _args);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 170;BA.debugLine="Private Sub PaneResized_Event(MethodName As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Dim P As Pane = Sender";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p.setObject(docknode.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("P", _p);
 BA.debugLineNum = 172;BA.debugLine="If SubExists(mModule,mEventName & \"_Resized\") The";
Debug.ShouldStop(2048);
if (docknode.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resized")))).<Boolean>get().booleanValue()) { 
docknode.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resized"))),(Object)((_p.runMethod(true,"getWidth"))),(Object)((_p.runMethod(true,"getHeight"))));};
 BA.debugLineNum = 173;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) return (docknode.__c.getField(true,"True"));
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prefsize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("PrefSize (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("prefsize")) return __ref.runUserSub(false, "docknode","prefsize", __ref, _width, _height);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 127;BA.debugLine="Public Sub PrefSize(Width As Double,Height As Doub";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="TJO.RunMethod(\"setPrefSize\",Array(Width, Height))";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tjo").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPrefSize")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_width),(_height)})));
 BA.debugLineNum = 129;BA.debugLine="Return Me";
Debug.ShouldStop(1);
if (true) return (__ref);
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removedocktitlebar(RemoteObject __ref,RemoteObject _archive) throws Exception{
try {
		Debug.PushSubsStack("RemoveDockTitleBar (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("removedocktitlebar")) return __ref.runUserSub(false, "docknode","removedocktitlebar", __ref, _archive);
Debug.locals.put("Archive", _archive);
 BA.debugLineNum = 78;BA.debugLine="Public Sub RemoveDockTitleBar(Archive As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="If Archive Then mDockTitleBar = getDockTitleBar";
Debug.ShouldStop(16384);
if (_archive.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mdocktitlebar").setObject (__ref.runClassMethod (com.stevel05.jdockfx.docknode.class, "_getdocktitlebar").getObject());};
 BA.debugLineNum = 80;BA.debugLine="TJO.RunMethod(\"setDockTitleBar\",Array(Null))";
Debug.ShouldStop(32768);
__ref.getField(false,"_tjo").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDockTitleBar")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {docknode.__c.getField(false,"Null")})));
 BA.debugLineNum = 81;BA.debugLine="Return Me";
Debug.ShouldStop(65536);
if (true) return (__ref);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _restoredocktitlebar(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RestoreDockTitleBar (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("restoredocktitlebar")) return __ref.runUserSub(false, "docknode","restoredocktitlebar", __ref);
 BA.debugLineNum = 87;BA.debugLine="Public Sub RestoreDockTitleBar As DockNode";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="If mDockTitleBar.IsInitialized Then";
Debug.ShouldStop(8388608);
if (__ref.getField(false,"_mdocktitlebar").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 89;BA.debugLine="setDockTitleBar(mDockTitleBar)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (com.stevel05.jdockfx.docknode.class, "_setdocktitlebar",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_mdocktitlebar").getObject()));
 }else {
 BA.debugLineNum = 91;BA.debugLine="Log(\"Titlebar not archived, cannot restore it\")";
Debug.ShouldStop(67108864);
docknode.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Titlebar not archived, cannot restore it")));
 };
 BA.debugLineNum = 93;BA.debugLine="Return Me";
Debug.ShouldStop(268435456);
if (true) return (__ref);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setclosable(RemoteObject __ref,RemoteObject _closable) throws Exception{
try {
		Debug.PushSubsStack("setClosable (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("setclosable")) return __ref.runUserSub(false, "docknode","setclosable", __ref, _closable);
Debug.locals.put("Closable", _closable);
 BA.debugLineNum = 39;BA.debugLine="Public Sub setClosable(Closable As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="TJO.RunMethodJO(\"closableProperty\",Null).RunMetho";
Debug.ShouldStop(128);
__ref.getField(false,"_tjo").runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("closableProperty")),(Object)((docknode.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_closable)})));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcontents(RemoteObject __ref,RemoteObject _n) throws Exception{
try {
		Debug.PushSubsStack("setContents (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("setcontents")) return __ref.runUserSub(false, "docknode","setcontents", __ref, _n);
Debug.locals.put("N", _n);
 BA.debugLineNum = 50;BA.debugLine="Public Sub setContents(N As Node)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="TJO.RunMethod(\"setContents\",Array(N))";
Debug.ShouldStop(262144);
__ref.getField(false,"_tjo").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setContents")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_n.getObject())})));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdocktitlebar(RemoteObject __ref,RemoteObject _titlebar) throws Exception{
try {
		Debug.PushSubsStack("setDockTitleBar (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setdocktitlebar")) return __ref.runUserSub(false, "docknode","setdocktitlebar", __ref, _titlebar);
Debug.locals.put("TitleBar", _titlebar);
 BA.debugLineNum = 68;BA.debugLine="Public Sub setDockTitleBar(TitleBar As Node)";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="TJO.RunMethod(\"setDockTitleBar\",Array(TitleBar))";
Debug.ShouldStop(16);
__ref.getField(false,"_tjo").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDockTitleBar")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_titlebar.getObject())})));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteventhandler(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetEventHandler (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("seteventhandler")) return __ref.runUserSub(false, "docknode","seteventhandler", __ref);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
RemoteObject _dp = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _event = RemoteObject.declareNull("Object");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
 BA.debugLineNum = 145;BA.debugLine="Private Sub SetEventHandler";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="Dim R As Reflector";
Debug.ShouldStop(131072);
_r = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("R", _r);
 BA.debugLineNum = 147;BA.debugLine="R.Target = TJO";
Debug.ShouldStop(262144);
_r.setField ("Target",(__ref.getField(false,"_tjo").getObject()));
 BA.debugLineNum = 148;BA.debugLine="Dim DP As JavaObject =  R.GetField(\"dockedPropert";
Debug.ShouldStop(524288);
_dp = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_dp.setObject(_r.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("dockedProperty"))));Debug.locals.put("DP", _dp);
 BA.debugLineNum = 149;BA.debugLine="Dim Event As Object = DP.CreateEvent(\"javafx.bean";
Debug.ShouldStop(1048576);
_event = _dp.runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("javafx.beans.value.ChangeListener")),(Object)(BA.ObjectToString("DockChanged")),(Object)((docknode.__c.getField(true,"True"))));Debug.locals.put("Event", _event);Debug.locals.put("Event", _event);
 BA.debugLineNum = 150;BA.debugLine="DP.RunMethod(\"addListener\",Array(Event))";
Debug.ShouldStop(2097152);
_dp.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_event})));
 BA.debugLineNum = 152;BA.debugLine="Dim N As Node = getContents";
Debug.ShouldStop(8388608);
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
_n = __ref.runClassMethod (com.stevel05.jdockfx.docknode.class, "_getcontents");Debug.locals.put("N", _n);Debug.locals.put("N", _n);
 BA.debugLineNum = 153;BA.debugLine="If N Is Pane Or N Is AnchorPane Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("i",_n.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.layout.Pane")) || RemoteObject.solveBoolean("i",_n.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.layout.AnchorPane"))) { 
 BA.debugLineNum = 154;BA.debugLine="Dim Event As Object = AsJO(N).CreateEventFromUI(";
Debug.ShouldStop(33554432);
_event = __ref.runClassMethod (com.stevel05.jdockfx.docknode.class, "_asjo",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _n.getObject())).runMethod(false,"CreateEventFromUI",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("javafx.beans.value.ChangeListener")),(Object)(BA.ObjectToString("PaneResized")),(Object)(RemoteObject.createImmutable((0))));Debug.locals.put("Event", _event);Debug.locals.put("Event", _event);
 BA.debugLineNum = 155;BA.debugLine="AsJO(N).RunMethodJO(\"heightProperty\",Null).RunMe";
Debug.ShouldStop(67108864);
__ref.runClassMethod (com.stevel05.jdockfx.docknode.class, "_asjo",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _n.getObject())).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("heightProperty")),(Object)((docknode.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_event})));
 BA.debugLineNum = 156;BA.debugLine="AsJO(N).RunMethodJO(\"widthProperty\",Null).RunMet";
Debug.ShouldStop(134217728);
__ref.runClassMethod (com.stevel05.jdockfx.docknode.class, "_asjo",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _n.getObject())).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("widthProperty")),(Object)((docknode.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_event})));
 };
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settag(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("setTag (docknode) ","docknode",2,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("settag")) return __ref.runUserSub(false, "docknode","settag", __ref, _tag);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 135;BA.debugLine="Sub setTag(Tag As Object)";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="mTag = Tag";
Debug.ShouldStop(128);
__ref.setField ("_mtag",_tag);
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}