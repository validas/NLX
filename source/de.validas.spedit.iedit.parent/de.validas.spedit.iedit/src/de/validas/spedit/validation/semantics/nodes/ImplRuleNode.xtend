package de.validas.spedit.validation.semantics.nodes

import de.validas.spedit.validation.semantics.bool.BoolOr
import de.validas.spedit.validation.semantics.token.ITokenChain
import java.util.List
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.v1.Record

import static de.validas.nlx.dictionary.PredicateConstants.ENTER_RULE_
import static de.validas.nlx.dictionary.PredicateConstants.DO_
import de.validas.nlx.ai.semantics.INode
import de.validas.nlx.ai.IParserDriver

class ImplRuleNode extends AbstractDictRuleObj implements de.validas.spedit.validation.semantics.IRuleNode {
	
	val static BoolOr boolOr = new BoolOr()

	protected ITokenChain patternChain
	protected int index = 0
	protected INode result

	new(NodeValue node, IParserDriver driver) {
		super(node, driver)
	}

	def setChain(ITokenChain list) {
		patternChain = list
	}
	
	def getChain() {
		patternChain 
	}

	override INode solve() {
		// TODO consider a wrapper function with pre and post solves
		
		
		if (predicates === null) {
			var List<Record> outs = listAllOutputs()
			createPredicates(outs)
		}
		setResult = doExecuteType(ENTER_RULE_, boolOr, predicates.get(ENTER_RULE_))
		if (getResult !== null) {
			return doExecuteType(DO_, boolOr, predicates.get(DO_)) // void return
			
		}
	}

	def setResult(INode node) {
		this.result = node
	}
	
	def INode getResult(){
		result
	}
}
