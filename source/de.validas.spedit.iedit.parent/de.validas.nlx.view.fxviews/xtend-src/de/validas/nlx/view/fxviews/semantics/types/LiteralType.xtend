package de.validas.nlx.view.fxviews.semantics.types

import de.validas.nlx.view.fxviews.semantics.ILinkable
import javafx.scene.Node

class LiteralType extends AbstractLinkType {
	
	new(String name, ILinkable parent) {
		this.name = name
		this.parent = parent
	}
	
	def Node getRoot() {
		return null;
	}
	
}
