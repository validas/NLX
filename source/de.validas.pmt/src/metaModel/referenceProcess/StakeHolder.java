/**
 */
package metaModel.referenceProcess;

import metaModel.suptertype.Layout;
import metaModel.suptertype.Variantable;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stake Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.StakeHolder#getOwnedModules <em>Owned Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.StakeHolder#getInvolvedModules <em>Involved Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.StakeHolder#getCompliances <em>Compliances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.StakeHolder#getAssignedPerson <em>Assigned Person</em>}</li>
 *   <li>{@link metaModel.referenceProcess.StakeHolder#getOwnedArtifacts <em>Owned Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.StakeHolder#getInvolvedArtifacts <em>Involved Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.StakeHolder#getOwnedTools <em>Owned Tools</em>}</li>
 *   <li>{@link metaModel.referenceProcess.StakeHolder#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getStakeHolder()
 * @model
 * @generated
 */
public interface StakeHolder extends Variantable {
	/**
	 * Returns the value of the '<em><b>Owned Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getStakeHolder <em>Stake Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Modules</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getStakeHolder_OwnedModules()
	 * @see metaModel.referenceProcess.ProcessModule#getStakeHolder
	 * @model opposite="StakeHolder"
	 * @generated
	 */
	EList<ProcessModule> getOwnedModules();

	/**
	 * Returns the value of the '<em><b>Involved Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getInvolvedStakeHolders <em>Involved Stake Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Modules</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getStakeHolder_InvolvedModules()
	 * @see metaModel.referenceProcess.ProcessModule#getInvolvedStakeHolders
	 * @model opposite="InvolvedStakeHolders"
	 * @generated
	 */
	EList<ProcessModule> getInvolvedModules();

	/**
	 * Returns the value of the '<em><b>Compliances</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Compliance}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Compliance#getStakeHolders <em>Stake Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliances</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getStakeHolder_Compliances()
	 * @see metaModel.referenceProcess.Compliance#getStakeHolders
	 * @model opposite="StakeHolders"
	 * @generated
	 */
	EList<Compliance> getCompliances();

	/**
	 * Returns the value of the '<em><b>Assigned Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Person</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Person</em>' attribute.
	 * @see #setAssignedPerson(String)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getStakeHolder_AssignedPerson()
	 * @model
	 * @generated
	 */
	String getAssignedPerson();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.StakeHolder#getAssignedPerson <em>Assigned Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Person</em>' attribute.
	 * @see #getAssignedPerson()
	 * @generated
	 */
	void setAssignedPerson(String value);

	/**
	 * Returns the value of the '<em><b>Owned Artifacts</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Artifact}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Artifact#getStakeHolder <em>Stake Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Artifacts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Artifacts</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getStakeHolder_OwnedArtifacts()
	 * @see metaModel.referenceProcess.Artifact#getStakeHolder
	 * @model opposite="StakeHolder"
	 * @generated
	 */
	EList<Artifact> getOwnedArtifacts();

	/**
	 * Returns the value of the '<em><b>Involved Artifacts</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Artifact}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Artifact#getInvolvedStakeHolders <em>Involved Stake Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Artifacts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Artifacts</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getStakeHolder_InvolvedArtifacts()
	 * @see metaModel.referenceProcess.Artifact#getInvolvedStakeHolders
	 * @model opposite="InvolvedStakeHolders"
	 * @generated
	 */
	EList<Artifact> getInvolvedArtifacts();

	/**
	 * Returns the value of the '<em><b>Owned Tools</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Tool}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Tool#getToolOwner <em>Tool Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tools</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tools</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getStakeHolder_OwnedTools()
	 * @see metaModel.referenceProcess.Tool#getToolOwner
	 * @model opposite="ToolOwner"
	 * @generated
	 */
	EList<Tool> getOwnedTools();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * The default value is <code>"TOP_BOTTOM"</code>.
	 * The literals are from the enumeration {@link metaModel.suptertype.Layout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see metaModel.suptertype.Layout
	 * @see #setLayout(Layout)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getStakeHolder_Layout()
	 * @model default="TOP_BOTTOM"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.StakeHolder#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see metaModel.suptertype.Layout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // StakeHolder
