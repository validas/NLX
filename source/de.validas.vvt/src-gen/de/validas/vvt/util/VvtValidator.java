/**
 */
package de.validas.vvt.util;

import de.validas.vvt.*;
import de.validas.vvt.utils.CheckUtils;
import de.validas.vvt.utils.HierarchyModel;
import de.validas.vvt.utils.ParameterUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.validas.vvt.VvtPackage
 * @generated
 */
public class VvtValidator extends EObjectValidator {

	/** variable do temporarily disable some checks */
	private static boolean bDebugIgnoreSomeChecks = false;

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final VvtValidator INSTANCE = new VvtValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.validas.vvt";

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
	public VvtValidator() {
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
		return VvtPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case VvtPackage.PROJECT:
			return validateProject((Project) value, diagnostics, context);
		case VvtPackage.DESCRIBED:
			return validateDescribed((Described) value, diagnostics, context);
		case VvtPackage.CHECK:
			return validateCheck((Check) value, diagnostics, context);
		case VvtPackage.PERSON:
			return validatePerson((Person) value, diagnostics, context);
		case VvtPackage.ARTIFACT:
			return validateArtifact((Artifact) value, diagnostics, context);
		case VvtPackage.REPOSITORY:
			return validateRepository((Repository) value, diagnostics, context);
		case VvtPackage.CHECK_RESULT:
			return validateCheckResult((CheckResult) value, diagnostics, context);
		case VvtPackage.INSTANCE:
			return validateInstance((Instance) value, diagnostics, context);
		case VvtPackage.PARAMETER:
			return validateParameter((Parameter) value, diagnostics, context);
		case VvtPackage.PARAMETER_VALUE:
			return validateParameterValue((ParameterValue) value, diagnostics, context);
		case VvtPackage.ISSUE:
			return validateIssue((Issue) value, diagnostics, context);
		case VvtPackage.CHECK_STATUS:
			return validateCheckStatus((CheckStatus) value, diagnostics, context);
		case VvtPackage.SEVERITY:
			return validateSeverity((Severity) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(project, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_DescriptionOK(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_nameUnique(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProject_RepositorySpecified(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProject_VerdictOK(project, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RepositorySpecified constraint of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateProject_RepositorySpecified(Project project, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		if (project.getRepository().size() == 0) {
			bResult = false;
			sMsg = ": No Repository found to check the artifacts";
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "RepositorySpecified", getObjectLabel(project, context) + sMsg },
								new Object[] { project }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the VerdictOK constraint of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not 
	 */
	public boolean validateProject_VerdictOK(Project project, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (bDebugIgnoreSomeChecks) {
			return true;
		}
		boolean bResult = true;
		String sMsg = "";
		if (project.getVerdict() != CheckStatus.PASSED) {
			bResult = false;
			sMsg = ": Project has no Status=PASS";
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "VerdictOK", getObjectLabel(project, context) + sMsg },
								new Object[] { project }, context));
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
	public boolean validateDescribed(Described described, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(described, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(described, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(described, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(described, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(described, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(described, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(described, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(described, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(described, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_DescriptionOK(described, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_nameUnique(described, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DescriptionOK constraint of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateDescribed_DescriptionOK(Described described, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		if ((described.getDescription() == null || described.getDescription().trim().equals(""))
				&& (described.getLongDescription() == null || described.getLongDescription().trim().equals(""))) {
			bResult = false;
			sMsg = ": No Description nor LongDescription given";
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "DescriptionOK", getObjectLabel(described, context) + sMsg },
								new Object[] { described }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the nameUnique constraint of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateDescribed_nameUnique(Described described, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (bDebugIgnoreSomeChecks) {
			return true;
		}
		boolean bResult = true;
		String sMsg = "";
		Map<String, Map<EClass, Set<Described>>> allDescribedMap = HierarchyModel.getAllDescribedMap(described);
		for (String name : allDescribedMap.keySet()) {
			Map<EClass, Set<Described>> map = allDescribedMap.get(name);
			for (EClass ec : map.keySet()) {
				if (map.get(ec).size() > 1) {
					if (!sMsg.equals("")) {
						sMsg += ",";
					}
					sMsg += "Name " + name + " is used in " + map.get(ec).size() + " " + ec.getName() + "s";
					bResult = false;
				}
			}
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "nameUnique", getObjectLabel(described, context) + sMsg },
								new Object[] { described }, context));
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
	public boolean validateCheck(Check check, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(check, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_DescriptionOK(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_nameUnique(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCheck_VerdictOK(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCheck_InstancesComplete(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCheck_AuthorOrImplicit(check, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCheck_ArtifactOrImplicit(check, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VerdictOK constraint of '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateCheck_VerdictOK(Check check, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean bResult = true;
		if (bDebugIgnoreSomeChecks) {
			return true;
		}
		String sMsg = "";
		if (check.getVerdict() != CheckStatus.PASSED) {
			bResult = false;
			sMsg = ": Check has no Status=PASS";
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "VerdictOK", getObjectLabel(check, context) + sMsg },
								new Object[] { check }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the InstancesComplete constraint of '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateCheck_InstancesComplete(Check check, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (check.getSubChecks().size() > 0 && check.getCheckResults().size() == 0) {
			return true;
		}
		boolean bResult = true;
		String sMsg = "";
		if (check.getParameters().size() > check.getInstances().size()) {
			bResult = false;
			sMsg = ": More Parameters (" + check.getParameters().size() + ") than Instances ("
					+ check.getInstances().size() + ") found.";
		} else {
			Set<ParameterValue> allRequiredParameterValues = CheckUtils.getAllRequiredParameterValues(check);
			if (allRequiredParameterValues.size() > check.getInstances().size()) {
				bResult = false;
				sMsg = ": More Parameter Values (" + allRequiredParameterValues.size() + ") than Instances ("
						+ check.getInstances().size() + ") found.";
			}
		}
		Set<List<ParameterValue>> sMissingParameterValues = CheckUtils.getMissingParameterValues(check);
		if (sMissingParameterValues.size() > 0) {
			bResult = false;
			List<ParameterValue> lFirst = sMissingParameterValues.iterator().next();
			String sFirst = ParameterUtils.printListParamterValues(lFirst);
			if (sMissingParameterValues.size() > 1) {
				sMsg = ": " + sMissingParameterValues.size() + " parameter combinations are missing, e.g. " + sFirst;
			} else {
				sMsg = ": Parameter combination not checked: " + sFirst;
			}
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "InstancesComplete", getObjectLabel(check, context) + sMsg },
								new Object[] { check }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AuthorOrImplicit constraint of '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateCheck_AuthorOrImplicit(Check check, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		if (!check.isImplicit() && check.getAuthor() == null) {
			bResult = false;
			sMsg = " : Non implicit checks must have an Author";
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "AuthorOrImplicit", getObjectLabel(check, context) + sMsg },
								new Object[] { check }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ArtifactOrImplicit constraint of '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateCheck_ArtifactOrImplicit(Check check, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		if (!check.isImplicit() && check.getCheckedArtifact() == null) {
			bResult = false;
			sMsg = " : Non implicit checks must have an Checked Artifact";
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "ArtifactOrImplicit", getObjectLabel(check, context) + sMsg },
								new Object[] { check }, context));
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
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_DescriptionOK(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_nameUnique(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePerson_NameGiven(person, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NameGiven constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validatePerson_NameGiven(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		if (person.getFullName() == null || person.getFullName().trim().equals("")) {
			bResult = false;
			sMsg = ": No FullName for person found.";
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "NameGiven", getObjectLabel(person, context) + sMsg },
								new Object[] { person }, context));
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
		if (!validate_NoCircularContainment(artifact, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(artifact, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(artifact, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(artifact, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(artifact, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(artifact, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(artifact, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(artifact, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(artifact, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_DescriptionOK(artifact, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_nameUnique(artifact, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateArtifact_DateOrRevision(artifact, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DateOrRevision constraint of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateArtifact_DateOrRevision(Artifact artifact, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		if ((artifact.getRevision() == null || artifact.getRevision().trim().equals(""))
				&& (artifact.getModified() == null || artifact.getModified().trim().equals(""))) {
			bResult = false;
			sMsg = " : Artifacts must have a reviesion or modified date";
		} else {
			if (!(artifact.getRevision() == null || artifact.getRevision().trim().equals(""))) {
				try {
					new Float(artifact.getRevision()); // dummy, just to check
				} catch (Exception ex) {
					bResult = false;
					sMsg = "Cannot parse revision " + artifact.getRevision() + " (should be a number): "
							+ ex.getMessage();
				}
			}
			if (!(artifact.getModified() == null || artifact.getModified().trim().equals(""))) {
				Date date = CheckUtils.parseDate(artifact.getModified());
				if (date == null) {
					bResult = false;
					sMsg = "Cannot parse modified date " + artifact.getModified()
							+ " (should be a date e.g. yyyy/MM/dd)";
				}
			}
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "DateOrRevision", getObjectLabel(artifact, context) + sMsg },
								new Object[] { artifact }, context));
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
	public boolean validateRepository(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(repository, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(repository, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(repository, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(repository, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(repository, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(repository, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(repository, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(repository, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(repository, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_DescriptionOK(repository, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_nameUnique(repository, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRepository_RepositorySpecified(repository, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RepositorySpecified constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateRepository_RepositorySpecified(Repository repository, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		if (repository.getURL() == null || repository.getURL().trim().equals("")) {
			bResult = false;
			sMsg = ": No URL for Repository found.";
		}

		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "RepositorySpecified", getObjectLabel(repository, context) + sMsg },
								new Object[] { repository }, context));
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
	public boolean validateCheckResult(CheckResult checkResult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(checkResult, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_DescriptionOK(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_nameUnique(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCheckResult_VerdictOK(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCheckResult_InstancesComplete(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCheckResult_JustificationPresent(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCheckResult_DateOK(checkResult, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCheckResult_OutDated(checkResult, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VerdictOK constraint of '<em>Check Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateCheckResult_VerdictOK(CheckResult checkResult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (bDebugIgnoreSomeChecks) {
			return true;
		}
		boolean bResult = true;
		String sMsg = "";
		// TODO: analyzed handling
		if (checkResult.getVerdict() != CheckStatus.PASSED && !CheckUtils.hasNextCheckResult(checkResult)) {
			bResult = false;
			sMsg = ": CheckResult has no Status=PASS";
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "VerdictOK", getObjectLabel(checkResult, context) + sMsg },
								new Object[] { checkResult }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the InstancesComplete constraint of '<em>Check Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateCheckResult_InstancesComplete(CheckResult checkResult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		Check check = (Check) checkResult.eContainer();
		String sMissing = "";
		for (Parameter p : check.getParameters()) {
			boolean bFoundInstanceFor = false;
			for (Instance i : checkResult.getInstances()) {
				if (i.getParameter() == p) {
					bFoundInstanceFor = true;
				}
			}
			if (!bFoundInstanceFor) {
				if (!sMissing.equals("")) {
					sMissing += ", ";
				}
				bResult = false;
				sMissing += p.getName();
			}
		}
		if (!bResult) {
			sMsg = ": no instance found for Parameter " + sMissing;
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "InstancesComplete", getObjectLabel(checkResult, context) + sMsg },
								new Object[] { checkResult }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the JustificationPresent constraint of '<em>Check Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateCheckResult_JustificationPresent(CheckResult checkResult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		if (checkResult.getJustification() == null || checkResult.getJustification().trim().equals("")) {
			bResult = false;
			sMsg = ": No Justification for CheckResult found.";
		}

		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "JustificationPresent", getObjectLabel(checkResult, context) + sMsg },
								new Object[] { checkResult }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DateOK constraint of '<em>Check Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateCheckResult_DateOK(CheckResult checkResult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (bDebugIgnoreSomeChecks) {
			return true;
		}
		boolean bResult = true;
		String sMsg = "";
		if (checkResult.getTimeStamp() == null || checkResult.getTimeStamp().toString().trim().equals("")) {
			bResult = false;
			sMsg = ": No TimeStamp for CheckResult found.";
		} else {
			if (((Check) checkResult.eContainer()).getCheckedArtifact() == null) {
				bResult = false;
				sMsg = ": No Checked Artifact found.";
			} else {
				Artifact artifact = ((Check) checkResult.eContainer()).getCheckedArtifact();
				boolean artfactOlderThanCheckResult = false;
				if (!(artifact.getRevision() == null || artifact.getRevision().trim().equals(""))) {
					try {
						float fArt = new Float(artifact.getRevision());
						Float fCheck = new Float(checkResult.getTimeStamp());
						if (fArt > fCheck) {
							bResult = false;
							sMsg = " : checked artifact " + artifact.getName() + " has newer revision " + fArt
									+ " than checked one " + fCheck;
						} else {
							artfactOlderThanCheckResult = true;
						}
					} catch (Exception ex) {
						// can still be a date
					}
				}
				if (!artfactOlderThanCheckResult && bResult) {
					if (!(artifact.getModified() == null || artifact.getModified().trim().equals(""))) {
						Date dateArt = CheckUtils.parseDate(artifact.getModified());
						Date dateCheck = CheckUtils.parseDate(checkResult.getTimeStamp());
						if (dateArt == null || dateCheck == null) {
							bResult = false;
							sMsg = "Cannot parse dates " + artifact.getModified() + "/" + checkResult.getTimeStamp()
									+ " (should be a date e.g. yyyy/MM/dd)";
						} else {
							if (dateArt.after(dateCheck)) {
								bResult = false;
								sMsg = " : checked artifact " + artifact.getName() + " has newer date "
										+ artifact.getModified() + " than checked one " + checkResult.getTimeStamp();
							} else {
								artfactOlderThanCheckResult = true;
							}
						}
					}
				}
			}
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "DateOK", getObjectLabel(checkResult, context) + sMsg },
								new Object[] { checkResult }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the OutDated constraint of '<em>Check Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not 
	 */
	public boolean validateCheckResult_OutDated(CheckResult checkResult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		if (!CheckUtils.hasNextCheckResult(checkResult)) {
			String sResultDate = checkResult.getArtifactRevisionOrDate();
			if (sResultDate == null) {
				return true;
			}
			Artifact aChecked = HierarchyModel.getCheckedArtifactSuper((Check) checkResult.eContainer());
			String sArtDate = aChecked.getRevision();
			Date dResult = CheckUtils.parseDate(sResultDate);
			Date dArt = CheckUtils.parseDate(sArtDate);
			if (dResult != null && dArt != null) {
				if (dResult.after(dArt)) {
					bResult = false;
					sMsg = " : newer Artifact " + sArtDate + " > " + sResultDate;
				}
			} else {
				// try to compare them as numbers
				try {
					double dRes = new Double(sResultDate).doubleValue();
					double dA = new Double(sArtDate).doubleValue();
					if (dA > dRes) {
						bResult = false;
						sMsg = " : newer Revision " + sArtDate + " > " + sResultDate;
					}
				} catch (NumberFormatException nfe) {
					// System.out.println("could not parse number from revision:"+nfe.getMessage());
				}
			}
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "OutDated", getObjectLabel(checkResult, context) + sMsg },
								new Object[] { checkResult }, context));
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
	public boolean validateInstance(Instance instance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instance, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(instance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(instance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(instance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(instance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(instance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(instance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(instance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(instance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInstance_ValueOfCorrectParameter(instance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValueOfCorrectParameter constraint of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateInstance_ValueOfCorrectParameter(Instance instance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		if (instance.getParameter() == null) {
			bResult = false;
			sMsg = " no Parameter found for Instance";
		} else if (instance.getParameterValue() == null || instance.getParameterValue().getValue() == null
				|| instance.getParameterValue().getValue().trim().equals("")) {
			bResult = false;
			sMsg = ": No Value for ParameterValue for Instanc of Parameter " + instance.getParameter().getName()
					+ " in Check " + ((Check) instance.eContainer()).getName() + " found.";
		} else {
			String sInstantiatedValue = instance.getParameterValue().getValue();
			boolean bFound = false;
			for (ParameterValue pv : instance.getParameter().getParameterValues()) {
				if (sInstantiatedValue.equals(pv.getValue())) {
					bFound = true;
				}
			}
			if (!bFound) {
				bResult = false;
				sMsg = "Value " + sInstantiatedValue + " is not possible ParameterValue of Parameter "
						+ instance.getParameter().getName();
			}
		}
		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "ValueOfCorrectParameter", getObjectLabel(instance, context) + sMsg },
								new Object[] { instance }, context));
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
		if (!validate_NoCircularContainment(parameter, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_DescriptionOK(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_nameUnique(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameter_ValuesGiven(parameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValuesGiven constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateParameter_ValuesGiven(Parameter parameter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		if (parameter.getParameterValues().size() == 0) {
			bResult = false;
			sMsg = ": No Values for Parameter found.";
		}

		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "ValuesGiven", getObjectLabel(parameter, context) + sMsg },
								new Object[] { parameter }, context));
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
	public boolean validateParameterValue(ParameterValue parameterValue, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterValue, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(parameterValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(parameterValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(parameterValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(parameterValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(parameterValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(parameterValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(parameterValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(parameterValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameterValue_ValueOK(parameterValue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValueOK constraint of '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateParameterValue_ValueOK(ParameterValue parameterValue, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean bResult = true;
		String sMsg = "";
		if (parameterValue.getValue() == null || parameterValue.getValue().trim().equals("")) {
			bResult = false;
			Parameter p = (Parameter) parameterValue.eContainer();
			sMsg = ": No Value for ParameterValue for Parameter " + p.getName() + " found.";
		}

		if (!bResult) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "ValueOK", getObjectLabel(parameterValue, context) + sMsg },
								new Object[] { parameterValue }, context));
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
	public boolean validateIssue(Issue issue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(issue, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(issue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(issue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(issue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(issue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(issue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(issue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(issue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(issue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_DescriptionOK(issue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescribed_nameUnique(issue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckStatus(CheckStatus checkStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //VvtValidator
