package de.validas.spedit.validation.semantics.token

import java.util.List
import de.validas.utils.data.types.XPair
import org.eclipse.emf.ecore.EObject
import de.validas.spedit.validation.semantics.ITokenNode

interface ITokenChain {
	
	def List<XPair<EObject, String>> getPattern()
	
	def boolean hasNext()
	def boolean inBounds()
	
	def XPair<Integer,Integer> nextIndex()
	
	def XPair<Integer,Integer> getNextIndex()
	
	def String getTokenOnIndex(XPair<Integer,Integer> myIndex)

	def int setIndex(int index)
	
	def XPair<Integer,Integer> getIndex()
	
	def XPair<EObject, String> getFullMatch()
	
	def ITokenNode assignTokenPointer(ITokenNode token, XPair<Integer, Integer> index)
	
//	def String getMatch()
	
	def boolean isContraction()
	
	def boolean isValid()
	
}
