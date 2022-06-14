/**
 */
package metaModel.terms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.terms.BoolTerm#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see metaModel.terms.TermsPackage#getBoolTerm()
 * @model
 * @generated
 */
public interface BoolTerm extends Term {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.terms.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see metaModel.terms.TermsPackage#getBoolTerm_Terms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getTerms();

} // BoolTerm
