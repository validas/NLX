package de.validas.nlx.dictionary.type

import de.validas.nlx.dictionary.type.elements.INodeEL
import de.validas.nlx.dictionary.type.elements.IRelationshipEL
import de.validas.nlx.dictionary.type.elements.NodeEL
import de.validas.nlx.dictionary.type.elements.RelationshipEL
import java.util.List
import java.util.Set
import org.neo4j.driver.v1.types.Node
import org.neo4j.driver.v1.types.Relationship

class TypeAttributes implements ITypeAttributes {
	
	Node baseNode
	Set<IRelationshipEL> attrs
	Set<INodeEL> source //TODO: 20.07.21 should be a single value
	Set<INodeEL> target
	
	new(Node node, Iterable<?> links, Node source, Node target) {	
		this.source = new XHashSet<INodeEL>()
		var sourceEL = new NodeEL(source)
		this.source.add(sourceEL)
		this.target = new XHashSet<INodeEL>()
		var NodeEL targetEL
		if (target !== null){
			targetEL = new NodeEL(target)
			this.target.add(targetEL)
		}
		basicsConstructor(node, links, sourceEL, targetEL)	
	}
	
	new(Node node, Iterable<?> links, List<Node> sourceELs, List<Node> targetELs) {
		this.baseNode = node
		this.source = new XHashSet<INodeEL>()
		this.source.addAll(sourceELs.map[e | new NodeEL(e)])
		this.target = new XHashSet<INodeEL>()
		this.target.addAll(targetELs.map[e | new NodeEL(e)])
		val list = newArrayList
		for (rel: links?:#[]){
			if (rel instanceof Relationship){
				val end =  rel.endNodeId
				val start = rel.startNodeId
				//TODO 16.12.21 must find start and end node in set
				source.forall[n | 
					if(n.node.id.equals(start))
						target.forall[t |
							if(t.node.id.equals(end))
								list.add(RelationshipEL.create(n, t, rel))
						] 
				]
			}
		}
		attrs = list.toSet
	}
	
	new(Node node, ITypeAttributes start, ITypeAttributes end) {
		this.baseNode = node
		this.attrs = new XHashSet<IRelationshipEL>(start.attrsEL)
		this.attrs.addAll(end.attrsEL)
		this.source = new XHashSet<INodeEL>(start.sourceEL)
		this.source.addAll(end.sourceEL)
		this.target = new XHashSet<INodeEL>(start.targetEL)
		this.target.addAll(end.targetEL)
	}
	
	new(Node node, Set<IRelationshipEL> links, Set<INodeEL> sourceELs, Set<INodeEL> targetELs) {
		this.baseNode = node
		this.attrs = links
		this.source = sourceELs
		this.target = targetELs
	}
	
	
	def basicsConstructor(Node node, Iterable<?> links, NodeEL sourceEL, NodeEL targetEL) {
		this.baseNode = node
			var list = newArrayList
			for (rel: links?:#[]){
				if (rel instanceof Relationship){
					list.add(RelationshipEL.create(sourceEL, targetEL, rel))	
				}	
			}
			attrs = list.toSet

	}
	
	override getBaseNode() {
		baseNode
	}
	
	override getAttrs(){
		attrs?.map[e | e.relationship].toList
	}
	
	override getSource(){
		source.toList.map[e | e.node]
	}
	
	override getTarget(){
		target.toList.map[e | e.node]
	}
	
	override merge(ITypeAttributes attributes) {
		
		var list = attributes.attrsEL
		if (!list.empty)
			attrs.addAll(list)
		
		source.addAll(attributes.sourceEL)
		target.addAll(attributes.targetEL)
	}
	
	override getSourceEL() {
		source
	}
	
	override getTargetEL() {
		target
	}
	
	override getAttrsEL(){
		attrs
	}
	
}