package de.validas.spedit.validation.semantics.nodes

import de.validas.spedit.validation.semantics.bool.BoolOr
import java.util.List
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.v1.Record

import static de.validas.nlx.constants.Neo4jConstants._NAME
import static de.validas.nlx.constants.Neo4jConstants._NODE
import static de.validas.nlx.constants.Neo4jConstants._TARGET
import static de.validas.nlx.dictionary.constants.NodeConstants._ATTR_NAME
import static de.validas.nlx.dictionary.constants.NodeConstants._QUERY
import static de.validas.nlx.dictionary.constants.NodeConstants._SHORT_OF
import static de.validas.nlx.dictionary.constants.NodeConstants._TYPE
import static de.validas.nlx.dictionary.PredicateConstants.GET_NAME_
import static de.validas.nlx.dictionary.PredicateConstants.OF_
import de.validas.spedit.validation.semantics.nodes.AbstractDictRuleObj
import de.validas.nlx.ai.IParserDriver
import de.validas.nlx.ai.semantics.INode

class ActionObject extends AbstractDictRuleObj implements de.validas.spedit.validation.semantics.IObjectNode {
	
	val static BoolOr boolOr = new BoolOr()
	protected val List<String> objectTypes = #[OF_, GET_NAME_]
	//TODO: check type safety: protected val HasMap<String> objectTypes = #{OF_ -> INode.class, GET_NAME_ -> String.class}
	
	new(NodeValue node, IParserDriver driver) {
		super(node, driver)
	}
	
	override solve() {
		// TODO consider a wrapper function with pre and post solves
		
		if (predicates === null) {
			var List<Record> outs = listAllOutputs()
			createPredicates(outs)
		}
		doExecuteTypes(objectTypes, boolOr)
		if (getAttribute(_TYPE).equals(_SHORT_OF)) 	{			//TODO: better use predicate relation feature to distinguish object type
			// query short version of word
			for (attributes : objectTypes){
				if (getAttribute(attributes) === null) return null // typecheck gate 
			} 
//			"Match (t: Word)-[]->(WordClass {name:\"%2$s\"})\r\n" + 
//			"Where t.name = substring(n.name, 0,size(n.name)-%3$d)\r\n" +
			var INode ofType = getAttribute(OF_) as INode
			var suffixLength = (getAttribute(GET_NAME_) as String).length()
			 
			var result = 
'''MATCH («_TARGET»:Word)-[]->(«ofType.getLabel()»{«_NAME» : "«ofType.getAttribute(_ATTR_NAME) as String»"}) 
WHERE «_TARGET».«_NAME» = substring(«_NODE».«_NAME», 0,size(«_NODE».«_NAME»)-«suffixLength»)'''

			setAttribute(_QUERY, result)
			null 
		}
	}
	
}
