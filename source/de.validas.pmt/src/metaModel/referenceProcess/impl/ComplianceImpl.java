/**
 */
package metaModel.referenceProcess.impl;

import java.util.Collection;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.VerificationModule;
import metaModel.suptertype.impl.VariantableImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compliance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.impl.ComplianceImpl#getProcessModules <em>Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ComplianceImpl#getStakeHolders <em>Stake Holders</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ComplianceImpl#getVerificationModules <em>Verification Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ComplianceImpl#getArtifatcs <em>Artifatcs</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ComplianceImpl#getSubCompliances <em>Sub Compliances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ComplianceImpl#isApplicable <em>Applicable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplianceImpl extends VariantableImpl implements Compliance {
	/**
	 * The cached value of the '{@link #getProcessModules() <em>Process Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> processModules;

	/**
	 * The cached value of the '{@link #getStakeHolders() <em>Stake Holders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeHolders()
	 * @generated
	 * @ordered
	 */
	protected EList<StakeHolder> stakeHolders;

	/**
	 * The cached value of the '{@link #getVerificationModules() <em>Verification Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationModules()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationModule> verificationModules;

	/**
	 * The cached value of the '{@link #getArtifatcs() <em>Artifatcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifatcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifatcs;

	/**
	 * The cached value of the '{@link #getSubCompliances() <em>Sub Compliances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCompliances()
	 * @generated
	 * @ordered
	 */
	protected EList<Compliance> subCompliances;

	/**
	 * The default value of the '{@link #isApplicable() <em>Applicable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isApplicable() <em>Applicable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicable()
	 * @generated
	 * @ordered
	 */
	protected boolean applicable = APPLICABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplianceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferenceProcessPackage.Literals.COMPLIANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getProcessModules() {
		if (processModules == null) {
			processModules = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.COMPLIANCE__PROCESS_MODULES, ReferenceProcessPackage.PROCESS_MODULE__COMPLIANCES);
		}
		return processModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StakeHolder> getStakeHolders() {
		if (stakeHolders == null) {
			stakeHolders = new EObjectWithInverseResolvingEList.ManyInverse<StakeHolder>(StakeHolder.class, this, ReferenceProcessPackage.COMPLIANCE__STAKE_HOLDERS, ReferenceProcessPackage.STAKE_HOLDER__COMPLIANCES);
		}
		return stakeHolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerificationModule> getVerificationModules() {
		if (verificationModules == null) {
			verificationModules = new EObjectWithInverseResolvingEList.ManyInverse<VerificationModule>(VerificationModule.class, this, ReferenceProcessPackage.COMPLIANCE__VERIFICATION_MODULES, ReferenceProcessPackage.VERIFICATION_MODULE__VERIFIED_COMPLIANCES);
		}
		return verificationModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getArtifatcs() {
		if (artifatcs == null) {
			artifatcs = new EObjectWithInverseResolvingEList.ManyInverse<Artifact>(Artifact.class, this, ReferenceProcessPackage.COMPLIANCE__ARTIFATCS, ReferenceProcessPackage.ARTIFACT__COMPLIANCES);
		}
		return artifatcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Compliance> getSubCompliances() {
		if (subCompliances == null) {
			subCompliances = new EObjectResolvingEList<Compliance>(Compliance.class, this, ReferenceProcessPackage.COMPLIANCE__SUB_COMPLIANCES);
		}
		return subCompliances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isApplicable() {
		return applicable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicable(boolean newApplicable) {
		boolean oldApplicable = applicable;
		applicable = newApplicable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.COMPLIANCE__APPLICABLE, oldApplicable, applicable));
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
			case ReferenceProcessPackage.COMPLIANCE__PROCESS_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessModules()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.COMPLIANCE__STAKE_HOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStakeHolders()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.COMPLIANCE__VERIFICATION_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVerificationModules()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.COMPLIANCE__ARTIFATCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArtifatcs()).basicAdd(otherEnd, msgs);
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
			case ReferenceProcessPackage.COMPLIANCE__PROCESS_MODULES:
				return ((InternalEList<?>)getProcessModules()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.COMPLIANCE__STAKE_HOLDERS:
				return ((InternalEList<?>)getStakeHolders()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.COMPLIANCE__VERIFICATION_MODULES:
				return ((InternalEList<?>)getVerificationModules()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.COMPLIANCE__ARTIFATCS:
				return ((InternalEList<?>)getArtifatcs()).basicRemove(otherEnd, msgs);
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
			case ReferenceProcessPackage.COMPLIANCE__PROCESS_MODULES:
				return getProcessModules();
			case ReferenceProcessPackage.COMPLIANCE__STAKE_HOLDERS:
				return getStakeHolders();
			case ReferenceProcessPackage.COMPLIANCE__VERIFICATION_MODULES:
				return getVerificationModules();
			case ReferenceProcessPackage.COMPLIANCE__ARTIFATCS:
				return getArtifatcs();
			case ReferenceProcessPackage.COMPLIANCE__SUB_COMPLIANCES:
				return getSubCompliances();
			case ReferenceProcessPackage.COMPLIANCE__APPLICABLE:
				return isApplicable();
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
			case ReferenceProcessPackage.COMPLIANCE__PROCESS_MODULES:
				getProcessModules().clear();
				getProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ReferenceProcessPackage.COMPLIANCE__STAKE_HOLDERS:
				getStakeHolders().clear();
				getStakeHolders().addAll((Collection<? extends StakeHolder>)newValue);
				return;
			case ReferenceProcessPackage.COMPLIANCE__VERIFICATION_MODULES:
				getVerificationModules().clear();
				getVerificationModules().addAll((Collection<? extends VerificationModule>)newValue);
				return;
			case ReferenceProcessPackage.COMPLIANCE__ARTIFATCS:
				getArtifatcs().clear();
				getArtifatcs().addAll((Collection<? extends Artifact>)newValue);
				return;
			case ReferenceProcessPackage.COMPLIANCE__SUB_COMPLIANCES:
				getSubCompliances().clear();
				getSubCompliances().addAll((Collection<? extends Compliance>)newValue);
				return;
			case ReferenceProcessPackage.COMPLIANCE__APPLICABLE:
				setApplicable((Boolean)newValue);
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
			case ReferenceProcessPackage.COMPLIANCE__PROCESS_MODULES:
				getProcessModules().clear();
				return;
			case ReferenceProcessPackage.COMPLIANCE__STAKE_HOLDERS:
				getStakeHolders().clear();
				return;
			case ReferenceProcessPackage.COMPLIANCE__VERIFICATION_MODULES:
				getVerificationModules().clear();
				return;
			case ReferenceProcessPackage.COMPLIANCE__ARTIFATCS:
				getArtifatcs().clear();
				return;
			case ReferenceProcessPackage.COMPLIANCE__SUB_COMPLIANCES:
				getSubCompliances().clear();
				return;
			case ReferenceProcessPackage.COMPLIANCE__APPLICABLE:
				setApplicable(APPLICABLE_EDEFAULT);
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
			case ReferenceProcessPackage.COMPLIANCE__PROCESS_MODULES:
				return processModules != null && !processModules.isEmpty();
			case ReferenceProcessPackage.COMPLIANCE__STAKE_HOLDERS:
				return stakeHolders != null && !stakeHolders.isEmpty();
			case ReferenceProcessPackage.COMPLIANCE__VERIFICATION_MODULES:
				return verificationModules != null && !verificationModules.isEmpty();
			case ReferenceProcessPackage.COMPLIANCE__ARTIFATCS:
				return artifatcs != null && !artifatcs.isEmpty();
			case ReferenceProcessPackage.COMPLIANCE__SUB_COMPLIANCES:
				return subCompliances != null && !subCompliances.isEmpty();
			case ReferenceProcessPackage.COMPLIANCE__APPLICABLE:
				return applicable != APPLICABLE_EDEFAULT;
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
		result.append(" (Applicable: ");
		result.append(applicable);
		result.append(')');
		return result.toString();
	}

} //ComplianceImpl
