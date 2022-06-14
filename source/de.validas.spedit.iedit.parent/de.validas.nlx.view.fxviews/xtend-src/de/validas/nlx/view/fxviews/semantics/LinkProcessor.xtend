/**
 * Link Processor Class. Queries Database for Link rules or creates new rules
 * (c) 2020 felixschaller.com and sub brands
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * www.felixschaller.com
 * @author Felix Schaller
 */

package de.validas.nlx.view.fxviews.semantics

import de.validas.nlx.ai.neo4j.Neo4jAccess.Action
import de.validas.nlx.ai.util.Arrow
import de.validas.nlx.ai.util.NodeUtil
import de.validas.nlx.constants.Direction
import de.validas.nlx.dictionary.IDictionaryAccess
import de.validas.nlx.dictionary.type.ITypeAttributes
import de.validas.nlx.dictionary.type.InterpunctionTypeAttribute
import de.validas.nlx.view.fxviews.access.WordPanelAccessor
import de.validas.nlx.view.fxviews.access.elements.ContainerItem
import de.validas.nlx.view.fxviews.access.elements.KommaItem
import de.validas.nlx.view.fxviews.access.elements.SeparatorItem
import de.validas.nlx.view.fxviews.access.elements.SmallItem
import de.validas.nlx.view.fxviews.cache.CachedDeadLink
import de.validas.nlx.view.fxviews.cache.CachedLink
import de.validas.nlx.view.fxviews.cache.CachedNode
import de.validas.nlx.view.fxviews.cache.ICacheObj
import de.validas.nlx.view.fxviews.cache.INodeCacheManager
import de.validas.nlx.view.fxviews.semantics.util.LinkUtils
import de.validas.nlx.view.fxviews.visual.IPanel
import de.validas.spedit.presets.NlxDictConstants
import de.validas.utils.data.types.XPair
import java.util.HashMap
import java.util.List
import java.util.Set
import java.util.stream.Collectors
import org.neo4j.driver.v1.Record
import org.neo4j.driver.v1.types.Node
import static de.validas.nlx.constants.Neo4jConstants.*
import static de.validas.nlx.dictionary.constants.DictionaryConstants._EXCLUDES
import static de.validas.nlx.dictionary.constants.NodeConstants._TYPE
import static de.validas.nlx.dictionary.constants.NodeConstants._WORD
import static de.validas.nlx.dictionary.constants.NodeConstants._WORD_CLASS
import static de.validas.nlx.dictionary.constants.NodeConstants.GRAMMAR_CLUSTER_
import static de.validas.nlx.dictionary.constants.NodeConstants.GRAMMAR_LINK_
import static de.validas.nlx.dictionary.constants.NodeConstants._OF_CLASS
import static de.validas.nlx.view.fxviews.semantics.constants.GrammarConstants.*
import java.util.Map
import de.validas.nlx.view.fxviews.semantics.types.ICardinalLinkable
import java.util.ArrayList
import de.validas.nlx.view.fxviews.semantics.types.InterpunctionType
import org.neo4j.driver.v1.Records

/**
 * LinkProcessor solves the the semantics in the panelChain. it communicates with the database 
 * to resolve sentence structure or trains new patterns.
 * 
 * TODO: currently an functional approach. Consider to implement these functionalities & behavior inside the panel nodes itself.
 *   
 */
class LinkProcessor {
	protected val String[] wordDefault = #["None"]
	protected val String[] allGrammarAttrs = #[_MID, _IN_BOX, _OUT_BOX]
	protected val String[] wordTArray = wordDefault + NlxDictConstants.getAllTypes() // TODO: replace by getAllTypesWNone
	protected val List<String> wordTypes = wordTArray
	protected IDictionaryAccess dictAccess
	protected SemanticLinker semanticLinker
	protected INodeCacheManager cacheManager
	boolean useCache = false

	// cache turned off
	new(IDictionaryAccess dictAccess, SemanticLinker linker, INodeCacheManager manager) {
		this.dictAccess = dictAccess
		semanticLinker = linker
		cacheManager = manager
	}

