/**
 */
package metaModel.terms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.terms.EnumType#getEnumValues <em>Enum Values</em>}</li>
 * </ul>
 *
 * @see metaModel.terms.TermsPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends Type {
	/**
	 * Returns the value of the '<em><b>Enum Values</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.terms.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Values</em>' containment reference list.
	 * @see metaModel.terms.TermsPackage#getEnumType_EnumValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumValue> getEnumValues();

} // EnumType
