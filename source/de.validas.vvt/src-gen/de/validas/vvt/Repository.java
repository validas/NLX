/**
 */
package de.validas.vvt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.Repository#getURL <em>URL</em>}</li>
 * </ul>
 *
 * @see de.validas.vvt.VvtPackage#getRepository()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RepositorySpecified'"
 * @generated
 */
public interface Repository extends Described {

	/**
	 * Returns the value of the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URL</em>' attribute.
	 * @see #setURL(String)
	 * @see de.validas.vvt.VvtPackage#getRepository_URL()
	 * @model
	 * @generated
	 */
	String getURL();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Repository#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);
} // Repository