	/**
	 * resolves the Grammar tree for the sentence 
	 */
	def List<XPair<ILinkable, Boolean>> evaluateNext(ILinkable source) {
		//TODO: 03.06.2022 Test why evaluateNext returns semantic Links with same ID twice
		var attributes = newHashMap
		var boolean resolved = false;
		var Set<XPair<ILinkable, Boolean>> destinations = null;
		var internalSource = source
		if (dictAccess.dbAccessor === null) // no database
			return null
		if (internalSource instanceof ILinkObj) {
			while (internalSource.token instanceof SmallItem) {
				if (internalSource.successor !== null)
					internalSource = internalSource.successor as ILinkObj
				else // TODO: should not be neccesary:
					return #[new XPair(null, resolved)] // EOL
			}
		}
		var successor = LinkUtils.findNextAdjacentPanel(internalSource, true).successor
		if (successor !== null) { // find out if successor is part of higher order??
		// TDOD: solve Hierarchy of grammar links like bracket sentence shall go for higher order links first 
			var ILinkObj internalSuccessor = successor as ILinkObj
			while (internalSuccessor.token instanceof SmallItem) {
				var token = (internalSuccessor as ILinkObj).token
				switch token {
					KommaItem | SeparatorItem: {
						if (!attributes.containsKey(_MID)) {
							attributes.put(_MID, new Intermediate(token.internalType, token.element))
						}
					}
					default: { // full stop or end bracket
						if (internalSource instanceof ILink)
							return #[new XPair(internalSource, true)] // precessors have links
						else
							return #[new XPair(internalSource, false)] // no links
					}
				}
				if (internalSuccessor.successor !== null)
					internalSuccessor = internalSuccessor.successor as ILinkObj
				else // TODO: should be not necessary 
					return #[new XPair(null, resolved)] // EOL
			}
			if (destinations === null)
				destinations = newHashSet
			var types = internalSuccessor.links
			var List<ILink> links = null
			if (types !== null) {
				links = types.values.stream().flatMap(x|x.stream()).collect(Collectors.toList());
			}
			if (links !== null && !links.empty) { // successor has already links
			// links.forEach[k,v | v.forall[l| LinkUtils.traceRoot(l as ILinkable)]]
				for (root : LinkUtils.traceAllRoots(internalSuccessor as ILinkable, 0, false)) {
					var overlap = LinkUtils.findNextAdjacentPanel(root.value, false)
					if (overlap.index >= internalSuccessor.index) // TODO: 14.03.22 recurse up as long links overlap
						destinations.addAllExcl(evaluateNext(root.value))
				}
			} else
				destinations.addAllExcl(evaluateNext(internalSuccessor as ILinkable))
			var found = false
			for (dest : destinations)
				if (dest.key.equals(internalSuccessor))
					found = true
			if (!found)
				destinations.addExcl(new XPair(internalSuccessor, false)) // use node or link to other as solution
		} else
			return #[new XPair(internalSource, true)]
		if (destinations !== null && !destinations.empty) {
			var List<XPair<ILinkable, Boolean>> results = newArrayList()
			for (dest : destinations) {
				var result = findLink(internalSource, dest.key, attributes)
				if (result !== null)
					results.addAll(result)
			}
			if (results !== null && !results.empty) return results // found higher priority rule	
		}
		#[new XPair(internalSource, false)]
	}
	
	/**
	 * Extension Method, avoid double subentries in Set 
	 */
	def void addExcl(Set<XPair<ILinkable, Boolean>> set, XPair<ILinkable, Boolean> pair){
		var found = false;
		for (el : set){
			if (el.key == pair.key)
				found = true
		}
		if (!found)
			set.add(pair);
	}
	
	/**
	 * Extension Method, avoid double subentries in Set from List
	 */
	def void addAllExcl(Set<XPair<ILinkable, Boolean>> set, List<XPair<ILinkable, Boolean>> pairs){
		for (pair : pairs){
			set.addExcl(pair)
		}
		
	}

	/**
	 * make postprocess
	 */
	def postProcess(ILinkObj linkable) {
		var successor = linkable.successor as ILinkObj
		// TODO: 09.08.21 only postprocess if word has no attributes (followed by)
		if (linkable.getTypes !== null && !linkable.getTypes.empty) {
			var token = successor?.token  //TODO: 13.04.22 actually postprocess should not be resolved in the sucessor
			if (token !== null) {
				var List<ITypeAttributes> attribs = newArrayList()
				if (token !== null)
					token.postProcess(linkable, attribs)
				else
					linkable.token.postProcess(null, attribs) // last token in chain has no successor
			}
		}
	}

