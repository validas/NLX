package de.validas.nlx.dictionary.type

import de.validas.nlx.dictionary.type.ITypeHierarchy
import java.util.List
import static de.validas.nlx.dictionary.constants.NodeConstants._NONE

class NoneTypeHierarchy implements ITypeHierarchy {
	
	override getType() {
		_NONE
	}
	
	override getChildren() {
		var List<ITypeHierarchy> empty = newArrayList
		return empty
	}
	
}