package de.validas.nlx.view.fxviews.semantics.types

import de.validas.nlx.dictionary.type.ITypeAttributes

interface ITypeElement {

	def ITypeAttributes getTypeAttributes()
	
	def void setTypeAttributes(ITypeAttributes attrs)
	
}