/**
 */
package de.validas.vvt.impl;

import de.validas.vvt.Artifact;
import de.validas.vvt.Person;
import de.validas.vvt.Repository;
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
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.impl.ArtifactImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ArtifactImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ArtifactImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ArtifactImpl#getDevleopers <em>Devleopers</em>}</li>
 *   <li>{@link de.validas.vvt.impl.ArtifactImpl#getRevision <em>Revision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends DescribedImpl implements Artifact {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;
	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected String modified = MODIFIED_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository repository;
	/**
	 * The cached value of the '{@link #getDevleopers() <em>Devleopers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevleopers()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> devleopers;
	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VvtPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.ARTIFACT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModified(String newModified) {
		String oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.ARTIFACT__MODIFIED, oldModified,
					modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository getRepository() {
		if (repository != null && repository.eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject) repository;
			repository = (Repository) eResolveProxy(oldRepository);
			if (repository != oldRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VvtPackage.ARTIFACT__REPOSITORY,
							oldRepository, repository));
			}
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepository(Repository newRepository) {
		Repository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.ARTIFACT__REPOSITORY, oldRepository,
					repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getDevleopers() {
		if (devleopers == null) {
			devleopers = new EObjectResolvingEList<Person>(Person.class, this, VvtPackage.ARTIFACT__DEVLEOPERS);
		}
		return devleopers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.ARTIFACT__REVISION, oldRevision,
					revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VvtPackage.ARTIFACT__PATH:
			return getPath();
		case VvtPackage.ARTIFACT__MODIFIED:
			return getModified();
		case VvtPackage.ARTIFACT__REPOSITORY:
			if (resolve)
				return getRepository();
			return basicGetRepository();
		case VvtPackage.ARTIFACT__DEVLEOPERS:
			return getDevleopers();
		case VvtPackage.ARTIFACT__REVISION:
			return getRevision();
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
		case VvtPackage.ARTIFACT__PATH:
			setPath((String) newValue);
			return;
		case VvtPackage.ARTIFACT__MODIFIED:
			setModified((String) newValue);
			return;
		case VvtPackage.ARTIFACT__REPOSITORY:
			setRepository((Repository) newValue);
			return;
		case VvtPackage.ARTIFACT__DEVLEOPERS:
			getDevleopers().clear();
			getDevleopers().addAll((Collection<? extends Person>) newValue);
			return;
		case VvtPackage.ARTIFACT__REVISION:
			setRevision((String) newValue);
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
		case VvtPackage.ARTIFACT__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case VvtPackage.ARTIFACT__MODIFIED:
			setModified(MODIFIED_EDEFAULT);
			return;
		case VvtPackage.ARTIFACT__REPOSITORY:
			setRepository((Repository) null);
			return;
		case VvtPackage.ARTIFACT__DEVLEOPERS:
			getDevleopers().clear();
			return;
		case VvtPackage.ARTIFACT__REVISION:
			setRevision(REVISION_EDEFAULT);
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
		case VvtPackage.ARTIFACT__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case VvtPackage.ARTIFACT__MODIFIED:
			return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
		case VvtPackage.ARTIFACT__REPOSITORY:
			return repository != null;
		case VvtPackage.ARTIFACT__DEVLEOPERS:
			return devleopers != null && !devleopers.isEmpty();
		case VvtPackage.ARTIFACT__REVISION:
			return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
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
		result.append(" (path: ");
		result.append(path);
		result.append(", modified: ");
		result.append(modified);
		result.append(", revision: ");
		result.append(revision);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
