/**
 * 
 */
package de.validas.spedit.ui.editor.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.TextRegion;

/**
 * @author Felix Schaller
 *
 */
public class NlxAdapterFactoryItemDelegator extends AdapterFactoryItemDelegator {

	/**
	 * @param adapterFactory
	 */
	public NlxAdapterFactoryItemDelegator(AdapterFactory adapterFactory) {
		super(adapterFactory);
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		if (object instanceof List<?>)
	    {
	      StringBuffer result = new StringBuffer();
	      for (Object child : ((List<?>)object))
	      {
	        if (result.length() != 0)
	        {
	          result.append(", ");
	        }
	        result.append(getText(child));
	      }
	      return result.toString();
	    } else if (object instanceof StyledString) {
	    	
	    	return object.toString();
	    	
	    } else if (object instanceof URI) {
	    	return object.toString();
	    
	    } else if (object instanceof EObjectNode) {	
	    	return ((StyledString) ((EObjectNode)object).getText()).getString();
	    } else if (object instanceof TextRegion) {	
	    	return object.toString();
	    } else if (object instanceof DocumentRootNode) {	
	    	return (String) ((DocumentRootNode)object).getText();
	    } else {
	      //
	      IItemLabelProvider itemLabelProvider = (IItemLabelProvider)adapterFactory.adapt(object, IItemLabelProvider.class);
	  
	      return
	        itemLabelProvider != null ?
	          itemLabelProvider.getText(object) :
	          object == null ?
	            "" :
	            object.toString();
	    }
	}

	
}
