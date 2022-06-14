/**
 */
package metaModel.referenceProcess;

import metaModel.suptertype.SafetyLevel;
import metaModel.suptertype.Variantable;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.Requirement#getSubRequirements <em>Sub Requirements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Requirement#getRequiredRequirements <em>Required Requirements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Requirement#getRequiredByRequirements <em>Required By Requirements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Requirement#getRecommentedFrom <em>Recommented From</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Requirement#getRecommentedTo <em>Recommented To</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Requirement#getCompliances <em>Compliances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Requirement#getClaimingProcessModules <em>Claiming Process Modules</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getRequirement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CycleCheck'"
 * @generated
 */
public interface Requirement extends Variantable, IVerified {
	/**
	 * Returns the value of the '<em><b>Sub Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Requirements</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getRequirement_SubRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getSubRequirements();

	/**
	 * Returns the value of the '<em><b>Required Requirements</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Requirement}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Requirement#getRequiredByRequirements <em>Required By Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Requirements</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getRequirement_RequiredRequirements()
	 * @see metaModel.referenceProcess.Requirement#getRequiredByRequirements
	 * @model opposite="requiredByRequirements"
	 * @generated
	 */
	EList<Requirement> getRequiredRequirements();

	/**
	 * Returns the value of the '<em><b>Required By Requirements</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Requirement}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Requirement#getRequiredRequirements <em>Required Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required By Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required By Requirements</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getRequirement_RequiredByRequirements()
	 * @see metaModel.referenceProcess.Requirement#getRequiredRequirements
	 * @model opposite="requiredRequirements"
	 * @generated
	 */
	EList<Requirement> getRequiredByRequirements();

	/**
	 * Returns the value of the '<em><b>Recommented From</b></em>' attribute.
	 * The default value is <code>"ASIL_A"</code>.
	 * The literals are from the enumeration {@link metaModel.suptertype.SafetyLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommented From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommented From</em>' attribute.
	 * @see metaModel.suptertype.SafetyLevel
	 * @see #setRecommentedFrom(SafetyLevel)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getRequirement_RecommentedFrom()
	 * @model default="ASIL_A"
	 * @generated
	 */
	SafetyLevel getRecommentedFrom();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Requirement#getRecommentedFrom <em>Recommented From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommented From</em>' attribute.
	 * @see metaModel.suptertype.SafetyLevel
	 * @see #getRecommentedFrom()
	 * @generated
	 */
	void setRecommentedFrom(SafetyLevel value);

	/**
	 * Returns the value of the '<em><b>Recommented To</b></em>' attribute.
	 * The default value is <code>"ASIL_D"</code>.
	 * The literals are from the enumeration {@link metaModel.suptertype.SafetyLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommented To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommented To</em>' attribute.
	 * @see metaModel.suptertype.SafetyLevel
	 * @see #setRecommentedTo(SafetyLevel)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getRequirement_RecommentedTo()
	 * @model default="ASIL_D"
	 * @generated
	 */
	SafetyLevel getRecommentedTo();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Requirement#getRecommentedTo <em>Recommented To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommented To</em>' attribute.
	 * @see metaModel.suptertype.SafetyLevel
	 * @see #getRecommentedTo()
	 * @generated
	 */
	void setRecommentedTo(SafetyLevel value);

	/**
	 * Returns the value of the '<em><b>Compliances</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Compliance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliances</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getRequirement_Compliances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Compliance> getCompliances();

	/**
	 * Returns the value of the '<em><b>Claiming Process Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getClaimedComplianceRequirements <em>Claimed Compliance Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claiming Process Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claiming Process Modules</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getRequirement_ClaimingProcessModules()
	 * @see metaModel.referenceProcess.ProcessModule#getClaimedComplianceRequirements
	 * @model opposite="ClaimedComplianceRequirements"
	 * @generated
	 */
	EList<ProcessModule> getClaimingProcessModules();

} // Requirement
