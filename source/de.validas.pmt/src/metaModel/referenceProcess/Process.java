/**
 */
package metaModel.referenceProcess;

import metaModel.modellDescr.ProzessCondition;

import metaModel.suptertype.Named;

import metaModel.suptertype.Preference;
import metaModel.suptertype.SafetyLevel;
import metaModel.terms.Binding;
import metaModel.terms.Parameter;
import metaModel.terms.Type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prozess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.Process#getTools <em>Tools</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Process#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Process#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Process#getMethods <em>Methods</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Process#getProcessModules <em>Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Process#getStakeHolders <em>Stake Holders</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Process#getProcessConditions <em>Process Conditions</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Process#getParameters <em>Parameters</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Process#getBindings <em>Bindings</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Process#getTypes <em>Types</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Process#getMaximalSafetyLevel <em>Maximal Safety Level</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Process#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Process#getFilterScope <em>Filter Scope</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends Named {
	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Tool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_Tools()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Process Modules</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Modules</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_ProcessModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessModule> getProcessModules();

	/**
	 * Returns the value of the '<em><b>Stake Holders</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.StakeHolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stakeholders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stake Holders</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_StakeHolders()
	 * @model containment="true"
	 * @generated
	 */
	EList<StakeHolder> getStakeHolders();

	/**
	 * Returns the value of the '<em><b>Process Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.modellDescr.ProzessCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prozess Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Conditions</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_ProcessConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProzessCondition> getProcessConditions();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.terms.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.terms.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.terms.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Maximal Safety Level</b></em>' attribute.
	 * The default value is <code>"ASIL_D"</code>.
	 * The literals are from the enumeration {@link metaModel.suptertype.SafetyLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximal Safety Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximal Safety Level</em>' attribute.
	 * @see metaModel.suptertype.SafetyLevel
	 * @see #setMaximalSafetyLevel(SafetyLevel)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_MaximalSafetyLevel()
	 * @model default="ASIL_D"
	 * @generated
	 */
	SafetyLevel getMaximalSafetyLevel();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Process#getMaximalSafetyLevel <em>Maximal Safety Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximal Safety Level</em>' attribute.
	 * @see metaModel.suptertype.SafetyLevel
	 * @see #getMaximalSafetyLevel()
	 * @generated
	 */
	void setMaximalSafetyLevel(SafetyLevel value);

	/**
	 * Returns the value of the '<em><b>Preferences</b></em>' reference list.
	 * The list contents are of type {@link metaModel.suptertype.Preference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_Preferences()
	 * @model
	 * @generated
	 */
	EList<Preference> getPreferences();

	/**
	 * Returns the value of the '<em><b>Filter Scope</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Scope</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Scope</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcess_FilterScope()
	 * @model
	 * @generated
	 */
	EList<ProcessModule> getFilterScope();

} // Prozess
