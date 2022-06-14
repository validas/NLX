/**
 * 
 */
package de.validas.nlx.view.fxviews.access.elements;

import de.validas.nlx.dictionary.IDictionaryAccess;
import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.spedit.naturalLang.Word;

/**
 * @author schaller
 *
 */
public class FragmentItem extends WordItem {

	// protected String fragment;

	/**
	 * @param el
	 * @param dictAccess
	 */
	public FragmentItem(Word el, String fragment, IDictionaryAccess dictAccess) {
		super(el, dictAccess);
		this.name = fragment;
	}

	@Override
	public String getCssClass() {
		// set default color
		return null;
	}

	public static IItem create(Word el, String fragment, IDictionaryAccess dictAccess) {
		FragmentItem item = new FragmentItem(el, fragment, dictAccess);
		item.loadDictionary();
		return item;
	}

}
