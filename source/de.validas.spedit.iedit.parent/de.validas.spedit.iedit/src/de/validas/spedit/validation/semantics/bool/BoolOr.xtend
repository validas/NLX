package de.validas.spedit.validation.semantics.bool

import de.validas.spedit.validation.semantics.bool.BoolOp
import de.validas.nlx.ai.semantics.INode

class BoolOr extends BoolOp {
	
	override isTrue(INode node) {
		return node !== null
	}
	
	override returnFinal(INode node) {
		null
	}
	
	override returnIntermediate(INode node) {
		node
	}
}

