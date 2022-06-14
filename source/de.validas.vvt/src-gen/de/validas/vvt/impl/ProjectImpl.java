/**
 */
package de.validas.vvt.impl;

import de.validas.vvt.Artifact;
import de.validas.vvt.Check;
import de.validas.vvt.CheckStatus;
import de.validas.vvt.Issue;
import de.validas.vvt.Parameter;
import de.validas.vvt.Person;
import de.validas.vvt.Project;
import de.validas.vvt.Repository;
import de.validas.vvt.VvtPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.impl.ProjectImpl#getChecks <em>Checks</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ProjectImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ProjectImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ProjectImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ProjectImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ProjectImpl#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ProjectImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ProjectImpl#getIssueTracker <em>Issue Tracker</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ProjectImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ProjectImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends DescribedImpl implements Project {
	/**
	 * The cached value of the '{@link #getChecks() <em>Checks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecks()
	 * @generated
	 * @ordered
	 */
	protected EList<Check> checks;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repository;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifacts;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The default value of the '{@link #getVerdict() <em>Verdict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerdict()
	 * @generated
	 * @ordered
	 */
	protected static final CheckStatus VERDICT_EDEFAULT = CheckStatus.CREATED;

	/**
	 * The cached value of the '{@link #getVerdict() <em>Verdict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerdict()
	 * @generated
	 * @ordered
	 */
	protected CheckStatus verdict = VERDICT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> issues;

	/**
	 * The default value of the '{@link #getIssueTracker() <em>Issue Tracker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueTracker()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_TRACKER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueTracker() <em>Issue Tracker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueTracker()
	 * @generated
	 * @ordered
	 */
	protected String issueTracker = ISSUE_TRACKER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduct() <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected String product = PRODUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VvtPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Check> getChecks() {
		if (checks == null) {
			checks = new EObjectContainmentEList<Check>(Check.class, this, VvtPackage.PROJECT__CHECKS);
		}
		return checks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Repository> getRepository() {
		if (repository == null) {
			repository = new EObjectContainmentEList<Repository>(Repository.class, this,
					VvtPackage.PROJECT__REPOSITORY);
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, VvtPackage.PROJECT__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<Artifact>(Artifact.class, this, VvtPackage.PROJECT__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, VvtPackage.PROJECT__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckStatus getVerdict() {
		return verdict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerdict(CheckStatus newVerdict) {
		CheckStatus oldVerdict = verdict;
		verdict = newVerdict == null ? VERDICT_EDEFAULT : newVerdict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.PROJECT__VERDICT, oldVerdict, verdict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Issue> getIssues() {
		if (issues == null) {
			issues = new EObjectContainmentEList<Issue>(Issue.class, this, VvtPackage.PROJECT__ISSUES);
		}
		return issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssueTracker() {
		return issueTracker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueTracker(String newIssueTracker) {
		String oldIssueTracker = issueTracker;
		issueTracker = newIssueTracker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.PROJECT__ISSUE_TRACKER, oldIssueTracker,
					issueTracker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(String newProduct) {
		String oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.PROJECT__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.PROJECT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VvtPackage.PROJECT__CHECKS:
			return ((InternalEList<?>) getChecks()).basicRemove(otherEnd, msgs);
		case VvtPackage.PROJECT__REPOSITORY:
			return ((InternalEList<?>) getRepository()).basicRemove(otherEnd, msgs);
		case VvtPackage.PROJECT__PERSONS:
			return ((InternalEList<?>) getPersons()).basicRemove(otherEnd, msgs);
		case VvtPackage.PROJECT__ARTIFACTS:
			return ((InternalEList<?>) getArtifacts()).basicRemove(otherEnd, msgs);
		case VvtPackage.PROJECT__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
		case VvtPackage.PROJECT__ISSUES:
			return ((InternalEList<?>) getIssues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VvtPackage.PROJECT__CHECKS:
			return getChecks();
		case VvtPackage.PROJECT__REPOSITORY:
			return getRepository();
		case VvtPackage.PROJECT__PERSONS:
			return getPersons();
		case VvtPackage.PROJECT__ARTIFACTS:
			return getArtifacts();
		case VvtPackage.PROJECT__PARAMETER:
			return getParameter();
		case VvtPackage.PROJECT__VERDICT:
			return getVerdict();
		case VvtPackage.PROJECT__ISSUES:
			return getIssues();
		case VvtPackage.PROJECT__ISSUE_TRACKER:
			return getIssueTracker();
		case VvtPackage.PROJECT__PRODUCT:
			return getProduct();
		case VvtPackage.PROJECT__VERSION:
			return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case VvtPackage.PROJECT__CHECKS:
			getChecks().clear();
			getChecks().addAll((Collection<? extends Check>) newValue);
			return;
		case VvtPackage.PROJECT__REPOSITORY:
			getRepository().clear();
			getRepository().addAll((Collection<? extends Repository>) newValue);
			return;
		case VvtPackage.PROJECT__PERSONS:
			getPersons().clear();
			getPersons().addAll((Collection<? extends Person>) newValue);
			return;
		case VvtPackage.PROJECT__ARTIFACTS:
			getArtifacts().clear();
			getArtifacts().addAll((Collection<? extends Artifact>) newValue);
			return;
		case VvtPackage.PROJECT__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends Parameter>) newValue);
			return;
		case VvtPackage.PROJECT__VERDICT:
			setVerdict((CheckStatus) newValue);
			return;
		case VvtPackage.PROJECT__ISSUES:
			getIssues().clear();
			getIssues().addAll((Collection<? extends Issue>) newValue);
			return;
		case VvtPackage.PROJECT__ISSUE_TRACKER:
			setIssueTracker((String) newValue);
			return;
		case VvtPackage.PROJECT__PRODUCT:
			setProduct((String) newValue);
			return;
		case VvtPackage.PROJECT__VERSION:
			setVersion((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case VvtPackage.PROJECT__CHECKS:
			getChecks().clear();
			return;
		case VvtPackage.PROJECT__REPOSITORY:
			getRepository().clear();
			return;
		case VvtPackage.PROJECT__PERSONS:
			getPersons().clear();
			return;
		case VvtPackage.PROJECT__ARTIFACTS:
			getArtifacts().clear();
			return;
		case VvtPackage.PROJECT__PARAMETER:
			getParameter().clear();
			return;
		case VvtPackage.PROJECT__VERDICT:
			setVerdict(VERDICT_EDEFAULT);
			return;
		case VvtPackage.PROJECT__ISSUES:
			getIssues().clear();
			return;
		case VvtPackage.PROJECT__ISSUE_TRACKER:
			setIssueTracker(ISSUE_TRACKER_EDEFAULT);
			return;
		case VvtPackage.PROJECT__PRODUCT:
			setProduct(PRODUCT_EDEFAULT);
			return;
		case VvtPackage.PROJECT__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case VvtPackage.PROJECT__CHECKS:
			return checks != null && !checks.isEmpty();
		case VvtPackage.PROJECT__REPOSITORY:
			return repository != null && !repository.isEmpty();
		case VvtPackage.PROJECT__PERSONS:
			return persons != null && !persons.isEmpty();
		case VvtPackage.PROJECT__ARTIFACTS:
			return artifacts != null && !artifacts.isEmpty();
		case VvtPackage.PROJECT__PARAMETER:
			return parameter != null && !parameter.isEmpty();
		case VvtPackage.PROJECT__VERDICT:
			return verdict != VERDICT_EDEFAULT;
		case VvtPackage.PROJECT__ISSUES:
			return issues != null && !issues.isEmpty();
		case VvtPackage.PROJECT__ISSUE_TRACKER:
			return ISSUE_TRACKER_EDEFAULT == null ? issueTracker != null : !ISSUE_TRACKER_EDEFAULT.equals(issueTracker);
		case VvtPackage.PROJECT__PRODUCT:
			return PRODUCT_EDEFAULT == null ? product != null : !PRODUCT_EDEFAULT.equals(product);
		case VvtPackage.PROJECT__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (verdict: ");
		result.append(verdict);
		result.append(", IssueTracker: ");
		result.append(issueTracker);
		result.append(", product: ");
		result.append(product);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
