package de.validas.spedit.validation.semantics.token

import de.validas.spedit.naturalLang.Elements
import de.validas.spedit.naturalLang.Word
import de.validas.spedit.validation.semantics.ITokenNode
import de.validas.utils.data.types.XPair
import java.util.List
import org.eclipse.emf.ecore.EObject

import static de.validas.nlx.dictionary.constants.NodeConstants._APOSTROPH

/**
 * 
 */
class TokenChain implements ITokenChain {
	// TODO replace Xpair by a token class interface
	protected XPair<Integer, Integer> index = new XPair(0, 0)
	protected List<XPair<EObject, String>> pattern

	new(List<XPair<EObject, String>> list) {
		this.pattern = list
	}

	new(List<XPair<EObject, String>> list, XPair<Integer, Integer> index) {
		pattern = list
		this.index = index
	}

	new(ITokenChain chain, XPair<Integer, Integer> index) {
		pattern = chain.pattern
		this.index = index
	}

	override List<XPair<EObject, String>> getPattern() {
		return this.pattern;
	}

	override XPair<Integer, Integer> getNextIndex() {
		var XPair<Integer, Integer> result = new XPair(index.key, index.value)
		if (hasNext()) {
			if (isContraction) {
				if (result.value == 0) {
					result.value = 1
				} else {
					result.value = 0
					result.key = result.key + 1 // ++?
				}
				return result
			}
			result.key = result.key + 1
			return result;
		} else
			throw new IndexOutOfBoundsException
	}

	override String getTokenOnIndex(XPair<Integer, Integer> myIndex) {
		var EObject element = pattern.get(myIndex.key).key
		if (element instanceof Word) {
			var segments = element.word //TODO: word is now in segments... consider to rewrite
			return segments.get(myIndex.value) // out of Bounds check missing if value > 0 and no contraction
		} else if (element instanceof Elements)
			return "" // temporary
			// TODO: return NlxUtils.getContent(element)
		return null
	}

	override XPair<Integer, Integer> nextIndex() {
		index = getNextIndex
	}

	override int setIndex(int index) {
		return this.index = index;
	}

	override XPair<Integer, Integer> getIndex() {
		return this.index;
	}

	override boolean hasNext() { // TODO: hasNext inappropriate should be: insideBounds()
		if (index.key < (pattern.size - 1))
			return true
		else if (index.key == pattern.size - 1 && isContraction && index.value == 0) {
			// handle rare exception that last word is a contraction
			return true
		}
		false
	}

	override boolean inBounds() {
		if (index.key < (pattern.size))
			return true
		false
	}

	// TODO consider pass reference
	override toString() {
		getTokenOnIndex(index)
	}

	override boolean isContraction() {
		var EObject element = pattern.get(index.key).key
		if (element instanceof Word) {
			return element.word.join.contains(_APOSTROPH)
		}
		false
	}

	override XPair<EObject, String> getFullMatch() {
		pattern.get(index.key)
	}

	// maybe not the right place for this method 
	override assignTokenPointer(ITokenNode token, XPair<Integer, Integer> index) {
		token.setChain = new TokenChain(this, index)
		if (token.chain.toString === null)
			return null
		token
	}

	override isValid() {
		//TODO: to be replaced in future when tokenChain is replaced by direct document access
		if (toString === null) return false
		return true
	}
}
