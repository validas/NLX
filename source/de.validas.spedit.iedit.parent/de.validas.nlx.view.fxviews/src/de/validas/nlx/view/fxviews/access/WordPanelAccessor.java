/**
 * 
 */
package de.validas.nlx.view.fxviews.access;

import de.validas.nlx.dictionary.IDictionaryAccess;
import de.validas.nlx.view.fxviews.access.elements.FragmentItem;
import de.validas.nlx.view.fxviews.access.elements.SeparatorItem;
import de.validas.spedit.naturalLang.Word;

/**
 * @author schaller
 *
 */
public class WordPanelAccessor extends EMFPanelAccessor {

	/**
	 * @param dictAccess 
	 * @param el 
	 * 
	 */
	protected Word element;
	
	public WordPanelAccessor(Word el, IDictionaryAccess dictAccess) {
		super(dictAccess);
		if (el!=null) {
			this.element = el;	
			createElements(this.element);
		}
	}
	
protected void createElements(Word element) {
	if (element == null) return;	
		for (String el : element.getWord()) {
			if (el.matches("[a-zA-Z]+")) {  //TODO: 06.10.21 should be identified by element class not regex
				tokenChain.add(FragmentItem.create(element, el, dictAccess));
			} else {
				tokenChain.add(SeparatorItem.create(el, dictAccess));
			}
			 
		}
		
	}

}
