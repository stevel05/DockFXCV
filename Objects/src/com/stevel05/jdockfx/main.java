package com.stevel05.jdockfx;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("com.stevel05.jdockfx", "com.stevel05.jdockfx.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("com.stevel05.jdockfx", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "com.stevel05.jdockfx.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 800, 500);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static com.stevel05.jdockfx.dockpane _dockpane1 = null;
public static com.stevel05.jdockfx.docknode _tdock1 = null;
public static com.stevel05.jdockfx.docknode _tdock2 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button1 = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart"))
	return (String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args});
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\")";
_mainform.getRootPane().LoadLayout(ba,"1");
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="TDock1.Initialize(Me,\"TDock\",\"TDock1\",Null)";
_tdock1._initialize(null,ba,main.getObject(),"TDock","TDock1",(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="TDock1.Graphic(File.DirAssets,\"docknode.png\")";
_tdock1._graphic(null,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"docknode.png");
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="TDock1.PrefSize(MainForm.Width / 2,MainForm.Heigh";
_tdock1._prefsize(null,_mainform.getWidth()/(double)2,_mainform.getHeight());
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="TDock1.Pane.LoadLayout(\"2\")";
_tdock1._getpane(null).LoadLayout(ba,"2");
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="TDock1.Dock(DockPane1,\"LEFT\")";
_tdock1._dock(null,_dockpane1,"LEFT");
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="TDock1.Tag = \"TDock1\"";
_tdock1._settag(null,(Object)("TDock1"));
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="TDock2.Initialize(Me,\"TDock\",\"TDock2\",Null).PrefS";
_tdock2._initialize(null,ba,main.getObject(),"TDock","TDock2",(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(anywheresoftware.b4a.keywords.Common.Null)))._prefsize(null,_mainform.getWidth()/(double)2,_mainform.getHeight())._graphic(null,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"docknode.png")._getpane(null).LoadLayout(ba,"3");
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="TDock2.Dock(DockPane1,\"RIGHT\").Tag = \"TDock2\"";
_tdock2._dock(null,_dockpane1,"RIGHT")._settag(null,(Object)("TDock2"));
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65554;
 //BA.debugLineNum = 65554;BA.debugLine="DockPane1.SetDefaultUserAgentStylesheet";
_dockpane1._setdefaultuseragentstylesheet(null);
RDebugUtils.currentLine=65557;
 //BA.debugLineNum = 65557;BA.debugLine="End Sub";
return "";
}
public static String  _button1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "button1_action"))
	return (String) Debug.delegate(ba, "button1_action", null);
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Button1_Action";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Log(\"Button1 Clicked\")";
anywheresoftware.b4a.keywords.Common.Log("Button1 Clicked");
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _tdock_dockchanged(boolean _docked) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "tdock_dockchanged"))
	return (String) Debug.delegate(ba, "tdock_dockchanged", new Object[] {_docked});
com.stevel05.jdockfx.docknode _dn = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub TDock_DockChanged(Docked As Boolean)";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim DN As DockNode = Sender";
_dn = (com.stevel05.jdockfx.docknode)(anywheresoftware.b4a.keywords.Common.Sender(ba));
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Log(\"TabsDock Dock \" & DN.Tag & \" : \" &  Docked)";
anywheresoftware.b4a.keywords.Common.Log("TabsDock Dock "+BA.ObjectToString(_dn._gettag(null))+" : "+BA.ObjectToString(_docked));
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="End Sub";
return "";
}
public static String  _tdock_resized(double _height,double _width) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "tdock_resized"))
	return (String) Debug.delegate(ba, "tdock_resized", new Object[] {_height,_width});
com.stevel05.jdockfx.docknode _td = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub TDock_Resized(Height As Double, Width As Doubl";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Dim TD As DockNode = Sender";
_td = (com.stevel05.jdockfx.docknode)(anywheresoftware.b4a.keywords.Common.Sender(ba));
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Log(TD.Tag & \" : \" & Height & \" : \" & Width)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_td._gettag(null))+" : "+BA.NumberToString(_height)+" : "+BA.NumberToString(_width));
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="End Sub";
return "";
}
}