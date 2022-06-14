/**
 */
package metaModel.terms.impl;

import metaModel.MetaModelPackage;
import metaModel.impl.MetaModelPackageImpl;
import metaModel.modellDescr.ModellDescrPackage;

import metaModel.modellDescr.impl.ModellDescrPackageImpl;

import metaModel.referenceProcess.ReferenceProcessPackage;

import metaModel.referenceProcess.impl.ReferenceProcessPackageImpl;

import metaModel.suptertype.SuptertypePackage;

import metaModel.suptertype.impl.SuptertypePackageImpl;

import metaModel.terms.ANDTerm;
import metaModel.terms.Binding;
import metaModel.terms.BoolTerm;
import metaModel.terms.ProcessParameter;
import metaModel.terms.ProcessVariable;
import metaModel.terms.Constant;
import metaModel.terms.EQTerm;
import metaModel.terms.EnumType;
import metaModel.terms.EnumValue;
import metaModel.terms.EnumValueRef;
import metaModel.terms.InList;
import metaModel.terms.ListType;
import metaModel.terms.ListTerm;
import metaModel.terms.NOTTerm;
import metaModel.terms.ORTerm;
import metaModel.terms.ParamRef;
import metaModel.terms.Parameter;
import metaModel.terms.PlanningParameter;
import metaModel.terms.ProjectParameter;
import metaModel.terms.Term;
import metaModel.terms.TermsFactory;
import metaModel.terms.TermsPackage;
import metaModel.terms.Type;

