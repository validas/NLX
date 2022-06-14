package de.validas.spedit.validation.semantics.nodes

import org.neo4j.driver.internal.value.NodeValue
import de.validas.nlx.ai.IParserDriver

class WordToken extends AbstractDictRuleObj implements de.validas.spedit.validation.semantics.IDictNode {
	
	protected WordClassToken wordClass = null //consider to replace by wordClass object
	
	new(NodeValue node, IParserDriver driver) {
		super(node, driver)
	}
	
	def String getWord(){
		var Object obj = getAttribute("name")
		if (obj instanceof String) return obj
		null
	}
	
	override solve() {
		//doesn't solve anything yet
		// TODO consider a wrapper function with pre and post solves
		null
	}
	
}
