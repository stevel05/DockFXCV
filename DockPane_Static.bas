Type=StaticCode
Version=4.7
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private DockNodeMap As Map
End Sub

'Map the underlying DockNode Objects to our DockNode Class
Sub AddToMap(JO As JavaObject,DN As DockNode)
	If DockNodeMap.IsInitialized = False Then DockNodeMap.Initialize
	DockNodeMap.Put(JO,DN)
End Sub

'Get Our DockNode Class from the underlying DockNode
Sub GetDockNode(JO As JavaObject) As DockNode
	Return DockNodeMap.Get(JO)
End Sub
