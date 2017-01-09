
package com.stevel05.jdockfx;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class dockpane {
    public static RemoteObject myClass;
	public dockpane() {
	}
    public static PCBA staticBA = new PCBA(null, dockpane.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _eventname = RemoteObject.createImmutable("");
public static RemoteObject _callback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _tjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static com.stevel05.jdockfx.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CallBack",_ref.getField(false, "_callback"),"EventName",_ref.getField(false, "_eventname"),"fx",_ref.getField(false, "_fx"),"mBase",_ref.getField(false, "_mbase"),"TJO",_ref.getField(false, "_tjo")};
}
}