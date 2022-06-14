package de.validas.spedit.validation.semantics

import java.util.HashMap
import org.neo4j.driver.internal.value.NodeValue

import static de.validas.nlx.dictionary.PredicateConstants.TYPE_
import static de.validas.nlx.dictionary.constants.NodeConstants._BOOL_AND
import static de.validas.nlx.dictionary.constants.NodeConstants._BOOL_OR
import de.validas.spedit.validation.semantics.nodes.BoolAndConditionNode
import de.validas.spedit.validation.semantics.nodes.BoolOrConditionNode
import de.validas.nlx.ai.IParserDriver
import de.validas.nlx.ai.INodeFactory

class ConditionFactory implements INodeFactory {

	override create(NodeValue node, IParserDriver driver) {
		var HashMap<String, Object> attributes = new HashMap<String, Object>(node.asNode().asMap())
		switch (attributes.get(TYPE_)) {
			case _BOOL_AND: {
				new BoolAndConditionNode(node, driver)
			}
			case _BOOL_OR: {
				new BoolOrConditionNode(node, driver)
			}
		}

	}

}
