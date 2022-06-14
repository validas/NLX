/**
 * 
 */
package de.validas.spedit.ui.editor;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.validas.spedit.naturalLang.util.NaturalLangAdapterFactory;
import de.validas.spedit.ui.editor.provider.NlxEObjectNodeItemProvider;
import de.validas.spedit.ui.editor.provider.NlxPropertyValueWrapper;

/**
 * @author Felix Schaller
 *
 */
public class NlxEObjectNodeAdapterFactory implements IPropertySourceProvider {
	
	private static final Class<?> IItemPropertySourceClass = IItemPropertySource.class;
	
	@Inject
	@Named("nlxAdapterFactory")
	AdapterFactory adapterFactory;

	@Inject
	@Named("EObjectAdapterFactory")
	protected AdapterFactory eObjectAdapterFactory;
	
	@Override
	public IPropertySource getPropertySource(Object object) {
		IItemPropertySource itemPropertySource = null;
		
		
		Object adapter = adapterFactory;
		
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		} else if (object instanceof EObjectNode) {
			itemPropertySource = new NlxEObjectNodeItemProvider(adapterFactory, eObjectAdapterFactory, object);
		} else if (object instanceof NlxPropertyValueWrapper) {
			Object propertyValue = ((NlxPropertyValueWrapper) object).getPropertyValue(object);
			if ( propertyValue instanceof Notifier) {
				
				itemPropertySource =
				        (IItemPropertySource)
				          (object instanceof EObject && ((EObject)object).eClass() == null ?
				            null :
				            eObjectAdapterFactory.adapt(propertyValue, IItemPropertySourceClass));
				
				return itemPropertySource != null ?  
				       createPropertySource(propertyValue, itemPropertySource) : null;
//				
				
//				if (eObjectAdapterFactory !=null) {
//					Object adapter_temp = eObjectAdapterFactory.adapt(Notifier.class, propertyValue);
//					if (adapter_temp != null) 
//						adapter = adapter_temp;
//				}
				
//				itemPropertySource = new NlxEObjectNodeItemProvider(adapterFactory, eObjectAdapterFactory, object);
			}
		}else {
			
			itemPropertySource = new NlxPropertyValueWrapper((AdapterFactory) adapter, object, null, null);
//					NlxEObjectNodeItemProvider(new NaturalLangAdapterFactory(), object);

			
		}
		return itemPropertySource != null ? createPropertySource(object, itemPropertySource) : null;
	}

	protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource) {
		return new PropertySource(object, itemPropertySource);
	}

	public String getText(Object object) {
		if (object instanceof EList<?>) {
			StringBuffer result = new StringBuffer();
			for (Object child : ((List<?>) object)) {
				if (result.length() != 0) {
					result.append(", ");
				}
				result.append(getText(child));
			}
			return result.toString();
		} else if (object instanceof EObjectNode) {

			return (String) ((EObjectNode) object).getText();
			//
//			IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory.adapt(object,
//					IItemLabelProvider.class);
//
//			return itemLabelProvider != null ? itemLabelProvider.getText(object)
//					: object == null ? "" : object.toString();
		} else {
			return object.toString();

		}
	}
}
