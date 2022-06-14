package de.validas.spedit.validation.semantics.nodes

import java.util.ArrayList
import java.util.Arrays
import java.util.List
import org.neo4j.driver.internal.value.NodeValue
import de.validas.spedit.validation.semantics.token.ITokenChain

import static de.validas.nlx.dictionary.PredicateConstants.IS_
import static de.validas.nlx.dictionary.PredicateConstants.INSTANCE_OF_
import static de.validas.nlx.dictionary.PredicateConstants.ENDS_WITH_
import de.validas.spedit.validation.semantics.nodes.AbstractDictRuleObj
import de.validas.nlx.ai.semantics.INode
import de.validas.nlx.ai.IParserDriver

abstract class ConditionNode extends AbstractDictRuleObj implements de.validas.spedit.validation.semantics.IRuleNode, de.validas.spedit.validation.semantics.ITokenNode {
	
	protected ITokenChain patternChain
	
	protected List<INode> isObj
	protected String match
	// allowed connections TODO: configure this externally one day 
	protected val List<String> connections = new ArrayList( Arrays.asList(IS_, INSTANCE_OF_, ENDS_WITH_))
	
	new(NodeValue node, IParserDriver driver) {
		super(node, driver)
	}
	
	override setChain(ITokenChain pattern) {
		this.patternChain = pattern
	}
	
	override getChain() {
		patternChain
	}
	
	override INode solve()
}
