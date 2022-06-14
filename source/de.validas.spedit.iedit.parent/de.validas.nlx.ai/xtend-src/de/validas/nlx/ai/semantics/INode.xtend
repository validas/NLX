package de.validas.nlx.ai.semantics

import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.v1.Record
import java.util.List
import de.validas.nlx.ai.IParserDriver
import de.validas.nlx.ai.IFunction
import de.validas.nlx.ai.IFunction1

interface INode {
	
	def INode solve()
	
	def NodeValue getNodeRef()
	
	def IParserDriver getDriver()
	
	def void setNodeRef (NodeValue node)
	
	def List<Record> listAllConnections()
	
	def List<Record> listAllOutputs()
	
	def List<Record> listAllInputs()
	
	def Object getAttribute(String key)
	
	def Object setAttribute(String key, Object value)
	
	def long getID()
	
	def String getLabel()
	
	def boolean hasLabel(NodeValue node, String name)
	
	def void setFilter(String filter)
	
	def INode findNodeAndCreateTarget(String string, IFunction1<Object, ?> delegate)
	
	def List<NodeValue> findNodeTypeByName(String type, String name)
	
	def List<NodeValue> findLinkedNodeByName(String string)
	
}
