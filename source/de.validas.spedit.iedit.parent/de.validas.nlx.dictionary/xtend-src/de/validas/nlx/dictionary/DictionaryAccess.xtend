/**
 * This class does most of the tasks in the dictionary
 * 
 * @author: schaller
 * all Rights reserved (c) felixschaller.com
 */

package de.validas.nlx.dictionary

import com.google.inject.Inject
import com.google.inject.Singleton
import de.validas.nlx.ai.IDbAccess
import de.validas.nlx.ai.neo4j.Neo4jAccess.Action
import de.validas.nlx.ai.util.Arrow
import de.validas.nlx.ai.util.NodeUtil
import de.validas.nlx.constants.Direction
import de.validas.nlx.dictionary.type.ITypeAttributes
import de.validas.nlx.dictionary.type.ITypeHierarchy
import de.validas.nlx.dictionary.type.InterpunctionTypeAttribute
import de.validas.nlx.dictionary.type.TypeAttributes
import de.validas.nlx.dictionary.type.TypeHierarchy
import de.validas.nlx.dictionary.util.ILogUtils
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
import java.util.stream.Collectors
import org.eclipse.xtext.builder.debug.IBuildLogger
import org.neo4j.driver.internal.value.ListValue
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.internal.value.NullValue
import org.neo4j.driver.internal.value.RelationshipValue
import org.neo4j.driver.v1.Record
import org.neo4j.driver.v1.Value
import org.neo4j.driver.v1.exceptions.ClientException
import org.neo4j.driver.v1.types.Node
import org.neo4j.driver.v1.types.Relationship
import static de.validas.nlx.constants.Neo4jConstants._A
import static de.validas.nlx.constants.Neo4jConstants._ATTR
import static de.validas.nlx.constants.Neo4jConstants._ATTRS
import static de.validas.nlx.constants.Neo4jConstants._B
import static de.validas.nlx.constants.Neo4jConstants._F
import static de.validas.nlx.constants.Neo4jConstants._G
import static de.validas.nlx.constants.Neo4jConstants._H
import static de.validas.nlx.constants.Neo4jConstants._CL
import static de.validas.nlx.constants.Neo4jConstants._E
import static de.validas.nlx.constants.Neo4jConstants._HIT
import static de.validas.nlx.constants.Neo4jConstants._L
import static de.validas.nlx.constants.Neo4jConstants._L2
import static de.validas.nlx.constants.Neo4jConstants._LK
import static de.validas.nlx.constants.Neo4jConstants._LS
import static de.validas.nlx.constants.Neo4jConstants._N
import static de.validas.nlx.constants.Neo4jConstants._P
import static de.validas.nlx.constants.Neo4jConstants._IT
import static de.validas.nlx.constants.Neo4jConstants._X
import static de.validas.nlx.constants.Neo4jConstants._INDEX
import static de.validas.nlx.constants.Neo4jConstants._NAME
import static de.validas.nlx.constants.Neo4jConstants._OF_CLASS
import static de.validas.nlx.constants.Neo4jConstants._R
import static de.validas.nlx.constants.Neo4jConstants._S
import static de.validas.nlx.constants.Neo4jConstants._SC
import static de.validas.nlx.constants.Neo4jConstants._SOURCE
import static de.validas.nlx.constants.Neo4jConstants._SUBCLASS_OF
import static de.validas.nlx.constants.Neo4jConstants._T
import static de.validas.nlx.constants.Neo4jConstants._VALUE
import static de.validas.nlx.constants.Neo4jConstants._ID

import static de.validas.nlx.dictionary.constants.DictionaryConstants.*
import static de.validas.nlx.dictionary.constants.NodeConstants.*
import de.validas.nlx.dictionary.type.ITypeAttributes
import de.validas.utils.data.types.XPair
import com.google.common.collect.Iterables
import de.validas.nlx.dictionary.constants.DictionaryConstants
import org.eclipse.xtend2.lib.StringConcatenation
import com.google.common.base.Objects
import org.neo4j.driver.internal.value.PathValue
import java.util.ArrayList
import static de.validas.nlx.dictionary.constants.NodeConstants._WORD
import de.validas.nlx.dictionary.type.WordTypeInfo
import de.validas.nlx.dictionary.type.ITypeInfo

@Singleton
class DictionaryAccess implements IDictionaryAccess {
	
	protected val cutoff = SUFFIX_.length()
	protected val prefixes = newHashSet(PREFIX_CONST_.split(" "))
	protected val suffixes = newHashSet(SUFFIX_CONST_.split(" "))
	protected val singularPlural = newHashMap(SINGULAR_PLURAL_.split(" ").flatMap [ e |
		var String[] pairs = e.split("->")
		return #{pairs.get(0) -> pairs.get(1)}
	])
	protected val comparatives = #[_COMPARATIVE_SUFFIX -> null, _COMPARATIVE_SUFFIX -> _E]
	protected val superlatives = #[_SUPERLATIVE_SUFFIX -> null, _SUPERLATIVE_SUFFIX -> _E]
	protected var IDbAccess dbAccessor
	//protected var HashMap<String, String> wordCache
	protected var HashMap<String, String> unknownWordCache
	protected var boolean isConnected = false
	protected var HashMap<String, ITypeInfo> typeCache
	@Inject
	protected IBuildLogger buildLogger;
	@Inject
	protected var ILogUtils logUtil
	val List<String> filter = #[_HIT, _NAME]
	val List<String> nodeFilter = #[_WORD, _WORD_CLASS, _TENSE, GRAMMAR_CLUSTER_, _GRAMMAR, _SUFFIX, _INTERPUNCTION]
	
