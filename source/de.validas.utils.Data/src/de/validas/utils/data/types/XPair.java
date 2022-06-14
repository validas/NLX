/**
 * Copyright Validas AG 2019
 */
package de.validas.utils.data.types;

import java.io.Serializable;

import com.google.common.base.Objects;

/**
 * @author schaller
 *
 */
public class XPair<K, V> implements Serializable {
	
	/**
	 * Key Value Pair Object
	 */
	private static final long serialVersionUID = -2011396127058407632L;
	protected K key;
	protected V value;
	
	/**
	 * The Constructor 
	 * @param k
	 * @param v
	 */
	public XPair(K k, V v) {
		this.key = k;
		this.value = v;
	}
	
	
	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}



	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}

	public static <K, V> XPair<K, V> of(K k, V v) {
		return new XPair<K, V>(k, v);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj instanceof XPair) {
			XPair<?, ?> entity = (XPair<?, ?>) obj;
			return Objects.equal(key, entity.getKey()) && Objects.equal(value, entity.getValue());
		}
		return false;
	}

	@Override
	public String toString() {
		return key + "->" + value;
	}
	
}
