/**
 */
package metaModel.referenceProcess;

import metaModel.modellDescr.ProzessCondition;
import metaModel.suptertype.Layout;
import metaModel.suptertype.Variantable;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artefakt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.Artifact#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getVersion <em>Version</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getReadByProcessModules <em>Read By Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getProcessConditions <em>Process Conditions</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getCreatedByProcessModules <em>Created By Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getSubArtifacts <em>Sub Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getSubArtifactReferences <em>Sub Artifact References</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getCompliances <em>Compliances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getInvolvedStakeHolders <em>Involved Stake Holders</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getStakeHolder <em>Stake Holder</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getPath <em>Path</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getStatus <em>Status</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#isPartOfProduct <em>Part Of Product</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getReferedByArtifacts <em>Refered By Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#isProjectInput <em>Project Input</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Artifact#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CycleCheck PathCheck ReadCheck WriteCheck ReadOrWriteCheck HasOrInheritStakeHolder'"
 * @generated
 */
public interface Artifact extends Variantable, IVerified {
	/**
	 * Returns the value of the '<em><b>Document Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Status</em>' attribute.
	 * @see #setDocumentStatus(String)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_DocumentStatus()
	 * @model
	 * @generated
	 */
	String getDocumentStatus();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Artifact#getDocumentStatus <em>Document Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Status</em>' attribute.
	 * @see #getDocumentStatus()
	 * @generated
	 */
	void setDocumentStatus(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Artifact#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Read By Process Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getInputArtifacts <em>Input Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read By Process Modules</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_ReadByProcessModules()
	 * @see metaModel.referenceProcess.ProcessModule#getInputArtifacts
	 * @model opposite="inputArtifacts"
	 * @generated
	 */
	EList<ProcessModule> getReadByProcessModules();

	/**
	 * Returns the value of the '<em><b>Process Conditions</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.ProzessCondition}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.ProzessCondition#getArtefakt <em>Artefakt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Conditions</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_ProcessConditions()
	 * @see metaModel.modellDescr.ProzessCondition#getArtefakt
	 * @model opposite="artefakt"
	 * @generated
	 */
	EList<ProzessCondition> getProcessConditions();

	/**
	 * Returns the value of the '<em><b>Created By Process Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getOutputArtifacts <em>Output Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By Process Modules</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_CreatedByProcessModules()
	 * @see metaModel.referenceProcess.ProcessModule#getOutputArtifacts
	 * @model opposite="outputArtifacts"
	 * @generated
	 */
	EList<ProcessModule> getCreatedByProcessModules();

	/**
	 * Returns the value of the '<em><b>Sub Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Artefakts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Artifacts</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_SubArtifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getSubArtifacts();

	/**
	 * Returns the value of the '<em><b>Sub Artifact References</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Artifact}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Artifact#getReferedByArtifacts <em>Refered By Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Artifact References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Artifact References</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_SubArtifactReferences()
	 * @see metaModel.referenceProcess.Artifact#getReferedByArtifacts
	 * @model opposite="ReferedByArtifacts"
	 * @generated
	 */
	EList<Artifact> getSubArtifactReferences();

	/**
	 * Returns the value of the '<em><b>Compliances</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Compliance}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Compliance#getArtifatcs <em>Artifatcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliances</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_Compliances()
	 * @see metaModel.referenceProcess.Compliance#getArtifatcs
	 * @model opposite="Artifatcs"
	 * @generated
	 */
	EList<Compliance> getCompliances();

	/**
	 * Returns the value of the '<em><b>Involved Stake Holders</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.StakeHolder}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.StakeHolder#getInvolvedArtifacts <em>Involved Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Stake Holders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Stake Holders</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_InvolvedStakeHolders()
	 * @see metaModel.referenceProcess.StakeHolder#getInvolvedArtifacts
	 * @model opposite="InvolvedArtifacts"
	 * @generated
	 */
	EList<StakeHolder> getInvolvedStakeHolders();

	/**
	 * Returns the value of the '<em><b>Stake Holder</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.StakeHolder#getOwnedArtifacts <em>Owned Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stake Holder</em>' reference.
	 * @see #setStakeHolder(StakeHolder)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_StakeHolder()
	 * @see metaModel.referenceProcess.StakeHolder#getOwnedArtifacts
	 * @model opposite="OwnedArtifacts"
	 * @generated
	 */
	StakeHolder getStakeHolder();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Artifact#getStakeHolder <em>Stake Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stake Holder</em>' reference.
	 * @see #getStakeHolder()
	 * @generated
	 */
	void setStakeHolder(StakeHolder value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Artifact#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link metaModel.referenceProcess.ProcessStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see metaModel.referenceProcess.ProcessStatus
	 * @see #setStatus(ProcessStatus)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_Status()
	 * @model
	 * @generated
	 */
	ProcessStatus getStatus();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Artifact#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see metaModel.referenceProcess.ProcessStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ProcessStatus value);

	/**
	 * Returns the value of the '<em><b>Part Of Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of Product</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of Product</em>' attribute.
	 * @see #setPartOfProduct(boolean)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_PartOfProduct()
	 * @model
	 * @generated
	 */
	boolean isPartOfProduct();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Artifact#isPartOfProduct <em>Part Of Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of Product</em>' attribute.
	 * @see #isPartOfProduct()
	 * @generated
	 */
	void setPartOfProduct(boolean value);

	/**
	 * Returns the value of the '<em><b>Refered By Artifacts</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Artifact}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Artifact#getSubArtifactReferences <em>Sub Artifact References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refered By Artifacts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refered By Artifacts</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_ReferedByArtifacts()
	 * @see metaModel.referenceProcess.Artifact#getSubArtifactReferences
	 * @model opposite="SubArtifactReferences"
	 * @generated
	 */
	EList<Artifact> getReferedByArtifacts();

	/**
	 * Returns the value of the '<em><b>Project Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Input</em>' attribute.
	 * @see #setProjectInput(boolean)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_ProjectInput()
	 * @model
	 * @generated
	 */
	boolean isProjectInput();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Artifact#isProjectInput <em>Project Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Input</em>' attribute.
	 * @see #isProjectInput()
	 * @generated
	 */
	void setProjectInput(boolean value);

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
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getArtifact_Layout()
	 * @model default="TOP_BOTTOM"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Artifact#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see metaModel.suptertype.Layout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // Artefakt
