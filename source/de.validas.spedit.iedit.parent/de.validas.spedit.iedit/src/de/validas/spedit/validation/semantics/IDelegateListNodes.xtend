package de.validas.spedit.validation.semantics

import java.util.List
import org.neo4j.driver.internal.value.NodeValue

/**
 *  deprecated. use IFunction from: de.validas.nlx.ai
 */
@Deprecated
interface IDelegateListNodes {
	def List<NodeValue> execute(String string)
}