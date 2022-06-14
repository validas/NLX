package de.validas.nlx.ai

import de.validas.nlx.ai.IDbAccess
import java.util.HashMap
import org.eclipse.xtext.builder.debug.IBuildLogger
import org.neo4j.driver.internal.value.NodeValue
import de.validas.nlx.ai.semantics.INode

class ParserDriver implements IParserDriver {
	
	IDbAccess dbAccess
	IPredicateFactory predicateFactory
	INodeFactory nodeFactory
	IBuildLogger logger
	
	HashMap<Long, INode> nodeCache
	
	new(IDbAccess access, INodeFactory factory, IPredicateFactory factory2, IBuildLogger logger) {
		dbAccess = access
		nodeFactory = factory
		predicateFactory = factory2
		this.logger = logger  //TODO replace with injected Class
	}
	
	override getDbAccessor() {
		dbAccess
	}
	
	override setDbAccessor(IDbAccess access) {
		dbAccess = access
	}
	
	override setPredicateFactory(IPredicateFactory factory) {
		predicateFactory = factory
	}
	
	override getPredicateFactory() {
		predicateFactory
	}
	
	override setNodeFactory(INodeFactory factory) {
		nodeFactory = factory
	}
	
	override getNodeFactory() {
		nodeFactory
	}
	
	override getLogger() {
		logger
	}
	
	override INode getNodeById(NodeValue node){
		var long id = node.asNode.id
		if (!nodeCache.containsKey(id)){
			var INode result = nodeFactory.create(node, this)
			if (result !== null) {
				nodeCache.put(id,result)
				return result	
			}
		} else {
			return nodeCache.get(id)
		}
		return null
	}
	
	override newCache() {
		var ParserDriver returnDriver = new ParserDriver(dbAccess, nodeFactory, predicateFactory, logger)
		returnDriver.nodeCache = new HashMap
		return returnDriver
	}
	
//	protected def setNodeCache(HashMap<Long, INode> map) {
//		nodeCache = map
//	}
			
}