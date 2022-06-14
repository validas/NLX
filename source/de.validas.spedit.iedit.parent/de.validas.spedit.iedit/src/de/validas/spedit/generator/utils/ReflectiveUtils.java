/**
 * 
 */
package de.validas.spedit.generator.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEList;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import de.validas.utils.data.lists.XList;

/**
 * @author Felix Schaller
 *
 */
public class ReflectiveUtils {
	
	/**
	 * wrapper Function that calls getAllChildren
	 * 
	 * @param obj
	 * @param classTypes
	 * @return
	 */
	
	public static EList<EObject> getAllChildrenRecursive(EObject obj, XList<Class<?>> classTypes) {
		return getAllChildren(obj, classTypes, true);
	}
	
	/**
	 * Function that gets all children fields which are instance of the classTypes list. 
	 * function can return recursive results or direct results
	 * This Methods adds a Strategy if it shall return only EContainmentEList members or all Containment Members
	 * 
	 * @param obj
	 * @param classTypes
	 * @param recursive
	 * @param strategy
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static EList<EObject> getAllChildren(EObject obj, XList<Class<?>> classTypes, Boolean recursive) {
	    EList<EObject> eObjects = new BasicEList<EObject>(); 
	    
	    if (obj == null) return eObjects;
		
		if (recursive) {
			for (TreeIterator<InternalEObject> j = (TreeIterator<InternalEObject>)(TreeIterator<?>) obj.eAllContents();  j.hasNext(); )
		      {
		        EObject childEObject = j.next();
		        if (classTypes.hasInstanceOf(childEObject))
		        	  eObjects.add(childEObject);
		        
		      }
			
		} else {
			for (EObject childEObject: obj.eContents()) {
				if (classTypes.hasInstanceOf(childEObject))
		        	  eObjects.add(childEObject);	
			}
		}
		return eObjects;
	}
	
	
	
	/**
	 * looks in class to tell if the object can have containment Objects
	 * @param model
	 * @return
	 */
	public static boolean hasContainments(Object model) {

		return hasFieldOfClass(model, EObjectContainmentEList.class);
	}
	
	/**
	 * looks in class if it has at least one Field of ClassType _class
	 * 
	 * @param model
	 * @param _class
	 * @return
	 */
	
	public static boolean hasFieldOfClass(Object model, Class<?> _class){
		List<Field> fields = Arrays.asList(model.getClass().getDeclaredFields());
		
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				Object typeContainer = field.get(model);
				// if container not initialized:
				if (typeContainer == null) {
					typeContainer = initializeField(typeContainer, model, field);
					if (typeContainer == null) continue;
					// field couldn't be initialized
				}
				
				if (typeContainer.getClass().equals(_class))
				{
					return true;
				}
			} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return false;
	}
	
	public static Method findGetter(Object model, String name) {
		
		String getterName = new String("get");
		getterName = getterName.concat(name);
		List<Method> methods = Arrays.asList(model.getClass().getDeclaredMethods());
		for (Method method: methods) {
			if (method.getName().equalsIgnoreCase(getterName)) return method; 
		}
		
		return null;
	}


	/**
	 * returns the value of a given Field as String via reflection
	 * wraps findFieldInClass(Class<?> _class, String name)
	 * 
	 * @param obj
	 * @param name
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 */
	public static Object getField(Object obj, String name) {
			return findFieldInClass(obj.getClass(), name);
	}
	
	/**
	 * returns the value of a given Field as String via reflection
	 * wraps findFieldInClass(Class<?> _class, String name)
	 * 
	 * @param obj
	 * @param name
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 */
	public static Object getFieldValue(Object obj, String name) {
			Field field = findFieldInClass(obj.getClass(), name);
			try {
				field.setAccessible(true);
				return field.get(obj);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	}

	/**
	 * gets Field from a given Class instead of an Object
	 * 
	 * @param _class
	 * @param name
	 * @return
	 */
	protected static Field findFieldInClass(Class<?> _class, String name) {
		try {
			return _class.getDeclaredField(name);
		} catch (NoSuchFieldException | SecurityException e) {
			if (!_class.equals(Object.class)) {
				return findFieldInClass(_class.getSuperclass(), name);
			}
			e.printStackTrace();
			return null;
		}
	}
	
/*	public class ListMode {
		
	}
	
	public static EList<IConnection> listConnectionsOf(EObject node, XList<Class<?>> acceptedInputTypes, Strategy strategy) {
		
		List<Field> fields = Arrays.asList(node.getClass().getDeclaredFields());
		EList<IConnection> connectionList = new BasicEList<IConnection>();
		
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				Object typeContainer = field.get(node);
				if (typeContainer == null) {
					typeContainer = initializeField(typeContainer, node, field);
					// field couldn't be initialized
				}
				boolean falseCond = (strategy == Strategy.LIST_CONNECTED_OBJS && typeContainer == null);
				if (falseCond) continue;
				
				// From Type List
				if (acceptedInputTypes.hasInstanceOf(typeContainer) && typeContainer instanceof AbstractEList)
				{
					switch (strategy) {
					case LIST_CONNECTED_OBJS:
						if (typeContainer instanceof Collection<?>) {
							for (EObject entry : (Collection<EObject>) typeContainer) {
								connectionList.add(new ListConnection(field.getName(), entry));
							}
						}
						break;
					case LIST_CHANNELS_ONLY:
						// return for any EList reference type ListConnection with only the fieldname
						connectionList.add(new ListConnection(field.getName(), null));
						break;
					}
				}
				// Singular Connection
				if (EObject.class.isAssignableFrom(field.getType())) // no need to check for !falseCond because condition will be never reached here...
				{
					connectionList.add(new SingleConnection(field.getName(), (EObject) typeContainer));
				}
				
			} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			} 
		}
		return connectionList;
	}*/ 
	
	/**
	 * returns "true" if field could be initialized successfully, else "false"
	 * 
	 * @param typeContainer
	 * @param node
	 * @param field
	 * @return boolean
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */

	protected static Object initializeField(Object typeContainer, Object node, Field field) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method getter = findGetter(node, field.getName());
		if (getter != null) {
			typeContainer = getter.invoke(node);
			if (typeContainer == null) 
				return typeContainer;
		} else
			return null;
		return typeContainer;	
	}

	

}
