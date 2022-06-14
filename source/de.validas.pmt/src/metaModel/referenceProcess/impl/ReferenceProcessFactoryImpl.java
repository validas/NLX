/**
 */
package metaModel.referenceProcess.impl;

import metaModel.referenceProcess.Alternative;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.Criterion;
import metaModel.referenceProcess.Method;
import metaModel.referenceProcess.Model;
import metaModel.referenceProcess.Parallel;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ProcessStatus;
import metaModel.referenceProcess.ReferenceProcessFactory;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.RequiredDocument;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.Tool;
import metaModel.referenceProcess.VerificationModule;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ReferenceProcessFactoryImpl extends EFactoryImpl implements ReferenceProcessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceProcessFactory init() {
		try {
			ReferenceProcessFactory theReferenceProcessFactory = (ReferenceProcessFactory)EPackage.Registry.INSTANCE.getEFactory(ReferenceProcessPackage.eNS_URI);
			if (theReferenceProcessFactory != null) {
				return theReferenceProcessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReferenceProcessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceProcessFactoryImpl() {
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
			case ReferenceProcessPackage.PROCESS: return createProcess();
			case ReferenceProcessPackage.TOOL: return createTool();
			case ReferenceProcessPackage.STAKE_HOLDER: return createStakeHolder();
			case ReferenceProcessPackage.MODEL: return createModel();
			case ReferenceProcessPackage.PROCESS_MODULE: return createProcessModule();
			case ReferenceProcessPackage.REQUIREMENT: return createRequirement();
			case ReferenceProcessPackage.ARTIFACT: return createArtifact();
			case ReferenceProcessPackage.ALTERNATIVE: return createAlternative();
			case ReferenceProcessPackage.PARALLEL: return createParallel();
			case ReferenceProcessPackage.METHOD: return createMethod();
			case ReferenceProcessPackage.COMPLIANCE: return createCompliance();
			case ReferenceProcessPackage.VERIFICATION_MODULE: return createVerificationModule();
			case ReferenceProcessPackage.REQUIRED_DOCUMENT: return createRequiredDocument();
			case ReferenceProcessPackage.CRITERION: return createCriterion();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ReferenceProcessPackage.PROCESS_STATUS:
				return createProcessStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ReferenceProcessPackage.PROCESS_STATUS:
				return convertProcessStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public metaModel.referenceProcess.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StakeHolder createStakeHolder() {
		StakeHolderImpl stakeHolder = new StakeHolderImpl();
		return stakeHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessModule createProcessModule() {
		ProcessModuleImpl processModule = new ProcessModuleImpl();
		return processModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parallel createParallel() {
		ParallelImpl parallel = new ParallelImpl();
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Compliance createCompliance() {
		ComplianceImpl compliance = new ComplianceImpl();
		return compliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationModule createVerificationModule() {
		VerificationModuleImpl verificationModule = new VerificationModuleImpl();
		return verificationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredDocument createRequiredDocument() {
		RequiredDocumentImpl requiredDocument = new RequiredDocumentImpl();
		return requiredDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Criterion createCriterion() {
		CriterionImpl criterion = new CriterionImpl();
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStatus createProcessStatusFromString(EDataType eDataType, String initialValue) {
		ProcessStatus result = ProcessStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceProcessPackage getReferenceProcessPackage() {
		return (ReferenceProcessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReferenceProcessPackage getPackage() {
		return ReferenceProcessPackage.eINSTANCE;
	}

} //ReferenceProcessFactoryImpl
