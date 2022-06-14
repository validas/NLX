/**
 */
package de.validas.vvt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.validas.vvt.VvtFactory
 * @model kind="package"
 * @generated
 */
public interface VvtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vvt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/vvt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vvt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VvtPackage eINSTANCE = de.validas.vvt.impl.VvtPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.validas.vvt.impl.DescribedImpl <em>Described</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.impl.DescribedImpl
	 * @see de.validas.vvt.impl.VvtPackageImpl#getDescribed()
	 * @generated
	 */
	int DESCRIBED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED__LONG_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED__ID = 4;

	/**
	 * The number of structural features of the '<em>Described</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Described</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.validas.vvt.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.impl.ProjectImpl
	 * @see de.validas.vvt.impl.VvtPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = DESCRIBED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = DESCRIBED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LONG_DESCRIPTION = DESCRIBED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__COMMENT = DESCRIBED__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = DESCRIBED__ID;

	/**
	 * The feature id for the '<em><b>Checks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CHECKS = DESCRIBED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REPOSITORY = DESCRIBED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PERSONS = DESCRIBED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ARTIFACTS = DESCRIBED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PARAMETER = DESCRIBED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Verdict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VERDICT = DESCRIBED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ISSUES = DESCRIBED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Issue Tracker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ISSUE_TRACKER = DESCRIBED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PRODUCT = DESCRIBED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VERSION = DESCRIBED_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = DESCRIBED_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = DESCRIBED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.validas.vvt.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.impl.CheckImpl
	 * @see de.validas.vvt.impl.VvtPackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__NAME = DESCRIBED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__DESCRIPTION = DESCRIBED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__LONG_DESCRIPTION = DESCRIBED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__COMMENT = DESCRIBED__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__ID = DESCRIBED__ID;

	/**
	 * The feature id for the '<em><b>Check Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CHECK_RESULTS = DESCRIBED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verdict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__VERDICT = DESCRIBED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Checked Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CHECKED_ARTIFACT = DESCRIBED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__REQUIRED_ARTIFACTS = DESCRIBED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__AUTHOR = DESCRIBED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__INSTANCES = DESCRIBED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__PARAMETERS = DESCRIBED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sub Checks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__SUB_CHECKS = DESCRIBED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Implicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__IMPLICIT = DESCRIBED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = DESCRIBED_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OPERATION_COUNT = DESCRIBED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.validas.vvt.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.impl.PersonImpl
	 * @see de.validas.vvt.impl.VvtPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = DESCRIBED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = DESCRIBED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LONG_DESCRIPTION = DESCRIBED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__COMMENT = DESCRIBED__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = DESCRIBED__ID;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FULL_NAME = DESCRIBED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = DESCRIBED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = DESCRIBED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.validas.vvt.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.impl.ArtifactImpl
	 * @see de.validas.vvt.impl.VvtPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = DESCRIBED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DESCRIPTION = DESCRIBED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__LONG_DESCRIPTION = DESCRIBED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__COMMENT = DESCRIBED__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ID = DESCRIBED__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PATH = DESCRIBED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__MODIFIED = DESCRIBED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__REPOSITORY = DESCRIBED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Devleopers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DEVLEOPERS = DESCRIBED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__REVISION = DESCRIBED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = DESCRIBED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = DESCRIBED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.validas.vvt.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.impl.RepositoryImpl
	 * @see de.validas.vvt.impl.VvtPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = DESCRIBED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DESCRIPTION = DESCRIBED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__LONG_DESCRIPTION = DESCRIBED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COMMENT = DESCRIBED__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ID = DESCRIBED__ID;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__URL = DESCRIBED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = DESCRIBED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = DESCRIBED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.validas.vvt.impl.CheckResultImpl <em>Check Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.impl.CheckResultImpl
	 * @see de.validas.vvt.impl.VvtPackageImpl#getCheckResult()
	 * @generated
	 */
	int CHECK_RESULT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT__NAME = DESCRIBED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT__DESCRIPTION = DESCRIBED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT__LONG_DESCRIPTION = DESCRIBED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT__COMMENT = DESCRIBED__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT__ID = DESCRIBED__ID;

	/**
	 * The feature id for the '<em><b>Verdict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT__VERDICT = DESCRIBED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT__TIME_STAMP = DESCRIBED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifact Revision Or Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT__ARTIFACT_REVISION_OR_DATE = DESCRIBED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT__JUSTIFICATION = DESCRIBED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT__INSTANCES = DESCRIBED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT__ISSUES = DESCRIBED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT__AUTHOR = DESCRIBED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Check Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT_FEATURE_COUNT = DESCRIBED_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Check Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_RESULT_OPERATION_COUNT = DESCRIBED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.validas.vvt.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.impl.InstanceImpl
	 * @see de.validas.vvt.impl.VvtPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PARAMETER_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.validas.vvt.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.impl.ParameterImpl
	 * @see de.validas.vvt.impl.VvtPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = DESCRIBED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = DESCRIBED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LONG_DESCRIPTION = DESCRIBED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COMMENT = DESCRIBED__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = DESCRIBED__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = DESCRIBED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_VALUES = DESCRIBED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = DESCRIBED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = DESCRIBED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.validas.vvt.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.impl.ParameterValueImpl
	 * @see de.validas.vvt.impl.VvtPackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.validas.vvt.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.impl.IssueImpl
	 * @see de.validas.vvt.impl.VvtPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__NAME = DESCRIBED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = DESCRIBED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LONG_DESCRIPTION = DESCRIBED__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__COMMENT = DESCRIBED__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ID = DESCRIBED__ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LINK = DESCRIBED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workaround</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__WORKAROUND = DESCRIBED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Found In Revision Or Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__FOUND_IN_REVISION_OR_DATE = DESCRIBED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fixed In Revision Or Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__FIXED_IN_REVISION_OR_DATE = DESCRIBED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ARTIFACT = DESCRIBED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SEVERITY = DESCRIBED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = DESCRIBED_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = DESCRIBED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.validas.vvt.CheckStatus <em>Check Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.CheckStatus
	 * @see de.validas.vvt.impl.VvtPackageImpl#getCheckStatus()
	 * @generated
	 */
	int CHECK_STATUS = 11;

	/**
	 * The meta object id for the '{@link de.validas.vvt.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.validas.vvt.Severity
	 * @see de.validas.vvt.impl.VvtPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 12;

	/**
	 * Returns the meta object for class '{@link de.validas.vvt.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see de.validas.vvt.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link de.validas.vvt.Project#getChecks <em>Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checks</em>'.
	 * @see de.validas.vvt.Project#getChecks()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Checks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.validas.vvt.Project#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repository</em>'.
	 * @see de.validas.vvt.Project#getRepository()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.validas.vvt.Project#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see de.validas.vvt.Project#getPersons()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link de.validas.vvt.Project#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see de.validas.vvt.Project#getArtifacts()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.validas.vvt.Project#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see de.validas.vvt.Project#getParameter()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Project#getVerdict <em>Verdict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verdict</em>'.
	 * @see de.validas.vvt.Project#getVerdict()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Verdict();

	/**
	 * Returns the meta object for the containment reference list '{@link de.validas.vvt.Project#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see de.validas.vvt.Project#getIssues()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Issues();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Project#getIssueTracker <em>Issue Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Tracker</em>'.
	 * @see de.validas.vvt.Project#getIssueTracker()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_IssueTracker();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Project#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product</em>'.
	 * @see de.validas.vvt.Project#getProduct()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Product();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Project#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.validas.vvt.Project#getVersion()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Version();

	/**
	 * Returns the meta object for class '{@link de.validas.vvt.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described</em>'.
	 * @see de.validas.vvt.Described
	 * @generated
	 */
	EClass getDescribed();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Described#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.validas.vvt.Described#getName()
	 * @see #getDescribed()
	 * @generated
	 */
	EAttribute getDescribed_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Described#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.validas.vvt.Described#getDescription()
	 * @see #getDescribed()
	 * @generated
	 */
	EAttribute getDescribed_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Described#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Description</em>'.
	 * @see de.validas.vvt.Described#getLongDescription()
	 * @see #getDescribed()
	 * @generated
	 */
	EAttribute getDescribed_LongDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Described#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.validas.vvt.Described#getComment()
	 * @see #getDescribed()
	 * @generated
	 */
	EAttribute getDescribed_Comment();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Described#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.validas.vvt.Described#getId()
	 * @see #getDescribed()
	 * @generated
	 */
	EAttribute getDescribed_Id();

	/**
	 * Returns the meta object for class '{@link de.validas.vvt.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see de.validas.vvt.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for the containment reference list '{@link de.validas.vvt.Check#getCheckResults <em>Check Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check Results</em>'.
	 * @see de.validas.vvt.Check#getCheckResults()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_CheckResults();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Check#getVerdict <em>Verdict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verdict</em>'.
	 * @see de.validas.vvt.Check#getVerdict()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Verdict();

	/**
	 * Returns the meta object for the reference '{@link de.validas.vvt.Check#getCheckedArtifact <em>Checked Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Checked Artifact</em>'.
	 * @see de.validas.vvt.Check#getCheckedArtifact()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_CheckedArtifact();

	/**
	 * Returns the meta object for the reference list '{@link de.validas.vvt.Check#getRequiredArtifacts <em>Required Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Artifacts</em>'.
	 * @see de.validas.vvt.Check#getRequiredArtifacts()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_RequiredArtifacts();

	/**
	 * Returns the meta object for the reference list '{@link de.validas.vvt.Check#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Author</em>'.
	 * @see de.validas.vvt.Check#getAuthor()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link de.validas.vvt.Check#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see de.validas.vvt.Check#getInstances()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_Instances();

	/**
	 * Returns the meta object for the reference list '{@link de.validas.vvt.Check#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see de.validas.vvt.Check#getParameters()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link de.validas.vvt.Check#getSubChecks <em>Sub Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Checks</em>'.
	 * @see de.validas.vvt.Check#getSubChecks()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_SubChecks();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Check#isImplicit <em>Implicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit</em>'.
	 * @see de.validas.vvt.Check#isImplicit()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Implicit();

	/**
	 * Returns the meta object for class '{@link de.validas.vvt.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see de.validas.vvt.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Person#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see de.validas.vvt.Person#getFullName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FullName();

	/**
	 * Returns the meta object for class '{@link de.validas.vvt.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see de.validas.vvt.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Artifact#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.validas.vvt.Artifact#getPath()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Path();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Artifact#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.validas.vvt.Artifact#getModified()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Modified();

	/**
	 * Returns the meta object for the reference '{@link de.validas.vvt.Artifact#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see de.validas.vvt.Artifact#getRepository()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Repository();

	/**
	 * Returns the meta object for the reference list '{@link de.validas.vvt.Artifact#getDevleopers <em>Devleopers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devleopers</em>'.
	 * @see de.validas.vvt.Artifact#getDevleopers()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Devleopers();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Artifact#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see de.validas.vvt.Artifact#getRevision()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Revision();

	/**
	 * Returns the meta object for class '{@link de.validas.vvt.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see de.validas.vvt.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Repository#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see de.validas.vvt.Repository#getURL()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_URL();

	/**
	 * Returns the meta object for class '{@link de.validas.vvt.CheckResult <em>Check Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Result</em>'.
	 * @see de.validas.vvt.CheckResult
	 * @generated
	 */
	EClass getCheckResult();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.CheckResult#getVerdict <em>Verdict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verdict</em>'.
	 * @see de.validas.vvt.CheckResult#getVerdict()
	 * @see #getCheckResult()
	 * @generated
	 */
	EAttribute getCheckResult_Verdict();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.CheckResult#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see de.validas.vvt.CheckResult#getTimeStamp()
	 * @see #getCheckResult()
	 * @generated
	 */
	EAttribute getCheckResult_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.CheckResult#getArtifactRevisionOrDate <em>Artifact Revision Or Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Revision Or Date</em>'.
	 * @see de.validas.vvt.CheckResult#getArtifactRevisionOrDate()
	 * @see #getCheckResult()
	 * @generated
	 */
	EAttribute getCheckResult_ArtifactRevisionOrDate();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.CheckResult#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see de.validas.vvt.CheckResult#getJustification()
	 * @see #getCheckResult()
	 * @generated
	 */
	EAttribute getCheckResult_Justification();

	/**
	 * Returns the meta object for the reference list '{@link de.validas.vvt.CheckResult#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see de.validas.vvt.CheckResult#getInstances()
	 * @see #getCheckResult()
	 * @generated
	 */
	EReference getCheckResult_Instances();

	/**
	 * Returns the meta object for the reference list '{@link de.validas.vvt.CheckResult#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues</em>'.
	 * @see de.validas.vvt.CheckResult#getIssues()
	 * @see #getCheckResult()
	 * @generated
	 */
	EReference getCheckResult_Issues();

	/**
	 * Returns the meta object for the reference '{@link de.validas.vvt.CheckResult#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see de.validas.vvt.CheckResult#getAuthor()
	 * @see #getCheckResult()
	 * @generated
	 */
	EReference getCheckResult_Author();

	/**
	 * Returns the meta object for class '{@link de.validas.vvt.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see de.validas.vvt.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference '{@link de.validas.vvt.Instance#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see de.validas.vvt.Instance#getParameter()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Parameter();

	/**
	 * Returns the meta object for the reference '{@link de.validas.vvt.Instance#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Value</em>'.
	 * @see de.validas.vvt.Instance#getParameterValue()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_ParameterValue();

	/**
	 * Returns the meta object for class '{@link de.validas.vvt.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.validas.vvt.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.validas.vvt.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.validas.vvt.Parameter#getParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Values</em>'.
	 * @see de.validas.vvt.Parameter#getParameterValues()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParameterValues();

	/**
	 * Returns the meta object for class '{@link de.validas.vvt.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see de.validas.vvt.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.ParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.validas.vvt.ParameterValue#getValue()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_Value();

	/**
	 * Returns the meta object for class '{@link de.validas.vvt.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see de.validas.vvt.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Issue#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see de.validas.vvt.Issue#getLink()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Link();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Issue#getWorkaround <em>Workaround</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workaround</em>'.
	 * @see de.validas.vvt.Issue#getWorkaround()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Workaround();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Issue#getFoundInRevisionOrDate <em>Found In Revision Or Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Found In Revision Or Date</em>'.
	 * @see de.validas.vvt.Issue#getFoundInRevisionOrDate()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_FoundInRevisionOrDate();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Issue#getFixedInRevisionOrDate <em>Fixed In Revision Or Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed In Revision Or Date</em>'.
	 * @see de.validas.vvt.Issue#getFixedInRevisionOrDate()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_FixedInRevisionOrDate();

	/**
	 * Returns the meta object for the reference '{@link de.validas.vvt.Issue#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Artifact</em>'.
	 * @see de.validas.vvt.Issue#getArtifact()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link de.validas.vvt.Issue#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see de.validas.vvt.Issue#getSeverity()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Severity();

	/**
	 * Returns the meta object for enum '{@link de.validas.vvt.CheckStatus <em>Check Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Check Status</em>'.
	 * @see de.validas.vvt.CheckStatus
	 * @generated
	 */
	EEnum getCheckStatus();

	/**
	 * Returns the meta object for enum '{@link de.validas.vvt.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see de.validas.vvt.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VvtFactory getVvtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.validas.vvt.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.impl.ProjectImpl
		 * @see de.validas.vvt.impl.VvtPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Checks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CHECKS = eINSTANCE.getProject_Checks();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__REPOSITORY = eINSTANCE.getProject_Repository();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PERSONS = eINSTANCE.getProject_Persons();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ARTIFACTS = eINSTANCE.getProject_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PARAMETER = eINSTANCE.getProject_Parameter();

		/**
		 * The meta object literal for the '<em><b>Verdict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__VERDICT = eINSTANCE.getProject_Verdict();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ISSUES = eINSTANCE.getProject_Issues();

		/**
		 * The meta object literal for the '<em><b>Issue Tracker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ISSUE_TRACKER = eINSTANCE.getProject_IssueTracker();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PRODUCT = eINSTANCE.getProject_Product();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__VERSION = eINSTANCE.getProject_Version();

		/**
		 * The meta object literal for the '{@link de.validas.vvt.impl.DescribedImpl <em>Described</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.impl.DescribedImpl
		 * @see de.validas.vvt.impl.VvtPackageImpl#getDescribed()
		 * @generated
		 */
		EClass DESCRIBED = eINSTANCE.getDescribed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED__NAME = eINSTANCE.getDescribed_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED__DESCRIPTION = eINSTANCE.getDescribed_Description();

		/**
		 * The meta object literal for the '<em><b>Long Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED__LONG_DESCRIPTION = eINSTANCE.getDescribed_LongDescription();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED__COMMENT = eINSTANCE.getDescribed_Comment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED__ID = eINSTANCE.getDescribed_Id();

		/**
		 * The meta object literal for the '{@link de.validas.vvt.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.impl.CheckImpl
		 * @see de.validas.vvt.impl.VvtPackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '<em><b>Check Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__CHECK_RESULTS = eINSTANCE.getCheck_CheckResults();

		/**
		 * The meta object literal for the '<em><b>Verdict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__VERDICT = eINSTANCE.getCheck_Verdict();

		/**
		 * The meta object literal for the '<em><b>Checked Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__CHECKED_ARTIFACT = eINSTANCE.getCheck_CheckedArtifact();

		/**
		 * The meta object literal for the '<em><b>Required Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__REQUIRED_ARTIFACTS = eINSTANCE.getCheck_RequiredArtifacts();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__AUTHOR = eINSTANCE.getCheck_Author();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__INSTANCES = eINSTANCE.getCheck_Instances();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__PARAMETERS = eINSTANCE.getCheck_Parameters();

		/**
		 * The meta object literal for the '<em><b>Sub Checks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__SUB_CHECKS = eINSTANCE.getCheck_SubChecks();

		/**
		 * The meta object literal for the '<em><b>Implicit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__IMPLICIT = eINSTANCE.getCheck_Implicit();

		/**
		 * The meta object literal for the '{@link de.validas.vvt.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.impl.PersonImpl
		 * @see de.validas.vvt.impl.VvtPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FULL_NAME = eINSTANCE.getPerson_FullName();

		/**
		 * The meta object literal for the '{@link de.validas.vvt.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.impl.ArtifactImpl
		 * @see de.validas.vvt.impl.VvtPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__PATH = eINSTANCE.getArtifact_Path();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__MODIFIED = eINSTANCE.getArtifact_Modified();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__REPOSITORY = eINSTANCE.getArtifact_Repository();

		/**
		 * The meta object literal for the '<em><b>Devleopers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__DEVLEOPERS = eINSTANCE.getArtifact_Devleopers();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__REVISION = eINSTANCE.getArtifact_Revision();

		/**
		 * The meta object literal for the '{@link de.validas.vvt.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.impl.RepositoryImpl
		 * @see de.validas.vvt.impl.VvtPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__URL = eINSTANCE.getRepository_URL();

		/**
		 * The meta object literal for the '{@link de.validas.vvt.impl.CheckResultImpl <em>Check Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.impl.CheckResultImpl
		 * @see de.validas.vvt.impl.VvtPackageImpl#getCheckResult()
		 * @generated
		 */
		EClass CHECK_RESULT = eINSTANCE.getCheckResult();

		/**
		 * The meta object literal for the '<em><b>Verdict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_RESULT__VERDICT = eINSTANCE.getCheckResult_Verdict();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_RESULT__TIME_STAMP = eINSTANCE.getCheckResult_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Artifact Revision Or Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_RESULT__ARTIFACT_REVISION_OR_DATE = eINSTANCE.getCheckResult_ArtifactRevisionOrDate();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_RESULT__JUSTIFICATION = eINSTANCE.getCheckResult_Justification();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_RESULT__INSTANCES = eINSTANCE.getCheckResult_Instances();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_RESULT__ISSUES = eINSTANCE.getCheckResult_Issues();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_RESULT__AUTHOR = eINSTANCE.getCheckResult_Author();

		/**
		 * The meta object literal for the '{@link de.validas.vvt.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.impl.InstanceImpl
		 * @see de.validas.vvt.impl.VvtPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__PARAMETER = eINSTANCE.getInstance_Parameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__PARAMETER_VALUE = eINSTANCE.getInstance_ParameterValue();

		/**
		 * The meta object literal for the '{@link de.validas.vvt.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.impl.ParameterImpl
		 * @see de.validas.vvt.impl.VvtPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Parameter Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_VALUES = eINSTANCE.getParameter_ParameterValues();

		/**
		 * The meta object literal for the '{@link de.validas.vvt.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.impl.ParameterValueImpl
		 * @see de.validas.vvt.impl.VvtPackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__VALUE = eINSTANCE.getParameterValue_Value();

		/**
		 * The meta object literal for the '{@link de.validas.vvt.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.impl.IssueImpl
		 * @see de.validas.vvt.impl.VvtPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__LINK = eINSTANCE.getIssue_Link();

		/**
		 * The meta object literal for the '<em><b>Workaround</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__WORKAROUND = eINSTANCE.getIssue_Workaround();

		/**
		 * The meta object literal for the '<em><b>Found In Revision Or Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__FOUND_IN_REVISION_OR_DATE = eINSTANCE.getIssue_FoundInRevisionOrDate();

		/**
		 * The meta object literal for the '<em><b>Fixed In Revision Or Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__FIXED_IN_REVISION_OR_DATE = eINSTANCE.getIssue_FixedInRevisionOrDate();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ARTIFACT = eINSTANCE.getIssue_Artifact();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__SEVERITY = eINSTANCE.getIssue_Severity();

		/**
		 * The meta object literal for the '{@link de.validas.vvt.CheckStatus <em>Check Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.CheckStatus
		 * @see de.validas.vvt.impl.VvtPackageImpl#getCheckStatus()
		 * @generated
		 */
		EEnum CHECK_STATUS = eINSTANCE.getCheckStatus();

		/**
		 * The meta object literal for the '{@link de.validas.vvt.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.validas.vvt.Severity
		 * @see de.validas.vvt.impl.VvtPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

	}

} //VvtPackage
