package de.validas.spedit.validation.semantics

import de.validas.spedit.validation.semantics.token.ITokenChain

interface ITokenNode {
	
	def void setChain(ITokenChain pattern) 
	
	def ITokenChain getChain() 
	
}