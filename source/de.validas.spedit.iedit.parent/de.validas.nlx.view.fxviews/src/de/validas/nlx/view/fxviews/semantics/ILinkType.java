package de.validas.nlx.view.fxviews.semantics;

import java.util.HashMap;
import java.util.List;

import de.validas.nlx.dictionary.type.ITypeAttributes;
import de.validas.nlx.dictionary.type.ITypeInfo;
import de.validas.nlx.view.fxviews.access.ItemType;
import de.validas.utils.data.types.XPair;

public interface ILinkType {
	public String getName();
	public String getNameClamped();
	public void setParent(ILinkable nodePanel);
	public ILinkable getParent();
	public void newType();
	public int getSelection();
	public void setSelection(int selection);
	public HashMap<String, List<ILink>> getLinks();
	public List<ILink> getSelectedLink();
	public void postProcess(ILinkObj precessor, List<ITypeAttributes> attribs);
	public XPair<String, ITypeAttributes> getBaseType();
	public List<XPair<String, ITypeAttributes>> getTypeEls();
	public ITypeInfo getTypeInfo(); 
	//public String getType();
}