import metaModel.terms.util.TermsValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermsPackageImpl extends EPackageImpl implements TermsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValueRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planningParameterEClass = null;

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
	 * @see metaModel.terms.TermsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TermsPackageImpl() {
		super(eNS_URI, TermsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TermsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TermsPackage init() {
		if (isInited) return (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTermsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TermsPackageImpl theTermsPackage = registeredTermsPackage instanceof TermsPackageImpl ? (TermsPackageImpl)registeredTermsPackage : new TermsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetaModelPackage.eNS_URI);
		MetaModelPackageImpl theMetaModelPackage = (MetaModelPackageImpl)(registeredPackage instanceof MetaModelPackageImpl ? registeredPackage : MetaModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SuptertypePackage.eNS_URI);
		SuptertypePackageImpl theSuptertypePackage = (SuptertypePackageImpl)(registeredPackage instanceof SuptertypePackageImpl ? registeredPackage : SuptertypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferenceProcessPackage.eNS_URI);
		ReferenceProcessPackageImpl theReferenceProcessPackage = (ReferenceProcessPackageImpl)(registeredPackage instanceof ReferenceProcessPackageImpl ? registeredPackage : ReferenceProcessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModellDescrPackage.eNS_URI);
		ModellDescrPackageImpl theModellDescrPackage = (ModellDescrPackageImpl)(registeredPackage instanceof ModellDescrPackageImpl ? registeredPackage : ModellDescrPackage.eINSTANCE);

		// Create package meta-data objects
		theTermsPackage.createPackageContents();
		theMetaModelPackage.createPackageContents();
		theSuptertypePackage.createPackageContents();
		theReferenceProcessPackage.createPackageContents();
		theModellDescrPackage.createPackageContents();

		// Initialize created meta-data
		theTermsPackage.initializePackageContents();
		theMetaModelPackage.initializePackageContents();
		theSuptertypePackage.initializePackageContents();
		theReferenceProcessPackage.initializePackageContents();
		theModellDescrPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTermsPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TermsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTermsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TermsPackage.eNS_URI, theTermsPackage);
		return theTermsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerm_Type() {
		return (EReference)termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoolTerm() {
		return boolTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoolTerm_Terms() {
		return (EReference)boolTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListTerm() {
		return listTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListTerm_Terms() {
		return (EReference)listTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstant_Value() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParamRef() {
		return paramRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParamRef_Parameter() {
		return (EReference)paramRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Type() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Binding() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_ValueFromListParameter() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_IteratorParameters() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_ReusingProcessModules() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_Parameters() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumType() {
		return enumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumType_EnumValues() {
		return (EReference)enumTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumValue() {
		return enumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getANDTerm() {
		return andTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getORTerm() {
		return orTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEQTerm() {
		return eqTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNOTTerm() {
		return notTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinding_Parameter() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinding_Value() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumValueRef() {
		return enumValueRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumValueRef_EnumValue() {
		return (EReference)enumValueRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectParameter() {
		return projectParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessParameter() {
		return processParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListType() {
		return listTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListType_BaseType() {
		return (EReference)listTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInList() {
		return inListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessVariable() {
		return processVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessVariable_DeterminedByProcessModules() {
		return (EReference)processVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanningParameter() {
		return planningParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermsFactory getTermsFactory() {
		return (TermsFactory)getEFactoryInstance();
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
		termEClass = createEClass(TERM);
		createEReference(termEClass, TERM__TYPE);

		boolTermEClass = createEClass(BOOL_TERM);
		createEReference(boolTermEClass, BOOL_TERM__TERMS);

		listTermEClass = createEClass(LIST_TERM);
		createEReference(listTermEClass, LIST_TERM__TERMS);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__VALUE);

		paramRefEClass = createEClass(PARAM_REF);
		createEReference(paramRefEClass, PARAM_REF__PARAMETER);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__TYPE);
		createEReference(parameterEClass, PARAMETER__BINDING);
		createEReference(parameterEClass, PARAMETER__VALUE_FROM_LIST_PARAMETER);
		createEReference(parameterEClass, PARAMETER__ITERATOR_PARAMETERS);
		createEReference(parameterEClass, PARAMETER__REUSING_PROCESS_MODULES);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__PARAMETERS);

		enumTypeEClass = createEClass(ENUM_TYPE);
		createEReference(enumTypeEClass, ENUM_TYPE__ENUM_VALUES);

		enumValueEClass = createEClass(ENUM_VALUE);

		andTermEClass = createEClass(AND_TERM);

		orTermEClass = createEClass(OR_TERM);

		eqTermEClass = createEClass(EQ_TERM);

		notTermEClass = createEClass(NOT_TERM);

		bindingEClass = createEClass(BINDING);
		createEReference(bindingEClass, BINDING__PARAMETER);
		createEReference(bindingEClass, BINDING__VALUE);

		enumValueRefEClass = createEClass(ENUM_VALUE_REF);
		createEReference(enumValueRefEClass, ENUM_VALUE_REF__ENUM_VALUE);

		projectParameterEClass = createEClass(PROJECT_PARAMETER);

		processParameterEClass = createEClass(PROCESS_PARAMETER);

		listTypeEClass = createEClass(LIST_TYPE);
		createEReference(listTypeEClass, LIST_TYPE__BASE_TYPE);

		planningParameterEClass = createEClass(PLANNING_PARAMETER);

		inListEClass = createEClass(IN_LIST);

		processVariableEClass = createEClass(PROCESS_VARIABLE);
		createEReference(processVariableEClass, PROCESS_VARIABLE__DETERMINED_BY_PROCESS_MODULES);
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
		ReferenceProcessPackage theReferenceProcessPackage = (ReferenceProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ReferenceProcessPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boolTermEClass.getESuperTypes().add(this.getTerm());
		listTermEClass.getESuperTypes().add(this.getTerm());
		constantEClass.getESuperTypes().add(this.getTerm());
		paramRefEClass.getESuperTypes().add(this.getTerm());
		parameterEClass.getESuperTypes().add(theSuptertypePackage.getNamed());
		typeEClass.getESuperTypes().add(theSuptertypePackage.getNamed());
		enumTypeEClass.getESuperTypes().add(this.getType());
		enumValueEClass.getESuperTypes().add(theSuptertypePackage.getNamed());
		andTermEClass.getESuperTypes().add(this.getBoolTerm());
		orTermEClass.getESuperTypes().add(this.getBoolTerm());
		eqTermEClass.getESuperTypes().add(this.getBoolTerm());
		notTermEClass.getESuperTypes().add(this.getBoolTerm());
		enumValueRefEClass.getESuperTypes().add(this.getTerm());
		projectParameterEClass.getESuperTypes().add(this.getParameter());
		processParameterEClass.getESuperTypes().add(this.getParameter());
		listTypeEClass.getESuperTypes().add(this.getType());
		planningParameterEClass.getESuperTypes().add(this.getParameter());
		inListEClass.getESuperTypes().add(this.getBoolTerm());
		processVariableEClass.getESuperTypes().add(this.getParameter());

		// Initialize classes, features, and operations; add parameters
		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerm_Type(), this.getType(), null, "Type", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolTermEClass, BoolTerm.class, "BoolTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoolTerm_Terms(), this.getTerm(), null, "Terms", null, 0, -1, BoolTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listTermEClass, ListTerm.class, "ListTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListTerm_Terms(), this.getTerm(), null, "Terms", null, 0, -1, ListTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstant_Value(), ecorePackage.getEString(), "Value", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramRefEClass, ParamRef.class, "ParamRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParamRef_Parameter(), this.getParameter(), null, "Parameter", null, 0, 1, ParamRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Type(), this.getType(), this.getType_Parameters(), "Type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Binding(), this.getBinding(), this.getBinding_Parameter(), "Binding", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_ValueFromListParameter(), this.getParameter(), this.getParameter_IteratorParameters(), "ValueFromListParameter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_IteratorParameters(), this.getParameter(), this.getParameter_ValueFromListParameter(), "IteratorParameters", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_ReusingProcessModules(), theReferenceProcessPackage.getProcessModule(), theReferenceProcessPackage.getProcessModule_ParameterReferences(), "ReusingProcessModules", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Parameters(), this.getParameter(), this.getParameter_Type(), "Parameters", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumTypeEClass, EnumType.class, "EnumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumType_EnumValues(), this.getEnumValue(), null, "EnumValues", null, 0, -1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andTermEClass, ANDTerm.class, "ANDTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orTermEClass, ORTerm.class, "ORTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eqTermEClass, EQTerm.class, "EQTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notTermEClass, NOTTerm.class, "NOTTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_Parameter(), this.getParameter(), this.getParameter_Binding(), "Parameter", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_Value(), this.getTerm(), null, "Value", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumValueRefEClass, EnumValueRef.class, "EnumValueRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumValueRef_EnumValue(), this.getEnumValue(), null, "EnumValue", null, 0, 1, EnumValueRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectParameterEClass, ProjectParameter.class, "ProjectParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processParameterEClass, ProcessParameter.class, "ProcessParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listTypeEClass, ListType.class, "ListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListType_BaseType(), this.getType(), null, "BaseType", null, 0, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planningParameterEClass, PlanningParameter.class, "PlanningParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inListEClass, InList.class, "InList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processVariableEClass, ProcessVariable.class, "ProcessVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessVariable_DeterminedByProcessModules(), theReferenceProcessPackage.getProcessModule(), theReferenceProcessPackage.getProcessModule_DeterminedVariables(), "DeterminedByProcessModules", null, 0, -1, ProcessVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (termEClass,
		   source,
		   new String[] {
			   "constraints", "TypesOK"
		   });
		addAnnotation
		  (paramRefEClass,
		   source,
		   new String[] {
			   "constraints", "ReferenceOK"
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "constraints", "TypesOK"
		   });
		addAnnotation
		  (typeEClass,
		   source,
		   new String[] {
			   "constraints", "TypesOK"
		   });
		addAnnotation
		  (bindingEClass,
		   source,
		   new String[] {
			   "constraints", "TypesOK OccursCheck"
		   });
		addAnnotation
		  (enumValueRefEClass,
		   source,
		   new String[] {
			   "constraints", "ReferenceOK"
		   });
	}

} //TermsPackageImpl
