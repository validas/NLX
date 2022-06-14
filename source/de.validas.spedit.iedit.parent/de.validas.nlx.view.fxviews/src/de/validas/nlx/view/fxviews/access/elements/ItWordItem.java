/**
 * 
 */
package de.validas.nlx.view.fxviews.access.elements;

import static de.validas.nlx.dictionary.constants.DictionaryConstants._IT_WORD;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.nlx.view.fxviews.semantics.ILinkable;
import de.validas.nlx.view.fxviews.semantics.types.LiteralType;
import de.validas.spedit.naturalLang.ItWord;

/**
 * @author schaller
 *
 */
public class ItWordItem extends BasicItem {
	
	protected static final String CSS_CLASS = "panelYellow";
	protected String name;

	/**
	 * @param el
	 */
	protected ItWordItem(ItWord el) {
		super(el);
		if (el instanceof ItWord) {
			this.name = IterableExtensions.join(((ItWord) el).getWord(), "");
			this.type = new LiteralType(_IT_WORD, (ILinkable) parent);
		}
	}

	public static IItem create(ItWord el) {
		return new ItWordItem(el);
	}
	

	@Override
	public boolean hasComboBox() {
		return false;
	}

	@Override
	public String getCssClass() {
		return CSS_CLASS;
	}

	@Override
	public String getName() {
		
		return name;
	}


}
