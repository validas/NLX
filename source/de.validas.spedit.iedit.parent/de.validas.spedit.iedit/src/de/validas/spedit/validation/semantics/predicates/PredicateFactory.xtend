package de.validas.spedit.validation.semantics.predicates

import de.validas.nlx.ai.IDbAccess
import de.validas.spedit.validation.semantics.nodes.ActionObject
import de.validas.spedit.validation.semantics.nodes.ConditionNode
import de.validas.spedit.validation.semantics.IActionNode
import de.validas.spedit.validation.semantics.IDictNode
import de.validas.spedit.validation.semantics.IObjectNode
import de.validas.spedit.validation.semantics.ITokenNode
import de.validas.spedit.validation.semantics.nodes.ImplRuleNode
import de.validas.spedit.validation.semantics.nodes.RuleToken
import de.validas.spedit.validation.semantics.nodes.WordClassToken
import de.validas.spedit.validation.semantics.nodes.WordFragment
import de.validas.spedit.validation.semantics.nodes.WordToken
import org.neo4j.driver.internal.value.RelationshipValue

import static de.validas.nlx.constants.Neo4jConstants._ATTR_NAME
import static de.validas.nlx.constants.Neo4jConstants._NODE
import static de.validas.nlx.constants.Neo4jConstants._NAME
import static de.validas.nlx.dictionary.constants.NodeConstants._QUERY
import static de.validas.nlx.dictionary.constants.NodeConstants._WORD
import static de.validas.nlx.dictionary.PredicateConstants.AS_
import static de.validas.nlx.dictionary.PredicateConstants.DO_
import static de.validas.nlx.dictionary.PredicateConstants.ENDS_WITH_
import static de.validas.nlx.dictionary.PredicateConstants.ENTER_RULE_
import static de.validas.nlx.dictionary.PredicateConstants.EQUALS_
import static de.validas.nlx.dictionary.PredicateConstants.EXTENDS_
import static de.validas.nlx.dictionary.PredicateConstants.FIND_
import static de.validas.nlx.dictionary.PredicateConstants.GET_NAME_
import static de.validas.nlx.dictionary.PredicateConstants.GET_SOURCE_
import static de.validas.nlx.dictionary.PredicateConstants.GET_TARGET_
import static de.validas.nlx.dictionary.PredicateConstants.INSTANCE_OF_
import static de.validas.nlx.dictionary.PredicateConstants.IS_
import static de.validas.nlx.dictionary.PredicateConstants.LINK_INSTANCE_TO_
import static de.validas.nlx.dictionary.PredicateConstants.LINK_TO_
import static de.validas.nlx.dictionary.PredicateConstants.NEXT_
import static de.validas.nlx.dictionary.PredicateConstants.OF_
import static de.validas.nlx.dictionary.PredicateConstants.RESULT_
import static de.validas.nlx.dictionary.PredicateConstants.TARGET_
import static de.validas.nlx.dictionary.PredicateConstants.WITH_
import de.validas.nlx.ai.IPredicateFactory
import de.validas.nlx.ai.semantics.INode

class PredicateFactory implements IPredicateFactory {
	IDbAccess dbAccessor

	new(IDbAccess access) {
		this.dbAccessor = access
	}

