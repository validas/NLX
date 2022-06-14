package de.validas.nlx.view.fxviews.semantics.types

import de.validas.nlx.view.fxviews.semantics.ILinkable
import de.validas.nlx.view.fxviews.visual.ContainerPanel
import java.util.List
import de.validas.nlx.view.fxviews.semantics.ILinkObj

class CompoundType extends LiteralType {
	
	
	//List<ILinkable> innerType
	
	new(String name, ILinkable parent) {
		super(name, parent)		
	}
	
	override getBaseType()
	{
		if (_parent !== null){
			var link = (_parent as ContainerPanel).innerLink
			if (link !== null) {
				if(link.size > 0){
					var types = link.get(0).types
					if (types !== null && types.size > 0)
						return types.get(0)
				} else {
					var chain = (_parent as ContainerPanel).panelChain
					if (chain.size() < 3){   //single token plus terminal
						return (chain.get(0)as ILinkObj).type
					}
				}
			}
		}
		null	
	}
	
//	override setParent(ILinkable parent){
//		this._parent = parent
//		if (parent !== null)
//			this.innerType = (parent as ContainerPanel).innerLink 
//	}
}