	val typeCase = #{
			_WORD -> [String n | n.toLowerCase],
			_INTERPUNCTION -> [String n | n.toUpperCase]
		}

	/**
	 * constructor needs Logger and DatabaseInterface
	 */
	@Inject
	new(IDbAccess dbAccessor, ILogUtils logUtil) {
		// this.logUtil = new LogUtils(buildLogger)
		this.logUtil = logUtil;
		if (dbAccessor.isConnected)
			this.dbAccessor = dbAccessor
		//this.wordCache = new HashMap<String, String>()
		this.typeCache = newHashMap()
		this.unknownWordCache = new HashMap<String, String>()
	}

	/**
	 * @return the dbAccessor
	 */
	override getDbAccessor() {
		return dbAccessor
	}

	/**
	 * simple plural with just suffix extension w.o. replacement.
	 * @Deprecated
	 * @param word
	 * @param suffix
	 * @return
	 */
	protected def pluralToSingular(String word, String suffix, String type, String rel, boolean inverse) {
		val direction = #{false -> Direction.LEFT, true -> Direction.RIGHT}
		return findSiblingAndMerge(word, null, _S, direction.get(inverse), rel, type, type)
	}

	/**
	 * simple plural with just suffix extension w.o. replacement.
	 * @Deprecated
	 * @param word
	 * @param suffix
	 * @return
	 */
	protected def singularToPlural(String word, String suffix, String type, String rel, boolean inverse) {
		val direction = #{false -> Direction.RIGHT, true -> Direction.LEFT}
		return findSiblingAndMerge(word, _S, null, direction.get(inverse), rel, type, type)
	}

	/**
	 *  create relation to relative member
	 */
	protected def findSiblingAndMerge(String wordToLc, String replSuffix, String suffix, Direction direction, String edgeType, String sourceType, String targetType) {
		if (suffix !== null && !wordToLc.endsWith(suffix))
			return null
		if (replSuffix === null && suffix === null)
			return null
		var arrow = new Arrow(null, null, Direction.RIGHT)
		var baselen = 0
		if (suffix !== null)
			baselen = wordToLc.length - suffix.length
		else
			baselen = wordToLc.length
		var String base = wordToLc.substring(0, baselen)
		// val directions = #{Direction.RIGHT -> '''-[:«edgeType»]->''', Direction.LEFT -> '''<-[:«edgeType»]-'''}
		val target = #{Direction.RIGHT -> '''(«_T»)''', Direction.LEFT -> '''(«_N»)'''}
		val query = '''MATCH («_N»: «_WORD» {«_NAME»:"«wordToLc»"})«arrow.generate»(«_WORD_CLASS» {«_NAME»:"«sourceType»"})
MATCH («_T»: «_WORD» {«_NAME»:"«base»«IF replSuffix!== null»«replSuffix»«ENDIF»"})«arrow.generate»(«_WORD_CLASS» {«_NAME»:"«targetType»"})
MERGE («_G»: «_GRAMMAR» {«_NAME»:"«edgeType»"})
MERGE («_N»)«new Arrow(null,edgeType,direction).generate»(«_T»)
MERGE «target.get(direction)»«new Arrow(null,_FORM,Direction.RIGHT).generate»(«_G»)
RETURN «_N», «_T», «_G»'''
		dbAccessor.runCodeRecords(query, Action.WRITE)
	}

	/** 
	 * Wrapper to assign plural to Singular
	 */
	protected def singularToPluralRepl(String wordToLc, String replSuffix, String suffix, String type, String rel, boolean inverse) {
		val direction = #{false -> Direction.RIGHT, true -> Direction.LEFT}
		return findSiblingAndMerge(wordToLc, replSuffix, suffix, direction.get(inverse), rel, type, type)
	}

	/**
	 * Wrapper to assign singular to plural 
	 */
	protected def pluralToSingularRepl(String wordToLc, String replSuffix, String suffix, String type, String rel, boolean inverse) {
		val direction = #{false -> Direction.LEFT, true -> Direction.RIGHT}
		return findSiblingAndMerge(
			wordToLc,
			replSuffix,
			suffix,
			direction.get(inverse),
			rel,
			type,
			type
		)
	}

	/**
	 * Provisional: should be replaced by implicit Rules in the Future 
	 */
	@Deprecated
	protected def continuousToRegular(String word) {
		var result = newArrayList
		if (word.endsWith(SUFFIX_)) {
			result.addAll(findSiblingAndMerge(word, null, SUFFIX_, Direction.LEFT, CONTINUOUS_, VERB_, VERB_) ?: #[])
			result.addAll(findSiblingAndMerge(word, _E, SUFFIX_, Direction.LEFT, CONTINUOUS_, VERB_, VERB_) ?: #[])
		} else {
			result.addAll(findSiblingAndMerge(word, SUFFIX_, null, Direction.RIGHT, CONTINUOUS_, VERB_, VERB_) ?: #[])
			result.addAll(findSiblingAndMerge(word, SUFFIX_, _E, Direction.RIGHT, CONTINUOUS_, VERB_, VERB_) ?: #[])
		}
		logResult(result, "Verb | continuous", "Continuous to Regular", word)
	// findSiblingAndMerge(String wordToLc, String replSuffix, String suffix, Direction direction, String edgeType, String sourceType, String targetType)
//		// TODO: replace errors by error class 
//		var result = dbAccessor.runCodeRecords('''MATCH («_N» {«_NAME»: "«word»"}) WHERE «_N».«_NAME» ENDS WITH "«SUFFIX_»"
//MATCH («_T»:«_WORD») WHERE «_T».«_NAME» = «SUBSTRING_»(«_N».«_NAME», 0,size(«_N».«_NAME»)-«cutoff») AND «_T».«_NAME» =~ "«REGEX_»"
//MERGE («_T»)-[:«CONTINUOUS_»]->(«_N»)
//RETURN «_T»,«_N»''', Action.WRITE)
//		if (result !== null && !result.empty)
//			// TODO: replace by logger
//			logUtil.logAccess("Warning", 0, "Continuous to Regular:" + word)
//		else
//			// TODO: replace by logger
//			logUtil.logAccess("Warning", 0, "No Continuous Counterpart:" + word)
	}

	/**
	 * Assign a new Word Type to a Word 
	 */
	override addTypeToWord(String word, String type) {
		// Do not check for connection, because method is used in contexts, where dictionary must exist
		// Context should not allow to add same type twice
		// TODO: replace relationships by error class
		// Removed: '''WHERE NOT (type(«_L»)="«_OF_CLASS»")'''
		var wordToLc = word.toLowerCase()
		var query = '''MATCH («_M»:«_WORD» {«_NAME»:"«wordToLc»"})-[«_L»]-(«_W»)
MATCH («_N»:«_WORD_CLASS» {«_NAME»:"«type»"})
MERGE («_M»)-[«_L2»:«_OF_CLASS»]->(«_N») 
RETURN type(«_L2»), «_L», «_W», «_M», «_N»'''
		var result = dbAccessor.runCodeRecords(query, Action.WRITE)
		if (result !== null && !result.isEmpty) {
			var newType = new TypeAttributes(getNode(result.get(0).get(_N)), #[result.get(0).get(_L).asRelationship], getNode(result.get(0).get(_M)), getNode(result.get(0).get(_W)))
			var types = newHashMap
			types.put(type, newType)
			addToWordCache(word, type, new WordTypeInfo(getNode(result.get(0).get(_M)), types))
			return newType
		}
		null
	}
	
	def void addToWordCache(String word, String type, ITypeInfo info) {
		
		if (typeCache.containsKey(word)) {
			var typeMap = newHashMap
			for (typ : info.types)
				typeMap.put(typ.key, typ.value)
			typeCache.get(word).addTypes(typeMap)
		} else if (unknownWordCache.containsKey(word)) { // TODO:[12.07.21] untested 
			typeCache.put(word, info)
			unknownWordCache.remove(word)
		}
	}

	/**
	 *  Postprocess function that creates relationships to prefixes and common relatives
	 */
	def List<Record> findPrefix(String word, List<String> prefixes, int tol, boolean linkIt) {
//UNWIND ["inter", "pro", "un", "de"] AS ls
//MATCH (n:Word) WHERE n.name STARTS WITH ls AND size(n.name) > size(ls) + 1
//WITH *, substring(n.name, size(ls), size(n.name)) AS nx
//MATCH (t:Word) WHERE size(t.name) > size(ls) AND size(t.name) < size(n.name)
//WITH *, t.name AS tx WHERE nx = tx
//return n,t, nx, tx, ls
		var action = Action.READ
		if (linkIt)
			action = Action.WRITE
		var query = '''UNWIND [«FOR postfix : prefixes SEPARATOR ", "»"«postfix»"«ENDFOR»] AS «_LS»
		MATCH («_N»:«_WORD» {«_NAME»:"«word»"}) WHERE «_N».«_NAME» STARTS WITH «_LS» AND size(«_N».«_NAME») > size(«_LS») + «tol»
		WITH *, substring(«_N».«_NAME», size(«_LS»), size(«_N».«_NAME»)) AS «_NX»
		MATCH («_T»:«_WORD») WHERE size(«_T».«_NAME») > size(«_LS») AND size(«_T».«_NAME») < size(«_N».«_NAME»)
		WITH *, «_T».«_NAME» AS «_TX» WHERE «_NX» = «_TX»
		«IF (linkIt)»
		MERGE («_S»:«_PREFIX» {«_NAME»:«_LS»})
		MERGE («_N»)«new Arrow(_L, _PREFIXED, #{_NAME -> _LS}, false, Direction.RIGHT).generate()»(«_T»)
		MERGE («_N»)«new Arrow(_L2, _STARTS_WITH, null, false, Direction.RIGHT).generate()»(«_S»)
		RETURN «_L», «_L2», «_S»,«ELSE»
		RETURN«ENDIF» «_N», «_T», «_NX», «_TX», «_LS»'''
		var result = dbAccessor.runCodeRecords(query, action)
		return result
//		null
	}

	/**
	 *  Postprocess function that creates relationships to suffixes and common relatives and 
	 *  adds transitions between common prefixes and relatives
	 */
	def List<Record> findPostfixRelative(String word, List<String> postfixes, int tol, boolean isPostfix, boolean linkIt) {
//		print(''' >> 
//[DictAccess: findPostfixRelative] Word: «word», Suffix: «postfixes», isPostfix «isPostfix»''')
		var len = word.length
		var action = Action.READ
		if (linkIt)
			action = Action.WRITE
		var query = '''UNWIND [«FOR postfix : postfixes SEPARATOR ", "»"«postfix»"«ENDFOR»] AS «_LS»
MATCH («_N»:«_WORD»«IF isPostfix
			» {«_NAME»:"«word»"})«ELSE») WHERE «_N».«_NAME» ENDS WITH «_LS» AND size(«_N».«_NAME») > size(«_LS») + «tol»«ENDIF»
«IF tol > 0 
			»WITH *, substring(«_N».«_NAME», 0, size(«_N».«_NAME») - size(«_LS») - «tol») AS «_NX»«ENDIF»
WITH *, substring(«_N».«_NAME», 0, size(«_N».«_NAME») - size(«_LS»)) AS «_NY»
MATCH («_T»:«_WORD»«IF (!isPostfix)» {«_NAME»:"«word»"}«ENDIF») WHERE size(«_T».«_NAME») > size(«_LS») AND size(«_T».«_NAME») < size(«_N».«_NAME»)
WITH *, «IF tol > 0 
			»substring(«_T».«_NAME», 0, size(«_NX»)) AS «_TX»,«ENDIF» substring(«_T».«_NAME», 0, size(«_NY»)) AS «_TY» WHERE («IF tol > 0 
			»«_TX» = «_NX» OR «ENDIF»«_TY» = «_NY»)«IF linkIt
			»
MERGE («_S»:«_SUFFIX» {«_NAME»:«_LS»})
MERGE («_N»)«new Arrow(_L, _SUFFIXED, #{_NAME -> _LS}, false, Direction.RIGHT).generate()»(«_T»)
MERGE («_N»)«new Arrow(_L2, _ENDS_WITH, null, false, Direction.RIGHT).generate()»(«_S»)
WITH *, [«_X» IN range(0, size(«_N».«_NAME») - size(«_LS»)) WHERE substring(«_N».«_NAME», 0, «_X») = substring(«_T».«_NAME», 0, «_X»)][-1] AS «_INDEX»
WITH *, substring(«_N».«_NAME», 0, «_INDEX») AS «_SUBSTR», 
	substring(«_N».«_NAME», «_INDEX», size(«_N».«_NAME») - size(«_LS») - «_INDEX») AS «_INFIX_N», 
	substring(«_T».«_NAME», «_INDEX», size(«_T».«_NAME») - «_INDEX») AS «_INFIX_T»
MERGE («_IT»:«_INFIX_TRANSITION» {«_NAME»:«_INFIX_N»})
MERGE («_N»)«
	new Arrow(_F, _COMMON_PREFIX, #{_NAME -> _SUBSTR}, false, Direction.RIGHT).generate
	»(«_IT»)
MERGE («_IT»)«
	new Arrow(_G, _TRANSIT_TO, #{_NAME -> _INFIX_T}, false, Direction.RIGHT).generate
	»(«_T»)
MERGE («_IT»)«
	new Arrow(_H, _SUFFIXED, Direction.RIGHT).generate
	»(«_S»)
RETURN «_L», «_L2», «_S», «_IT», «_F», «_G», «_H»,«ELSE»
RETURN«ENDIF» «_N», «_T», «_LS»'''
		var result = dbAccessor.runCodeRecords(query, action)
		return result
//		null
	}

	/**
	 * replaces a WordType for a Word 
	 */
	override replaceTypeForWord(String word, String oldType, String newType) {
		// **** [20.06.21]
		// TODO: currently not supported yet
		// **** should do:
		// 1.) list all types
		// 2.) find old type
		// 3.) delete old type
		// 4.) addTypeToDict(new type)
		// FIXME: case sensitive of word classes is a problem 
		val mainType = true // subType not supported, because will disappear
		val linkType = '''«IF (mainType)»«_OF_CLASS»«ELSE»«_SUBCLASS_OF»«ENDIF»'''
		var types = getLinkTypes(word, _WORD).types
		for (type : types) {
			if (type.key.equals(oldType)) {
				var query = '''MATCH («_S»:«_WORD» {«_NAME»:"«word.toLowerCase()»"})
MATCH («_A»:«_WORD_CLASS» {«_NAME»:"«oldType»"})
MATCH («_B»:«_WORD_CLASS» {«_NAME»:"«newType»"})
MATCH («_S»)-[«_L»:«linkType»]->(«_A»)
DELETE «_L»
MERGE («_W»)-[«_L2»:«linkType»]->(«_B»)  
'''
		//TODO: 07.04.22: should replace type with newType in LinkTypes
			}
		}
	}

	/**
	 * Provisionary: Grammar rule matchers should be modeled as ImplicitDictRule
	 */
	override addToDictionary(String word, String type) {
		if (!hasDB_Obj('''Dictionary not connected: Entry: «word» of Type: «type» ''')) {
			return
		}
		dbAccessor.ensureDbConnect()
		var wordToLc = word.toLowerCase()
		var DictRec = getGlobalDict()
		if (nodeExist(type) && DictRec !== null) {
			connectionExist('''MATCH («_N»:«_WORD_CLASS» {«_NAME»:"«type»"}) ''', _N, '''MATCH («_T»: «_DICTIONARY» {«_NAME»:"«_GLOBAL»"})''', _T, _L)
			var query = '''CREATE(«_M»:«_WORD» {«_NAME»:"«wordToLc»"}) WITH «_M» 
MATCH («_N»:«_WORD_CLASS» {«_NAME»:"«type»"})
MERGE («_M»)-[«_L»:«_OF_CLASS»]->(«_N») 
RETURN «_N», «_M», «_L», type(«_L») AS «_TYPE»'''
			var allRecs = getAllRecords(dbAccessor.runCodeRecords(query, Action.READ))
			if (allRecs !== null && !allRecs.empty) {
				var types = newHashMap
				for (rec : allRecs) {
					var baseNode = getNode(rec.get(_N))
					val typeName = getAttr(baseNode, _NAME) as String

//					for (entry : rec.get(_ATTRS).asList) {
//						var typeAttributes = new TypeAttributes(baseNode, (entry as Map).get(_LK) as List, getNode(rec.get(source.get(fromType))), (entry as Map).get(_ATTR) as Node)
//						if (types.containsKey(typeName)) {
//							typeAttributes.merge(types.get(typeName))
//						}
//						types.put(typeName, typeAttributes)
//					}
					var info = new WordTypeInfo(rec.get(_N).asNode, types)
					addToWordCache(wordToLc, type, info)
				}
				
	
				dictPostProcess(wordToLc, type)
			}

			// move word in caches
			
		}
	}

//	@Deprecated
//	def addWordToCache(String word, String type) {
//		wordCache.put(word, type)
//		unknownWordCache.remove(word)
//	}

	/**
	 * Postprocess words statically: To be replaced by implicit rules in the future...
	 */
	// TODO: make configurable
	// maybe add in cypher query
	// TODO: replace by semantic dictionary rule
	// TODO: 28.09.21 - currently extended by suffix and prefix post process
	def dictPostProcess(String wordToLc, String type) {
		var List<Record> result
		switch (type) {
			case NOUN_: {
				result = findSigularToPluralOrThirdP(wordToLc, NOUN_, _PLURAL, false)
				logResult(result, "Noun | singular-plural", "Found singular to plural relation", wordToLc)
			}
			case VERB_: {
				continuousToRegular(wordToLc)
				result = findSigularToPluralOrThirdP(wordToLc, VERB_, _BASEFORM, true)
				logResult(result, "Verb | third person", "Found verb relation to third person conjugation", wordToLc)
			// FIXED: 09.02.22 continuous (node rule), prefixes: undate, rewind, etc...
			// TODO: verb to noun rules (node rule) act -> action
			}
			case ADJECTIVE_: {
				result = findComparativeAndSuperlative(wordToLc)
				logResult(result, "Adjective | comperative-superlative", "Found comparative or superlative adjective relation", wordToLc)
			}
		}
		// TODO: 21.02.22 type cross relation: eg. verb to adjective rules (node rule)
		// noun to adjective
		// active -> is activated
		// (noun) -> (verb)
		// weight -> weighted
		// (verb) -> (adjective)
		// think  -> thinkable
		// may be covered by LinkProcessor PostProcess		
		result = findShortCut(wordToLc)
		logResult(result, "All | shortcut", "Found shortcut relation", wordToLc)
	}

	/**
	 * find comparative or superlative
	 */
	def List<Record> findComparativeAndSuperlative(String string) {
		var result = newArrayList
		var exaggerate = newArrayList
		exaggerate.addAll(comparatives)
		exaggerate.addAll(superlatives)
		for (ex : exaggerate) {
			if (string.endsWith(ex.key))
				result.addAll(findSiblingAndMerge(string, ex.value, ex.key, Direction.LEFT, _COMPARATIVE, ADJECTIVE_, ADJECTIVE_) ?: #[])
			else {
				result.addAll(findSiblingAndMerge(string, ex.key, ex.value, Direction.RIGHT, _COMPARATIVE, ADJECTIVE_, ADJECTIVE_) ?: #[])
			}
		}
		result
	}

	/**
	 * check singular - plural
	 */
	def findSigularToPluralOrThirdP(String word, String type, String rel, boolean inverse) {
		for (singular : singularPlural.keySet()) {
			var plural = singularPlural.get(singular)
			if (word.endsWith(singular)) {
				var result = singularToPluralRepl(word, plural, singular, type, rel, inverse)
				if (!result?.empty)
					return result
			}
			if (word.endsWith(plural)) {
				var result = pluralToSingularRepl(word, singular, plural, type, rel, inverse)
				if (!result?.empty)
					return result
			}
		}
		if (word.endsWith("s")) { // plural to singular assignment
			return pluralToSingular(word, _S, type, rel, inverse)
		} else
			return singularToPlural(word, _S, type, rel, inverse)
	}

	/** 
	 * Adds relation to abbreviations and shortcuts if appropriate
	 */
	def findShortCut(String sc) {
//TODO 08.02.22 requires handling of suffixes and suffix ending or singular->plural conversions
		var postfixes = suffixes
		postfixes += singularPlural.keySet
		postfixes += singularPlural.values
		postfixes += _COMPARATIVE_SUFFIX
		postfixes += _SUPERLATIVE_SUFFIX
		var shortC = sc
		var suffix = ""
		for (pfx : suffixes) {
			if (sc.endsWith(pfx)) {
				shortC = sc.substring(0, sc.length - pfx.length)
				suffix = pfx
			}
		}
////find words for shortcuts
//WITH ["sion", "ism", "ty", "ship", "ist", "ly", "ate", "wise", "acy", "esque", "ic", "ed", "ee", "tion", "xion", "en", "al", "less", "hood", "er", "ity", "dom", "ry", "ward", "ous", "wards", "fy", "ize", "ian", "ive", "ance", "ible", "or", "ence", "ness", "wide", "i", "ment", "ical", "ious", "able", "y", "ise", "ful", "ify", "ish"] AS ls
//WITH *, "expl" AS sc, "s" AS suffix 
//MATCH (n:Word) WHERE n.name STARTS WITH sc AND NOT FILTER (e IN ls WHERE n.name = sc+e) AND n.name ENDS WITH suffix
//OPTIONAL MATCH (n:Word)-[l:plural ]-(t) //WHERE n = STARTNODE(l)
//CALL apoc.when(l IS NOT NULL, "WITH l, n, ENDNODE(l) as r WHERE r=n RETURN n,r, l", "", {n:n, l:l}) YIELD value 
//WITH l,sc,t, n WHERE n.name <> sc 
//RETURN n, l, t, sc, STARTNODE(l).name as start
//MATCH (n:Word) WHERE n.name STARTS WITH sc AND NOT FILTER (e IN ls WHERE n.name = sc+e)
//OPTIONAL MATCH (n:Word)-[l:plural ]-(t) //WHERE n = STARTNODE(l)
//CALL apoc.when(l IS NOT NULL, "WITH l, n, STARTNODE(l) as r WHERE r=n RETURN n,r, l", "WITH l, [] as n RETURN n,l", {n:n, l:l}) YIELD value 
//WITH l,sc,t, n WHERE n.name <> sc 
//RETURN n, l, t, sc, STARTNODE(l).name as start
//TODO: 07.02.22 Add plural and singular postfixes
//TODO: 07.02.22 add "suffix" relation to "plural" relation.
//TODO: 17.02.22: replace suffix list with nodes from database with label: suffix
		var isPlural = singularPlural.values.contains(suffix) || suffix.endsWith("s") // which one is the plural? find out whichdirection the link points to.
		var hasSuffix = suffix.length > 0
		var query = '''WITH [«FOR postfix : postfixes SEPARATOR ", "»"«postfix»"«ENDFOR»] AS «_LS»
WITH *, "«shortC»" AS «_SC» «IF hasSuffix
			», "«suffix»" AS «_SUFFIX»«ENDIF»
MATCH («_N»:«_WORD») WHERE «_N».«_NAME» STARTS WITH «_SC» AND size(«_SC») < size(«_N».«_NAME») AND NOT FILTER («_E» IN «_LS» WHERE «_N».«_NAME» = «_SC»+«_E»)«IF hasSuffix
			» AND «_N».«_NAME» ENDS WITH «_SUFFIX»«ENDIF»
OPTIONAL MATCH («_N»:«_WORD»)«new Arrow(_L, _PLURAL, null).generate»(«_T»)
CALL apoc.when(«_L» IS NOT NULL, "WITH «_L», «_N», «IF isPlural
			»ENDNODE(«ELSE»STARTNODE(«ENDIF»«_L») as «_R» WHERE «_R» = «_N» RETURN «_N», «_R», «_L»", "", {«_N»:«_N», «_L»:«_L»}) YIELD «_VALUE» 
WITH «_L», «_T», «_SC», «_N» WHERE «_N».«_NAME» <> «_SC»  
RETURN «_N», «_L», «_T», «_SC»'''
		var result = dbAccessor.runCodeRecords(query, Action.READ)
		if (!result.empty) {
			for (rec : result) {
				var source = rec.get(_N).asNode
				if (!(rec.get(_L) instanceof NullValue)) {
					query = '''MATCH(«_N»:«_WORD» {«_NAME»:"«sc»"})
MATCH(«_T») WHERE ID(«_T») = «source.id»
MERGE («_N»)«new Arrow(_L, _SHORT_CUT, Direction.LEFT).generate»(«_T»)'''
				// result = dbAccessor.runCodeRecords(query, Action.WRITE)
				} else {
					query = '''MATCH(«_N»:«_WORD» {«_NAME»:"«sc»"})
MATCH(«_T») WHERE ID(«_T») = «source.id»
MERGE («_N»)«new Arrow(_L, _SHORT_CUT, Direction.LEFT).generate»(«_T»)'''
				// result = dbAccessor.runCodeRecords(query, Action.WRITE)
				}
				if (hasSuffix) {
					query += '''

MERGE («_S»:«_SUFFIX» {«_NAME»:"«suffix»"})
MERGE («_N»)«new Arrow(null, _SUFFIXED, Direction.RIGHT).generate»(«_S»)«new Arrow(null, _SUFFIXED, Direction.LEFT).generate»(«_T»)
RETURN *
'''
				}
				result = dbAccessor.runCodeRecords(query, Action.WRITE)
			}
		}
		result
	}

	/** 
	 * check if a connection exist
	 * @Deprecated: use getLinkTypes
	 */
	// TODO rewrite this to take classes as input not single Parameters
	@Deprecated
	protected def connectionExist(String source, String var1, String target, String var2, String var3) {
		var String query = '''«source»
«target»
MERGE («var1»)-[«var3»:«_OF_CLASS»]->(«var2») RETURN «_TYPE»(«var3»)'''
		var result = dbAccessor.runCodeRecords(query, Action.WRITE)
		if (!result.isEmpty())
			return true
		else
			return false
	}

	/**
	 * initialize Dictionary 
	 */
	protected def getGlobalDict() {
		if (!hasDB_Obj("Dictionary not connected to: GlobalDict"))
			return null // TODO: externalize Strings
		var result = dbAccessor.runCodeRecords(String.format("MATCH (%1$s:Dictionary {name:'%2$s'}) Return %1$s", _N, _GLOBAL), Action.READ)
		if (result.isEmpty()) {
			result = dbAccessor.runCodeRecords(String.format("CREATE (n:Dictionary {name:'%s'})", _GLOBAL), Action.WRITE)
		}
		if (!result.isEmpty())
			return result.get(0)
		else
			return null
	}

	/**
	 * Logger API 
	 */
	protected def logResult(List<Record> result, String task, String message, String wordToLc) {
		if (result === null) {
			return
		}
		if (!result.isEmpty())
			logUtil.logAccess("Info", 0, '''[«task»] «message»: "«wordToLc»"''')
		else
			logUtil.logAccess("Info", 0, '''X [«task»] No grammar counterpart found yet: "«wordToLc»"''')
	}

	/**
	 * @Deprecated: Used by ImplicitRules:
	 */
	@Deprecated
	override findInDictionary(String word) {
		if (!hasDB_Obj('''Dictionary not connected: Entry: «word»'''))
			return null
		isConnected = dbAccessor.ensureDbConnect()
		var wordToLc = word.toLowerCase
		var result = newArrayList()
		if (unknownWordCache.containsKey(wordToLc)) {
			return null
		}
		if (typeCache.containsKey(wordToLc)) {
			return typeCache.get(wordToLc)
		}
		
		return getLinkTypes(wordToLc,  _WORD)
	}

	/**
	 * Used by IplicitRules:
	 * 
	 */
	override listAllLabel(String label) {
		var query_result = dbAccessor.runCodeRecords('''MATCH («_N»:«label»)
RETURN «_N».«_NAME»''', Action.READ)
		if (!query_result.isEmpty()) {
			var labels = query_result.parallelStream().map[rec|java.util.Objects.toString(rec.values().get(0).asString, null)].collect(Collectors.toList())
			return labels
		} else
			return #[]
	}

	/**
	 * Used by IplicitRules:
	 * 
	 */
	override listAllLabelTo(String label, String linkLabel, String targetL) {
		var query_result = dbAccessor.runCodeRecords('''MATCH («_N»:«label»)-[:«linkLabel»]->(:«targetL»)
RETURN «_N».«_NAME»''', Action.READ)
		if (!query_result.isEmpty()) {
			var labels = query_result.parallelStream().map[rec|java.util.Objects.toString(rec.values().get(0).asString, null)].collect(Collectors.toList())
			return labels
		} else
			return #[]
	}

	/**
	 * Check for Database
	 */
	protected def hasDB_Obj(String msg) {
		if (dbAccessor === null) {
			logUtil.logAccess("hasDB", 1, msg)
			return false
		}
		return true
	}

	/**
	 * Must be renamed as: wordClassExist
	 * 
	 * @param type
	 * @return
	 */
	protected def nodeExist(String type) {
		if (!hasDB_Obj('''Dictionary not connected: Type: «type»'''))
			return false
		var nodeName = type
		var result = dbAccessor.runCodeRecords('''MATCH («_N»:«_WORD_CLASS» {«_NAME»:'«nodeName»'}) 
RETURN «_N»''', Action.READ)
		if (result.isEmpty()) {
			dbAccessor.runCodeRecords('''CREATE («_N»:«_WORD_CLASS» { «_NAME»: '«nodeName»' })''', Action.WRITE)
		}
		return true
	}

	/**
	 * 
	 * UsedBy ImplicitRules:
	 */
	protected def linkExist(String from, String to, String type) {
		if (!hasDB_Obj('''Dictionary not connected: Type: «type»'''))
			return false
		var nodeName = type
		var result = dbAccessor.runCodeRecords('''MATCH («_N»:«_WORD_CLASS» {«_NAME»:'«nodeName»'}) 
RETURN «_N»''', Action.READ)
		if (result.isEmpty()) {
			dbAccessor.runCodeRecords('''CREATE («_N»:«_WORD_CLASS» { «_NAME»: '«nodeName»' })''', Action.WRITE)
		}
		return true
	}

	/**
	 * Another Check for Database
	 */
	override isConnected() {
		if (dbAccessor === null)
			return false
		if (isConnected)
			return true
		// this is probably never reached because in UIModule dbAccessor is already null
		// when not connected
		isConnected = dbAccessor.ensureDbConnect()
		return isConnected
	}

	/**
	 * 
	 * UsedBy ImplicitRules:
	 * @Deprecated: use similar functions in Database API
	 */
	@Deprecated
	def getAllRecords(List<Record> records) {
		var result = newArrayList()
		for (Record rec : records) {
			if ((rec instanceof Record)) {
				result.add(rec)
			}
		}
		if (result.empty)
			null
		else
			result
	}

	/** 
	 * Functions to extract results from records
	 */
	def Node getFirstRecord(List<Record> records, String varName) {
		for (Record rec : records) {
			if ((rec instanceof Record)) {
				return rec.get(varName).asNode()
			}
		}
		return null
	}

	/** 
	 * Functions to extract results from records
	 */
	def getLabel(Value value) {
		switch (value) {
			NodeValue: {
				value.asNode.labels
			}
			RelationshipValue: {
				value.asRelationship.keys
			}
			ListValue: {
				value.asList
			}
			default: {
				null
			}
		}
	}

	/** 
	 * Functions to extract results from records
	 */
	def getAttr(Node node, String name) {
		if (node === null) {
			return null
		}
		node.asMap.get(name)
	}

	/** 
	 * Functions to extract results from records
	 */
	def getNode(Value value) {
		if (value instanceof NodeValue)
			return value.asNode
		else
			return null
	}

	/** 
	 * Functions to extract results from records
	 */
	override getLinkTypes(String name,  String fromType) {
		getLinkTypes(name,  fromType, false) // TDOD: 28.02.2022 cache this
	}

	/** 
	 * Functions to extract results from records
	 */
	override getLinkTypes(String name, String fromType, boolean update) {
		val min = 1; // minimum distance 1 (no self reference:min = 0)
		val max = 1
		
		if (name === null) return null;
		var nameToLc = typeCase.get(fromType).apply(name)
		if (!update) {
			if (typeCache.containsKey(nameToLc)) {
				return typeCache.get(nameToLc)
			}
			if (unknownWordCache.containsKey(nameToLc)) {
				return null
			}
		}
		val typeMatch = #{
			_WORD -> '''MATCH («_M»:«_WORD» {«_NAME»:"«nameToLc»"})-[:«_OF_CLASS»]-(«_N»:«_WORD_CLASS»)
OPTIONAL MATCH «_CL» = («_M»)-[«_L»*«min»..«max»]-(«_W»)''',
			_INTERPUNCTION -> '''MATCH («_N»:«_INTERPUNCTION» {«_NAME»:"«nameToLc»"})
OPTIONAL MATCH «_CL» = («_N»)-[«_L»*«min»..«max»]-(«_W»)'''
			}
		val typeReturn = #{
			_WORD -> '''«_M»,«_N», COLLECT({«_LK»:«_L», «_ATTR»:«_W»}) AS «_ATTRS»''',
			_INTERPUNCTION -> '''«_N», COLLECT({«_LK»:«_L», «_ATTR»:«_W»}) AS «_ATTRS»'''
		}
		val source = #{
			_WORD -> _M,
			_INTERPUNCTION -> _N
		}
		if (!typeMatch.containsKey(fromType))
			return null
		var types = newHashMap

		// TODO: 02.12.21 This query is awkward. should be improved to better display the dependencies Network
		var query = '''«typeMatch.get(fromType)» WHERE NONE(«_A» IN relationships(«_CL») WHERE type(«_A») = '«_OF_CLASS»') AND 
FILTER(«_A» IN labels(«_W») WHERE «_A» IN [«FOR f : nodeFilter SEPARATOR ','»"«f»"«ENDFOR»])
RETURN «typeReturn.get(fromType)»'''
		var allRecs = getAllRecords(dbAccessor.runCodeRecords(query, Action.READ))
		if (allRecs !== null && !allRecs.empty) {
			for (rec : allRecs) {
				var baseNode = getNode(rec.get(_N))
				val typeName = getAttr(baseNode, _NAME) as String
				// val attrs = rec.get(_ATTRS).asList
				// val List<Value>attrs = newArrayList(rec.get(_ATTRS).asList.toArray as Value[])
				for (entry : rec.get(_ATTRS).asList) {
					var typeAttributes = new TypeAttributes(baseNode, (entry as Map).get(_LK) as List, getNode(rec.get(source.get(fromType))), (entry as Map).get(_ATTR) as Node)
					if (types.containsKey(typeName)) {
						typeAttributes.merge(types.get(typeName))
					}
					types.put(typeName, typeAttributes)
				}
			}
			var info = new WordTypeInfo(allRecs?.get(0).get(_N).asNode, types)
			if (unknownWordCache.containsKey(nameToLc)) { // TODO:[12.07.21] untested 
				unknownWordCache.remove(nameToLc)
			}
			typeCache.put(nameToLc, info)
			info
		} else {
			unknownWordCache.put(nameToLc, "")
			null
		}
	}

	override getLogger() {
		buildLogger
	}

	/**
	 * part of resolve type hierarchy. currently word type subtype hierarchy is unused.
	 */
	override resolveTypeHierarchy(String root, String branch) {
		if (!hasDB_Obj('''Dictionary not connected: «this.class.name» resolveTypeHierarchy(String root)''')) {
			return null
		}
		recursiveResolveByLabel(root, branch)
	}

	/**
	 * part of resolve type hierarchy. currently word type subtype hierarchy is unused.
	 */
	def recursiveResolveByLabel(String root, String branch) {
		var arrow = new Arrow(_L, _OF_CLASS, Direction.LEFT)
		var query = '''MATCH («_N»:«root»)«arrow.generate»(«_T»:«branch»)
RETURN *'''
		var result = dbAccessor.runCodeRecords(query, Action.READ)
		resolveQuery(result, _T, branch)
	}
	
	/**
	 * part of resolve type hierarchy. currently word type subtype hierarchy is unused.
	 */
	def List<ITypeHierarchy> recursiveResolveByNode(Node node, String branch) {
		var arrow = new Arrow(_L, _OF_CLASS, Direction.LEFT)
		var query = '''MATCH («_N»)«arrow.generate»(«_T»:«branch») Where ID(«_N») = «node.id»
RETURN «_T»''' 
		var result = dbAccessor.runCodeRecords(query, Action.READ)
		resolveQuery(result, _T, branch)
	}

	/**
	 * part of resolve type hierarchy. currently word type subtype hierarchy is unused.
	 */
	def resolveQuery(List<Record> records, String varName, String branch) {
		if (!records.isEmpty()) {
			var List<ITypeHierarchy> types = newArrayList()
			for (rec : records) {
				var Node node = rec.get(varName).asNode
				types += new TypeHierarchy(node, recursiveResolveByNode(node, branch))
			}
			return types
		} else
			return #[]
	}

	override addSuccessor(DictItem source, DictItem target, Set<String> targetTypes) {
		addSuccessor(source, target, targetTypes, #[])
	}
	
	
	/**
	 * PostProcess Job, requires better logging to precisely trace db-changes 
	 */
	override addSuccessor(DictItem source, DictItem target, Set<String> targetTypes, List<ITypeAttributes> attribs) throws ClientException { // TODO: replace String by ID
		
		var typeExtension = "" //TODO: 08.04.22 provisionally. second floor. add only type in property for interpunction
		switch(source.type){
			case _INTERPUNCTION: {typeExtension = '''«IF source.innerType!== null», «_TYPE»:"«source.innerType»"«ENDIF»'''}
			default:{typeExtension = ""}
			
		}
		
		var sourceQuery = '''«source.type» {«_NAME»:"«typeCase.get(source.type).apply(source.name)»"«typeExtension»}'''
		// TODO: 27.07.21 add Attribs
		val grammar_preset = #{ // TODO: provisional 
			_BASEFORM -> Direction.IN,
			_CONJUGATION -> Direction.OUT,
			_CONTINUOUS -> Direction.IN,
			_PLURAL -> Direction.OUT
		}
		val additional_preset = #{ // TODO: provisional   
			_CONTINUOUS -> Direction.OUT
		}
		val targetClass = #{
			_WORD -> _WORD_CLASS,
			_INTERPUNCTION -> _INTERPUNCTION
		}
		
		for (attr : attribs) { // process attributes
			switch (attr) {
				TypeAttributes: {
					var sourceNode = attr.source.get(0)
					for (node : filterAttributes(attr.target)) {
						var id = node.id // TODO: 18.12.21 direct Links exist now
						var name = node.get(_NAME).asString
						var targetID = id
						var isntSource = (id !== sourceNode.id)
						for (Relationship rel : attr.attrs as Iterable<Relationship>) {
							if (!rel.type.equals(_FOLLOWED_BY)) { // TODO 28.01.2022 rewrite this in favor of type hierarchy for relationships 
								var dirRel = #{Direction.IN -> rel.endNodeId.equals(id), Direction.OUT -> rel.startNodeId.equals(id)}
								var linkType = '''«_FOLLOWED_BY» {«_TYPE»:"«IF dirRel.get(Direction.IN)»«Direction.IN.name»«ELSE»«Direction.OUT.name»«ENDIF»"}''' 
								if ((node.labels as List).contains(_WORD)) {
									var pT = grammar_preset.get(rel.type)
									var aT = additional_preset.get(rel.type)

									var boolResult = false
									if (pT !== null)
										boolResult = dirRel.get(pT)
									if (aT !== null && dirRel.get(aT)) {
										if (!(attr.attrs as List<Relationship>).map[r|r.type].contains(_BASEFORM))
											createBaseForm(sourceQuery, target.name, linkType, sourceNode, node, id) 
									}
									if (name.equals(target.name) && boolResult) {
										// TODO: 05.09.21 requires a set because there may be multiple relationships from the same type 
										var intermed = NodeUtil.nodeExistOrCreate(dbAccessor, '''«_N»:«_GRAMMAR» {«_NAME»:"«rel.type»"}''', _N, #[], false)
										var intID = intermed.id
										switch (pT) {
											case Direction.IN: {
												NodeUtil.linkExistOrCreate(dbAccessor, '''«source.type» {«_NAME»:"«sourceNode.get(_NAME)»"}''', '', '''«_FORM»''', id, intID)
											}
											case Direction.OUT: {
												NodeUtil.linkExistOrCreate(dbAccessor, '''«target.type» {«_NAME»:"«name»"}''', '', '''«_FORM»''', id, intID)
											}
											default: {
											}
										}
										targetID = intID
										NodeUtil.linkExistOrCreate(dbAccessor, sourceQuery, '', linkType, -1, targetID)
									}
								} else if (dirRel.values.contains(true) && isntSource)
									NodeUtil.linkExistOrCreate(dbAccessor, sourceQuery, '', linkType, -1, targetID)
							}
						}
					}
				}
				InterpunctionTypeAttribute: {
					var subQuery = '''«_INTERPUNCTION» {«_NAME»:"«attr.attrs»"«IF attr.type!== null», «_TYPE»:"«attr.type»"«ENDIF»}'''
					var interp = NodeUtil.nodeExistOrCreate(dbAccessor, '''«_N»:«subQuery»''', _N, #[], false)

					NodeUtil.linkExistOrCreate(dbAccessor, sourceQuery, subQuery, '''«_FOLLOWED_BY»''', -1, interp.id)
				}
			}
		}
		
		// process target: WordTypes or Interpunction
		if (target.id >= 0){ // Interpunction
				NodeUtil.linkExistOrCreate(dbAccessor, sourceQuery, '', '''«_FOLLOWED_BY»''', source.id, target.id)
		} else { // WordTypes
			for (type : targetTypes) {
				NodeUtil.linkExistOrCreate(dbAccessor, sourceQuery, '''«targetClass.get(target.type)» {«_NAME»:"«type»"}''', '''«_FOLLOWED_BY»''', -1, -1)
			}
		}
	}

	def List<Node> filterAttributes(List<Node> nodes) {
		var result = newArrayList()
		for (n : nodes) {
			for (l : n.labels)
				if (nodeFilter.contains(l))
					result.add(n)
		}
		result
	}

	def createBaseForm(String sourceQuery, String target, String linkType, Node sourceNode, Node targetNode, long targetID) throws ClientException {
		var intermed = NodeUtil.nodeExistOrCreate(dbAccessor, '''«_N»:«_GRAMMAR» {«_NAME»:"«_BASEFORM»"}''', _N, #[], false)
		var id = intermed.id
		NodeUtil.linkExistOrCreate(dbAccessor, '', '', '''«_FORM»''', targetID, id)
		NodeUtil.linkExistOrCreate(dbAccessor, sourceQuery, '', linkType, -1, id)
	}

	/**
	 * PostProcess Job, requires better logging to precisely trace db-changes 
	 */
	override processSuffix(String word, List<ITypeAttributes> attributes) throws ClientException {
		var intWord = word
		for (suffix : suffixes) {
			if (intWord.endsWith(suffix)) {
				var pRes = findPrefix(intWord, newArrayList(prefixes), 1, true)
				if (pRes !== null && !pRes.empty) {
					var whichPx = pRes.get(0).get(_LS).asString()
					intWord = intWord.substring(whichPx.length, intWord.length)
				}
				var res = findPostfixRelative(intWord, #[suffix], 0, true, true)
				if (res !== null && !res.empty) { // TODO: 05.10.21 replace print with logger:
					print(''' >>  
[DictAccess: processSuffix] Word: «intWord», Suffix: «suffix»''')
					return res
				}
			}
		}
		var res = findPostfixRelative(intWord, newArrayList(suffixes), 1, false, true)
		if (res !== null && !res.empty) {
			print(''' >> 
[DictAccess: precessSuffix] Base: «intWord», «FOR rec : res SEPARATOR ', '» Target: «rec.get(_N).asNode.get(_NAME).asString» Suffix: «rec.get(_LS).asString()»«ENDFOR»''')
			return res
		}
		return null
	}

	/**
	 * PostProcess Job, requires better logging to precisely trace db-changes 
	 */
	override processPrefix(String word, List<ITypeAttributes> attributes) throws ClientException  {
		var res = findPrefix(word, newArrayList(prefixes), 1, true)
		if (res !== null && !res.empty) {
			var whichPx = res.get(0).get(_LS).asString()
			print(''' >>  
[DictAccess: processPrefix] Word: «word», Suffix: «whichPx»''')
			return res
		}
		return null
	}

	override deleteNode(Node node) { // TODO 12.11.2021 add Attributes
		println('''[DictAccess] delete Node: «node.get(_NAME).asString»''')
//		var query = '''
//		MATCH (n:GrammarCluster) WHERE ID(n) = 2819
//		MATCH p=(n)<-[:grammarLink*..4 {type:"first"}]-(t:GrammarCluster)
//		WITH *, relationships(p) as l
//		UNWIND l as list
//		MATCH (a:GrammarCluster)<-[list]-(b:GrammarCluster)
//		return a,b,list'''
	}

	override deletePatternFromNode(Node node) {
		// TODO: 17.03.2022 
		// - for now just delete, 
		// - but for later create an intersection pattern
		println('''[DictAccess] delete pattern from Node: «node.get(_NAME).asString»''')
		var query = '''
		MATCH («_N») WHERE ID(«_N») = «node.id»
		MATCH («_N»)-[«_L»:«_EXCLUDES»]->(«_T»)
		DETACH DELETE «_T»
		RETURN *'''
		var result = dbAccessor.runCodeRecords(query, Action.WRITE)
		return result
	}

	override disableNode(Node node, ITypeAttributes start, ITypeAttributes end, int cardinality, XPair<String, ITypeAttributes> cardinalType) throws ClientException {
		// TODO: 2.11.2021: 
		// DONE - Gather all Attributes and Features from the Node-Hierarchy below 
		// DONE - and then create a Filter Pattern
		// DONE- do not delete Node explicitly
		// - if Filter Pattern exists on Node add this Filter to Node and create an Intersection Node
		// - new FilterPatterns must merge with highest (root) node of intersection Node (if already present) and derive a new intersection
		// by that, a process shall be established to isolate the significant feature that decides for the correct grammar
		// DONE: 24.03.22 Add start and End Token in panelChain 
		// TODO: 23.03.22 add cardinality support
		// TODO: 12.05.22 requires recursive capability 
		var attrs = #{_START -> start.attrsEL, _END -> end.attrsEL}
		var sourceNode = '''MATCH («_N») WHERE ID(«_N») = «node.id»'''
		var min = "1"
		var max = null
		var query = '''«sourceNode»
MATCH «_P» = («_N»)«new Arrow(_L, _EXCLUDES, null, min, max, true, true, Direction.RIGHT).generate»(«_W»)
MATCH («_W»)«new Arrow(_R, null, Direction.RIGHT).generate»(«_T») WHERE NOT «_T»:«_PATTERN»
RETURN «_N», «_L», «_W», «_P», COLLECT({«_N»:«_T», «_L»:«_R»}) AS «_ATTRS»'''
		var result = dbAccessor.runCodeRecords(query, Action.READ)
		if (result !== null && !result.empty) {
			// TODO: 17.02.22 create merge pattern to extract differences for second to n+1 order pattern
			var startMap = #{_INCLUDED-> newArrayList, _LEFT_OVER -> newArrayList}
			var endMap = #{_INCLUDED -> newArrayList, _LEFT_OVER -> newArrayList}
			var att = new ArrayList<Map>((result.get(0).get(_ATTRS).asList as Object) as List<Map>)
			var elms = newArrayList()
			for (d : attrs.keySet) {
				for (r : attrs.get(d)) {	
					val isNode = [Node n|n.id.equals(r.start.ID) || n.id.equals(r.end.ID)]
					// find implicit relationship that matches pattern in both attribute sets: att and attrs
					var filRes = (att as List<Map>).filter [ var rel = (it.get(_L) as Relationship)  
						rel.type.equals(r.relationship.type) && 
						isNode.apply(it.get(_N) as Node) && 
						rel.get(_SOURCE).asString.equals(d) &&
						rel.get(_TYPE)?.asString.equals(r.relationship.get(_TYPE)?.asString)
					]
					// var boolean success
					if (filRes.size > 0) {
						
						for (el : filRes) {
							var elS = (el.get(_L) as Relationship).get(_SOURCE).asString
							switch (elS) {
								case _END: {
									endMap.get(_INCLUDED).add(r)
								}
								case _START: {
									startMap.get(_INCLUDED).add(r)
								}
							}
							elms.add(el) // avoid concurrent modification
						}
					} else {
						switch (d) {
							case _END: {
								endMap.get(_LEFT_OVER).add(r)
							}
							case _START: {
								startMap.get(_LEFT_OVER).add(r)
							}
						}
					}
				}
			}
			att.removeAll(elms)
			var patternN = (result.get(0).get(_P) as PathValue).asPath.end
			var ord = patternN.get(_ORDINAL)
			var ordinal = 0
			if (ord instanceof NullValue)
				ordinal = 0
			else 
				ordinal = ord.asInt 
			
			// TODO: 28.03.2022 requires to extend Name /  11.05.22 -> why? identify relationship by id
			query = '''MATCH(«_N») WHERE ID(«_N») = «(patternN as Node).id»
«				FOR r : startMap.get(_LEFT_OVER)
					»MATCH («_T»«r.relationship.id») WHERE ID(«_T»«r.relationship.id») = «r.end.node.id»
«				ENDFOR»«
				FOR r : endMap.get(_LEFT_OVER)
					»MATCH («_T»«r.relationship.id») WHERE ID(«_T»«r.relationship.id») = «r.end.node.id»
«				ENDFOR»
«				FOR ex : elms
					»MATCH («_T»«(ex.get(_L) as Relationship).id») WHERE ID(«_T»«(ex.get(_L) as Relationship).id») = «(ex.get(_N) as Node).id»
«				ENDFOR»
«				FOR a : att
					»MATCH («_T»«(a.get(_L) as Relationship).id») WHERE ID(«_T»«(a.get(_L) as Relationship).id») = «(a.get(_N) as Node).id»
«				ENDFOR»
MERGE(«_W»: «_PATTERN» {«createProperties(patternN)»«
					IF (patternN.get(_ORDINAL) instanceof NullValue)», «_ORDINAL»:"«ordinal + 1»"«
					ENDIF»})
MERGE(«_N»)«new Arrow(_L, _EXCLUDES, Direction.RIGHT).generate»(«_W») 
«				FOR r : startMap.get(_LEFT_OVER)
					»MERGE(«_W»)«new Arrow(_L+r.relationship.id, _LEFT_OVER, filterMap(mergeMap(r.relationship.asMap, #{_SOURCE -> _START, _ID -> r.relationship.id.toString}), filter), true, Direction.RIGHT).generate»(«_T»«r.relationship.id»)  
««« 				create lambda »»»
«				ENDFOR»«
				FOR r : endMap.get(_LEFT_OVER)
					»MERGE(«_W»)«new Arrow(_L+r.relationship.id, _LEFT_OVER, filterMap(mergeMap(r.relationship.asMap, #{_SOURCE -> _END, _ID -> r.relationship.id.toString}), filter), true, Direction.RIGHT).generate»(«_T»«r.relationship.id»)
«				ENDFOR»
«				FOR ex : elms
					»MERGE(«_W»)«new Arrow(_L+(ex.get(_L) as Relationship).id, _INCLUDED, filterMap(mergeMap((ex.get(_L) as Relationship).asMap, #{_ID -> (ex.get(_L) as Relationship).id.toString}), filter), true, Direction.RIGHT).generate»(«_T»«(ex.get(_L) as Relationship).id»)
«				ENDFOR»
«				FOR a : att
					»MERGE(«_W»)«new Arrow(_L+(a.get(_L) as Relationship).id, _EXCLUDED, filterMap(mergeMap((a.get(_L) as Relationship).asMap, #{_ID -> (a.get(_L) as Relationship).id.toString}), filter), true, Direction.RIGHT).generate»(«_T»«(a.get(_L) as Relationship).id»)
«				ENDFOR»
RETURN *
'''
			println(query)
			result = dbAccessor.runCodeRecords(query, Action.WRITE)
			
		} else {
			// create new pattern 
			query = '''«sourceNode»«FOR d : attrs.keySet»
«				FOR r: attrs.get(d)
					»MATCH(«_T»«r.relationship.id») WHERE ID(«_T»«r.relationship.id») = «r.end.ID»
«				ENDFOR»«ENDFOR»
MERGE(«_W»: «_PATTERN» {«createProperties(node)», «_ORDINAL»:"0"})
MERGE(«_N»)«new Arrow(_L, _EXCLUDES, Direction.RIGHT).generate»(«_W»)
«FOR d : attrs.keySet»«
				FOR r : attrs.get(d)
    				»MERGE(«_W»)«new Arrow(null, r.relationship.type, filterMap(mergeMap(r.relationship.asMap, #{_SOURCE -> d}), filter), true, Direction.RIGHT).generate»(«_T»«r.relationship.id»)
«				ENDFOR»«ENDFOR»
RETURN *'''
			print(query)
			result = dbAccessor.runCodeRecords(query, Action.WRITE)
		}
		result
	}

	def createProperties(Node node) { // TODO: 24.03.22 add extension var for new names
		'''«FOR key : node.asMap.keySet SEPARATOR ', '»«
		IF (key.equals(_ORDINAL))
			»«key»:"«node.get(key).asInt + 1»"«
		ELSE
			»«key»:"«node.get(key).asString»"«
		ENDIF»«ENDFOR»'''
	}

	def filterMap(Map<String, String> map, List<String> filterKeys) {
		var result = new HashMap(map)
		for (key : filterKeys) {
			if (result.containsKey(key))
				result.remove(key);
		}
		result
	}

	def Map<String, String> mergeMap(Map<? extends Object, ? extends Object> map, Map<String, String> map2) {
		var Map<String, String> result = newHashMap()
		result.putAll((map as Object) as Map<String, String>)
		result.putAll(map2)
		result
	}
}
