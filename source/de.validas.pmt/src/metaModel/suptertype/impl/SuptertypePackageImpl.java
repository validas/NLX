/**
 */
package metaModel.suptertype.impl;

import metaModel.MetaModelPackage;
import metaModel.impl.MetaModelPackageImpl;
import metaModel.modellDescr.ModellDescrPackage;

import metaModel.modellDescr.impl.ModellDescrPackageImpl;

import metaModel.referenceProcess.ReferenceProcessPackage;

import metaModel.referenceProcess.impl.ReferenceProcessPackageImpl;
import metaModel.suptertype.Layout;
import metaModel.suptertype.Named;
import metaModel.suptertype.Preference;
import metaModel.suptertype.SafetyLevel;
import metaModel.suptertype.SuptertypeFactory;
import metaModel.suptertype.SuptertypePackage;

import metaModel.suptertype.Variantable;
import metaModel.suptertype.util.SuptertypeValidator;
import metaModel.terms.TermsPackage;

import metaModel.terms.impl.TermsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuptertypePackageImpl extends EPackageImpl implements SuptertypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum safetyLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layoutEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see metaModel.suptertype.SuptertypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuptertypePackageImpl() {
		super(eNS_URI, SuptertypeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SuptertypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuptertypePackage init() {
		if (isInited) return (SuptertypePackage)EPackage.Registry.INSTANCE.getEPackage(SuptertypePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSuptertypePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SuptertypePackageImpl theSuptertypePackage = registeredSuptertypePackage instanceof SuptertypePackageImpl ? (SuptertypePackageImpl)registeredSuptertypePackage : new SuptertypePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetaModelPackage.eNS_URI);
		MetaModelPackageImpl theMetaModelPackage = (MetaModelPackageImpl)(registeredPackage instanceof MetaModelPackageImpl ? registeredPackage : MetaModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferenceProcessPackage.eNS_URI);
		ReferenceProcessPackageImpl theReferenceProcessPackage = (ReferenceProcessPackageImpl)(registeredPackage instanceof ReferenceProcessPackageImpl ? registeredPackage : ReferenceProcessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModellDescrPackage.eNS_URI);
		ModellDescrPackageImpl theModellDescrPackage = (ModellDescrPackageImpl)(registeredPackage instanceof ModellDescrPackageImpl ? registeredPackage : ModellDescrPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(registeredPackage instanceof TermsPackageImpl ? registeredPackage : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theSuptertypePackage.createPackageContents();
		theMetaModelPackage.createPackageContents();
		theReferenceProcessPackage.createPackageContents();
		theModellDescrPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theSuptertypePackage.initializePackageContents();
		theMetaModelPackage.initializePackageContents();
		theReferenceProcessPackage.initializePackageContents();
		theModellDescrPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSuptertypePackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SuptertypeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSuptertypePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuptertypePackage.eNS_URI, theSuptertypePackage);
		return theSuptertypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamed() {
		return namedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamed_Name() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamed_Description() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamed_ID() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamed_Comment() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamed_LongDescription() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamed_Deactivated() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariantable() {
		return variantableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariantable_Variants() {
		return (EReference)variantableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariantable_LayoutBefore() {
		return (EReference)variantableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariantable_LayoutAfter() {
		return (EReference)variantableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariantable_LayoutPriority() {
		return (EAttribute)variantableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreference() {
		return preferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreference_Name() {
		return (EAttribute)preferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreference_Value() {
		return (EAttribute)preferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSafetyLevel() {
		return safetyLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLayout() {
		return layoutEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuptertypeFactory getSuptertypeFactory() {
		return (SuptertypeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);
		createEAttribute(namedEClass, NAMED__DESCRIPTION);
		createEAttribute(namedEClass, NAMED__ID);
		createEAttribute(namedEClass, NAMED__COMMENT);
		createEAttribute(namedEClass, NAMED__LONG_DESCRIPTION);
		createEAttribute(namedEClass, NAMED__DEACTIVATED);

		variantableEClass = createEClass(VARIANTABLE);
		createEReference(variantableEClass, VARIANTABLE__VARIANTS);
		createEReference(variantableEClass, VARIANTABLE__LAYOUT_BEFORE);
		createEReference(variantableEClass, VARIANTABLE__LAYOUT_AFTER);
		createEAttribute(variantableEClass, VARIANTABLE__LAYOUT_PRIORITY);

		preferenceEClass = createEClass(PREFERENCE);
		createEAttribute(preferenceEClass, PREFERENCE__NAME);
		createEAttribute(preferenceEClass, PREFERENCE__VALUE);

		// Create enums
		safetyLevelEEnum = createEEnum(SAFETY_LEVEL);
		layoutEEnum = createEEnum(LAYOUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TermsPackage theTermsPackage = (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variantableEClass.getESuperTypes().add(this.getNamed());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedEClass, Named.class, "Named", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamed_Description(), ecorePackage.getEString(), "description", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamed_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamed_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamed_LongDescription(), ecorePackage.getEString(), "longDescription", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamed_Deactivated(), ecorePackage.getEBoolean(), "deactivated", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variantableEClass, Variantable.class, "Variantable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariantable_Variants(), theTermsPackage.getBoolTerm(), null, "Variants", null, 0, -1, Variantable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariantable_LayoutBefore(), this.getVariantable(), this.getVariantable_LayoutAfter(), "LayoutBefore", null, 0, -1, Variantable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariantable_LayoutAfter(), this.getVariantable(), this.getVariantable_LayoutBefore(), "LayoutAfter", null, 0, -1, Variantable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariantable_LayoutPriority(), theXMLTypePackage.getInt(), "LayoutPriority", null, 0, 1, Variantable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preferenceEClass, Preference.class, "Preference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreference_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreference_Value(), ecorePackage.getEString(), "Value", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(safetyLevelEEnum, SafetyLevel.class, "SafetyLevel");
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.ASIL_A);
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.ASIL_B);
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.ASIL_C);
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.ASIL_D);
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.SIL_1);
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.SIL_2);
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.SIL_3);
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.SIL_4);
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.TQL_5);
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.TQL_4);
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.TQL_3);
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.TQL_2);
		addEEnumLiteral(safetyLevelEEnum, SafetyLevel.TQL_1);

		initEEnum(layoutEEnum, Layout.class, "Layout");
		addEEnumLiteral(layoutEEnum, Layout.TOP_BOTTOM);
		addEEnumLiteral(layoutEEnum, Layout.BOTTOM_TOP);
		addEEnumLiteral(layoutEEnum, Layout.LEFT_RIGTH);
		addEEnumLiteral(layoutEEnum, Layout.RIGHT_LEFT);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (namedEClass,
		   source,
		   new String[] {
			   "constraints", "DescriptionOK TypeUniqueName GlobalUniqueName"
		   });
		addAnnotation
		  (variantableEClass,
		   source,
		   new String[] {
			   "constraints", "TypesOK"
		   });
	}

} //SuptertypePackageImpl
