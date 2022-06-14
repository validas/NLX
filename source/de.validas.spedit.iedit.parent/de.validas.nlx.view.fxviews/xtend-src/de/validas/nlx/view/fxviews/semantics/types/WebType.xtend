package de.validas.nlx.view.fxviews.semantics.types

import de.validas.nlx.view.fxviews.semantics.constants.WebTypeConstants

class WebType extends AbstractLinkType  {
	
	new (WebTypeConstants type) {
		this.name = type.toString();		
	}
	
}
