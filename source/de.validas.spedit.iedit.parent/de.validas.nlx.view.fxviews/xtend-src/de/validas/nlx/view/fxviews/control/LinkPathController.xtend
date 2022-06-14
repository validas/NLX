package de.validas.nlx.view.fxviews.control

import de.validas.nlx.view.fxviews.access.elements.SmallItem
import de.validas.nlx.view.fxviews.semantics.ILink
import de.validas.nlx.view.fxviews.semantics.ILinkObj
import de.validas.nlx.view.fxviews.semantics.ILinkable
import de.validas.nlx.view.fxviews.semantics.LinkPath
import de.validas.nlx.view.fxviews.semantics.SemanticLink
import de.validas.nlx.view.fxviews.visual.NodePanel
import java.net.URL
import java.util.NoSuchElementException
import java.util.ResourceBundle
import javafx.fxml.FXML
import javafx.scene.input.ClipboardContent
import javafx.scene.input.DragEvent
import javafx.scene.input.MouseEvent
import javafx.scene.input.TransferMode
import javafx.scene.shape.Path
import de.validas.nlx.constants.Direction
import javafx.scene.control.ContextMenu
import javafx.scene.input.ContextMenuEvent
import javafx.scene.Node
import de.validas.nlx.view.fxviews.semantics.util.LinkUtils
import de.validas.nlx.view.fxviews.semantics.LinkStyle

class LinkPathController extends AbstractLinkController {
	@FXML // ResourceBundle that was given to the FXMLLoader
	ResourceBundle resources;
	@FXML // URL location of the FXML file that was given to the FXMLLoader
	URL location;
	@FXML // fx:id="path"
	Path path;
	
	ContextMenu cm
	
	// Value injected by FXMLLoader	

	new() {
		super()
		hoverMode = [ event |
			event.acceptTransferModes(TransferMode.ANY)
		]
	}

	@FXML
	override void onDragStart(MouseEvent event) {
		print("\n[LinkPathController]: onDragStart")
		var startX = event.getSceneX();
		var startY = event.getSceneY();
		if (dragController !== null) {
			dragController.add(new Dragevent(startX, startY, this))
		}
		var source = event.getSource()
		if (source instanceof Path) {
			var db = source.startDragAndDrop(TransferMode.ANY)
			var content = new ClipboardContent()
			var container = new DragContainer()
			container.addData("source", source.toString())
			content.put(DragContainer.AddLink, container)
			db.setContent(content)
		}
		if (canvas instanceof SemanticFxViewController)
			(canvas as SemanticFxViewController).createLineVisual(startX as int, startY as int)
		event.consume();
	}

	@FXML
	override void onDragAfter(DragEvent event) {
		print("\n[LinkPathController]: onDragAfter")
		visualClear();
		event.consume();
	}

	@FXML
	override void onDragEnd(DragEvent event) {
		print("\n[LinkPathController]: onDragEnd")
		visualClear();
		var container = event.getDragboard().getContent(DragContainer.AddLink) as DragContainer
		if (container === null)
			return;
			
		var dragEvent = getDragEvent();
		var source = dragEvent.getController().getParent();
		var sourcePoint = dragEvent.getPoint2D();
		var Direction dir;
		if (sourcePoint.getX() < event.getSceneX())
			dir = Direction.RIGHT
		else
			dir = Direction.LEFT
		if (source !== null){
			var view = ((parent as LinkPath).parent as SemanticLink).canvas.viewPart
			switch (source){
				LinkPath: {
					view.connectNode(source.parent as SemanticLink, parent.parent as ILinkable, dir)
				}
				NodePanel: {
					view.connectNode(source as ILinkable, parent.parent as ILinkable, dir);
				}
			}
		}
		if (dragController !== null) {
			dragController.clear();
		}

		event.consume();
	}

	@FXML
	override void onDragOver(DragEvent event) {
		//print("\n[LinkPathController]: onDragOver")
		event.acceptTransferModes(TransferMode.NONE);
		var dragEvent = getDragEvent();
		var source = dragEvent.getController().getParent();
		var sourcePoint = dragEvent.point2D;
		var ILinkObj neigbour;
		
		switch (source) {
			LinkPath: {
				print(": " + source.toString)   //TODO: 28.01.2022 replace by Logger
				
				var sourceLink = source.parent
				var targetLink = parent.parent
				if (!((sourceLink as ILink).style.equals(LinkStyle.DISABLED) || (targetLink as ILink).style.equals(LinkStyle.DISABLED))){
					var ILinkObj first
					var ILinkObj second
					if (sourcePoint.getX() < event.getSceneX()) {
						first = LinkUtils.findNextAdjacentPanel(sourceLink as ILink, true)
						second = LinkUtils.findNextAdjacentPanel(targetLink as ILink, false)
					} else {
						first = LinkUtils.findNextAdjacentPanel(parent.parent as ILink, true)
						second = LinkUtils.findNextAdjacentPanel(source.parent as ILink, false)
					}
					var delta = second.index - first.index
					if (delta == 1)
						hoverMode.apply(event)
				}
			}
			NodePanel: {
				if (sourcePoint.getX() > event.getSceneX()) {
					neigbour = LinkUtils.findNextAdjacentPanel(parent.parent as ILink, true).successor as ILinkObj 
					while (neigbour.getToken() instanceof SmallItem) 
						neigbour = neigbour.getSuccessor() as ILinkObj;
				} else {
					neigbour = LinkUtils.findNextAdjacentPanel(parent.parent as ILink, false).precessor as ILinkObj
					while (neigbour.getToken() instanceof SmallItem) 
						neigbour = neigbour.getPrecessor() as ILinkObj;
				}
				if (neigbour === null)
					return;
				if (neigbour.equals(source))
					hoverMode.apply(event);

			}
		}
		var absolutePos = canvas.createAbsolutePos(event.getSceneX(), event.getSceneY());
		visualDraw(absolutePos.getX() as int, absolutePos.getY() as int);
		event.consume();
	}

	@FXML
	def void onHoverStart(MouseEvent event) {
		//print("\n[LinkPathController]: onHoverStart")
	}

	@FXML
	def void onHoverEnd(MouseEvent event) {
		//print("\n[LinkPathController]: onHoverEnd")
	}

	@FXML
	def void onMouseClicked(MouseEvent event) {
		print(''' \
[LinkPathController]: onMouseClicked -> «parent.parent» ''')
	}
	
	// Event Listener on AnchorPane[#anchorPane].onContextMenuRequested
	@FXML
	def void onContextMenu(ContextMenuEvent event) {
		var win = (event.source as Node).scene.window
		cm.show(win, win.x + event.sceneX, win.y + event.sceneY)
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	override initialize() {
		if (path === null)
			throw new NoSuchElementException("\nfx:id=\"path\" was not injected: check your FXML file 'LinkPath.fxml'.");
	}

	def getPath() {
		path
	}
	
	override setSontextMenu(ContextMenu menu) {
		this.cm = menu
	}
	
}
