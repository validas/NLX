/**
 */
package metaModel.suptertype.impl;

import metaModel.suptertype.Named;
import metaModel.suptertype.SuptertypePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.suptertype.impl.NamedImpl#getName <em>Name</em>}</li>
 *   <li>{@link metaModel.suptertype.impl.NamedImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link metaModel.suptertype.impl.NamedImpl#getID <em>ID</em>}</li>
 *   <li>{@link metaModel.suptertype.impl.NamedImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link metaModel.suptertype.impl.NamedImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link metaModel.suptertype.impl.NamedImpl#isDeactivated <em>Deactivated</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedImpl extends MinimalEObjectImpl.Container implements Named {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongDescription() <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongDescription() <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected String longDescription = LONG_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeactivated() <em>Deactivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeactivated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEACTIVATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeactivated() <em>Deactivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeactivated()
	 * @generated
	 * @ordered
	 */
	protected boolean deactivated = DEACTIVATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuptertypePackage.Literals.NAMED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuptertypePackage.NAMED__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuptertypePackage.NAMED__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuptertypePackage.NAMED__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuptertypePackage.NAMED__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLongDescription() {
		return longDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongDescription(String newLongDescription) {
		String oldLongDescription = longDescription;
		longDescription = newLongDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuptertypePackage.NAMED__LONG_DESCRIPTION, oldLongDescription, longDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeactivated() {
		return deactivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeactivated(boolean newDeactivated) {
		boolean oldDeactivated = deactivated;
		deactivated = newDeactivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuptertypePackage.NAMED__DEACTIVATED, oldDeactivated, deactivated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuptertypePackage.NAMED__NAME:
				return getName();
			case SuptertypePackage.NAMED__DESCRIPTION:
				return getDescription();
			case SuptertypePackage.NAMED__ID:
				return getID();
			case SuptertypePackage.NAMED__COMMENT:
				return getComment();
			case SuptertypePackage.NAMED__LONG_DESCRIPTION:
				return getLongDescription();
			case SuptertypePackage.NAMED__DEACTIVATED:
				return isDeactivated();
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
			case SuptertypePackage.NAMED__NAME:
				setName((String)newValue);
				return;
			case SuptertypePackage.NAMED__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SuptertypePackage.NAMED__ID:
				setID((String)newValue);
				return;
			case SuptertypePackage.NAMED__COMMENT:
				setComment((String)newValue);
				return;
			case SuptertypePackage.NAMED__LONG_DESCRIPTION:
				setLongDescription((String)newValue);
				return;
			case SuptertypePackage.NAMED__DEACTIVATED:
				setDeactivated((Boolean)newValue);
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
			case SuptertypePackage.NAMED__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SuptertypePackage.NAMED__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SuptertypePackage.NAMED__ID:
				setID(ID_EDEFAULT);
				return;
			case SuptertypePackage.NAMED__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case SuptertypePackage.NAMED__LONG_DESCRIPTION:
				setLongDescription(LONG_DESCRIPTION_EDEFAULT);
				return;
			case SuptertypePackage.NAMED__DEACTIVATED:
				setDeactivated(DEACTIVATED_EDEFAULT);
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
			case SuptertypePackage.NAMED__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SuptertypePackage.NAMED__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SuptertypePackage.NAMED__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SuptertypePackage.NAMED__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case SuptertypePackage.NAMED__LONG_DESCRIPTION:
				return LONG_DESCRIPTION_EDEFAULT == null ? longDescription != null : !LONG_DESCRIPTION_EDEFAULT.equals(longDescription);
			case SuptertypePackage.NAMED__DEACTIVATED:
				return deactivated != DEACTIVATED_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", ID: ");
		result.append(id);
		result.append(", comment: ");
		result.append(comment);
		result.append(", longDescription: ");
		result.append(longDescription);
		result.append(", deactivated: ");
		result.append(deactivated);
		result.append(')');
		return result.toString();
	}

} //NamedImpl
