/**
 */
package metaModel.referenceProcess.impl;

import metaModel.MetaModelPackage;
import metaModel.impl.MetaModelPackageImpl;
import metaModel.modellDescr.ModellDescrPackage;

import metaModel.modellDescr.impl.ModellDescrPackageImpl;

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
import metaModel.referenceProcess.ReferenceProcessFactory;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.RequiredDocument;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.Tool;

import metaModel.referenceProcess.VerificationModule;
import metaModel.referenceProcess.util.ReferenceProcessValidator;
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
public class ReferenceProcessPackageImpl extends EPackageImpl implements ReferenceProcessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iVerifiedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iVerifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processStatusEEnum = null;

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
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReferenceProcessPackageImpl() {
		super(eNS_URI, ReferenceProcessFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReferenceProcessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReferenceProcessPackage init() {
		if (isInited) return (ReferenceProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ReferenceProcessPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReferenceProcessPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReferenceProcessPackageImpl theReferenceProcessPackage = registeredReferenceProcessPackage instanceof ReferenceProcessPackageImpl ? (ReferenceProcessPackageImpl)registeredReferenceProcessPackage : new ReferenceProcessPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetaModelPackage.eNS_URI);
		MetaModelPackageImpl theMetaModelPackage = (MetaModelPackageImpl)(registeredPackage instanceof MetaModelPackageImpl ? registeredPackage : MetaModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SuptertypePackage.eNS_URI);
		SuptertypePackageImpl theSuptertypePackage = (SuptertypePackageImpl)(registeredPackage instanceof SuptertypePackageImpl ? registeredPackage : SuptertypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModellDescrPackage.eNS_URI);
		ModellDescrPackageImpl theModellDescrPackage = (ModellDescrPackageImpl)(registeredPackage instanceof ModellDescrPackageImpl ? registeredPackage : ModellDescrPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(registeredPackage instanceof TermsPackageImpl ? registeredPackage : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theReferenceProcessPackage.createPackageContents();
		theMetaModelPackage.createPackageContents();
		theSuptertypePackage.createPackageContents();
		theModellDescrPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theReferenceProcessPackage.initializePackageContents();
		theMetaModelPackage.initializePackageContents();
		theSuptertypePackage.initializePackageContents();
		theModellDescrPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theReferenceProcessPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ReferenceProcessValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theReferenceProcessPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReferenceProcessPackage.eNS_URI, theReferenceProcessPackage);
		return theReferenceProcessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Tools() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Requirements() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Artifacts() {
		return (EReference)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Methods() {
		return (EReference)processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_ProcessModules() {
		return (EReference)processEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_StakeHolders() {
		return (EReference)processEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_ProcessConditions() {
		return (EReference)processEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Parameters() {
		return (EReference)processEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Bindings() {
		return (EReference)processEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Types() {
		return (EReference)processEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_MaximalSafetyLevel() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Preferences() {
		return (EReference)processEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_FilterScope() {
		return (EReference)processEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_ProcessModules() {
		return (EReference)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTool_Methods() {
		return (EReference)toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTool_MetaModel() {
		return (EReference)toolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_PreliminaryClassification() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_ClassificationExplanation() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTool_ToolOwner() {
		return (EReference)toolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStakeHolder() {
		return stakeHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStakeHolder_OwnedModules() {
		return (EReference)stakeHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStakeHolder_InvolvedModules() {
		return (EReference)stakeHolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStakeHolder_Compliances() {
		return (EReference)stakeHolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStakeHolder_AssignedPerson() {
		return (EAttribute)stakeHolderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStakeHolder_OwnedArtifacts() {
		return (EReference)stakeHolderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStakeHolder_InvolvedArtifacts() {
		return (EReference)stakeHolderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStakeHolder_OwnedTools() {
		return (EReference)stakeHolderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStakeHolder_Layout() {
		return (EAttribute)stakeHolderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_MetaModel() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Includes() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_IsIncludedIn() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_MandatoryElements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_MandatoryAttributes() {
		return (EReference)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_MandatoryAssociations() {
		return (EReference)modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_OptionalElements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_OptionalAttributes() {
		return (EReference)modelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_OptionalAssociations() {
		return (EReference)modelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessModule() {
		return processModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_Requirements() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_SubProcessModules() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_InputArtifacts() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_Tools() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_BeforeProcessModules() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_AfterProcessModules() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_InvolvedStakeHolders() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_PreMMCondition() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_PostMMCondition() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_OutputArtifacts() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessModule_URI() {
		return (EAttribute)processModuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_Parameters() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_Bindings() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessModule_NumberOfInstances() {
		return (EAttribute)processModuleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessModule_Effort() {
		return (EAttribute)processModuleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessModule_Progress() {
		return (EAttribute)processModuleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessModule_PlannedStartDate() {
		return (EAttribute)processModuleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessModule_PlannedEndDate() {
		return (EAttribute)processModuleEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessModule_EndDate() {
		return (EAttribute)processModuleEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_SubProcessModuleReferences() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_InstanceOfProcessModule() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_InstantiatedInProcessModules() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_Compliances() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_StakeHolder() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_ClaimedComplianceRequirements() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessModule_Status() {
		return (EAttribute)processModuleEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_ParameterReferences() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_DeterminedVariables() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessModule_Layout() {
		return (EAttribute)processModuleEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_Artifacts() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_StakeHolders() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModule_Types() {
		return (EReference)processModuleEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_SubRequirements() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_RequiredRequirements() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_RequiredByRequirements() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_RecommentedFrom() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_RecommentedTo() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_Compliances() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_ClaimingProcessModules() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_DocumentStatus() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Version() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_ReadByProcessModules() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_ProcessConditions() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_CreatedByProcessModules() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_SubArtifacts() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_SubArtifactReferences() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_Compliances() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_InvolvedStakeHolders() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_StakeHolder() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Path() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Status() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_PartOfProduct() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_ReferedByArtifacts() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_ProjectInput() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Layout() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlternative() {
		return alternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlternative_ProcessModules() {
		return (EReference)alternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlternative_Condition() {
		return (EReference)alternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallel() {
		return parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallel_ProcessModules() {
		return (EReference)parallelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethod_Tools() {
		return (EReference)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIVerified() {
		return iVerifiedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIVerified_VerifiedBy() {
		return (EReference)iVerifiedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIVerifier() {
		return iVerifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIVerifier_Verifies() {
		return (EReference)iVerifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompliance() {
		return complianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompliance_ProcessModules() {
		return (EReference)complianceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompliance_StakeHolders() {
		return (EReference)complianceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompliance_VerificationModules() {
		return (EReference)complianceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompliance_Artifatcs() {
		return (EReference)complianceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompliance_SubCompliances() {
		return (EReference)complianceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompliance_Applicable() {
		return (EAttribute)complianceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerificationModule() {
		return verificationModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerificationModule_VerifiedCompliances() {
		return (EReference)verificationModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerificationModule_Implicit() {
		return (EAttribute)verificationModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerificationModule_Criteria() {
		return (EReference)verificationModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredDocument() {
		return requiredDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredDocument_Artifacts() {
		return (EReference)requiredDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCriterion() {
		return criterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcessStatus() {
		return processStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceProcessFactory getReferenceProcessFactory() {
		return (ReferenceProcessFactory)getEFactoryInstance();
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
		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__TOOLS);
		createEReference(processEClass, PROCESS__REQUIREMENTS);
		createEReference(processEClass, PROCESS__ARTIFACTS);
		createEReference(processEClass, PROCESS__METHODS);
		createEReference(processEClass, PROCESS__PROCESS_MODULES);
		createEReference(processEClass, PROCESS__STAKE_HOLDERS);
		createEReference(processEClass, PROCESS__PROCESS_CONDITIONS);
		createEReference(processEClass, PROCESS__PARAMETERS);
		createEReference(processEClass, PROCESS__BINDINGS);
		createEReference(processEClass, PROCESS__TYPES);
		createEAttribute(processEClass, PROCESS__MAXIMAL_SAFETY_LEVEL);
		createEReference(processEClass, PROCESS__PREFERENCES);
		createEReference(processEClass, PROCESS__FILTER_SCOPE);

		toolEClass = createEClass(TOOL);
		createEReference(toolEClass, TOOL__PROCESS_MODULES);
		createEReference(toolEClass, TOOL__METHODS);
		createEReference(toolEClass, TOOL__META_MODEL);
		createEAttribute(toolEClass, TOOL__PRELIMINARY_CLASSIFICATION);
		createEAttribute(toolEClass, TOOL__CLASSIFICATION_EXPLANATION);
		createEReference(toolEClass, TOOL__TOOL_OWNER);

		stakeHolderEClass = createEClass(STAKE_HOLDER);
		createEReference(stakeHolderEClass, STAKE_HOLDER__OWNED_MODULES);
		createEReference(stakeHolderEClass, STAKE_HOLDER__INVOLVED_MODULES);
		createEReference(stakeHolderEClass, STAKE_HOLDER__COMPLIANCES);
		createEAttribute(stakeHolderEClass, STAKE_HOLDER__ASSIGNED_PERSON);
		createEReference(stakeHolderEClass, STAKE_HOLDER__OWNED_ARTIFACTS);
		createEReference(stakeHolderEClass, STAKE_HOLDER__INVOLVED_ARTIFACTS);
		createEReference(stakeHolderEClass, STAKE_HOLDER__OWNED_TOOLS);
		createEAttribute(stakeHolderEClass, STAKE_HOLDER__LAYOUT);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__META_MODEL);
		createEReference(modelEClass, MODEL__INCLUDES);
		createEReference(modelEClass, MODEL__IS_INCLUDED_IN);
		createEReference(modelEClass, MODEL__MANDATORY_ELEMENTS);
		createEReference(modelEClass, MODEL__MANDATORY_ATTRIBUTES);
		createEReference(modelEClass, MODEL__MANDATORY_ASSOCIATIONS);
		createEReference(modelEClass, MODEL__OPTIONAL_ELEMENTS);
		createEReference(modelEClass, MODEL__OPTIONAL_ATTRIBUTES);
		createEReference(modelEClass, MODEL__OPTIONAL_ASSOCIATIONS);

		processModuleEClass = createEClass(PROCESS_MODULE);
		createEReference(processModuleEClass, PROCESS_MODULE__REQUIREMENTS);
		createEReference(processModuleEClass, PROCESS_MODULE__SUB_PROCESS_MODULES);
		createEReference(processModuleEClass, PROCESS_MODULE__INPUT_ARTIFACTS);
		createEReference(processModuleEClass, PROCESS_MODULE__TOOLS);
		createEReference(processModuleEClass, PROCESS_MODULE__BEFORE_PROCESS_MODULES);
		createEReference(processModuleEClass, PROCESS_MODULE__AFTER_PROCESS_MODULES);
		createEReference(processModuleEClass, PROCESS_MODULE__INVOLVED_STAKE_HOLDERS);
		createEReference(processModuleEClass, PROCESS_MODULE__PRE_MM_CONDITION);
		createEReference(processModuleEClass, PROCESS_MODULE__POST_MM_CONDITION);
		createEReference(processModuleEClass, PROCESS_MODULE__OUTPUT_ARTIFACTS);
		createEAttribute(processModuleEClass, PROCESS_MODULE__URI);
		createEReference(processModuleEClass, PROCESS_MODULE__PARAMETERS);
		createEReference(processModuleEClass, PROCESS_MODULE__BINDINGS);
		createEAttribute(processModuleEClass, PROCESS_MODULE__NUMBER_OF_INSTANCES);
		createEAttribute(processModuleEClass, PROCESS_MODULE__EFFORT);
		createEAttribute(processModuleEClass, PROCESS_MODULE__PROGRESS);
		createEAttribute(processModuleEClass, PROCESS_MODULE__PLANNED_START_DATE);
		createEAttribute(processModuleEClass, PROCESS_MODULE__PLANNED_END_DATE);
		createEAttribute(processModuleEClass, PROCESS_MODULE__END_DATE);
		createEReference(processModuleEClass, PROCESS_MODULE__SUB_PROCESS_MODULE_REFERENCES);
		createEReference(processModuleEClass, PROCESS_MODULE__INSTANCE_OF_PROCESS_MODULE);
		createEReference(processModuleEClass, PROCESS_MODULE__INSTANTIATED_IN_PROCESS_MODULES);
		createEReference(processModuleEClass, PROCESS_MODULE__COMPLIANCES);
		createEReference(processModuleEClass, PROCESS_MODULE__STAKE_HOLDER);
		createEReference(processModuleEClass, PROCESS_MODULE__CLAIMED_COMPLIANCE_REQUIREMENTS);
		createEAttribute(processModuleEClass, PROCESS_MODULE__STATUS);
		createEReference(processModuleEClass, PROCESS_MODULE__PARAMETER_REFERENCES);
		createEReference(processModuleEClass, PROCESS_MODULE__DETERMINED_VARIABLES);
		createEAttribute(processModuleEClass, PROCESS_MODULE__LAYOUT);
		createEReference(processModuleEClass, PROCESS_MODULE__ARTIFACTS);
		createEReference(processModuleEClass, PROCESS_MODULE__STAKE_HOLDERS);
		createEReference(processModuleEClass, PROCESS_MODULE__TYPES);

		requirementEClass = createEClass(REQUIREMENT);
		createEReference(requirementEClass, REQUIREMENT__SUB_REQUIREMENTS);
		createEReference(requirementEClass, REQUIREMENT__REQUIRED_REQUIREMENTS);
		createEReference(requirementEClass, REQUIREMENT__REQUIRED_BY_REQUIREMENTS);
		createEAttribute(requirementEClass, REQUIREMENT__RECOMMENTED_FROM);
		createEAttribute(requirementEClass, REQUIREMENT__RECOMMENTED_TO);
		createEReference(requirementEClass, REQUIREMENT__COMPLIANCES);
		createEReference(requirementEClass, REQUIREMENT__CLAIMING_PROCESS_MODULES);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__DOCUMENT_STATUS);
		createEAttribute(artifactEClass, ARTIFACT__VERSION);
		createEReference(artifactEClass, ARTIFACT__READ_BY_PROCESS_MODULES);
		createEReference(artifactEClass, ARTIFACT__PROCESS_CONDITIONS);
		createEReference(artifactEClass, ARTIFACT__CREATED_BY_PROCESS_MODULES);
		createEReference(artifactEClass, ARTIFACT__SUB_ARTIFACTS);
		createEReference(artifactEClass, ARTIFACT__SUB_ARTIFACT_REFERENCES);
		createEReference(artifactEClass, ARTIFACT__COMPLIANCES);
		createEReference(artifactEClass, ARTIFACT__INVOLVED_STAKE_HOLDERS);
		createEReference(artifactEClass, ARTIFACT__STAKE_HOLDER);
		createEAttribute(artifactEClass, ARTIFACT__PATH);
		createEAttribute(artifactEClass, ARTIFACT__STATUS);
		createEAttribute(artifactEClass, ARTIFACT__PART_OF_PRODUCT);
		createEReference(artifactEClass, ARTIFACT__REFERED_BY_ARTIFACTS);
		createEAttribute(artifactEClass, ARTIFACT__PROJECT_INPUT);
		createEAttribute(artifactEClass, ARTIFACT__LAYOUT);

		alternativeEClass = createEClass(ALTERNATIVE);
		createEReference(alternativeEClass, ALTERNATIVE__PROCESS_MODULES);
		createEReference(alternativeEClass, ALTERNATIVE__CONDITION);

		parallelEClass = createEClass(PARALLEL);
		createEReference(parallelEClass, PARALLEL__PROCESS_MODULES);

		methodEClass = createEClass(METHOD);
		createEReference(methodEClass, METHOD__TOOLS);

		iVerifiedEClass = createEClass(IVERIFIED);
		createEReference(iVerifiedEClass, IVERIFIED__VERIFIED_BY);

		iVerifierEClass = createEClass(IVERIFIER);
		createEReference(iVerifierEClass, IVERIFIER__VERIFIES);

		complianceEClass = createEClass(COMPLIANCE);
		createEReference(complianceEClass, COMPLIANCE__PROCESS_MODULES);
		createEReference(complianceEClass, COMPLIANCE__STAKE_HOLDERS);
		createEReference(complianceEClass, COMPLIANCE__VERIFICATION_MODULES);
		createEReference(complianceEClass, COMPLIANCE__ARTIFATCS);
		createEReference(complianceEClass, COMPLIANCE__SUB_COMPLIANCES);
		createEAttribute(complianceEClass, COMPLIANCE__APPLICABLE);

		verificationModuleEClass = createEClass(VERIFICATION_MODULE);
		createEReference(verificationModuleEClass, VERIFICATION_MODULE__VERIFIED_COMPLIANCES);
		createEAttribute(verificationModuleEClass, VERIFICATION_MODULE__IMPLICIT);
		createEReference(verificationModuleEClass, VERIFICATION_MODULE__CRITERIA);

		requiredDocumentEClass = createEClass(REQUIRED_DOCUMENT);
		createEReference(requiredDocumentEClass, REQUIRED_DOCUMENT__ARTIFACTS);

		criterionEClass = createEClass(CRITERION);

		// Create enums
		processStatusEEnum = createEEnum(PROCESS_STATUS);
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
		ModellDescrPackage theModellDescrPackage = (ModellDescrPackage)EPackage.Registry.INSTANCE.getEPackage(ModellDescrPackage.eNS_URI);
		TermsPackage theTermsPackage = (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		processEClass.getESuperTypes().add(theSuptertypePackage.getNamed());
		toolEClass.getESuperTypes().add(theSuptertypePackage.getVariantable());
		stakeHolderEClass.getESuperTypes().add(theSuptertypePackage.getVariantable());
		modelEClass.getESuperTypes().add(this.getArtifact());
		processModuleEClass.getESuperTypes().add(theSuptertypePackage.getVariantable());
		processModuleEClass.getESuperTypes().add(this.getIVerified());
		processModuleEClass.getESuperTypes().add(this.getIVerifier());
		requirementEClass.getESuperTypes().add(theSuptertypePackage.getVariantable());
		requirementEClass.getESuperTypes().add(this.getIVerified());
		artifactEClass.getESuperTypes().add(theSuptertypePackage.getVariantable());
		artifactEClass.getESuperTypes().add(this.getIVerified());
		alternativeEClass.getESuperTypes().add(theSuptertypePackage.getNamed());
		alternativeEClass.getESuperTypes().add(this.getProcessModule());
		parallelEClass.getESuperTypes().add(theSuptertypePackage.getNamed());
		parallelEClass.getESuperTypes().add(this.getProcessModule());
		methodEClass.getESuperTypes().add(theSuptertypePackage.getVariantable());
		complianceEClass.getESuperTypes().add(theSuptertypePackage.getVariantable());
		verificationModuleEClass.getESuperTypes().add(this.getProcessModule());
		requiredDocumentEClass.getESuperTypes().add(this.getRequirement());
		criterionEClass.getESuperTypes().add(theSuptertypePackage.getVariantable());

		// Initialize classes, features, and operations; add parameters
		initEClass(processEClass, metaModel.referenceProcess.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_Tools(), this.getTool(), null, "tools", null, 0, -1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Methods(), this.getMethod(), null, "methods", null, 0, -1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_ProcessModules(), this.getProcessModule(), null, "processModules", null, 0, -1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_StakeHolders(), this.getStakeHolder(), null, "stakeHolders", null, 0, -1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_ProcessConditions(), theModellDescrPackage.getProzessCondition(), null, "processConditions", null, 0, -1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Parameters(), theTermsPackage.getParameter(), null, "Parameters", null, 0, -1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Bindings(), theTermsPackage.getBinding(), null, "Bindings", null, 0, -1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Types(), theTermsPackage.getType(), null, "Types", null, 0, -1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_MaximalSafetyLevel(), theSuptertypePackage.getSafetyLevel(), "MaximalSafetyLevel", "ASIL_D", 0, 1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Preferences(), theSuptertypePackage.getPreference(), null, "preferences", null, 0, -1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_FilterScope(), this.getProcessModule(), null, "filterScope", null, 0, -1, metaModel.referenceProcess.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTool_ProcessModules(), this.getProcessModule(), this.getProcessModule_Tools(), "processModules", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Methods(), this.getMethod(), this.getMethod_Tools(), "Methods", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_MetaModel(), theModellDescrPackage.getMetaModel(), theModellDescrPackage.getMetaModel_Tool(), "MetaModel", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_PreliminaryClassification(), ecorePackage.getEString(), "PreliminaryClassification", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_ClassificationExplanation(), ecorePackage.getEString(), "ClassificationExplanation", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_ToolOwner(), this.getStakeHolder(), this.getStakeHolder_OwnedTools(), "ToolOwner", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stakeHolderEClass, StakeHolder.class, "StakeHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStakeHolder_OwnedModules(), this.getProcessModule(), this.getProcessModule_StakeHolder(), "OwnedModules", null, 0, -1, StakeHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStakeHolder_InvolvedModules(), this.getProcessModule(), this.getProcessModule_InvolvedStakeHolders(), "InvolvedModules", null, 0, -1, StakeHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStakeHolder_Compliances(), this.getCompliance(), this.getCompliance_StakeHolders(), "Compliances", null, 0, -1, StakeHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStakeHolder_AssignedPerson(), ecorePackage.getEString(), "AssignedPerson", null, 0, 1, StakeHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStakeHolder_OwnedArtifacts(), this.getArtifact(), this.getArtifact_StakeHolder(), "OwnedArtifacts", null, 0, -1, StakeHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStakeHolder_InvolvedArtifacts(), this.getArtifact(), this.getArtifact_InvolvedStakeHolders(), "InvolvedArtifacts", null, 0, -1, StakeHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStakeHolder_OwnedTools(), this.getTool(), this.getTool_ToolOwner(), "OwnedTools", null, 0, -1, StakeHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStakeHolder_Layout(), theSuptertypePackage.getLayout(), "Layout", "TOP_BOTTOM", 0, 1, StakeHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_MetaModel(), theModellDescrPackage.getMetaModel(), null, "MetaModel", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Includes(), this.getModel(), this.getModel_IsIncludedIn(), "Includes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_IsIncludedIn(), this.getModel(), this.getModel_Includes(), "IsIncludedIn", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_MandatoryElements(), theModellDescrPackage.getMetaModelElement(), theModellDescrPackage.getMetaModelElement_MandatoryInModels(), "MandatoryElements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_MandatoryAttributes(), theModellDescrPackage.getMetaModelAttribute(), theModellDescrPackage.getMetaModelAttribute_MandatoryInModels(), "MandatoryAttributes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_MandatoryAssociations(), theModellDescrPackage.getMetaModelAssociation(), theModellDescrPackage.getMetaModelAssociation_MandatoryInModels(), "MandatoryAssociations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_OptionalElements(), theModellDescrPackage.getMetaModelElement(), theModellDescrPackage.getMetaModelElement_OptionalInModels(), "OptionalElements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_OptionalAttributes(), theModellDescrPackage.getMetaModelAttribute(), theModellDescrPackage.getMetaModelAttribute_OptionalInModels(), "OptionalAttributes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_OptionalAssociations(), theModellDescrPackage.getMetaModelAssociation(), theModellDescrPackage.getMetaModelAssociation_OptionalInModels(), "OptionalAssociations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processModuleEClass, ProcessModule.class, "ProcessModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessModule_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_SubProcessModules(), this.getProcessModule(), null, "subProcessModules", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_InputArtifacts(), this.getArtifact(), this.getArtifact_ReadByProcessModules(), "inputArtifacts", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_Tools(), this.getTool(), this.getTool_ProcessModules(), "tools", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_BeforeProcessModules(), this.getProcessModule(), this.getProcessModule_AfterProcessModules(), "beforeProcessModules", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_AfterProcessModules(), this.getProcessModule(), this.getProcessModule_BeforeProcessModules(), "afterProcessModules", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_InvolvedStakeHolders(), this.getStakeHolder(), this.getStakeHolder_InvolvedModules(), "InvolvedStakeHolders", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_PreMMCondition(), theModellDescrPackage.getMMCondition(), null, "preMMCondition", null, 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_PostMMCondition(), theModellDescrPackage.getMMCondition(), null, "postMMCondition", null, 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_OutputArtifacts(), this.getArtifact(), this.getArtifact_CreatedByProcessModules(), "outputArtifacts", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessModule_URI(), ecorePackage.getEString(), "URI", null, 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_Parameters(), theTermsPackage.getParameter(), null, "parameters", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_Bindings(), theTermsPackage.getBinding(), null, "bindings", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessModule_NumberOfInstances(), ecorePackage.getEInt(), "NumberOfInstances", null, 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessModule_Effort(), ecorePackage.getEFloat(), "Effort", null, 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessModule_Progress(), ecorePackage.getEFloat(), "Progress", null, 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessModule_PlannedStartDate(), theXMLTypePackage.getString(), "PlannedStartDate", null, 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessModule_PlannedEndDate(), ecorePackage.getEString(), "PlannedEndDate", null, 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessModule_EndDate(), ecorePackage.getEString(), "EndDate", null, 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_SubProcessModuleReferences(), this.getProcessModule(), null, "SubProcessModuleReferences", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_InstanceOfProcessModule(), this.getProcessModule(), this.getProcessModule_InstantiatedInProcessModules(), "InstanceOfProcessModule", null, 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_InstantiatedInProcessModules(), this.getProcessModule(), this.getProcessModule_InstanceOfProcessModule(), "InstantiatedInProcessModules", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_Compliances(), this.getCompliance(), this.getCompliance_ProcessModules(), "Compliances", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_StakeHolder(), this.getStakeHolder(), this.getStakeHolder_OwnedModules(), "StakeHolder", null, 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_ClaimedComplianceRequirements(), this.getRequirement(), this.getRequirement_ClaimingProcessModules(), "ClaimedComplianceRequirements", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessModule_Status(), this.getProcessStatus(), "Status", null, 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_ParameterReferences(), theTermsPackage.getParameter(), theTermsPackage.getParameter_ReusingProcessModules(), "parameterReferences", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_DeterminedVariables(), theTermsPackage.getProcessVariable(), theTermsPackage.getProcessVariable_DeterminedByProcessModules(), "DeterminedVariables", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessModule_Layout(), theSuptertypePackage.getLayout(), "Layout", "TOP_BOTTOM", 0, 1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_StakeHolders(), this.getStakeHolder(), null, "stakeHolders", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModule_Types(), theTermsPackage.getType(), null, "Types", null, 0, -1, ProcessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirement_SubRequirements(), this.getRequirement(), null, "subRequirements", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_RequiredRequirements(), this.getRequirement(), this.getRequirement_RequiredByRequirements(), "requiredRequirements", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_RequiredByRequirements(), this.getRequirement(), this.getRequirement_RequiredRequirements(), "requiredByRequirements", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_RecommentedFrom(), theSuptertypePackage.getSafetyLevel(), "recommentedFrom", "ASIL_A", 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_RecommentedTo(), theSuptertypePackage.getSafetyLevel(), "recommentedTo", "ASIL_D", 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Compliances(), this.getCompliance(), null, "Compliances", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_ClaimingProcessModules(), this.getProcessModule(), this.getProcessModule_ClaimedComplianceRequirements(), "ClaimingProcessModules", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_DocumentStatus(), ecorePackage.getEString(), "documentStatus", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Version(), ecorePackage.getEString(), "version", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_ReadByProcessModules(), this.getProcessModule(), this.getProcessModule_InputArtifacts(), "readByProcessModules", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_ProcessConditions(), theModellDescrPackage.getProzessCondition(), theModellDescrPackage.getProzessCondition_Artefakt(), "processConditions", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_CreatedByProcessModules(), this.getProcessModule(), this.getProcessModule_OutputArtifacts(), "createdByProcessModules", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_SubArtifacts(), this.getArtifact(), null, "SubArtifacts", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_SubArtifactReferences(), this.getArtifact(), this.getArtifact_ReferedByArtifacts(), "SubArtifactReferences", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Compliances(), this.getCompliance(), this.getCompliance_Artifatcs(), "Compliances", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_InvolvedStakeHolders(), this.getStakeHolder(), this.getStakeHolder_InvolvedArtifacts(), "InvolvedStakeHolders", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_StakeHolder(), this.getStakeHolder(), this.getStakeHolder_OwnedArtifacts(), "StakeHolder", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Path(), ecorePackage.getEString(), "Path", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Status(), this.getProcessStatus(), "Status", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_PartOfProduct(), ecorePackage.getEBoolean(), "PartOfProduct", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_ReferedByArtifacts(), this.getArtifact(), this.getArtifact_SubArtifactReferences(), "ReferedByArtifacts", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_ProjectInput(), ecorePackage.getEBoolean(), "ProjectInput", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Layout(), theSuptertypePackage.getLayout(), "Layout", "TOP_BOTTOM", 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternative_ProcessModules(), this.getProcessModule(), null, "processModules", null, 0, -1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlternative_Condition(), theTermsPackage.getBoolTerm(), null, "Condition", null, 0, 1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallel_ProcessModules(), this.getProcessModule(), null, "processModules", null, 0, -1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethod_Tools(), this.getTool(), this.getTool_Methods(), "Tools", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iVerifiedEClass, IVerified.class, "IVerified", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIVerified_VerifiedBy(), this.getIVerifier(), this.getIVerifier_Verifies(), "verifiedBy", null, 0, -1, IVerified.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iVerifierEClass, IVerifier.class, "IVerifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIVerifier_Verifies(), this.getIVerified(), this.getIVerified_VerifiedBy(), "verifies", null, 0, -1, IVerifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complianceEClass, Compliance.class, "Compliance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompliance_ProcessModules(), this.getProcessModule(), this.getProcessModule_Compliances(), "ProcessModules", null, 0, -1, Compliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompliance_StakeHolders(), this.getStakeHolder(), this.getStakeHolder_Compliances(), "StakeHolders", null, 0, -1, Compliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompliance_VerificationModules(), this.getVerificationModule(), this.getVerificationModule_VerifiedCompliances(), "VerificationModules", null, 0, -1, Compliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompliance_Artifatcs(), this.getArtifact(), this.getArtifact_Compliances(), "Artifatcs", null, 0, -1, Compliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompliance_SubCompliances(), this.getCompliance(), null, "SubCompliances", null, 0, -1, Compliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompliance_Applicable(), theXMLTypePackage.getBoolean(), "Applicable", "true", 0, 1, Compliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verificationModuleEClass, VerificationModule.class, "VerificationModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerificationModule_VerifiedCompliances(), this.getCompliance(), this.getCompliance_VerificationModules(), "VerifiedCompliances", null, 0, -1, VerificationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerificationModule_Implicit(), ecorePackage.getEBoolean(), "Implicit", null, 0, 1, VerificationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerificationModule_Criteria(), this.getCriterion(), null, "Criteria", null, 0, -1, VerificationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredDocumentEClass, RequiredDocument.class, "RequiredDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredDocument_Artifacts(), this.getArtifact(), null, "Artifacts", null, 0, -1, RequiredDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(criterionEClass, Criterion.class, "Criterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(processStatusEEnum, ProcessStatus.class, "ProcessStatus");
		addEEnumLiteral(processStatusEEnum, ProcessStatus.DEFINED);
		addEEnumLiteral(processStatusEEnum, ProcessStatus.PLANNED);
		addEEnumLiteral(processStatusEEnum, ProcessStatus.READY);
		addEEnumLiteral(processStatusEEnum, ProcessStatus.IN_PROGRESS);
		addEEnumLiteral(processStatusEEnum, ProcessStatus.DONE);

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
		  (toolEClass,
		   source,
		   new String[] {
			   "constraints", "ToolUsedInProcess"
		   });
		addAnnotation
		  (modelEClass,
		   source,
		   new String[] {
			   "constraints", "MMConsistent MMConsistentIncluded MMAttributesInElements MMAssociationsInElements"
		   });
		addAnnotation
		  (processModuleEClass,
		   source,
		   new String[] {
			   "constraints", "CycleCheck InputArtifacts OutputArtifacts HasOrInheritStakeHolder InterfaceCheck"
		   });
		addAnnotation
		  (requirementEClass,
		   source,
		   new String[] {
			   "constraints", "CycleCheck"
		   });
		addAnnotation
		  (artifactEClass,
		   source,
		   new String[] {
			   "constraints", "CycleCheck PathCheck ReadCheck WriteCheck ReadOrWriteCheck HasOrInheritStakeHolder"
		   });
		addAnnotation
		  (complianceEClass,
		   source,
		   new String[] {
			   "constraints", "VandVLinks ProcessLinks NAnoLinks"
		   });
		addAnnotation
		  (verificationModuleEClass,
		   source,
		   new String[] {
			   "constraints", "VerifiesExactOneInput IsUsedInCompliances HasCriterion"
		   });
	}

} //ReferenceProcessPackageImpl
