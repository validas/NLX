package de.validas.nlx.view.fxviews.semantics

import de.validas.nlx.view.fxviews.semantics.ILinkInfo
import org.neo4j.driver.v1.types.Node
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.internal.value.NullValue
import org.neo4j.driver.internal.value.ListValue
import org.neo4j.driver.v1.Record

class LinkInfo implements ILinkInfo {
	
	protected Record record
	
	new(Record rec) {
		this.record = rec
	}
	
	override getRecord(String key) {
		var value = record.get(key)
		switch (value){
			NodeValue:{
				value.asNode
			}
			NullValue:{
				null
			}
			ListValue:{
				value.asList
			}
			default: {
				null;
			}
		}
	}
	
	override getRecord() {
		record
	}
	
	
	
}