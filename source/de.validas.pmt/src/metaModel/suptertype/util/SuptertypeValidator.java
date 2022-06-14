/**
 */
package metaModel.suptertype.util;

import java.util.Map;

import metaModel.suptertype.*;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see metaModel.suptertype.SuptertypePackage
 * @generated
 */
public class SuptertypeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SuptertypeValidator INSTANCE = new SuptertypeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "metaModel.suptertype";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuptertypeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SuptertypePackage.eINSTANCE;
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
			case SuptertypePackage.NAMED:
				return validateNamed((Named)value, diagnostics, context);
			case SuptertypePackage.VARIANTABLE:
				return validateVariantable((Variantable)value, diagnostics, context);
			case SuptertypePackage.PREFERENCE:
				return validatePreference((Preference)value, diagnostics, context);
			case SuptertypePackage.SAFETY_LEVEL:
				return validateSafetyLevel((SafetyLevel)value, diagnostics, context);
			case SuptertypePackage.LAYOUT:
				return validateLayout((Layout)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamed(Named named, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(named, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(named, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(named, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(named, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(named, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(named, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(named, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(named, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(named, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamed_DescriptionOK(named, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamed_TypeUniqueName(named, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamed_GlobalUniqueName(named, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DescriptionOK constraint of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamed_DescriptionOK(Named named, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "DescriptionOK", getObjectLabel(named, context) },
						 new Object[] { named },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TypeUniqueName constraint of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamed_TypeUniqueName(Named named, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "TypeUniqueName", getObjectLabel(named, context) },
						 new Object[] { named },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the GlobalUniqueName constraint of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamed_GlobalUniqueName(Named named, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "GlobalUniqueName", getObjectLabel(named, context) },
						 new Object[] { named },
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
	public boolean validateVariantable(Variantable variantable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variantable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variantable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variantable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variantable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variantable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variantable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variantable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variantable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variantable, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamed_DescriptionOK(variantable, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamed_TypeUniqueName(variantable, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamed_GlobalUniqueName(variantable, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariantable_TypesOK(variantable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TypesOK constraint of '<em>Variantable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantable_TypesOK(Variantable variantable, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "TypesOK", getObjectLabel(variantable, context) },
						 new Object[] { variantable },
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
	public boolean validatePreference(Preference preference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSafetyLevel(SafetyLevel safetyLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayout(Layout layout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //SuptertypeValidator
