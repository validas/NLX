package de.validas.nlx.dictionary.type

import de.validas.nlx.dictionary.type.elements.INodeEL
import de.validas.nlx.dictionary.type.elements.IRelationshipEL
import java.util.Collection
import java.util.List
import org.neo4j.driver.v1.types.Node

interface ITypeAttributes {

	def Node getBaseNode()
	
	@Deprecated     //deprecate Interface
	def Object getAttrs()
	
	@Deprecated     //deprecate Interface
	def List<Node> getSource()	
	
	@Deprecated     //deprecate Interface
	def List<Node> getTarget()
	
	def void merge(ITypeAttributes attributes)
	
	def Collection<? extends INodeEL> getSourceEL()
	
	def Collection<? extends INodeEL> getTargetEL()
	
	def Collection<? extends IRelationshipEL> getAttrsEL()
	
}