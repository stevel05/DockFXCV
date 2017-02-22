
#DockFX wrapper for B4j

###This is a B4j wrapper for this project: https://github.com/RobertBColton/DockFX

To test it I recreated the example app (java code here : https://github.com/RobertBColton/DockFX/blob/master/src/main/java/org/dockfx/demo/DockFX.java)

The B4j project is attached. The library hasn't been updated for a while, but is very usable, so I thought I would share it in case anybody else wanted to.

Download the zipped jar file (dockfx-0.1b.zip) from here : https://github.com/RobertBColton/DockFX/releases, unzip it and copy to your additional libraries folder.

For documentation, I'm afraid you'll have to read the java code available on github.

It's LGPL3 licensed, make sure it's appropriate for your project.

Requires JavaObject and Reflection libraries, see the Test app code for explanations.

**Updates:**
* 06 Jan 2017 : Added jDockFXCV - Custom View version see Post7
* 06 Jan 2017 : Added more methods, including return underlying Node as Pane (if it is one) to load layouts on. Pass Null to the Initialization and a Pane will be created in the Class.
