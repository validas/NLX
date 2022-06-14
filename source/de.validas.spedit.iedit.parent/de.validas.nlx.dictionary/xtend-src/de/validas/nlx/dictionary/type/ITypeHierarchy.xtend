package de.validas.nlx.dictionary.type

import java.util.List

interface ITypeHierarchy {
	
	def String getType()
	
	def List<ITypeHierarchy> getChildren()
}