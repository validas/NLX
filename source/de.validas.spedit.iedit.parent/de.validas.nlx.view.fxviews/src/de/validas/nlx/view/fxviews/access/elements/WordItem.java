/**
 * 
 */
package de.validas.nlx.view.fxviews.access.elements;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

import de.validas.nlx.dictionary.IDictionaryAccess;
import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.spedit.naturalLang.AllElements;
import de.validas.spedit.naturalLang.Word;
import de.validas.spedit.naturalLang.WordShort;

/**
 * @author schaller
 *
 */
public class WordItem extends ShortCutItem {

	/**
	 * @param el
	 * @param dictAccess 
	 */
	protected WordItem(WordShort el, IDictionaryAccess dictAccess) {
		super(el, dictAccess);
		if (el instanceof Word)
			this.name = IterableExtensions.join(((Word) el).getWord(), "");
	}

	public static IItem create(WordShort el, IDictionaryAccess dictAccess) {
		if (el instanceof Word && ((Word)el).getWord().size() > 1) {
			return ContainerItem.create((AllElements) el, CSS_CLASS, dictAccess);
		} else {
			WordItem item = new WordItem(el, dictAccess);
			item.loadDictionary();
			return item;
		}
	}

}
