package de.validas.spedit.validation.semantics

import org.neo4j.driver.internal.value.NodeValue

import static de.validas.nlx.dictionary.constants.NodeConstants._WORD
import static de.validas.nlx.dictionary.constants.NodeConstants._WORD_CLASS
import static de.validas.nlx.dictionary.constants.NodeConstants._WORD_FRAGMENT
import static de.validas.nlx.dictionary.constants.NodeConstants._IMPL_RULE_TOKEN
import static de.validas.nlx.dictionary.constants.NodeConstants._ACTION
import static de.validas.nlx.dictionary.constants.NodeConstants._ACTION_OBJECT
import static de.validas.nlx.dictionary.constants.NodeConstants._TENSE
import static de.validas.nlx.dictionary.constants.NodeConstants._CONDITION
import de.validas.spedit.validation.semantics.nodes.WordToken
import de.validas.spedit.validation.semantics.nodes.WordClassToken
import de.validas.spedit.validation.semantics.nodes.WordFragment
import de.validas.spedit.validation.semantics.nodes.RuleToken
import de.validas.spedit.validation.semantics.nodes.ActionNode
import de.validas.spedit.validation.semantics.nodes.ActionObject
import de.validas.spedit.validation.semantics.nodes.TenseNode
import de.validas.nlx.ai.IParserDriver
import de.validas.nlx.ai.INodeFactory

class RuleNodeFactory implements INodeFactory {
	
	protected val ConditionFactory conditionFactory = new ConditionFactory()
	
	override create(NodeValue node, IParserDriver driver) {
		
		var Iterable<String> labels = node.asNode().labels()
		switch (labels.get(0)) { 
			//TODO: igonore multible Lables for now 
			case _WORD: {
				new WordToken(node, driver)
			}
			case _WORD_CLASS: {
				new WordClassToken(node, driver)
			}
			case _WORD_FRAGMENT: {
				new WordFragment(node, driver)
			}
			case _IMPL_RULE_TOKEN: {
				new RuleToken(node, driver)
			}
			case _ACTION: {
				new ActionNode(node, driver)
			}
			case _ACTION_OBJECT: {
				new ActionObject(node, driver)
			}
			case _TENSE: {
				new TenseNode(node,driver)
			}
			case _CONDITION: {
				conditionFactory.create(node, driver)  
			}
			
			//TODO: ... other future NoteTypes
		}
		
	}
	
}