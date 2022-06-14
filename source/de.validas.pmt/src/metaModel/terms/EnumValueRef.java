/**
 */
package metaModel.terms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.terms.EnumValueRef#getEnumValue <em>Enum Value</em>}</li>
 * </ul>
 *
 * @see metaModel.terms.TermsPackage#getEnumValueRef()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ReferenceOK'"
 * @generated
 */
public interface EnumValueRef extends Term {
	/**
	 * Returns the value of the '<em><b>Enum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Value</em>' reference.
	 * @see #setEnumValue(EnumValue)
	 * @see metaModel.terms.TermsPackage#getEnumValueRef_EnumValue()
	 * @model
	 * @generated
	 */
	EnumValue getEnumValue();

	/**
	 * Sets the value of the '{@link metaModel.terms.EnumValueRef#getEnumValue <em>Enum Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Value</em>' reference.
	 * @see #getEnumValue()
	 * @generated
	 */
	void setEnumValue(EnumValue value);

} // EnumValueRef
