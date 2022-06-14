/**
 */
package metaModel.referenceProcess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Modul</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.VerificationModule#getVerifiedCompliances <em>Verified Compliances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.VerificationModule#isImplicit <em>Implicit</em>}</li>
 *   <li>{@link metaModel.referenceProcess.VerificationModule#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getVerificationModule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VerifiesExactOneInput IsUsedInCompliances HasCriterion'"
 * @generated
 */
public interface VerificationModule extends ProcessModule {
	/**
	 * Returns the value of the '<em><b>Verified Compliances</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Compliance}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Compliance#getVerificationModules <em>Verification Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verified Compliances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verified Compliances</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getVerificationModule_VerifiedCompliances()
	 * @see metaModel.referenceProcess.Compliance#getVerificationModules
	 * @model opposite="VerificationModules"
	 * @generated
	 */
	EList<Compliance> getVerifiedCompliances();

	/**
	 * Returns the value of the '<em><b>Implicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit</em>' attribute.
	 * @see #setImplicit(boolean)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getVerificationModule_Implicit()
	 * @model
	 * @generated
	 */
	boolean isImplicit();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.VerificationModule#isImplicit <em>Implicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit</em>' attribute.
	 * @see #isImplicit()
	 * @generated
	 */
	void setImplicit(boolean value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Criterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getVerificationModule_Criteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<Criterion> getCriteria();

} // VerificationModul
