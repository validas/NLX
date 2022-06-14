/**
 * 
 */
package de.validas.nlx.view.fxviews.access.elements;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.validas.nlx.dictionary.type.ITypeAttributes;
import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.nlx.view.fxviews.access.IJavaFxObj;
import de.validas.nlx.view.fxviews.semantics.ILink;
import de.validas.nlx.view.fxviews.semantics.ILinkType;
import de.validas.nlx.view.fxviews.semantics.ILinkable;
import de.validas.spedit.naturalLang.AllElements;
import de.validas.utils.data.types.XPair;

/**
 * @author schaller
 *
 */
public abstract class AbstractItem implements IItem {

	protected EObject element;
	protected IJavaFxObj parent;
	protected ILinkType type;
	/**
	 * Abstract Class for Items
	 */
	public AbstractItem(EObject el) {
		this.element = el;
	}
	
	@Override
	public abstract String getName();

	@Override
	public String getSelectedItem() {
		
		return null;
	}

//	@Override
//	public void setSelectionChangedListener(ChangeListener<? super String> listener) {
//
//	}

//	@Override
//	public ChangeListener<? super String> getSelectionChangedListener() {
//		return null;
//	}
	
	@Override
	public void setParent(IJavaFxObj nodePanel) {
		this.parent = nodePanel;
		if (type!= null)
			this.type.setParent((ILinkable) nodePanel);  //TODO: 01.03.22 parent should be Item not Panel
	}
	
	@Override
	public IJavaFxObj getParent( ) {
		return parent;
	}
	
	@Override
	public ILinkType getInternalType() {
		return type;
	}
	
	@Override
	public String toString() {
		return type.toString();
	}

	/**
	 * @return the element
	 */
	public EObject getElement() {
		return element;
	}
	
	@Override
	public void newType() {
		//stub
	}
	
	@Override
	public long generateID() {
		org.neo4j.driver.v1.types.Node node = getBaseNode();
		if (node == null) return -1;
		
		return node.id();
		
	}
	
	@Override
	public void setLinkTo(String type, ILink link) {
		//stub
	}
	
	public abstract List<XPair<String, ITypeAttributes>> getTypes();

}
