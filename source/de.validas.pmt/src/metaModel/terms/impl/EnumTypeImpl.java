/**
 */
package metaModel.terms.impl;

import java.util.Collection;

import metaModel.terms.EnumType;
import metaModel.terms.EnumValue;
import metaModel.terms.TermsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.terms.impl.EnumTypeImpl#getEnumValues <em>Enum Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumTypeImpl extends TypeImpl implements EnumType {
	/**
	 * The cached value of the '{@link #getEnumValues() <em>Enum Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumValue> enumValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.ENUM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumValue> getEnumValues() {
		if (enumValues == null) {
			enumValues = new EObjectContainmentEList<EnumValue>(EnumValue.class, this, TermsPackage.ENUM_TYPE__ENUM_VALUES);
		}
		return enumValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.ENUM_TYPE__ENUM_VALUES:
				return ((InternalEList<?>)getEnumValues()).basicRemove(otherEnd, msgs);
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
			case TermsPackage.ENUM_TYPE__ENUM_VALUES:
				return getEnumValues();
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
			case TermsPackage.ENUM_TYPE__ENUM_VALUES:
				getEnumValues().clear();
				getEnumValues().addAll((Collection<? extends EnumValue>)newValue);
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
			case TermsPackage.ENUM_TYPE__ENUM_VALUES:
				getEnumValues().clear();
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
			case TermsPackage.ENUM_TYPE__ENUM_VALUES:
				return enumValues != null && !enumValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumTypeImpl
