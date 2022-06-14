/**
 */
package metaModel.terms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.terms.ListType#getBaseType <em>Base Type</em>}</li>
 * </ul>
 *
 * @see metaModel.terms.TermsPackage#getListType()
 * @model
 * @generated
 */
public interface ListType extends Type {

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' reference.
	 * @see #setBaseType(Type)
	 * @see metaModel.terms.TermsPackage#getListType_BaseType()
	 * @model
	 * @generated
	 */
	Type getBaseType();

	/**
	 * Sets the value of the '{@link metaModel.terms.ListType#getBaseType <em>Base Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(Type value);

} // List
