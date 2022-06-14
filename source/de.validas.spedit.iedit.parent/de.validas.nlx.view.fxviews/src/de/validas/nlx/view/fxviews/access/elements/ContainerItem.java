/**
 * (c)2021 felixschaller.com
 */
package de.validas.nlx.view.fxviews.access.elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.neo4j.driver.v1.types.Node;

import de.validas.nlx.dictionary.DictItem;
import de.validas.nlx.dictionary.IDictionaryAccess;
import de.validas.nlx.dictionary.type.ITypeAttributes;
import de.validas.nlx.view.fxviews.access.EObjectPanelAccessor;
import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.nlx.view.fxviews.access.IPanelsAccessor;
import de.validas.nlx.view.fxviews.access.WordPanelAccessor;
import de.validas.nlx.view.fxviews.semantics.ILink;
import de.validas.nlx.view.fxviews.semantics.ILinkInfo;
import de.validas.nlx.view.fxviews.semantics.ILinkObj;
import de.validas.nlx.view.fxviews.semantics.ILinkType;
import de.validas.nlx.view.fxviews.semantics.ILinkable;
import de.validas.nlx.view.fxviews.semantics.types.CompoundType;
import de.validas.nlx.view.fxviews.views.SemanticViewSelector;
import de.validas.nlx.view.fxviews.visual.ContainerPanel;
import de.validas.spedit.naturalLang.AllElements;
import de.validas.spedit.naturalLang.BracketSentence;
import de.validas.spedit.naturalLang.Word;

import static de.validas.nlx.constants.Neo4jConstants._LINK;
import static de.validas.nlx.constants.Neo4jConstants._MID;
import static de.validas.nlx.dictionary.constants.NodeConstants._T_YPE;

/**
 * @author schaller
 *
 */
public class ContainerItem extends TypedItem {

	/**
	 * @param el
	 */
	protected IPanelsAccessor panelsAccessor;
	protected String cssClass = null;
	private IDictionaryAccess dictAccess;
	 
	
	public ContainerItem(AllElements el, String cssClass, IDictionaryAccess dictAccess) {
		super(el);
		this.cssClass = cssClass;
		this.type = new CompoundType(el.eClass().getName(), (ILinkable) parent);
		this.dictAccess = dictAccess;
		
		//TODO: create Factory for this 
		if (el instanceof BracketSentence) {
			
			panelsAccessor = new EObjectPanelAccessor(SemanticViewSelector.createSentenceContext(((BracketSentence)el).getBrackedSentences()), dictAccess);
		} else if (el instanceof Word) {
			panelsAccessor = new WordPanelAccessor((Word) el, dictAccess);
		}
	}

	/**
	 * @return the panelsAccessor
	 */
	public IPanelsAccessor getPanelsAccessor() {
		return panelsAccessor;
	}

	/* (non-Javadoc)
	 * @see de.validas.nlx.view.fxviews.access.IItem#hasComboBox()
	 */
	@Override
	public boolean hasComboBox() {
		return false;
	}

	/* (non-Javadoc)
	 * @see de.validas.nlx.view.fxviews.access.IItem#getCssClass()
	 */
	@Override
	public String getCssClass() {
		return cssClass ;
	}

	/**
	 * creates Name
	 * @return the name
	 */
	@Override
	public String getName() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.element.eClass().getName());
		sb.append(": ");
		Function1<IItem, String> method = (IItem n) -> n.getName();
		sb.append(generateContent(method));
		return sb.toString(); 
	}
	
	@Override
	public String getLabel() {
		return generateContent(n -> n.getLabel());
	}
	
	private String generateContent(Function1<IItem, String> delegate) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (int i = 0; i < panelsAccessor.size(); i++) {
			if(!first) {
				sb.append(" ");
			}
			IItem token = panelsAccessor.getToken(i);
			sb.append(delegate.apply(token));	
			first = false;
		}
		return sb.toString();
	}
	
	/**
	 * @return the el
	 */
	public EObject getElement() {
		return element;
	}
	
	@Override
	public ILinkType getInternalType() {
		return type;
	}

	/**
	 * Factory Method for Class ContainerItem
	 * @param el
	 * @param cssClass 
	 * @return The Container
	 */
	public static IItem create(AllElements el, String cssClass, IDictionaryAccess dictAccess) {
		return new ContainerItem(el, cssClass, dictAccess);
	}
	
	@Override
	public DictItem generateTokenInfo() {
		List<ILinkable> inner = ((ContainerPanel)getParent()).getInnerLink();
		if (inner.size() > 0) {
			ILinkable primaryInner = inner.get(0);
			ILinkInfo record = ((ILink)primaryInner).getLinkInfo();
			if (record!=null) {
				Node node = record.getRecord().get(_LINK).asNode();
				//String midType = node.get(_MID +_T_YPE).asString(); 
				return new DictItem(getLabel(), getInternalType().getName(), primaryInner.getName(), node.id());
			}
		}
		return null;
	}


	@Override
	public void postProcess(ILinkObj precessor, List<ITypeAttributes> attribs) {
		// TODO: 07.04.22 require postProcess
		IItem token = ((ILinkObj) parent).getToken();
		
		if (type != null){			// check links per type - not globally
			if (precessor != null){
				ArrayList<ITypeAttributes> intAttribs = new ArrayList<ITypeAttributes>(attribs);
				IItem pT = precessor.getToken();
				
				Set<String> types = Collections.singleton(element.eClass().getName()); //Word
				List<ILinkable> inner = ((ContainerPanel)token.getParent()).getInnerLink();
				if (inner!=null && !inner.isEmpty())
					for (ILinkable inLink : inner) {
						ILinkInfo record = ((ILink)inLink).getLinkInfo();
						if (record!=null) {
							Node node = record.getRecord().get(_LINK).asNode();
							String midType = node.get(_MID +_T_YPE).asString();  //TODO: 13.04.22 provisional. must work for all attributes later.
							dictAccess.addSuccessor(pT.generateTokenInfo(), new DictItem(token.getInternalType().getName(), inLink.getName(), midType, node.id()), types, intAttribs);
						}
					}
			}
			
		}
	}
	

}
