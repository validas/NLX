/**
 * 
 */
package de.validas.nlx.view.fxviews.access.elements;

import static de.validas.nlx.view.fxviews.semantics.constants.WebTypeConstants._EMAIL;
import static de.validas.nlx.view.fxviews.semantics.constants.WebTypeConstants._URL;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.nlx.view.fxviews.semantics.types.WebType;
import de.validas.spedit.naturalLang.MailAdress;
import de.validas.spedit.naturalLang.NoNElement;
import de.validas.spedit.naturalLang.UrlAdress;

/**
 * @author schaller
 *
 */
public class WebItem extends BasicItem implements IItem {

	/**
	 * @param el
	 */
	public WebItem(NoNElement el) {
		super(el);
		if(el instanceof UrlAdress) {
			this.name = IterableExtensions.join(((UrlAdress)el).getUrl(), "");
			this.type = new WebType(_URL);
		} else if (el instanceof MailAdress) {
			this.name = IterableExtensions.join(((MailAdress) el).getEmail(), "");
			this.type = new WebType(_EMAIL);
		}
	}

	public static IItem create(NoNElement el) {
		return new WebItem(el);
	}

}
