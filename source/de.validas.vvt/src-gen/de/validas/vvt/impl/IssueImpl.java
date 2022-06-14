/**
 */
package de.validas.vvt.impl;

import de.validas.vvt.Artifact;
import de.validas.vvt.Issue;
import de.validas.vvt.Severity;
import de.validas.vvt.VvtPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.impl.IssueImpl#getLink <em>Link</em>}</li>
 *   <li>{@link de.validas.vvt.impl.IssueImpl#getWorkaround <em>Workaround</em>}</li>
 *   <li>{@link de.validas.vvt.impl.IssueImpl#getFoundInRevisionOrDate <em>Found In Revision Or Date</em>}</li>
 *   <li>{@link de.validas.vvt.impl.IssueImpl#getFixedInRevisionOrDate <em>Fixed In Revision Or Date</em>}</li>
 *   <li>{@link de.validas.vvt.impl.IssueImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link de.validas.vvt.impl.IssueImpl#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends DescribedImpl implements Issue {
	/**
	 * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected String link = LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkaround() <em>Workaround</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkaround()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKAROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkaround() <em>Workaround</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkaround()
	 * @generated
	 * @ordered
	 */
	protected String workaround = WORKAROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getFoundInRevisionOrDate() <em>Found In Revision Or Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoundInRevisionOrDate()
	 * @generated
	 * @ordered
	 */
	protected static final String FOUND_IN_REVISION_OR_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFoundInRevisionOrDate() <em>Found In Revision Or Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoundInRevisionOrDate()
	 * @generated
	 * @ordered
	 */
	protected String foundInRevisionOrDate = FOUND_IN_REVISION_OR_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedInRevisionOrDate() <em>Fixed In Revision Or Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedInRevisionOrDate()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_IN_REVISION_OR_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedInRevisionOrDate() <em>Fixed In Revision Or Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedInRevisionOrDate()
	 * @generated
	 * @ordered
	 */
	protected String fixedInRevisionOrDate = FIXED_IN_REVISION_OR_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected Artifact artifact;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Severity SEVERITY_EDEFAULT = Severity.MAJOR;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Severity severity = SEVERITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VvtPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLink(String newLink) {
		String oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.ISSUE__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkaround() {
		return workaround;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkaround(String newWorkaround) {
		String oldWorkaround = workaround;
		workaround = newWorkaround;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.ISSUE__WORKAROUND, oldWorkaround,
					workaround));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFoundInRevisionOrDate() {
		return foundInRevisionOrDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFoundInRevisionOrDate(String newFoundInRevisionOrDate) {
		String oldFoundInRevisionOrDate = foundInRevisionOrDate;
		foundInRevisionOrDate = newFoundInRevisionOrDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.ISSUE__FOUND_IN_REVISION_OR_DATE,
					oldFoundInRevisionOrDate, foundInRevisionOrDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedInRevisionOrDate() {
		return fixedInRevisionOrDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedInRevisionOrDate(String newFixedInRevisionOrDate) {
		String oldFixedInRevisionOrDate = fixedInRevisionOrDate;
		fixedInRevisionOrDate = newFixedInRevisionOrDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.ISSUE__FIXED_IN_REVISION_OR_DATE,
					oldFixedInRevisionOrDate, fixedInRevisionOrDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact getArtifact() {
		if (artifact != null && artifact.eIsProxy()) {
			InternalEObject oldArtifact = (InternalEObject) artifact;
			artifact = (Artifact) eResolveProxy(oldArtifact);
			if (artifact != oldArtifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VvtPackage.ISSUE__ARTIFACT, oldArtifact,
							artifact));
			}
		}
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetArtifact() {
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifact(Artifact newArtifact) {
		Artifact oldArtifact = artifact;
		artifact = newArtifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.ISSUE__ARTIFACT, oldArtifact, artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Severity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(Severity newSeverity) {
		Severity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.ISSUE__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VvtPackage.ISSUE__LINK:
			return getLink();
		case VvtPackage.ISSUE__WORKAROUND:
			return getWorkaround();
		case VvtPackage.ISSUE__FOUND_IN_REVISION_OR_DATE:
			return getFoundInRevisionOrDate();
		case VvtPackage.ISSUE__FIXED_IN_REVISION_OR_DATE:
			return getFixedInRevisionOrDate();
		case VvtPackage.ISSUE__ARTIFACT:
			if (resolve)
				return getArtifact();
			return basicGetArtifact();
		case VvtPackage.ISSUE__SEVERITY:
			return getSeverity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case VvtPackage.ISSUE__LINK:
			setLink((String) newValue);
			return;
		case VvtPackage.ISSUE__WORKAROUND:
			setWorkaround((String) newValue);
			return;
		case VvtPackage.ISSUE__FOUND_IN_REVISION_OR_DATE:
			setFoundInRevisionOrDate((String) newValue);
			return;
		case VvtPackage.ISSUE__FIXED_IN_REVISION_OR_DATE:
			setFixedInRevisionOrDate((String) newValue);
			return;
		case VvtPackage.ISSUE__ARTIFACT:
			setArtifact((Artifact) newValue);
			return;
		case VvtPackage.ISSUE__SEVERITY:
			setSeverity((Severity) newValue);
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
		case VvtPackage.ISSUE__LINK:
			setLink(LINK_EDEFAULT);
			return;
		case VvtPackage.ISSUE__WORKAROUND:
			setWorkaround(WORKAROUND_EDEFAULT);
			return;
		case VvtPackage.ISSUE__FOUND_IN_REVISION_OR_DATE:
			setFoundInRevisionOrDate(FOUND_IN_REVISION_OR_DATE_EDEFAULT);
			return;
		case VvtPackage.ISSUE__FIXED_IN_REVISION_OR_DATE:
			setFixedInRevisionOrDate(FIXED_IN_REVISION_OR_DATE_EDEFAULT);
			return;
		case VvtPackage.ISSUE__ARTIFACT:
			setArtifact((Artifact) null);
			return;
		case VvtPackage.ISSUE__SEVERITY:
			setSeverity(SEVERITY_EDEFAULT);
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
		case VvtPackage.ISSUE__LINK:
			return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
		case VvtPackage.ISSUE__WORKAROUND:
			return WORKAROUND_EDEFAULT == null ? workaround != null : !WORKAROUND_EDEFAULT.equals(workaround);
		case VvtPackage.ISSUE__FOUND_IN_REVISION_OR_DATE:
			return FOUND_IN_REVISION_OR_DATE_EDEFAULT == null ? foundInRevisionOrDate != null
					: !FOUND_IN_REVISION_OR_DATE_EDEFAULT.equals(foundInRevisionOrDate);
		case VvtPackage.ISSUE__FIXED_IN_REVISION_OR_DATE:
			return FIXED_IN_REVISION_OR_DATE_EDEFAULT == null ? fixedInRevisionOrDate != null
					: !FIXED_IN_REVISION_OR_DATE_EDEFAULT.equals(fixedInRevisionOrDate);
		case VvtPackage.ISSUE__ARTIFACT:
			return artifact != null;
		case VvtPackage.ISSUE__SEVERITY:
			return severity != SEVERITY_EDEFAULT;
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
		result.append(" (link: ");
		result.append(link);
		result.append(", workaround: ");
		result.append(workaround);
		result.append(", foundInRevisionOrDate: ");
		result.append(foundInRevisionOrDate);
		result.append(", fixedInRevisionOrDate: ");
		result.append(fixedInRevisionOrDate);
		result.append(", Severity: ");
		result.append(severity);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
