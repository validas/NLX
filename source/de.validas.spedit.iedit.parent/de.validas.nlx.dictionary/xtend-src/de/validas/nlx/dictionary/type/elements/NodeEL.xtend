package de.validas.nlx.dictionary.type.elements

import de.validas.nlx.constants.Direction
import java.util.List
import org.neo4j.driver.v1.types.Node

class NodeEL extends NetworkEL implements INodeEL {
	
	protected Node node
	
	//FIXME: 15.12.21 unclear if HashMap is better here
	protected List<IRelationshipEL> relsIN
	protected List<IRelationshipEL> relsOUT
	
	new (Node node, List<IRelationshipEL> rels){
		this.node = node
		addAllRels(rels)
	}
	
	new(Node node) {
		this.node = node
		this.relsIN = newArrayList
		this.relsOUT = newArrayList
	}
	
	override Node getNode(){
		node
	}
	
	override boolean addAllRels(List<IRelationshipEL> relationships) {
		var success = true
		for (rel : relationships){
			var respond = addRel(rel)
			if (success)
				success = respond
		}
		success // if one is false
	}
	
	override List<IRelationshipEL> getRelationship(Direction set){
		switch (set){
			case IN: {
				relsIN
			}
			case OUT: {
				relsOUT
			}
			case ALL: {
				var all = newArrayList
				all.addAll(relsIN)
				all.addAll(relsOUT)
				all
			}
			default: {
				null
			}
		}
	}
	
	override boolean addRel(IRelationshipEL rel){
		var endID = rel.relationship.endNodeId
		var startID = rel.relationship.startNodeId
		var iD = node.id
		if (iD.equals(startID) && !relsOUT.contains(rel))
			return relsOUT.add(rel)
		if (iD.equals(endID) && !relsIN.contains(rel))
			return relsIN.add(rel)
		false
	}
	
	override getID() {
		node.id
	}
	
	override mergeRel(INetworkEL el) {
		if (el instanceof NodeEL){
			el.getRelationship(Direction.ALL).forall[r | 
				addRel(r)
				r.relink(this)
			]
		}
	}
	
	override toString(){
		'''«FOR label : node.labels SEPARATOR ","»«label»«ENDFOR» | «node.asMap»'''
	}
	
}