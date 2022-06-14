package de.validas.nlx.ai.util

import de.validas.nlx.ai.IDbAccess
import de.validas.nlx.ai.neo4j.Neo4jAccess.Action
import java.util.List
import org.neo4j.driver.internal.InternalRecord
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.v1.Record
import org.neo4j.driver.v1.types.Node

import static de.validas.nlx.constants.Neo4jConstants._LINK
import static de.validas.nlx.constants.Neo4jConstants._I
import static de.validas.nlx.constants.Neo4jConstants._HIT
import static de.validas.nlx.constants.Neo4jConstants._NODE
import static de.validas.nlx.constants.Neo4jConstants._SOURCE
import static de.validas.nlx.constants.Neo4jConstants._TARGET
import java.util.ArrayList
import java.util.HashMap

class NodeUtil {
	/**
	 * 
	 */
	def static linkExistOrCreate(IDbAccess dbAccessor, String sourceQuery, String targetQuery, String linkQuery, long sourceID, long targetID) {
		var hasSource = sourceID >= 0
		var hasTarget = targetID >= 0 
		var where = newHashMap()
		if (hasSource)
			where.put(_SOURCE, '''ID(«_SOURCE») = «sourceID»''')
		if (hasTarget)
			where.put(_TARGET, '''ID(«_TARGET») = «targetID»''')
		var query = '''MATCH(«_SOURCE»«IF !hasSource»:«sourceQuery»«ENDIF»)-[«_LINK»:«linkQuery»]-(«_TARGET»«IF !hasTarget»: «targetQuery»«ENDIF») «
		IF hasSource || hasTarget»WHERE «FOR w : where.values SEPARATOR ' AND '»«w»«ENDFOR»«ENDIF»
FOREACH («_I» in CASE
     WHEN EXISTS(«_LINK».«_HIT») THEN [1]
     ELSE [] END | SET «_LINK».«_HIT» = «_LINK».«_HIT» + 1) 
FOREACH («_I» in CASE
     WHEN NOT(EXISTS(«_LINK».«_HIT»)) THEN [1]
     ELSE [] END | SET «_LINK».«_HIT» = 1)
RETURN «_SOURCE», «_LINK», «_TARGET»'''
		
		var result = dbAccessor.runCodeRecords(query, Action.READ)
		if (!(result !== null && !result.empty)){
			query = '''MATCH(«_SOURCE»«IF !where.containsKey(_SOURCE)»:«sourceQuery»)«ELSE») WHERE «where.get(_SOURCE)»«ENDIF»
MATCH («_TARGET»«IF !where.containsKey(_TARGET)»: «targetQuery»)«ELSE») WHERE «where.get(_TARGET)»«ENDIF» 
MERGE(«_SOURCE»)-[«_LINK»: «linkQuery»]->(«_TARGET»)
RETURN «_SOURCE», «_LINK», «_TARGET»'''
			result = dbAccessor.runCodeRecords(query, Action.WRITE)	
		}
		result
	}
	
	/**
	 * 
	 */
	def static Node nodeExistOrCreate(IDbAccess dbAccessor, String subQuery, String varName, List<String> exclude, boolean fail) {
		var String query = '''MATCH («subQuery»)«IF exclude !== null && !exclude.empty»WHERE NOT («FOR attr : exclude SEPARATOR ' OR '»exists(«varName».«attr»)«ENDFOR»)«ENDIF» Return «varName»'''
		var List<Record> result = dbAccessor.runCodeRecords(query, Action.READ)
		if (fail && !result.isEmpty)
			return null
		if (result.isEmpty) {
			query = '''CREATE («subQuery») Return «varName»'''
			return getFirstRecord(dbAccessor.runCodeRecords(query, Action.WRITE), varName)
		}
		getFirstRecord(result, varName)
	}
	
	/**
	 * 
	 */
	def static connectionExistOrCreate(IDbAccess dbAccessor, Node source, Arrow arrow, Node target) {
		var subquery = '''MATCH(«_NODE»:«source.labels.get(0)») WHERE ID(«_NODE») = «source.id»
MATCH(«_TARGET»:«target.labels.get(0)») WHERE ID(«_TARGET») = «target.id»'''
		var query = '''«subquery» 
MATCH(«_NODE»)«arrow.generate»(«_TARGET»)
Return «arrow.varName»'''
		var result = dbAccessor.runCodeRecords(query, Action.READ)
		if (result.empty) {
			var writeQuery = '''«subquery»
MERGE(«_NODE»)«arrow.generate»(«_TARGET»)
Return «arrow.varName»'''
			return getFirstRelation(dbAccessor.runCodeRecords(writeQuery, Action.WRITE), arrow.varName)
		}
		getFirstRelation(result, arrow.varName)
	}
	
	/**
	 * 
	 */
	 def static getFirstRecord(List<Record> records, String varName) {
	    for (Record rec : records) {
	        if (rec instanceof InternalRecord) {
	            var value = rec.get(varName)
	            if (value instanceof NodeValue)
	                return value.asNode
	        }
	    }
	    null
    }
    
    /**
     * 
     */
    def static getFirstRelation(List<Record> records, String varName) {
		for (Record rec : records) {
			if (rec instanceof InternalRecord) {
				return rec.get(varName).asRelationship
			}
		}
	}


	def static List<NodeValue> recordsToNode(List<Record> records, String key ){
		var List<NodeValue> targets = new ArrayList<NodeValue>()
		for (record : records) {
			targets.add(record.get(key) as NodeValue)
		}
		targets
	}
}
