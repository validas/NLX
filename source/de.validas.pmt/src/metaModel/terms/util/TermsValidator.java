/**
 */
package metaModel.terms.util;

import java.util.Map;

import metaModel.suptertype.util.SuptertypeValidator;

import metaModel.terms.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see metaModel.terms.TermsPackage
 * @generated
 */
public class TermsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TermsValidator INSTANCE = new TermsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "metaModel.terms";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuptertypeValidator suptertypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsValidator() {
		super();
		suptertypeValidator = SuptertypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TermsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TermsPackage.TERM:
				return validateTerm((Term)value, diagnostics, context);
			case TermsPackage.BOOL_TERM:
				return validateBoolTerm((BoolTerm)value, diagnostics, context);
			case TermsPackage.LIST_TERM:
				return validateListTerm((ListTerm)value, diagnostics, context);
			case TermsPackage.CONSTANT:
				return validateConstant((Constant)value, diagnostics, context);
			case TermsPackage.PARAM_REF:
				return validateParamRef((ParamRef)value, diagnostics, context);
			case TermsPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case TermsPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case TermsPackage.ENUM_TYPE:
				return validateEnumType((EnumType)value, diagnostics, context);
			case TermsPackage.ENUM_VALUE:
				return validateEnumValue((EnumValue)value, diagnostics, context);
			case TermsPackage.AND_TERM:
				return validateANDTerm((ANDTerm)value, diagnostics, context);
			case TermsPackage.OR_TERM:
				return validateORTerm((ORTerm)value, diagnostics, context);
			case TermsPackage.EQ_TERM:
				return validateEQTerm((EQTerm)value, diagnostics, context);
			case TermsPackage.NOT_TERM:
				return validateNOTTerm((NOTTerm)value, diagnostics, context);
			case TermsPackage.BINDING:
				return validateBinding((Binding)value, diagnostics, context);
			case TermsPackage.ENUM_VALUE_REF:
				return validateEnumValueRef((EnumValueRef)value, diagnostics, context);
			case TermsPackage.PROJECT_PARAMETER:
				return validateProjectParameter((ProjectParameter)value, diagnostics, context);
			case TermsPackage.PROCESS_PARAMETER:
				return validateProcessParameter((ProcessParameter)value, diagnostics, context);
			case TermsPackage.LIST_TYPE:
				return validateListType((ListType)value, diagnostics, context);
			case TermsPackage.PLANNING_PARAMETER:
				return validatePlanningParameter((PlanningParameter)value, diagnostics, context);
			case TermsPackage.IN_LIST:
				return validateInList((InList)value, diagnostics, context);
			case TermsPackage.PROCESS_VARIABLE:
				return validateProcessVariable((ProcessVariable)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerm(Term term, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(term, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(term, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_TypesOK(term, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TypesOK constraint of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerm_TypesOK(Term term, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TypesOK", getObjectLabel(term, context) },
						 new Object[] { term },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolTerm(BoolTerm boolTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boolTerm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boolTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boolTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boolTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boolTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boolTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boolTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boolTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boolTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_TypesOK(boolTerm, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListTerm(ListTerm listTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listTerm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_TypesOK(listTerm, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstant(Constant constant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_TypesOK(constant, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamRef(ParamRef paramRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(paramRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(paramRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(paramRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(paramRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(paramRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(paramRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(paramRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(paramRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(paramRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_TypesOK(paramRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateParamRef_ReferenceOK(paramRef, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ReferenceOK constraint of '<em>Param Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamRef_ReferenceOK(ParamRef paramRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ReferenceOK", getObjectLabel(paramRef, context) },
						 new Object[] { paramRef },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_TypesOK(parameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TypesOK constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_TypesOK(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TypesOK", getObjectLabel(parameter, context) },
						 new Object[] { parameter },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(type, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(type, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(type, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_TypesOK(type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TypesOK constraint of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType_TypesOK(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TypesOK", getObjectLabel(type, context) },
						 new Object[] { type },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumType(EnumType enumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_TypesOK(enumType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumValue(EnumValue enumValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumValue, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(enumValue, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(enumValue, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(enumValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANDTerm(ANDTerm andTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(andTerm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(andTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(andTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(andTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(andTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(andTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(andTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(andTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(andTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_TypesOK(andTerm, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateORTerm(ORTerm orTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(orTerm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(orTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(orTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(orTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(orTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(orTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(orTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(orTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(orTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_TypesOK(orTerm, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEQTerm(EQTerm eqTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eqTerm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eqTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eqTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eqTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eqTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eqTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eqTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eqTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eqTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_TypesOK(eqTerm, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNOTTerm(NOTTerm notTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(notTerm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(notTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(notTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(notTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(notTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(notTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(notTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(notTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(notTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_TypesOK(notTerm, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinding(Binding binding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(binding, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(binding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(binding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(binding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(binding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(binding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(binding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(binding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(binding, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinding_TypesOK(binding, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinding_OccursCheck(binding, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TypesOK constraint of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinding_TypesOK(Binding binding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TypesOK", getObjectLabel(binding, context) },
						 new Object[] { binding },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the OccursCheck constraint of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinding_OccursCheck(Binding binding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "OccursCheck", getObjectLabel(binding, context) },
						 new Object[] { binding },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumValueRef(EnumValueRef enumValueRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumValueRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_TypesOK(enumValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumValueRef_ReferenceOK(enumValueRef, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ReferenceOK constraint of '<em>Enum Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumValueRef_ReferenceOK(EnumValueRef enumValueRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ReferenceOK", getObjectLabel(enumValueRef, context) },
						 new Object[] { enumValueRef },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectParameter(ProjectParameter projectParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(projectParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(projectParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(projectParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(projectParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(projectParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(projectParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(projectParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(projectParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(projectParameter, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(projectParameter, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(projectParameter, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(projectParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_TypesOK(projectParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessParameter(ProcessParameter processParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processParameter, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(processParameter, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(processParameter, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(processParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_TypesOK(processParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListType(ListType listType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listType, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(listType, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(listType, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(listType, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_TypesOK(listType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInList(InList inList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inList, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inList, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_TypesOK(inList, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessVariable(ProcessVariable processVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processVariable, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(processVariable, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(processVariable, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(processVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_TypesOK(processVariable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanningParameter(PlanningParameter planningParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planningParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(planningParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planningParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planningParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(planningParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planningParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planningParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planningParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planningParameter, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(planningParameter, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(planningParameter, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(planningParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_TypesOK(planningParameter, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TermsValidator
