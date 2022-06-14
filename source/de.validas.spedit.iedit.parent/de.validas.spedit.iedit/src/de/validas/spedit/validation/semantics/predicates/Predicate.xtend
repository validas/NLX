package de.validas.spedit.validation.semantics.predicates

import de.validas.nlx.ai.IDbAccess
import de.validas.nlx.ai.neo4j.Neo4jAccess.Action
import de.validas.spedit.validation.semantics.IDictNode
import de.validas.spedit.validation.semantics.ValidateNode
import java.util.ArrayList
import java.util.Arrays
import java.util.HashMap
import java.util.List
import java.util.stream.Stream
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.internal.value.RelationshipValue
import org.neo4j.driver.v1.Record
import org.neo4j.driver.v1.types.Relationship
import static de.validas.nlx.constants.Neo4jConstants._LINK
import static de.validas.nlx.constants.Neo4jConstants._NODE
import static de.validas.nlx.constants.Neo4jConstants._TARGET
import static de.validas.nlx.dictionary.constants.NodeConstants._WORD
import static de.validas.nlx.dictionary.PredicateConstants.CONJUGATION_
import static de.validas.nlx.dictionary.PredicateConstants.GET_SOURCE_
import static de.validas.nlx.dictionary.PredicateConstants.GET_TARGET_
import static de.validas.nlx.dictionary.PredicateConstants.NAME_
import static de.validas.nlx.dictionary.PredicateConstants.SUB_CLASS_OF_
import static de.validas.nlx.dictionary.PredicateConstants.TENSE_
import static de.validas.nlx.dictionary.PredicateConstants.WITH_
import static de.validas.nlx.dictionary.PredicateConstants.BASE_FORM_

import de.validas.nlx.ai.util.NodeUtil
import java.util.Collections
import de.validas.nlx.ai.semantics.IPredicate
import de.validas.nlx.ai.semantics.INode
import org.eclipse.xtext.xbase.lib.Functions.Function1
import de.validas.nlx.ai.IParserDriver

