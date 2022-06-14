/**
 */
package metaModel.modellDescr.impl;

import java.util.Collection;

import metaModel.modellDescr.MMCondition;
import metaModel.modellDescr.MetaModelAssociation;
import metaModel.modellDescr.MetaModelAttribute;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelElementImpl#getMMConditions <em>MM Conditions</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelElementImpl#getMetaModelAttributes <em>Meta Model Attributes</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelElementImpl#getMetaModelAssociations <em>Meta Model Associations</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelElementImpl#getMandatoryInModels <em>Mandatory In Models</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelElementImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelElementImpl#isIsRoot <em>Is Root</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelElementImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelElementImpl#getOptionalInModels <em>Optional In Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaModelElementImpl extends NamedImpl implements MetaModelElement {
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
	 * The cached value of the '{@link #getMetaModelAttributes() <em>Meta Model Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelAttribute> metaModelAttributes;

	/**
	 * The cached value of the '{@link #getMetaModelAssociations() <em>Meta Model Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelAssociation> metaModelAssociations;

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
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelElement> parents;

	/**
	 * The default value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean isRoot = IS_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

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
	protected MetaModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModellDescrPackage.Literals.META_MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MMCondition> getMMConditions() {
		if (mmConditions == null) {
			mmConditions = new EObjectWithInverseResolvingEList.ManyInverse<MMCondition>(MMCondition.class, this, ModellDescrPackage.META_MODEL_ELEMENT__MM_CONDITIONS, ModellDescrPackage.MM_CONDITION__META_MODELL_ELEMENTS);
		}
		return mmConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelAttribute> getMetaModelAttributes() {
		if (metaModelAttributes == null) {
			metaModelAttributes = new EObjectContainmentEList<MetaModelAttribute>(MetaModelAttribute.class, this, ModellDescrPackage.META_MODEL_ELEMENT__META_MODEL_ATTRIBUTES);
		}
		return metaModelAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelAssociation> getMetaModelAssociations() {
		if (metaModelAssociations == null) {
			metaModelAssociations = new EObjectContainmentEList<MetaModelAssociation>(MetaModelAssociation.class, this, ModellDescrPackage.META_MODEL_ELEMENT__META_MODEL_ASSOCIATIONS);
		}
		return metaModelAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model> getMandatoryInModels() {
		if (mandatoryInModels == null) {
			mandatoryInModels = new EObjectWithInverseResolvingEList.ManyInverse<Model>(Model.class, this, ModellDescrPackage.META_MODEL_ELEMENT__MANDATORY_IN_MODELS, ReferenceProcessPackage.MODEL__MANDATORY_ELEMENTS);
		}
		return mandatoryInModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelElement> getParents() {
		if (parents == null) {
			parents = new EObjectResolvingEList<MetaModelElement>(MetaModelElement.class, this, ModellDescrPackage.META_MODEL_ELEMENT__PARENTS);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRoot() {
		return isRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRoot(boolean newIsRoot) {
		boolean oldIsRoot = isRoot;
		isRoot = newIsRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellDescrPackage.META_MODEL_ELEMENT__IS_ROOT, oldIsRoot, isRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellDescrPackage.META_MODEL_ELEMENT__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model> getOptionalInModels() {
		if (optionalInModels == null) {
			optionalInModels = new EObjectWithInverseResolvingEList.ManyInverse<Model>(Model.class, this, ModellDescrPackage.META_MODEL_ELEMENT__OPTIONAL_IN_MODELS, ReferenceProcessPackage.MODEL__OPTIONAL_ELEMENTS);
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
			case ModellDescrPackage.META_MODEL_ELEMENT__MM_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMMConditions()).basicAdd(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ELEMENT__MANDATORY_IN_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMandatoryInModels()).basicAdd(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ELEMENT__OPTIONAL_IN_MODELS:
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
			case ModellDescrPackage.META_MODEL_ELEMENT__MM_CONDITIONS:
				return ((InternalEList<?>)getMMConditions()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ELEMENT__META_MODEL_ATTRIBUTES:
				return ((InternalEList<?>)getMetaModelAttributes()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ELEMENT__META_MODEL_ASSOCIATIONS:
				return ((InternalEList<?>)getMetaModelAssociations()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ELEMENT__MANDATORY_IN_MODELS:
				return ((InternalEList<?>)getMandatoryInModels()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL_ELEMENT__OPTIONAL_IN_MODELS:
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
			case ModellDescrPackage.META_MODEL_ELEMENT__MM_CONDITIONS:
				return getMMConditions();
			case ModellDescrPackage.META_MODEL_ELEMENT__META_MODEL_ATTRIBUTES:
				return getMetaModelAttributes();
			case ModellDescrPackage.META_MODEL_ELEMENT__META_MODEL_ASSOCIATIONS:
				return getMetaModelAssociations();
			case ModellDescrPackage.META_MODEL_ELEMENT__MANDATORY_IN_MODELS:
				return getMandatoryInModels();
			case ModellDescrPackage.META_MODEL_ELEMENT__PARENTS:
				return getParents();
			case ModellDescrPackage.META_MODEL_ELEMENT__IS_ROOT:
				return isIsRoot();
			case ModellDescrPackage.META_MODEL_ELEMENT__IS_ABSTRACT:
				return isIsAbstract();
			case ModellDescrPackage.META_MODEL_ELEMENT__OPTIONAL_IN_MODELS:
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
			case ModellDescrPackage.META_MODEL_ELEMENT__MM_CONDITIONS:
				getMMConditions().clear();
				getMMConditions().addAll((Collection<? extends MMCondition>)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__META_MODEL_ATTRIBUTES:
				getMetaModelAttributes().clear();
				getMetaModelAttributes().addAll((Collection<? extends MetaModelAttribute>)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__META_MODEL_ASSOCIATIONS:
				getMetaModelAssociations().clear();
				getMetaModelAssociations().addAll((Collection<? extends MetaModelAssociation>)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__MANDATORY_IN_MODELS:
				getMandatoryInModels().clear();
				getMandatoryInModels().addAll((Collection<? extends Model>)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends MetaModelElement>)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__IS_ROOT:
				setIsRoot((Boolean)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__OPTIONAL_IN_MODELS:
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
			case ModellDescrPackage.META_MODEL_ELEMENT__MM_CONDITIONS:
				getMMConditions().clear();
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__META_MODEL_ATTRIBUTES:
				getMetaModelAttributes().clear();
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__META_MODEL_ASSOCIATIONS:
				getMetaModelAssociations().clear();
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__MANDATORY_IN_MODELS:
				getMandatoryInModels().clear();
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__PARENTS:
				getParents().clear();
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__IS_ROOT:
				setIsRoot(IS_ROOT_EDEFAULT);
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case ModellDescrPackage.META_MODEL_ELEMENT__OPTIONAL_IN_MODELS:
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
			case ModellDescrPackage.META_MODEL_ELEMENT__MM_CONDITIONS:
				return mmConditions != null && !mmConditions.isEmpty();
			case ModellDescrPackage.META_MODEL_ELEMENT__META_MODEL_ATTRIBUTES:
				return metaModelAttributes != null && !metaModelAttributes.isEmpty();
			case ModellDescrPackage.META_MODEL_ELEMENT__META_MODEL_ASSOCIATIONS:
				return metaModelAssociations != null && !metaModelAssociations.isEmpty();
			case ModellDescrPackage.META_MODEL_ELEMENT__MANDATORY_IN_MODELS:
				return mandatoryInModels != null && !mandatoryInModels.isEmpty();
			case ModellDescrPackage.META_MODEL_ELEMENT__PARENTS:
				return parents != null && !parents.isEmpty();
			case ModellDescrPackage.META_MODEL_ELEMENT__IS_ROOT:
				return isRoot != IS_ROOT_EDEFAULT;
			case ModellDescrPackage.META_MODEL_ELEMENT__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case ModellDescrPackage.META_MODEL_ELEMENT__OPTIONAL_IN_MODELS:
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
		result.append(" (IsRoot: ");
		result.append(isRoot);
		result.append(", IsAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //MetaModelElementImpl
