/**
 */
package de.validas.vvt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link de.validas.vvt.Parameter#getParameterValues <em>Parameter Values</em>}</li>
 * </ul>
 *
 * @see de.validas.vvt.VvtPackage#getParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValuesGiven'"
 * @generated
 */
public interface Parameter extends Described {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.validas.vvt.VvtPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.validas.vvt.ParameterValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values</em>' containment reference list.
	 * @see de.validas.vvt.VvtPackage#getParameter_ParameterValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterValue> getParameterValues();

} // Parameter
