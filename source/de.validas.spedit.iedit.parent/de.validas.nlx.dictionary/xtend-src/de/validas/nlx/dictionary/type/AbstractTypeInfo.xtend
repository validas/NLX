package de.validas.nlx.dictionary.type

import de.validas.nlx.dictionary.type.ITypeAttributes
import de.validas.utils.data.types.XPair
import java.util.HashMap
import java.util.List
import org.neo4j.driver.v1.types.Node

abstract class AbstractTypeInfo implements ITypeInfo{
	
	protected List<XPair<String, ITypeAttributes>> types
	protected Node baseNode

	
	new(Node node, HashMap<String, de.validas.nlx.dictionary.type.ITypeAttributes> linkTypes) {
		types = newArrayList
		addTypes(linkTypes)
		baseNode = node
	}
	
	override getTypes(){
		types
	}
	
	override updateTypes(HashMap<String, ITypeAttributes> linkTypes) {
		types.clear
		addTypes(linkTypes)
	}
	
	override void addTypes(HashMap<String, ITypeAttributes> linkTypes){
		if (linkTypes !== null)
			for (type : linkTypes.keySet){
				types.add(new XPair<String, ITypeAttributes>(type,linkTypes.get(type)))
			}
	}
	
	override getBase(){
		baseNode
	}
	
}
