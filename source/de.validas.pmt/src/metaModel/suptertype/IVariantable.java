/**
 */
package metaModel.suptertype;

import metaModel.terms.BoolTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IVariantable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.suptertype.IVariantable#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @see metaModel.suptertype.SuptertypePackage#getIVariantable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IVariantable extends Named {
	/**
	 * Returns the value of the '<em><b>Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' containment reference.
	 * @see #setVariant(BoolTerm)
	 * @see metaModel.suptertype.SuptertypePackage#getIVariantable_Variant()
	 * @model containment="true"
	 * @generated
	 */
	BoolTerm getVariant();

	/**
	 * Sets the value of the '{@link metaModel.suptertype.IVariantable#getVariant <em>Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' containment reference.
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(BoolTerm value);

} // IVariantable
