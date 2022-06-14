/**
 */
package metaModel.terms.impl;

import metaModel.terms.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermsFactoryImpl extends EFactoryImpl implements TermsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TermsFactory init() {
		try {
			TermsFactory theTermsFactory = (TermsFactory)EPackage.Registry.INSTANCE.getEFactory(TermsPackage.eNS_URI);
			if (theTermsFactory != null) {
				return theTermsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TermsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TermsPackage.TERM: return createTerm();
			case TermsPackage.BOOL_TERM: return createBoolTerm();
			case TermsPackage.LIST_TERM: return createListTerm();
			case TermsPackage.CONSTANT: return createConstant();
			case TermsPackage.PARAM_REF: return createParamRef();
			case TermsPackage.TYPE: return createType();
			case TermsPackage.ENUM_TYPE: return createEnumType();
			case TermsPackage.ENUM_VALUE: return createEnumValue();
			case TermsPackage.AND_TERM: return createANDTerm();
			case TermsPackage.OR_TERM: return createORTerm();
			case TermsPackage.EQ_TERM: return createEQTerm();
			case TermsPackage.NOT_TERM: return createNOTTerm();
			case TermsPackage.BINDING: return createBinding();
			case TermsPackage.ENUM_VALUE_REF: return createEnumValueRef();
			case TermsPackage.PROJECT_PARAMETER: return createProjectParameter();
			case TermsPackage.PROCESS_PARAMETER: return createProcessParameter();
			case TermsPackage.LIST_TYPE: return createListType();
			case TermsPackage.PLANNING_PARAMETER: return createPlanningParameter();
			case TermsPackage.IN_LIST: return createInList();
			case TermsPackage.PROCESS_VARIABLE: return createProcessVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolTerm createBoolTerm() {
		BoolTermImpl boolTerm = new BoolTermImpl();
		return boolTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListTerm createListTerm() {
		ListTermImpl listTerm = new ListTermImpl();
		return listTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParamRef createParamRef() {
		ParamRefImpl paramRef = new ParamRefImpl();
		return paramRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumType createEnumType() {
		EnumTypeImpl enumType = new EnumTypeImpl();
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumValue createEnumValue() {
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ANDTerm createANDTerm() {
		ANDTermImpl andTerm = new ANDTermImpl();
		return andTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ORTerm createORTerm() {
		ORTermImpl orTerm = new ORTermImpl();
		return orTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EQTerm createEQTerm() {
		EQTermImpl eqTerm = new EQTermImpl();
		return eqTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NOTTerm createNOTTerm() {
		NOTTermImpl notTerm = new NOTTermImpl();
		return notTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumValueRef createEnumValueRef() {
		EnumValueRefImpl enumValueRef = new EnumValueRefImpl();
		return enumValueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectParameter createProjectParameter() {
		ProjectParameterImpl projectParameter = new ProjectParameterImpl();
		return projectParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessParameter createProcessParameter() {
		ProcessParameterImpl processParameter = new ProcessParameterImpl();
		return processParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListType createListType() {
		ListTypeImpl listType = new ListTypeImpl();
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InList createInList() {
		InListImpl inList = new InListImpl();
		return inList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessVariable createProcessVariable() {
		ProcessVariableImpl processVariable = new ProcessVariableImpl();
		return processVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanningParameter createPlanningParameter() {
		PlanningParameterImpl planningParameter = new PlanningParameterImpl();
		return planningParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermsPackage getTermsPackage() {
		return (TermsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TermsPackage getPackage() {
		return TermsPackage.eINSTANCE;
	}

} //TermsFactoryImpl
