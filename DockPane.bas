Type=Class
Version=4.7
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Custom View class
#IgnoreWarnings: 12
Sub Class_Globals
	Private fx As JFX
	Private EventName As String 'ignore
	Private CallBack As Object 'ignore
	Private mBase As Pane
	Private TJO As JavaObject
	
End Sub

'Called from the designer on initialization
Public Sub Initialize (vCallback As Object, vEventName As String)
	EventName = vEventName
	CallBack = vCallback
	TJO.InitializeNewInstance("org.dockfx.DockPane",Null)
End Sub


'Called from the designer on creation
Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.AddNode(TJO,0,0,mBase.Width,mBase.Height)
End Sub

'
'Called when the basePane is resized
'
Private Sub Base_Resize (Width As Double, Height As Double)
	TJO.RunMethod("setPrefSize",Array(Width,Height))
End Sub

'
'Get the BasePane for this CustomView
'
Public Sub GetBase As Pane
	Return mBase
End Sub


'Initialize the default styles For the dock pane And undocked nodes using the DockFX
' library's internal Default.css stylesheet
' unlike other custom control libraries this allows the user To override them globally
' using the style manager just As they can with internal JavaFX controls
' this must be called after the primary stage Is shown
' https://bugs.openjdk.java.net/browse/JDK-8132900
Public Sub SetDefaultUserAgentStylesheet
	TJO.RunMethod("initializeDefaultUserAgentStylesheet",Null)
End Sub

'
'Returns the number of DockNodes attached to this DockPane
'
Sub NodeCount As Int
	Dim R As Reflector
	R.Target =  TJO
	Dim Sp As JavaObject = R.GetField("root")
	Return Sp.RunMethodJO("getItems",Null).RunMethod("size",Null)
End Sub

'
'Gets the underlying SplitPane for this DockPane
'
Sub SplitPane As SplitPane
	Dim R As Reflector
	R.Target = TJO
	Return R.GetField("root")
End Sub

'
'Get the underlying object as a JavaObject
'
Public Sub AsJO As JavaObject
	Return TJO
End Sub

'
'Get the underlying object as a Node
'
Public Sub AsNode As Node
	Return TJO
End Sub
