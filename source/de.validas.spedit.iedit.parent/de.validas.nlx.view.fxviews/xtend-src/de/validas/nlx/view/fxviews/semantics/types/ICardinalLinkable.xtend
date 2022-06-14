/**
 * @author: Felix Schaller
 */

package de.validas.nlx.view.fxviews.semantics.types

import de.validas.nlx.view.fxviews.semantics.ILinkable
import de.validas.utils.data.types.XPair

/**
 * extends ILinkable for cardinal type forwarding
 */

interface ICardinalLinkable extends ILinkable {
	def ILinkable getBaseType()
	
	def XPair<String, ILinkable> getStart()
	
	def XPair<String, ILinkable> getEnd()
}