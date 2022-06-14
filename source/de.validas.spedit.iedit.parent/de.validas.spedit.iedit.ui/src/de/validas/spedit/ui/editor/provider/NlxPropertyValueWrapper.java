package de.validas.spedit.ui.editor.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;

public class NlxPropertyValueWrapper extends PropertyValueWrapper {

	public NlxPropertyValueWrapper(AdapterFactory adapterFactory, Object object, Object propertyValue,
			Object nestedPropertySource) {
		super(adapterFactory, object, propertyValue, nestedPropertySource);
		
		this.itemDelegator = new NlxAdapterFactoryItemDelegator(adapterFactory);
	}
	
	@Override
	public Object getEditableValue(Object object) 
	  {
	    return object;
	  }
	
	public Object getPropertyValue(Object object) 
	  {
	    return propertyValue;
	  }

}
