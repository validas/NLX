package de.validas.spedit.validation.semantics.predicates

import de.validas.spedit.validation.semantics.IDelegateListNodes

abstract class DelegateListNodes implements IDelegateListNodes {
	protected String type
	
	new () {
		
	}
	
	new(String type) {
		this.type = type
	}
	
}