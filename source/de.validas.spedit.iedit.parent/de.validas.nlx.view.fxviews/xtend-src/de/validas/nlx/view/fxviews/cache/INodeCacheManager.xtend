package de.validas.nlx.view.fxviews.cache

import org.neo4j.driver.v1.Record

interface INodeCacheManager {
	
	@Deprecated
	def ICacheObj getNode(String name, String label, Record rec, String varSelect) 
	
	def ICacheObj addNode(String name, String label, Record rec, String varSelect) 
		
	def void addLink (ICacheObj start, ICacheObj end, CachedLink link)
	
	def ICacheObj getNodeByName(String string)
	
}