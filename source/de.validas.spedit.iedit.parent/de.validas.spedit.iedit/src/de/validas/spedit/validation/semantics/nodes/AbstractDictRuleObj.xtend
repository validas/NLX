/**
 * AbstractDictRuleObj - Base Obj for Abstract dictionary rules
 * (c) 2020 licensed under Apache Public License 2.0
 * www.felixschaller.com
 * @author Felix Schaller
 */

package de.validas.spedit.validation.semantics.nodes

import de.validas.nlx.ai.IFunction1
import de.validas.nlx.ai.IParserDriver
import de.validas.nlx.ai.neo4j.Neo4jAccess.Action
import de.validas.nlx.ai.semantics.INode
import de.validas.nlx.ai.semantics.IPredicate
import de.validas.spedit.validation.semantics.bool.BoolOp
import de.validas.nlx.ai.util.NodeUtil
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.List
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.internal.value.RelationshipValue
import org.neo4j.driver.v1.Record

import static de.validas.nlx.constants.Neo4jConstants._ATTR_NAME
import static de.validas.nlx.constants.Neo4jConstants._LINK
import static de.validas.nlx.constants.Neo4jConstants._NODE
import static de.validas.nlx.constants.Neo4jConstants._TARGET
import static de.validas.nlx.dictionary.constants.NodeConstants._KOMMA_SEP_FILTER
import static de.validas.nlx.dictionary.constants.NodeConstants._NEGATIVE_FILTER

abstract class AbstractDictRuleObj implements INode {
	protected NodeValue node;
	protected String label;
	protected long ID;
	protected HashMap<String, Object> attributes;
	protected HashMap<String, Object> extraAttributes = new HashMap();
	protected IParserDriver driver;
	protected HashMap<String, List<IPredicate>> predicates
	protected List<String> negativeFilter
	protected List<String> positiveFilter

	new(NodeValue node, IParserDriver driver) {
		this.node = node
		this.driver = driver
		this.label = internalGetLabelFromNode(node)
		this.attributes = internalGetAttrFromNode(node)
		this.ID = internalGetIdFromNode(node)
	}

	protected def HashMap<String, Object> internalGetAttrFromNode(NodeValue value) {
		new HashMap<String, Object>(node.asNode().asMap())
	}

	protected def String internalGetLabelFromNode(NodeValue node) {
		// TODO: unfinished
		var Iterable<String> result = node.asNode().labels()
		result.get(0)
	}

	protected def long internalGetIdFromNode(NodeValue node) {
		node.asNode().id
	}

	override NodeValue getNodeRef() {
		node
	}

	override void setNodeRef(NodeValue node) {
		this.node = node
	}

	override List<Record> listAllConnections() {
		driver.dbAccessor.runCodeRecords('''MATCH («_NODE»:«label»)-[«_LINK»]-(«_TARGET»)
WHERE ID(n) = «ID»
RETURN «_LINK», «_TARGET»''', Action.READ)
	}

	override List<Record> listAllOutputs() {
		driver.dbAccessor.runCodeRecords('''MATCH («_NODE»:«label»)-[«_LINK»]->(«_TARGET»)
WHERE ID(n) = «ID»
RETURN «_LINK», «_TARGET»''', Action.READ)
	}

	override List<Record> listAllInputs() {
		driver.dbAccessor.runCodeRecords('''MATCH («_NODE»:«label»)<-[«_LINK»]-(«_TARGET»)
WHERE ID(n) = «ID»
RETURN «_LINK», «_TARGET»''', Action.READ)
	}

	override boolean hasLabel(NodeValue node, String name) {
		for (label : node.asNode.labels) {
			if (label.equals(name)) return true
		}
		return false;
	}

	override toString() {
		'''Node of Class:(«this.class»), 
Labels:(«label»), Attributes:(«attributes.toString()»)'''
	}

	@Deprecated
	protected def List<NodeValue> internalGetNodesOfLinkType(String linkType) {
		var List<Record> records = driver.dbAccessor.runCodeRecords('''
MATCH («_NODE»:«label»)-[«_LINK»:«linkType»]->(«_TARGET»)
WHERE ID(n) = «ID»
RETURN «_TARGET»''', Action.READ)
		NodeUtil.recordsToNode(records, _TARGET)
	}

