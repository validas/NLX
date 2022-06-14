package de.validas.spedit.validation.semantics.nodes

import de.validas.spedit.validation.semantics.bool.BoolOr
import de.validas.spedit.validation.semantics.token.ITokenChain
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.v1.Record

import static de.validas.nlx.dictionary.PredicateConstants.EQUALS_
import static de.validas.nlx.dictionary.PredicateConstants.EXTENDS_
import static de.validas.nlx.dictionary.PredicateConstants.NEXT_
import static de.validas.nlx.dictionary.PredicateConstants.RESULT_
import static de.validas.nlx.dictionary.PredicateConstants.TARGET_
import de.validas.spedit.validation.semantics.IRuleNode
import de.validas.spedit.validation.semantics.ITokenNode
import de.validas.nlx.ai.semantics.INode
import de.validas.nlx.ai.IParserDriver

class RuleToken extends AbstractDictRuleObj implements IRuleNode, ITokenNode {
	
	val static BoolOr boolOr = new BoolOr()

	protected ITokenChain patternChain

	protected val List<String> functionalTypes = new ArrayList(Arrays.asList(EXTENDS_, EQUALS_))
	protected val List<String> finalTypes = new ArrayList(Arrays.asList(TARGET_, NEXT_))
	

	new(NodeValue node, IParserDriver driver) {
		super(node, driver)
	}

	override INode solve() {
		// TODO consider a wrapper function with pre and post solves
		
		if (predicates === null) {
			var List<Record> outs = listAllOutputs()
			createPredicates(outs)
		}
		var INode result = setAttribute(RESULT_,doExecuteTypes(functionalTypes,boolOr)) as INode
		if (result !== null) {
			if (negativeFilter !==null && negativeFilter.contains(NEXT_))
				return result
			return doExecuteType(NEXT_, boolOr, predicates.get(NEXT_))
		} else 
			return setAttribute(RESULT_, doExecuteType(TARGET_, boolOr, predicates.get(TARGET_))) as INode	
	}
	
	override setChain(ITokenChain pattern) {
		this.patternChain = pattern
	}
	
	override getChain() {
		patternChain
	}
	
}	