	override create(RelationshipValue value, INode nodeStart, INode nodeEnd) {
		var rel = value.asRelationship()
		switch (rel.type.toLowerCase) {
			// TODO: igonore multible Lables for now
			case LINK_INSTANCE_TO_,
			case LINK_TO_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						var String type = relation.get(AS_.toString).asString().toLowerCase // TODO: null safe check
						return doLinkTo(type)
					}
				}
			}
			case IS_,
			case INSTANCE_OF_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						if (nodeStart instanceof ConditionNode && nodeEnd instanceof WordClassToken) {
							var word = (nodeStart as ConditionNode).chain.toString.toLowerCase
							return findTarget(nodeEnd, word)
						}
					}
				}
			}
			case EQUALS_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						if (nodeStart instanceof RuleToken && nodeEnd instanceof WordToken) {
							if ((nodeStart as RuleToken).chain.toString.equalsIgnoreCase((nodeEnd as WordToken).word))
								return nodeEnd
						}
						if (nodeStart instanceof RuleToken && nodeEnd instanceof ConditionNode) {
							(nodeEnd as ITokenNode).chain = (nodeStart as ITokenNode).getChain()
							return (nodeEnd as ConditionNode).solve()
						}
						null
					}
				}
			}
			case TARGET_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						if (nodeStart instanceof RuleToken && nodeEnd instanceof ConditionNode) {
							// TODO: redundant to above
							var match = (nodeStart as RuleToken).getChain()
							if (match === null) return null
							(nodeEnd as ConditionNode).setChain(match) // TODO: setMatch inconsistent with getAttribute Workflow - update
							return (nodeEnd as ConditionNode).solve()
						}
						null
					}
				}
			}
			case NEXT_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						if (nodeStart instanceof RuleToken && nodeEnd instanceof RuleToken) {
							var chain = (nodeStart as ITokenNode).getChain()
							if (!chain.hasNext || chain.assignTokenPointer(nodeEnd as ITokenNode, chain.getNextIndex) === null)
								return null
							return (nodeEnd as RuleToken).solve()
						}
						null
					}
				}
			}
			case DO_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						if (nodeStart instanceof ImplRuleNode && nodeEnd instanceof IActionNode) {
							nodeEnd.setAttribute(WITH_, (nodeStart as ImplRuleNode).getResult() as IDictNode)
							return nodeEnd.solve // return Error else null
						}
						if (nodeStart instanceof IActionNode && nodeEnd instanceof IActionNode) {
							nodeEnd.setAttribute(WITH_, nodeStart.getAttribute(WITH_))
							return nodeEnd.solve // return Error else null
						}
						null
					}
				}
			}
			case ENTER_RULE_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						if (nodeStart instanceof ImplRuleNode && nodeEnd instanceof RuleToken) {
							(nodeEnd as ITokenNode).chain = (nodeStart as ImplRuleNode).getChain()
							return (nodeEnd as RuleToken).solve
						}
						null
					}
				}
			}
			case EXTENDS_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						if (nodeStart instanceof RuleToken && nodeEnd instanceof RuleToken) {
							(nodeEnd as RuleToken).setChain = (nodeStart as RuleToken).getChain()
							nodeEnd.setFilter('''!«NEXT_», !«TARGET_»''')
							return (nodeEnd as RuleToken).solve
						}
						null
					}
				}
			}
			case GET_TARGET_,
			case GET_SOURCE_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						var INode value
						if (nodeEnd instanceof RuleToken) {
							value = nodeEnd.getAttribute(RESULT_) as INode
						}
						if (nodeEnd instanceof IActionNode || nodeEnd instanceof IObjectNode) {
							value = nodeEnd.getAttribute(WITH_) as INode
						}
						if (value !== null)
							nodeStart.setAttribute(relation.type.toLowerCase, value)
						null
					}
				}
			}
			case ENDS_WITH_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						// TODO: Safe Project 
						if (nodeStart instanceof ConditionNode && nodeEnd instanceof WordFragment) {
							var word = (nodeStart as ConditionNode).chain.toString.toLowerCase
							if (word.endsWith(nodeEnd.getAttribute(_ATTR_NAME) as String))
								return findWord(nodeEnd, word)
							else
								return null
						}
						null
					}
				}
			}
			case OF_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						if (nodeStart instanceof ActionObject) {
							nodeStart.setAttribute(relation.type.toLowerCase, nodeEnd)
							null
						}
					}
				}
			}
			case GET_NAME_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						nodeStart.setAttribute(GET_NAME_, nodeEnd.getAttribute(_ATTR_NAME))
						null
					}
				}
			}
//			"Match (n: Word {name:\"%1$s\"})-[]->(WordClass {name:\"%2$s\"}) \r\n" + 
//			"Match (t: Word)-[]->(WordClass {name:\"%2$s\"})\r\n" + 
//			"Where t.name = substring(n.name, 0,size(n.name)-%3$d)\r\n" + 
//			"MERGE (n)-[:plural]->(t)\r\n" + "return n,t",
			case FIND_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor) {
					override execute() {
						if (nodeStart instanceof IActionNode && nodeEnd instanceof IObjectNode) {
							var wordNode = nodeStart.getAttribute(WITH_) as INode
							if (wordNode === null)
								return null
							nodeEnd.solve()
							var generated = nodeEnd.getAttribute(_QUERY) as String
							if (generated !== null && !generated.isEmpty()) {
								var query = '''MATCH («_NODE»:«_WORD» {«_NAME»:"«(wordNode as WordToken).word»"})
«nodeEnd.getAttribute(_QUERY)»
return t'''
								//TODO: semantic unclear how to treat the result of Action Object found: where to store result
								nodeEnd.setAttribute(WITH_, executeQuery(query, nodeEnd.driver)) as INode
							}
						}
					}
				}
			}
//			case "Condition": {
//				attribute.get("type"):
//				new ConditionNode(node, dbAccessor)
//			}
		// TODO: ... other future NoteTypes
		}
	}
}
