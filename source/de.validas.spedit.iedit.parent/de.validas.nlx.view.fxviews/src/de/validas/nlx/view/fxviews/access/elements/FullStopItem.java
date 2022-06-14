/**
 * 
 */
package de.validas.nlx.view.fxviews.access.elements;


import static de.validas.nlx.view.fxviews.access.ItemType.FULLSTOP;

import java.util.Collections;
import java.util.List;

import de.validas.nlx.dictionary.IDictionaryAccess;
import de.validas.nlx.dictionary.type.ITypeAttributes;
import de.validas.nlx.dictionary.type.ITypeHierarchy;
import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.nlx.view.fxviews.semantics.ILinkObj;
import de.validas.nlx.view.fxviews.semantics.types.InterpunctionType;
import de.validas.spedit.naturalLang.Elements;
import javafx.scene.Node;

import static de.validas.nlx.view.fxviews.semantics.constants.GrammarConstants._FULL_STOP;

/**
 * @author schaller
 *
 */
public class FullStopItem extends TerminalItem {
	
	protected static final String CSS_CLASS = "panelDRed";
	//private IDictionaryAccess dictAccess;

	/**
	 * @param el
	 */
	protected FullStopItem(Elements el, IDictionaryAccess dictAccess) {
		super(el, new InterpunctionType(el, FULLSTOP, dictAccess), TokenPosition.INTERMEDIATE);
	}

	public static IItem create(IDictionaryAccess dictAccess) {
		return new FullStopItem(null, dictAccess);
	}

	@Override
	public String getCssClass() {
		return CSS_CLASS;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ITypeHierarchy> getWordTypes() {
		return Collections.EMPTY_LIST;
	}

}
