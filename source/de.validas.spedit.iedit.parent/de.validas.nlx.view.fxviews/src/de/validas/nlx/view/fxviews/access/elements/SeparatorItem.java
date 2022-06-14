/**
 * 
 */
package de.validas.nlx.view.fxviews.access.elements;

import static de.validas.nlx.view.fxviews.access.ItemType.SEPARATOR;

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

/**
 * @author schaller
 *
 */
public class SeparatorItem extends TerminalItem {
	
	protected static final String CSS_CLASS = "panelDRed"; //TODO: externalize this
	
	//protected String separator;

	/**
	 * @param el
	 */
	public SeparatorItem(Elements el, String separator, IDictionaryAccess dictAccess) {
		super(el, new InterpunctionType(el, SEPARATOR, separator, dictAccess), TokenPosition.INTERMEDIATE);
		//this.separator = separator;
		//this.type = new InterpunctionType(el, SEPARATOR, separator, dictAccess);
	}

	
	@Override
	public String getCssClass() {
		return CSS_CLASS;
	}

	@Override
	public String getName() {
		return ((InterpunctionType)type).getCathegory().name();
	}


//	@Override
//	public Node instantiateTypes() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ITypeHierarchy> getWordTypes() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * static factory method
	 * @param separator
	 * @param dictAccess
	 * @return
	 */
	public static IItem create(String separator, IDictionaryAccess dictAccess) {
		return new SeparatorItem(null, separator, dictAccess);
	}

}
