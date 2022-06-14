/**
 */
package metaModel.modellDescr.impl;

import metaModel.MetaModelPackage;
import metaModel.impl.MetaModelPackageImpl;
import metaModel.modellDescr.Cardinality;
import metaModel.modellDescr.MMCondition;
import metaModel.modellDescr.MetaModel;
import metaModel.modellDescr.MetaModelAssociation;
import metaModel.modellDescr.MetaModelAttribute;
import metaModel.modellDescr.MetaModelElement;
import metaModel.modellDescr.ModellDescrFactory;
import metaModel.modellDescr.ModellDescrPackage;
import metaModel.modellDescr.ProzessCondition;

import metaModel.modellDescr.util.ModellDescrValidator;
import metaModel.referenceProcess.ReferenceProcessPackage;

import metaModel.referenceProcess.impl.ReferenceProcessPackageImpl;

import metaModel.suptertype.SuptertypePackage;

import metaModel.suptertype.impl.SuptertypePackageImpl;

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
public class ModellDescrPackageImpl extends EPackageImpl implements ModellDescrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mmConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prozessConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalityEEnum = null;

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
	 * @see metaModel.modellDescr.ModellDescrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModellDescrPackageImpl() {
		super(eNS_URI, ModellDescrFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModellDescrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModellDescrPackage init() {
		if (isInited) return (ModellDescrPackage)EPackage.Registry.INSTANCE.getEPackage(ModellDescrPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModellDescrPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModellDescrPackageImpl theModellDescrPackage = registeredModellDescrPackage instanceof ModellDescrPackageImpl ? (ModellDescrPackageImpl)registeredModellDescrPackage : new ModellDescrPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetaModelPackage.eNS_URI);
		MetaModelPackageImpl theMetaModelPackage = (MetaModelPackageImpl)(registeredPackage instanceof MetaModelPackageImpl ? registeredPackage : MetaModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SuptertypePackage.eNS_URI);
		SuptertypePackageImpl theSuptertypePackage = (SuptertypePackageImpl)(registeredPackage instanceof SuptertypePackageImpl ? registeredPackage : SuptertypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferenceProcessPackage.eNS_URI);
		ReferenceProcessPackageImpl theReferenceProcessPackage = (ReferenceProcessPackageImpl)(registeredPackage instanceof ReferenceProcessPackageImpl ? registeredPackage : ReferenceProcessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(registeredPackage instanceof TermsPackageImpl ? registeredPackage : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theModellDescrPackage.createPackageContents();
		theMetaModelPackage.createPackageContents();
		theSuptertypePackage.createPackageContents();
		theReferenceProcessPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theModellDescrPackage.initializePackageContents();
		theMetaModelPackage.initializePackageContents();
		theSuptertypePackage.initializePackageContents();
		theReferenceProcessPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theModellDescrPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ModellDescrValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theModellDescrPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModellDescrPackage.eNS_URI, theModellDescrPackage);
		return theModellDescrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMMCondition() {
		return mmConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMMCondition_MetaModellElements() {
		return (EReference)mmConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMMCondition_MetaModellAttributes() {
		return (EReference)mmConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMMCondition_MetaModellAssociations() {
		return (EReference)mmConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMMCondition_Variant() {
		return (EReference)mmConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMMCondition_ProcessCondition() {
		return (EReference)mmConditionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetaModelElement() {
		return metaModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelElement_MMConditions() {
		return (EReference)metaModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelElement_MetaModelAttributes() {
		return (EReference)metaModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelElement_MetaModelAssociations() {
		return (EReference)metaModelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelElement_MandatoryInModels() {
		return (EReference)metaModelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelElement_Parents() {
		return (EReference)metaModelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetaModelElement_IsRoot() {
		return (EAttribute)metaModelElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetaModelElement_IsAbstract() {
		return (EAttribute)metaModelElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelElement_OptionalInModels() {
		return (EReference)metaModelElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetaModelAssociation() {
		return metaModelAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelAssociation_MMConditions() {
		return (EReference)metaModelAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelAssociation_MandatoryInModels() {
		return (EReference)metaModelAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelAssociation_ToElement() {
		return (EReference)metaModelAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetaModelAssociation_Containment() {
		return (EAttribute)metaModelAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetaModelAssociation_Cardinality() {
		return (EAttribute)metaModelAssociationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelAssociation_OptionalInModels() {
		return (EReference)metaModelAssociationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetaModelAttribute() {
		return metaModelAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelAttribute_MMConditions() {
		return (EReference)metaModelAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelAttribute_MandatoryInModels() {
		return (EReference)metaModelAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetaModelAttribute_Type() {
		return (EAttribute)metaModelAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModelAttribute_OptionalInModels() {
		return (EReference)metaModelAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProzessCondition() {
		return prozessConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProzessCondition_Artefakt() {
		return (EReference)prozessConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProzessCondition_Processmodule() {
		return (EReference)prozessConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProzessCondition_Variant() {
		return (EReference)prozessConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProzessCondition_MMConditions() {
		return (EReference)prozessConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetaModel() {
		return metaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModel_MetaModelElements() {
		return (EReference)metaModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaModel_Tool() {
		return (EReference)metaModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCardinality() {
		return cardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModellDescrFactory getModellDescrFactory() {
		return (ModellDescrFactory)getEFactoryInstance();
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
		mmConditionEClass = createEClass(MM_CONDITION);
		createEReference(mmConditionEClass, MM_CONDITION__META_MODELL_ELEMENTS);
		createEReference(mmConditionEClass, MM_CONDITION__META_MODELL_ATTRIBUTES);
		createEReference(mmConditionEClass, MM_CONDITION__META_MODELL_ASSOCIATIONS);
		createEReference(mmConditionEClass, MM_CONDITION__VARIANT);
		createEReference(mmConditionEClass, MM_CONDITION__PROCESS_CONDITION);

		metaModelElementEClass = createEClass(META_MODEL_ELEMENT);
		createEReference(metaModelElementEClass, META_MODEL_ELEMENT__MM_CONDITIONS);
		createEReference(metaModelElementEClass, META_MODEL_ELEMENT__META_MODEL_ATTRIBUTES);
		createEReference(metaModelElementEClass, META_MODEL_ELEMENT__META_MODEL_ASSOCIATIONS);
		createEReference(metaModelElementEClass, META_MODEL_ELEMENT__MANDATORY_IN_MODELS);
		createEReference(metaModelElementEClass, META_MODEL_ELEMENT__PARENTS);
		createEAttribute(metaModelElementEClass, META_MODEL_ELEMENT__IS_ROOT);
		createEAttribute(metaModelElementEClass, META_MODEL_ELEMENT__IS_ABSTRACT);
		createEReference(metaModelElementEClass, META_MODEL_ELEMENT__OPTIONAL_IN_MODELS);

		metaModelAssociationEClass = createEClass(META_MODEL_ASSOCIATION);
		createEReference(metaModelAssociationEClass, META_MODEL_ASSOCIATION__MM_CONDITIONS);
		createEReference(metaModelAssociationEClass, META_MODEL_ASSOCIATION__MANDATORY_IN_MODELS);
		createEReference(metaModelAssociationEClass, META_MODEL_ASSOCIATION__TO_ELEMENT);
		createEAttribute(metaModelAssociationEClass, META_MODEL_ASSOCIATION__CONTAINMENT);
		createEAttribute(metaModelAssociationEClass, META_MODEL_ASSOCIATION__CARDINALITY);
		createEReference(metaModelAssociationEClass, META_MODEL_ASSOCIATION__OPTIONAL_IN_MODELS);

		metaModelAttributeEClass = createEClass(META_MODEL_ATTRIBUTE);
		createEReference(metaModelAttributeEClass, META_MODEL_ATTRIBUTE__MM_CONDITIONS);
		createEReference(metaModelAttributeEClass, META_MODEL_ATTRIBUTE__MANDATORY_IN_MODELS);
		createEAttribute(metaModelAttributeEClass, META_MODEL_ATTRIBUTE__TYPE);
		createEReference(metaModelAttributeEClass, META_MODEL_ATTRIBUTE__OPTIONAL_IN_MODELS);

		prozessConditionEClass = createEClass(PROZESS_CONDITION);
		createEReference(prozessConditionEClass, PROZESS_CONDITION__ARTEFAKT);
		createEReference(prozessConditionEClass, PROZESS_CONDITION__PROCESSMODULE);
		createEReference(prozessConditionEClass, PROZESS_CONDITION__VARIANT);
		createEReference(prozessConditionEClass, PROZESS_CONDITION__MM_CONDITIONS);

		metaModelEClass = createEClass(META_MODEL);
		createEReference(metaModelEClass, META_MODEL__META_MODEL_ELEMENTS);
		createEReference(metaModelEClass, META_MODEL__TOOL);

		// Create enums
		cardinalityEEnum = createEEnum(CARDINALITY);
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
		SuptertypePackage theSuptertypePackage = (SuptertypePackage)EPackage.Registry.INSTANCE.getEPackage(SuptertypePackage.eNS_URI);
		TermsPackage theTermsPackage = (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		ReferenceProcessPackage theReferenceProcessPackage = (ReferenceProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ReferenceProcessPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mmConditionEClass.getESuperTypes().add(theSuptertypePackage.getNamed());
		metaModelElementEClass.getESuperTypes().add(theSuptertypePackage.getNamed());
		metaModelAssociationEClass.getESuperTypes().add(theSuptertypePackage.getNamed());
		metaModelAttributeEClass.getESuperTypes().add(theSuptertypePackage.getNamed());
		prozessConditionEClass.getESuperTypes().add(theSuptertypePackage.getNamed());

		// Initialize classes, features, and operations; add parameters
		initEClass(mmConditionEClass, MMCondition.class, "MMCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMCondition_MetaModellElements(), this.getMetaModelElement(), this.getMetaModelElement_MMConditions(), "MetaModellElements", null, 0, -1, MMCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMCondition_MetaModellAttributes(), this.getMetaModelAttribute(), this.getMetaModelAttribute_MMConditions(), "MetaModellAttributes", null, 0, -1, MMCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMCondition_MetaModellAssociations(), this.getMetaModelAssociation(), this.getMetaModelAssociation_MMConditions(), "MetaModellAssociations", null, 0, -1, MMCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMCondition_Variant(), theTermsPackage.getBoolTerm(), null, "Variant", null, 0, 1, MMCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMCondition_ProcessCondition(), this.getProzessCondition(), this.getProzessCondition_MMConditions(), "ProcessCondition", null, 0, -1, MMCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaModelElementEClass, MetaModelElement.class, "MetaModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaModelElement_MMConditions(), this.getMMCondition(), this.getMMCondition_MetaModellElements(), "MMConditions", null, 0, -1, MetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelElement_MetaModelAttributes(), this.getMetaModelAttribute(), null, "MetaModelAttributes", null, 0, -1, MetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelElement_MetaModelAssociations(), this.getMetaModelAssociation(), null, "MetaModelAssociations", null, 0, -1, MetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelElement_MandatoryInModels(), theReferenceProcessPackage.getModel(), theReferenceProcessPackage.getModel_MandatoryElements(), "MandatoryInModels", null, 0, -1, MetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelElement_Parents(), this.getMetaModelElement(), null, "Parents", null, 0, -1, MetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaModelElement_IsRoot(), ecorePackage.getEBoolean(), "IsRoot", null, 0, 1, MetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaModelElement_IsAbstract(), theXMLTypePackage.getBoolean(), "IsAbstract", null, 0, 1, MetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelElement_OptionalInModels(), theReferenceProcessPackage.getModel(), theReferenceProcessPackage.getModel_OptionalElements(), "OptionalInModels", null, 0, -1, MetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaModelAssociationEClass, MetaModelAssociation.class, "MetaModelAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaModelAssociation_MMConditions(), this.getMMCondition(), this.getMMCondition_MetaModellAssociations(), "MMConditions", null, 0, -1, MetaModelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelAssociation_MandatoryInModels(), theReferenceProcessPackage.getModel(), theReferenceProcessPackage.getModel_MandatoryAssociations(), "MandatoryInModels", null, 0, -1, MetaModelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelAssociation_ToElement(), this.getMetaModelElement(), null, "ToElement", null, 0, 1, MetaModelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaModelAssociation_Containment(), ecorePackage.getEBoolean(), "Containment", null, 0, 1, MetaModelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaModelAssociation_Cardinality(), this.getCardinality(), "Cardinality", null, 0, 1, MetaModelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelAssociation_OptionalInModels(), theReferenceProcessPackage.getModel(), theReferenceProcessPackage.getModel_OptionalAssociations(), "OptionalInModels", null, 0, -1, MetaModelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaModelAttributeEClass, MetaModelAttribute.class, "MetaModelAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaModelAttribute_MMConditions(), this.getMMCondition(), this.getMMCondition_MetaModellAttributes(), "MMConditions", null, 0, -1, MetaModelAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelAttribute_MandatoryInModels(), theReferenceProcessPackage.getModel(), theReferenceProcessPackage.getModel_MandatoryAttributes(), "MandatoryInModels", null, 0, -1, MetaModelAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaModelAttribute_Type(), ecorePackage.getEString(), "Type", null, 0, 1, MetaModelAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelAttribute_OptionalInModels(), theReferenceProcessPackage.getModel(), theReferenceProcessPackage.getModel_OptionalAttributes(), "OptionalInModels", null, 0, -1, MetaModelAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prozessConditionEClass, ProzessCondition.class, "ProzessCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProzessCondition_Artefakt(), theReferenceProcessPackage.getArtifact(), theReferenceProcessPackage.getArtifact_ProcessConditions(), "artefakt", null, 0, -1, ProzessCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProzessCondition_Processmodule(), theReferenceProcessPackage.getProcessModule(), null, "processmodule", null, 0, -1, ProzessCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProzessCondition_Variant(), theTermsPackage.getBoolTerm(), null, "Variant", null, 0, 1, ProzessCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProzessCondition_MMConditions(), this.getMMCondition(), this.getMMCondition_ProcessCondition(), "MMConditions", null, 0, -1, ProzessCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaModelEClass, MetaModel.class, "MetaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaModel_MetaModelElements(), this.getMetaModelElement(), null, "MetaModelElements", null, 0, -1, MetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModel_Tool(), theReferenceProcessPackage.getTool(), theReferenceProcessPackage.getTool_MetaModel(), "Tool", null, 0, 1, MetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cardinalityEEnum, Cardinality.class, "Cardinality");
		addEEnumLiteral(cardinalityEEnum, Cardinality.CARDINALITY_0TO_1);
		addEEnumLiteral(cardinalityEEnum, Cardinality.CARDINALITY_1);
		addEEnumLiteral(cardinalityEEnum, Cardinality.CARDINALITY_N);
		addEEnumLiteral(cardinalityEEnum, Cardinality.CARDINALITY_0TO_N);

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
		  (metaModelElementEClass,
		   source,
		   new String[] {
			   "constraints", "CycleCheck ContainedCheck"
		   });
		addAnnotation
		  (metaModelAssociationEClass,
		   source,
		   new String[] {
			   "constraints", "TypeCheck"
		   });
		addAnnotation
		  (metaModelAttributeEClass,
		   source,
		   new String[] {
			   "constraints", "TypeCheck"
		   });
		addAnnotation
		  (metaModelEClass,
		   source,
		   new String[] {
			   "constraints", "RootCheck"
		   });
	}

} //ModellDescrPackageImpl
