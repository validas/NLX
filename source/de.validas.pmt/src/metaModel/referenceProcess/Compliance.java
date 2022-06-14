/**
 */
package metaModel.referenceProcess;

import metaModel.suptertype.Variantable;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compliance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.Compliance#getProcessModules <em>Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Compliance#getStakeHolders <em>Stake Holders</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Compliance#getVerificationModules <em>Verification Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Compliance#getArtifatcs <em>Artifatcs</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Compliance#getSubCompliances <em>Sub Compliances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Compliance#isApplicable <em>Applicable</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getCompliance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VandVLinks ProcessLinks NAnoLinks'"
 * @generated
 */
public interface Compliance extends Variantable {
	/**
	 * Returns the value of the '<em><b>Process Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getCompliances <em>Compliances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prozess Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Modules</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getCompliance_ProcessModules()
	 * @see metaModel.referenceProcess.ProcessModule#getCompliances
	 * @model opposite="Compliances"
	 * @generated
	 */
	EList<ProcessModule> getProcessModules();

	/**
	 * Returns the value of the '<em><b>Stake Holders</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.StakeHolder}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.StakeHolder#getCompliances <em>Compliances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stake Holders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stake Holders</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getCompliance_StakeHolders()
	 * @see metaModel.referenceProcess.StakeHolder#getCompliances
	 * @model opposite="Compliances"
	 * @generated
	 */
	EList<StakeHolder> getStakeHolders();

	/**
	 * Returns the value of the '<em><b>Verification Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.VerificationModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.VerificationModule#getVerifiedCompliances <em>Verified Compliances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Moduls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Modules</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getCompliance_VerificationModules()
	 * @see metaModel.referenceProcess.VerificationModule#getVerifiedCompliances
	 * @model opposite="VerifiedCompliances"
	 * @generated
	 */
	EList<VerificationModule> getVerificationModules();

	/**
	 * Returns the value of the '<em><b>Artifatcs</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Artifact}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Artifact#getCompliances <em>Compliances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifatcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifatcs</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getCompliance_Artifatcs()
	 * @see metaModel.referenceProcess.Artifact#getCompliances
	 * @model opposite="Compliances"
	 * @generated
	 */
	EList<Artifact> getArtifatcs();

	/**
	 * Returns the value of the '<em><b>Sub Compliances</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Compliance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Compliances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Compliances</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getCompliance_SubCompliances()
	 * @model
	 * @generated
	 */
	EList<Compliance> getSubCompliances();

	/**
	 * Returns the value of the '<em><b>Applicable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable</em>' attribute.
	 * @see #setApplicable(boolean)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getCompliance_Applicable()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isApplicable();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Compliance#isApplicable <em>Applicable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable</em>' attribute.
	 * @see #isApplicable()
	 * @generated
	 */
	void setApplicable(boolean value);

} // Compliance
