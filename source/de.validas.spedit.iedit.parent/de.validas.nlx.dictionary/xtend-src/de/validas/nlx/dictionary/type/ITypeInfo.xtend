/**
 * @author: Felix Schaller
 */
package de.validas.nlx.dictionary.type

import de.validas.nlx.dictionary.type.ITypeAttributes
import de.validas.utils.data.types.XPair
import java.util.List
import java.util.HashMap
import org.neo4j.driver.v1.types.Node

interface ITypeInfo {
	
	//TODO: replace XPair with grammar Type with hashed attributes 
	def List<XPair<String, ITypeAttributes>> getTypes()
	
	def void updateTypes(HashMap<String, ITypeAttributes> linkTypes)
	def void addTypes(HashMap<String, ITypeAttributes> linkTypes)
	
	def Node getBase()
	
}
