package de.validas.nlx.dictionary.type.elements

import org.neo4j.driver.v1.types.Relationship

interface IRelationshipEL extends INetworkEL {
	
	def INodeEL getStart()
	
	def INodeEL getEnd()
	
	def Relationship getRelationship()
	
	def Boolean relink(NodeEL el)
	
}