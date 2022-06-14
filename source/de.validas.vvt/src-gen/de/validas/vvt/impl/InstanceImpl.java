/**
 */
package de.validas.vvt.impl;

import de.validas.vvt.Instance;
import de.validas.vvt.Parameter;
import de.validas.vvt.ParameterValue;
import de.validas.vvt.VvtPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.impl.InstanceImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.validas.vvt.impl.InstanceImpl#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends MinimalEObjectImpl.Container implements Instance {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The cached value of the '{@link #getParameterValue() <em>Parameter Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValue()
	 * @generated
	 * @ordered
	 */
	protected ParameterValue parameterValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VvtPackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (Parameter) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VvtPackage.INSTANCE__PARAMETER,
							oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.INSTANCE__PARAMETER, oldParameter,
					parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterValue getParameterValue() {
		if (parameterValue != null && parameterValue.eIsProxy()) {
			InternalEObject oldParameterValue = (InternalEObject) parameterValue;
			parameterValue = (ParameterValue) eResolveProxy(oldParameterValue);
			if (parameterValue != oldParameterValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VvtPackage.INSTANCE__PARAMETER_VALUE,
							oldParameterValue, parameterValue));
			}
		}
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue basicGetParameterValue() {
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterValue(ParameterValue newParameterValue) {
		ParameterValue oldParameterValue = parameterValue;
		parameterValue = newParameterValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VvtPackage.INSTANCE__PARAMETER_VALUE,
					oldParameterValue, parameterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VvtPackage.INSTANCE__PARAMETER:
			if (resolve)
				return getParameter();
			return basicGetParameter();
		case VvtPackage.INSTANCE__PARAMETER_VALUE:
			if (resolve)
				return getParameterValue();
			return basicGetParameterValue();
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
		case VvtPackage.INSTANCE__PARAMETER:
			setParameter((Parameter) newValue);
			return;
		case VvtPackage.INSTANCE__PARAMETER_VALUE:
			setParameterValue((ParameterValue) newValue);
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
		case VvtPackage.INSTANCE__PARAMETER:
			setParameter((Parameter) null);
			return;
		case VvtPackage.INSTANCE__PARAMETER_VALUE:
			setParameterValue((ParameterValue) null);
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
		case VvtPackage.INSTANCE__PARAMETER:
			return parameter != null;
		case VvtPackage.INSTANCE__PARAMETER_VALUE:
			return parameterValue != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceImpl
