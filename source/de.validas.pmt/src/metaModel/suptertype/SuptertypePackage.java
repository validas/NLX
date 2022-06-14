/**
 */
package metaModel.suptertype;

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
 * @see metaModel.suptertype.SuptertypeFactory
 * @model kind="package"
 * @generated
 */
public interface SuptertypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "suptertype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.validas.de/spedit/superType";

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
	SuptertypePackage eINSTANCE = metaModel.suptertype.impl.SuptertypePackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModel.suptertype.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.suptertype.impl.NamedImpl
	 * @see metaModel.suptertype.impl.SuptertypePackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__ID = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__LONG_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__DEACTIVATED = 5;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.suptertype.impl.VariantableImpl <em>Variantable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.suptertype.impl.VariantableImpl
	 * @see metaModel.suptertype.impl.SuptertypePackageImpl#getVariantable()
	 * @generated
	 */
	int VARIANTABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTABLE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTABLE__DESCRIPTION = NAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTABLE__ID = NAMED__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTABLE__COMMENT = NAMED__COMMENT;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTABLE__LONG_DESCRIPTION = NAMED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTABLE__DEACTIVATED = NAMED__DEACTIVATED;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTABLE__VARIANTS = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTABLE__LAYOUT_BEFORE = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layout After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTABLE__LAYOUT_AFTER = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTABLE__LAYOUT_PRIORITY = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variantable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTABLE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Variantable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTABLE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.suptertype.impl.PreferenceImpl <em>Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.suptertype.impl.PreferenceImpl
	 * @see metaModel.suptertype.impl.SuptertypePackageImpl#getPreference()
	 * @generated
	 */
	int PREFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.suptertype.SafetyLevel <em>Safety Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.suptertype.SafetyLevel
	 * @see metaModel.suptertype.impl.SuptertypePackageImpl#getSafetyLevel()
	 * @generated
	 */
	int SAFETY_LEVEL = 3;


	/**
	 * The meta object id for the '{@link metaModel.suptertype.Layout <em>Layout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.suptertype.Layout
	 * @see metaModel.suptertype.impl.SuptertypePackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 4;


	/**
	 * Returns the meta object for class '{@link metaModel.suptertype.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see metaModel.suptertype.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.suptertype.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaModel.suptertype.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.suptertype.Named#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see metaModel.suptertype.Named#getDescription()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Description();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.suptertype.Named#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see metaModel.suptertype.Named#getID()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_ID();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.suptertype.Named#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see metaModel.suptertype.Named#getComment()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Comment();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.suptertype.Named#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Description</em>'.
	 * @see metaModel.suptertype.Named#getLongDescription()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_LongDescription();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.suptertype.Named#isDeactivated <em>Deactivated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deactivated</em>'.
	 * @see metaModel.suptertype.Named#isDeactivated()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Deactivated();

	/**
	 * Returns the meta object for class '{@link metaModel.suptertype.Variantable <em>Variantable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variantable</em>'.
	 * @see metaModel.suptertype.Variantable
	 * @generated
	 */
	EClass getVariantable();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.suptertype.Variantable#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variants</em>'.
	 * @see metaModel.suptertype.Variantable#getVariants()
	 * @see #getVariantable()
	 * @generated
	 */
	EReference getVariantable_Variants();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.suptertype.Variantable#getLayoutBefore <em>Layout Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Layout Before</em>'.
	 * @see metaModel.suptertype.Variantable#getLayoutBefore()
	 * @see #getVariantable()
	 * @generated
	 */
	EReference getVariantable_LayoutBefore();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.suptertype.Variantable#getLayoutAfter <em>Layout After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Layout After</em>'.
	 * @see metaModel.suptertype.Variantable#getLayoutAfter()
	 * @see #getVariantable()
	 * @generated
	 */
	EReference getVariantable_LayoutAfter();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.suptertype.Variantable#getLayoutPriority <em>Layout Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Priority</em>'.
	 * @see metaModel.suptertype.Variantable#getLayoutPriority()
	 * @see #getVariantable()
	 * @generated
	 */
	EAttribute getVariantable_LayoutPriority();

	/**
	 * Returns the meta object for class '{@link metaModel.suptertype.Preference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preference</em>'.
	 * @see metaModel.suptertype.Preference
	 * @generated
	 */
	EClass getPreference();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.suptertype.Preference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaModel.suptertype.Preference#getName()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_Name();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.suptertype.Preference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metaModel.suptertype.Preference#getValue()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_Value();

	/**
	 * Returns the meta object for enum '{@link metaModel.suptertype.SafetyLevel <em>Safety Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Safety Level</em>'.
	 * @see metaModel.suptertype.SafetyLevel
	 * @generated
	 */
	EEnum getSafetyLevel();

	/**
	 * Returns the meta object for enum '{@link metaModel.suptertype.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout</em>'.
	 * @see metaModel.suptertype.Layout
	 * @generated
	 */
	EEnum getLayout();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuptertypeFactory getSuptertypeFactory();

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
		 * The meta object literal for the '{@link metaModel.suptertype.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.suptertype.impl.NamedImpl
		 * @see metaModel.suptertype.impl.SuptertypePackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__DESCRIPTION = eINSTANCE.getNamed_Description();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__ID = eINSTANCE.getNamed_ID();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__COMMENT = eINSTANCE.getNamed_Comment();

		/**
		 * The meta object literal for the '<em><b>Long Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__LONG_DESCRIPTION = eINSTANCE.getNamed_LongDescription();

		/**
		 * The meta object literal for the '<em><b>Deactivated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__DEACTIVATED = eINSTANCE.getNamed_Deactivated();

		/**
		 * The meta object literal for the '{@link metaModel.suptertype.impl.VariantableImpl <em>Variantable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.suptertype.impl.VariantableImpl
		 * @see metaModel.suptertype.impl.SuptertypePackageImpl#getVariantable()
		 * @generated
		 */
		EClass VARIANTABLE = eINSTANCE.getVariantable();

		/**
		 * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANTABLE__VARIANTS = eINSTANCE.getVariantable_Variants();

		/**
		 * The meta object literal for the '<em><b>Layout Before</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANTABLE__LAYOUT_BEFORE = eINSTANCE.getVariantable_LayoutBefore();

		/**
		 * The meta object literal for the '<em><b>Layout After</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANTABLE__LAYOUT_AFTER = eINSTANCE.getVariantable_LayoutAfter();

		/**
		 * The meta object literal for the '<em><b>Layout Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANTABLE__LAYOUT_PRIORITY = eINSTANCE.getVariantable_LayoutPriority();

		/**
		 * The meta object literal for the '{@link metaModel.suptertype.impl.PreferenceImpl <em>Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.suptertype.impl.PreferenceImpl
		 * @see metaModel.suptertype.impl.SuptertypePackageImpl#getPreference()
		 * @generated
		 */
		EClass PREFERENCE = eINSTANCE.getPreference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCE__NAME = eINSTANCE.getPreference_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCE__VALUE = eINSTANCE.getPreference_Value();

		/**
		 * The meta object literal for the '{@link metaModel.suptertype.SafetyLevel <em>Safety Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.suptertype.SafetyLevel
		 * @see metaModel.suptertype.impl.SuptertypePackageImpl#getSafetyLevel()
		 * @generated
		 */
		EEnum SAFETY_LEVEL = eINSTANCE.getSafetyLevel();

		/**
		 * The meta object literal for the '{@link metaModel.suptertype.Layout <em>Layout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.suptertype.Layout
		 * @see metaModel.suptertype.impl.SuptertypePackageImpl#getLayout()
		 * @generated
		 */
		EEnum LAYOUT = eINSTANCE.getLayout();

	}

} //SuptertypePackage
