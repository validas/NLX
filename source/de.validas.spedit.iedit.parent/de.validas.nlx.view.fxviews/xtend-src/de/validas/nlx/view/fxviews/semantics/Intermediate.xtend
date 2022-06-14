package de.validas.nlx.view.fxviews.semantics

import de.validas.spedit.naturalLang.AllElements
import de.validas.spedit.naturalLang.BracketSentence
import de.validas.spedit.naturalLang.ExtBracketSentence
import de.validas.spedit.naturalLang.impl.WordImpl
import de.validas.nlx.view.fxviews.semantics.types.InterpunctionType
import org.eclipse.emf.ecore.EObject

class Intermediate {
	protected EObject element = null
	protected ILinkContainer container = null
	protected ILinkType type
	 
	new(ILinkType type, EObject element){
		this.element = element
		this.type = type
	}
	
	new(ILinkContainer container){
		this.container = container
	}
	
	def String generate(String attr) {
		var String value
		if (element !== null){
			value = element.eClass.name
		} 
		if (container !== null) { // this control structure looks odd but has a reason
			switch el: container.token.element {
				WordImpl:{
					return null
				}
				ExtBracketSentence,
				BracketSentence:{
					value = el.eClass.name
				}
				
			}
		} else {
			switch (type){
				InterpunctionType:{
					return  type.generate(attr)  
				}
				default:{
					value = type.name
				}	
			}
		}
		'''«attr»:"«value»"'''
	}
	
	def getType() {
		type
	}
	
	def getContainer() {
		container
	}
		
	
}