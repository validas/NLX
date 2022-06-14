/**
 */
package de.validas.vvt.impl;

import de.validas.vvt.CheckResult;
import de.validas.vvt.CheckStatus;
import de.validas.vvt.Instance;
import de.validas.vvt.Issue;
import de.validas.vvt.Person;
import de.validas.vvt.VvtPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.impl.CheckResultImpl#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckResultImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckResultImpl#getArtifactRevisionOrDate <em>Artifact Revision Or Date</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckResultImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckResultImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckResultImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link de.validas.vvt.impl.CheckResultImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckResultImpl extends DescribedImpl implements CheckResult {
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
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactRevisionOrDate() <em>Artifact Revision Or Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRevisionOrDate()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_REVISION_OR_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactRevisionOrDate() <em>Artifact Revision Or Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRevisionOrDate()
	 * @generated
	 * @ordered
	 */
	protected String artifactRevisionOrDate = ARTIFACT_REVISION_OR_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected String justification = JUSTIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instances;

	/**
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> issues;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Person author;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VvtPackage.Literals.CHECK_RESULT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.CHECK_RESULT__VERDICT, oldVerdict,
					verdict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStamp(String newTimeStamp) {
		String oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.CHECK_RESULT__TIME_STAMP, oldTimeStamp,
					timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactRevisionOrDate() {
		return artifactRevisionOrDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactRevisionOrDate(String newArtifactRevisionOrDate) {
		String oldArtifactRevisionOrDate = artifactRevisionOrDate;
		artifactRevisionOrDate = newArtifactRevisionOrDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.CHECK_RESULT__ARTIFACT_REVISION_OR_DATE,
					oldArtifactRevisionOrDate, artifactRevisionOrDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJustification() {
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJustification(String newJustification) {
		String oldJustification = justification;
		justification = newJustification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.CHECK_RESULT__JUSTIFICATION,
					oldJustification, justification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instance> getInstances() {
		if (instances == null) {
			instances = new EObjectResolvingEList<Instance>(Instance.class, this, VvtPackage.CHECK_RESULT__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Issue> getIssues() {
		if (issues == null) {
			issues = new EObjectResolvingEList<Issue>(Issue.class, this, VvtPackage.CHECK_RESULT__ISSUES);
		}
		return issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject) author;
			author = (Person) eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VvtPackage.CHECK_RESULT__AUTHOR,
							oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(Person newAuthor) {
		Person oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.CHECK_RESULT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VvtPackage.CHECK_RESULT__VERDICT:
			return getVerdict();
		case VvtPackage.CHECK_RESULT__TIME_STAMP:
			return getTimeStamp();
		case VvtPackage.CHECK_RESULT__ARTIFACT_REVISION_OR_DATE:
			return getArtifactRevisionOrDate();
		case VvtPackage.CHECK_RESULT__JUSTIFICATION:
			return getJustification();
		case VvtPackage.CHECK_RESULT__INSTANCES:
			return getInstances();
		case VvtPackage.CHECK_RESULT__ISSUES:
			return getIssues();
		case VvtPackage.CHECK_RESULT__AUTHOR:
			if (resolve)
				return getAuthor();
			return basicGetAuthor();
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
		case VvtPackage.CHECK_RESULT__VERDICT:
			setVerdict((CheckStatus) newValue);
			return;
		case VvtPackage.CHECK_RESULT__TIME_STAMP:
			setTimeStamp((String) newValue);
			return;
		case VvtPackage.CHECK_RESULT__ARTIFACT_REVISION_OR_DATE:
			setArtifactRevisionOrDate((String) newValue);
			return;
		case VvtPackage.CHECK_RESULT__JUSTIFICATION:
			setJustification((String) newValue);
			return;
		case VvtPackage.CHECK_RESULT__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends Instance>) newValue);
			return;
		case VvtPackage.CHECK_RESULT__ISSUES:
			getIssues().clear();
			getIssues().addAll((Collection<? extends Issue>) newValue);
			return;
		case VvtPackage.CHECK_RESULT__AUTHOR:
			setAuthor((Person) newValue);
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
		case VvtPackage.CHECK_RESULT__VERDICT:
			setVerdict(VERDICT_EDEFAULT);
			return;
		case VvtPackage.CHECK_RESULT__TIME_STAMP:
			setTimeStamp(TIME_STAMP_EDEFAULT);
			return;
		case VvtPackage.CHECK_RESULT__ARTIFACT_REVISION_OR_DATE:
			setArtifactRevisionOrDate(ARTIFACT_REVISION_OR_DATE_EDEFAULT);
			return;
		case VvtPackage.CHECK_RESULT__JUSTIFICATION:
			setJustification(JUSTIFICATION_EDEFAULT);
			return;
		case VvtPackage.CHECK_RESULT__INSTANCES:
			getInstances().clear();
			return;
		case VvtPackage.CHECK_RESULT__ISSUES:
			getIssues().clear();
			return;
		case VvtPackage.CHECK_RESULT__AUTHOR:
			setAuthor((Person) null);
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
		case VvtPackage.CHECK_RESULT__VERDICT:
			return verdict != VERDICT_EDEFAULT;
		case VvtPackage.CHECK_RESULT__TIME_STAMP:
			return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
		case VvtPackage.CHECK_RESULT__ARTIFACT_REVISION_OR_DATE:
			return ARTIFACT_REVISION_OR_DATE_EDEFAULT == null ? artifactRevisionOrDate != null
					: !ARTIFACT_REVISION_OR_DATE_EDEFAULT.equals(artifactRevisionOrDate);
		case VvtPackage.CHECK_RESULT__JUSTIFICATION:
			return JUSTIFICATION_EDEFAULT == null ? justification != null
					: !JUSTIFICATION_EDEFAULT.equals(justification);
		case VvtPackage.CHECK_RESULT__INSTANCES:
			return instances != null && !instances.isEmpty();
		case VvtPackage.CHECK_RESULT__ISSUES:
			return issues != null && !issues.isEmpty();
		case VvtPackage.CHECK_RESULT__AUTHOR:
			return author != null;
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
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(", artifactRevisionOrDate: ");
		result.append(artifactRevisionOrDate);
		result.append(", justification: ");
		result.append(justification);
		result.append(')');
		return result.toString();
	}

} //CheckResultImpl
