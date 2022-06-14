package de.validas.nlx.ai

import de.validas.nlx.ai.IDbAccess
import org.neo4j.driver.internal.value.NodeValue
import org.eclipse.xtext.builder.debug.IBuildLogger
import de.validas.nlx.ai.semantics.INode

interface IParserDriver {
	
	def IDbAccess getDbAccessor()
	
	def IPredicateFactory getPredicateFactory()
	
	def void setDbAccessor(IDbAccess access)
	
	def void setPredicateFactory(IPredicateFactory factory)
	
	def void setNodeFactory(INodeFactory factory)
	
	def INodeFactory getNodeFactory()
	
	def IBuildLogger getLogger()
	
	def INode getNodeById(NodeValue node)
	
	def IParserDriver newCache()
	
}
