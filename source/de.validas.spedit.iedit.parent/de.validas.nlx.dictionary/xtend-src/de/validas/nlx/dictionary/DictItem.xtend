package de.validas.nlx.dictionary

/**
 * @author schaller
 * interface class that converts info from IItem for dictionary. 
 * Because circular dependencies are not allowed
 */
class DictItem {
	
	String name
	long id = -1
	String type
	String innerType //TODO: try to find a better Name for that property
	
	new (String name, String type){
		this(name, type, -1)	
	}
	
	new(String name, String type, long id) {
		this(name, type, null, id)
	}
	
	new(String name, String type, String innerType, long id) {
		this.name = name
		this.type = type
		this.innerType = innerType
		this.id = id
	}
	
	def getName(){name}
	
	def getType(){type}
	
	def getId(){id}
	
	def getInnerType(){innerType}

}