	def List<XPair<ILinkable, Boolean>> findLink(ILinkable first, ILinkable second, HashMap<String, Intermediate> attributes) {
		var c_Result = if (useCache) findInCache(first, second, attributes) else #[]
		if (!c_Result.isEmpty) {
			var records = newArrayList()
			for (entry : c_Result)
				records.add(entry.record)
			return recordToLink(records, first, second, attributes, _LINK)
		} else {
			var firstQ = generateQuery(first, _SOURCE, null, true)
			var secondQ = generateQuery(second, _TARGET, null, false)
			if (firstQ === null || secondQ === null)
				return null
			if (firstQ.value !== null) attributes.put(_OUT_BOX, firstQ.value)
			if (secondQ.value !== null) attributes.put(_IN_BOX, secondQ.value)
			var nonAttr = newArrayList(allGrammarAttrs)
			nonAttr.removeAll(attributes.keySet)
			var attrs = generateLinkType(attributes)
			var query = '''«firstQ.key»
«secondQ.key»
MATCH («_SOURCE»)-[:«GRAMMAR_LINK_» {«_TYPE»:"«_FIRST»"}]-(«_LINK»:«GRAMMAR_CLUSTER_»«IF (attrs !== null && attrs.length > 0)
			» {«attrs»}«ENDIF»)-[:«GRAMMAR_LINK_» {«_TYPE»:"«_SECOND»"}]-(«_TARGET») WHERE NOT («FOR attr : nonAttr SEPARATOR ' OR '»exists(«_LINK».«attr»)«ENDFOR»)
CALL apoc.when(«_SOURCE»<>«_TARGET», 
 "MATCH («_LINK») WHERE NOT ((«_LINK»)<-[:«GRAMMAR_LINK_»  {«_TYPE»:'«_FIRST»'}]-(«_TARGET»)) RETURN «_LINK»", "MATCH («_LINK») RETURN «_LINK»", {«_LINK»:«_LINK», «_TARGET»:«_TARGET», «_SOURCE»:«_SOURCE»}) YIELD «_VALUE»
WITH «_VALUE».«_LINK» AS «_LINK», «_SOURCE» AS «_SOURCE», «_TARGET» AS «_TARGET»
OPTIONAL MATCH «_P» = («_LINK»)«new Arrow(_E,_EXCLUDES,null,null,null,true,true, Direction.RIGHT).generate»(«_A»)
OPTIONAL MATCH («_A»)«new Arrow(_L, null, Direction.RIGHT).generate»(«_B») WHERE NOT type(«_L») = "«_EXCLUDES»"
RETURN «_SOURCE», «_LINK», «_TARGET», «_A», «_P», COLLECT ({«_LK»:{«_LI»: ID(«_L»), «_LL»:type(«_L»), «_LA»:«_L»}, «_ND»:{«_NI»: ID(«_B»), «_NL»:labels(«_B»), «_NA»: «_B»}}) as «_ATTR»'''
			var List<Record> result = dictAccess.dbAccessor.runCodeRecords(query, Action.READ)
			if (useCache) addToCache(result, first, second, attrs)
			return recordToLink(result, first, second, attributes, _LINK)
		}
	}

	protected def extractFromRec(List<Record> records, String varName, boolean not_empty, ILinkable token) {
		var typelabel = ""
		var Node node = null
		var nodes = newArrayList()
		if (not_empty) {
			for (rec : records) {
				node = rec.get(varName).asNode()
				typelabel = node.get(_NAME).asString
				nodes.add(cacheManager.addNode(typelabel, node.labels.get(0), rec, varName))
			}
			return nodes
		} else {
			return nodeToTypes(token, false)
		}
	}

	protected def nodeToTypes(ILinkable node, boolean useCache) {
		var result = newArrayList()
		var types = node.types
		if (types === null)
			return result
		if (useCache)
			for (type : types) { // TODO: add container detection
				var cachedT = cacheManager.getNodeByName(type.key)
				if (cachedT !== null)
					result.add(cachedT)
			}
		else
			for (typelabel : types) { // TODO: add container detection
				result.add(cacheManager.addNode(typelabel.key, "", null, ""))
			}
		result
	}

	protected def addToCache(List<Record> records, ILinkable first, ILinkable second, String attrs) {
		var not_empty = records !== null && !records.isEmpty
		var firstNodes = extractFromRec(records, _SOURCE, not_empty, first)
		var secondNodes = extractFromRec(records, _TARGET, not_empty, second)
		for (firstNode : firstNodes) {
			for (secondNode : secondNodes) {
				var ICacheObj link = null
				if (not_empty) {
					for (rec : records) {
						link = new CachedLink(firstNode, secondNode, attrs, rec, _LINK)
						firstNode.outLink = link
						secondNode.inLink = link
					}
				} else {
					link = new CachedDeadLink(firstNode, secondNode)
					firstNode.outLink = link
					secondNode.inLink = link
				}
			}
		}
	}

