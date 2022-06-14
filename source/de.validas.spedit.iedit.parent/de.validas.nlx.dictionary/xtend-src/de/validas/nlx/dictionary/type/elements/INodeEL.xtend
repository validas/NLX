package de.validas.nlx.dictionary.type.elements

import de.validas.nlx.constants.Direction
import java.util.List
import org.neo4j.driver.v1.types.Node

interface INodeEL extends INetworkEL {
	
	def Node getNode()	
	
	def boolean addRel(IRelationshipEL rel)
	
	def boolean addAllRels(List<IRelationshipEL> relationships)
	
	def List<IRelationshipEL> getRelationship(Direction set)
}

