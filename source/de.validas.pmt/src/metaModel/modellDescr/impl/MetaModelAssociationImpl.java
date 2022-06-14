/**
 */
package metaModel.modellDescr.impl;

import java.util.Collection;

import metaModel.modellDescr.Cardinality;
import metaModel.modellDescr.MMCondition;
import metaModel.modellDescr.MetaModelAssociation;
import metaModel.modellDescr.MetaModelElement;
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
 * An implementation of the model object '<em><b>Meta Model Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelAssociationImpl#getMMConditions <em>MM Conditions</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelAssociationImpl#getMandatoryInModels <em>Mandatory In Models</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelAssociationImpl#getToElement <em>To Element</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelAssociationImpl#isContainment <em>Containment</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelAssociationImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelAssociationImpl#getOptionalInModels <em>Optional In Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaModelAssociationImpl extends NamedImpl implements MetaModelAssociation {
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
	 * The cached value of the '{@link #getToElement() <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElement()
	 * @generated
	 * @ordered
	 */
	protected MetaModelElement toElement;

	/**
	 * The default value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean containment = CONTAINMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.CARDINALITY_0TO_1;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARDINALITY_EDEFAULT;

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
	protected MetaModelAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModellDescrPackage.Literals.META_MODEL_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MMCondition> getMMConditions() {
		if (mmConditions == null) {
			mmConditions = new EObjectWithInverseResolvingEList.ManyInverse<MMCondition>(MMCondition.class, this, ModellDescrPackage.META_MODEL_ASSOCIATION__MM_CONDITIONS, ModellDescrPackage.MM_CONDITION__META_MODELL_ASSOCIATIONS);
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
			mandatoryInModels = new EObjectWithInverseResolvingEList.ManyInverse<Model>(Model.class, this, ModellDescrPackage.META_MODEL_ASSOCIATION__MANDATORY_IN_MODELS, ReferenceProcessPackage.MODEL__MANDATORY_ASSOCIATIONS);
		}
		return mandatoryInModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaModelElement getToElement() {
		if (toElement != null && toElement.eIsProxy()) {
			InternalEObject oldToElement = (InternalEObject)toElement;
			toElement = (MetaModelElement)eResolveProxy(oldToElement);
			if (toElement != oldToElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModellDescrPackage.META_MODEL_ASSOCIATION__TO_ELEMENT, oldToElement, toElement));
			}
		}
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelElement basicGetToElement() {
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToElement(MetaModelElement newToElement) {
		MetaModelElement oldToElement = toElement;
		toElement = newToElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellDescrPackage.META_MODEL_ASSOCIATION__TO_ELEMENT, oldToElement, toElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainment(boolean newContainment) {
		boolean oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellDescrPackage.META_MODEL_ASSOCIATION__CONTAINMENT, oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellDescrPackage.META_MODEL_ASSOCIATION__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model> getOptionalInModels() {
		if (optionalInModels == null) {
			optionalInModels = new EObjectWithInverseResolvingEList.ManyInverse<Model>(Model.class, this, ModellDescrPackage.META_MODEL_ASSOCIATION__OPTIONAL_IN_MODELS, ReferenceProcessPackage.MODEL__OPTIONAL_ASSOCIATIONS);
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
			case ModellDescrPackage.META_MODEL_ASSOCIATION__MM_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMMConditions()).basicAdd(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ASSOCIATION__MANDATORY_IN_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMandatoryInModels()).basicAdd(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ASSOCIATION__OPTIONAL_IN_MODELS:
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
			case ModellDescrPackage.META_MODEL_ASSOCIATION__MM_CONDITIONS:
				return ((InternalEList<?>)getMMConditions()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ASSOCIATION__MANDATORY_IN_MODELS:
				return ((InternalEList<?>)getMandatoryInModels()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ASSOCIATION__OPTIONAL_IN_MODELS:
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
			case ModellDescrPackage.META_MODEL_ASSOCIATION__MM_CONDITIONS:
				return getMMConditions();
			case ModellDescrPackage.META_MODEL_ASSOCIATION__MANDATORY_IN_MODELS:
				return getMandatoryInModels();
			case ModellDescrPackage.META_MODEL_ASSOCIATION__TO_ELEMENT:
				if (resolve) return getToElement();
				return basicGetToElement();
			case ModellDescrPackage.META_MODEL_ASSOCIATION__CONTAINMENT:
				return isContainment();
			case ModellDescrPackage.META_MODEL_ASSOCIATION__CARDINALITY:
				return getCardinality();
			case ModellDescrPackage.META_MODEL_ASSOCIATION__OPTIONAL_IN_MODELS:
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
			case ModellDescrPackage.META_MODEL_ASSOCIATION__MM_CONDITIONS:
				getMMConditions().clear();
				getMMConditions().addAll((Collection<? extends MMCondition>)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__MANDATORY_IN_MODELS:
				getMandatoryInModels().clear();
				getMandatoryInModels().addAll((Collection<? extends Model>)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__TO_ELEMENT:
				setToElement((MetaModelElement)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__CONTAINMENT:
				setContainment((Boolean)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__OPTIONAL_IN_MODELS:
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
			case ModellDescrPackage.META_MODEL_ASSOCIATION__MM_CONDITIONS:
				getMMConditions().clear();
				return;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__MANDATORY_IN_MODELS:
				getMandatoryInModels().clear();
				return;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__TO_ELEMENT:
				setToElement((MetaModelElement)null);
				return;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__OPTIONAL_IN_MODELS:
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
			case ModellDescrPackage.META_MODEL_ASSOCIATION__MM_CONDITIONS:
				return mmConditions != null && !mmConditions.isEmpty();
			case ModellDescrPackage.META_MODEL_ASSOCIATION__MANDATORY_IN_MODELS:
				return mandatoryInModels != null && !mandatoryInModels.isEmpty();
			case ModellDescrPackage.META_MODEL_ASSOCIATION__TO_ELEMENT:
				return toElement != null;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__CONTAINMENT:
				return containment != CONTAINMENT_EDEFAULT;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case ModellDescrPackage.META_MODEL_ASSOCIATION__OPTIONAL_IN_MODELS:
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
		result.append(" (Containment: ");
		result.append(containment);
		result.append(", Cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //MetaModelAssociationImpl
