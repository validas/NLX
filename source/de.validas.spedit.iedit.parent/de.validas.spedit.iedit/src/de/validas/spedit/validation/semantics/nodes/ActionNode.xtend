package de.validas.spedit.validation.semantics.nodes

import de.validas.spedit.validation.semantics.bool.BoolOr
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.v1.Record


import static de.validas.nlx.dictionary.PredicateConstants.GET_SOURCE_
import static de.validas.nlx.dictionary.PredicateConstants.GET_TARGET_
import static de.validas.nlx.dictionary.PredicateConstants.LINK_INSTANCE_TO_
import static de.validas.nlx.dictionary.PredicateConstants.LINK_TO_
import static de.validas.nlx.dictionary.PredicateConstants.DO_
import static de.validas.nlx.dictionary.PredicateConstants.FIND_
import de.validas.spedit.validation.semantics.IActionNode
import de.validas.nlx.ai.IParserDriver
import de.validas.nlx.ai.semantics.INode

class ActionNode extends AbstractDictRuleObj implements IActionNode {
	
	val static BoolOr boolOr = new BoolOr()
	
//	var INode objectNode
	//TODO: configure this externally one day
	protected val List<String> functionalTypes = new ArrayList(Arrays.asList(GET_SOURCE_, GET_TARGET_, LINK_TO_, LINK_INSTANCE_TO_, FIND_))

	new(NodeValue node, IParserDriver driver) {
		super(node, driver)
	}

	override INode solve() {
		// TODO consider a wrapper function with pre and post solves
		if (predicates === null) {
			var List<Record> outs = listAllOutputs()
			createPredicates(outs)
		}
		var INode result = doExecuteTypes(functionalTypes, boolOr)
		if (result != null){
			return doExecuteType(DO_, boolOr, predicates.get(DO_)) 
		}
		//TODO Fetch ErrorNode and pass to parent ImplRuleNode
	}

}
