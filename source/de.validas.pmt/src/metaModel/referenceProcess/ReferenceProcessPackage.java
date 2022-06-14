/**
 */
package metaModel.referenceProcess;

import metaModel.suptertype.SuptertypePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metaModel.referenceProcess.ReferenceProcessFactory
 * @model kind="package"
 * @generated
 */
public interface ReferenceProcessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "referenceProcess";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.validas.de/spedit/referenceProcess";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.validas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferenceProcessPackage eINSTANCE = metaModel.referenceProcess.impl.ReferenceProcessPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.ProcessImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = SuptertypePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DESCRIPTION = SuptertypePackage.NAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = SuptertypePackage.NAMED__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__COMMENT = SuptertypePackage.NAMED__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__LONG_DESCRIPTION = SuptertypePackage.NAMED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DEACTIVATED = SuptertypePackage.NAMED__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TOOLS = SuptertypePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__REQUIREMENTS = SuptertypePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ARTIFACTS = SuptertypePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__METHODS = SuptertypePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Process Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_MODULES = SuptertypePackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stake Holders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STAKE_HOLDERS = SuptertypePackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Process Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_CONDITIONS = SuptertypePackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARAMETERS = SuptertypePackage.NAMED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BINDINGS = SuptertypePackage.NAMED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TYPES = SuptertypePackage.NAMED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Maximal Safety Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MAXIMAL_SAFETY_LEVEL = SuptertypePackage.NAMED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PREFERENCES = SuptertypePackage.NAMED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Filter Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FILTER_SCOPE = SuptertypePackage.NAMED_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = SuptertypePackage.NAMED_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = SuptertypePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.ToolImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = SuptertypePackage.VARIANTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DESCRIPTION = SuptertypePackage.VARIANTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = SuptertypePackage.VARIANTABLE__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__COMMENT = SuptertypePackage.VARIANTABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LONG_DESCRIPTION = SuptertypePackage.VARIANTABLE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DEACTIVATED = SuptertypePackage.VARIANTABLE__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__VARIANTS = SuptertypePackage.VARIANTABLE__VARIANTS;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LAYOUT_BEFORE = SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LAYOUT_AFTER = SuptertypePackage.VARIANTABLE__LAYOUT_AFTER;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LAYOUT_PRIORITY = SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY;

	/**
	 * The feature id for the '<em><b>Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__PROCESS_MODULES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__METHODS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__META_MODEL = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Preliminary Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__PRELIMINARY_CLASSIFICATION = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Classification Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CLASSIFICATION_EXPLANATION = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tool Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TOOL_OWNER = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = SuptertypePackage.VARIANTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.StakeHolderImpl <em>Stake Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.StakeHolderImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getStakeHolder()
	 * @generated
	 */
	int STAKE_HOLDER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__NAME = SuptertypePackage.VARIANTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__DESCRIPTION = SuptertypePackage.VARIANTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__ID = SuptertypePackage.VARIANTABLE__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__COMMENT = SuptertypePackage.VARIANTABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__LONG_DESCRIPTION = SuptertypePackage.VARIANTABLE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__DEACTIVATED = SuptertypePackage.VARIANTABLE__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__VARIANTS = SuptertypePackage.VARIANTABLE__VARIANTS;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__LAYOUT_BEFORE = SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__LAYOUT_AFTER = SuptertypePackage.VARIANTABLE__LAYOUT_AFTER;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__LAYOUT_PRIORITY = SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY;

	/**
	 * The feature id for the '<em><b>Owned Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__OWNED_MODULES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Involved Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__INVOLVED_MODULES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compliances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__COMPLIANCES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assigned Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__ASSIGNED_PERSON = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__OWNED_ARTIFACTS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Involved Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__INVOLVED_ARTIFACTS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__OWNED_TOOLS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__LAYOUT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Stake Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_FEATURE_COUNT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Stake Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_OPERATION_COUNT = SuptertypePackage.VARIANTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.ArtifactImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = SuptertypePackage.VARIANTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DESCRIPTION = SuptertypePackage.VARIANTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ID = SuptertypePackage.VARIANTABLE__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__COMMENT = SuptertypePackage.VARIANTABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__LONG_DESCRIPTION = SuptertypePackage.VARIANTABLE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DEACTIVATED = SuptertypePackage.VARIANTABLE__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__VARIANTS = SuptertypePackage.VARIANTABLE__VARIANTS;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__LAYOUT_BEFORE = SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__LAYOUT_AFTER = SuptertypePackage.VARIANTABLE__LAYOUT_AFTER;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__LAYOUT_PRIORITY = SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__VERIFIED_BY = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DOCUMENT_STATUS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__VERSION = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Read By Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__READ_BY_PROCESS_MODULES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Process Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PROCESS_CONDITIONS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created By Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CREATED_BY_PROCESS_MODULES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__SUB_ARTIFACTS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sub Artifact References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__SUB_ARTIFACT_REFERENCES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Compliances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__COMPLIANCES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Involved Stake Holders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__INVOLVED_STAKE_HOLDERS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stake Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__STAKE_HOLDER = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PATH = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__STATUS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Part Of Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PART_OF_PRODUCT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Refered By Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__REFERED_BY_ARTIFACTS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Project Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PROJECT_INPUT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__LAYOUT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = SuptertypePackage.VARIANTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.ModelImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = ARTIFACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ID = ARTIFACT__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMMENT = ARTIFACT__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LONG_DESCRIPTION = ARTIFACT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEACTIVATED = ARTIFACT__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VARIANTS = ARTIFACT__VARIANTS;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LAYOUT_BEFORE = ARTIFACT__LAYOUT_BEFORE;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LAYOUT_AFTER = ARTIFACT__LAYOUT_AFTER;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LAYOUT_PRIORITY = ARTIFACT__LAYOUT_PRIORITY;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VERIFIED_BY = ARTIFACT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Document Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DOCUMENT_STATUS = ARTIFACT__DOCUMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VERSION = ARTIFACT__VERSION;

	/**
	 * The feature id for the '<em><b>Read By Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__READ_BY_PROCESS_MODULES = ARTIFACT__READ_BY_PROCESS_MODULES;

	/**
	 * The feature id for the '<em><b>Process Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROCESS_CONDITIONS = ARTIFACT__PROCESS_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Created By Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CREATED_BY_PROCESS_MODULES = ARTIFACT__CREATED_BY_PROCESS_MODULES;

	/**
	 * The feature id for the '<em><b>Sub Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SUB_ARTIFACTS = ARTIFACT__SUB_ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Sub Artifact References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SUB_ARTIFACT_REFERENCES = ARTIFACT__SUB_ARTIFACT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Compliances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMPLIANCES = ARTIFACT__COMPLIANCES;

	/**
	 * The feature id for the '<em><b>Involved Stake Holders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INVOLVED_STAKE_HOLDERS = ARTIFACT__INVOLVED_STAKE_HOLDERS;

	/**
	 * The feature id for the '<em><b>Stake Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__STAKE_HOLDER = ARTIFACT__STAKE_HOLDER;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PATH = ARTIFACT__PATH;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__STATUS = ARTIFACT__STATUS;

	/**
	 * The feature id for the '<em><b>Part Of Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PART_OF_PRODUCT = ARTIFACT__PART_OF_PRODUCT;

	/**
	 * The feature id for the '<em><b>Refered By Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REFERED_BY_ARTIFACTS = ARTIFACT__REFERED_BY_ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Project Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROJECT_INPUT = ARTIFACT__PROJECT_INPUT;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LAYOUT = ARTIFACT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Meta Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__META_MODEL = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INCLUDES = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Included In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IS_INCLUDED_IN = ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mandatory Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MANDATORY_ELEMENTS = ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mandatory Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MANDATORY_ATTRIBUTES = ARTIFACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mandatory Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MANDATORY_ASSOCIATIONS = ARTIFACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Optional Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OPTIONAL_ELEMENTS = ARTIFACT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Optional Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OPTIONAL_ATTRIBUTES = ARTIFACT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Optional Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OPTIONAL_ASSOCIATIONS = ARTIFACT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.ProcessModuleImpl <em>Process Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.ProcessModuleImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getProcessModule()
	 * @generated
	 */
	int PROCESS_MODULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__NAME = SuptertypePackage.VARIANTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__DESCRIPTION = SuptertypePackage.VARIANTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__ID = SuptertypePackage.VARIANTABLE__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__COMMENT = SuptertypePackage.VARIANTABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__LONG_DESCRIPTION = SuptertypePackage.VARIANTABLE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__DEACTIVATED = SuptertypePackage.VARIANTABLE__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__VARIANTS = SuptertypePackage.VARIANTABLE__VARIANTS;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__LAYOUT_BEFORE = SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__LAYOUT_AFTER = SuptertypePackage.VARIANTABLE__LAYOUT_AFTER;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__LAYOUT_PRIORITY = SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__VERIFIED_BY = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__VERIFIES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__REQUIREMENTS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Process Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__SUB_PROCESS_MODULES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__INPUT_ARTIFACTS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__TOOLS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Before Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__BEFORE_PROCESS_MODULES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>After Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__AFTER_PROCESS_MODULES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Involved Stake Holders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__INVOLVED_STAKE_HOLDERS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pre MM Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__PRE_MM_CONDITION = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Post MM Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__POST_MM_CONDITION = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Output Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__OUTPUT_ARTIFACTS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__URI = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__PARAMETERS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__BINDINGS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Number Of Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__NUMBER_OF_INSTANCES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__EFFORT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__PROGRESS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Planned Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__PLANNED_START_DATE = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Planned End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__PLANNED_END_DATE = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__END_DATE = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Sub Process Module References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__SUB_PROCESS_MODULE_REFERENCES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Instance Of Process Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__INSTANCE_OF_PROCESS_MODULE = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Instantiated In Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__INSTANTIATED_IN_PROCESS_MODULES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Compliances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__COMPLIANCES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Stake Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__STAKE_HOLDER = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Claimed Compliance Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__CLAIMED_COMPLIANCE_REQUIREMENTS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__STATUS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__PARAMETER_REFERENCES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Determined Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__DETERMINED_VARIABLES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__LAYOUT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__ARTIFACTS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Stake Holders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__STAKE_HOLDERS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE__TYPES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 33;

	/**
	 * The number of structural features of the '<em>Process Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE_FEATURE_COUNT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 34;

	/**
	 * The number of operations of the '<em>Process Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODULE_OPERATION_COUNT = SuptertypePackage.VARIANTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.RequirementImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 5;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.AlternativeImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 7;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.ParallelImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 8;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.IVerified <em>IVerified</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.IVerified
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getIVerified()
	 * @generated
	 */
	int IVERIFIED = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = SuptertypePackage.VARIANTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = SuptertypePackage.VARIANTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = SuptertypePackage.VARIANTABLE__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COMMENT = SuptertypePackage.VARIANTABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LONG_DESCRIPTION = SuptertypePackage.VARIANTABLE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DEACTIVATED = SuptertypePackage.VARIANTABLE__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VARIANTS = SuptertypePackage.VARIANTABLE__VARIANTS;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LAYOUT_BEFORE = SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LAYOUT_AFTER = SuptertypePackage.VARIANTABLE__LAYOUT_AFTER;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LAYOUT_PRIORITY = SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFIED_BY = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SUB_REQUIREMENTS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIRED_REQUIREMENTS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required By Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIRED_BY_REQUIREMENTS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Recommented From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RECOMMENTED_FROM = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Recommented To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RECOMMENTED_TO = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Compliances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COMPLIANCES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Claiming Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CLAIMING_PROCESS_MODULES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = SuptertypePackage.VARIANTABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__NAME = SuptertypePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__DESCRIPTION = SuptertypePackage.NAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ID = SuptertypePackage.NAMED__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__COMMENT = SuptertypePackage.NAMED__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__LONG_DESCRIPTION = SuptertypePackage.NAMED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__DEACTIVATED = SuptertypePackage.NAMED__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__VARIANTS = SuptertypePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__LAYOUT_BEFORE = SuptertypePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__LAYOUT_AFTER = SuptertypePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__LAYOUT_PRIORITY = SuptertypePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__VERIFIED_BY = SuptertypePackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Verifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__VERIFIES = SuptertypePackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__REQUIREMENTS = SuptertypePackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sub Process Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__SUB_PROCESS_MODULES = SuptertypePackage.NAMED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Input Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__INPUT_ARTIFACTS = SuptertypePackage.NAMED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__TOOLS = SuptertypePackage.NAMED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Before Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__BEFORE_PROCESS_MODULES = SuptertypePackage.NAMED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>After Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__AFTER_PROCESS_MODULES = SuptertypePackage.NAMED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Involved Stake Holders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__INVOLVED_STAKE_HOLDERS = SuptertypePackage.NAMED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pre MM Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__PRE_MM_CONDITION = SuptertypePackage.NAMED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Post MM Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__POST_MM_CONDITION = SuptertypePackage.NAMED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Output Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__OUTPUT_ARTIFACTS = SuptertypePackage.NAMED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__URI = SuptertypePackage.NAMED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__PARAMETERS = SuptertypePackage.NAMED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__BINDINGS = SuptertypePackage.NAMED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Number Of Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__NUMBER_OF_INSTANCES = SuptertypePackage.NAMED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__EFFORT = SuptertypePackage.NAMED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__PROGRESS = SuptertypePackage.NAMED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Planned Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__PLANNED_START_DATE = SuptertypePackage.NAMED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Planned End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__PLANNED_END_DATE = SuptertypePackage.NAMED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__END_DATE = SuptertypePackage.NAMED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Sub Process Module References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__SUB_PROCESS_MODULE_REFERENCES = SuptertypePackage.NAMED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Instance Of Process Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__INSTANCE_OF_PROCESS_MODULE = SuptertypePackage.NAMED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Instantiated In Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__INSTANTIATED_IN_PROCESS_MODULES = SuptertypePackage.NAMED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Compliances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__COMPLIANCES = SuptertypePackage.NAMED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Stake Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__STAKE_HOLDER = SuptertypePackage.NAMED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Claimed Compliance Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__CLAIMED_COMPLIANCE_REQUIREMENTS = SuptertypePackage.NAMED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__STATUS = SuptertypePackage.NAMED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__PARAMETER_REFERENCES = SuptertypePackage.NAMED_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Determined Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__DETERMINED_VARIABLES = SuptertypePackage.NAMED_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__LAYOUT = SuptertypePackage.NAMED_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ARTIFACTS = SuptertypePackage.NAMED_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Stake Holders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__STAKE_HOLDERS = SuptertypePackage.NAMED_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__TYPES = SuptertypePackage.NAMED_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__PROCESS_MODULES = SuptertypePackage.NAMED_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__CONDITION = SuptertypePackage.NAMED_FEATURE_COUNT + 39;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = SuptertypePackage.NAMED_FEATURE_COUNT + 40;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = SuptertypePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__NAME = SuptertypePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__DESCRIPTION = SuptertypePackage.NAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ID = SuptertypePackage.NAMED__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__COMMENT = SuptertypePackage.NAMED__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__LONG_DESCRIPTION = SuptertypePackage.NAMED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__DEACTIVATED = SuptertypePackage.NAMED__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__VARIANTS = SuptertypePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__LAYOUT_BEFORE = SuptertypePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__LAYOUT_AFTER = SuptertypePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__LAYOUT_PRIORITY = SuptertypePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__VERIFIED_BY = SuptertypePackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Verifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__VERIFIES = SuptertypePackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__REQUIREMENTS = SuptertypePackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sub Process Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__SUB_PROCESS_MODULES = SuptertypePackage.NAMED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Input Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__INPUT_ARTIFACTS = SuptertypePackage.NAMED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__TOOLS = SuptertypePackage.NAMED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Before Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__BEFORE_PROCESS_MODULES = SuptertypePackage.NAMED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>After Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__AFTER_PROCESS_MODULES = SuptertypePackage.NAMED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Involved Stake Holders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__INVOLVED_STAKE_HOLDERS = SuptertypePackage.NAMED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pre MM Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__PRE_MM_CONDITION = SuptertypePackage.NAMED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Post MM Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__POST_MM_CONDITION = SuptertypePackage.NAMED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Output Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OUTPUT_ARTIFACTS = SuptertypePackage.NAMED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__URI = SuptertypePackage.NAMED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__PARAMETERS = SuptertypePackage.NAMED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__BINDINGS = SuptertypePackage.NAMED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Number Of Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__NUMBER_OF_INSTANCES = SuptertypePackage.NAMED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__EFFORT = SuptertypePackage.NAMED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__PROGRESS = SuptertypePackage.NAMED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Planned Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__PLANNED_START_DATE = SuptertypePackage.NAMED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Planned End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__PLANNED_END_DATE = SuptertypePackage.NAMED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__END_DATE = SuptertypePackage.NAMED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Sub Process Module References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__SUB_PROCESS_MODULE_REFERENCES = SuptertypePackage.NAMED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Instance Of Process Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__INSTANCE_OF_PROCESS_MODULE = SuptertypePackage.NAMED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Instantiated In Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__INSTANTIATED_IN_PROCESS_MODULES = SuptertypePackage.NAMED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Compliances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__COMPLIANCES = SuptertypePackage.NAMED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Stake Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__STAKE_HOLDER = SuptertypePackage.NAMED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Claimed Compliance Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__CLAIMED_COMPLIANCE_REQUIREMENTS = SuptertypePackage.NAMED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__STATUS = SuptertypePackage.NAMED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__PARAMETER_REFERENCES = SuptertypePackage.NAMED_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Determined Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__DETERMINED_VARIABLES = SuptertypePackage.NAMED_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__LAYOUT = SuptertypePackage.NAMED_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ARTIFACTS = SuptertypePackage.NAMED_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Stake Holders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__STAKE_HOLDERS = SuptertypePackage.NAMED_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__TYPES = SuptertypePackage.NAMED_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__PROCESS_MODULES = SuptertypePackage.NAMED_FEATURE_COUNT + 38;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = SuptertypePackage.NAMED_FEATURE_COUNT + 39;

	/**
	 * The number of operations of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OPERATION_COUNT = SuptertypePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.MethodImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = SuptertypePackage.VARIANTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DESCRIPTION = SuptertypePackage.VARIANTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ID = SuptertypePackage.VARIANTABLE__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__COMMENT = SuptertypePackage.VARIANTABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__LONG_DESCRIPTION = SuptertypePackage.VARIANTABLE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DEACTIVATED = SuptertypePackage.VARIANTABLE__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VARIANTS = SuptertypePackage.VARIANTABLE__VARIANTS;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__LAYOUT_BEFORE = SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__LAYOUT_AFTER = SuptertypePackage.VARIANTABLE__LAYOUT_AFTER;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__LAYOUT_PRIORITY = SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TOOLS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = SuptertypePackage.VARIANTABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVERIFIED__VERIFIED_BY = 0;

	/**
	 * The number of structural features of the '<em>IVerified</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVERIFIED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IVerified</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVERIFIED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.IVerifier <em>IVerifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.IVerifier
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getIVerifier()
	 * @generated
	 */
	int IVERIFIER = 11;

	/**
	 * The feature id for the '<em><b>Verifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVERIFIER__VERIFIES = 0;

	/**
	 * The number of structural features of the '<em>IVerifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVERIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IVerifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVERIFIER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.ComplianceImpl <em>Compliance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.ComplianceImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getCompliance()
	 * @generated
	 */
	int COMPLIANCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__NAME = SuptertypePackage.VARIANTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__DESCRIPTION = SuptertypePackage.VARIANTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__ID = SuptertypePackage.VARIANTABLE__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__COMMENT = SuptertypePackage.VARIANTABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__LONG_DESCRIPTION = SuptertypePackage.VARIANTABLE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__DEACTIVATED = SuptertypePackage.VARIANTABLE__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__VARIANTS = SuptertypePackage.VARIANTABLE__VARIANTS;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__LAYOUT_BEFORE = SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__LAYOUT_AFTER = SuptertypePackage.VARIANTABLE__LAYOUT_AFTER;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__LAYOUT_PRIORITY = SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY;

	/**
	 * The feature id for the '<em><b>Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__PROCESS_MODULES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stake Holders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__STAKE_HOLDERS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Verification Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__VERIFICATION_MODULES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifatcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__ARTIFATCS = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Compliances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__SUB_COMPLIANCES = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Applicable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE__APPLICABLE = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Compliance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_FEATURE_COUNT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Compliance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_OPERATION_COUNT = SuptertypePackage.VARIANTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.VerificationModuleImpl <em>Verification Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.VerificationModuleImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getVerificationModule()
	 * @generated
	 */
	int VERIFICATION_MODULE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__NAME = PROCESS_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__DESCRIPTION = PROCESS_MODULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__ID = PROCESS_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__COMMENT = PROCESS_MODULE__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__LONG_DESCRIPTION = PROCESS_MODULE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__DEACTIVATED = PROCESS_MODULE__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__VARIANTS = PROCESS_MODULE__VARIANTS;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__LAYOUT_BEFORE = PROCESS_MODULE__LAYOUT_BEFORE;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__LAYOUT_AFTER = PROCESS_MODULE__LAYOUT_AFTER;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__LAYOUT_PRIORITY = PROCESS_MODULE__LAYOUT_PRIORITY;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__VERIFIED_BY = PROCESS_MODULE__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Verifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__VERIFIES = PROCESS_MODULE__VERIFIES;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__REQUIREMENTS = PROCESS_MODULE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Sub Process Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__SUB_PROCESS_MODULES = PROCESS_MODULE__SUB_PROCESS_MODULES;

	/**
	 * The feature id for the '<em><b>Input Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__INPUT_ARTIFACTS = PROCESS_MODULE__INPUT_ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__TOOLS = PROCESS_MODULE__TOOLS;

	/**
	 * The feature id for the '<em><b>Before Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__BEFORE_PROCESS_MODULES = PROCESS_MODULE__BEFORE_PROCESS_MODULES;

	/**
	 * The feature id for the '<em><b>After Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__AFTER_PROCESS_MODULES = PROCESS_MODULE__AFTER_PROCESS_MODULES;

	/**
	 * The feature id for the '<em><b>Involved Stake Holders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__INVOLVED_STAKE_HOLDERS = PROCESS_MODULE__INVOLVED_STAKE_HOLDERS;

	/**
	 * The feature id for the '<em><b>Pre MM Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__PRE_MM_CONDITION = PROCESS_MODULE__PRE_MM_CONDITION;

	/**
	 * The feature id for the '<em><b>Post MM Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__POST_MM_CONDITION = PROCESS_MODULE__POST_MM_CONDITION;

	/**
	 * The feature id for the '<em><b>Output Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__OUTPUT_ARTIFACTS = PROCESS_MODULE__OUTPUT_ARTIFACTS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__URI = PROCESS_MODULE__URI;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__PARAMETERS = PROCESS_MODULE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__BINDINGS = PROCESS_MODULE__BINDINGS;

	/**
	 * The feature id for the '<em><b>Number Of Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__NUMBER_OF_INSTANCES = PROCESS_MODULE__NUMBER_OF_INSTANCES;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__EFFORT = PROCESS_MODULE__EFFORT;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__PROGRESS = PROCESS_MODULE__PROGRESS;

	/**
	 * The feature id for the '<em><b>Planned Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__PLANNED_START_DATE = PROCESS_MODULE__PLANNED_START_DATE;

	/**
	 * The feature id for the '<em><b>Planned End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__PLANNED_END_DATE = PROCESS_MODULE__PLANNED_END_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__END_DATE = PROCESS_MODULE__END_DATE;

	/**
	 * The feature id for the '<em><b>Sub Process Module References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__SUB_PROCESS_MODULE_REFERENCES = PROCESS_MODULE__SUB_PROCESS_MODULE_REFERENCES;

	/**
	 * The feature id for the '<em><b>Instance Of Process Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__INSTANCE_OF_PROCESS_MODULE = PROCESS_MODULE__INSTANCE_OF_PROCESS_MODULE;

	/**
	 * The feature id for the '<em><b>Instantiated In Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__INSTANTIATED_IN_PROCESS_MODULES = PROCESS_MODULE__INSTANTIATED_IN_PROCESS_MODULES;

	/**
	 * The feature id for the '<em><b>Compliances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__COMPLIANCES = PROCESS_MODULE__COMPLIANCES;

	/**
	 * The feature id for the '<em><b>Stake Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__STAKE_HOLDER = PROCESS_MODULE__STAKE_HOLDER;

	/**
	 * The feature id for the '<em><b>Claimed Compliance Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__CLAIMED_COMPLIANCE_REQUIREMENTS = PROCESS_MODULE__CLAIMED_COMPLIANCE_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__STATUS = PROCESS_MODULE__STATUS;

	/**
	 * The feature id for the '<em><b>Parameter References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__PARAMETER_REFERENCES = PROCESS_MODULE__PARAMETER_REFERENCES;

	/**
	 * The feature id for the '<em><b>Determined Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__DETERMINED_VARIABLES = PROCESS_MODULE__DETERMINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__LAYOUT = PROCESS_MODULE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__ARTIFACTS = PROCESS_MODULE__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Stake Holders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__STAKE_HOLDERS = PROCESS_MODULE__STAKE_HOLDERS;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__TYPES = PROCESS_MODULE__TYPES;

	/**
	 * The feature id for the '<em><b>Verified Compliances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__VERIFIED_COMPLIANCES = PROCESS_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__IMPLICIT = PROCESS_MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE__CRITERIA = PROCESS_MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Verification Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE_FEATURE_COUNT = PROCESS_MODULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Verification Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_MODULE_OPERATION_COUNT = PROCESS_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.RequiredDocumentImpl <em>Required Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.RequiredDocumentImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getRequiredDocument()
	 * @generated
	 */
	int REQUIRED_DOCUMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__COMMENT = REQUIREMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__LONG_DESCRIPTION = REQUIREMENT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__DEACTIVATED = REQUIREMENT__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__VARIANTS = REQUIREMENT__VARIANTS;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__LAYOUT_BEFORE = REQUIREMENT__LAYOUT_BEFORE;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__LAYOUT_AFTER = REQUIREMENT__LAYOUT_AFTER;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__LAYOUT_PRIORITY = REQUIREMENT__LAYOUT_PRIORITY;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__VERIFIED_BY = REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Sub Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__SUB_REQUIREMENTS = REQUIREMENT__SUB_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Required Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__REQUIRED_REQUIREMENTS = REQUIREMENT__REQUIRED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Required By Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__REQUIRED_BY_REQUIREMENTS = REQUIREMENT__REQUIRED_BY_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Recommented From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__RECOMMENTED_FROM = REQUIREMENT__RECOMMENTED_FROM;

	/**
	 * The feature id for the '<em><b>Recommented To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__RECOMMENTED_TO = REQUIREMENT__RECOMMENTED_TO;

	/**
	 * The feature id for the '<em><b>Compliances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__COMPLIANCES = REQUIREMENT__COMPLIANCES;

	/**
	 * The feature id for the '<em><b>Claiming Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__CLAIMING_PROCESS_MODULES = REQUIREMENT__CLAIMING_PROCESS_MODULES;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT__ARTIFACTS = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DOCUMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.impl.CriterionImpl <em>Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.impl.CriterionImpl
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getCriterion()
	 * @generated
	 */
	int CRITERION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__NAME = SuptertypePackage.VARIANTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__DESCRIPTION = SuptertypePackage.VARIANTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__ID = SuptertypePackage.VARIANTABLE__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__COMMENT = SuptertypePackage.VARIANTABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__LONG_DESCRIPTION = SuptertypePackage.VARIANTABLE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__DEACTIVATED = SuptertypePackage.VARIANTABLE__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__VARIANTS = SuptertypePackage.VARIANTABLE__VARIANTS;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__LAYOUT_BEFORE = SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__LAYOUT_AFTER = SuptertypePackage.VARIANTABLE__LAYOUT_AFTER;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__LAYOUT_PRIORITY = SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY;

	/**
	 * The number of structural features of the '<em>Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_FEATURE_COUNT = SuptertypePackage.VARIANTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_OPERATION_COUNT = SuptertypePackage.VARIANTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.referenceProcess.ProcessStatus <em>Process Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.referenceProcess.ProcessStatus
	 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getProcessStatus()
	 * @generated
	 */
	int PROCESS_STATUS = 16;


	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see metaModel.referenceProcess.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Process#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see metaModel.referenceProcess.Process#getTools()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Tools();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Process#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see metaModel.referenceProcess.Process#getRequirements()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Process#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see metaModel.referenceProcess.Process#getArtifacts()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Process#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see metaModel.referenceProcess.Process#getMethods()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Process#getProcessModules <em>Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Modules</em>'.
	 * @see metaModel.referenceProcess.Process#getProcessModules()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ProcessModules();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Process#getStakeHolders <em>Stake Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stake Holders</em>'.
	 * @see metaModel.referenceProcess.Process#getStakeHolders()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_StakeHolders();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Process#getProcessConditions <em>Process Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Conditions</em>'.
	 * @see metaModel.referenceProcess.Process#getProcessConditions()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ProcessConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Process#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see metaModel.referenceProcess.Process#getParameters()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Process#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see metaModel.referenceProcess.Process#getBindings()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Process#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see metaModel.referenceProcess.Process#getTypes()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Types();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Process#getMaximalSafetyLevel <em>Maximal Safety Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximal Safety Level</em>'.
	 * @see metaModel.referenceProcess.Process#getMaximalSafetyLevel()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_MaximalSafetyLevel();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Process#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Preferences</em>'.
	 * @see metaModel.referenceProcess.Process#getPreferences()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Preferences();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Process#getFilterScope <em>Filter Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Filter Scope</em>'.
	 * @see metaModel.referenceProcess.Process#getFilterScope()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FilterScope();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see metaModel.referenceProcess.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Tool#getProcessModules <em>Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Modules</em>'.
	 * @see metaModel.referenceProcess.Tool#getProcessModules()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_ProcessModules();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Tool#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Methods</em>'.
	 * @see metaModel.referenceProcess.Tool#getMethods()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Methods();

	/**
	 * Returns the meta object for the reference '{@link metaModel.referenceProcess.Tool#getMetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model</em>'.
	 * @see metaModel.referenceProcess.Tool#getMetaModel()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_MetaModel();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Tool#getPreliminaryClassification <em>Preliminary Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preliminary Classification</em>'.
	 * @see metaModel.referenceProcess.Tool#getPreliminaryClassification()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_PreliminaryClassification();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Tool#getClassificationExplanation <em>Classification Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Explanation</em>'.
	 * @see metaModel.referenceProcess.Tool#getClassificationExplanation()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_ClassificationExplanation();

	/**
	 * Returns the meta object for the reference '{@link metaModel.referenceProcess.Tool#getToolOwner <em>Tool Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool Owner</em>'.
	 * @see metaModel.referenceProcess.Tool#getToolOwner()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_ToolOwner();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.StakeHolder <em>Stake Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stake Holder</em>'.
	 * @see metaModel.referenceProcess.StakeHolder
	 * @generated
	 */
	EClass getStakeHolder();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.StakeHolder#getOwnedModules <em>Owned Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Modules</em>'.
	 * @see metaModel.referenceProcess.StakeHolder#getOwnedModules()
	 * @see #getStakeHolder()
	 * @generated
	 */
	EReference getStakeHolder_OwnedModules();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.StakeHolder#getInvolvedModules <em>Involved Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Modules</em>'.
	 * @see metaModel.referenceProcess.StakeHolder#getInvolvedModules()
	 * @see #getStakeHolder()
	 * @generated
	 */
	EReference getStakeHolder_InvolvedModules();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.StakeHolder#getCompliances <em>Compliances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compliances</em>'.
	 * @see metaModel.referenceProcess.StakeHolder#getCompliances()
	 * @see #getStakeHolder()
	 * @generated
	 */
	EReference getStakeHolder_Compliances();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.StakeHolder#getAssignedPerson <em>Assigned Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Person</em>'.
	 * @see metaModel.referenceProcess.StakeHolder#getAssignedPerson()
	 * @see #getStakeHolder()
	 * @generated
	 */
	EAttribute getStakeHolder_AssignedPerson();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.StakeHolder#getOwnedArtifacts <em>Owned Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Artifacts</em>'.
	 * @see metaModel.referenceProcess.StakeHolder#getOwnedArtifacts()
	 * @see #getStakeHolder()
	 * @generated
	 */
	EReference getStakeHolder_OwnedArtifacts();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.StakeHolder#getInvolvedArtifacts <em>Involved Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Artifacts</em>'.
	 * @see metaModel.referenceProcess.StakeHolder#getInvolvedArtifacts()
	 * @see #getStakeHolder()
	 * @generated
	 */
	EReference getStakeHolder_InvolvedArtifacts();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.StakeHolder#getOwnedTools <em>Owned Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Tools</em>'.
	 * @see metaModel.referenceProcess.StakeHolder#getOwnedTools()
	 * @see #getStakeHolder()
	 * @generated
	 */
	EReference getStakeHolder_OwnedTools();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.StakeHolder#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see metaModel.referenceProcess.StakeHolder#getLayout()
	 * @see #getStakeHolder()
	 * @generated
	 */
	EAttribute getStakeHolder_Layout();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see metaModel.referenceProcess.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link metaModel.referenceProcess.Model#getMetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Model</em>'.
	 * @see metaModel.referenceProcess.Model#getMetaModel()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_MetaModel();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Model#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see metaModel.referenceProcess.Model#getIncludes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Includes();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Model#getIsIncludedIn <em>Is Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Included In</em>'.
	 * @see metaModel.referenceProcess.Model#getIsIncludedIn()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_IsIncludedIn();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Model#getMandatoryElements <em>Mandatory Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory Elements</em>'.
	 * @see metaModel.referenceProcess.Model#getMandatoryElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_MandatoryElements();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Model#getMandatoryAttributes <em>Mandatory Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory Attributes</em>'.
	 * @see metaModel.referenceProcess.Model#getMandatoryAttributes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_MandatoryAttributes();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Model#getMandatoryAssociations <em>Mandatory Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory Associations</em>'.
	 * @see metaModel.referenceProcess.Model#getMandatoryAssociations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_MandatoryAssociations();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Model#getOptionalElements <em>Optional Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional Elements</em>'.
	 * @see metaModel.referenceProcess.Model#getOptionalElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OptionalElements();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Model#getOptionalAttributes <em>Optional Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional Attributes</em>'.
	 * @see metaModel.referenceProcess.Model#getOptionalAttributes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OptionalAttributes();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Model#getOptionalAssociations <em>Optional Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional Associations</em>'.
	 * @see metaModel.referenceProcess.Model#getOptionalAssociations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OptionalAssociations();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.ProcessModule <em>Process Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Module</em>'.
	 * @see metaModel.referenceProcess.ProcessModule
	 * @generated
	 */
	EClass getProcessModule();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getRequirements()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.ProcessModule#getSubProcessModules <em>Sub Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Process Modules</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getSubProcessModules()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_SubProcessModules();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getInputArtifacts <em>Input Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Artifacts</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getInputArtifacts()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_InputArtifacts();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tools</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getTools()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_Tools();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getBeforeProcessModules <em>Before Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Before Process Modules</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getBeforeProcessModules()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_BeforeProcessModules();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getAfterProcessModules <em>After Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>After Process Modules</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getAfterProcessModules()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_AfterProcessModules();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getInvolvedStakeHolders <em>Involved Stake Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Stake Holders</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getInvolvedStakeHolders()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_InvolvedStakeHolders();

	/**
	 * Returns the meta object for the containment reference '{@link metaModel.referenceProcess.ProcessModule#getPreMMCondition <em>Pre MM Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre MM Condition</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getPreMMCondition()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_PreMMCondition();

	/**
	 * Returns the meta object for the containment reference '{@link metaModel.referenceProcess.ProcessModule#getPostMMCondition <em>Post MM Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post MM Condition</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getPostMMCondition()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_PostMMCondition();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getOutputArtifacts <em>Output Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Artifacts</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getOutputArtifacts()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_OutputArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.ProcessModule#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getURI()
	 * @see #getProcessModule()
	 * @generated
	 */
	EAttribute getProcessModule_URI();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.ProcessModule#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getParameters()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.ProcessModule#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getBindings()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_Bindings();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.ProcessModule#getNumberOfInstances <em>Number Of Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Instances</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getNumberOfInstances()
	 * @see #getProcessModule()
	 * @generated
	 */
	EAttribute getProcessModule_NumberOfInstances();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.ProcessModule#getEffort <em>Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effort</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getEffort()
	 * @see #getProcessModule()
	 * @generated
	 */
	EAttribute getProcessModule_Effort();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.ProcessModule#getProgress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getProgress()
	 * @see #getProcessModule()
	 * @generated
	 */
	EAttribute getProcessModule_Progress();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.ProcessModule#getPlannedStartDate <em>Planned Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planned Start Date</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getPlannedStartDate()
	 * @see #getProcessModule()
	 * @generated
	 */
	EAttribute getProcessModule_PlannedStartDate();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.ProcessModule#getPlannedEndDate <em>Planned End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planned End Date</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getPlannedEndDate()
	 * @see #getProcessModule()
	 * @generated
	 */
	EAttribute getProcessModule_PlannedEndDate();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.ProcessModule#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getEndDate()
	 * @see #getProcessModule()
	 * @generated
	 */
	EAttribute getProcessModule_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getSubProcessModuleReferences <em>Sub Process Module References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Process Module References</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getSubProcessModuleReferences()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_SubProcessModuleReferences();

	/**
	 * Returns the meta object for the reference '{@link metaModel.referenceProcess.ProcessModule#getInstanceOfProcessModule <em>Instance Of Process Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of Process Module</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getInstanceOfProcessModule()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_InstanceOfProcessModule();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getInstantiatedInProcessModules <em>Instantiated In Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiated In Process Modules</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getInstantiatedInProcessModules()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_InstantiatedInProcessModules();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getCompliances <em>Compliances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compliances</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getCompliances()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_Compliances();

	/**
	 * Returns the meta object for the reference '{@link metaModel.referenceProcess.ProcessModule#getStakeHolder <em>Stake Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stake Holder</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getStakeHolder()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_StakeHolder();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getClaimedComplianceRequirements <em>Claimed Compliance Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Claimed Compliance Requirements</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getClaimedComplianceRequirements()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_ClaimedComplianceRequirements();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.ProcessModule#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getStatus()
	 * @see #getProcessModule()
	 * @generated
	 */
	EAttribute getProcessModule_Status();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getParameterReferences <em>Parameter References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter References</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getParameterReferences()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_ParameterReferences();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.ProcessModule#getDeterminedVariables <em>Determined Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Determined Variables</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getDeterminedVariables()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_DeterminedVariables();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.ProcessModule#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getLayout()
	 * @see #getProcessModule()
	 * @generated
	 */
	EAttribute getProcessModule_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.ProcessModule#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getArtifacts()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.ProcessModule#getStakeHolders <em>Stake Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stake Holders</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getStakeHolders()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_StakeHolders();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.ProcessModule#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see metaModel.referenceProcess.ProcessModule#getTypes()
	 * @see #getProcessModule()
	 * @generated
	 */
	EReference getProcessModule_Types();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see metaModel.referenceProcess.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Requirement#getSubRequirements <em>Sub Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Requirements</em>'.
	 * @see metaModel.referenceProcess.Requirement#getSubRequirements()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_SubRequirements();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Requirement#getRequiredRequirements <em>Required Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Requirements</em>'.
	 * @see metaModel.referenceProcess.Requirement#getRequiredRequirements()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RequiredRequirements();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Requirement#getRequiredByRequirements <em>Required By Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required By Requirements</em>'.
	 * @see metaModel.referenceProcess.Requirement#getRequiredByRequirements()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RequiredByRequirements();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Requirement#getRecommentedFrom <em>Recommented From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommented From</em>'.
	 * @see metaModel.referenceProcess.Requirement#getRecommentedFrom()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RecommentedFrom();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Requirement#getRecommentedTo <em>Recommented To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommented To</em>'.
	 * @see metaModel.referenceProcess.Requirement#getRecommentedTo()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RecommentedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Requirement#getCompliances <em>Compliances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compliances</em>'.
	 * @see metaModel.referenceProcess.Requirement#getCompliances()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Compliances();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Requirement#getClaimingProcessModules <em>Claiming Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Claiming Process Modules</em>'.
	 * @see metaModel.referenceProcess.Requirement#getClaimingProcessModules()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_ClaimingProcessModules();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see metaModel.referenceProcess.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Artifact#getDocumentStatus <em>Document Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Status</em>'.
	 * @see metaModel.referenceProcess.Artifact#getDocumentStatus()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_DocumentStatus();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Artifact#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see metaModel.referenceProcess.Artifact#getVersion()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Version();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Artifact#getReadByProcessModules <em>Read By Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Read By Process Modules</em>'.
	 * @see metaModel.referenceProcess.Artifact#getReadByProcessModules()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ReadByProcessModules();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Artifact#getProcessConditions <em>Process Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Conditions</em>'.
	 * @see metaModel.referenceProcess.Artifact#getProcessConditions()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ProcessConditions();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Artifact#getCreatedByProcessModules <em>Created By Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Created By Process Modules</em>'.
	 * @see metaModel.referenceProcess.Artifact#getCreatedByProcessModules()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_CreatedByProcessModules();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.Artifact#getSubArtifacts <em>Sub Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Artifacts</em>'.
	 * @see metaModel.referenceProcess.Artifact#getSubArtifacts()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_SubArtifacts();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Artifact#getSubArtifactReferences <em>Sub Artifact References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Artifact References</em>'.
	 * @see metaModel.referenceProcess.Artifact#getSubArtifactReferences()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_SubArtifactReferences();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Artifact#getCompliances <em>Compliances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compliances</em>'.
	 * @see metaModel.referenceProcess.Artifact#getCompliances()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Compliances();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Artifact#getInvolvedStakeHolders <em>Involved Stake Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Stake Holders</em>'.
	 * @see metaModel.referenceProcess.Artifact#getInvolvedStakeHolders()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_InvolvedStakeHolders();

	/**
	 * Returns the meta object for the reference '{@link metaModel.referenceProcess.Artifact#getStakeHolder <em>Stake Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stake Holder</em>'.
	 * @see metaModel.referenceProcess.Artifact#getStakeHolder()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_StakeHolder();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Artifact#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see metaModel.referenceProcess.Artifact#getPath()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Path();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Artifact#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see metaModel.referenceProcess.Artifact#getStatus()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Status();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Artifact#isPartOfProduct <em>Part Of Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Of Product</em>'.
	 * @see metaModel.referenceProcess.Artifact#isPartOfProduct()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_PartOfProduct();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Artifact#getReferedByArtifacts <em>Refered By Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refered By Artifacts</em>'.
	 * @see metaModel.referenceProcess.Artifact#getReferedByArtifacts()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ReferedByArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Artifact#isProjectInput <em>Project Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Input</em>'.
	 * @see metaModel.referenceProcess.Artifact#isProjectInput()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_ProjectInput();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Artifact#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see metaModel.referenceProcess.Artifact#getLayout()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Layout();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see metaModel.referenceProcess.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Alternative#getProcessModules <em>Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Modules</em>'.
	 * @see metaModel.referenceProcess.Alternative#getProcessModules()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_ProcessModules();

	/**
	 * Returns the meta object for the containment reference '{@link metaModel.referenceProcess.Alternative#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see metaModel.referenceProcess.Alternative#getCondition()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Condition();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see metaModel.referenceProcess.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Parallel#getProcessModules <em>Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Modules</em>'.
	 * @see metaModel.referenceProcess.Parallel#getProcessModules()
	 * @see #getParallel()
	 * @generated
	 */
	EReference getParallel_ProcessModules();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see metaModel.referenceProcess.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Method#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tools</em>'.
	 * @see metaModel.referenceProcess.Method#getTools()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Tools();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.IVerified <em>IVerified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVerified</em>'.
	 * @see metaModel.referenceProcess.IVerified
	 * @generated
	 */
	EClass getIVerified();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.IVerified#getVerifiedBy <em>Verified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verified By</em>'.
	 * @see metaModel.referenceProcess.IVerified#getVerifiedBy()
	 * @see #getIVerified()
	 * @generated
	 */
	EReference getIVerified_VerifiedBy();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.IVerifier <em>IVerifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVerifier</em>'.
	 * @see metaModel.referenceProcess.IVerifier
	 * @generated
	 */
	EClass getIVerifier();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.IVerifier#getVerifies <em>Verifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verifies</em>'.
	 * @see metaModel.referenceProcess.IVerifier#getVerifies()
	 * @see #getIVerifier()
	 * @generated
	 */
	EReference getIVerifier_Verifies();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.Compliance <em>Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance</em>'.
	 * @see metaModel.referenceProcess.Compliance
	 * @generated
	 */
	EClass getCompliance();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Compliance#getProcessModules <em>Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Modules</em>'.
	 * @see metaModel.referenceProcess.Compliance#getProcessModules()
	 * @see #getCompliance()
	 * @generated
	 */
	EReference getCompliance_ProcessModules();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Compliance#getStakeHolders <em>Stake Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stake Holders</em>'.
	 * @see metaModel.referenceProcess.Compliance#getStakeHolders()
	 * @see #getCompliance()
	 * @generated
	 */
	EReference getCompliance_StakeHolders();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Compliance#getVerificationModules <em>Verification Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verification Modules</em>'.
	 * @see metaModel.referenceProcess.Compliance#getVerificationModules()
	 * @see #getCompliance()
	 * @generated
	 */
	EReference getCompliance_VerificationModules();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Compliance#getArtifatcs <em>Artifatcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artifatcs</em>'.
	 * @see metaModel.referenceProcess.Compliance#getArtifatcs()
	 * @see #getCompliance()
	 * @generated
	 */
	EReference getCompliance_Artifatcs();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.Compliance#getSubCompliances <em>Sub Compliances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Compliances</em>'.
	 * @see metaModel.referenceProcess.Compliance#getSubCompliances()
	 * @see #getCompliance()
	 * @generated
	 */
	EReference getCompliance_SubCompliances();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.Compliance#isApplicable <em>Applicable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable</em>'.
	 * @see metaModel.referenceProcess.Compliance#isApplicable()
	 * @see #getCompliance()
	 * @generated
	 */
	EAttribute getCompliance_Applicable();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.VerificationModule <em>Verification Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Module</em>'.
	 * @see metaModel.referenceProcess.VerificationModule
	 * @generated
	 */
	EClass getVerificationModule();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.VerificationModule#getVerifiedCompliances <em>Verified Compliances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verified Compliances</em>'.
	 * @see metaModel.referenceProcess.VerificationModule#getVerifiedCompliances()
	 * @see #getVerificationModule()
	 * @generated
	 */
	EReference getVerificationModule_VerifiedCompliances();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.referenceProcess.VerificationModule#isImplicit <em>Implicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit</em>'.
	 * @see metaModel.referenceProcess.VerificationModule#isImplicit()
	 * @see #getVerificationModule()
	 * @generated
	 */
	EAttribute getVerificationModule_Implicit();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.referenceProcess.VerificationModule#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see metaModel.referenceProcess.VerificationModule#getCriteria()
	 * @see #getVerificationModule()
	 * @generated
	 */
	EReference getVerificationModule_Criteria();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.RequiredDocument <em>Required Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Document</em>'.
	 * @see metaModel.referenceProcess.RequiredDocument
	 * @generated
	 */
	EClass getRequiredDocument();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.referenceProcess.RequiredDocument#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artifacts</em>'.
	 * @see metaModel.referenceProcess.RequiredDocument#getArtifacts()
	 * @see #getRequiredDocument()
	 * @generated
	 */
	EReference getRequiredDocument_Artifacts();

	/**
	 * Returns the meta object for class '{@link metaModel.referenceProcess.Criterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterion</em>'.
	 * @see metaModel.referenceProcess.Criterion
	 * @generated
	 */
	EClass getCriterion();

	/**
	 * Returns the meta object for enum '{@link metaModel.referenceProcess.ProcessStatus <em>Process Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Status</em>'.
	 * @see metaModel.referenceProcess.ProcessStatus
	 * @generated
	 */
	EEnum getProcessStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReferenceProcessFactory getReferenceProcessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.ProcessImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__TOOLS = eINSTANCE.getProcess_Tools();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__REQUIREMENTS = eINSTANCE.getProcess_Requirements();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ARTIFACTS = eINSTANCE.getProcess_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__METHODS = eINSTANCE.getProcess_Methods();

		/**
		 * The meta object literal for the '<em><b>Process Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PROCESS_MODULES = eINSTANCE.getProcess_ProcessModules();

		/**
		 * The meta object literal for the '<em><b>Stake Holders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__STAKE_HOLDERS = eINSTANCE.getProcess_StakeHolders();

		/**
		 * The meta object literal for the '<em><b>Process Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PROCESS_CONDITIONS = eINSTANCE.getProcess_ProcessConditions();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PARAMETERS = eINSTANCE.getProcess_Parameters();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__BINDINGS = eINSTANCE.getProcess_Bindings();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__TYPES = eINSTANCE.getProcess_Types();

		/**
		 * The meta object literal for the '<em><b>Maximal Safety Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__MAXIMAL_SAFETY_LEVEL = eINSTANCE.getProcess_MaximalSafetyLevel();

		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PREFERENCES = eINSTANCE.getProcess_Preferences();

		/**
		 * The meta object literal for the '<em><b>Filter Scope</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__FILTER_SCOPE = eINSTANCE.getProcess_FilterScope();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.ToolImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Process Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__PROCESS_MODULES = eINSTANCE.getTool_ProcessModules();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__METHODS = eINSTANCE.getTool_Methods();

		/**
		 * The meta object literal for the '<em><b>Meta Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__META_MODEL = eINSTANCE.getTool_MetaModel();

		/**
		 * The meta object literal for the '<em><b>Preliminary Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__PRELIMINARY_CLASSIFICATION = eINSTANCE.getTool_PreliminaryClassification();

		/**
		 * The meta object literal for the '<em><b>Classification Explanation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__CLASSIFICATION_EXPLANATION = eINSTANCE.getTool_ClassificationExplanation();

		/**
		 * The meta object literal for the '<em><b>Tool Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__TOOL_OWNER = eINSTANCE.getTool_ToolOwner();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.StakeHolderImpl <em>Stake Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.StakeHolderImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getStakeHolder()
		 * @generated
		 */
		EClass STAKE_HOLDER = eINSTANCE.getStakeHolder();

		/**
		 * The meta object literal for the '<em><b>Owned Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER__OWNED_MODULES = eINSTANCE.getStakeHolder_OwnedModules();

		/**
		 * The meta object literal for the '<em><b>Involved Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER__INVOLVED_MODULES = eINSTANCE.getStakeHolder_InvolvedModules();

		/**
		 * The meta object literal for the '<em><b>Compliances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER__COMPLIANCES = eINSTANCE.getStakeHolder_Compliances();

		/**
		 * The meta object literal for the '<em><b>Assigned Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAKE_HOLDER__ASSIGNED_PERSON = eINSTANCE.getStakeHolder_AssignedPerson();

		/**
		 * The meta object literal for the '<em><b>Owned Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER__OWNED_ARTIFACTS = eINSTANCE.getStakeHolder_OwnedArtifacts();

		/**
		 * The meta object literal for the '<em><b>Involved Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER__INVOLVED_ARTIFACTS = eINSTANCE.getStakeHolder_InvolvedArtifacts();

		/**
		 * The meta object literal for the '<em><b>Owned Tools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER__OWNED_TOOLS = eINSTANCE.getStakeHolder_OwnedTools();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAKE_HOLDER__LAYOUT = eINSTANCE.getStakeHolder_Layout();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.ModelImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Meta Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__META_MODEL = eINSTANCE.getModel_MetaModel();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__INCLUDES = eINSTANCE.getModel_Includes();

		/**
		 * The meta object literal for the '<em><b>Is Included In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__IS_INCLUDED_IN = eINSTANCE.getModel_IsIncludedIn();

		/**
		 * The meta object literal for the '<em><b>Mandatory Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MANDATORY_ELEMENTS = eINSTANCE.getModel_MandatoryElements();

		/**
		 * The meta object literal for the '<em><b>Mandatory Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MANDATORY_ATTRIBUTES = eINSTANCE.getModel_MandatoryAttributes();

		/**
		 * The meta object literal for the '<em><b>Mandatory Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MANDATORY_ASSOCIATIONS = eINSTANCE.getModel_MandatoryAssociations();

		/**
		 * The meta object literal for the '<em><b>Optional Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OPTIONAL_ELEMENTS = eINSTANCE.getModel_OptionalElements();

		/**
		 * The meta object literal for the '<em><b>Optional Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OPTIONAL_ATTRIBUTES = eINSTANCE.getModel_OptionalAttributes();

		/**
		 * The meta object literal for the '<em><b>Optional Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OPTIONAL_ASSOCIATIONS = eINSTANCE.getModel_OptionalAssociations();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.ProcessModuleImpl <em>Process Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.ProcessModuleImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getProcessModule()
		 * @generated
		 */
		EClass PROCESS_MODULE = eINSTANCE.getProcessModule();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__REQUIREMENTS = eINSTANCE.getProcessModule_Requirements();

		/**
		 * The meta object literal for the '<em><b>Sub Process Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__SUB_PROCESS_MODULES = eINSTANCE.getProcessModule_SubProcessModules();

		/**
		 * The meta object literal for the '<em><b>Input Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__INPUT_ARTIFACTS = eINSTANCE.getProcessModule_InputArtifacts();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__TOOLS = eINSTANCE.getProcessModule_Tools();

		/**
		 * The meta object literal for the '<em><b>Before Process Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__BEFORE_PROCESS_MODULES = eINSTANCE.getProcessModule_BeforeProcessModules();

		/**
		 * The meta object literal for the '<em><b>After Process Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__AFTER_PROCESS_MODULES = eINSTANCE.getProcessModule_AfterProcessModules();

		/**
		 * The meta object literal for the '<em><b>Involved Stake Holders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__INVOLVED_STAKE_HOLDERS = eINSTANCE.getProcessModule_InvolvedStakeHolders();

		/**
		 * The meta object literal for the '<em><b>Pre MM Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__PRE_MM_CONDITION = eINSTANCE.getProcessModule_PreMMCondition();

		/**
		 * The meta object literal for the '<em><b>Post MM Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__POST_MM_CONDITION = eINSTANCE.getProcessModule_PostMMCondition();

		/**
		 * The meta object literal for the '<em><b>Output Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__OUTPUT_ARTIFACTS = eINSTANCE.getProcessModule_OutputArtifacts();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_MODULE__URI = eINSTANCE.getProcessModule_URI();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__PARAMETERS = eINSTANCE.getProcessModule_Parameters();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__BINDINGS = eINSTANCE.getProcessModule_Bindings();

		/**
		 * The meta object literal for the '<em><b>Number Of Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_MODULE__NUMBER_OF_INSTANCES = eINSTANCE.getProcessModule_NumberOfInstances();

		/**
		 * The meta object literal for the '<em><b>Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_MODULE__EFFORT = eINSTANCE.getProcessModule_Effort();

		/**
		 * The meta object literal for the '<em><b>Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_MODULE__PROGRESS = eINSTANCE.getProcessModule_Progress();

		/**
		 * The meta object literal for the '<em><b>Planned Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_MODULE__PLANNED_START_DATE = eINSTANCE.getProcessModule_PlannedStartDate();

		/**
		 * The meta object literal for the '<em><b>Planned End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_MODULE__PLANNED_END_DATE = eINSTANCE.getProcessModule_PlannedEndDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_MODULE__END_DATE = eINSTANCE.getProcessModule_EndDate();

		/**
		 * The meta object literal for the '<em><b>Sub Process Module References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__SUB_PROCESS_MODULE_REFERENCES = eINSTANCE.getProcessModule_SubProcessModuleReferences();

		/**
		 * The meta object literal for the '<em><b>Instance Of Process Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__INSTANCE_OF_PROCESS_MODULE = eINSTANCE.getProcessModule_InstanceOfProcessModule();

		/**
		 * The meta object literal for the '<em><b>Instantiated In Process Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__INSTANTIATED_IN_PROCESS_MODULES = eINSTANCE.getProcessModule_InstantiatedInProcessModules();

		/**
		 * The meta object literal for the '<em><b>Compliances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__COMPLIANCES = eINSTANCE.getProcessModule_Compliances();

		/**
		 * The meta object literal for the '<em><b>Stake Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__STAKE_HOLDER = eINSTANCE.getProcessModule_StakeHolder();

		/**
		 * The meta object literal for the '<em><b>Claimed Compliance Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__CLAIMED_COMPLIANCE_REQUIREMENTS = eINSTANCE.getProcessModule_ClaimedComplianceRequirements();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_MODULE__STATUS = eINSTANCE.getProcessModule_Status();

		/**
		 * The meta object literal for the '<em><b>Parameter References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__PARAMETER_REFERENCES = eINSTANCE.getProcessModule_ParameterReferences();

		/**
		 * The meta object literal for the '<em><b>Determined Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__DETERMINED_VARIABLES = eINSTANCE.getProcessModule_DeterminedVariables();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_MODULE__LAYOUT = eINSTANCE.getProcessModule_Layout();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__ARTIFACTS = eINSTANCE.getProcessModule_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Stake Holders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__STAKE_HOLDERS = eINSTANCE.getProcessModule_StakeHolders();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODULE__TYPES = eINSTANCE.getProcessModule_Types();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.RequirementImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Sub Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SUB_REQUIREMENTS = eINSTANCE.getRequirement_SubRequirements();

		/**
		 * The meta object literal for the '<em><b>Required Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIRED_REQUIREMENTS = eINSTANCE.getRequirement_RequiredRequirements();

		/**
		 * The meta object literal for the '<em><b>Required By Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIRED_BY_REQUIREMENTS = eINSTANCE.getRequirement_RequiredByRequirements();

		/**
		 * The meta object literal for the '<em><b>Recommented From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__RECOMMENTED_FROM = eINSTANCE.getRequirement_RecommentedFrom();

		/**
		 * The meta object literal for the '<em><b>Recommented To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__RECOMMENTED_TO = eINSTANCE.getRequirement_RecommentedTo();

		/**
		 * The meta object literal for the '<em><b>Compliances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__COMPLIANCES = eINSTANCE.getRequirement_Compliances();

		/**
		 * The meta object literal for the '<em><b>Claiming Process Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CLAIMING_PROCESS_MODULES = eINSTANCE.getRequirement_ClaimingProcessModules();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.ArtifactImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Document Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__DOCUMENT_STATUS = eINSTANCE.getArtifact_DocumentStatus();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__VERSION = eINSTANCE.getArtifact_Version();

		/**
		 * The meta object literal for the '<em><b>Read By Process Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__READ_BY_PROCESS_MODULES = eINSTANCE.getArtifact_ReadByProcessModules();

		/**
		 * The meta object literal for the '<em><b>Process Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__PROCESS_CONDITIONS = eINSTANCE.getArtifact_ProcessConditions();

		/**
		 * The meta object literal for the '<em><b>Created By Process Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__CREATED_BY_PROCESS_MODULES = eINSTANCE.getArtifact_CreatedByProcessModules();

		/**
		 * The meta object literal for the '<em><b>Sub Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__SUB_ARTIFACTS = eINSTANCE.getArtifact_SubArtifacts();

		/**
		 * The meta object literal for the '<em><b>Sub Artifact References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__SUB_ARTIFACT_REFERENCES = eINSTANCE.getArtifact_SubArtifactReferences();

		/**
		 * The meta object literal for the '<em><b>Compliances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__COMPLIANCES = eINSTANCE.getArtifact_Compliances();

		/**
		 * The meta object literal for the '<em><b>Involved Stake Holders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__INVOLVED_STAKE_HOLDERS = eINSTANCE.getArtifact_InvolvedStakeHolders();

		/**
		 * The meta object literal for the '<em><b>Stake Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__STAKE_HOLDER = eINSTANCE.getArtifact_StakeHolder();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__PATH = eINSTANCE.getArtifact_Path();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__STATUS = eINSTANCE.getArtifact_Status();

		/**
		 * The meta object literal for the '<em><b>Part Of Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__PART_OF_PRODUCT = eINSTANCE.getArtifact_PartOfProduct();

		/**
		 * The meta object literal for the '<em><b>Refered By Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__REFERED_BY_ARTIFACTS = eINSTANCE.getArtifact_ReferedByArtifacts();

		/**
		 * The meta object literal for the '<em><b>Project Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__PROJECT_INPUT = eINSTANCE.getArtifact_ProjectInput();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__LAYOUT = eINSTANCE.getArtifact_Layout();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.AlternativeImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Process Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__PROCESS_MODULES = eINSTANCE.getAlternative_ProcessModules();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__CONDITION = eINSTANCE.getAlternative_Condition();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.ParallelImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '<em><b>Process Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL__PROCESS_MODULES = eINSTANCE.getParallel_ProcessModules();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.MethodImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__TOOLS = eINSTANCE.getMethod_Tools();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.IVerified <em>IVerified</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.IVerified
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getIVerified()
		 * @generated
		 */
		EClass IVERIFIED = eINSTANCE.getIVerified();

		/**
		 * The meta object literal for the '<em><b>Verified By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVERIFIED__VERIFIED_BY = eINSTANCE.getIVerified_VerifiedBy();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.IVerifier <em>IVerifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.IVerifier
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getIVerifier()
		 * @generated
		 */
		EClass IVERIFIER = eINSTANCE.getIVerifier();

		/**
		 * The meta object literal for the '<em><b>Verifies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVERIFIER__VERIFIES = eINSTANCE.getIVerifier_Verifies();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.ComplianceImpl <em>Compliance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.ComplianceImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getCompliance()
		 * @generated
		 */
		EClass COMPLIANCE = eINSTANCE.getCompliance();

		/**
		 * The meta object literal for the '<em><b>Process Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE__PROCESS_MODULES = eINSTANCE.getCompliance_ProcessModules();

		/**
		 * The meta object literal for the '<em><b>Stake Holders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE__STAKE_HOLDERS = eINSTANCE.getCompliance_StakeHolders();

		/**
		 * The meta object literal for the '<em><b>Verification Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE__VERIFICATION_MODULES = eINSTANCE.getCompliance_VerificationModules();

		/**
		 * The meta object literal for the '<em><b>Artifatcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE__ARTIFATCS = eINSTANCE.getCompliance_Artifatcs();

		/**
		 * The meta object literal for the '<em><b>Sub Compliances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE__SUB_COMPLIANCES = eINSTANCE.getCompliance_SubCompliances();

		/**
		 * The meta object literal for the '<em><b>Applicable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE__APPLICABLE = eINSTANCE.getCompliance_Applicable();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.VerificationModuleImpl <em>Verification Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.VerificationModuleImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getVerificationModule()
		 * @generated
		 */
		EClass VERIFICATION_MODULE = eINSTANCE.getVerificationModule();

		/**
		 * The meta object literal for the '<em><b>Verified Compliances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_MODULE__VERIFIED_COMPLIANCES = eINSTANCE.getVerificationModule_VerifiedCompliances();

		/**
		 * The meta object literal for the '<em><b>Implicit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION_MODULE__IMPLICIT = eINSTANCE.getVerificationModule_Implicit();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_MODULE__CRITERIA = eINSTANCE.getVerificationModule_Criteria();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.RequiredDocumentImpl <em>Required Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.RequiredDocumentImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getRequiredDocument()
		 * @generated
		 */
		EClass REQUIRED_DOCUMENT = eINSTANCE.getRequiredDocument();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_DOCUMENT__ARTIFACTS = eINSTANCE.getRequiredDocument_Artifacts();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.impl.CriterionImpl <em>Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.impl.CriterionImpl
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getCriterion()
		 * @generated
		 */
		EClass CRITERION = eINSTANCE.getCriterion();

		/**
		 * The meta object literal for the '{@link metaModel.referenceProcess.ProcessStatus <em>Process Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.referenceProcess.ProcessStatus
		 * @see metaModel.referenceProcess.impl.ReferenceProcessPackageImpl#getProcessStatus()
		 * @generated
		 */
		EEnum PROCESS_STATUS = eINSTANCE.getProcessStatus();

	}

} //ReferenceProcessPackage
