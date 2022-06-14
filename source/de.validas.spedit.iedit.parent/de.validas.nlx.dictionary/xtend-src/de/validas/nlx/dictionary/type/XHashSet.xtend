/**
 * Extended Hash Set for INetworkEL types
 * 
 * 
 */

package de.validas.nlx.dictionary.type

import de.validas.nlx.dictionary.type.elements.INetworkEL
import java.util.Collection
import java.util.HashSet

class XHashSet<E extends INetworkEL> extends HashSet<E> {
	
	boolean internalCall = false
	
	new(){
		super()
	}
	
	new(Collection<? extends E> els) {
		super(els)
	}
	
	override add(E el) {
		if (!internalCall) //only do this if call is external not internal to avoid double-check
			for (x : toArray) {
				if (x instanceof INetworkEL) {
					if (el.ID.equals(x.ID))
						return false
				}
			}
		return super.add(el)
	}

	override addAll(Collection<? extends E> elms) {
		var remain = new HashSet<INetworkEL>(elms)
		for (x : toArray) {
			if (x instanceof INetworkEL)
				compareInner(x, remain)
		}
		internalCall = true; // avoid double set check in overriden class, ensure to directly call super class
		super.addAll(remain as Collection<? extends E>)
		internalCall = false;
	}

	def compareInner(INetworkEL x, HashSet<INetworkEL> remain) { // workaround for missing "Break" in xtend and to avoid ModificationInvocationException
		for (el : remain) {
			if (el.ID.equals(x.ID)) {
				x.mergeRel(el)
				remain.remove(el) // remove existing IDs
				return remain
			}
		}
	}
}
