/**
 */
package de.validas.vvt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.Instance#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.validas.vvt.Instance#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @see de.validas.vvt.VvtPackage#getInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValueOfCorrectParameter'"
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see de.validas.vvt.VvtPackage#getInstance_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Instance#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Value</em>' reference.
	 * @see #setParameterValue(ParameterValue)
	 * @see de.validas.vvt.VvtPackage#getInstance_ParameterValue()
	 * @model
	 * @generated
	 */
	ParameterValue getParameterValue();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Instance#getParameterValue <em>Parameter Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Value</em>' reference.
	 * @see #getParameterValue()
	 * @generated
	 */
	void setParameterValue(ParameterValue value);

} // Instance
