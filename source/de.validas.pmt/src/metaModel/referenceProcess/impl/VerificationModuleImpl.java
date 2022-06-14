/**
 */
package metaModel.referenceProcess.impl;

import java.util.Collection;

import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.Criterion;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.VerificationModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.impl.VerificationModuleImpl#getVerifiedCompliances <em>Verified Compliances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.VerificationModuleImpl#isImplicit <em>Implicit</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.VerificationModuleImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationModuleImpl extends ProcessModuleImpl implements VerificationModule {
	/**
	 * The cached value of the '{@link #getVerifiedCompliances() <em>Verified Compliances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedCompliances()
	 * @generated
	 * @ordered
	 */
	protected EList<Compliance> verifiedCompliances;

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
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<Criterion> criteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferenceProcessPackage.Literals.VERIFICATION_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Compliance> getVerifiedCompliances() {
		if (verifiedCompliances == null) {
			verifiedCompliances = new EObjectWithInverseResolvingEList.ManyInverse<Compliance>(Compliance.class, this, ReferenceProcessPackage.VERIFICATION_MODULE__VERIFIED_COMPLIANCES, ReferenceProcessPackage.COMPLIANCE__VERIFICATION_MODULES);
		}
		return verifiedCompliances;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.VERIFICATION_MODULE__IMPLICIT, oldImplicit, implicit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Criterion> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectContainmentEList<Criterion>(Criterion.class, this, ReferenceProcessPackage.VERIFICATION_MODULE__CRITERIA);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReferenceProcessPackage.VERIFICATION_MODULE__VERIFIED_COMPLIANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVerifiedCompliances()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReferenceProcessPackage.VERIFICATION_MODULE__VERIFIED_COMPLIANCES:
				return ((InternalEList<?>)getVerifiedCompliances()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.VERIFICATION_MODULE__CRITERIA:
				return ((InternalEList<?>)getCriteria()).basicRemove(otherEnd, msgs);
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
			case ReferenceProcessPackage.VERIFICATION_MODULE__VERIFIED_COMPLIANCES:
				return getVerifiedCompliances();
			case ReferenceProcessPackage.VERIFICATION_MODULE__IMPLICIT:
				return isImplicit();
			case ReferenceProcessPackage.VERIFICATION_MODULE__CRITERIA:
				return getCriteria();
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
			case ReferenceProcessPackage.VERIFICATION_MODULE__VERIFIED_COMPLIANCES:
				getVerifiedCompliances().clear();
				getVerifiedCompliances().addAll((Collection<? extends Compliance>)newValue);
				return;
			case ReferenceProcessPackage.VERIFICATION_MODULE__IMPLICIT:
				setImplicit((Boolean)newValue);
				return;
			case ReferenceProcessPackage.VERIFICATION_MODULE__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends Criterion>)newValue);
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
			case ReferenceProcessPackage.VERIFICATION_MODULE__VERIFIED_COMPLIANCES:
				getVerifiedCompliances().clear();
				return;
			case ReferenceProcessPackage.VERIFICATION_MODULE__IMPLICIT:
				setImplicit(IMPLICIT_EDEFAULT);
				return;
			case ReferenceProcessPackage.VERIFICATION_MODULE__CRITERIA:
				getCriteria().clear();
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
			case ReferenceProcessPackage.VERIFICATION_MODULE__VERIFIED_COMPLIANCES:
				return verifiedCompliances != null && !verifiedCompliances.isEmpty();
			case ReferenceProcessPackage.VERIFICATION_MODULE__IMPLICIT:
				return implicit != IMPLICIT_EDEFAULT;
			case ReferenceProcessPackage.VERIFICATION_MODULE__CRITERIA:
				return criteria != null && !criteria.isEmpty();
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
		result.append(" (Implicit: ");
		result.append(implicit);
		result.append(')');
		return result.toString();
	}

} //VerificationModuleImpl
