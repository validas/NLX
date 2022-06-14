package de.validas.spedit.validation.semantics.bool

import de.validas.nlx.ai.semantics.INode

abstract class BoolOp {
	def boolean isTrue(INode node)
	
	def INode returnFinal(INode node)
	
	def INode returnIntermediate(INode node)
}