	protected def findInCache(ILinkable first, ILinkable second, HashMap<String, Intermediate> attributes) {
		var firstNodes = nodeToTypes(first, true)
		var secondNodes = nodeToTypes(second, true)
		addGrammarAttrib(first, _OUT_BOX, attributes)
		addGrammarAttrib(second, _IN_BOX, attributes)
		var attrs = generateLinkType(attributes)
		var result = newArrayList()
		if (!(firstNodes.isEmpty || secondNodes.isEmpty)) {
			for (firstNode : firstNodes)
				for (secondNode : secondNodes) {
					var link = (firstNode as CachedNode).hasLinkTo(secondNode, attrs)
					if (link !== null)
						result.add(link)
				}
		}
		return result
	}

	def addGrammarAttrib(ILinkable linkable, String channel, HashMap<String, Intermediate> map) {
		if (linkable instanceof ILinkContainer)
			map.put(channel, new Intermediate(linkable))
	}

	protected def removeFromCache(ILinkable first, ILinkable second) {
		var firstNodes = nodeToTypes(first, true)
		var secondNodes = nodeToTypes(second, true)
		if (!(firstNodes.isEmpty || secondNodes.isEmpty)) {
			for (firstNode : firstNodes)
				for (secondNode : secondNodes) {
					(firstNode as CachedNode).removeLinkTo(secondNode)
				}
		}
	}

	def List<XPair<ILinkable, Boolean>> createLink(ILinkable first, ILinkable second, Intermediate intermediate) {
		if (useCache) removeFromCache(first, second)
		var types = #{_FIRST -> LinkUtils.getLinkHigherType(first).key, _SECOND -> LinkUtils.getLinkHigherType(second).key}
		val Pair<CharSequence, Intermediate> firstQ = generateQuery(first, _SOURCE, types.get(_FIRST), true)
		val Pair<CharSequence, Intermediate> secondQ = generateQuery(second, _TARGET, types.get(_SECOND), false)
		if (firstQ === null || secondQ === null)
			return null
		// TODO: assign Crammar Node to Subclass
		var attributes = newHashMap
		if (intermediate !== null) attributes.put(_MID, intermediate)
		if (firstQ.value !== null) attributes.put(_OUT_BOX, firstQ.value)
		if (secondQ.value !== null) attributes.put(_IN_BOX, secondQ.value)
		var attrs = generateLinkType(attributes)
		var nonAttr = newArrayList(allGrammarAttrs)
		nonAttr.removeAll(attributes.keySet)
		var node = grammarExistOrCreate('''«IF first instanceof ILink
				»(«types.get(_FIRST)»)«ELSE»«types.get(_FIRST)»«ENDIF»«ARROW_»«IF second instanceof ILink
				»(«types.get(_SECOND)»)«ELSE»«types.get(_SECOND)»«ENDIF»''', attrs, _NODE, nonAttr, true)
		if (node === null)
			return null
		// TODO: replace with code generator
		var query = '''«firstQ.key»
«secondQ.key»
MATCH («_LINK»:«GRAMMAR_CLUSTER_») WHERE ID(«_LINK») = «node.id»
MERGE («_SOURCE»)-[:«GRAMMAR_LINK_» {«_TYPE»:"«FIRST_»"}]->(«_LINK»)<-[:«GRAMMAR_LINK_» {«_TYPE»:"«SECOND_»"}]-(«_TARGET»)
RETURN «_SOURCE», «_TARGET», «_LINK»'''
		var result = dictAccess.dbAccessor.runCodeRecords(query, Action.WRITE)
		if (useCache) addToCache(result, first, second, attrs)
		return recordToLink(result, first, second, attributes, _LINK)
	}

	protected def generateLinkType(HashMap<String, Intermediate> map) {
		// var attrs = #[_MID, _IN_BOX, _OUT_BOX]
		var sequence = ''''''
		if (!map.empty) {
			var first = true
			for (attr : map.keySet) {
				var result = map.get(attr).generate(attr)
				if (result !== null) {
					if (!first) {
						sequence += ", "
					}
					sequence += result
					first = false
				}
			}
		}
		return sequence
	}

