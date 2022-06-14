/**
 * 
 */
package de.validas.nlx.view.fxviews.access.elements;

import static de.validas.nlx.dictionary.constants.DictionaryConstants._QUOTE;

import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.nlx.view.fxviews.semantics.ILinkable;
import de.validas.nlx.view.fxviews.semantics.types.LiteralType;
import de.validas.spedit.naturalLang.Quote;

/**
 * @author schaller
 *
 */
public class QuoteItem extends BasicItem implements IItem {

	/**
	 * @param el
	 */
	protected QuoteItem(Quote el) {
		super(el);
		this.name = el.getQuote();
		this.type = new LiteralType(_QUOTE, (ILinkable) parent);
	}
	
	/**
	 * Factory for Class
	 * @param el
	 * @return QuoteItem
	 */
	public static IItem create(Quote el) {
		return new QuoteItem(el);
	}

}
