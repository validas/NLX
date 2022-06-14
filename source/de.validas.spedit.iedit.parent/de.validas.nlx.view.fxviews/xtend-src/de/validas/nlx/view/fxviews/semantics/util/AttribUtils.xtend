package de.validas.nlx.view.fxviews.semantics.util

import javafx.scene.layout.VBox
import org.neo4j.driver.v1.types.Node
import org.neo4j.driver.v1.types.Relationship
import javafx.scene.layout.HBox
import javafx.scene.control.Label
import javafx.scene.control.ComboBox

import static de.validas.nlx.constants.Neo4jConstants._NAME
import javafx.application.Platform

class AttribUtils {
	
	def static createAttrEntry(VBox box, Node source, Node target, Relationship relationship) {
		val hbox = new HBox()
		val label = new Label()
		val combo = new ComboBox()
		
		label.text = relationship.type
		combo.value = '''[«target.labels.get(0)»: «target.get(_NAME).asString»]'''
		if(Platform.fxApplicationThread){
			assign(label, combo, hbox, box)
		} else {
			Platform.runLater([|
				assign(label, combo, hbox, box)
			])
		}
	}
	
	def static assign(Label label, ComboBox<String> combo, HBox hbox, VBox box) {
		hbox.children.add(label)
		hbox.children.add(combo)
		box.children.add(hbox)
	}
	
}