	protected def recordToLink(List<Record> records, ILinkable first, ILinkable second, Map<? extends String, ? extends Object> intermediate, String varName) {
		var List<XPair<ILinkable, Boolean>> result
		if (records !== null && !records.isEmpty) {
			if (records.get(0) === null)
				return null
			
			var recMap = new HashMap<Long, List<Record>>();
			for (rec : records) {
				var link = rec.get(_LINK).asNode()
				if (link != null){
					var map = recMap.get(link.id)
					if (map == null){
						map = newArrayList()
						recMap.put(link.id, map)
					}
					map.add(rec)	
				}
			}
			for (id : recMap.keySet) {
				semanticLinker.makeLink(first, second, intermediate, recMap.get(id));

				for (link : first.link) {
					if (result === null)
						result = newArrayList

					var value = evaluateNext(link) //and resolve higher below
					if (value !== null && !value.empty){
						result.addAll(value)
					}
					var selfLink = new XPair(link as ILinkable, false)
					
					if (!result.map[e | e.key].contains(selfLink.key))  // doulbe check. should not be neccesary on sets
						result.add(selfLink) // add current
				}
			}
		}
		return result
	}

	protected def Pair<CharSequence, Intermediate> generateQuery(ILinkable linkable, String varName, String type, boolean allowCardinal) {
		switch (linkable) {
			ILinkContainer: {
				var inner = linkable.allInnerLinks ?: #[]
				if (inner !== null && !inner.empty) {
					var innerFirst = inner.get(0)
					if ((linkable.token as ContainerItem).panelsAccessor instanceof WordPanelAccessor) {
						var label = ''
						if (innerFirst instanceof ILink)
							label = GRAMMAR_CLUSTER_
						else if (innerFirst instanceof ILinkObj) { // TODO: 12.05.21 should not be possible with multible words in container!!
							label = _WORD
						} else
							return null
						return new Pair<CharSequence, Intermediate>('''MATCH («varName»:«label») WHERE «FOR innerL : inner SEPARATOR ' OR '»ID(«varName») = «((innerL as ILink).linkInfo.getRecord(_LINK) as Node).id»«ENDFOR»''',
							new Intermediate(linkable))
					} else {
						var Node family = NodeUtil.nodeExistOrCreate(dictAccess.dbAccessor, '''«varName»:«PARAGRAPH_»{«_NAME»:"«PLAIN_»"}''', varName, #[], false)
						var Node node = NodeUtil.nodeExistOrCreate(dictAccess.dbAccessor, '''«varName»:«SENTENCE_CLASS_»{«_NAME»:"«linkable.linkType.name»"}''', varName, #[], false)
						NodeUtil.connectionExistOrCreate(dictAccess.dbAccessor, family, new Arrow(_LINK, _OF_CLASS, Direction.LEFT), node)
						new Pair<CharSequence, Intermediate>('''MATCH («varName»:«SENTENCE_CLASS_») WHERE ID(«varName») = «node.id»''', new Intermediate(linkable))
					}
				} else
					null
			}
			IPanel: {
				new Pair<CharSequence, Intermediate>('''MATCH (:«_WORD» {«_NAME»:"«linkable.token.name.toLowerCase»"})-[:«_OF_CLASS»]->(«varName»«IF (type !== null && type.length > 0)»: «_WORD_CLASS» {«_NAME»:"«type»"}«ENDIF»)''',
					null)
			}
			ILink: {
				if (linkable.hasCardinalType && allowCardinal) {
					return generateQuery(linkable.cardinalType, varName, null, allowCardinal)
				}
				new Pair<CharSequence, Intermediate>('''MATCH («varName»:«GRAMMAR_CLUSTER_») WHERE ID(«varName») = «((linkable as ILink).linkInfo.getRecord(_LINK) as Node).id»''', null)
			}
			ICardinalLinkable: {
				return generateQuery(linkable.start.value, varName, null, allowCardinal) // TODO: 17.03.22 Should look for WordClass instead of Word. But works anyway provisionally 
			}
			default: {
				null
			}
		}
	}

	protected def Node grammarExistOrCreate(String nodeName, String attrs, String varName, List<String> exclude, boolean fail) {
		var subQuery = '''«varName»:«GRAMMAR_CLUSTER_»{«_NAME»:"«nodeName»" «IF (attrs!== null && attrs.length > 0)», «attrs»«ENDIF»}'''
		NodeUtil.nodeExistOrCreate(dictAccess.dbAccessor, subQuery, varName, exclude, fail);
	}
}
