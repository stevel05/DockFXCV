
package com.stevel05.jdockfx;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class docknode {
    public static RemoteObject myClass;
	public docknode() {
	}
    public static PCBA staticBA = new PCBA(null, docknode.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _tjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _mmodule = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mtag = RemoteObject.declareNull("Object");
public static RemoteObject _mdocktitlebar = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static com.stevel05.jdockfx.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fx",_ref.getField(false, "_fx"),"mDockTitleBar",_ref.getField(false, "_mdocktitlebar"),"mEventName",_ref.getField(false, "_meventname"),"mModule",_ref.getField(false, "_mmodule"),"mTag",_ref.getField(false, "_mtag"),"TJO",_ref.getField(false, "_tjo")};
}
}