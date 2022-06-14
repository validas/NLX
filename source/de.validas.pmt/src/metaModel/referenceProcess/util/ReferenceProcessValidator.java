/**
 */
package metaModel.referenceProcess.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.validas.pmt.utils.HierarchyModel;
import metaModel.referenceProcess.Alternative;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.Criterion;
import metaModel.referenceProcess.IVerified;
import metaModel.referenceProcess.IVerifier;
import metaModel.referenceProcess.Method;
import metaModel.referenceProcess.Model;
import metaModel.referenceProcess.Parallel;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ProcessStatus;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.RequiredDocument;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.Tool;
import metaModel.referenceProcess.VerificationModule;
import metaModel.suptertype.util.SuptertypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see metaModel.referenceProcess.ReferenceProcessPackage
 * @generated
 */
public class ReferenceProcessValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ReferenceProcessValidator INSTANCE = new ReferenceProcessValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "metaModel.referenceProcess";

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
	public ReferenceProcessValidator() {
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
	  return ReferenceProcessPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// do not check deactivated elements

		if (value instanceof EObject && HierarchyModel.getDeactivatedSuper((EObject)value)) {
			return true;
		}
		switch (classifierID) {
			case ReferenceProcessPackage.PROCESS:
				return validateProcess((metaModel.referenceProcess.Process)value, diagnostics, context);
			case ReferenceProcessPackage.TOOL:
				return validateTool((Tool)value, diagnostics, context);
			case ReferenceProcessPackage.STAKE_HOLDER:
				return validateStakeHolder((StakeHolder)value, diagnostics, context);
			case ReferenceProcessPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case ReferenceProcessPackage.PROCESS_MODULE:
				return validateProcessModule((ProcessModule)value, diagnostics, context);
			case ReferenceProcessPackage.REQUIREMENT:
				return validateRequirement((Requirement)value, diagnostics, context);
			case ReferenceProcessPackage.ARTIFACT:
				return validateArtifact((Artifact)value, diagnostics, context);
			case ReferenceProcessPackage.ALTERNATIVE:
				return validateAlternative((Alternative)value, diagnostics, context);
			case ReferenceProcessPackage.PARALLEL:
				return validateParallel((Parallel)value, diagnostics, context);
			case ReferenceProcessPackage.METHOD:
				return validateMethod((Method)value, diagnostics, context);
			case ReferenceProcessPackage.IVERIFIED:
				return validateIVerified((IVerified)value, diagnostics, context);
			case ReferenceProcessPackage.IVERIFIER:
				return validateIVerifier((IVerifier)value, diagnostics, context);
			case ReferenceProcessPackage.COMPLIANCE:
				return validateCompliance((Compliance)value, diagnostics, context);
			case ReferenceProcessPackage.VERIFICATION_MODULE:
				return validateVerificationModule((VerificationModule)value, diagnostics, context);
			case ReferenceProcessPackage.REQUIRED_DOCUMENT:
				return validateRequiredDocument((RequiredDocument)value, diagnostics, context);
			case ReferenceProcessPackage.CRITERION:
				return validateCriterion((Criterion)value, diagnostics, context);
			case ReferenceProcessPackage.PROCESS_STATUS:
				return validateProcessStatus((ProcessStatus)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(metaModel.referenceProcess.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(process, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(process, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(process, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTool(Tool tool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tool, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tool, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(tool, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(tool, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(tool, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validateTool_ToolUsedInProcess(tool, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ToolUsedInProcess constraint of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTool_ToolUsedInProcess(Tool tool, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "ToolUsedInProcess", getObjectLabel(tool, context) },
						 new Object[] { tool },
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
	public boolean validateStakeHolder(StakeHolder stakeHolder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stakeHolder, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stakeHolder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stakeHolder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stakeHolder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stakeHolder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stakeHolder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stakeHolder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stakeHolder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stakeHolder, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(stakeHolder, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(stakeHolder, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(stakeHolder, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(stakeHolder, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(model, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(model, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(model, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(model, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtifact_CycleCheck(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtifact_PathCheck(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtifact_ReadCheck(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtifact_WriteCheck(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtifact_ReadOrWriteCheck(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtifact_HasOrInheritStakeHolder(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateModel_MMConsistent(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateModel_MMConsistentIncluded(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateModel_MMAttributesInElements(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateModel_MMAssociationsInElements(model, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MMConsistent constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_MMConsistent(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "MMConsistent", getObjectLabel(model, context) },
						 new Object[] { model },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MMConsistentIncluded constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_MMConsistentIncluded(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "MMConsistentIncluded", getObjectLabel(model, context) },
						 new Object[] { model },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MMAttributesInElements constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_MMAttributesInElements(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "MMAttributesInElements", getObjectLabel(model, context) },
						 new Object[] { model },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MMAssociationsInElements constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_MMAssociationsInElements(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "MMAssociationsInElements", getObjectLabel(model, context) },
						 new Object[] { model },
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
	public boolean validateProcessModule(ProcessModule processModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processModule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_CycleCheck(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_InputArtifacts(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_OutputArtifacts(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_HasOrInheritStakeHolder(processModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_InterfaceCheck(processModule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CycleCheck constraint of '<em>Process Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessModule_CycleCheck(ProcessModule processModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "CycleCheck", getObjectLabel(processModule, context) },
						 new Object[] { processModule },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the InputArtifacts constraint of '<em>Process Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessModule_InputArtifacts(ProcessModule processModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "InputArtifacts", getObjectLabel(processModule, context) },
						 new Object[] { processModule },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the OutputArtifacts constraint of '<em>Process Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessModule_OutputArtifacts(ProcessModule processModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "OutputArtifacts", getObjectLabel(processModule, context) },
						 new Object[] { processModule },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the HasOrInheritStakeHolder constraint of '<em>Process Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessModule_HasOrInheritStakeHolder(ProcessModule processModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "HasOrInheritStakeHolder", getObjectLabel(processModule, context) },
						 new Object[] { processModule },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the InterfaceCheck constraint of '<em>Process Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessModule_InterfaceCheck(ProcessModule processModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "InterfaceCheck", getObjectLabel(processModule, context) },
						 new Object[] { processModule },
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
	public boolean validateRequirement(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_CycleCheck(requirement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CycleCheck constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_CycleCheck(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "CycleCheck", getObjectLabel(requirement, context) },
						 new Object[] { requirement },
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
	public boolean validateArtifact(Artifact artifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(artifact, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtifact_CycleCheck(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtifact_PathCheck(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtifact_ReadCheck(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtifact_WriteCheck(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtifact_ReadOrWriteCheck(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateArtifact_HasOrInheritStakeHolder(artifact, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CycleCheck constraint of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifact_CycleCheck(Artifact artifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "CycleCheck", getObjectLabel(artifact, context) },
						 new Object[] { artifact },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the PathCheck constraint of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifact_PathCheck(Artifact artifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "PathCheck", getObjectLabel(artifact, context) },
						 new Object[] { artifact },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ReadCheck constraint of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifact_ReadCheck(Artifact artifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "ReadCheck", getObjectLabel(artifact, context) },
						 new Object[] { artifact },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WriteCheck constraint of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifact_WriteCheck(Artifact artifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "WriteCheck", getObjectLabel(artifact, context) },
						 new Object[] { artifact },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ReadOrWriteCheck constraint of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifact_ReadOrWriteCheck(Artifact artifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "ReadOrWriteCheck", getObjectLabel(artifact, context) },
						 new Object[] { artifact },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the HasOrInheritStakeHolder constraint of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifact_HasOrInheritStakeHolder(Artifact artifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "HasOrInheritStakeHolder", getObjectLabel(artifact, context) },
						 new Object[] { artifact },
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
	public boolean validateAlternative(Alternative alternative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(alternative, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_CycleCheck(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_InputArtifacts(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_OutputArtifacts(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_HasOrInheritStakeHolder(alternative, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_InterfaceCheck(alternative, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParallel(Parallel parallel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parallel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_CycleCheck(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_InputArtifacts(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_OutputArtifacts(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_HasOrInheritStakeHolder(parallel, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_InterfaceCheck(parallel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(method, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(method, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(method, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(method, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(method, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(method, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVerified(IVerified iVerified, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iVerified, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVerifier(IVerifier iVerifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iVerifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompliance(Compliance compliance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compliance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompliance_VandVLinks(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompliance_ProcessLinks(compliance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompliance_NAnoLinks(compliance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VandVLinks constraint of '<em>Compliance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompliance_VandVLinks(Compliance compliance, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "VandVLinks", getObjectLabel(compliance, context) },
						 new Object[] { compliance },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ProcessLinks constraint of '<em>Compliance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompliance_ProcessLinks(Compliance compliance, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "ProcessLinks", getObjectLabel(compliance, context) },
						 new Object[] { compliance },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NAnoLinks constraint of '<em>Compliance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompliance_NAnoLinks(Compliance compliance, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "NAnoLinks", getObjectLabel(compliance, context) },
						 new Object[] { compliance },
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
	public boolean validateVerificationModule(VerificationModule verificationModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(verificationModule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_CycleCheck(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_InputArtifacts(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_OutputArtifacts(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_HasOrInheritStakeHolder(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessModule_InterfaceCheck(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateVerificationModule_VerifiesExactOneInput(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateVerificationModule_IsUsedInCompliances(verificationModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateVerificationModule_HasCriterion(verificationModule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VerifiesExactOneInput constraint of '<em>Verification Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerificationModule_VerifiesExactOneInput(VerificationModule verificationModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "VerifiesExactOneInput", getObjectLabel(verificationModule, context) },
						 new Object[] { verificationModule },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the IsUsedInCompliances constraint of '<em>Verification Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerificationModule_IsUsedInCompliances(VerificationModule verificationModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "IsUsedInCompliances", getObjectLabel(verificationModule, context) },
						 new Object[] { verificationModule },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the HasCriterion constraint of '<em>Verification Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerificationModule_HasCriterion(VerificationModule verificationModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "HasCriterion", getObjectLabel(verificationModule, context) },
						 new Object[] { verificationModule },
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
	public boolean validateRequiredDocument(RequiredDocument requiredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredDocument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(requiredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(requiredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(requiredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(requiredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_CycleCheck(requiredDocument, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterion(Criterion criterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(criterion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_DescriptionOK(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_TypeUniqueName(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateNamed_GlobalUniqueName(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= suptertypeValidator.validateVariantable_TypesOK(criterion, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStatus(ProcessStatus processStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ReferenceProcessValidator
