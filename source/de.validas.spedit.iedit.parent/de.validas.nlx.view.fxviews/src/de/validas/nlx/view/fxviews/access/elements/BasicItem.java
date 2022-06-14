/**
 * 
 */
package de.validas.nlx.view.fxviews.access.elements;

import static de.validas.nlx.dictionary.constants.DictionaryConstants._IGNORED_TEXT;
import static de.validas.nlx.dictionary.constants.DictionaryConstants._QUOTE;
import static de.validas.nlx.dictionary.constants.DictionaryConstants._SYMBOLS;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.validas.nlx.dictionary.DictItem;
import de.validas.nlx.dictionary.type.ITypeAttributes;
import de.validas.nlx.dictionary.type.ITypeHierarchy;
import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.nlx.view.fxviews.semantics.ILinkObj;
import de.validas.nlx.view.fxviews.semantics.ILinkType;
import de.validas.nlx.view.fxviews.semantics.ILinkable;
import de.validas.nlx.view.fxviews.semantics.types.LiteralType;
import de.validas.spedit.naturalLang.AllElements;
import de.validas.spedit.naturalLang.IgnoredText;
import de.validas.spedit.naturalLang.Quote;
import de.validas.spedit.naturalLang.Symbols;
import de.validas.utils.data.types.XPair;
import javafx.scene.Node;


/**
 * @author schaller
 *
 */
public class BasicItem extends AbstractItem {
	
	//protected static final String CSS_CLASS = "";
	
	protected String name;
	
	/**
	 * @param el
	 */
	protected BasicItem(EObject el) {
		super(el);
		if (el instanceof IgnoredText) {
			this.name = ((IgnoredText)el).getIgnored();
			this.type = new LiteralType(_IGNORED_TEXT, (ILinkable) parent);
		} else if (el instanceof Symbols) {
			this.name = ((Symbols)el).getSymbol();
			this.type = new LiteralType(_SYMBOLS, (ILinkable) parent);
		}else if (el instanceof Quote) {
			this.name = ((Quote)el).getQuote();	
			this.type = new LiteralType(_QUOTE, (ILinkable) parent);
		}
	}

	/** (non-Javadoc)
	 * @see de.validas.nlx.view.fxviews.access.elements.AbstractItem#getItems()
	 */
//	@Override
//	public List<String> getItems() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	/** (non-Javadoc)
	 * @see de.validas.nlx.view.fxviews.access.elements.AbstractItem#getName()
	 */
	@Override
	public String getName() {
		
		return name;
	}

	public static IItem create(AllElements el) {
		return new BasicItem(el);
	}

	@Override
	public boolean hasComboBox() {
		return false;
	}

	@Override
	public String getCssClass() {
		return null; 
	}

	@Override
	public ILinkType getInternalType() {
		return type;
	}
	
	@Override
	public String toString() {
		return String.format("name: \"%s\" type: \"%s\"", name, type.toString());
	}

	@Override
	public Node instantiateTypes() {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ITypeHierarchy> getWordTypes() {
		return Collections.EMPTY_LIST;
	}

	@Override
	public void newType() {
		//Stub
	}

	@Override
	public void postProcess(ILinkObj precessor, List<ITypeAttributes> attribs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<XPair<String, ITypeAttributes>> getTypes() {
		return null;
	}

	@Override
	public org.neo4j.driver.v1.types.Node getBaseNode() {
		return null;
	}

	@Override
	public DictItem generateTokenInfo() {
		return null;
	}

	@Override
	public String getLabel() {
		return name;
	}

}
