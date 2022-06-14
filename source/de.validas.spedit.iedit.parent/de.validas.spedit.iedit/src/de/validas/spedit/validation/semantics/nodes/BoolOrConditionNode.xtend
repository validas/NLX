package de.validas.spedit.validation.semantics.nodes

import de.validas.spedit.validation.semantics.IDictNode
import de.validas.spedit.validation.semantics.bool.BoolOr
import java.util.List
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.v1.Record
import de.validas.nlx.ai.semantics.INode
import de.validas.nlx.ai.IParserDriver

class BoolOrConditionNode extends ConditionNode {

	val static BoolOr boolOr = new BoolOr()
	
	new(NodeValue node, IParserDriver driver) {
		super(node, driver)
	}
	
	override INode solve() {
		// TODO consider a wrapper function with pre and post solves

		if (predicates === null) {
			var List<Record> outs = listAllOutputs()
			createPredicates(outs)
		}
		//Temporary
		var result = doExecuteTypes(connections, boolOr)
		
		if (result instanceof IDictNode) // type safety
			return result
		else
			return null
		
	}
	
}
