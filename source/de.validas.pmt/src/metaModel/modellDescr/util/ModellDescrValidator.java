/**
 */
package metaModel.modellDescr.util;

import java.util.Map;
import metaModel.modellDescr.*;

import metaModel.suptertype.util.SuptertypeValidator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see metaModel.modellDescr.ModellDescrPackage
 * @generated
 */
public class ModellDescrValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModellDescrValidator INSTANCE = new ModellDescrValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "metaModel.modellDescr";

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
	public ModellDescrValidator() {
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
	  return ModellDescrPackage.eINSTANCE;
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
			case ModellDescrPackage.MM_CONDITION:
				return validateMMCondition((MMCondition)value, diagnostics, context);
			case ModellDescrPackage.META_MODEL_ELEMENT:
				return validateMetaModelElement((MetaModelElement)value, diagnostics, context);
			case ModellDescrPackage.META_MODEL_ASSOCIATION:
				return validateMetaModelAssociation((MetaModelAssociation)value, diagnostics, context);
			case ModellDescrPackage.META_MODEL_ATTRIBUTE:
				return validateMetaModelAttribute((MetaModelAttribute)value, diagnostics, context);
			case ModellDescrPackage.PROZESS_CONDITION:
				return validateProzessCondition((ProzessCondition)value, diagnostics, context);
			case ModellDescrPackage.META_MODEL:
				return validateMetaModel((MetaModel)value, diagnostics, context);
			case ModellDescrPackage.CARDINALITY:
				return validateCardinality((Cardinality)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMMCondition(MMCondition mmCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mmCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mmCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mmCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mmCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mmCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mmCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mmCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mmCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mmCondition, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(mmCondition, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(mmCondition, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(mmCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaModelElement(MetaModelElement metaModelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(metaModelElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(metaModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(metaModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(metaModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(metaModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(metaModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(metaModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(metaModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(metaModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(metaModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(metaModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(metaModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetaModelElement_CycleCheck(metaModelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetaModelElement_ContainedCheck(metaModelElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CycleCheck constraint of '<em>Meta Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaModelElement_CycleCheck(MetaModelElement metaModelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "CycleCheck", getObjectLabel(metaModelElement, context) },
						 new Object[] { metaModelElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ContainedCheck constraint of '<em>Meta Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaModelElement_ContainedCheck(MetaModelElement metaModelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "ContainedCheck", getObjectLabel(metaModelElement, context) },
						 new Object[] { metaModelElement },
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
	public boolean validateMetaModelAssociation(MetaModelAssociation metaModelAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(metaModelAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(metaModelAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(metaModelAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(metaModelAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(metaModelAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(metaModelAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(metaModelAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(metaModelAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(metaModelAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(metaModelAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(metaModelAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(metaModelAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetaModelAssociation_TypeCheck(metaModelAssociation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TypeCheck constraint of '<em>Meta Model Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaModelAssociation_TypeCheck(MetaModelAssociation metaModelAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "TypeCheck", getObjectLabel(metaModelAssociation, context) },
						 new Object[] { metaModelAssociation },
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
	public boolean validateMetaModelAttribute(MetaModelAttribute metaModelAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(metaModelAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(metaModelAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(metaModelAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(metaModelAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(metaModelAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(metaModelAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(metaModelAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(metaModelAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(metaModelAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(metaModelAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(metaModelAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(metaModelAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetaModelAttribute_TypeCheck(metaModelAttribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TypeCheck constraint of '<em>Meta Model Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaModelAttribute_TypeCheck(MetaModelAttribute metaModelAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "TypeCheck", getObjectLabel(metaModelAttribute, context) },
						 new Object[] { metaModelAttribute },
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
	public boolean validateProzessCondition(ProzessCondition prozessCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(prozessCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(prozessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(prozessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(prozessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(prozessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(prozessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(prozessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(prozessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(prozessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(prozessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(prozessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(prozessCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaModel(MetaModel metaModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(metaModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(metaModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(metaModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(metaModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(metaModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(metaModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(metaModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(metaModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(metaModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetaModel_RootCheck(metaModel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RootCheck constraint of '<em>Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaModel_RootCheck(MetaModel metaModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "RootCheck", getObjectLabel(metaModel, context) },
						 new Object[] { metaModel },
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
	public boolean validateCardinality(Cardinality cardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ModellDescrValidator
