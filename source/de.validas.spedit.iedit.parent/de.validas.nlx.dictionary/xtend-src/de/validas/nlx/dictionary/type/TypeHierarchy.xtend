package de.validas.nlx.dictionary.type

import java.util.List
import org.neo4j.driver.v1.types.Node
import static de.validas.nlx.constants.Neo4jConstants._NAME

class TypeHierarchy implements ITypeHierarchy{
	
	Node node
	List<ITypeHierarchy> hierarchy
	
	new(Node node, List<ITypeHierarchy> hierarchy) {
		this.node = node
		this.hierarchy = hierarchy
	}
	
	override getType(){
		node.get(_NAME).asString
	}
	
	override getChildren() {
		hierarchy
	}
	
}