package de.validas.nlx.view.fxviews.cache

import java.util.HashMap
import org.neo4j.driver.v1.Record

class CachedNode implements ICacheObj {
	
	//String label //FIXME: unused
	String name
	Record record
	String varSelect
	HashMap<String,ICacheObj> outLinks = new HashMap<String,ICacheObj>()
	HashMap<String,ICacheObj> inLinks = new HashMap<String,ICacheObj>()
	
	new (String name, String label, Record rec, String varSelect) {
		//this.label = label
		this.record = rec
		this.name = name
		this.varSelect = varSelect
	}
	
	
	override setOutLink(ICacheObj obj) {
		outLinks.put((obj as ICacheLink).inLink.name,  obj)
	}
	
	override setInLink(ICacheObj obj) {
		inLinks.put((obj as ICacheLink).outLink.name,obj)
	}
	
	override getOutLinks()
	{
		this.outLinks.values
	}
	
	override getInLinks()
	{
		this.inLinks.values
	}
	
	def hasLinkTo(ICacheObj target, String attrs) { 
		for (key : outLinks.keySet) {
			var link = outLinks.get(key)
			var end = (link as ICacheLink).inLink
			if (end.equals(target) && link.hasAttrs(attrs))
				return link
		}
		return null
	}
	
	override getNode() {
		if (record.containsKey(varSelect))
			record.get(varSelect).asNode
		else 
			null
	}
	
	override getRecord() {
		record
	}
	
	override getName() {
		name
	}
	
	def removeLinkTo(ICacheObj target) {
		var keys = newArrayList()
		for (key : outLinks.keySet) {
			var link = outLinks.get(key)
			var end = (link as ICacheLink).inLink
			if (end !== null && end.equals(target)){
				keys.add(key)
			}
		}
		for (key: keys){
			var link = outLinks.get(key)
			var end = (link as ICacheLink).inLink
			removeOut(key)
			(end as CachedNode).removeIn(this.name)	
			link.inLink  = null
			link.outLink = null
		}
	}
	
	def removeIn(String key) {
		inLinks.remove(key)
	}
	def removeOut(String key) {
		outLinks.remove(key)
	}
	
	override hasAttrs(String string) {
		if (string === null) return true
		string.empty
	}
	
	override toString(){
		name
	}
		
	
}