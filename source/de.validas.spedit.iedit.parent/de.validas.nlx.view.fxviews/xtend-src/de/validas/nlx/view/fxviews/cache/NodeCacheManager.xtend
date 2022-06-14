/**
 * Node Cache Manager is a interface between Client and Database to cache Inquiries to database to speed up and to avoid calling for redundant calls on the database
 * it acts as a invisible layer between and filters out redundant calls, attempting to query data only once unless modified on the DB.
 */
package de.validas.nlx.view.fxviews.cache

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.LinkedHashMap
import org.neo4j.driver.v1.Record

@Singleton
class NodeCacheManager implements INodeCacheManager{
	protected var LinkedHashMap<String, ICacheObj> nodeMap = newLinkedHashMap()
	
	
	@Inject
	new () {
		
	}
	
	override getNode(String name, String label, Record rec, String varName){ //TODO: redundant to getNodeByName ....
		if (nodeMap.containsKey(name)) {
			return nodeMap.get(name) 
		} else
			addNode(name, label, rec, varName)
	}
	
	override addNode(String name, String label, Record rec, String varSelect) {
		var ICacheObj cacheNode = new CachedNode(name, label, rec, varSelect) //TODO: try to skip extra variable declaration and assignment
		var old = nodeMap.put(name, cacheNode)
		if (old !== null){
			for (link : old.inLinks){
				link.inLink = cacheNode
				cacheNode.inLink = link
			}
			for (link : old.outLinks){
				link.outLink = cacheNode
				cacheNode.outLink = link	
			}
		}
		cacheNode
	}
	
	override void addLink (ICacheObj start, ICacheObj end, CachedLink link) {
		//link = new CachedLink(start, end, link.label, link)
		link.inLink = end
		link.outLink = start
		end.inLink = link
		start.outLink = link
	}
	
	override getNodeByName(String name) {
		if (nodeMap.containsKey(name)) {
			return nodeMap.get(name) 
		} else
			null
	}
	
}