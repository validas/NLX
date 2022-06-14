/**
 */
package metaModel.terms;

import metaModel.suptertype.SuptertypePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see metaModel.terms.TermsFactory
 * @model kind="package"
 * @generated
 */
public interface TermsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "terms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.validas.de/spedit/terms";

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
	TermsPackage eINSTANCE = metaModel.terms.impl.TermsPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.TermImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.BoolTermImpl <em>Bool Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.BoolTermImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getBoolTerm()
	 * @generated
	 */
	int BOOL_TERM = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TERM__TYPE = TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TERM__TERMS = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TERM_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.ListTermImpl <em>List Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.ListTermImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getListTerm()
	 * @generated
	 */
	int LIST_TERM = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TERM__TYPE = TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TERM__TERMS = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TERM_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.ConstantImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.ParamRefImpl <em>Param Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.ParamRefImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getParamRef()
	 * @generated
	 */
	int PARAM_REF = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_REF__TYPE = TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_REF__PARAMETER = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Param Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_REF_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Param Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_REF_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.ParameterImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = SuptertypePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = SuptertypePackage.NAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = SuptertypePackage.NAMED__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COMMENT = SuptertypePackage.NAMED__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LONG_DESCRIPTION = SuptertypePackage.NAMED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEACTIVATED = SuptertypePackage.NAMED__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = SuptertypePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__BINDING = SuptertypePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value From List Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE_FROM_LIST_PARAMETER = SuptertypePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Iterator Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ITERATOR_PARAMETERS = SuptertypePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reusing Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REUSING_PROCESS_MODULES = SuptertypePackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = SuptertypePackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = SuptertypePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.TypeImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = SuptertypePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DESCRIPTION = SuptertypePackage.NAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ID = SuptertypePackage.NAMED__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMMENT = SuptertypePackage.NAMED__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__LONG_DESCRIPTION = SuptertypePackage.NAMED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DEACTIVATED = SuptertypePackage.NAMED__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PARAMETERS = SuptertypePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = SuptertypePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = SuptertypePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.EnumTypeImpl <em>Enum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.EnumTypeImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__LONG_DESCRIPTION = TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__DEACTIVATED = TYPE__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__PARAMETERS = TYPE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Enum Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__ENUM_VALUES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.EnumValueImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__NAME = SuptertypePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__DESCRIPTION = SuptertypePackage.NAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__ID = SuptertypePackage.NAMED__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__COMMENT = SuptertypePackage.NAMED__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__LONG_DESCRIPTION = SuptertypePackage.NAMED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__DEACTIVATED = SuptertypePackage.NAMED__DEACTIVATED;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = SuptertypePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = SuptertypePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.ANDTermImpl <em>AND Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.ANDTermImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getANDTerm()
	 * @generated
	 */
	int AND_TERM = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TERM__TYPE = BOOL_TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TERM__TERMS = BOOL_TERM__TERMS;

	/**
	 * The number of structural features of the '<em>AND Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TERM_FEATURE_COUNT = BOOL_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AND Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TERM_OPERATION_COUNT = BOOL_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.ORTermImpl <em>OR Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.ORTermImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getORTerm()
	 * @generated
	 */
	int OR_TERM = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TERM__TYPE = BOOL_TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TERM__TERMS = BOOL_TERM__TERMS;

	/**
	 * The number of structural features of the '<em>OR Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TERM_FEATURE_COUNT = BOOL_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OR Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TERM_OPERATION_COUNT = BOOL_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.EQTermImpl <em>EQ Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.EQTermImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getEQTerm()
	 * @generated
	 */
	int EQ_TERM = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_TERM__TYPE = BOOL_TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_TERM__TERMS = BOOL_TERM__TERMS;

	/**
	 * The number of structural features of the '<em>EQ Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_TERM_FEATURE_COUNT = BOOL_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EQ Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_TERM_OPERATION_COUNT = BOOL_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.NOTTermImpl <em>NOT Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.NOTTermImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getNOTTerm()
	 * @generated
	 */
	int NOT_TERM = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TERM__TYPE = BOOL_TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TERM__TERMS = BOOL_TERM__TERMS;

	/**
	 * The number of structural features of the '<em>NOT Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TERM_FEATURE_COUNT = BOOL_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NOT Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TERM_OPERATION_COUNT = BOOL_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.BindingImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 13;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.EnumValueRefImpl <em>Enum Value Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.EnumValueRefImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getEnumValueRef()
	 * @generated
	 */
	int ENUM_VALUE_REF = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_REF__TYPE = TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Enum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_REF__ENUM_VALUE = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Value Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_REF_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Value Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_REF_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link metaModel.terms.impl.ProjectParameterImpl <em>Project Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.ProjectParameterImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getProjectParameter()
	 * @generated
	 */
	int PROJECT_PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER__COMMENT = PARAMETER__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER__LONG_DESCRIPTION = PARAMETER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER__DEACTIVATED = PARAMETER__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER__BINDING = PARAMETER__BINDING;

	/**
	 * The feature id for the '<em><b>Value From List Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER__VALUE_FROM_LIST_PARAMETER = PARAMETER__VALUE_FROM_LIST_PARAMETER;

	/**
	 * The feature id for the '<em><b>Iterator Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER__ITERATOR_PARAMETERS = PARAMETER__ITERATOR_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reusing Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER__REUSING_PROCESS_MODULES = PARAMETER__REUSING_PROCESS_MODULES;

	/**
	 * The number of structural features of the '<em>Project Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Project Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.ProcessParameterImpl <em>Process Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.ProcessParameterImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getProcessParameter()
	 * @generated
	 */
	int PROCESS_PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__COMMENT = PARAMETER__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__LONG_DESCRIPTION = PARAMETER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__DEACTIVATED = PARAMETER__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__BINDING = PARAMETER__BINDING;

	/**
	 * The feature id for the '<em><b>Value From List Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__VALUE_FROM_LIST_PARAMETER = PARAMETER__VALUE_FROM_LIST_PARAMETER;

	/**
	 * The feature id for the '<em><b>Iterator Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__ITERATOR_PARAMETERS = PARAMETER__ITERATOR_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reusing Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER__REUSING_PROCESS_MODULES = PARAMETER__REUSING_PROCESS_MODULES;

	/**
	 * The number of structural features of the '<em>Process Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.ListTypeImpl <em>List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.ListTypeImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__LONG_DESCRIPTION = TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__DEACTIVATED = TYPE__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__PARAMETERS = TYPE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__BASE_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.InListImpl <em>In List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.InListImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getInList()
	 * @generated
	 */
	int IN_LIST = 19;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.ProcessVariableImpl <em>Process Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.ProcessVariableImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getProcessVariable()
	 * @generated
	 */
	int PROCESS_VARIABLE = 20;

	/**
	 * The meta object id for the '{@link metaModel.terms.impl.PlanningParameterImpl <em>Planning Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.terms.impl.PlanningParameterImpl
	 * @see metaModel.terms.impl.TermsPackageImpl#getPlanningParameter()
	 * @generated
	 */
	int PLANNING_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER__COMMENT = PARAMETER__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER__LONG_DESCRIPTION = PARAMETER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER__DEACTIVATED = PARAMETER__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER__BINDING = PARAMETER__BINDING;

	/**
	 * The feature id for the '<em><b>Value From List Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER__VALUE_FROM_LIST_PARAMETER = PARAMETER__VALUE_FROM_LIST_PARAMETER;

	/**
	 * The feature id for the '<em><b>Iterator Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER__ITERATOR_PARAMETERS = PARAMETER__ITERATOR_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reusing Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER__REUSING_PROCESS_MODULES = PARAMETER__REUSING_PROCESS_MODULES;

	/**
	 * The number of structural features of the '<em>Planning Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Planning Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_LIST__TYPE = BOOL_TERM__TYPE;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_LIST__TERMS = BOOL_TERM__TERMS;

	/**
	 * The number of structural features of the '<em>In List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_LIST_FEATURE_COUNT = BOOL_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_LIST_OPERATION_COUNT = BOOL_TERM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__COMMENT = PARAMETER__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__LONG_DESCRIPTION = PARAMETER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__DEACTIVATED = PARAMETER__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__BINDING = PARAMETER__BINDING;

	/**
	 * The feature id for the '<em><b>Value From List Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__VALUE_FROM_LIST_PARAMETER = PARAMETER__VALUE_FROM_LIST_PARAMETER;

	/**
	 * The feature id for the '<em><b>Iterator Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__ITERATOR_PARAMETERS = PARAMETER__ITERATOR_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reusing Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__REUSING_PROCESS_MODULES = PARAMETER__REUSING_PROCESS_MODULES;

	/**
	 * The feature id for the '<em><b>Determined By Process Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__DETERMINED_BY_PROCESS_MODULES = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Process Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link metaModel.terms.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see metaModel.terms.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the reference '{@link metaModel.terms.Term#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see metaModel.terms.Term#getType()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Type();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.BoolTerm <em>Bool Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Term</em>'.
	 * @see metaModel.terms.BoolTerm
	 * @generated
	 */
	EClass getBoolTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.terms.BoolTerm#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see metaModel.terms.BoolTerm#getTerms()
	 * @see #getBoolTerm()
	 * @generated
	 */
	EReference getBoolTerm_Terms();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.ListTerm <em>List Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Term</em>'.
	 * @see metaModel.terms.ListTerm
	 * @generated
	 */
	EClass getListTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.terms.ListTerm#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see metaModel.terms.ListTerm#getTerms()
	 * @see #getListTerm()
	 * @generated
	 */
	EReference getListTerm_Terms();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see metaModel.terms.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.terms.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metaModel.terms.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.ParamRef <em>Param Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Ref</em>'.
	 * @see metaModel.terms.ParamRef
	 * @generated
	 */
	EClass getParamRef();

	/**
	 * Returns the meta object for the reference '{@link metaModel.terms.ParamRef#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see metaModel.terms.ParamRef#getParameter()
	 * @see #getParamRef()
	 * @generated
	 */
	EReference getParamRef_Parameter();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see metaModel.terms.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link metaModel.terms.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see metaModel.terms.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.terms.Parameter#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binding</em>'.
	 * @see metaModel.terms.Parameter#getBinding()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Binding();

	/**
	 * Returns the meta object for the reference '{@link metaModel.terms.Parameter#getValueFromListParameter <em>Value From List Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value From List Parameter</em>'.
	 * @see metaModel.terms.Parameter#getValueFromListParameter()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ValueFromListParameter();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.terms.Parameter#getIteratorParameters <em>Iterator Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iterator Parameters</em>'.
	 * @see metaModel.terms.Parameter#getIteratorParameters()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_IteratorParameters();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.terms.Parameter#getReusingProcessModules <em>Reusing Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reusing Process Modules</em>'.
	 * @see metaModel.terms.Parameter#getReusingProcessModules()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ReusingProcessModules();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see metaModel.terms.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.terms.Type#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see metaModel.terms.Type#getParameters()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Parameters();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Type</em>'.
	 * @see metaModel.terms.EnumType
	 * @generated
	 */
	EClass getEnumType();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.terms.EnumType#getEnumValues <em>Enum Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Values</em>'.
	 * @see metaModel.terms.EnumType#getEnumValues()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_EnumValues();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see metaModel.terms.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.ANDTerm <em>AND Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND Term</em>'.
	 * @see metaModel.terms.ANDTerm
	 * @generated
	 */
	EClass getANDTerm();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.ORTerm <em>OR Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR Term</em>'.
	 * @see metaModel.terms.ORTerm
	 * @generated
	 */
	EClass getORTerm();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.EQTerm <em>EQ Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EQ Term</em>'.
	 * @see metaModel.terms.EQTerm
	 * @generated
	 */
	EClass getEQTerm();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.NOTTerm <em>NOT Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOT Term</em>'.
	 * @see metaModel.terms.NOTTerm
	 * @generated
	 */
	EClass getNOTTerm();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see metaModel.terms.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link metaModel.terms.Binding#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see metaModel.terms.Binding#getParameter()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link metaModel.terms.Binding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see metaModel.terms.Binding#getValue()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Value();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.EnumValueRef <em>Enum Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value Ref</em>'.
	 * @see metaModel.terms.EnumValueRef
	 * @generated
	 */
	EClass getEnumValueRef();

	/**
	 * Returns the meta object for the reference '{@link metaModel.terms.EnumValueRef#getEnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Value</em>'.
	 * @see metaModel.terms.EnumValueRef#getEnumValue()
	 * @see #getEnumValueRef()
	 * @generated
	 */
	EReference getEnumValueRef_EnumValue();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.ProjectParameter <em>Project Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Parameter</em>'.
	 * @see metaModel.terms.ProjectParameter
	 * @generated
	 */
	EClass getProjectParameter();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.ProcessParameter <em>Process Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Parameter</em>'.
	 * @see metaModel.terms.ProcessParameter
	 * @generated
	 */
	EClass getProcessParameter();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type</em>'.
	 * @see metaModel.terms.ListType
	 * @generated
	 */
	EClass getListType();

	/**
	 * Returns the meta object for the reference '{@link metaModel.terms.ListType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Type</em>'.
	 * @see metaModel.terms.ListType#getBaseType()
	 * @see #getListType()
	 * @generated
	 */
	EReference getListType_BaseType();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.InList <em>In List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In List</em>'.
	 * @see metaModel.terms.InList
	 * @generated
	 */
	EClass getInList();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.ProcessVariable <em>Process Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Variable</em>'.
	 * @see metaModel.terms.ProcessVariable
	 * @generated
	 */
	EClass getProcessVariable();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.terms.ProcessVariable#getDeterminedByProcessModules <em>Determined By Process Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Determined By Process Modules</em>'.
	 * @see metaModel.terms.ProcessVariable#getDeterminedByProcessModules()
	 * @see #getProcessVariable()
	 * @generated
	 */
	EReference getProcessVariable_DeterminedByProcessModules();

	/**
	 * Returns the meta object for class '{@link metaModel.terms.PlanningParameter <em>Planning Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planning Parameter</em>'.
	 * @see metaModel.terms.PlanningParameter
	 * @generated
	 */
	EClass getPlanningParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TermsFactory getTermsFactory();

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
		 * The meta object literal for the '{@link metaModel.terms.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.TermImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__TYPE = eINSTANCE.getTerm_Type();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.BoolTermImpl <em>Bool Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.BoolTermImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getBoolTerm()
		 * @generated
		 */
		EClass BOOL_TERM = eINSTANCE.getBoolTerm();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_TERM__TERMS = eINSTANCE.getBoolTerm_Terms();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.ListTermImpl <em>List Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.ListTermImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getListTerm()
		 * @generated
		 */
		EClass LIST_TERM = eINSTANCE.getListTerm();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_TERM__TERMS = eINSTANCE.getListTerm_Terms();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.ConstantImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.ParamRefImpl <em>Param Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.ParamRefImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getParamRef()
		 * @generated
		 */
		EClass PARAM_REF = eINSTANCE.getParamRef();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_REF__PARAMETER = eINSTANCE.getParamRef_Parameter();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.ParameterImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__BINDING = eINSTANCE.getParameter_Binding();

		/**
		 * The meta object literal for the '<em><b>Value From List Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__VALUE_FROM_LIST_PARAMETER = eINSTANCE.getParameter_ValueFromListParameter();

		/**
		 * The meta object literal for the '<em><b>Iterator Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__ITERATOR_PARAMETERS = eINSTANCE.getParameter_IteratorParameters();

		/**
		 * The meta object literal for the '<em><b>Reusing Process Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__REUSING_PROCESS_MODULES = eINSTANCE.getParameter_ReusingProcessModules();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.TypeImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__PARAMETERS = eINSTANCE.getType_Parameters();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.EnumTypeImpl <em>Enum Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.EnumTypeImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getEnumType()
		 * @generated
		 */
		EClass ENUM_TYPE = eINSTANCE.getEnumType();

		/**
		 * The meta object literal for the '<em><b>Enum Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_TYPE__ENUM_VALUES = eINSTANCE.getEnumType_EnumValues();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.EnumValueImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.ANDTermImpl <em>AND Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.ANDTermImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getANDTerm()
		 * @generated
		 */
		EClass AND_TERM = eINSTANCE.getANDTerm();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.ORTermImpl <em>OR Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.ORTermImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getORTerm()
		 * @generated
		 */
		EClass OR_TERM = eINSTANCE.getORTerm();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.EQTermImpl <em>EQ Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.EQTermImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getEQTerm()
		 * @generated
		 */
		EClass EQ_TERM = eINSTANCE.getEQTerm();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.NOTTermImpl <em>NOT Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.NOTTermImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getNOTTerm()
		 * @generated
		 */
		EClass NOT_TERM = eINSTANCE.getNOTTerm();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.BindingImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PARAMETER = eINSTANCE.getBinding_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__VALUE = eINSTANCE.getBinding_Value();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.EnumValueRefImpl <em>Enum Value Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.EnumValueRefImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getEnumValueRef()
		 * @generated
		 */
		EClass ENUM_VALUE_REF = eINSTANCE.getEnumValueRef();

		/**
		 * The meta object literal for the '<em><b>Enum Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VALUE_REF__ENUM_VALUE = eINSTANCE.getEnumValueRef_EnumValue();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.ProjectParameterImpl <em>Project Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.ProjectParameterImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getProjectParameter()
		 * @generated
		 */
		EClass PROJECT_PARAMETER = eINSTANCE.getProjectParameter();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.ProcessParameterImpl <em>Process Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.ProcessParameterImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getProcessParameter()
		 * @generated
		 */
		EClass PROCESS_PARAMETER = eINSTANCE.getProcessParameter();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.ListTypeImpl <em>List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.ListTypeImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getListType()
		 * @generated
		 */
		EClass LIST_TYPE = eINSTANCE.getListType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_TYPE__BASE_TYPE = eINSTANCE.getListType_BaseType();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.InListImpl <em>In List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.InListImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getInList()
		 * @generated
		 */
		EClass IN_LIST = eINSTANCE.getInList();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.ProcessVariableImpl <em>Process Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.ProcessVariableImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getProcessVariable()
		 * @generated
		 */
		EClass PROCESS_VARIABLE = eINSTANCE.getProcessVariable();

		/**
		 * The meta object literal for the '<em><b>Determined By Process Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_VARIABLE__DETERMINED_BY_PROCESS_MODULES = eINSTANCE.getProcessVariable_DeterminedByProcessModules();

		/**
		 * The meta object literal for the '{@link metaModel.terms.impl.PlanningParameterImpl <em>Planning Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.terms.impl.PlanningParameterImpl
		 * @see metaModel.terms.impl.TermsPackageImpl#getPlanningParameter()
		 * @generated
		 */
		EClass PLANNING_PARAMETER = eINSTANCE.getPlanningParameter();

	}

} //TermsPackage
