package de.validas.spedit.validation.semantics.nodes

import org.neo4j.driver.internal.value.NodeValue
import de.validas.nlx.ai.IParserDriver

class WordFragment extends AbstractDictRuleObj implements de.validas.spedit.validation.semantics.IDictNode {
	
//	protected HashMap<String, IDictNode> children = new HashMap()
	
	new(NodeValue node, IParserDriver driver) {
		super(node, driver)
	}
	
// TODO: find a generalizing method with WordClass.find...
// TODO: DONE!
//	def INode findWord(String name){
//		if (!children.containsKey(name)) {
//			var INode result = findNodeAndCreate(_WORD, name)
//			if (result instanceof IDictNode) {
//				children.put(name, result)
//				return result
//			}
//		} else
//			return children.get(name)
//		null
//		
//	} 
	
	override solve() {
		// TODO consider a wrapper function with pre and post solves
		null
	}
}
