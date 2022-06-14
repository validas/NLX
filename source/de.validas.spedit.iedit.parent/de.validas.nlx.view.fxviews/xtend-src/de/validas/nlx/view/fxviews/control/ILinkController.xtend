package de.validas.nlx.view.fxviews.control

import de.validas.nlx.view.fxviews.access.IJavaFxObj
import javafx.scene.control.ContextMenu

interface ILinkController{

	def void setParent(IJavaFxObj link)
	
	def void addDragController(IDragController controller)
	
	def void setSontextMenu(ContextMenu menu)
	
}