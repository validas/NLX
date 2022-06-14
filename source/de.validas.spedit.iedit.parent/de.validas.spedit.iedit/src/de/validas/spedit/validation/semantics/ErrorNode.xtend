package de.validas.spedit.validation.semantics

import de.validas.spedit.validation.semantics.nodes.AbstractDictRuleObj
import org.neo4j.driver.internal.value.NodeValue
import de.validas.nlx.ai.IParserDriver

class ErrorNode extends AbstractDictRuleObj {
	
	new(NodeValue node, IParserDriver driver) {
		super(node, driver)
	}
	
	override solve() {
		null
	}
	
}