/**
 */
package metaModel.referenceProcess.impl;

import java.util.Collection;

import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.IVerified;
import metaModel.referenceProcess.IVerifier;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.Requirement;
import metaModel.suptertype.SafetyLevel;
import metaModel.suptertype.impl.VariantableImpl;
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
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.impl.RequirementImpl#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.RequirementImpl#getSubRequirements <em>Sub Requirements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.RequirementImpl#getRequiredRequirements <em>Required Requirements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.RequirementImpl#getRequiredByRequirements <em>Required By Requirements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.RequirementImpl#getRecommentedFrom <em>Recommented From</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.RequirementImpl#getRecommentedTo <em>Recommented To</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.RequirementImpl#getCompliances <em>Compliances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.RequirementImpl#getClaimingProcessModules <em>Claiming Process Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends VariantableImpl implements Requirement {
	/**
	 * The cached value of the '{@link #getVerifiedBy() <em>Verified By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<IVerifier> verifiedBy;

	/**
	 * The cached value of the '{@link #getSubRequirements() <em>Sub Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> subRequirements;

	/**
	 * The cached value of the '{@link #getRequiredRequirements() <em>Required Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requiredRequirements;

	/**
	 * The cached value of the '{@link #getRequiredByRequirements() <em>Required By Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredByRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requiredByRequirements;

	/**
	 * The default value of the '{@link #getRecommentedFrom() <em>Recommented From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommentedFrom()
	 * @generated
	 * @ordered
	 */
	protected static final SafetyLevel RECOMMENTED_FROM_EDEFAULT = SafetyLevel.ASIL_A;

	/**
	 * The cached value of the '{@link #getRecommentedFrom() <em>Recommented From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommentedFrom()
	 * @generated
	 * @ordered
	 */
	protected SafetyLevel recommentedFrom = RECOMMENTED_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecommentedTo() <em>Recommented To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommentedTo()
	 * @generated
	 * @ordered
	 */
	protected static final SafetyLevel RECOMMENTED_TO_EDEFAULT = SafetyLevel.ASIL_D;

	/**
	 * The cached value of the '{@link #getRecommentedTo() <em>Recommented To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommentedTo()
	 * @generated
	 * @ordered
	 */
	protected SafetyLevel recommentedTo = RECOMMENTED_TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompliances() <em>Compliances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliances()
	 * @generated
	 * @ordered
	 */
	protected EList<Compliance> compliances;

	/**
	 * The cached value of the '{@link #getClaimingProcessModules() <em>Claiming Process Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimingProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> claimingProcessModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferenceProcessPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IVerifier> getVerifiedBy() {
		if (verifiedBy == null) {
			verifiedBy = new EObjectWithInverseResolvingEList.ManyInverse<IVerifier>(IVerifier.class, this, ReferenceProcessPackage.REQUIREMENT__VERIFIED_BY, ReferenceProcessPackage.IVERIFIER__VERIFIES);
		}
		return verifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getSubRequirements() {
		if (subRequirements == null) {
			subRequirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, ReferenceProcessPackage.REQUIREMENT__SUB_REQUIREMENTS);
		}
		return subRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getRequiredRequirements() {
		if (requiredRequirements == null) {
			requiredRequirements = new EObjectWithInverseResolvingEList.ManyInverse<Requirement>(Requirement.class, this, ReferenceProcessPackage.REQUIREMENT__REQUIRED_REQUIREMENTS, ReferenceProcessPackage.REQUIREMENT__REQUIRED_BY_REQUIREMENTS);
		}
		return requiredRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getRequiredByRequirements() {
		if (requiredByRequirements == null) {
			requiredByRequirements = new EObjectWithInverseResolvingEList.ManyInverse<Requirement>(Requirement.class, this, ReferenceProcessPackage.REQUIREMENT__REQUIRED_BY_REQUIREMENTS, ReferenceProcessPackage.REQUIREMENT__REQUIRED_REQUIREMENTS);
		}
		return requiredByRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyLevel getRecommentedFrom() {
		return recommentedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecommentedFrom(SafetyLevel newRecommentedFrom) {
		SafetyLevel oldRecommentedFrom = recommentedFrom;
		recommentedFrom = newRecommentedFrom == null ? RECOMMENTED_FROM_EDEFAULT : newRecommentedFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.REQUIREMENT__RECOMMENTED_FROM, oldRecommentedFrom, recommentedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyLevel getRecommentedTo() {
		return recommentedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecommentedTo(SafetyLevel newRecommentedTo) {
		SafetyLevel oldRecommentedTo = recommentedTo;
		recommentedTo = newRecommentedTo == null ? RECOMMENTED_TO_EDEFAULT : newRecommentedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.REQUIREMENT__RECOMMENTED_TO, oldRecommentedTo, recommentedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Compliance> getCompliances() {
		if (compliances == null) {
			compliances = new EObjectContainmentEList<Compliance>(Compliance.class, this, ReferenceProcessPackage.REQUIREMENT__COMPLIANCES);
		}
		return compliances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getClaimingProcessModules() {
		if (claimingProcessModules == null) {
			claimingProcessModules = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.REQUIREMENT__CLAIMING_PROCESS_MODULES, ReferenceProcessPackage.PROCESS_MODULE__CLAIMED_COMPLIANCE_REQUIREMENTS);
		}
		return claimingProcessModules;
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
			case ReferenceProcessPackage.REQUIREMENT__VERIFIED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVerifiedBy()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.REQUIREMENT__REQUIRED_REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredRequirements()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.REQUIREMENT__REQUIRED_BY_REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredByRequirements()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.REQUIREMENT__CLAIMING_PROCESS_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClaimingProcessModules()).basicAdd(otherEnd, msgs);
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
			case ReferenceProcessPackage.REQUIREMENT__VERIFIED_BY:
				return ((InternalEList<?>)getVerifiedBy()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.REQUIREMENT__SUB_REQUIREMENTS:
				return ((InternalEList<?>)getSubRequirements()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.REQUIREMENT__REQUIRED_REQUIREMENTS:
				return ((InternalEList<?>)getRequiredRequirements()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.REQUIREMENT__REQUIRED_BY_REQUIREMENTS:
				return ((InternalEList<?>)getRequiredByRequirements()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.REQUIREMENT__COMPLIANCES:
				return ((InternalEList<?>)getCompliances()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.REQUIREMENT__CLAIMING_PROCESS_MODULES:
				return ((InternalEList<?>)getClaimingProcessModules()).basicRemove(otherEnd, msgs);
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
			case ReferenceProcessPackage.REQUIREMENT__VERIFIED_BY:
				return getVerifiedBy();
			case ReferenceProcessPackage.REQUIREMENT__SUB_REQUIREMENTS:
				return getSubRequirements();
			case ReferenceProcessPackage.REQUIREMENT__REQUIRED_REQUIREMENTS:
				return getRequiredRequirements();
			case ReferenceProcessPackage.REQUIREMENT__REQUIRED_BY_REQUIREMENTS:
				return getRequiredByRequirements();
			case ReferenceProcessPackage.REQUIREMENT__RECOMMENTED_FROM:
				return getRecommentedFrom();
			case ReferenceProcessPackage.REQUIREMENT__RECOMMENTED_TO:
				return getRecommentedTo();
			case ReferenceProcessPackage.REQUIREMENT__COMPLIANCES:
				return getCompliances();
			case ReferenceProcessPackage.REQUIREMENT__CLAIMING_PROCESS_MODULES:
				return getClaimingProcessModules();
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
			case ReferenceProcessPackage.REQUIREMENT__VERIFIED_BY:
				getVerifiedBy().clear();
				getVerifiedBy().addAll((Collection<? extends IVerifier>)newValue);
				return;
			case ReferenceProcessPackage.REQUIREMENT__SUB_REQUIREMENTS:
				getSubRequirements().clear();
				getSubRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case ReferenceProcessPackage.REQUIREMENT__REQUIRED_REQUIREMENTS:
				getRequiredRequirements().clear();
				getRequiredRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case ReferenceProcessPackage.REQUIREMENT__REQUIRED_BY_REQUIREMENTS:
				getRequiredByRequirements().clear();
				getRequiredByRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case ReferenceProcessPackage.REQUIREMENT__RECOMMENTED_FROM:
				setRecommentedFrom((SafetyLevel)newValue);
				return;
			case ReferenceProcessPackage.REQUIREMENT__RECOMMENTED_TO:
				setRecommentedTo((SafetyLevel)newValue);
				return;
			case ReferenceProcessPackage.REQUIREMENT__COMPLIANCES:
				getCompliances().clear();
				getCompliances().addAll((Collection<? extends Compliance>)newValue);
				return;
			case ReferenceProcessPackage.REQUIREMENT__CLAIMING_PROCESS_MODULES:
				getClaimingProcessModules().clear();
				getClaimingProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
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
			case ReferenceProcessPackage.REQUIREMENT__VERIFIED_BY:
				getVerifiedBy().clear();
				return;
			case ReferenceProcessPackage.REQUIREMENT__SUB_REQUIREMENTS:
				getSubRequirements().clear();
				return;
			case ReferenceProcessPackage.REQUIREMENT__REQUIRED_REQUIREMENTS:
				getRequiredRequirements().clear();
				return;
			case ReferenceProcessPackage.REQUIREMENT__REQUIRED_BY_REQUIREMENTS:
				getRequiredByRequirements().clear();
				return;
			case ReferenceProcessPackage.REQUIREMENT__RECOMMENTED_FROM:
				setRecommentedFrom(RECOMMENTED_FROM_EDEFAULT);
				return;
			case ReferenceProcessPackage.REQUIREMENT__RECOMMENTED_TO:
				setRecommentedTo(RECOMMENTED_TO_EDEFAULT);
				return;
			case ReferenceProcessPackage.REQUIREMENT__COMPLIANCES:
				getCompliances().clear();
				return;
			case ReferenceProcessPackage.REQUIREMENT__CLAIMING_PROCESS_MODULES:
				getClaimingProcessModules().clear();
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
			case ReferenceProcessPackage.REQUIREMENT__VERIFIED_BY:
				return verifiedBy != null && !verifiedBy.isEmpty();
			case ReferenceProcessPackage.REQUIREMENT__SUB_REQUIREMENTS:
				return subRequirements != null && !subRequirements.isEmpty();
			case ReferenceProcessPackage.REQUIREMENT__REQUIRED_REQUIREMENTS:
				return requiredRequirements != null && !requiredRequirements.isEmpty();
			case ReferenceProcessPackage.REQUIREMENT__REQUIRED_BY_REQUIREMENTS:
				return requiredByRequirements != null && !requiredByRequirements.isEmpty();
			case ReferenceProcessPackage.REQUIREMENT__RECOMMENTED_FROM:
				return recommentedFrom != RECOMMENTED_FROM_EDEFAULT;
			case ReferenceProcessPackage.REQUIREMENT__RECOMMENTED_TO:
				return recommentedTo != RECOMMENTED_TO_EDEFAULT;
			case ReferenceProcessPackage.REQUIREMENT__COMPLIANCES:
				return compliances != null && !compliances.isEmpty();
			case ReferenceProcessPackage.REQUIREMENT__CLAIMING_PROCESS_MODULES:
				return claimingProcessModules != null && !claimingProcessModules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IVerified.class) {
			switch (derivedFeatureID) {
				case ReferenceProcessPackage.REQUIREMENT__VERIFIED_BY: return ReferenceProcessPackage.IVERIFIED__VERIFIED_BY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IVerified.class) {
			switch (baseFeatureID) {
				case ReferenceProcessPackage.IVERIFIED__VERIFIED_BY: return ReferenceProcessPackage.REQUIREMENT__VERIFIED_BY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (recommentedFrom: ");
		result.append(recommentedFrom);
		result.append(", recommentedTo: ");
		result.append(recommentedTo);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
