package de.validas.nlx.view.fxviews.semantics.types

import org.eclipse.emf.common.util.EList

class UnitType extends AbstractLinkType {
	
	protected String unit
	
	new (String type, String unit){
		this.name = type
		this.unit = unit
	}
		
}
