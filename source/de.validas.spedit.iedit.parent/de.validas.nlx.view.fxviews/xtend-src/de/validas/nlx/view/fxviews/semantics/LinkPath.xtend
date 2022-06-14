package de.validas.nlx.view.fxviews.semantics

import de.validas.nlx.view.fxviews.access.IJavaFxObj
import de.validas.nlx.view.fxviews.control.ICanvasController
import de.validas.nlx.view.fxviews.control.IController
import de.validas.nlx.view.fxviews.control.IDragController
import de.validas.nlx.view.fxviews.control.ILinkController
import java.io.IOException
import java.net.URL
import java.util.Collection
import javafx.collections.ObservableList
import javafx.fxml.FXMLLoader
import javafx.geometry.Point2D
import javafx.scene.control.ContextMenu
import javafx.scene.control.MenuItem
import javafx.scene.layout.Pane
import javafx.scene.shape.ArcTo
import javafx.scene.shape.HLineTo
import javafx.scene.shape.Path
import javafx.scene.shape.PathElement
import javafx.scene.shape.Shape
import javafx.scene.shape.VLineTo

import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants.*
import static de.validas.nlx.view.fxviews.semantics.constants.LinkConstants.*
import javafx.application.Platform

class LinkPath implements IJavaFxObj{
	
	final ILink parent
	URL resource
	Pane linkPane
	
	Shape shape
	ILinkController controller
	FXMLLoader loader
	
	protected IDragController dragController

	Collection<MenuItem> menuItems
	
	
	//TODO: cache Link Koordinates if calculated once...
	new(ILink parent, Collection<MenuItem> menuItems){
		this.resource = getClass().getResource(FXML_LINK_PATH_FILE)
		this.loader = new FXMLLoader(this.resource) 
		loader.setClassLoader(parent.canvas.fxClassLoader); 
		this.parent = parent
		//this.parent.setLinkPath(this)
		this.dragController = parent.dragController
		this.linkPane = canvasController.linkPane
		this.menuItems = menuItems
	}
	
	override getCanvasController() {
		parent.canvas.controller as ICanvasController
	}
	
	override getController() {
		controller as IController
	}
	
	override getParent() {
		parent
	}
	
	def getContainer() {
		shape
	}
	
	def draw(Point2D startPoint, Point2D endPoint, Runnable flagDraw) { // TODO: set parent in constructor
		if (shape === null) { // reload only if neccesary
			try {
				this.shape = loader.load();
				this.controller = loader.getController() as ILinkController;
				controller.addDragController(dragController);
				controller.setSontextMenu(createContextMenu())
				controller.setParent(this);
		 		var style = this.parent.style.classes
		 		if (style !== null){
					var classes = getContainer().getStyleClass();
					classes.clear
					classes.addAll(style)
				}
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		
		}	
		if (shape instanceof Path) {
			shape.setLayoutX(startPoint.getX());
			shape.setLayoutY(startPoint.getY());
			adjustPath(startPoint, endPoint, (shape as Path).getElements());
			if (Platform.fxApplicationThread){
				assignToCanvas(flagDraw)
			} else 
				Platform.runLater([|
					synchronized(this) {
						assignToCanvas(flagDraw)
					}
				])
		}
		
	}
	
	def assignToCanvas(Runnable flagDraw) {
		linkPane.getChildren().add(shape);
		flagDraw.run
	}
	
	def createContextMenu() {
		//TODO: 03.11.21 generate menue items dynamically in the future
		
		var contextMenu = new ContextMenu();
    	if (menuItems!== null && !menuItems.empty){
	    	contextMenu.getItems().addAll(menuItems);
	        contextMenu    
	    }
	}
	
	def adjustPath(Point2D startPoint, Point2D endPoint, ObservableList<PathElement> elements) {
		var double deltaY = endPoint.getY() - startPoint.getY();
		var double deltaX = endPoint.getX() - startPoint.getX();

		var VLineTo vLine1 = elements.get(1) as VLineTo
		var ArcTo arc1 = elements.get(2) as ArcTo
		var HLineTo hLine = elements.get(3) as HLineTo
		var ArcTo arc2 = elements.get(4) as ArcTo
		var VLineTo vLine2 = elements.get(5) as VLineTo
		var double diameter = ARC_RADIUS * 2;
		var double radius = 0;
		
		if (deltaX < diameter) 
			radius = deltaX / 2
		else 
			radius = ARC_RADIUS
		
		
		if (endPoint.getY() > startPoint.getY()) {
			vLine1.setY(OFFSET + deltaY);
			arc1.setY(OFFSET + radius + deltaY);
			hLine.setX(deltaX - radius);
			arc2.setX(deltaX);
			arc2.setY(OFFSET + deltaY);
			vLine2.setY(deltaY);
		} else {
			arc1.setY(OFFSET + radius);
			hLine.setX(deltaX - radius);
			arc2.setX(deltaX);
			arc2.setY(OFFSET);
			vLine2.setY(deltaY);
		}

	}
	
	def remove() {
			var result = linkPane.getChildren().remove(shape)
			return result
	}
	
}