package de.validas.nlx.view.fxviews.semantics

import org.neo4j.driver.v1.types.Node
import org.neo4j.driver.v1.Value
import org.neo4j.driver.v1.Record

interface ILinkInfo {
	def Object getRecord(String key)
	
	def Record getRecord()
}