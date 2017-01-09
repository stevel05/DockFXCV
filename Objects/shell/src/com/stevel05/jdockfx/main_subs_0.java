package com.stevel05.jdockfx;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,21);
if (RapidSub.canDelegate("appstart")) return main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 21;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(2097152);
main._mainform = _form1;
 BA.debugLineNum = 24;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\")";
Debug.ShouldStop(8388608);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 26;BA.debugLine="TDock1.Initialize(Me,\"TDock\",\"TDock1\",Null)";
Debug.ShouldStop(33554432);
main._tdock1.runClassMethod (com.stevel05.jdockfx.docknode.class, "_initialize",main.ba,(Object)(main.getObject()),(Object)(BA.ObjectToString("TDock")),(Object)(BA.ObjectToString("TDock1")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), main.__c.getField(false,"Null")));
 BA.debugLineNum = 27;BA.debugLine="TDock1.Graphic(File.DirAssets,\"docknode.png\")";
Debug.ShouldStop(67108864);
main._tdock1.runClassMethod (com.stevel05.jdockfx.docknode.class, "_graphic",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("docknode.png")));
 BA.debugLineNum = 28;BA.debugLine="TDock1.PrefSize(MainForm.Width / 2,MainForm.Heigh";
Debug.ShouldStop(134217728);
main._tdock1.runClassMethod (com.stevel05.jdockfx.docknode.class, "_prefsize",(Object)(RemoteObject.solve(new RemoteObject[] {main._mainform.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(main._mainform.runMethod(true,"getHeight")));
 BA.debugLineNum = 29;BA.debugLine="TDock1.Pane.LoadLayout(\"2\")";
Debug.ShouldStop(268435456);
main._tdock1.runClassMethod (com.stevel05.jdockfx.docknode.class, "_getpane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("2")));
 BA.debugLineNum = 30;BA.debugLine="TDock1.Dock(DockPane1,\"LEFT\")";
Debug.ShouldStop(536870912);
main._tdock1.runClassMethod (com.stevel05.jdockfx.docknode.class, "_dock",(Object)(main._dockpane1),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 31;BA.debugLine="TDock1.Tag = \"TDock1\"";
Debug.ShouldStop(1073741824);
main._tdock1.runClassMethod (com.stevel05.jdockfx.docknode.class, "_settag",RemoteObject.createImmutable(("TDock1")));
 BA.debugLineNum = 34;BA.debugLine="TDock2.Initialize(Me,\"TDock\",\"TDock2\",Null).PrefS";
Debug.ShouldStop(2);
main._tdock2.runClassMethod (com.stevel05.jdockfx.docknode.class, "_initialize",main.ba,(Object)(main.getObject()),(Object)(BA.ObjectToString("TDock")),(Object)(BA.ObjectToString("TDock2")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), main.__c.getField(false,"Null"))).runClassMethod (com.stevel05.jdockfx.docknode.class, "_prefsize",(Object)(RemoteObject.solve(new RemoteObject[] {main._mainform.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(main._mainform.runMethod(true,"getHeight"))).runClassMethod (com.stevel05.jdockfx.docknode.class, "_graphic",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("docknode.png"))).runClassMethod (com.stevel05.jdockfx.docknode.class, "_getpane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("3")));
 BA.debugLineNum = 35;BA.debugLine="TDock2.Dock(DockPane1,\"RIGHT\").Tag = \"TDock2\"";
Debug.ShouldStop(4);
main._tdock2.runClassMethod (com.stevel05.jdockfx.docknode.class, "_dock",(Object)(main._dockpane1),(Object)(RemoteObject.createImmutable("RIGHT"))).runClassMethod (com.stevel05.jdockfx.docknode.class, "_settag",RemoteObject.createImmutable(("TDock2")));
 BA.debugLineNum = 37;BA.debugLine="MainForm.Show";
Debug.ShouldStop(16);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 39;BA.debugLine="DockPane1.SetDefaultUserAgentStylesheet";
Debug.ShouldStop(64);
main._dockpane1.runClassMethod (com.stevel05.jdockfx.dockpane.class, "_setdefaultuseragentstylesheet");
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_action() throws Exception{
try {
		Debug.PushSubsStack("Button1_Action (main) ","main",0,main.ba,main.mostCurrent,54);
if (RapidSub.canDelegate("button1_action")) return main.remoteMe.runUserSub(false, "main","button1_action");
 BA.debugLineNum = 54;BA.debugLine="Sub Button1_Action";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Log(\"Button1 Clicked\")";
Debug.ShouldStop(4194304);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Button1 Clicked")));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
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

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.stevel05.jdockfx.main");
dockpane.myClass = BA.getDeviceClass ("com.stevel05.jdockfx.dockpane");
docknode.myClass = BA.getDeviceClass ("com.stevel05.jdockfx.docknode");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 13;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 15;BA.debugLine="Private DockPane1 As DockPane";
main._dockpane1 = RemoteObject.createNew ("com.stevel05.jdockfx.dockpane");
 //BA.debugLineNum = 16;BA.debugLine="Private TDock1 As DockNode";
main._tdock1 = RemoteObject.createNew ("com.stevel05.jdockfx.docknode");
 //BA.debugLineNum = 17;BA.debugLine="Private TDock2 As DockNode";
main._tdock2 = RemoteObject.createNew ("com.stevel05.jdockfx.docknode");
 //BA.debugLineNum = 18;BA.debugLine="Private Button1 As Button";
main._button1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tdock_dockchanged(RemoteObject _docked) throws Exception{
try {
		Debug.PushSubsStack("TDock_DockChanged (main) ","main",0,main.ba,main.mostCurrent,49);
if (RapidSub.canDelegate("tdock_dockchanged")) return main.remoteMe.runUserSub(false, "main","tdock_dockchanged", _docked);
RemoteObject _dn = RemoteObject.declareNull("com.stevel05.jdockfx.docknode");
Debug.locals.put("Docked", _docked);
 BA.debugLineNum = 49;BA.debugLine="Sub TDock_DockChanged(Docked As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Dim DN As DockNode = Sender";
Debug.ShouldStop(131072);
_dn = (main.__c.runMethod(false,"Sender",main.ba));Debug.locals.put("DN", _dn);Debug.locals.put("DN", _dn);
 BA.debugLineNum = 51;BA.debugLine="Log(\"TabsDock Dock \" & DN.Tag & \" : \" &  Docked)";
Debug.ShouldStop(262144);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("TabsDock Dock "),_dn.runClassMethod (com.stevel05.jdockfx.docknode.class, "_gettag"),RemoteObject.createImmutable(" : "),_docked)));
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
public static RemoteObject  _tdock_resized(RemoteObject _height,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("TDock_Resized (main) ","main",0,main.ba,main.mostCurrent,44);
if (RapidSub.canDelegate("tdock_resized")) return main.remoteMe.runUserSub(false, "main","tdock_resized", _height, _width);
RemoteObject _td = RemoteObject.declareNull("com.stevel05.jdockfx.docknode");
Debug.locals.put("Height", _height);
Debug.locals.put("Width", _width);
 BA.debugLineNum = 44;BA.debugLine="Sub TDock_Resized(Height As Double, Width As Doubl";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Dim TD As DockNode = Sender";
Debug.ShouldStop(4096);
_td = (main.__c.runMethod(false,"Sender",main.ba));Debug.locals.put("TD", _td);Debug.locals.put("TD", _td);
 BA.debugLineNum = 46;BA.debugLine="Log(TD.Tag & \" : \" & Height & \" : \" & Width)";
Debug.ShouldStop(8192);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(_td.runClassMethod (com.stevel05.jdockfx.docknode.class, "_gettag"),RemoteObject.createImmutable(" : "),_height,RemoteObject.createImmutable(" : "),_width)));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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