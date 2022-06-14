/**
 * @author: Felix Schaller
 */

package de.validas.nlx.view.fxviews.semantics

import java.util.List
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants._LOW_LINK
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants._DISABLED
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants._LINK
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants._DASHED
import java.util.ArrayList

class LinkStyle {
	/**
	 * defines the character of the link. for style and for attribution
	 */
	
	public static final LinkStyle CLEAR = new LinkStyle(#[]) 			// Prototypes. must be instantiated - not assigned!
	public static final LinkStyle LINK = new LinkStyle(#[_LINK])
	public static final LinkStyle DISABLED = new LinkStyle(#[_DISABLED])
	public static final LinkStyle LOW_LINK = new LinkStyle(#[_LOW_LINK])
	public static final LinkStyle DASHED = new LinkStyle(#[_DASHED])
	
	protected List<String> styleClasses
	
	private new (List<String> styleClasses){
		this.styleClasses = styleClasses
	}
	
	def getClasses(){
		styleClasses
	}
	
	def add(LinkStyle style) {
		var cls = new ArrayList(style.classes)
		cls.addAll(0, styleClasses)
		//styleClasses.addAll(cls)
		styleClasses = cls
	}
	
	def replaceStyle(LinkStyle oldStyle, LinkStyle newStyle) {
		var olcls = oldStyle.classes
		if (styleClasses.containsAll(olcls)){
			var cls = new ArrayList(styleClasses)
			cls.removeAll(olcls)
			styleClasses = cls
			add(newStyle)
		}
	}
	
	def static create(LinkStyle style) {
		return new LinkStyle(new ArrayList(style.classes))
	}
	
	def static create(List<String> styleClasses) {
		return new LinkStyle(new ArrayList(styleClasses))
	}
	
	def boolean contains(LinkStyle style) {
		return styleClasses.containsAll(style.classes)
	}
	
	//TODO: 14.03.2022 add remove method 
	
}