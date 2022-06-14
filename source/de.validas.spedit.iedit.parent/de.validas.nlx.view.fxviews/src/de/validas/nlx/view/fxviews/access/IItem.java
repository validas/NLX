/**
 * 
 */
package de.validas.nlx.view.fxviews.access;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.validas.nlx.dictionary.type.ITypeAttributes;
import de.validas.nlx.dictionary.type.ITypeHierarchy;
import de.validas.nlx.view.fxviews.semantics.ILink;
import de.validas.nlx.view.fxviews.semantics.ILinkObj;
import de.validas.nlx.view.fxviews.semantics.ILinkType;
import de.validas.spedit.naturalLang.AllElements;
import de.validas.utils.data.types.XPair;
import javafx.scene.Node;
import de.validas.nlx.dictionary.DictItem;

/**
 * @author schaller
 *
 */
public interface IItem {

	String getName();
	
	String getLabel();

	String getSelectedItem();

	@Deprecated
	boolean hasComboBox();

	String getCssClass();

	void setParent(IJavaFxObj nodePanel);
	
	IJavaFxObj getParent();

	ILinkType getInternalType();
	
	EObject getElement();

	Node instantiateTypes();
	
	void postProcess(ILinkObj precessor, List<ITypeAttributes> attribs);

	void newType();

	void setLinkTo(String type, ILink link);

	public abstract Collection<? extends ITypeHierarchy> getWordTypes();

	List<XPair<String, ITypeAttributes>> getTypes();
	
	public abstract org.neo4j.driver.v1.types.Node getBaseNode();

	public abstract DictItem generateTokenInfo();

	public abstract long generateID();

}
