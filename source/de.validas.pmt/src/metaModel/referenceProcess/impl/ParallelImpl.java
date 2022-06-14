/**
 */
package metaModel.referenceProcess.impl;

import java.util.Collection;

import metaModel.modellDescr.MMCondition;

import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.IVerified;
import metaModel.referenceProcess.IVerifier;
import metaModel.referenceProcess.Parallel;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ProcessStatus;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.Tool;
import metaModel.suptertype.Layout;
import metaModel.suptertype.SuptertypePackage;
import metaModel.suptertype.Variantable;
import metaModel.suptertype.impl.NamedImpl;
import metaModel.terms.Binding;
import metaModel.terms.BoolTerm;
import metaModel.terms.Parameter;

import metaModel.terms.ProcessVariable;
import metaModel.terms.TermsPackage;
import metaModel.terms.Type;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getLayoutBefore <em>Layout Before</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getLayoutAfter <em>Layout After</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getLayoutPriority <em>Layout Priority</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getVerifies <em>Verifies</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getSubProcessModules <em>Sub Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getInputArtifacts <em>Input Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getBeforeProcessModules <em>Before Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getAfterProcessModules <em>After Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getInvolvedStakeHolders <em>Involved Stake Holders</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getPreMMCondition <em>Pre MM Condition</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getPostMMCondition <em>Post MM Condition</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getOutputArtifacts <em>Output Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getURI <em>URI</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getPlannedStartDate <em>Planned Start Date</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getPlannedEndDate <em>Planned End Date</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getSubProcessModuleReferences <em>Sub Process Module References</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getInstanceOfProcessModule <em>Instance Of Process Module</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getInstantiatedInProcessModules <em>Instantiated In Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getCompliances <em>Compliances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getStakeHolder <em>Stake Holder</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getClaimedComplianceRequirements <em>Claimed Compliance Requirements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getParameterReferences <em>Parameter References</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getDeterminedVariables <em>Determined Variables</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getStakeHolders <em>Stake Holders</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ParallelImpl#getProcessModules <em>Process Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelImpl extends NamedImpl implements Parallel {
	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<BoolTerm> variants;

	/**
	 * The cached value of the '{@link #getLayoutBefore() <em>Layout Before</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<Variantable> layoutBefore;

	/**
	 * The cached value of the '{@link #getLayoutAfter() <em>Layout After</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<Variantable> layoutAfter;

	/**
	 * The default value of the '{@link #getLayoutPriority() <em>Layout Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int LAYOUT_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLayoutPriority() <em>Layout Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutPriority()
	 * @generated
	 * @ordered
	 */
	protected int layoutPriority = LAYOUT_PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVerifiedBy() <em>Verified By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<IVerifier> verifiedBy;

	/**
	 * The cached value of the '{@link #getVerifies() <em>Verifies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifies()
	 * @generated
	 * @ordered
	 */
	protected EList<IVerified> verifies;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * The cached value of the '{@link #getSubProcessModules() <em>Sub Process Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> subProcessModules;

	/**
	 * The cached value of the '{@link #getInputArtifacts() <em>Input Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> inputArtifacts;

	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> tools;

	/**
	 * The cached value of the '{@link #getBeforeProcessModules() <em>Before Process Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> beforeProcessModules;

	/**
	 * The cached value of the '{@link #getAfterProcessModules() <em>After Process Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> afterProcessModules;

	/**
	 * The cached value of the '{@link #getInvolvedStakeHolders() <em>Involved Stake Holders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedStakeHolders()
	 * @generated
	 * @ordered
	 */
	protected EList<StakeHolder> involvedStakeHolders;

	/**
	 * The cached value of the '{@link #getPreMMCondition() <em>Pre MM Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreMMCondition()
	 * @generated
	 * @ordered
	 */
	protected MMCondition preMMCondition;

	/**
	 * The cached value of the '{@link #getPostMMCondition() <em>Post MM Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostMMCondition()
	 * @generated
	 * @ordered
	 */
	protected MMCondition postMMCondition;

	/**
	 * The cached value of the '{@link #getOutputArtifacts() <em>Output Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> outputArtifacts;

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindings;

	/**
	 * The default value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_INSTANCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected int numberOfInstances = NUMBER_OF_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffort() <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected static final float EFFORT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEffort() <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected float effort = EFFORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected static final float PROGRESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected float progress = PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlannedStartDate() <em>Planned Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANNED_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlannedStartDate() <em>Planned Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedStartDate()
	 * @generated
	 * @ordered
	 */
	protected String plannedStartDate = PLANNED_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlannedEndDate() <em>Planned End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANNED_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlannedEndDate() <em>Planned End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedEndDate()
	 * @generated
	 * @ordered
	 */
	protected String plannedEndDate = PLANNED_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubProcessModuleReferences() <em>Sub Process Module References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProcessModuleReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> subProcessModuleReferences;

	/**
	 * The cached value of the '{@link #getInstanceOfProcessModule() <em>Instance Of Process Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOfProcessModule()
	 * @generated
	 * @ordered
	 */
	protected ProcessModule instanceOfProcessModule;

	/**
	 * The cached value of the '{@link #getInstantiatedInProcessModules() <em>Instantiated In Process Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedInProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> instantiatedInProcessModules;

	/**
	 * The cached value of the '{@link #getCompliances() <em>Compliances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliances()
	 * @generated
	 * @ordered
	 */
	protected EList<Compliance> compliances;

	/**
	 * The cached value of the '{@link #getStakeHolder() <em>Stake Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeHolder()
	 * @generated
	 * @ordered
	 */
	protected StakeHolder stakeHolder;

	/**
	 * The cached value of the '{@link #getClaimedComplianceRequirements() <em>Claimed Compliance Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimedComplianceRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> claimedComplianceRequirements;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessStatus STATUS_EDEFAULT = ProcessStatus.DEFINED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ProcessStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterReferences() <em>Parameter References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameterReferences;

	/**
	 * The cached value of the '{@link #getDeterminedVariables() <em>Determined Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeterminedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessVariable> determinedVariables;

	/**
	 * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected static final Layout LAYOUT_EDEFAULT = Layout.TOP_BOTTOM;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout = LAYOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifacts;

	/**
	 * The cached value of the '{@link #getStakeHolders() <em>Stake Holders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeHolders()
	 * @generated
	 * @ordered
	 */
	protected EList<StakeHolder> stakeHolders;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getProcessModules() <em>Process Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> processModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferenceProcessPackage.Literals.PARALLEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoolTerm> getVariants() {
		if (variants == null) {
			variants = new EObjectContainmentEList<BoolTerm>(BoolTerm.class, this, ReferenceProcessPackage.PARALLEL__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getSubProcessModules() {
		if (subProcessModules == null) {
			subProcessModules = new EObjectContainmentEList<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULES);
		}
		return subProcessModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getInputArtifacts() {
		if (inputArtifacts == null) {
			inputArtifacts = new EObjectWithInverseResolvingEList.ManyInverse<Artifact>(Artifact.class, this, ReferenceProcessPackage.PARALLEL__INPUT_ARTIFACTS, ReferenceProcessPackage.ARTIFACT__READ_BY_PROCESS_MODULES);
		}
		return inputArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tool> getTools() {
		if (tools == null) {
			tools = new EObjectWithInverseResolvingEList.ManyInverse<Tool>(Tool.class, this, ReferenceProcessPackage.PARALLEL__TOOLS, ReferenceProcessPackage.TOOL__PROCESS_MODULES);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getBeforeProcessModules() {
		if (beforeProcessModules == null) {
			beforeProcessModules = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.PARALLEL__BEFORE_PROCESS_MODULES, ReferenceProcessPackage.PROCESS_MODULE__AFTER_PROCESS_MODULES);
		}
		return beforeProcessModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getAfterProcessModules() {
		if (afterProcessModules == null) {
			afterProcessModules = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.PARALLEL__AFTER_PROCESS_MODULES, ReferenceProcessPackage.PROCESS_MODULE__BEFORE_PROCESS_MODULES);
		}
		return afterProcessModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StakeHolder> getInvolvedStakeHolders() {
		if (involvedStakeHolders == null) {
			involvedStakeHolders = new EObjectWithInverseResolvingEList.ManyInverse<StakeHolder>(StakeHolder.class, this, ReferenceProcessPackage.PARALLEL__INVOLVED_STAKE_HOLDERS, ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_MODULES);
		}
		return involvedStakeHolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMCondition getPreMMCondition() {
		return preMMCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreMMCondition(MMCondition newPreMMCondition, NotificationChain msgs) {
		MMCondition oldPreMMCondition = preMMCondition;
		preMMCondition = newPreMMCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__PRE_MM_CONDITION, oldPreMMCondition, newPreMMCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreMMCondition(MMCondition newPreMMCondition) {
		if (newPreMMCondition != preMMCondition) {
			NotificationChain msgs = null;
			if (preMMCondition != null)
				msgs = ((InternalEObject)preMMCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferenceProcessPackage.PARALLEL__PRE_MM_CONDITION, null, msgs);
			if (newPreMMCondition != null)
				msgs = ((InternalEObject)newPreMMCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferenceProcessPackage.PARALLEL__PRE_MM_CONDITION, null, msgs);
			msgs = basicSetPreMMCondition(newPreMMCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__PRE_MM_CONDITION, newPreMMCondition, newPreMMCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMCondition getPostMMCondition() {
		return postMMCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostMMCondition(MMCondition newPostMMCondition, NotificationChain msgs) {
		MMCondition oldPostMMCondition = postMMCondition;
		postMMCondition = newPostMMCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__POST_MM_CONDITION, oldPostMMCondition, newPostMMCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostMMCondition(MMCondition newPostMMCondition) {
		if (newPostMMCondition != postMMCondition) {
			NotificationChain msgs = null;
			if (postMMCondition != null)
				msgs = ((InternalEObject)postMMCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferenceProcessPackage.PARALLEL__POST_MM_CONDITION, null, msgs);
			if (newPostMMCondition != null)
				msgs = ((InternalEObject)newPostMMCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferenceProcessPackage.PARALLEL__POST_MM_CONDITION, null, msgs);
			msgs = basicSetPostMMCondition(newPostMMCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__POST_MM_CONDITION, newPostMMCondition, newPostMMCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getOutputArtifacts() {
		if (outputArtifacts == null) {
			outputArtifacts = new EObjectWithInverseResolvingEList.ManyInverse<Artifact>(Artifact.class, this, ReferenceProcessPackage.PARALLEL__OUTPUT_ARTIFACTS, ReferenceProcessPackage.ARTIFACT__CREATED_BY_PROCESS_MODULES);
		}
		return outputArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getURI() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__URI, oldURI, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ReferenceProcessPackage.PARALLEL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<Binding>(Binding.class, this, ReferenceProcessPackage.PARALLEL__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variantable> getLayoutBefore() {
		if (layoutBefore == null) {
			layoutBefore = new EObjectWithInverseResolvingEList.ManyInverse<Variantable>(Variantable.class, this, ReferenceProcessPackage.PARALLEL__LAYOUT_BEFORE, SuptertypePackage.VARIANTABLE__LAYOUT_AFTER);
		}
		return layoutBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variantable> getLayoutAfter() {
		if (layoutAfter == null) {
			layoutAfter = new EObjectWithInverseResolvingEList.ManyInverse<Variantable>(Variantable.class, this, ReferenceProcessPackage.PARALLEL__LAYOUT_AFTER, SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE);
		}
		return layoutAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLayoutPriority() {
		return layoutPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayoutPriority(int newLayoutPriority) {
		int oldLayoutPriority = layoutPriority;
		layoutPriority = newLayoutPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__LAYOUT_PRIORITY, oldLayoutPriority, layoutPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IVerifier> getVerifiedBy() {
		if (verifiedBy == null) {
			verifiedBy = new EObjectWithInverseResolvingEList.ManyInverse<IVerifier>(IVerifier.class, this, ReferenceProcessPackage.PARALLEL__VERIFIED_BY, ReferenceProcessPackage.IVERIFIER__VERIFIES);
		}
		return verifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IVerified> getVerifies() {
		if (verifies == null) {
			verifies = new EObjectWithInverseResolvingEList.ManyInverse<IVerified>(IVerified.class, this, ReferenceProcessPackage.PARALLEL__VERIFIES, ReferenceProcessPackage.IVERIFIED__VERIFIED_BY);
		}
		return verifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectResolvingEList<Requirement>(Requirement.class, this, ReferenceProcessPackage.PARALLEL__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfInstances() {
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfInstances(int newNumberOfInstances) {
		int oldNumberOfInstances = numberOfInstances;
		numberOfInstances = newNumberOfInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__NUMBER_OF_INSTANCES, oldNumberOfInstances, numberOfInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getEffort() {
		return effort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffort(float newEffort) {
		float oldEffort = effort;
		effort = newEffort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__EFFORT, oldEffort, effort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getProgress() {
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgress(float newProgress) {
		float oldProgress = progress;
		progress = newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__PROGRESS, oldProgress, progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlannedStartDate() {
		return plannedStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlannedStartDate(String newPlannedStartDate) {
		String oldPlannedStartDate = plannedStartDate;
		plannedStartDate = newPlannedStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__PLANNED_START_DATE, oldPlannedStartDate, plannedStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlannedEndDate() {
		return plannedEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlannedEndDate(String newPlannedEndDate) {
		String oldPlannedEndDate = plannedEndDate;
		plannedEndDate = newPlannedEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__PLANNED_END_DATE, oldPlannedEndDate, plannedEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getSubProcessModuleReferences() {
		if (subProcessModuleReferences == null) {
			subProcessModuleReferences = new EObjectResolvingEList<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULE_REFERENCES);
		}
		return subProcessModuleReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessModule getInstanceOfProcessModule() {
		if (instanceOfProcessModule != null && instanceOfProcessModule.eIsProxy()) {
			InternalEObject oldInstanceOfProcessModule = (InternalEObject)instanceOfProcessModule;
			instanceOfProcessModule = (ProcessModule)eResolveProxy(oldInstanceOfProcessModule);
			if (instanceOfProcessModule != oldInstanceOfProcessModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferenceProcessPackage.PARALLEL__INSTANCE_OF_PROCESS_MODULE, oldInstanceOfProcessModule, instanceOfProcessModule));
			}
		}
		return instanceOfProcessModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModule basicGetInstanceOfProcessModule() {
		return instanceOfProcessModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceOfProcessModule(ProcessModule newInstanceOfProcessModule, NotificationChain msgs) {
		ProcessModule oldInstanceOfProcessModule = instanceOfProcessModule;
		instanceOfProcessModule = newInstanceOfProcessModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__INSTANCE_OF_PROCESS_MODULE, oldInstanceOfProcessModule, newInstanceOfProcessModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceOfProcessModule(ProcessModule newInstanceOfProcessModule) {
		if (newInstanceOfProcessModule != instanceOfProcessModule) {
			NotificationChain msgs = null;
			if (instanceOfProcessModule != null)
				msgs = ((InternalEObject)instanceOfProcessModule).eInverseRemove(this, ReferenceProcessPackage.PROCESS_MODULE__INSTANTIATED_IN_PROCESS_MODULES, ProcessModule.class, msgs);
			if (newInstanceOfProcessModule != null)
				msgs = ((InternalEObject)newInstanceOfProcessModule).eInverseAdd(this, ReferenceProcessPackage.PROCESS_MODULE__INSTANTIATED_IN_PROCESS_MODULES, ProcessModule.class, msgs);
			msgs = basicSetInstanceOfProcessModule(newInstanceOfProcessModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__INSTANCE_OF_PROCESS_MODULE, newInstanceOfProcessModule, newInstanceOfProcessModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getInstantiatedInProcessModules() {
		if (instantiatedInProcessModules == null) {
			instantiatedInProcessModules = new EObjectWithInverseResolvingEList<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.PARALLEL__INSTANTIATED_IN_PROCESS_MODULES, ReferenceProcessPackage.PROCESS_MODULE__INSTANCE_OF_PROCESS_MODULE);
		}
		return instantiatedInProcessModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Compliance> getCompliances() {
		if (compliances == null) {
			compliances = new EObjectWithInverseResolvingEList.ManyInverse<Compliance>(Compliance.class, this, ReferenceProcessPackage.PARALLEL__COMPLIANCES, ReferenceProcessPackage.COMPLIANCE__PROCESS_MODULES);
		}
		return compliances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StakeHolder getStakeHolder() {
		if (stakeHolder != null && stakeHolder.eIsProxy()) {
			InternalEObject oldStakeHolder = (InternalEObject)stakeHolder;
			stakeHolder = (StakeHolder)eResolveProxy(oldStakeHolder);
			if (stakeHolder != oldStakeHolder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferenceProcessPackage.PARALLEL__STAKE_HOLDER, oldStakeHolder, stakeHolder));
			}
		}
		return stakeHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeHolder basicGetStakeHolder() {
		return stakeHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStakeHolder(StakeHolder newStakeHolder, NotificationChain msgs) {
		StakeHolder oldStakeHolder = stakeHolder;
		stakeHolder = newStakeHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__STAKE_HOLDER, oldStakeHolder, newStakeHolder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStakeHolder(StakeHolder newStakeHolder) {
		if (newStakeHolder != stakeHolder) {
			NotificationChain msgs = null;
			if (stakeHolder != null)
				msgs = ((InternalEObject)stakeHolder).eInverseRemove(this, ReferenceProcessPackage.STAKE_HOLDER__OWNED_MODULES, StakeHolder.class, msgs);
			if (newStakeHolder != null)
				msgs = ((InternalEObject)newStakeHolder).eInverseAdd(this, ReferenceProcessPackage.STAKE_HOLDER__OWNED_MODULES, StakeHolder.class, msgs);
			msgs = basicSetStakeHolder(newStakeHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__STAKE_HOLDER, newStakeHolder, newStakeHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getClaimedComplianceRequirements() {
		if (claimedComplianceRequirements == null) {
			claimedComplianceRequirements = new EObjectWithInverseResolvingEList.ManyInverse<Requirement>(Requirement.class, this, ReferenceProcessPackage.PARALLEL__CLAIMED_COMPLIANCE_REQUIREMENTS, ReferenceProcessPackage.REQUIREMENT__CLAIMING_PROCESS_MODULES);
		}
		return claimedComplianceRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ProcessStatus newStatus) {
		ProcessStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameterReferences() {
		if (parameterReferences == null) {
			parameterReferences = new EObjectWithInverseResolvingEList.ManyInverse<Parameter>(Parameter.class, this, ReferenceProcessPackage.PARALLEL__PARAMETER_REFERENCES, TermsPackage.PARAMETER__REUSING_PROCESS_MODULES);
		}
		return parameterReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessVariable> getDeterminedVariables() {
		if (determinedVariables == null) {
			determinedVariables = new EObjectWithInverseResolvingEList.ManyInverse<ProcessVariable>(ProcessVariable.class, this, ReferenceProcessPackage.PARALLEL__DETERMINED_VARIABLES, TermsPackage.PROCESS_VARIABLE__DETERMINED_BY_PROCESS_MODULES);
		}
		return determinedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayout(Layout newLayout) {
		Layout oldLayout = layout;
		layout = newLayout == null ? LAYOUT_EDEFAULT : newLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PARALLEL__LAYOUT, oldLayout, layout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<Artifact>(Artifact.class, this, ReferenceProcessPackage.PARALLEL__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StakeHolder> getStakeHolders() {
		if (stakeHolders == null) {
			stakeHolders = new EObjectContainmentEList<StakeHolder>(StakeHolder.class, this, ReferenceProcessPackage.PARALLEL__STAKE_HOLDERS);
		}
		return stakeHolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, ReferenceProcessPackage.PARALLEL__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getProcessModules() {
		if (processModules == null) {
			processModules = new EObjectResolvingEList<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.PARALLEL__PROCESS_MODULES);
		}
		return processModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReferenceProcessPackage.PARALLEL__LAYOUT_BEFORE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLayoutBefore()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__LAYOUT_AFTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLayoutAfter()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__VERIFIED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVerifiedBy()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__VERIFIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVerifies()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__INPUT_ARTIFACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputArtifacts()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__TOOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTools()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__BEFORE_PROCESS_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBeforeProcessModules()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__AFTER_PROCESS_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAfterProcessModules()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__INVOLVED_STAKE_HOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvolvedStakeHolders()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__OUTPUT_ARTIFACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputArtifacts()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__INSTANCE_OF_PROCESS_MODULE:
				if (instanceOfProcessModule != null)
					msgs = ((InternalEObject)instanceOfProcessModule).eInverseRemove(this, ReferenceProcessPackage.PROCESS_MODULE__INSTANTIATED_IN_PROCESS_MODULES, ProcessModule.class, msgs);
				return basicSetInstanceOfProcessModule((ProcessModule)otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__INSTANTIATED_IN_PROCESS_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstantiatedInProcessModules()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__COMPLIANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompliances()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__STAKE_HOLDER:
				if (stakeHolder != null)
					msgs = ((InternalEObject)stakeHolder).eInverseRemove(this, ReferenceProcessPackage.STAKE_HOLDER__OWNED_MODULES, StakeHolder.class, msgs);
				return basicSetStakeHolder((StakeHolder)otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__CLAIMED_COMPLIANCE_REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClaimedComplianceRequirements()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__PARAMETER_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterReferences()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__DETERMINED_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeterminedVariables()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReferenceProcessPackage.PARALLEL__VARIANTS:
				return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__LAYOUT_BEFORE:
				return ((InternalEList<?>)getLayoutBefore()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__LAYOUT_AFTER:
				return ((InternalEList<?>)getLayoutAfter()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__VERIFIED_BY:
				return ((InternalEList<?>)getVerifiedBy()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__VERIFIES:
				return ((InternalEList<?>)getVerifies()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULES:
				return ((InternalEList<?>)getSubProcessModules()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__INPUT_ARTIFACTS:
				return ((InternalEList<?>)getInputArtifacts()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__BEFORE_PROCESS_MODULES:
				return ((InternalEList<?>)getBeforeProcessModules()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__AFTER_PROCESS_MODULES:
				return ((InternalEList<?>)getAfterProcessModules()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__INVOLVED_STAKE_HOLDERS:
				return ((InternalEList<?>)getInvolvedStakeHolders()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__PRE_MM_CONDITION:
				return basicSetPreMMCondition(null, msgs);
			case ReferenceProcessPackage.PARALLEL__POST_MM_CONDITION:
				return basicSetPostMMCondition(null, msgs);
			case ReferenceProcessPackage.PARALLEL__OUTPUT_ARTIFACTS:
				return ((InternalEList<?>)getOutputArtifacts()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__INSTANCE_OF_PROCESS_MODULE:
				return basicSetInstanceOfProcessModule(null, msgs);
			case ReferenceProcessPackage.PARALLEL__INSTANTIATED_IN_PROCESS_MODULES:
				return ((InternalEList<?>)getInstantiatedInProcessModules()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__COMPLIANCES:
				return ((InternalEList<?>)getCompliances()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__STAKE_HOLDER:
				return basicSetStakeHolder(null, msgs);
			case ReferenceProcessPackage.PARALLEL__CLAIMED_COMPLIANCE_REQUIREMENTS:
				return ((InternalEList<?>)getClaimedComplianceRequirements()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__PARAMETER_REFERENCES:
				return ((InternalEList<?>)getParameterReferences()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__DETERMINED_VARIABLES:
				return ((InternalEList<?>)getDeterminedVariables()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__STAKE_HOLDERS:
				return ((InternalEList<?>)getStakeHolders()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PARALLEL__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferenceProcessPackage.PARALLEL__VARIANTS:
				return getVariants();
			case ReferenceProcessPackage.PARALLEL__LAYOUT_BEFORE:
				return getLayoutBefore();
			case ReferenceProcessPackage.PARALLEL__LAYOUT_AFTER:
				return getLayoutAfter();
			case ReferenceProcessPackage.PARALLEL__LAYOUT_PRIORITY:
				return getLayoutPriority();
			case ReferenceProcessPackage.PARALLEL__VERIFIED_BY:
				return getVerifiedBy();
			case ReferenceProcessPackage.PARALLEL__VERIFIES:
				return getVerifies();
			case ReferenceProcessPackage.PARALLEL__REQUIREMENTS:
				return getRequirements();
			case ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULES:
				return getSubProcessModules();
			case ReferenceProcessPackage.PARALLEL__INPUT_ARTIFACTS:
				return getInputArtifacts();
			case ReferenceProcessPackage.PARALLEL__TOOLS:
				return getTools();
			case ReferenceProcessPackage.PARALLEL__BEFORE_PROCESS_MODULES:
				return getBeforeProcessModules();
			case ReferenceProcessPackage.PARALLEL__AFTER_PROCESS_MODULES:
				return getAfterProcessModules();
			case ReferenceProcessPackage.PARALLEL__INVOLVED_STAKE_HOLDERS:
				return getInvolvedStakeHolders();
			case ReferenceProcessPackage.PARALLEL__PRE_MM_CONDITION:
				return getPreMMCondition();
			case ReferenceProcessPackage.PARALLEL__POST_MM_CONDITION:
				return getPostMMCondition();
			case ReferenceProcessPackage.PARALLEL__OUTPUT_ARTIFACTS:
				return getOutputArtifacts();
			case ReferenceProcessPackage.PARALLEL__URI:
				return getURI();
			case ReferenceProcessPackage.PARALLEL__PARAMETERS:
				return getParameters();
			case ReferenceProcessPackage.PARALLEL__BINDINGS:
				return getBindings();
			case ReferenceProcessPackage.PARALLEL__NUMBER_OF_INSTANCES:
				return getNumberOfInstances();
			case ReferenceProcessPackage.PARALLEL__EFFORT:
				return getEffort();
			case ReferenceProcessPackage.PARALLEL__PROGRESS:
				return getProgress();
			case ReferenceProcessPackage.PARALLEL__PLANNED_START_DATE:
				return getPlannedStartDate();
			case ReferenceProcessPackage.PARALLEL__PLANNED_END_DATE:
				return getPlannedEndDate();
			case ReferenceProcessPackage.PARALLEL__END_DATE:
				return getEndDate();
			case ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULE_REFERENCES:
				return getSubProcessModuleReferences();
			case ReferenceProcessPackage.PARALLEL__INSTANCE_OF_PROCESS_MODULE:
				if (resolve) return getInstanceOfProcessModule();
				return basicGetInstanceOfProcessModule();
			case ReferenceProcessPackage.PARALLEL__INSTANTIATED_IN_PROCESS_MODULES:
				return getInstantiatedInProcessModules();
			case ReferenceProcessPackage.PARALLEL__COMPLIANCES:
				return getCompliances();
			case ReferenceProcessPackage.PARALLEL__STAKE_HOLDER:
				if (resolve) return getStakeHolder();
				return basicGetStakeHolder();
			case ReferenceProcessPackage.PARALLEL__CLAIMED_COMPLIANCE_REQUIREMENTS:
				return getClaimedComplianceRequirements();
			case ReferenceProcessPackage.PARALLEL__STATUS:
				return getStatus();
			case ReferenceProcessPackage.PARALLEL__PARAMETER_REFERENCES:
				return getParameterReferences();
			case ReferenceProcessPackage.PARALLEL__DETERMINED_VARIABLES:
				return getDeterminedVariables();
			case ReferenceProcessPackage.PARALLEL__LAYOUT:
				return getLayout();
			case ReferenceProcessPackage.PARALLEL__ARTIFACTS:
				return getArtifacts();
			case ReferenceProcessPackage.PARALLEL__STAKE_HOLDERS:
				return getStakeHolders();
			case ReferenceProcessPackage.PARALLEL__TYPES:
				return getTypes();
			case ReferenceProcessPackage.PARALLEL__PROCESS_MODULES:
				return getProcessModules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReferenceProcessPackage.PARALLEL__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends BoolTerm>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__LAYOUT_BEFORE:
				getLayoutBefore().clear();
				getLayoutBefore().addAll((Collection<? extends Variantable>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__LAYOUT_AFTER:
				getLayoutAfter().clear();
				getLayoutAfter().addAll((Collection<? extends Variantable>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__LAYOUT_PRIORITY:
				setLayoutPriority((Integer)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__VERIFIED_BY:
				getVerifiedBy().clear();
				getVerifiedBy().addAll((Collection<? extends IVerifier>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__VERIFIES:
				getVerifies().clear();
				getVerifies().addAll((Collection<? extends IVerified>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULES:
				getSubProcessModules().clear();
				getSubProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__INPUT_ARTIFACTS:
				getInputArtifacts().clear();
				getInputArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__BEFORE_PROCESS_MODULES:
				getBeforeProcessModules().clear();
				getBeforeProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__AFTER_PROCESS_MODULES:
				getAfterProcessModules().clear();
				getAfterProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__INVOLVED_STAKE_HOLDERS:
				getInvolvedStakeHolders().clear();
				getInvolvedStakeHolders().addAll((Collection<? extends StakeHolder>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__PRE_MM_CONDITION:
				setPreMMCondition((MMCondition)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__POST_MM_CONDITION:
				setPostMMCondition((MMCondition)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__OUTPUT_ARTIFACTS:
				getOutputArtifacts().clear();
				getOutputArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__URI:
				setURI((String)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Binding>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__NUMBER_OF_INSTANCES:
				setNumberOfInstances((Integer)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__EFFORT:
				setEffort((Float)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__PROGRESS:
				setProgress((Float)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__PLANNED_START_DATE:
				setPlannedStartDate((String)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__PLANNED_END_DATE:
				setPlannedEndDate((String)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__END_DATE:
				setEndDate((String)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULE_REFERENCES:
				getSubProcessModuleReferences().clear();
				getSubProcessModuleReferences().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__INSTANCE_OF_PROCESS_MODULE:
				setInstanceOfProcessModule((ProcessModule)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__INSTANTIATED_IN_PROCESS_MODULES:
				getInstantiatedInProcessModules().clear();
				getInstantiatedInProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__COMPLIANCES:
				getCompliances().clear();
				getCompliances().addAll((Collection<? extends Compliance>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__STAKE_HOLDER:
				setStakeHolder((StakeHolder)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__CLAIMED_COMPLIANCE_REQUIREMENTS:
				getClaimedComplianceRequirements().clear();
				getClaimedComplianceRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__STATUS:
				setStatus((ProcessStatus)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__PARAMETER_REFERENCES:
				getParameterReferences().clear();
				getParameterReferences().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__DETERMINED_VARIABLES:
				getDeterminedVariables().clear();
				getDeterminedVariables().addAll((Collection<? extends ProcessVariable>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__STAKE_HOLDERS:
				getStakeHolders().clear();
				getStakeHolders().addAll((Collection<? extends StakeHolder>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case ReferenceProcessPackage.PARALLEL__PROCESS_MODULES:
				getProcessModules().clear();
				getProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReferenceProcessPackage.PARALLEL__VARIANTS:
				getVariants().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__LAYOUT_BEFORE:
				getLayoutBefore().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__LAYOUT_AFTER:
				getLayoutAfter().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__LAYOUT_PRIORITY:
				setLayoutPriority(LAYOUT_PRIORITY_EDEFAULT);
				return;
			case ReferenceProcessPackage.PARALLEL__VERIFIED_BY:
				getVerifiedBy().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__VERIFIES:
				getVerifies().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__REQUIREMENTS:
				getRequirements().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULES:
				getSubProcessModules().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__INPUT_ARTIFACTS:
				getInputArtifacts().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__TOOLS:
				getTools().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__BEFORE_PROCESS_MODULES:
				getBeforeProcessModules().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__AFTER_PROCESS_MODULES:
				getAfterProcessModules().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__INVOLVED_STAKE_HOLDERS:
				getInvolvedStakeHolders().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__PRE_MM_CONDITION:
				setPreMMCondition((MMCondition)null);
				return;
			case ReferenceProcessPackage.PARALLEL__POST_MM_CONDITION:
				setPostMMCondition((MMCondition)null);
				return;
			case ReferenceProcessPackage.PARALLEL__OUTPUT_ARTIFACTS:
				getOutputArtifacts().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__URI:
				setURI(URI_EDEFAULT);
				return;
			case ReferenceProcessPackage.PARALLEL__PARAMETERS:
				getParameters().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__BINDINGS:
				getBindings().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__NUMBER_OF_INSTANCES:
				setNumberOfInstances(NUMBER_OF_INSTANCES_EDEFAULT);
				return;
			case ReferenceProcessPackage.PARALLEL__EFFORT:
				setEffort(EFFORT_EDEFAULT);
				return;
			case ReferenceProcessPackage.PARALLEL__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
				return;
			case ReferenceProcessPackage.PARALLEL__PLANNED_START_DATE:
				setPlannedStartDate(PLANNED_START_DATE_EDEFAULT);
				return;
			case ReferenceProcessPackage.PARALLEL__PLANNED_END_DATE:
				setPlannedEndDate(PLANNED_END_DATE_EDEFAULT);
				return;
			case ReferenceProcessPackage.PARALLEL__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULE_REFERENCES:
				getSubProcessModuleReferences().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__INSTANCE_OF_PROCESS_MODULE:
				setInstanceOfProcessModule((ProcessModule)null);
				return;
			case ReferenceProcessPackage.PARALLEL__INSTANTIATED_IN_PROCESS_MODULES:
				getInstantiatedInProcessModules().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__COMPLIANCES:
				getCompliances().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__STAKE_HOLDER:
				setStakeHolder((StakeHolder)null);
				return;
			case ReferenceProcessPackage.PARALLEL__CLAIMED_COMPLIANCE_REQUIREMENTS:
				getClaimedComplianceRequirements().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ReferenceProcessPackage.PARALLEL__PARAMETER_REFERENCES:
				getParameterReferences().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__DETERMINED_VARIABLES:
				getDeterminedVariables().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__LAYOUT:
				setLayout(LAYOUT_EDEFAULT);
				return;
			case ReferenceProcessPackage.PARALLEL__ARTIFACTS:
				getArtifacts().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__STAKE_HOLDERS:
				getStakeHolders().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__TYPES:
				getTypes().clear();
				return;
			case ReferenceProcessPackage.PARALLEL__PROCESS_MODULES:
				getProcessModules().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReferenceProcessPackage.PARALLEL__VARIANTS:
				return variants != null && !variants.isEmpty();
			case ReferenceProcessPackage.PARALLEL__LAYOUT_BEFORE:
				return layoutBefore != null && !layoutBefore.isEmpty();
			case ReferenceProcessPackage.PARALLEL__LAYOUT_AFTER:
				return layoutAfter != null && !layoutAfter.isEmpty();
			case ReferenceProcessPackage.PARALLEL__LAYOUT_PRIORITY:
				return layoutPriority != LAYOUT_PRIORITY_EDEFAULT;
			case ReferenceProcessPackage.PARALLEL__VERIFIED_BY:
				return verifiedBy != null && !verifiedBy.isEmpty();
			case ReferenceProcessPackage.PARALLEL__VERIFIES:
				return verifies != null && !verifies.isEmpty();
			case ReferenceProcessPackage.PARALLEL__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULES:
				return subProcessModules != null && !subProcessModules.isEmpty();
			case ReferenceProcessPackage.PARALLEL__INPUT_ARTIFACTS:
				return inputArtifacts != null && !inputArtifacts.isEmpty();
			case ReferenceProcessPackage.PARALLEL__TOOLS:
				return tools != null && !tools.isEmpty();
			case ReferenceProcessPackage.PARALLEL__BEFORE_PROCESS_MODULES:
				return beforeProcessModules != null && !beforeProcessModules.isEmpty();
			case ReferenceProcessPackage.PARALLEL__AFTER_PROCESS_MODULES:
				return afterProcessModules != null && !afterProcessModules.isEmpty();
			case ReferenceProcessPackage.PARALLEL__INVOLVED_STAKE_HOLDERS:
				return involvedStakeHolders != null && !involvedStakeHolders.isEmpty();
			case ReferenceProcessPackage.PARALLEL__PRE_MM_CONDITION:
				return preMMCondition != null;
			case ReferenceProcessPackage.PARALLEL__POST_MM_CONDITION:
				return postMMCondition != null;
			case ReferenceProcessPackage.PARALLEL__OUTPUT_ARTIFACTS:
				return outputArtifacts != null && !outputArtifacts.isEmpty();
			case ReferenceProcessPackage.PARALLEL__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case ReferenceProcessPackage.PARALLEL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ReferenceProcessPackage.PARALLEL__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case ReferenceProcessPackage.PARALLEL__NUMBER_OF_INSTANCES:
				return numberOfInstances != NUMBER_OF_INSTANCES_EDEFAULT;
			case ReferenceProcessPackage.PARALLEL__EFFORT:
				return effort != EFFORT_EDEFAULT;
			case ReferenceProcessPackage.PARALLEL__PROGRESS:
				return progress != PROGRESS_EDEFAULT;
			case ReferenceProcessPackage.PARALLEL__PLANNED_START_DATE:
				return PLANNED_START_DATE_EDEFAULT == null ? plannedStartDate != null : !PLANNED_START_DATE_EDEFAULT.equals(plannedStartDate);
			case ReferenceProcessPackage.PARALLEL__PLANNED_END_DATE:
				return PLANNED_END_DATE_EDEFAULT == null ? plannedEndDate != null : !PLANNED_END_DATE_EDEFAULT.equals(plannedEndDate);
			case ReferenceProcessPackage.PARALLEL__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULE_REFERENCES:
				return subProcessModuleReferences != null && !subProcessModuleReferences.isEmpty();
			case ReferenceProcessPackage.PARALLEL__INSTANCE_OF_PROCESS_MODULE:
				return instanceOfProcessModule != null;
			case ReferenceProcessPackage.PARALLEL__INSTANTIATED_IN_PROCESS_MODULES:
				return instantiatedInProcessModules != null && !instantiatedInProcessModules.isEmpty();
			case ReferenceProcessPackage.PARALLEL__COMPLIANCES:
				return compliances != null && !compliances.isEmpty();
			case ReferenceProcessPackage.PARALLEL__STAKE_HOLDER:
				return stakeHolder != null;
			case ReferenceProcessPackage.PARALLEL__CLAIMED_COMPLIANCE_REQUIREMENTS:
				return claimedComplianceRequirements != null && !claimedComplianceRequirements.isEmpty();
			case ReferenceProcessPackage.PARALLEL__STATUS:
				return status != STATUS_EDEFAULT;
			case ReferenceProcessPackage.PARALLEL__PARAMETER_REFERENCES:
				return parameterReferences != null && !parameterReferences.isEmpty();
			case ReferenceProcessPackage.PARALLEL__DETERMINED_VARIABLES:
				return determinedVariables != null && !determinedVariables.isEmpty();
			case ReferenceProcessPackage.PARALLEL__LAYOUT:
				return layout != LAYOUT_EDEFAULT;
			case ReferenceProcessPackage.PARALLEL__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
			case ReferenceProcessPackage.PARALLEL__STAKE_HOLDERS:
				return stakeHolders != null && !stakeHolders.isEmpty();
			case ReferenceProcessPackage.PARALLEL__TYPES:
				return types != null && !types.isEmpty();
			case ReferenceProcessPackage.PARALLEL__PROCESS_MODULES:
				return processModules != null && !processModules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Variantable.class) {
			switch (derivedFeatureID) {
				case ReferenceProcessPackage.PARALLEL__VARIANTS: return SuptertypePackage.VARIANTABLE__VARIANTS;
				case ReferenceProcessPackage.PARALLEL__LAYOUT_BEFORE: return SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE;
				case ReferenceProcessPackage.PARALLEL__LAYOUT_AFTER: return SuptertypePackage.VARIANTABLE__LAYOUT_AFTER;
				case ReferenceProcessPackage.PARALLEL__LAYOUT_PRIORITY: return SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY;
				default: return -1;
			}
		}
		if (baseClass == IVerified.class) {
			switch (derivedFeatureID) {
				case ReferenceProcessPackage.PARALLEL__VERIFIED_BY: return ReferenceProcessPackage.IVERIFIED__VERIFIED_BY;
				default: return -1;
			}
		}
		if (baseClass == IVerifier.class) {
			switch (derivedFeatureID) {
				case ReferenceProcessPackage.PARALLEL__VERIFIES: return ReferenceProcessPackage.IVERIFIER__VERIFIES;
				default: return -1;
			}
		}
		if (baseClass == ProcessModule.class) {
			switch (derivedFeatureID) {
				case ReferenceProcessPackage.PARALLEL__REQUIREMENTS: return ReferenceProcessPackage.PROCESS_MODULE__REQUIREMENTS;
				case ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULES: return ReferenceProcessPackage.PROCESS_MODULE__SUB_PROCESS_MODULES;
				case ReferenceProcessPackage.PARALLEL__INPUT_ARTIFACTS: return ReferenceProcessPackage.PROCESS_MODULE__INPUT_ARTIFACTS;
				case ReferenceProcessPackage.PARALLEL__TOOLS: return ReferenceProcessPackage.PROCESS_MODULE__TOOLS;
				case ReferenceProcessPackage.PARALLEL__BEFORE_PROCESS_MODULES: return ReferenceProcessPackage.PROCESS_MODULE__BEFORE_PROCESS_MODULES;
				case ReferenceProcessPackage.PARALLEL__AFTER_PROCESS_MODULES: return ReferenceProcessPackage.PROCESS_MODULE__AFTER_PROCESS_MODULES;
				case ReferenceProcessPackage.PARALLEL__INVOLVED_STAKE_HOLDERS: return ReferenceProcessPackage.PROCESS_MODULE__INVOLVED_STAKE_HOLDERS;
				case ReferenceProcessPackage.PARALLEL__PRE_MM_CONDITION: return ReferenceProcessPackage.PROCESS_MODULE__PRE_MM_CONDITION;
				case ReferenceProcessPackage.PARALLEL__POST_MM_CONDITION: return ReferenceProcessPackage.PROCESS_MODULE__POST_MM_CONDITION;
				case ReferenceProcessPackage.PARALLEL__OUTPUT_ARTIFACTS: return ReferenceProcessPackage.PROCESS_MODULE__OUTPUT_ARTIFACTS;
				case ReferenceProcessPackage.PARALLEL__URI: return ReferenceProcessPackage.PROCESS_MODULE__URI;
				case ReferenceProcessPackage.PARALLEL__PARAMETERS: return ReferenceProcessPackage.PROCESS_MODULE__PARAMETERS;
				case ReferenceProcessPackage.PARALLEL__BINDINGS: return ReferenceProcessPackage.PROCESS_MODULE__BINDINGS;
				case ReferenceProcessPackage.PARALLEL__NUMBER_OF_INSTANCES: return ReferenceProcessPackage.PROCESS_MODULE__NUMBER_OF_INSTANCES;
				case ReferenceProcessPackage.PARALLEL__EFFORT: return ReferenceProcessPackage.PROCESS_MODULE__EFFORT;
				case ReferenceProcessPackage.PARALLEL__PROGRESS: return ReferenceProcessPackage.PROCESS_MODULE__PROGRESS;
				case ReferenceProcessPackage.PARALLEL__PLANNED_START_DATE: return ReferenceProcessPackage.PROCESS_MODULE__PLANNED_START_DATE;
				case ReferenceProcessPackage.PARALLEL__PLANNED_END_DATE: return ReferenceProcessPackage.PROCESS_MODULE__PLANNED_END_DATE;
				case ReferenceProcessPackage.PARALLEL__END_DATE: return ReferenceProcessPackage.PROCESS_MODULE__END_DATE;
				case ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULE_REFERENCES: return ReferenceProcessPackage.PROCESS_MODULE__SUB_PROCESS_MODULE_REFERENCES;
				case ReferenceProcessPackage.PARALLEL__INSTANCE_OF_PROCESS_MODULE: return ReferenceProcessPackage.PROCESS_MODULE__INSTANCE_OF_PROCESS_MODULE;
				case ReferenceProcessPackage.PARALLEL__INSTANTIATED_IN_PROCESS_MODULES: return ReferenceProcessPackage.PROCESS_MODULE__INSTANTIATED_IN_PROCESS_MODULES;
				case ReferenceProcessPackage.PARALLEL__COMPLIANCES: return ReferenceProcessPackage.PROCESS_MODULE__COMPLIANCES;
				case ReferenceProcessPackage.PARALLEL__STAKE_HOLDER: return ReferenceProcessPackage.PROCESS_MODULE__STAKE_HOLDER;
				case ReferenceProcessPackage.PARALLEL__CLAIMED_COMPLIANCE_REQUIREMENTS: return ReferenceProcessPackage.PROCESS_MODULE__CLAIMED_COMPLIANCE_REQUIREMENTS;
				case ReferenceProcessPackage.PARALLEL__STATUS: return ReferenceProcessPackage.PROCESS_MODULE__STATUS;
				case ReferenceProcessPackage.PARALLEL__PARAMETER_REFERENCES: return ReferenceProcessPackage.PROCESS_MODULE__PARAMETER_REFERENCES;
				case ReferenceProcessPackage.PARALLEL__DETERMINED_VARIABLES: return ReferenceProcessPackage.PROCESS_MODULE__DETERMINED_VARIABLES;
				case ReferenceProcessPackage.PARALLEL__LAYOUT: return ReferenceProcessPackage.PROCESS_MODULE__LAYOUT;
				case ReferenceProcessPackage.PARALLEL__ARTIFACTS: return ReferenceProcessPackage.PROCESS_MODULE__ARTIFACTS;
				case ReferenceProcessPackage.PARALLEL__STAKE_HOLDERS: return ReferenceProcessPackage.PROCESS_MODULE__STAKE_HOLDERS;
				case ReferenceProcessPackage.PARALLEL__TYPES: return ReferenceProcessPackage.PROCESS_MODULE__TYPES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Variantable.class) {
			switch (baseFeatureID) {
				case SuptertypePackage.VARIANTABLE__VARIANTS: return ReferenceProcessPackage.PARALLEL__VARIANTS;
				case SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE: return ReferenceProcessPackage.PARALLEL__LAYOUT_BEFORE;
				case SuptertypePackage.VARIANTABLE__LAYOUT_AFTER: return ReferenceProcessPackage.PARALLEL__LAYOUT_AFTER;
				case SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY: return ReferenceProcessPackage.PARALLEL__LAYOUT_PRIORITY;
				default: return -1;
			}
		}
		if (baseClass == IVerified.class) {
			switch (baseFeatureID) {
				case ReferenceProcessPackage.IVERIFIED__VERIFIED_BY: return ReferenceProcessPackage.PARALLEL__VERIFIED_BY;
				default: return -1;
			}
		}
		if (baseClass == IVerifier.class) {
			switch (baseFeatureID) {
				case ReferenceProcessPackage.IVERIFIER__VERIFIES: return ReferenceProcessPackage.PARALLEL__VERIFIES;
				default: return -1;
			}
		}
		if (baseClass == ProcessModule.class) {
			switch (baseFeatureID) {
				case ReferenceProcessPackage.PROCESS_MODULE__REQUIREMENTS: return ReferenceProcessPackage.PARALLEL__REQUIREMENTS;
				case ReferenceProcessPackage.PROCESS_MODULE__SUB_PROCESS_MODULES: return ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULES;
				case ReferenceProcessPackage.PROCESS_MODULE__INPUT_ARTIFACTS: return ReferenceProcessPackage.PARALLEL__INPUT_ARTIFACTS;
				case ReferenceProcessPackage.PROCESS_MODULE__TOOLS: return ReferenceProcessPackage.PARALLEL__TOOLS;
				case ReferenceProcessPackage.PROCESS_MODULE__BEFORE_PROCESS_MODULES: return ReferenceProcessPackage.PARALLEL__BEFORE_PROCESS_MODULES;
				case ReferenceProcessPackage.PROCESS_MODULE__AFTER_PROCESS_MODULES: return ReferenceProcessPackage.PARALLEL__AFTER_PROCESS_MODULES;
				case ReferenceProcessPackage.PROCESS_MODULE__INVOLVED_STAKE_HOLDERS: return ReferenceProcessPackage.PARALLEL__INVOLVED_STAKE_HOLDERS;
				case ReferenceProcessPackage.PROCESS_MODULE__PRE_MM_CONDITION: return ReferenceProcessPackage.PARALLEL__PRE_MM_CONDITION;
				case ReferenceProcessPackage.PROCESS_MODULE__POST_MM_CONDITION: return ReferenceProcessPackage.PARALLEL__POST_MM_CONDITION;
				case ReferenceProcessPackage.PROCESS_MODULE__OUTPUT_ARTIFACTS: return ReferenceProcessPackage.PARALLEL__OUTPUT_ARTIFACTS;
				case ReferenceProcessPackage.PROCESS_MODULE__URI: return ReferenceProcessPackage.PARALLEL__URI;
				case ReferenceProcessPackage.PROCESS_MODULE__PARAMETERS: return ReferenceProcessPackage.PARALLEL__PARAMETERS;
				case ReferenceProcessPackage.PROCESS_MODULE__BINDINGS: return ReferenceProcessPackage.PARALLEL__BINDINGS;
				case ReferenceProcessPackage.PROCESS_MODULE__NUMBER_OF_INSTANCES: return ReferenceProcessPackage.PARALLEL__NUMBER_OF_INSTANCES;
				case ReferenceProcessPackage.PROCESS_MODULE__EFFORT: return ReferenceProcessPackage.PARALLEL__EFFORT;
				case ReferenceProcessPackage.PROCESS_MODULE__PROGRESS: return ReferenceProcessPackage.PARALLEL__PROGRESS;
				case ReferenceProcessPackage.PROCESS_MODULE__PLANNED_START_DATE: return ReferenceProcessPackage.PARALLEL__PLANNED_START_DATE;
				case ReferenceProcessPackage.PROCESS_MODULE__PLANNED_END_DATE: return ReferenceProcessPackage.PARALLEL__PLANNED_END_DATE;
				case ReferenceProcessPackage.PROCESS_MODULE__END_DATE: return ReferenceProcessPackage.PARALLEL__END_DATE;
				case ReferenceProcessPackage.PROCESS_MODULE__SUB_PROCESS_MODULE_REFERENCES: return ReferenceProcessPackage.PARALLEL__SUB_PROCESS_MODULE_REFERENCES;
				case ReferenceProcessPackage.PROCESS_MODULE__INSTANCE_OF_PROCESS_MODULE: return ReferenceProcessPackage.PARALLEL__INSTANCE_OF_PROCESS_MODULE;
				case ReferenceProcessPackage.PROCESS_MODULE__INSTANTIATED_IN_PROCESS_MODULES: return ReferenceProcessPackage.PARALLEL__INSTANTIATED_IN_PROCESS_MODULES;
				case ReferenceProcessPackage.PROCESS_MODULE__COMPLIANCES: return ReferenceProcessPackage.PARALLEL__COMPLIANCES;
				case ReferenceProcessPackage.PROCESS_MODULE__STAKE_HOLDER: return ReferenceProcessPackage.PARALLEL__STAKE_HOLDER;
				case ReferenceProcessPackage.PROCESS_MODULE__CLAIMED_COMPLIANCE_REQUIREMENTS: return ReferenceProcessPackage.PARALLEL__CLAIMED_COMPLIANCE_REQUIREMENTS;
				case ReferenceProcessPackage.PROCESS_MODULE__STATUS: return ReferenceProcessPackage.PARALLEL__STATUS;
				case ReferenceProcessPackage.PROCESS_MODULE__PARAMETER_REFERENCES: return ReferenceProcessPackage.PARALLEL__PARAMETER_REFERENCES;
				case ReferenceProcessPackage.PROCESS_MODULE__DETERMINED_VARIABLES: return ReferenceProcessPackage.PARALLEL__DETERMINED_VARIABLES;
				case ReferenceProcessPackage.PROCESS_MODULE__LAYOUT: return ReferenceProcessPackage.PARALLEL__LAYOUT;
				case ReferenceProcessPackage.PROCESS_MODULE__ARTIFACTS: return ReferenceProcessPackage.PARALLEL__ARTIFACTS;
				case ReferenceProcessPackage.PROCESS_MODULE__STAKE_HOLDERS: return ReferenceProcessPackage.PARALLEL__STAKE_HOLDERS;
				case ReferenceProcessPackage.PROCESS_MODULE__TYPES: return ReferenceProcessPackage.PARALLEL__TYPES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (LayoutPriority: ");
		result.append(layoutPriority);
		result.append(", URI: ");
		result.append(uri);
		result.append(", NumberOfInstances: ");
		result.append(numberOfInstances);
		result.append(", Effort: ");
		result.append(effort);
		result.append(", Progress: ");
		result.append(progress);
		result.append(", PlannedStartDate: ");
		result.append(plannedStartDate);
		result.append(", PlannedEndDate: ");
		result.append(plannedEndDate);
		result.append(", EndDate: ");
		result.append(endDate);
		result.append(", Status: ");
		result.append(status);
		result.append(", Layout: ");
		result.append(layout);
		result.append(')');
		return result.toString();
	}

} //ParallelImpl