	override Object getAttribute(String key) {
		if (attributes.containsKey(key)) {
			attributes.get(key)
		} else {
			extraAttributes.get(key)
		}
	}

	override Object setAttribute(String key, Object value) {
		extraAttributes.put(key, value)
		value
	}

	protected def clearExtraAttributes() {
		extraAttributes = new HashMap()
	}

	override long getID() {
		ID
	}

	override String getLabel() {
		label
	}

	override INode findNodeAndCreateTarget(String string, IFunction1<Object, ? extends Object> delegate) {
		var result = delegate.apply(string) // findLinkedNodeByName(string)
		if (result instanceof List) {
			var List<NodeValue> nodes = result
			if (nodes !== null && !nodes.isEmpty)
				driver.getNodeById(nodes.get(0))
		}
	}

	// TODO: redundant
//	def INode findNodeAndCreate(String type, String string) {
//		var List<NodeValue> nodes = findNodeTypeByName(type, string) //TODO: generalize with substring 
//		if (nodes !== null && !nodes.isEmpty)
//			driver.getNodeById(nodes.get(0))
//	}
	// TODO: redundant find a general solution
	override List<NodeValue> findNodeTypeByName(String type, String name) {
		var List<Record> records = driver.dbAccessor.runCodeRecords('''
MATCH («_NODE»:«type» {«_ATTR_NAME»:"«name»"})
RETURN «_NODE»''', Action.READ)
		NodeUtil.recordsToNode(records, _NODE)
	}

	override List<NodeValue> findLinkedNodeByName(String string) {
		var List<Record> records = driver.dbAccessor.runCodeRecords('''
MATCH («_NODE»:«label» {«_ATTR_NAME»:"«attributes.get(_ATTR_NAME.toString)»"})-[]-(«_TARGET» {«_ATTR_NAME»: "«string»"})
WHERE ID(n) = «ID»
RETURN «_TARGET»''', Action.READ)
		NodeUtil.recordsToNode(records, _TARGET)
	}

	protected def void createPredicates(List<Record> outs) {
		predicates = new HashMap
		for (record : outs) {
			var RelationshipValue rel = record.get(_LINK.toString) as RelationshipValue
			var predicate = driver.predicateFactory.create(
				rel,
				this,
				driver.getNodeById(record.get(_TARGET.toString) as NodeValue)
			)
			var type = rel.asRelationship.type.toLowerCase
			if (predicate !== null) {
				var result = predicates.get(type)
				if (result === null)
					result = new ArrayList
				result.add(predicate)
				predicates.put(type, result)
			}
		}
	}

	protected def INode doExecuteTypes(List<String> types, BoolOp boolOp) {
		var INode result
		for (connection : types) { // iterate through types
			var type = predicates.get(connection)
			if (type != null && !type.isEmpty) {
				result = doExecuteType(connection, boolOp, type)
				if (boolOp.isTrue(result))
					return boolOp.returnIntermediate(result)
			}
		}
		boolOp.returnFinal(result)
	}

	protected def INode doExecuteType(String type, BoolOp boolOp, List<IPredicate> connections) {
		var INode result
		if (negativeFilter !== null && negativeFilter.contains(type))
			return null
		for (predicate : connections ?: Collections.emptyList) {
			result = predicate.execute()
			if (boolOp.isTrue(result))
				return boolOp.returnIntermediate(result)
		}
		boolOp.returnFinal(result)
	}

	override setFilter(String filter) {
		negativeFilter = new ArrayList
		positiveFilter = new ArrayList
		for (element : filter.split(_KOMMA_SEP_FILTER)) {
			if (element.startsWith(_NEGATIVE_FILTER))
				negativeFilter.add(element.substring(1))
			else
				positiveFilter.add(element) // positive Filter not supported yet
		}
	}

	override IParserDriver getDriver() {
		driver
	}

	override INode solve()
}
