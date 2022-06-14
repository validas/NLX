package de.validas.nlx.view.fxviews.semantics.types

import de.validas.nlx.view.fxviews.semantics.ILink
import de.validas.nlx.view.fxviews.semantics.ILinkType
import de.validas.nlx.view.fxviews.semantics.ILinkable
import java.util.HashMap
import java.util.List
import de.validas.nlx.dictionary.type.ITypeAttributes
import de.validas.nlx.view.fxviews.semantics.ILinkObj
import de.validas.utils.data.types.XPair

abstract class AbstractLinkType implements ILinkType {
	protected var String name
	protected var ILinkable _parent

	override setParent(ILinkable nodePanel) {
		this._parent = nodePanel
	}

	override getNameClamped() {
		// TODO: should not be neccesary to check parent because Object related behavior will control it.
		if (this.parent instanceof ILink)
			'''(«name»)'''
		else
			name
	}

	override getName() {
		this.name
	}

	override toString() {
		return '''AbstractLinkType: «name»'''
	}

	override getParent() {
		_parent
	}

	override void newType() {
		// stub
	}

	override getSelection() {
		0
	}

	override setSelection(int selection) {
		// stub
	}

	override HashMap<String, List<ILink>> getLinks() {
		null
	}

	override List<ILink> getSelectedLink() {
		null;
	}
	
	override postProcess(ILinkObj precessor, List<ITypeAttributes> attribs){
		
	}
	
	override getBaseType()
	{
		null
	}
	
	override getTypeEls() {
		null
	}
	
	override getTypeInfo(){
		null
	}
}
