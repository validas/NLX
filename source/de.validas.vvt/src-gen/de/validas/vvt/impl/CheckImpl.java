/**
 */
package de.validas.vvt.impl;

import de.validas.vvt.Artifact;
import de.validas.vvt.Check;
import de.validas.vvt.CheckResult;
import de.validas.vvt.CheckStatus;
import de.validas.vvt.Instance;
import de.validas.vvt.Parameter;
import de.validas.vvt.Person;
import de.validas.vvt.VvtPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.impl.CheckImpl#getCheckResults <em>Check Results</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckImpl#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckImpl#getCheckedArtifact <em>Checked Artifact</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckImpl#getRequiredArtifacts <em>Required Artifacts</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckImpl#getSubChecks <em>Sub Checks</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckImpl#isImplicit <em>Implicit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckImpl extends DescribedImpl implements Check {
	/**
	 * The cached value of the '{@link #getCheckResults() <em>Check Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckResults()
	 * @generated
	 * @ordered
	 */
	protected EList<CheckResult> checkResults;
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
	 * The cached value of the '{@link #getCheckedArtifact() <em>Checked Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckedArtifact()
	 * @generated
	 * @ordered
	 */
	protected Artifact checkedArtifact;
	/**
	 * The cached value of the '{@link #getRequiredArtifacts() <em>Required Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> requiredArtifacts;
	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> author;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instances;
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getSubChecks() <em>Sub Checks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubChecks()
	 * @generated
	 * @ordered
	 */
	protected EList<Check> subChecks;

	/**
	 * The default value of the '{@link #isImplicit() <em>Implicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplicit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPLICIT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isImplicit() <em>Implicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplicit()
	 * @generated
	 * @ordered
	 */
	protected boolean implicit = IMPLICIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VvtPackage.Literals.CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CheckResult> getCheckResults() {
		if (checkResults == null) {
			checkResults = new EObjectContainmentEList<CheckResult>(CheckResult.class, this,
					VvtPackage.CHECK__CHECK_RESULTS);
		}
		return checkResults;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.CHECK__VERDICT, oldVerdict, verdict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact getCheckedArtifact() {
		if (checkedArtifact != null && checkedArtifact.eIsProxy()) {
			InternalEObject oldCheckedArtifact = (InternalEObject) checkedArtifact;
			checkedArtifact = (Artifact) eResolveProxy(oldCheckedArtifact);
			if (checkedArtifact != oldCheckedArtifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VvtPackage.CHECK__CHECKED_ARTIFACT,
							oldCheckedArtifact, checkedArtifact));
			}
		}
		return checkedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetCheckedArtifact() {
		return checkedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckedArtifact(Artifact newCheckedArtifact) {
		Artifact oldCheckedArtifact = checkedArtifact;
		checkedArtifact = newCheckedArtifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.CHECK__CHECKED_ARTIFACT,
					oldCheckedArtifact, checkedArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getRequiredArtifacts() {
		if (requiredArtifacts == null) {
			requiredArtifacts = new EObjectResolvingEList<Artifact>(Artifact.class, this,
					VvtPackage.CHECK__REQUIRED_ARTIFACTS);
		}
		return requiredArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getAuthor() {
		if (author == null) {
			author = new EObjectResolvingEList<Person>(Person.class, this, VvtPackage.CHECK__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<Instance>(Instance.class, this, VvtPackage.CHECK__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, VvtPackage.CHECK__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Check> getSubChecks() {
		if (subChecks == null) {
			subChecks = new EObjectContainmentEList<Check>(Check.class, this, VvtPackage.CHECK__SUB_CHECKS);
		}
		return subChecks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImplicit() {
		return implicit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicit(boolean newImplicit) {
		boolean oldImplicit = implicit;
		implicit = newImplicit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.CHECK__IMPLICIT, oldImplicit, implicit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VvtPackage.CHECK__CHECK_RESULTS:
			return ((InternalEList<?>) getCheckResults()).basicRemove(otherEnd, msgs);
		case VvtPackage.CHECK__INSTANCES:
			return ((InternalEList<?>) getInstances()).basicRemove(otherEnd, msgs);
		case VvtPackage.CHECK__SUB_CHECKS:
			return ((InternalEList<?>) getSubChecks()).basicRemove(otherEnd, msgs);
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
		case VvtPackage.CHECK__CHECK_RESULTS:
			return getCheckResults();
		case VvtPackage.CHECK__VERDICT:
			return getVerdict();
		case VvtPackage.CHECK__CHECKED_ARTIFACT:
			if (resolve)
				return getCheckedArtifact();
			return basicGetCheckedArtifact();
		case VvtPackage.CHECK__REQUIRED_ARTIFACTS:
			return getRequiredArtifacts();
		case VvtPackage.CHECK__AUTHOR:
			return getAuthor();
		case VvtPackage.CHECK__INSTANCES:
			return getInstances();
		case VvtPackage.CHECK__PARAMETERS:
			return getParameters();
		case VvtPackage.CHECK__SUB_CHECKS:
			return getSubChecks();
		case VvtPackage.CHECK__IMPLICIT:
			return isImplicit();
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
		case VvtPackage.CHECK__CHECK_RESULTS:
			getCheckResults().clear();
			getCheckResults().addAll((Collection<? extends CheckResult>) newValue);
			return;
		case VvtPackage.CHECK__VERDICT:
			setVerdict((CheckStatus) newValue);
			return;
		case VvtPackage.CHECK__CHECKED_ARTIFACT:
			setCheckedArtifact((Artifact) newValue);
			return;
		case VvtPackage.CHECK__REQUIRED_ARTIFACTS:
			getRequiredArtifacts().clear();
			getRequiredArtifacts().addAll((Collection<? extends Artifact>) newValue);
			return;
		case VvtPackage.CHECK__AUTHOR:
			getAuthor().clear();
			getAuthor().addAll((Collection<? extends Person>) newValue);
			return;
		case VvtPackage.CHECK__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends Instance>) newValue);
			return;
		case VvtPackage.CHECK__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case VvtPackage.CHECK__SUB_CHECKS:
			getSubChecks().clear();
			getSubChecks().addAll((Collection<? extends Check>) newValue);
			return;
		case VvtPackage.CHECK__IMPLICIT:
			setImplicit((Boolean) newValue);
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
		case VvtPackage.CHECK__CHECK_RESULTS:
			getCheckResults().clear();
			return;
		case VvtPackage.CHECK__VERDICT:
			setVerdict(VERDICT_EDEFAULT);
			return;
		case VvtPackage.CHECK__CHECKED_ARTIFACT:
			setCheckedArtifact((Artifact) null);
			return;
		case VvtPackage.CHECK__REQUIRED_ARTIFACTS:
			getRequiredArtifacts().clear();
			return;
		case VvtPackage.CHECK__AUTHOR:
			getAuthor().clear();
			return;
		case VvtPackage.CHECK__INSTANCES:
			getInstances().clear();
			return;
		case VvtPackage.CHECK__PARAMETERS:
			getParameters().clear();
			return;
		case VvtPackage.CHECK__SUB_CHECKS:
			getSubChecks().clear();
			return;
		case VvtPackage.CHECK__IMPLICIT:
			setImplicit(IMPLICIT_EDEFAULT);
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
		case VvtPackage.CHECK__CHECK_RESULTS:
			return checkResults != null && !checkResults.isEmpty();
		case VvtPackage.CHECK__VERDICT:
			return verdict != VERDICT_EDEFAULT;
		case VvtPackage.CHECK__CHECKED_ARTIFACT:
			return checkedArtifact != null;
		case VvtPackage.CHECK__REQUIRED_ARTIFACTS:
			return requiredArtifacts != null && !requiredArtifacts.isEmpty();
		case VvtPackage.CHECK__AUTHOR:
			return author != null && !author.isEmpty();
		case VvtPackage.CHECK__INSTANCES:
			return instances != null && !instances.isEmpty();
		case VvtPackage.CHECK__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case VvtPackage.CHECK__SUB_CHECKS:
			return subChecks != null && !subChecks.isEmpty();
		case VvtPackage.CHECK__IMPLICIT:
			return implicit != IMPLICIT_EDEFAULT;
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
		result.append(", implicit: ");
		result.append(implicit);
		result.append(')');
		return result.toString();
	}

} //CheckImpl
