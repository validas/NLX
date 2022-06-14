package de.validas.nlx.dictionary.type

import de.validas.nlx.dictionary.type.ITypeAttributes
import org.neo4j.driver.v1.types.Node
import java.util.Set
import java.util.HashMap

import static de.validas.nlx.dictionary.constants.DictionaryConstants._START;
import static de.validas.nlx.dictionary.constants.DictionaryConstants._END;
import java.util.Map
import de.validas.nlx.dictionary.constants.AttributeSet
import java.util.Collection
import de.validas.nlx.dictionary.type.elements.INodeEL
import de.validas.nlx.dictionary.type.elements.INetworkEL
import de.validas.nlx.dictionary.type.elements.IRelationshipEL
import java.util.List
import de.validas.nlx.constants.Direction

class LinkTypeAttribute implements ITypeAttributes {
	
	Map<String, ITypeAttributes> parent
	Node linkBase
	
	new (Node linkNode, ITypeAttributes source, ITypeAttributes target) {
		this.parent = newHashMap()
		this.parent.put(_START, source)
		this.parent.put(_END, target)
		this.linkBase = linkNode
		
	}
	
	override getBaseNode() {
		linkBase 
	}
	
	def getParent(AttributeSet set) {
		//TODO: 06.12.21 this requires a cache to not resolve every time from scratch
		switch (set){
			case ALL:{
				merge4Link()
			}
			case START:{
				parent.get(_START)
			}
			case END: {
				parent.get(_END)
			}
			default:{
				null
			}
		}	
	}
	
	def getAttrs(AttributeSet set) {
		//TODO: 06.12.21 this requires a cache to not resolve every time from scratch
		switch (set){
			case ALL:{
				merge4Link().getAttrs()
			}
			case START:{
				parent.get(_START).getAttrs()	
			}
			case END: {
				parent.get(_END).getAttrs()
			}
			default:{
				null
			}
		}	
	}
	
	def ITypeAttributes merge4Link() {
		var start = parent.get(_START)
		var end = parent.get(_END)
		return new TypeAttributes(linkBase, start, end)
	}
	
	/**
	 * @param mactchTarget: also target tye must match
	 * @param includeBoth: include matches from start and end although they are partially redundant 
	 */
	def ITypeAttributes intersection(Node basenode, boolean matchTarget, boolean includeBoth) {
		var selected = newHashSet
		var srcs = newHashSet
		var trg = newHashSet
		var start = parent.get(_START)
		var end = parent.get(_END)
		for(relStart: start.attrsEL){
			for(relEnd: end.attrsEL){
				if (relStart.relationship.type.equals(relEnd.relationship.type)){ 
					var nodeS = if (start.targetEL.contains(relStart.end)) relStart.end else relStart.start
					var nodeE = if (end.targetEL.contains(relEnd.end)) relEnd.end else relEnd.start
					if(nodeS.node.equals(nodeE.node) && matchTarget) {
						val isStRemote = start.sourceEL.contains(relStart.start)
						selected.add(relStart)
						trg.add( if (isStRemote) relStart.end else relStart.start)
						srcs.add( if (isStRemote) relStart.start else relStart.end)
						if (includeBoth){
							val isEnRemote = end.sourceEL.contains(relEnd.start)
							selected.add(relEnd)
							trg.add( if (isEnRemote) relEnd.end else relEnd.start)
							srcs.add( if (isEnRemote) relEnd.start else relEnd.end)
						}
					}
				}
			}
		}
		if (selected.size == 0) 
			return null 
		
		var Node base
		if (baseNode !== null)
			base = basenode	
		else 
			base = linkBase
		return new TypeAttributes(base, selected, srcs, trg)
	}
	
	override getAttrs(){
		getAttrs(AttributeSet.ALL)
	}
	
	override getSource() {
		getSource(AttributeSet.ALL)
	}
	
	def getSource(AttributeSet set) {
		//TODO: 06.12.21 this requires a cache to not resolve every time from scratch
		switch (set){
			case ALL:{
				merge4Link().source
			}
			case START:{
				parent.get(_START).source	
			}
			case END: {
				parent.get(_END).source
			}
			default:{
				null
			}
		}	
	}
	
	override getTarget() {
		//TODO: 29.11.21: return all, source or target here
		getTarget(AttributeSet.ALL)
	}
	
	def getTarget(AttributeSet set){
		//TODO: 06.12.21 this requires a cache to not resolve every time from scratch
		switch (set){
			case ALL:{
				merge4Link().target
			}
			case START:{
				parent.get(_START).target	
			}
			case END: {
				parent.get(_END).target
			}
			default:{
				null
			}
		}	
	}
	
	override merge(ITypeAttributes attributes) {
		// currently not supported due to ambiguity where to join
	}
	
	def mergeELs(Collection<? extends INetworkEL> els, Collection<? extends INetworkEL> els2) {
		var result = new XHashSet(els)
		result.addAll(els2)
		result
	}
	
	override getSourceEL() {
		getSourceEL(AttributeSet.ALL)
	}
	
	def getSourceEL(AttributeSet set){
		switch (set){
			case ALL:{
				mergeELs(parent.get(_START).sourceEL, parent.get(_END).sourceEL) as Collection<? extends INodeEL>
			}
			case START:{
				parent.get(_START).sourceEL	
			}
			case END: {
				parent.get(_END).sourceEL
			}
			default:{
				null
			}
		}	
	}
	
	override getTargetEL() {
		getTargetEL(AttributeSet.ALL)
	}
	
	def getTargetEL(AttributeSet set){
		switch (set){
			case ALL:{
				mergeELs(parent.get(_START).targetEL, parent.get(_END).targetEL) as Collection<? extends INodeEL>
			}
			case START:{
				parent.get(_START).targetEL	
			}
			case END: {
				parent.get(_END).targetEL
			}
			default:{
				null
			}
		}	
	}
	
	override getAttrsEL() {
		getAttrsEL(AttributeSet.ALL)
	}
	
	def getAttrsEL(AttributeSet set){
		switch (set){
			case ALL:{
				mergeELs(parent.get(_START).attrsEL, parent.get(_END).attrsEL)  as Collection<? extends IRelationshipEL>
			}
			case START:{
				parent.get(_START).attrsEL	
			}
			case END: {
				parent.get(_END).attrsEL
			}
			default:{
				null
			}
		}	
	}
	
}