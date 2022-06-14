/**
 */
package metaModel.referenceProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IVerified</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.IVerified#getVerifiedBy <em>Verified By</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getIVerified()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IVerified extends EObject {
	/**
	 * Returns the value of the '<em><b>Verified By</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.IVerifier}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.IVerifier#getVerifies <em>Verifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verified By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verified By</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getIVerified_VerifiedBy()
	 * @see metaModel.referenceProcess.IVerifier#getVerifies
	 * @model opposite="verifies"
	 * @generated
	 */
	EList<IVerifier> getVerifiedBy();

} // IVerified
