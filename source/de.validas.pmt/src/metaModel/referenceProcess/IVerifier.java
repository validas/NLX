/**
 */
package metaModel.referenceProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IVerifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.IVerifier#getVerifies <em>Verifies</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getIVerifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IVerifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Verifies</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.IVerified}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.IVerified#getVerifiedBy <em>Verified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verifies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verifies</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getIVerifier_Verifies()
	 * @see metaModel.referenceProcess.IVerified#getVerifiedBy
	 * @model opposite="verifiedBy"
	 * @generated
	 */
	EList<IVerified> getVerifies();

} // IVerifier
