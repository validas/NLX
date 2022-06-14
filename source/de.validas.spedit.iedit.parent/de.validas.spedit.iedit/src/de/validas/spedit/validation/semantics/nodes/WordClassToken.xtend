package de.validas.spedit.validation.semantics.nodes

import de.validas.spedit.validation.semantics.IDictNode
import org.neo4j.driver.internal.value.NodeValue
import de.validas.nlx.ai.IParserDriver

class WordClassToken extends AbstractDictRuleObj implements IDictNode {
	

	new(NodeValue node, IParserDriver driver) {
		super(node, driver)
	}

	override solve() {
		// TODO consider a wrapper function with pre and post solves
		null
	}
}
