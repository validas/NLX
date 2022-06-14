package de.validas.nlx.ai

import org.neo4j.driver.internal.value.NodeValue
import de.validas.nlx.ai.semantics.INode

interface INodeFactory {
	
	def INode create(NodeValue node, IParserDriver driver)

}
