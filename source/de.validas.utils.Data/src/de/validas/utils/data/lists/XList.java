/**
 * 
 */
package de.validas.utils.data.lists;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Felix Schaller
 *
 */
public class XList<E> extends ArrayList<E> {
	/**
	 * Constructors
	 * @param collection
	 */
	public XList(Collection<? extends E> collection) {
		  super(collection);
		}
	/**
	 * Contructors
	 * @param num
	 */
	public XList(int num) {
		super(num);
	}
	
	/**
	 * Constructor
	 */
	public XList() {
		  super();
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * hatInstanceOf
	 * extends ArrayList by function checking a group of classes in list against an Instance
	 */

	@SuppressWarnings("unchecked")
	public boolean hasInstanceOf(Object obj) {
		//TODO: Unsafe type cast. cannot guarantee that members are of type Collection<? extends class>
		for (Class<?extends Object> item: (Collection<Class<? extends Object>>)this ) {
			if (item.isInstance(obj)) return true;
		}
		return false;
	}
	
	public boolean hasInstanceOf(Class<?> clz) {
		for (Object item: this ) {
			if (!clz.isInstance(item)) return false;
		}
		return true;
	}
	
	
}
