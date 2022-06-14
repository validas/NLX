/**
 */
package metaModel.referenceProcess.util;

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
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.RequiredDocument;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.Tool;
import metaModel.referenceProcess.VerificationModule;
import metaModel.suptertype.Named;

import metaModel.suptertype.Variantable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see metaModel.referenceProcess.ReferenceProcessPackage
 * @generated
 */
public class ReferenceProcessSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReferenceProcessPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceProcessSwitch() {
		if (modelPackage == null) {
			modelPackage = ReferenceProcessPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ReferenceProcessPackage.PROCESS: {
				metaModel.referenceProcess.Process process = (metaModel.referenceProcess.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseNamed(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseVariantable(tool);
				if (result == null) result = caseNamed(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.STAKE_HOLDER: {
				StakeHolder stakeHolder = (StakeHolder)theEObject;
				T result = caseStakeHolder(stakeHolder);
				if (result == null) result = caseVariantable(stakeHolder);
				if (result == null) result = caseNamed(stakeHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseArtifact(model);
				if (result == null) result = caseVariantable(model);
				if (result == null) result = caseIVerified(model);
				if (result == null) result = caseNamed(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.PROCESS_MODULE: {
				ProcessModule processModule = (ProcessModule)theEObject;
				T result = caseProcessModule(processModule);
				if (result == null) result = caseVariantable(processModule);
				if (result == null) result = caseIVerified(processModule);
				if (result == null) result = caseIVerifier(processModule);
				if (result == null) result = caseNamed(processModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseVariantable(requirement);
				if (result == null) result = caseIVerified(requirement);
				if (result == null) result = caseNamed(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseVariantable(artifact);
				if (result == null) result = caseIVerified(artifact);
				if (result == null) result = caseNamed(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.ALTERNATIVE: {
				Alternative alternative = (Alternative)theEObject;
				T result = caseAlternative(alternative);
				if (result == null) result = caseProcessModule(alternative);
				if (result == null) result = caseVariantable(alternative);
				if (result == null) result = caseIVerified(alternative);
				if (result == null) result = caseIVerifier(alternative);
				if (result == null) result = caseNamed(alternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.PARALLEL: {
				Parallel parallel = (Parallel)theEObject;
				T result = caseParallel(parallel);
				if (result == null) result = caseProcessModule(parallel);
				if (result == null) result = caseVariantable(parallel);
				if (result == null) result = caseIVerified(parallel);
				if (result == null) result = caseIVerifier(parallel);
				if (result == null) result = caseNamed(parallel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseVariantable(method);
				if (result == null) result = caseNamed(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.IVERIFIED: {
				IVerified iVerified = (IVerified)theEObject;
				T result = caseIVerified(iVerified);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.IVERIFIER: {
				IVerifier iVerifier = (IVerifier)theEObject;
				T result = caseIVerifier(iVerifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.COMPLIANCE: {
				Compliance compliance = (Compliance)theEObject;
				T result = caseCompliance(compliance);
				if (result == null) result = caseVariantable(compliance);
				if (result == null) result = caseNamed(compliance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.VERIFICATION_MODULE: {
				VerificationModule verificationModule = (VerificationModule)theEObject;
				T result = caseVerificationModule(verificationModule);
				if (result == null) result = caseProcessModule(verificationModule);
				if (result == null) result = caseVariantable(verificationModule);
				if (result == null) result = caseIVerified(verificationModule);
				if (result == null) result = caseIVerifier(verificationModule);
				if (result == null) result = caseNamed(verificationModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.REQUIRED_DOCUMENT: {
				RequiredDocument requiredDocument = (RequiredDocument)theEObject;
				T result = caseRequiredDocument(requiredDocument);
				if (result == null) result = caseRequirement(requiredDocument);
				if (result == null) result = caseVariantable(requiredDocument);
				if (result == null) result = caseIVerified(requiredDocument);
				if (result == null) result = caseNamed(requiredDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReferenceProcessPackage.CRITERION: {
				Criterion criterion = (Criterion)theEObject;
				T result = caseCriterion(criterion);
				if (result == null) result = caseVariantable(criterion);
				if (result == null) result = caseNamed(criterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(metaModel.referenceProcess.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stake Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stake Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeHolder(StakeHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessModule(ProcessModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternative(Alternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallel(Parallel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVerified</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVerified</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVerified(IVerified object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVerifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVerifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVerifier(IVerifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compliance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compliance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompliance(Compliance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationModule(VerificationModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredDocument(RequiredDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriterion(Criterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variantable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variantable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantable(Variantable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ReferenceProcessSwitch
