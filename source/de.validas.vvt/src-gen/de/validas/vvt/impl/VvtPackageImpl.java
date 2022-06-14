/**
 */
package de.validas.vvt.impl;

import de.validas.vvt.Artifact;
import de.validas.vvt.Check;
import de.validas.vvt.CheckResult;
import de.validas.vvt.CheckStatus;
import de.validas.vvt.Described;
import de.validas.vvt.Instance;
import de.validas.vvt.Issue;
import de.validas.vvt.Parameter;
import de.validas.vvt.ParameterValue;
import de.validas.vvt.Person;
import de.validas.vvt.Project;
import de.validas.vvt.Repository;
import de.validas.vvt.Severity;
import de.validas.vvt.VvtFactory;
import de.validas.vvt.VvtPackage;

import de.validas.vvt.util.VvtValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class VvtPackageImpl extends EPackageImpl implements VvtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

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
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

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
	private EClass parameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum checkStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityEEnum = null;

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
	 * @see de.validas.vvt.VvtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VvtPackageImpl() {
		super(eNS_URI, VvtFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VvtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VvtPackage init() {
		if (isInited)
			return (VvtPackage) EPackage.Registry.INSTANCE.getEPackage(VvtPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVvtPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VvtPackageImpl theVvtPackage = registeredVvtPackage instanceof VvtPackageImpl
				? (VvtPackageImpl) registeredVvtPackage
				: new VvtPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVvtPackage.createPackageContents();

		// Initialize created meta-data
		theVvtPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theVvtPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return VvtValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theVvtPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VvtPackage.eNS_URI, theVvtPackage);
		return theVvtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Checks() {
		return (EReference) projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Repository() {
		return (EReference) projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Persons() {
		return (EReference) projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Artifacts() {
		return (EReference) projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Parameter() {
		return (EReference) projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Verdict() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Issues() {
		return (EReference) projectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_IssueTracker() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Product() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Version() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescribed() {
		return describedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescribed_Name() {
		return (EAttribute) describedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescribed_Description() {
		return (EAttribute) describedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescribed_LongDescription() {
		return (EAttribute) describedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescribed_Comment() {
		return (EAttribute) describedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescribed_Id() {
		return (EAttribute) describedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheck() {
		return checkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheck_CheckResults() {
		return (EReference) checkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheck_Verdict() {
		return (EAttribute) checkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheck_CheckedArtifact() {
		return (EReference) checkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheck_RequiredArtifacts() {
		return (EReference) checkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheck_Author() {
		return (EReference) checkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheck_Instances() {
		return (EReference) checkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheck_Parameters() {
		return (EReference) checkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheck_SubChecks() {
		return (EReference) checkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheck_Implicit() {
		return (EAttribute) checkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_FullName() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getArtifact_Path() {
		return (EAttribute) artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Modified() {
		return (EAttribute) artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_Repository() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_Devleopers() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Revision() {
		return (EAttribute) artifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepository_URL() {
		return (EAttribute) repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckResult() {
		return checkResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckResult_Verdict() {
		return (EAttribute) checkResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckResult_TimeStamp() {
		return (EAttribute) checkResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckResult_ArtifactRevisionOrDate() {
		return (EAttribute) checkResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckResult_Justification() {
		return (EAttribute) checkResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckResult_Instances() {
		return (EReference) checkResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckResult_Issues() {
		return (EReference) checkResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckResult_Author() {
		return (EReference) checkResultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstance_Parameter() {
		return (EReference) instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstance_ParameterValue() {
		return (EReference) instanceEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getParameter_Type() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_ParameterValues() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterValue() {
		return parameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterValue_Value() {
		return (EAttribute) parameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssue() {
		return issueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Link() {
		return (EAttribute) issueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Workaround() {
		return (EAttribute) issueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_FoundInRevisionOrDate() {
		return (EAttribute) issueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_FixedInRevisionOrDate() {
		return (EAttribute) issueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Artifact() {
		return (EReference) issueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Severity() {
		return (EAttribute) issueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCheckStatus() {
		return checkStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VvtFactory getVvtFactory() {
		return (VvtFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__CHECKS);
		createEReference(projectEClass, PROJECT__REPOSITORY);
		createEReference(projectEClass, PROJECT__PERSONS);
		createEReference(projectEClass, PROJECT__ARTIFACTS);
		createEReference(projectEClass, PROJECT__PARAMETER);
		createEAttribute(projectEClass, PROJECT__VERDICT);
		createEReference(projectEClass, PROJECT__ISSUES);
		createEAttribute(projectEClass, PROJECT__ISSUE_TRACKER);
		createEAttribute(projectEClass, PROJECT__PRODUCT);
		createEAttribute(projectEClass, PROJECT__VERSION);

		describedEClass = createEClass(DESCRIBED);
		createEAttribute(describedEClass, DESCRIBED__NAME);
		createEAttribute(describedEClass, DESCRIBED__DESCRIPTION);
		createEAttribute(describedEClass, DESCRIBED__LONG_DESCRIPTION);
		createEAttribute(describedEClass, DESCRIBED__COMMENT);
		createEAttribute(describedEClass, DESCRIBED__ID);

		checkEClass = createEClass(CHECK);
		createEReference(checkEClass, CHECK__CHECK_RESULTS);
		createEAttribute(checkEClass, CHECK__VERDICT);
		createEReference(checkEClass, CHECK__CHECKED_ARTIFACT);
		createEReference(checkEClass, CHECK__REQUIRED_ARTIFACTS);
		createEReference(checkEClass, CHECK__AUTHOR);
		createEReference(checkEClass, CHECK__INSTANCES);
		createEReference(checkEClass, CHECK__PARAMETERS);
		createEReference(checkEClass, CHECK__SUB_CHECKS);
		createEAttribute(checkEClass, CHECK__IMPLICIT);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FULL_NAME);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__PATH);
		createEAttribute(artifactEClass, ARTIFACT__MODIFIED);
		createEReference(artifactEClass, ARTIFACT__REPOSITORY);
		createEReference(artifactEClass, ARTIFACT__DEVLEOPERS);
		createEAttribute(artifactEClass, ARTIFACT__REVISION);

		repositoryEClass = createEClass(REPOSITORY);
		createEAttribute(repositoryEClass, REPOSITORY__URL);

		checkResultEClass = createEClass(CHECK_RESULT);
		createEAttribute(checkResultEClass, CHECK_RESULT__VERDICT);
		createEAttribute(checkResultEClass, CHECK_RESULT__TIME_STAMP);
		createEAttribute(checkResultEClass, CHECK_RESULT__ARTIFACT_REVISION_OR_DATE);
		createEAttribute(checkResultEClass, CHECK_RESULT__JUSTIFICATION);
		createEReference(checkResultEClass, CHECK_RESULT__INSTANCES);
		createEReference(checkResultEClass, CHECK_RESULT__ISSUES);
		createEReference(checkResultEClass, CHECK_RESULT__AUTHOR);

		instanceEClass = createEClass(INSTANCE);
		createEReference(instanceEClass, INSTANCE__PARAMETER);
		createEReference(instanceEClass, INSTANCE__PARAMETER_VALUE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEReference(parameterEClass, PARAMETER__PARAMETER_VALUES);

		parameterValueEClass = createEClass(PARAMETER_VALUE);
		createEAttribute(parameterValueEClass, PARAMETER_VALUE__VALUE);

		issueEClass = createEClass(ISSUE);
		createEAttribute(issueEClass, ISSUE__LINK);
		createEAttribute(issueEClass, ISSUE__WORKAROUND);
		createEAttribute(issueEClass, ISSUE__FOUND_IN_REVISION_OR_DATE);
		createEAttribute(issueEClass, ISSUE__FIXED_IN_REVISION_OR_DATE);
		createEReference(issueEClass, ISSUE__ARTIFACT);
		createEAttribute(issueEClass, ISSUE__SEVERITY);

		// Create enums
		checkStatusEEnum = createEEnum(CHECK_STATUS);
		severityEEnum = createEEnum(SEVERITY);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		projectEClass.getESuperTypes().add(this.getDescribed());
		checkEClass.getESuperTypes().add(this.getDescribed());
		personEClass.getESuperTypes().add(this.getDescribed());
		artifactEClass.getESuperTypes().add(this.getDescribed());
		repositoryEClass.getESuperTypes().add(this.getDescribed());
		checkResultEClass.getESuperTypes().add(this.getDescribed());
		parameterEClass.getESuperTypes().add(this.getDescribed());
		issueEClass.getESuperTypes().add(this.getDescribed());

		// Initialize classes, features, and operations; add parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Checks(), this.getCheck(), null, "checks", null, 0, -1, Project.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getProject_Repository(), this.getRepository(), null, "repository", null, 0, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Persons(), this.getPerson(), null, "persons", null, 0, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Verdict(), this.getCheckStatus(), "verdict", null, 0, 1, Project.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Issues(), this.getIssue(), null, "issues", null, 0, -1, Project.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getProject_IssueTracker(), ecorePackage.getEString(), "IssueTracker", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Product(), ecorePackage.getEString(), "product", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Version(), ecorePackage.getEString(), "version", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(describedEClass, Described.class, "Described", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribed_Name(), ecorePackage.getEString(), "name", null, 0, 1, Described.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescribed_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Described.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescribed_LongDescription(), ecorePackage.getEString(), "longDescription", null, 0, 1,
				Described.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescribed_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Described.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescribed_Id(), ecorePackage.getEString(), "id", null, 0, 1, Described.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkEClass, Check.class, "Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheck_CheckResults(), this.getCheckResult(), null, "checkResults", null, 0, -1, Check.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheck_Verdict(), this.getCheckStatus(), "verdict", null, 0, 1, Check.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheck_CheckedArtifact(), this.getArtifact(), null, "checkedArtifact", null, 0, 1, Check.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheck_RequiredArtifacts(), this.getArtifact(), null, "requiredArtifacts", null, 0, -1,
				Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheck_Author(), this.getPerson(), null, "author", null, 0, -1, Check.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCheck_Instances(), this.getInstance(), null, "instances", null, 0, -1, Check.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheck_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Check.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheck_SubChecks(), this.getCheck(), null, "subChecks", null, 0, -1, Check.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheck_Implicit(), ecorePackage.getEBoolean(), "implicit", null, 0, 1, Check.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_Path(), ecorePackage.getEString(), "path", null, 0, 1, Artifact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Modified(), ecorePackage.getEString(), "modified", null, 0, 1, Artifact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Repository(), this.getRepository(), null, "repository", null, 0, 1, Artifact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Devleopers(), this.getPerson(), null, "devleopers", null, 0, -1, Artifact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Revision(), ecorePackage.getEString(), "revision", null, 0, 1, Artifact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepository_URL(), ecorePackage.getEString(), "URL", null, 0, 1, Repository.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkResultEClass, CheckResult.class, "CheckResult", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckResult_Verdict(), this.getCheckStatus(), "verdict", null, 0, 1, CheckResult.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckResult_TimeStamp(), ecorePackage.getEString(), "timeStamp", null, 0, 1,
				CheckResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckResult_ArtifactRevisionOrDate(), ecorePackage.getEString(), "artifactRevisionOrDate",
				null, 0, 1, CheckResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckResult_Justification(), ecorePackage.getEString(), "justification", null, 0, 1,
				CheckResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCheckResult_Instances(), this.getInstance(), null, "instances", null, 0, -1,
				CheckResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckResult_Issues(), this.getIssue(), null, "issues", null, 0, -1, CheckResult.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckResult_Author(), this.getPerson(), null, "author", null, 0, 1, CheckResult.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstance_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, Instance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstance_ParameterValue(), this.getParameterValue(), null, "parameterValue", null, 0, 1,
				Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "Type", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_ParameterValues(), this.getParameterValue(), null, "parameterValues", null, 0, -1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ParameterValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issueEClass, Issue.class, "Issue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssue_Link(), ecorePackage.getEString(), "link", null, 0, 1, Issue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Workaround(), ecorePackage.getEString(), "workaround", null, 0, 1, Issue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_FoundInRevisionOrDate(), ecorePackage.getEString(), "foundInRevisionOrDate", null, 0, 1,
				Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getIssue_FixedInRevisionOrDate(), ecorePackage.getEString(), "fixedInRevisionOrDate", null, 0, 1,
				Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getIssue_Artifact(), this.getArtifact(), null, "artifact", null, 0, 1, Issue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Severity(), this.getSeverity(), "Severity", "MAJOR", 0, 1, Issue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(checkStatusEEnum, CheckStatus.class, "CheckStatus");
		addEEnumLiteral(checkStatusEEnum, CheckStatus.CREATED);
		addEEnumLiteral(checkStatusEEnum, CheckStatus.ASSIGNED);
		addEEnumLiteral(checkStatusEEnum, CheckStatus.FAILED);
		addEEnumLiteral(checkStatusEEnum, CheckStatus.ANALYZED);
		addEEnumLiteral(checkStatusEEnum, CheckStatus.PASSED);
		addEEnumLiteral(checkStatusEEnum, CheckStatus.UPDATED_FROM_FAILED);
		addEEnumLiteral(checkStatusEEnum, CheckStatus.UPDATED_FROM_PASSED);
		addEEnumLiteral(checkStatusEEnum, CheckStatus.UPDATED_FROM_ANALYZED);

		initEEnum(severityEEnum, Severity.class, "Severity");
		addEEnumLiteral(severityEEnum, Severity.BLOCKER);
		addEEnumLiteral(severityEEnum, Severity.CRITICAL);
		addEEnumLiteral(severityEEnum, Severity.MAJOR);
		addEEnumLiteral(severityEEnum, Severity.MINOR);

		// Create resource
		createResource(eNS_URI);

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
		addAnnotation(projectEClass, source, new String[] { "constraints", "RepositorySpecified VerdictOK" });
		addAnnotation(describedEClass, source, new String[] { "constraints", "DescriptionOK nameUnique" });
		addAnnotation(checkEClass, source,
				new String[] { "constraints", "VerdictOK InstancesComplete AuthorOrImplicit ArtifactOrImplicit" });
		addAnnotation(personEClass, source, new String[] { "constraints", "NameGiven" });
		addAnnotation(artifactEClass, source, new String[] { "constraints", "DateOrRevision" });
		addAnnotation(repositoryEClass, source, new String[] { "constraints", "RepositorySpecified" });
		addAnnotation(checkResultEClass, source,
				new String[] { "constraints", "VerdictOK InstancesComplete JustificationPresent DateOK OutDated" });
		addAnnotation(instanceEClass, source, new String[] { "constraints", "ValueOfCorrectParameter" });
		addAnnotation(parameterEClass, source, new String[] { "constraints", "ValuesGiven" });
		addAnnotation(parameterValueEClass, source, new String[] { "constraints", "ValueOK" });
	}

} //VvtPackageImpl
