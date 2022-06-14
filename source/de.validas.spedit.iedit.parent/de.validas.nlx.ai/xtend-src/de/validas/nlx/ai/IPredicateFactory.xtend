package de.validas.nlx.ai

import org.neo4j.driver.internal.value.RelationshipValue
import de.validas.nlx.ai.semantics.INode
import de.validas.nlx.ai.semantics.IPredicate

interface IPredicateFactory {
	
	def IPredicate create(RelationshipValue value, INode nodeStart, INode nodeEnd)
	
}
