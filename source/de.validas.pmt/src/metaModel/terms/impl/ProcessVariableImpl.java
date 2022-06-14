/**
 */
package metaModel.terms.impl;

import java.util.Collection;

import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ReferenceProcessPackage;

import metaModel.terms.ProcessVariable;
import metaModel.terms.TermsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.terms.impl.ProcessVariableImpl#getDeterminedByProcessModules <em>Determined By Process Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessVariableImpl extends ParameterImpl implements ProcessVariable {
	/**
	 * The cached value of the '{@link #getDeterminedByProcessModules() <em>Determined By Process Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeterminedByProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> determinedByProcessModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.PROCESS_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getDeterminedByProcessModules() {
		if (determinedByProcessModules == null) {
			determinedByProcessModules = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModule>(ProcessModule.class, this, TermsPackage.PROCESS_VARIABLE__DETERMINED_BY_PROCESS_MODULES, ReferenceProcessPackage.PROCESS_MODULE__DETERMINED_VARIABLES);
		}
		return determinedByProcessModules;
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
			case TermsPackage.PROCESS_VARIABLE__DETERMINED_BY_PROCESS_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeterminedByProcessModules()).basicAdd(otherEnd, msgs);
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
			case TermsPackage.PROCESS_VARIABLE__DETERMINED_BY_PROCESS_MODULES:
				return ((InternalEList<?>)getDeterminedByProcessModules()).basicRemove(otherEnd, msgs);
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
			case TermsPackage.PROCESS_VARIABLE__DETERMINED_BY_PROCESS_MODULES:
				return getDeterminedByProcessModules();
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
			case TermsPackage.PROCESS_VARIABLE__DETERMINED_BY_PROCESS_MODULES:
				getDeterminedByProcessModules().clear();
				getDeterminedByProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
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
			case TermsPackage.PROCESS_VARIABLE__DETERMINED_BY_PROCESS_MODULES:
				getDeterminedByProcessModules().clear();
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
			case TermsPackage.PROCESS_VARIABLE__DETERMINED_BY_PROCESS_MODULES:
				return determinedByProcessModules != null && !determinedByProcessModules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessVariableImpl
