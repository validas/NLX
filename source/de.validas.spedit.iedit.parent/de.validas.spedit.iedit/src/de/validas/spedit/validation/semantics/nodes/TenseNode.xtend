package de.validas.spedit.validation.semantics.nodes

import org.neo4j.driver.internal.value.NodeValue
import static de.validas.nlx.dictionary.PredicateConstants.NAME_
import de.validas.nlx.ai.IParserDriver

class TenseNode extends AbstractDictRuleObj implements de.validas.spedit.validation.semantics.IDictNode {
	
	new(NodeValue node, IParserDriver driver) {
		super(node, driver)
	}

	def String getTense() {
		var Object obj = getAttribute(NAME_)
		if(obj instanceof String) return obj
		null
	}
	
	override solve() {
		// TODO consider a wrapper function with pre and post solves
		null //has no behavior yet
	}
	
}
