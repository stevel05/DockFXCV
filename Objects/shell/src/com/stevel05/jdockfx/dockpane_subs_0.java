package com.stevel05.jdockfx;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dockpane_subs_0 {


public static RemoteObject  _asjo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsJO (dockpane) ","dockpane",1,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("asjo")) return __ref.runUserSub(false, "dockpane","asjo", __ref);
 BA.debugLineNum = 73;BA.debugLine="Public Sub AsJO As JavaObject";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Return TJO";
Debug.ShouldStop(512);
if (true) return __ref.getField(false,"_tjo");
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asnode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsNode (dockpane) ","dockpane",1,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("asnode")) return __ref.runUserSub(false, "dockpane","asnode", __ref);
 BA.debugLineNum = 80;BA.debugLine="Public Sub AsNode As Node";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Return TJO";
Debug.ShouldStop(65536);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_tjo").getObject());
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
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (dockpane) ","dockpane",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("base_resize")) return __ref.runUserSub(false, "dockpane","base_resize", __ref, _width, _height);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 29;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="TJO.RunMethod(\"setPrefSize\",Array(Width,Height))";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tjo").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPrefSize")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_width),(_height)})));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
dockpane._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",dockpane._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private EventName As String 'ignore";
dockpane._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",dockpane._eventname);
 //BA.debugLineNum = 6;BA.debugLine="Private CallBack As Object 'ignore";
dockpane._callback = RemoteObject.createNew ("Object");__ref.setField("_callback",dockpane._callback);
 //BA.debugLineNum = 7;BA.debugLine="Private mBase As Pane";
dockpane._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",dockpane._mbase);
 //BA.debugLineNum = 8;BA.debugLine="Private TJO As JavaObject";
dockpane._tjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_tjo",dockpane._tjo);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (dockpane) ","dockpane",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("designercreateview")) return __ref.runUserSub(false, "dockpane","designercreateview", __ref, _base, _lbl, _props);
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 21;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="mBase = Base";
Debug.ShouldStop(2097152);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 23;BA.debugLine="mBase.AddNode(TJO,0,0,mBase.Width,mBase.Height)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mbase").runVoidMethod ("AddNode",(Object)((__ref.getField(false,"_tjo").getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getHeight")));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (dockpane) ","dockpane",1,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("getbase")) return __ref.runUserSub(false, "dockpane","getbase", __ref);
 BA.debugLineNum = 36;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return mBase";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vcallback,RemoteObject _veventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (dockpane) ","dockpane",1,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "dockpane","initialize", __ref, _ba, _vcallback, _veventname);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vCallback", _vcallback);
Debug.locals.put("vEventName", _veventname);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="EventName = vEventName";
Debug.ShouldStop(8192);
__ref.setField ("_eventname",_veventname);
 BA.debugLineNum = 15;BA.debugLine="CallBack = vCallback";
Debug.ShouldStop(16384);
__ref.setField ("_callback",_vcallback);
 BA.debugLineNum = 16;BA.debugLine="TJO.InitializeNewInstance(\"org.dockfx.DockPane\",N";
Debug.ShouldStop(32768);
__ref.getField(false,"_tjo").runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("org.dockfx.DockPane")),(Object)((dockpane.__c.getField(false,"Null"))));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nodecount(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NodeCount (dockpane) ","dockpane",1,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("nodecount")) return __ref.runUserSub(false, "dockpane","nodecount", __ref);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
RemoteObject _sp = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 54;BA.debugLine="Sub NodeCount As Int";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Dim R As Reflector";
Debug.ShouldStop(4194304);
_r = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("R", _r);
 BA.debugLineNum = 56;BA.debugLine="R.Target =  TJO";
Debug.ShouldStop(8388608);
_r.setField ("Target",(__ref.getField(false,"_tjo").getObject()));
 BA.debugLineNum = 57;BA.debugLine="Dim Sp As JavaObject = R.GetField(\"root\")";
Debug.ShouldStop(16777216);
_sp = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_sp.setObject(_r.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("root"))));Debug.locals.put("Sp", _sp);
 BA.debugLineNum = 58;BA.debugLine="Return Sp.RunMethodJO(\"getItems\",Null).RunMethod(";
Debug.ShouldStop(33554432);
if (true) return BA.numberCast(int.class, _sp.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getItems")),(Object)((dockpane.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("size")),(Object)((dockpane.__c.getField(false,"Null")))));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdefaultuseragentstylesheet(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDefaultUserAgentStylesheet (dockpane) ","dockpane",1,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("setdefaultuseragentstylesheet")) return __ref.runUserSub(false, "dockpane","setdefaultuseragentstylesheet", __ref);
 BA.debugLineNum = 47;BA.debugLine="Public Sub SetDefaultUserAgentStylesheet";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="TJO.RunMethod(\"initializeDefaultUserAgentStyleshe";
Debug.ShouldStop(32768);
__ref.getField(false,"_tjo").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("initializeDefaultUserAgentStylesheet")),(Object)((dockpane.__c.getField(false,"Null"))));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _splitpane(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SplitPane (dockpane) ","dockpane",1,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("splitpane")) return __ref.runUserSub(false, "dockpane","splitpane", __ref);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
 BA.debugLineNum = 64;BA.debugLine="Sub SplitPane As SplitPane";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Dim R As Reflector";
Debug.ShouldStop(1);
_r = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("R", _r);
 BA.debugLineNum = 66;BA.debugLine="R.Target = TJO";
Debug.ShouldStop(2);
_r.setField ("Target",(__ref.getField(false,"_tjo").getObject()));
 BA.debugLineNum = 67;BA.debugLine="Return R.GetField(\"root\")";
Debug.ShouldStop(4);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.SplitPaneWrapper"), _r.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("root"))));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}