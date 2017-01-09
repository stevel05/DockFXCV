Type=Class
Version=4.7
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
#Event: DockChanged(Docked As Boolean)
#Event: Resized(Height As Double,Width As Double)
#IgnoreWarnings: 12

Sub Class_Globals
	Private fx As JFX
	Private TJO As JavaObject
	Private mModule As Object
	Private mEventName As String
	Private mTag As Object
	Private mDockTitleBar As JavaObject
End Sub

'Initializes the object.
'Module - for callback
'EventName - for callback
'Title - the title for the DockNode
'Node - the content of this DockNode, Pass Null if you want to load a layout later
'Returns this DockNode
Public Sub Initialize(Module As Object,EventName As String,Title As String,Node As Node) As DockNode
	mModule = Module
	mEventName = EventName
	If Node.IsInitialized Then
		TJO.InitializeNewInstance("org.dockfx.DockNode",Array(Node,Title))
		If mEventName <> "" Then CallSubDelayed(Me,"SetEventHandler")
	Else
		Dim P As Pane
		P.Initialize("AP")
		TJO.InitializeNewInstance("org.dockfx.DockNode",Array(P,Title))
		If mEventName <> "" Then CallSubDelayed(Me,"SetEventHandler")
	End If
	Return Me
End Sub


'
'Get / Set the closable property for this DockNode
'
Public Sub setClosable(Closable As Boolean)
	TJO.RunMethodJO("closableProperty",Null).RunMethod("set",Array(Closable))
End Sub

Public Sub getClosable As Boolean
	Return TJO.RunMethodJO("closableProperty",Null).RunMethod("get",Null)
End Sub

'
'Get / Set (replace) the current Content Node
'
Public Sub setContents(N As Node)
	TJO.RunMethod("setContents",Array(N))
End Sub
Public Sub getContents As Node
	Return TJO.RunMethod("getContents",Null)
End Sub

'Dock this node to a parent.
'Parent a DockPane
'Location one of "CENTER", "TOP", "BOTTOM", "LEFT" or "RIGHT"
Public Sub Dock(Parent As DockPane,Location As String) As DockNode
	TJO.RunMethod("dock",Array(Parent.AsJO,Location))
	Return Me
End Sub

'
'Get/Set the titlebar for this Dock, set it to Null to disable docking and undocking
'
Public Sub setDockTitleBar(TitleBar As Node)
	TJO.RunMethod("setDockTitleBar",Array(TitleBar))
End Sub
Public Sub getDockTitleBar As Node
	Return TJO.RunMethod("getDockTitleBar",Null)
End Sub

'
'Remove the DockTitleBar (Disables undocking / Docking) and optionally archive it so we can restore it later
'
Public Sub RemoveDockTitleBar(Archive As Boolean) As DockNode
	If Archive Then mDockTitleBar = getDockTitleBar
	TJO.RunMethod("setDockTitleBar",Array(Null))
	Return Me
End Sub

'
'Restore an archived DockTitleBar
'
Public Sub RestoreDockTitleBar As DockNode
	If mDockTitleBar.IsInitialized Then
		setDockTitleBar(mDockTitleBar)
	Else
		Log("Titlebar not archived, cannot restore it")
	End If
	Return Me
End Sub

'
'Set a Graphic for this DockNode. Returns this DockNode
'
Public Sub Graphic(FilePath As String,FileName As String) As DockNode
	Dim Image1 As ImageView
	Image1.Initialize("")
	Image1.SetImage(fx.LoadImage(FilePath,FileName))
	TJO.RunMethodJO("graphicProperty",Null).RunMethod("setValue",Array(Image1))
	Return Me
End Sub

'
'Get the current Docked Status of this DockNode
'
Public Sub IsDocked As Boolean
	Return TJO.RunMethodJO("dockedProperty",Null).RunMethod("get",Null)
End Sub

'
'Returns the underlying Node as a Pane (if it is one Null if not). You can add nodes or load a layout to this.
'
Public Sub getPane As Pane
	Dim N As Node = getContents
	If N Is Pane Then Return N
	Log("Contents Node is not a Pane")
	Return Null
End Sub

'
'Set the pref size for this DockNode. Returns this DockNode
'
Public Sub PrefSize(Width As Double,Height As Double) As DockNode
	TJO.RunMethod("setPrefSize",Array(Width, Height))
	Return Me
End Sub

'
'Get / Set the Tag Object for this DockNode
'
Public Sub setTag(Tag As Object)
	mTag = Tag
End Sub
Public Sub getTag As Object
	Return mTag
End Sub

'
'Set an event handler on the docked property, width and height
'
Private Sub SetEventHandler
	Dim R As Reflector
	R.Target = TJO
	Dim DP As JavaObject =  R.GetField("dockedProperty")
	Dim Event As Object = DP.CreateEvent("javafx.beans.value.ChangeListener","DockChanged",True)
	DP.RunMethod("addListener",Array(Event))
	
	Dim N As Node = getContents
	If N Is Pane Or N Is AnchorPane Then
		Dim Event As Object = AsJO(N).CreateEventFromUI("javafx.beans.value.ChangeListener","PaneResized",0)
		AsJO(N).RunMethodJO("heightProperty",Null).RunMethod("addListener",Array(Event))
		AsJO(N).RunMethodJO("widthProperty",Null).RunMethod("addListener",Array(Event))
	End If
End Sub

'
'Callback sub pass through
'
Private Sub DockChanged_Event(MethodName As String,Args() As Object) As Object
	'Get the property value
	Dim Docked As JavaObject = Args(0)
	If SubExists(mModule,mEventName & "_DockChanged") Then CallSub2(mModule,mEventName & "_DockChanged",Docked.RunMethod("getValue",Null))
	Return True
End Sub

Private Sub PaneResized_Event(MethodName As String, Args() As Object) As Object
	Dim P As Pane = Sender
	If SubExists(mModule,mEventName & "_Resized") Then CallSub3(mModule,mEventName & "_Resized",P.Width,P.height)
	Return True
End Sub

'
'Utility AsJO
'
Private Sub AsJO(JO As JavaObject) As JavaObject
	Return JO
End Sub