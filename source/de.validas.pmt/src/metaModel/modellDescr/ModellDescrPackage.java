/**
 */
package metaModel.modellDescr;

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
 * @see metaModel.modellDescr.ModellDescrFactory
 * @model kind="package"
 * @generated
 */
public interface ModellDescrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modellDescr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.validas.de/spedit/modellDescr";

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
	ModellDescrPackage eINSTANCE = metaModel.modellDescr.impl.ModellDescrPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModel.modellDescr.impl.MMConditionImpl <em>MM Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.modellDescr.impl.MMConditionImpl
	 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getMMCondition()
	 * @generated
	 */
	int MM_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION__NAME = SuptertypePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION__DESCRIPTION = SuptertypePackage.NAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION__ID = SuptertypePackage.NAMED__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION__COMMENT = SuptertypePackage.NAMED__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION__LONG_DESCRIPTION = SuptertypePackage.NAMED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION__DEACTIVATED = SuptertypePackage.NAMED__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Meta Modell Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION__META_MODELL_ELEMENTS = SuptertypePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Modell Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION__META_MODELL_ATTRIBUTES = SuptertypePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meta Modell Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION__META_MODELL_ASSOCIATIONS = SuptertypePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION__VARIANT = SuptertypePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Process Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION__PROCESS_CONDITION = SuptertypePackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MM Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION_FEATURE_COUNT = SuptertypePackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>MM Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_CONDITION_OPERATION_COUNT = SuptertypePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.modellDescr.impl.MetaModelElementImpl <em>Meta Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.modellDescr.impl.MetaModelElementImpl
	 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getMetaModelElement()
	 * @generated
	 */
	int META_MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__NAME = SuptertypePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__DESCRIPTION = SuptertypePackage.NAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__ID = SuptertypePackage.NAMED__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__COMMENT = SuptertypePackage.NAMED__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__LONG_DESCRIPTION = SuptertypePackage.NAMED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__DEACTIVATED = SuptertypePackage.NAMED__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>MM Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__MM_CONDITIONS = SuptertypePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Model Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__META_MODEL_ATTRIBUTES = SuptertypePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meta Model Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__META_MODEL_ASSOCIATIONS = SuptertypePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mandatory In Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__MANDATORY_IN_MODELS = SuptertypePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__PARENTS = SuptertypePackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__IS_ROOT = SuptertypePackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__IS_ABSTRACT = SuptertypePackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Optional In Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT__OPTIONAL_IN_MODELS = SuptertypePackage.NAMED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Meta Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT_FEATURE_COUNT = SuptertypePackage.NAMED_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Meta Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ELEMENT_OPERATION_COUNT = SuptertypePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.modellDescr.impl.MetaModelAssociationImpl <em>Meta Model Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.modellDescr.impl.MetaModelAssociationImpl
	 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getMetaModelAssociation()
	 * @generated
	 */
	int META_MODEL_ASSOCIATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION__NAME = SuptertypePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION__DESCRIPTION = SuptertypePackage.NAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION__ID = SuptertypePackage.NAMED__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION__COMMENT = SuptertypePackage.NAMED__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION__LONG_DESCRIPTION = SuptertypePackage.NAMED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION__DEACTIVATED = SuptertypePackage.NAMED__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>MM Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION__MM_CONDITIONS = SuptertypePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mandatory In Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION__MANDATORY_IN_MODELS = SuptertypePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION__TO_ELEMENT = SuptertypePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION__CONTAINMENT = SuptertypePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION__CARDINALITY = SuptertypePackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Optional In Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION__OPTIONAL_IN_MODELS = SuptertypePackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Meta Model Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION_FEATURE_COUNT = SuptertypePackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Meta Model Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ASSOCIATION_OPERATION_COUNT = SuptertypePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.modellDescr.impl.MetaModelAttributeImpl <em>Meta Model Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.modellDescr.impl.MetaModelAttributeImpl
	 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getMetaModelAttribute()
	 * @generated
	 */
	int META_MODEL_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ATTRIBUTE__NAME = SuptertypePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ATTRIBUTE__DESCRIPTION = SuptertypePackage.NAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ATTRIBUTE__ID = SuptertypePackage.NAMED__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ATTRIBUTE__COMMENT = SuptertypePackage.NAMED__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ATTRIBUTE__LONG_DESCRIPTION = SuptertypePackage.NAMED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ATTRIBUTE__DEACTIVATED = SuptertypePackage.NAMED__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>MM Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ATTRIBUTE__MM_CONDITIONS = SuptertypePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mandatory In Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ATTRIBUTE__MANDATORY_IN_MODELS = SuptertypePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ATTRIBUTE__TYPE = SuptertypePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Optional In Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ATTRIBUTE__OPTIONAL_IN_MODELS = SuptertypePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Meta Model Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ATTRIBUTE_FEATURE_COUNT = SuptertypePackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Meta Model Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_ATTRIBUTE_OPERATION_COUNT = SuptertypePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.modellDescr.impl.ProzessConditionImpl <em>Prozess Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.modellDescr.impl.ProzessConditionImpl
	 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getProzessCondition()
	 * @generated
	 */
	int PROZESS_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROZESS_CONDITION__NAME = SuptertypePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROZESS_CONDITION__DESCRIPTION = SuptertypePackage.NAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROZESS_CONDITION__ID = SuptertypePackage.NAMED__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROZESS_CONDITION__COMMENT = SuptertypePackage.NAMED__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROZESS_CONDITION__LONG_DESCRIPTION = SuptertypePackage.NAMED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROZESS_CONDITION__DEACTIVATED = SuptertypePackage.NAMED__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Artefakt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROZESS_CONDITION__ARTEFAKT = SuptertypePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processmodule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROZESS_CONDITION__PROCESSMODULE = SuptertypePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROZESS_CONDITION__VARIANT = SuptertypePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MM Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROZESS_CONDITION__MM_CONDITIONS = SuptertypePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Prozess Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROZESS_CONDITION_FEATURE_COUNT = SuptertypePackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Prozess Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROZESS_CONDITION_OPERATION_COUNT = SuptertypePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.modellDescr.impl.MetaModelImpl <em>Meta Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.modellDescr.impl.MetaModelImpl
	 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getMetaModel()
	 * @generated
	 */
	int META_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Meta Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__META_MODEL_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__TOOL = 1;

	/**
	 * The number of structural features of the '<em>Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link metaModel.modellDescr.Cardinality <em>Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.modellDescr.Cardinality
	 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 6;


	/**
	 * Returns the meta object for class '{@link metaModel.modellDescr.MMCondition <em>MM Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MM Condition</em>'.
	 * @see metaModel.modellDescr.MMCondition
	 * @generated
	 */
	EClass getMMCondition();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MMCondition#getMetaModellElements <em>Meta Modell Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Modell Elements</em>'.
	 * @see metaModel.modellDescr.MMCondition#getMetaModellElements()
	 * @see #getMMCondition()
	 * @generated
	 */
	EReference getMMCondition_MetaModellElements();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MMCondition#getMetaModellAttributes <em>Meta Modell Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Modell Attributes</em>'.
	 * @see metaModel.modellDescr.MMCondition#getMetaModellAttributes()
	 * @see #getMMCondition()
	 * @generated
	 */
	EReference getMMCondition_MetaModellAttributes();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MMCondition#getMetaModellAssociations <em>Meta Modell Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Modell Associations</em>'.
	 * @see metaModel.modellDescr.MMCondition#getMetaModellAssociations()
	 * @see #getMMCondition()
	 * @generated
	 */
	EReference getMMCondition_MetaModellAssociations();

	/**
	 * Returns the meta object for the containment reference '{@link metaModel.modellDescr.MMCondition#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variant</em>'.
	 * @see metaModel.modellDescr.MMCondition#getVariant()
	 * @see #getMMCondition()
	 * @generated
	 */
	EReference getMMCondition_Variant();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MMCondition#getProcessCondition <em>Process Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Condition</em>'.
	 * @see metaModel.modellDescr.MMCondition#getProcessCondition()
	 * @see #getMMCondition()
	 * @generated
	 */
	EReference getMMCondition_ProcessCondition();

	/**
	 * Returns the meta object for class '{@link metaModel.modellDescr.MetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model Element</em>'.
	 * @see metaModel.modellDescr.MetaModelElement
	 * @generated
	 */
	EClass getMetaModelElement();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MetaModelElement#getMMConditions <em>MM Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MM Conditions</em>'.
	 * @see metaModel.modellDescr.MetaModelElement#getMMConditions()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EReference getMetaModelElement_MMConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.modellDescr.MetaModelElement#getMetaModelAttributes <em>Meta Model Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Model Attributes</em>'.
	 * @see metaModel.modellDescr.MetaModelElement#getMetaModelAttributes()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EReference getMetaModelElement_MetaModelAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.modellDescr.MetaModelElement#getMetaModelAssociations <em>Meta Model Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Model Associations</em>'.
	 * @see metaModel.modellDescr.MetaModelElement#getMetaModelAssociations()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EReference getMetaModelElement_MetaModelAssociations();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MetaModelElement#getMandatoryInModels <em>Mandatory In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory In Models</em>'.
	 * @see metaModel.modellDescr.MetaModelElement#getMandatoryInModels()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EReference getMetaModelElement_MandatoryInModels();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MetaModelElement#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see metaModel.modellDescr.MetaModelElement#getParents()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EReference getMetaModelElement_Parents();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.modellDescr.MetaModelElement#isIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see metaModel.modellDescr.MetaModelElement#isIsRoot()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EAttribute getMetaModelElement_IsRoot();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.modellDescr.MetaModelElement#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see metaModel.modellDescr.MetaModelElement#isIsAbstract()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EAttribute getMetaModelElement_IsAbstract();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MetaModelElement#getOptionalInModels <em>Optional In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional In Models</em>'.
	 * @see metaModel.modellDescr.MetaModelElement#getOptionalInModels()
	 * @see #getMetaModelElement()
	 * @generated
	 */
	EReference getMetaModelElement_OptionalInModels();

	/**
	 * Returns the meta object for class '{@link metaModel.modellDescr.MetaModelAssociation <em>Meta Model Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model Association</em>'.
	 * @see metaModel.modellDescr.MetaModelAssociation
	 * @generated
	 */
	EClass getMetaModelAssociation();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MetaModelAssociation#getMMConditions <em>MM Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MM Conditions</em>'.
	 * @see metaModel.modellDescr.MetaModelAssociation#getMMConditions()
	 * @see #getMetaModelAssociation()
	 * @generated
	 */
	EReference getMetaModelAssociation_MMConditions();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MetaModelAssociation#getMandatoryInModels <em>Mandatory In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory In Models</em>'.
	 * @see metaModel.modellDescr.MetaModelAssociation#getMandatoryInModels()
	 * @see #getMetaModelAssociation()
	 * @generated
	 */
	EReference getMetaModelAssociation_MandatoryInModels();

	/**
	 * Returns the meta object for the reference '{@link metaModel.modellDescr.MetaModelAssociation#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see metaModel.modellDescr.MetaModelAssociation#getToElement()
	 * @see #getMetaModelAssociation()
	 * @generated
	 */
	EReference getMetaModelAssociation_ToElement();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.modellDescr.MetaModelAssociation#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see metaModel.modellDescr.MetaModelAssociation#isContainment()
	 * @see #getMetaModelAssociation()
	 * @generated
	 */
	EAttribute getMetaModelAssociation_Containment();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.modellDescr.MetaModelAssociation#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see metaModel.modellDescr.MetaModelAssociation#getCardinality()
	 * @see #getMetaModelAssociation()
	 * @generated
	 */
	EAttribute getMetaModelAssociation_Cardinality();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MetaModelAssociation#getOptionalInModels <em>Optional In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional In Models</em>'.
	 * @see metaModel.modellDescr.MetaModelAssociation#getOptionalInModels()
	 * @see #getMetaModelAssociation()
	 * @generated
	 */
	EReference getMetaModelAssociation_OptionalInModels();

	/**
	 * Returns the meta object for class '{@link metaModel.modellDescr.MetaModelAttribute <em>Meta Model Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model Attribute</em>'.
	 * @see metaModel.modellDescr.MetaModelAttribute
	 * @generated
	 */
	EClass getMetaModelAttribute();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MetaModelAttribute#getMMConditions <em>MM Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MM Conditions</em>'.
	 * @see metaModel.modellDescr.MetaModelAttribute#getMMConditions()
	 * @see #getMetaModelAttribute()
	 * @generated
	 */
	EReference getMetaModelAttribute_MMConditions();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MetaModelAttribute#getMandatoryInModels <em>Mandatory In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory In Models</em>'.
	 * @see metaModel.modellDescr.MetaModelAttribute#getMandatoryInModels()
	 * @see #getMetaModelAttribute()
	 * @generated
	 */
	EReference getMetaModelAttribute_MandatoryInModels();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.modellDescr.MetaModelAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metaModel.modellDescr.MetaModelAttribute#getType()
	 * @see #getMetaModelAttribute()
	 * @generated
	 */
	EAttribute getMetaModelAttribute_Type();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.MetaModelAttribute#getOptionalInModels <em>Optional In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional In Models</em>'.
	 * @see metaModel.modellDescr.MetaModelAttribute#getOptionalInModels()
	 * @see #getMetaModelAttribute()
	 * @generated
	 */
	EReference getMetaModelAttribute_OptionalInModels();

	/**
	 * Returns the meta object for class '{@link metaModel.modellDescr.ProzessCondition <em>Prozess Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prozess Condition</em>'.
	 * @see metaModel.modellDescr.ProzessCondition
	 * @generated
	 */
	EClass getProzessCondition();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.ProzessCondition#getArtefakt <em>Artefakt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artefakt</em>'.
	 * @see metaModel.modellDescr.ProzessCondition#getArtefakt()
	 * @see #getProzessCondition()
	 * @generated
	 */
	EReference getProzessCondition_Artefakt();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.ProzessCondition#getProcessmodule <em>Processmodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processmodule</em>'.
	 * @see metaModel.modellDescr.ProzessCondition#getProcessmodule()
	 * @see #getProzessCondition()
	 * @generated
	 */
	EReference getProzessCondition_Processmodule();

	/**
	 * Returns the meta object for the containment reference '{@link metaModel.modellDescr.ProzessCondition#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variant</em>'.
	 * @see metaModel.modellDescr.ProzessCondition#getVariant()
	 * @see #getProzessCondition()
	 * @generated
	 */
	EReference getProzessCondition_Variant();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.modellDescr.ProzessCondition#getMMConditions <em>MM Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MM Conditions</em>'.
	 * @see metaModel.modellDescr.ProzessCondition#getMMConditions()
	 * @see #getProzessCondition()
	 * @generated
	 */
	EReference getProzessCondition_MMConditions();

	/**
	 * Returns the meta object for class '{@link metaModel.modellDescr.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model</em>'.
	 * @see metaModel.modellDescr.MetaModel
	 * @generated
	 */
	EClass getMetaModel();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.modellDescr.MetaModel#getMetaModelElements <em>Meta Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Model Elements</em>'.
	 * @see metaModel.modellDescr.MetaModel#getMetaModelElements()
	 * @see #getMetaModel()
	 * @generated
	 */
	EReference getMetaModel_MetaModelElements();

	/**
	 * Returns the meta object for the reference '{@link metaModel.modellDescr.MetaModel#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool</em>'.
	 * @see metaModel.modellDescr.MetaModel#getTool()
	 * @see #getMetaModel()
	 * @generated
	 */
	EReference getMetaModel_Tool();

	/**
	 * Returns the meta object for enum '{@link metaModel.modellDescr.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality</em>'.
	 * @see metaModel.modellDescr.Cardinality
	 * @generated
	 */
	EEnum getCardinality();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModellDescrFactory getModellDescrFactory();

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
		 * The meta object literal for the '{@link metaModel.modellDescr.impl.MMConditionImpl <em>MM Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.modellDescr.impl.MMConditionImpl
		 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getMMCondition()
		 * @generated
		 */
		EClass MM_CONDITION = eINSTANCE.getMMCondition();

		/**
		 * The meta object literal for the '<em><b>Meta Modell Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MM_CONDITION__META_MODELL_ELEMENTS = eINSTANCE.getMMCondition_MetaModellElements();

		/**
		 * The meta object literal for the '<em><b>Meta Modell Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MM_CONDITION__META_MODELL_ATTRIBUTES = eINSTANCE.getMMCondition_MetaModellAttributes();

		/**
		 * The meta object literal for the '<em><b>Meta Modell Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MM_CONDITION__META_MODELL_ASSOCIATIONS = eINSTANCE.getMMCondition_MetaModellAssociations();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MM_CONDITION__VARIANT = eINSTANCE.getMMCondition_Variant();

		/**
		 * The meta object literal for the '<em><b>Process Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MM_CONDITION__PROCESS_CONDITION = eINSTANCE.getMMCondition_ProcessCondition();

		/**
		 * The meta object literal for the '{@link metaModel.modellDescr.impl.MetaModelElementImpl <em>Meta Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.modellDescr.impl.MetaModelElementImpl
		 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getMetaModelElement()
		 * @generated
		 */
		EClass META_MODEL_ELEMENT = eINSTANCE.getMetaModelElement();

		/**
		 * The meta object literal for the '<em><b>MM Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ELEMENT__MM_CONDITIONS = eINSTANCE.getMetaModelElement_MMConditions();

		/**
		 * The meta object literal for the '<em><b>Meta Model Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ELEMENT__META_MODEL_ATTRIBUTES = eINSTANCE.getMetaModelElement_MetaModelAttributes();

		/**
		 * The meta object literal for the '<em><b>Meta Model Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ELEMENT__META_MODEL_ASSOCIATIONS = eINSTANCE.getMetaModelElement_MetaModelAssociations();

		/**
		 * The meta object literal for the '<em><b>Mandatory In Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ELEMENT__MANDATORY_IN_MODELS = eINSTANCE.getMetaModelElement_MandatoryInModels();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ELEMENT__PARENTS = eINSTANCE.getMetaModelElement_Parents();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_MODEL_ELEMENT__IS_ROOT = eINSTANCE.getMetaModelElement_IsRoot();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_MODEL_ELEMENT__IS_ABSTRACT = eINSTANCE.getMetaModelElement_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Optional In Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ELEMENT__OPTIONAL_IN_MODELS = eINSTANCE.getMetaModelElement_OptionalInModels();

		/**
		 * The meta object literal for the '{@link metaModel.modellDescr.impl.MetaModelAssociationImpl <em>Meta Model Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.modellDescr.impl.MetaModelAssociationImpl
		 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getMetaModelAssociation()
		 * @generated
		 */
		EClass META_MODEL_ASSOCIATION = eINSTANCE.getMetaModelAssociation();

		/**
		 * The meta object literal for the '<em><b>MM Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ASSOCIATION__MM_CONDITIONS = eINSTANCE.getMetaModelAssociation_MMConditions();

		/**
		 * The meta object literal for the '<em><b>Mandatory In Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ASSOCIATION__MANDATORY_IN_MODELS = eINSTANCE.getMetaModelAssociation_MandatoryInModels();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ASSOCIATION__TO_ELEMENT = eINSTANCE.getMetaModelAssociation_ToElement();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_MODEL_ASSOCIATION__CONTAINMENT = eINSTANCE.getMetaModelAssociation_Containment();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_MODEL_ASSOCIATION__CARDINALITY = eINSTANCE.getMetaModelAssociation_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Optional In Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ASSOCIATION__OPTIONAL_IN_MODELS = eINSTANCE.getMetaModelAssociation_OptionalInModels();

		/**
		 * The meta object literal for the '{@link metaModel.modellDescr.impl.MetaModelAttributeImpl <em>Meta Model Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.modellDescr.impl.MetaModelAttributeImpl
		 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getMetaModelAttribute()
		 * @generated
		 */
		EClass META_MODEL_ATTRIBUTE = eINSTANCE.getMetaModelAttribute();

		/**
		 * The meta object literal for the '<em><b>MM Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ATTRIBUTE__MM_CONDITIONS = eINSTANCE.getMetaModelAttribute_MMConditions();

		/**
		 * The meta object literal for the '<em><b>Mandatory In Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ATTRIBUTE__MANDATORY_IN_MODELS = eINSTANCE.getMetaModelAttribute_MandatoryInModels();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_MODEL_ATTRIBUTE__TYPE = eINSTANCE.getMetaModelAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Optional In Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_ATTRIBUTE__OPTIONAL_IN_MODELS = eINSTANCE.getMetaModelAttribute_OptionalInModels();

		/**
		 * The meta object literal for the '{@link metaModel.modellDescr.impl.ProzessConditionImpl <em>Prozess Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.modellDescr.impl.ProzessConditionImpl
		 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getProzessCondition()
		 * @generated
		 */
		EClass PROZESS_CONDITION = eINSTANCE.getProzessCondition();

		/**
		 * The meta object literal for the '<em><b>Artefakt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROZESS_CONDITION__ARTEFAKT = eINSTANCE.getProzessCondition_Artefakt();

		/**
		 * The meta object literal for the '<em><b>Processmodule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROZESS_CONDITION__PROCESSMODULE = eINSTANCE.getProzessCondition_Processmodule();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROZESS_CONDITION__VARIANT = eINSTANCE.getProzessCondition_Variant();

		/**
		 * The meta object literal for the '<em><b>MM Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROZESS_CONDITION__MM_CONDITIONS = eINSTANCE.getProzessCondition_MMConditions();

		/**
		 * The meta object literal for the '{@link metaModel.modellDescr.impl.MetaModelImpl <em>Meta Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.modellDescr.impl.MetaModelImpl
		 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getMetaModel()
		 * @generated
		 */
		EClass META_MODEL = eINSTANCE.getMetaModel();

		/**
		 * The meta object literal for the '<em><b>Meta Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL__META_MODEL_ELEMENTS = eINSTANCE.getMetaModel_MetaModelElements();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL__TOOL = eINSTANCE.getMetaModel_Tool();

		/**
		 * The meta object literal for the '{@link metaModel.modellDescr.Cardinality <em>Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.modellDescr.Cardinality
		 * @see metaModel.modellDescr.impl.ModellDescrPackageImpl#getCardinality()
		 * @generated
		 */
		EEnum CARDINALITY = eINSTANCE.getCardinality();

	}

} //ModellDescrPackage
