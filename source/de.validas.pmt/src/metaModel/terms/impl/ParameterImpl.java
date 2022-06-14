/**
 */
package metaModel.terms.impl;

import java.util.Collection;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.suptertype.impl.NamedImpl;
import metaModel.terms.Binding;
import metaModel.terms.Parameter;
import metaModel.terms.TermsPackage;
import metaModel.terms.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.terms.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link metaModel.terms.impl.ParameterImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link metaModel.terms.impl.ParameterImpl#getValueFromListParameter <em>Value From List Parameter</em>}</li>
 *   <li>{@link metaModel.terms.impl.ParameterImpl#getIteratorParameters <em>Iterator Parameters</em>}</li>
 *   <li>{@link metaModel.terms.impl.ParameterImpl#getReusingProcessModules <em>Reusing Process Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParameterImpl extends NamedImpl implements Parameter {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> binding;

	/**
	 * The cached value of the '{@link #getValueFromListParameter() <em>Value From List Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFromListParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter valueFromListParameter;

	/**
	 * The cached value of the '{@link #getIteratorParameters() <em>Iterator Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteratorParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> iteratorParameters;

	/**
	 * The cached value of the '{@link #getReusingProcessModules() <em>Reusing Process Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReusingProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> reusingProcessModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermsPackage.PARAMETER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermsPackage.PARAMETER__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, TermsPackage.TYPE__PARAMETERS, Type.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, TermsPackage.TYPE__PARAMETERS, Type.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.PARAMETER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectWithInverseResolvingEList<Binding>(Binding.class, this, TermsPackage.PARAMETER__BINDING, TermsPackage.BINDING__PARAMETER);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getValueFromListParameter() {
		if (valueFromListParameter != null && valueFromListParameter.eIsProxy()) {
			InternalEObject oldValueFromListParameter = (InternalEObject)valueFromListParameter;
			valueFromListParameter = (Parameter)eResolveProxy(oldValueFromListParameter);
			if (valueFromListParameter != oldValueFromListParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermsPackage.PARAMETER__VALUE_FROM_LIST_PARAMETER, oldValueFromListParameter, valueFromListParameter));
			}
		}
		return valueFromListParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetValueFromListParameter() {
		return valueFromListParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueFromListParameter(Parameter newValueFromListParameter, NotificationChain msgs) {
		Parameter oldValueFromListParameter = valueFromListParameter;
		valueFromListParameter = newValueFromListParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermsPackage.PARAMETER__VALUE_FROM_LIST_PARAMETER, oldValueFromListParameter, newValueFromListParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueFromListParameter(Parameter newValueFromListParameter) {
		if (newValueFromListParameter != valueFromListParameter) {
			NotificationChain msgs = null;
			if (valueFromListParameter != null)
				msgs = ((InternalEObject)valueFromListParameter).eInverseRemove(this, TermsPackage.PARAMETER__ITERATOR_PARAMETERS, Parameter.class, msgs);
			if (newValueFromListParameter != null)
				msgs = ((InternalEObject)newValueFromListParameter).eInverseAdd(this, TermsPackage.PARAMETER__ITERATOR_PARAMETERS, Parameter.class, msgs);
			msgs = basicSetValueFromListParameter(newValueFromListParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.PARAMETER__VALUE_FROM_LIST_PARAMETER, newValueFromListParameter, newValueFromListParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getIteratorParameters() {
		if (iteratorParameters == null) {
			iteratorParameters = new EObjectWithInverseResolvingEList<Parameter>(Parameter.class, this, TermsPackage.PARAMETER__ITERATOR_PARAMETERS, TermsPackage.PARAMETER__VALUE_FROM_LIST_PARAMETER);
		}
		return iteratorParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getReusingProcessModules() {
		if (reusingProcessModules == null) {
			reusingProcessModules = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModule>(ProcessModule.class, this, TermsPackage.PARAMETER__REUSING_PROCESS_MODULES, ReferenceProcessPackage.PROCESS_MODULE__PARAMETER_REFERENCES);
		}
		return reusingProcessModules;
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
			case TermsPackage.PARAMETER__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, TermsPackage.TYPE__PARAMETERS, Type.class, msgs);
				return basicSetType((Type)otherEnd, msgs);
			case TermsPackage.PARAMETER__BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBinding()).basicAdd(otherEnd, msgs);
			case TermsPackage.PARAMETER__VALUE_FROM_LIST_PARAMETER:
				if (valueFromListParameter != null)
					msgs = ((InternalEObject)valueFromListParameter).eInverseRemove(this, TermsPackage.PARAMETER__ITERATOR_PARAMETERS, Parameter.class, msgs);
				return basicSetValueFromListParameter((Parameter)otherEnd, msgs);
			case TermsPackage.PARAMETER__ITERATOR_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIteratorParameters()).basicAdd(otherEnd, msgs);
			case TermsPackage.PARAMETER__REUSING_PROCESS_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReusingProcessModules()).basicAdd(otherEnd, msgs);
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
			case TermsPackage.PARAMETER__TYPE:
				return basicSetType(null, msgs);
			case TermsPackage.PARAMETER__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
			case TermsPackage.PARAMETER__VALUE_FROM_LIST_PARAMETER:
				return basicSetValueFromListParameter(null, msgs);
			case TermsPackage.PARAMETER__ITERATOR_PARAMETERS:
				return ((InternalEList<?>)getIteratorParameters()).basicRemove(otherEnd, msgs);
			case TermsPackage.PARAMETER__REUSING_PROCESS_MODULES:
				return ((InternalEList<?>)getReusingProcessModules()).basicRemove(otherEnd, msgs);
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
			case TermsPackage.PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TermsPackage.PARAMETER__BINDING:
				return getBinding();
			case TermsPackage.PARAMETER__VALUE_FROM_LIST_PARAMETER:
				if (resolve) return getValueFromListParameter();
				return basicGetValueFromListParameter();
			case TermsPackage.PARAMETER__ITERATOR_PARAMETERS:
				return getIteratorParameters();
			case TermsPackage.PARAMETER__REUSING_PROCESS_MODULES:
				return getReusingProcessModules();
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
			case TermsPackage.PARAMETER__TYPE:
				setType((Type)newValue);
				return;
			case TermsPackage.PARAMETER__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends Binding>)newValue);
				return;
			case TermsPackage.PARAMETER__VALUE_FROM_LIST_PARAMETER:
				setValueFromListParameter((Parameter)newValue);
				return;
			case TermsPackage.PARAMETER__ITERATOR_PARAMETERS:
				getIteratorParameters().clear();
				getIteratorParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TermsPackage.PARAMETER__REUSING_PROCESS_MODULES:
				getReusingProcessModules().clear();
				getReusingProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
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
			case TermsPackage.PARAMETER__TYPE:
				setType((Type)null);
				return;
			case TermsPackage.PARAMETER__BINDING:
				getBinding().clear();
				return;
			case TermsPackage.PARAMETER__VALUE_FROM_LIST_PARAMETER:
				setValueFromListParameter((Parameter)null);
				return;
			case TermsPackage.PARAMETER__ITERATOR_PARAMETERS:
				getIteratorParameters().clear();
				return;
			case TermsPackage.PARAMETER__REUSING_PROCESS_MODULES:
				getReusingProcessModules().clear();
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
			case TermsPackage.PARAMETER__TYPE:
				return type != null;
			case TermsPackage.PARAMETER__BINDING:
				return binding != null && !binding.isEmpty();
			case TermsPackage.PARAMETER__VALUE_FROM_LIST_PARAMETER:
				return valueFromListParameter != null;
			case TermsPackage.PARAMETER__ITERATOR_PARAMETERS:
				return iteratorParameters != null && !iteratorParameters.isEmpty();
			case TermsPackage.PARAMETER__REUSING_PROCESS_MODULES:
				return reusingProcessModules != null && !reusingProcessModules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterImpl
