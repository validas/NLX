/**
 * 
 */
package de.validas.spedit.ui.editor.provider;

import java.lang.reflect.Field;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IPropertyEditorFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

/**
 * @author Felix Schaller
 *
 */
public class NlxItemPropertyDescriptor extends ItemPropertyDescriptor {

	public NlxItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags, Object editorFactory) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices,
				staticImage, category, filterFlags, editorFactory);

		this.itemDelegator = new NlxItemDelegator(adapterFactory, resourceLocator);

	}

	protected class NlxItemDelegator extends ItemDelegator {

		public NlxItemDelegator(AdapterFactory adapterFactory, ResourceLocator resourceLocator) {
			super(adapterFactory, resourceLocator);
			// TODO Auto-generated constructor stub
		}
		
		 @Override
	    public String getText(Object object)
	    {
			 if (object instanceof EObjectNode) {
				 return (String) ((EObjectNode) object).getText();
			 } else if (object instanceof PropertyValueWrapper) {
				 return (String) ((PropertyValueWrapper)object).getText(object);
			 } else
				 return super.getText(object);
	    }
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getPropertyValue(java.lang.Object)
	 */
	@Override
	public Object getPropertyValue(Object object) {
		
		if (object instanceof EObject) 
			return super.getPropertyValue(object);
		
		if (object instanceof EObjectNode) {
			EObjectNode eObjectNode = (EObjectNode)object;
			if (feature instanceof EStructuralFeature)
			{
			  
			  //EAttribute attribute = (EAttribute)feature;
			  //EObject attachedEObject = ((EObjectNode) object).getEObject(xtextResource);	
//			  Object result =  super.getValue((EObject) editorFactory, feature);
			 Object result = editorFactory;
				
			
			  // We used to use getDefaultValue() when null, but that behaviour isn't correct: the value is already set to
			  // its default initially, and we should always show the actual state of the object (bug 102557).
			  // 
			  if (result == null)
			  {
			    //return getDefaultValue(attribute.getEType());
			    return null;
			  }
			  else
			  {
			    return createPropertyValueWrapper(object, result);
			  }
			} else if (parentReferences != null)
			{
			  for (int i = 0; i < parentReferences.length; ++i)
			  {
			    Object result = getValue(eObjectNode, displayName);
			    if (result != null)
			    {
			      return createPropertyValueWrapper(object, result);
			    }
			  }
			  return "";
			}
			else 
			{
			  return createPropertyValueWrapper(object, getValue(eObjectNode, displayName));
			}
		} else return null;
	}

	private Object getValue(EObjectNode eObject, String fieldName) {
		
		Object result = null;
		
		try {
			Field field = findField(eObject.getClass(),fieldName);
			if (field == null) return null;
			field.setAccessible(true);
			result = field.get(eObject);
			
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return result;
	}
	
private Field findField(Class<?> reflectiveClass, String fieldName) {
		
		Field fields[] = reflectiveClass.getDeclaredFields();
		for (Field field : fields) {
			if (field.getName().equals(fieldName)){
				field.setAccessible(true);
				return field;
			}
		}
		
		Class<?> superClass = reflectiveClass.getSuperclass();
		if (superClass != null) {
			return findField(superClass, fieldName);
		} else 
			return null;	
	}

	private Object getValue(EObjectNode eObject, EReference eReference) {
		// TODO Auto-generated method stub
		String name = eReference.getName();
		
		return name;
	}

	private Object getValue(EObjectNode eObject, EAttribute attribute) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public IItemLabelProvider getLabelProvider(Object object) 
	  {
	    //TODO: Factory obviously more complicated... try itemDelegator first
		IPropertyEditorFactory propertyEditorFactory = IPropertyEditorFactory.Registry.INSTANCE.getPropertyEditorFactory(getEditorFactory(object));
	    if (propertyEditorFactory != null)
	    {
	      IItemLabelProvider itemLabelProvider = propertyEditorFactory.createLabelProvider(object, this);
	      if (itemLabelProvider != null)
	      {
	        return itemLabelProvider;
	      }
	    }

	    return itemDelegator;
	  }
	
	public Object createPropertyValueWrapper(Object object, Object propertyValue, Object nested)
	  {
	    return new NlxPropertyValueWrapper(adapterFactory, object, propertyValue, nested);
	  }
	
	public Object createPropertyValueWrapper(Object object, Object propertyValue)
	 {
	    return new NlxPropertyValueWrapper(adapterFactory, object, propertyValue, null);
	 }
	
	

	

}
