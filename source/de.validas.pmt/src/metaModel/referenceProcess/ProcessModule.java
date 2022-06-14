/**
 */
package metaModel.referenceProcess;

import metaModel.modellDescr.MMCondition;
import metaModel.suptertype.Layout;
import metaModel.suptertype.Variantable;
import metaModel.terms.Binding;
import metaModel.terms.Parameter;

import metaModel.terms.ProcessVariable;
import metaModel.terms.Type;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prozess Modul</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getSubProcessModules <em>Sub Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getInputArtifacts <em>Input Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getTools <em>Tools</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getBeforeProcessModules <em>Before Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getAfterProcessModules <em>After Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getInvolvedStakeHolders <em>Involved Stake Holders</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getPreMMCondition <em>Pre MM Condition</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getPostMMCondition <em>Post MM Condition</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getOutputArtifacts <em>Output Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getURI <em>URI</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getParameters <em>Parameters</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getBindings <em>Bindings</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getEffort <em>Effort</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getProgress <em>Progress</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getPlannedStartDate <em>Planned Start Date</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getPlannedEndDate <em>Planned End Date</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getEndDate <em>End Date</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getSubProcessModuleReferences <em>Sub Process Module References</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getInstanceOfProcessModule <em>Instance Of Process Module</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getInstantiatedInProcessModules <em>Instantiated In Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getCompliances <em>Compliances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getStakeHolder <em>Stake Holder</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getClaimedComplianceRequirements <em>Claimed Compliance Requirements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getStatus <em>Status</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getParameterReferences <em>Parameter References</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getDeterminedVariables <em>Determined Variables</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getLayout <em>Layout</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getStakeHolders <em>Stake Holders</em>}</li>
 *   <li>{@link metaModel.referenceProcess.ProcessModule#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CycleCheck InputArtifacts OutputArtifacts HasOrInheritStakeHolder InterfaceCheck'"
 * @generated
 */
public interface ProcessModule extends Variantable, IVerified, IVerifier {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_Requirements()
	 * @model
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Sub Process Modules</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prozessmodul Child</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Process Modules</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_SubProcessModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessModule> getSubProcessModules();

	/**
	 * Returns the value of the '<em><b>Input Artifacts</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Artifact}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Artifact#getReadByProcessModules <em>Read By Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Artifacts</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_InputArtifacts()
	 * @see metaModel.referenceProcess.Artifact#getReadByProcessModules
	 * @model opposite="readByProcessModules"
	 * @generated
	 */
	EList<Artifact> getInputArtifacts();

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Tool}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Tool#getProcessModules <em>Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_Tools()
	 * @see metaModel.referenceProcess.Tool#getProcessModules
	 * @model opposite="processModules"
	 * @generated
	 */
	EList<Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Before Process Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getAfterProcessModules <em>After Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Process Modules</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_BeforeProcessModules()
	 * @see metaModel.referenceProcess.ProcessModule#getAfterProcessModules
	 * @model opposite="afterProcessModules"
	 * @generated
	 */
	EList<ProcessModule> getBeforeProcessModules();

	/**
	 * Returns the value of the '<em><b>After Process Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getBeforeProcessModules <em>Before Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Process Modules</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_AfterProcessModules()
	 * @see metaModel.referenceProcess.ProcessModule#getBeforeProcessModules
	 * @model opposite="beforeProcessModules"
	 * @generated
	 */
	EList<ProcessModule> getAfterProcessModules();

	/**
	 * Returns the value of the '<em><b>Involved Stake Holders</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.StakeHolder}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.StakeHolder#getInvolvedModules <em>Involved Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Stake Holders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Stake Holders</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_InvolvedStakeHolders()
	 * @see metaModel.referenceProcess.StakeHolder#getInvolvedModules
	 * @model opposite="InvolvedModules"
	 * @generated
	 */
	EList<StakeHolder> getInvolvedStakeHolders();

	/**
	 * Returns the value of the '<em><b>Pre MM Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Cond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre MM Condition</em>' containment reference.
	 * @see #setPreMMCondition(MMCondition)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_PreMMCondition()
	 * @model containment="true"
	 * @generated
	 */
	MMCondition getPreMMCondition();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getPreMMCondition <em>Pre MM Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre MM Condition</em>' containment reference.
	 * @see #getPreMMCondition()
	 * @generated
	 */
	void setPreMMCondition(MMCondition value);

	/**
	 * Returns the value of the '<em><b>Post MM Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post MM Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post MM Condition</em>' containment reference.
	 * @see #setPostMMCondition(MMCondition)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_PostMMCondition()
	 * @model containment="true"
	 * @generated
	 */
	MMCondition getPostMMCondition();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getPostMMCondition <em>Post MM Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post MM Condition</em>' containment reference.
	 * @see #getPostMMCondition()
	 * @generated
	 */
	void setPostMMCondition(MMCondition value);

	/**
	 * Returns the value of the '<em><b>Output Artifacts</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Artifact}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Artifact#getCreatedByProcessModules <em>Created By Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Artifacts</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_OutputArtifacts()
	 * @see metaModel.referenceProcess.Artifact#getCreatedByProcessModules
	 * @model opposite="createdByProcessModules"
	 * @generated
	 */
	EList<Artifact> getOutputArtifacts();

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_URI()
	 * @model
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.terms.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_Parameters()
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
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Number Of Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Instances</em>' attribute.
	 * @see #setNumberOfInstances(int)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_NumberOfInstances()
	 * @model
	 * @generated
	 */
	int getNumberOfInstances();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getNumberOfInstances <em>Number Of Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Instances</em>' attribute.
	 * @see #getNumberOfInstances()
	 * @generated
	 */
	void setNumberOfInstances(int value);

	/**
	 * Returns the value of the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effort</em>' attribute.
	 * @see #setEffort(float)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_Effort()
	 * @model
	 * @generated
	 */
	float getEffort();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getEffort <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effort</em>' attribute.
	 * @see #getEffort()
	 * @generated
	 */
	void setEffort(float value);

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see #setProgress(float)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_Progress()
	 * @model
	 * @generated
	 */
	float getProgress();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(float value);

	/**
	 * Returns the value of the '<em><b>Planned Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Start Date</em>' attribute.
	 * @see #setPlannedStartDate(String)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_PlannedStartDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPlannedStartDate();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getPlannedStartDate <em>Planned Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Start Date</em>' attribute.
	 * @see #getPlannedStartDate()
	 * @generated
	 */
	void setPlannedStartDate(String value);

	/**
	 * Returns the value of the '<em><b>Planned End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned End Date</em>' attribute.
	 * @see #setPlannedEndDate(String)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_PlannedEndDate()
	 * @model
	 * @generated
	 */
	String getPlannedEndDate();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getPlannedEndDate <em>Planned End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned End Date</em>' attribute.
	 * @see #getPlannedEndDate()
	 * @generated
	 */
	void setPlannedEndDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_EndDate()
	 * @model
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * Returns the value of the '<em><b>Sub Process Module References</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Process Module References</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_SubProcessModuleReferences()
	 * @model
	 * @generated
	 */
	EList<ProcessModule> getSubProcessModuleReferences();

	/**
	 * Returns the value of the '<em><b>Instance Of Process Module</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getInstantiatedInProcessModules <em>Instantiated In Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of Process Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of Process Module</em>' reference.
	 * @see #setInstanceOfProcessModule(ProcessModule)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_InstanceOfProcessModule()
	 * @see metaModel.referenceProcess.ProcessModule#getInstantiatedInProcessModules
	 * @model opposite="InstantiatedInProcessModules"
	 * @generated
	 */
	ProcessModule getInstanceOfProcessModule();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getInstanceOfProcessModule <em>Instance Of Process Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of Process Module</em>' reference.
	 * @see #getInstanceOfProcessModule()
	 * @generated
	 */
	void setInstanceOfProcessModule(ProcessModule value);

	/**
	 * Returns the value of the '<em><b>Instantiated In Process Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getInstanceOfProcessModule <em>Instance Of Process Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiatd In Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated In Process Modules</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_InstantiatedInProcessModules()
	 * @see metaModel.referenceProcess.ProcessModule#getInstanceOfProcessModule
	 * @model opposite="InstanceOfProcessModule"
	 * @generated
	 */
	EList<ProcessModule> getInstantiatedInProcessModules();

	/**
	 * Returns the value of the '<em><b>Compliances</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Compliance}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Compliance#getProcessModules <em>Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliances</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_Compliances()
	 * @see metaModel.referenceProcess.Compliance#getProcessModules
	 * @model opposite="ProcessModules"
	 * @generated
	 */
	EList<Compliance> getCompliances();

	/**
	 * Returns the value of the '<em><b>Stake Holder</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.StakeHolder#getOwnedModules <em>Owned Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stake Holder</em>' reference.
	 * @see #setStakeHolder(StakeHolder)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_StakeHolder()
	 * @see metaModel.referenceProcess.StakeHolder#getOwnedModules
	 * @model opposite="OwnedModules"
	 * @generated
	 */
	StakeHolder getStakeHolder();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getStakeHolder <em>Stake Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stake Holder</em>' reference.
	 * @see #getStakeHolder()
	 * @generated
	 */
	void setStakeHolder(StakeHolder value);

	/**
	 * Returns the value of the '<em><b>Claimed Compliance Requirements</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Requirement}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Requirement#getClaimingProcessModules <em>Claiming Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliance Claims</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claimed Compliance Requirements</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_ClaimedComplianceRequirements()
	 * @see metaModel.referenceProcess.Requirement#getClaimingProcessModules
	 * @model opposite="ClaimingProcessModules"
	 * @generated
	 */
	EList<Requirement> getClaimedComplianceRequirements();

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
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_Status()
	 * @model
	 * @generated
	 */
	ProcessStatus getStatus();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see metaModel.referenceProcess.ProcessStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ProcessStatus value);

	/**
	 * Returns the value of the '<em><b>Parameter References</b></em>' reference list.
	 * The list contents are of type {@link metaModel.terms.Parameter}.
	 * It is bidirectional and its opposite is '{@link metaModel.terms.Parameter#getReusingProcessModules <em>Reusing Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter References</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_ParameterReferences()
	 * @see metaModel.terms.Parameter#getReusingProcessModules
	 * @model opposite="ReusingProcessModules"
	 * @generated
	 */
	EList<Parameter> getParameterReferences();

	/**
	 * Returns the value of the '<em><b>Determined Variables</b></em>' reference list.
	 * The list contents are of type {@link metaModel.terms.ProcessVariable}.
	 * It is bidirectional and its opposite is '{@link metaModel.terms.ProcessVariable#getDeterminedByProcessModules <em>Determined By Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Determined Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Determined Variables</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_DeterminedVariables()
	 * @see metaModel.terms.ProcessVariable#getDeterminedByProcessModules
	 * @model opposite="DeterminedByProcessModules"
	 * @generated
	 */
	EList<ProcessVariable> getDeterminedVariables();

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
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_Layout()
	 * @model default="TOP_BOTTOM"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.ProcessModule#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see metaModel.suptertype.Layout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

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
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Stake Holders</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.StakeHolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stake Holders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stake Holders</em>' containment reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_StakeHolders()
	 * @model containment="true"
	 * @generated
	 */
	EList<StakeHolder> getStakeHolders();

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
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getProcessModule_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // ProzessModul