abstract class Predicate implements IPredicate {
	static val DEBUG = false
	protected static val List<String> requiredTense = new ArrayList(Arrays.asList(WITH_))
	protected static val List<String> requiredSubClass = new ArrayList(Arrays.asList(WITH_, GET_TARGET_))
	protected static val List<String> requiredConjugation = new ArrayList(Stream.concat(requiredTense.stream, Arrays.asList(GET_SOURCE_, GET_TARGET_).stream).toArray) // TODO: nice but awkward
	protected static val List<String> requiredBaseForm = requiredConjugation
	protected Relationship relation
	protected NodeValue target
	protected IDbAccess dbAccessor
	protected INode nodeStart
	protected INode nodeEnd
	protected INode errorNode
	protected HashMap<String, IDictNode> children = new HashMap()
	protected static val validationType = #{
		CONJUGATION_ -> requiredConjugation,
		TENSE_ -> requiredTense,
		SUB_CLASS_OF_ -> requiredSubClass,
		BASE_FORM_ -> requiredBaseForm
	}

	new(Relationship relation, INode nodeStart, INode nodeEnd, IDbAccess dbAccessor) {
		this.relation = relation
		this.dbAccessor = dbAccessor
		this.nodeStart = nodeStart
		this.nodeEnd = nodeEnd
	}

	abstract override INode execute()

	def isRelated(long s, long e, String type) {
		// TODO: should cache query for next inquiries to speed up
		var List<Record> records = readDB('''MATCH («_NODE»)-[:«type»]-(«_TARGET») WHERE ID(«_NODE») = «s» AND ID(«_TARGET») = «e»
Return «_NODE»,«_TARGET»''')
		if (records !== null && ! records.isEmpty)
			return true
		false
	}

	def INode doLinkTo(String asType) {
		errorNode = null
		// TODO: Validation has to go here
		var ValidateNode nodeValidator = new ValidateNode(nodeStart, nodeEnd, validationType.get(asType))
		var connections = nodeValidator.validate()
		if (nodeValidator.hasAnnotation()) // TODO: Distinguish between Error Annotation and other Types
			return nodeValidator.getAnnotation()
		switch (asType) { // TODO: highly redundant... 
			case BASE_FORM_,
			case CONJUGATION_: {
				if (connections.get(GET_SOURCE_) !== null && connections.get(GET_TARGET_) !== null) {
					if (connections.get(GET_SOURCE_).equals(connections.get(WITH_))) {
						if (!isRelated(connections.get(GET_SOURCE_).getID, connections.get(GET_TARGET_).getID, asType)) {
//TODO: redundant
							var List<Record> records = writeDB('''MATCH («_NODE») WHERE ID(«_NODE») = «connections.get(WITH_).getID»  
MATCH («_TARGET») WHERE ID(«_TARGET») = «connections.get(GET_TARGET_).getID»
MERGE («_NODE»)-[l:«asType»]->(«_TARGET»)
Return l''')
							logResult(records)
						}
					}
				}
				nodeEnd
			}
			case TENSE_: {
				var end = nodeEnd.getID()
				if (!isRelated(connections.get(WITH_).getID, end, asType)) {
//TODO: redundant
					var List<Record> records = writeDB('''MATCH («_NODE») WHERE ID(«_NODE») = «connections.get(WITH_).getID»  
MATCH («_TARGET») WHERE ID(«_TARGET») = «end»
MERGE («_NODE»)-[l:«asType»]->(«_TARGET»)
Return l''')
					logResult(records)
				}
				nodeEnd
			}
			case SUB_CLASS_OF_: {
				if (connections.get(GET_TARGET_) !== null) {
					if (!isRelated(connections.get(GET_TARGET_).getID, nodeEnd.getID, asType)) {
						var List<Record> records = writeDB('''MATCH («_NODE») WHERE ID(«_NODE») = «connections.get(GET_TARGET_).getID»  
MATCH («_TARGET») WHERE ID(«_TARGET») = «nodeEnd.getID»
MERGE («_NODE»)-[l:«asType»]->(«_TARGET»)
Return l''')
						logResult(records)
					}
				}
				nodeEnd
			}
		}
	}

	def void logResult(List<Record> records) {
		for (record : records ?: Collections.emptyList) {
			var rel = (record.get(_LINK.toString) as RelationshipValue).asRelationship
			logIt(rel)
		}
	}

	def List<Record> writeDB(String query) {
		if (!DEBUG) {
			dbAccessor.runCodeRecords(query, Action.WRITE)
		} else {
			nodeStart.getDriver.logger.log(query)
			null
		}
	}

	def List<Record> readDB(String query) {
		dbAccessor.runCodeRecords(query, Action.READ)
	}

	def INode findWord(INode nodeClass, String name) {
		if (!children.containsKey(name)) {
			var Function1<Object, List<NodeValue>> delegate = [ e |
				if (e instanceof String)
					nodeClass.findNodeTypeByName(_WORD, e)
			]
			var INode result = nodeClass.findNodeAndCreateTarget(name, delegate)
			if (result instanceof IDictNode) {
				children.put(name, result)
				return result
			}
		} else
			return children.get(name)
		null
	}

	def INode findTarget(INode nodeClass, String name) {
		// TODO:  generalize this method with WordFragment find Fragment and delegate search
		if (!children.containsKey(name)) {
			var Function1<Object, List<NodeValue>> delegate = [ e |
				if (e instanceof String)
					nodeClass.findLinkedNodeByName(e)
			]
			var INode result = nodeClass.findNodeAndCreateTarget(name, delegate)
			if (result instanceof IDictNode) {
				children.put(name, result)
				return result
			}
		} else
			return children.get(name)
		null
	}

	def INode executeQuery(String query, IParserDriver driver) {
		var List<NodeValue> nodes = NodeUtil.recordsToNode(dbAccessor.runCodeRecords(query, Action.WRITE), _TARGET)
		if (nodes !== null && !nodes.isEmpty)
			driver.getNodeById(nodes.get(0))
		else
			null
	}

	protected def logIt(Relationship rel) {
		nodeStart.getDriver.logger.log('''Connection created:
		START:  «nodeStart.getAttribute(NAME_)» 
		with: «nodeStart.getAttribute(WITH_)»
		getSource: «nodeStart.getAttribute(GET_SOURCE_)»
		getTarget: «nodeStart.getAttribute(GET_TARGET_)»
		-
		[Connection ID: «rel.id» , Type: «rel.type»] 
		-> 
		END: «nodeEnd.getAttribute(NAME_)»
		Debug:«DEBUG»
		---------------------------------------------------------------''')
	}
}
