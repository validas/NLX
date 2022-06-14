/**
 */
package metaModel.modellDescr.impl;

import java.util.Collection;

import metaModel.modellDescr.MMCondition;
import metaModel.modellDescr.MetaModelAttribute;
import metaModel.modellDescr.ModellDescrPackage;

import metaModel.referenceProcess.Model;
import metaModel.referenceProcess.ReferenceProcessPackage;

import metaModel.suptertype.impl.NamedImpl;

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
 * An implementation of the model object '<em><b>Meta Model Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelAttributeImpl#getMMConditions <em>MM Conditions</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelAttributeImpl#getMandatoryInModels <em>Mandatory In Models</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelAttributeImpl#getOptionalInModels <em>Optional In Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaModelAttributeImpl extends NamedImpl implements MetaModelAttribute {
	/**
	 * The cached value of the '{@link #getMMConditions() <em>MM Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<MMCondition> mmConditions;

	/**
	 * The cached value of the '{@link #getMandatoryInModels() <em>Mandatory In Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryInModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> mandatoryInModels;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptionalInModels() <em>Optional In Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalInModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> optionalInModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModelAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModellDescrPackage.Literals.META_MODEL_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MMCondition> getMMConditions() {
		if (mmConditions == null) {
			mmConditions = new EObjectWithInverseResolvingEList.ManyInverse<MMCondition>(MMCondition.class, this, ModellDescrPackage.META_MODEL_ATTRIBUTE__MM_CONDITIONS, ModellDescrPackage.MM_CONDITION__META_MODELL_ATTRIBUTES);
		}
		return mmConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model> getMandatoryInModels() {
		if (mandatoryInModels == null) {
			mandatoryInModels = new EObjectWithInverseResolvingEList.ManyInverse<Model>(Model.class, this, ModellDescrPackage.META_MODEL_ATTRIBUTE__MANDATORY_IN_MODELS, ReferenceProcessPackage.MODEL__MANDATORY_ATTRIBUTES);
		}
		return mandatoryInModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellDescrPackage.META_MODEL_ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model> getOptionalInModels() {
		if (optionalInModels == null) {
			optionalInModels = new EObjectWithInverseResolvingEList.ManyInverse<Model>(Model.class, this, ModellDescrPackage.META_MODEL_ATTRIBUTE__OPTIONAL_IN_MODELS, ReferenceProcessPackage.MODEL__OPTIONAL_ATTRIBUTES);
		}
		return optionalInModels;
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
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__MM_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMMConditions()).basicAdd(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__MANDATORY_IN_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMandatoryInModels()).basicAdd(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__OPTIONAL_IN_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOptionalInModels()).basicAdd(otherEnd, msgs);
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
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__MM_CONDITIONS:
				return ((InternalEList<?>)getMMConditions()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__MANDATORY_IN_MODELS:
				return ((InternalEList<?>)getMandatoryInModels()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__OPTIONAL_IN_MODELS:
				return ((InternalEList<?>)getOptionalInModels()).basicRemove(otherEnd, msgs);
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
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__MM_CONDITIONS:
				return getMMConditions();
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__MANDATORY_IN_MODELS:
				return getMandatoryInModels();
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__TYPE:
				return getType();
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__OPTIONAL_IN_MODELS:
				return getOptionalInModels();
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
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__MM_CONDITIONS:
				getMMConditions().clear();
				getMMConditions().addAll((Collection<? extends MMCondition>)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__MANDATORY_IN_MODELS:
				getMandatoryInModels().clear();
				getMandatoryInModels().addAll((Collection<? extends Model>)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__TYPE:
				setType((String)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__OPTIONAL_IN_MODELS:
				getOptionalInModels().clear();
				getOptionalInModels().addAll((Collection<? extends Model>)newValue);
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
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__MM_CONDITIONS:
				getMMConditions().clear();
				return;
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__MANDATORY_IN_MODELS:
				getMandatoryInModels().clear();
				return;
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__OPTIONAL_IN_MODELS:
				getOptionalInModels().clear();
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
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__MM_CONDITIONS:
				return mmConditions != null && !mmConditions.isEmpty();
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__MANDATORY_IN_MODELS:
				return mandatoryInModels != null && !mandatoryInModels.isEmpty();
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ModellDescrPackage.META_MODEL_ATTRIBUTE__OPTIONAL_IN_MODELS:
				return optionalInModels != null && !optionalInModels.isEmpty();
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
		result.append(" (Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MetaModelAttributeImpl
