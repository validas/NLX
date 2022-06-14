/**
 */
package metaModel.referenceProcess.impl;

import java.util.Collection;

import metaModel.modellDescr.MetaModel;
import metaModel.modellDescr.MetaModelAssociation;
import metaModel.modellDescr.MetaModelAttribute;
import metaModel.modellDescr.MetaModelElement;
import metaModel.modellDescr.ModellDescrPackage;

import metaModel.referenceProcess.Model;
import metaModel.referenceProcess.ReferenceProcessPackage;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.impl.ModelImpl#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ModelImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ModelImpl#getIsIncludedIn <em>Is Included In</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ModelImpl#getMandatoryElements <em>Mandatory Elements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ModelImpl#getMandatoryAttributes <em>Mandatory Attributes</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ModelImpl#getMandatoryAssociations <em>Mandatory Associations</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ModelImpl#getOptionalElements <em>Optional Elements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ModelImpl#getOptionalAttributes <em>Optional Attributes</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ModelImpl#getOptionalAssociations <em>Optional Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends ArtifactImpl implements Model {
	/**
	 * The cached value of the '{@link #getMetaModel() <em>Meta Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModel()
	 * @generated
	 * @ordered
	 */
	protected MetaModel metaModel;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> includes;

	/**
	 * The cached value of the '{@link #getIsIncludedIn() <em>Is Included In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIncludedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> isIncludedIn;

	/**
	 * The cached value of the '{@link #getMandatoryElements() <em>Mandatory Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelElement> mandatoryElements;

	/**
	 * The cached value of the '{@link #getMandatoryAttributes() <em>Mandatory Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelAttribute> mandatoryAttributes;

	/**
	 * The cached value of the '{@link #getMandatoryAssociations() <em>Mandatory Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelAssociation> mandatoryAssociations;

	/**
	 * The cached value of the '{@link #getOptionalElements() <em>Optional Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelElement> optionalElements;

	/**
	 * The cached value of the '{@link #getOptionalAttributes() <em>Optional Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelAttribute> optionalAttributes;

	/**
	 * The cached value of the '{@link #getOptionalAssociations() <em>Optional Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelAssociation> optionalAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferenceProcessPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaModel getMetaModel() {
		return metaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaModel(MetaModel newMetaModel, NotificationChain msgs) {
		MetaModel oldMetaModel = metaModel;
		metaModel = newMetaModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.MODEL__META_MODEL, oldMetaModel, newMetaModel);
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
	public void setMetaModel(MetaModel newMetaModel) {
		if (newMetaModel != metaModel) {
			NotificationChain msgs = null;
			if (metaModel != null)
				msgs = ((InternalEObject)metaModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferenceProcessPackage.MODEL__META_MODEL, null, msgs);
			if (newMetaModel != null)
				msgs = ((InternalEObject)newMetaModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferenceProcessPackage.MODEL__META_MODEL, null, msgs);
			msgs = basicSetMetaModel(newMetaModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.MODEL__META_MODEL, newMetaModel, newMetaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model> getIncludes() {
		if (includes == null) {
			includes = new EObjectWithInverseResolvingEList.ManyInverse<Model>(Model.class, this, ReferenceProcessPackage.MODEL__INCLUDES, ReferenceProcessPackage.MODEL__IS_INCLUDED_IN);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model> getIsIncludedIn() {
		if (isIncludedIn == null) {
			isIncludedIn = new EObjectWithInverseResolvingEList.ManyInverse<Model>(Model.class, this, ReferenceProcessPackage.MODEL__IS_INCLUDED_IN, ReferenceProcessPackage.MODEL__INCLUDES);
		}
		return isIncludedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelElement> getMandatoryElements() {
		if (mandatoryElements == null) {
			mandatoryElements = new EObjectWithInverseResolvingEList.ManyInverse<MetaModelElement>(MetaModelElement.class, this, ReferenceProcessPackage.MODEL__MANDATORY_ELEMENTS, ModellDescrPackage.META_MODEL_ELEMENT__MANDATORY_IN_MODELS);
		}
		return mandatoryElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelAttribute> getMandatoryAttributes() {
		if (mandatoryAttributes == null) {
			mandatoryAttributes = new EObjectWithInverseResolvingEList.ManyInverse<MetaModelAttribute>(MetaModelAttribute.class, this, ReferenceProcessPackage.MODEL__MANDATORY_ATTRIBUTES, ModellDescrPackage.META_MODEL_ATTRIBUTE__MANDATORY_IN_MODELS);
		}
		return mandatoryAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelAssociation> getMandatoryAssociations() {
		if (mandatoryAssociations == null) {
			mandatoryAssociations = new EObjectWithInverseResolvingEList.ManyInverse<MetaModelAssociation>(MetaModelAssociation.class, this, ReferenceProcessPackage.MODEL__MANDATORY_ASSOCIATIONS, ModellDescrPackage.META_MODEL_ASSOCIATION__MANDATORY_IN_MODELS);
		}
		return mandatoryAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelElement> getOptionalElements() {
		if (optionalElements == null) {
			optionalElements = new EObjectWithInverseResolvingEList.ManyInverse<MetaModelElement>(MetaModelElement.class, this, ReferenceProcessPackage.MODEL__OPTIONAL_ELEMENTS, ModellDescrPackage.META_MODEL_ELEMENT__OPTIONAL_IN_MODELS);
		}
		return optionalElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelAttribute> getOptionalAttributes() {
		if (optionalAttributes == null) {
			optionalAttributes = new EObjectWithInverseResolvingEList.ManyInverse<MetaModelAttribute>(MetaModelAttribute.class, this, ReferenceProcessPackage.MODEL__OPTIONAL_ATTRIBUTES, ModellDescrPackage.META_MODEL_ATTRIBUTE__OPTIONAL_IN_MODELS);
		}
		return optionalAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelAssociation> getOptionalAssociations() {
		if (optionalAssociations == null) {
			optionalAssociations = new EObjectWithInverseResolvingEList.ManyInverse<MetaModelAssociation>(MetaModelAssociation.class, this, ReferenceProcessPackage.MODEL__OPTIONAL_ASSOCIATIONS, ModellDescrPackage.META_MODEL_ASSOCIATION__OPTIONAL_IN_MODELS);
		}
		return optionalAssociations;
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
			case ReferenceProcessPackage.MODEL__INCLUDES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludes()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__IS_INCLUDED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsIncludedIn()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__MANDATORY_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMandatoryElements()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__MANDATORY_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMandatoryAttributes()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__MANDATORY_ASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMandatoryAssociations()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__OPTIONAL_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOptionalElements()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__OPTIONAL_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOptionalAttributes()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__OPTIONAL_ASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOptionalAssociations()).basicAdd(otherEnd, msgs);
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
			case ReferenceProcessPackage.MODEL__META_MODEL:
				return basicSetMetaModel(null, msgs);
			case ReferenceProcessPackage.MODEL__INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__IS_INCLUDED_IN:
				return ((InternalEList<?>)getIsIncludedIn()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__MANDATORY_ELEMENTS:
				return ((InternalEList<?>)getMandatoryElements()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__MANDATORY_ATTRIBUTES:
				return ((InternalEList<?>)getMandatoryAttributes()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__MANDATORY_ASSOCIATIONS:
				return ((InternalEList<?>)getMandatoryAssociations()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__OPTIONAL_ELEMENTS:
				return ((InternalEList<?>)getOptionalElements()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__OPTIONAL_ATTRIBUTES:
				return ((InternalEList<?>)getOptionalAttributes()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.MODEL__OPTIONAL_ASSOCIATIONS:
				return ((InternalEList<?>)getOptionalAssociations()).basicRemove(otherEnd, msgs);
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
			case ReferenceProcessPackage.MODEL__META_MODEL:
				return getMetaModel();
			case ReferenceProcessPackage.MODEL__INCLUDES:
				return getIncludes();
			case ReferenceProcessPackage.MODEL__IS_INCLUDED_IN:
				return getIsIncludedIn();
			case ReferenceProcessPackage.MODEL__MANDATORY_ELEMENTS:
				return getMandatoryElements();
			case ReferenceProcessPackage.MODEL__MANDATORY_ATTRIBUTES:
				return getMandatoryAttributes();
			case ReferenceProcessPackage.MODEL__MANDATORY_ASSOCIATIONS:
				return getMandatoryAssociations();
			case ReferenceProcessPackage.MODEL__OPTIONAL_ELEMENTS:
				return getOptionalElements();
			case ReferenceProcessPackage.MODEL__OPTIONAL_ATTRIBUTES:
				return getOptionalAttributes();
			case ReferenceProcessPackage.MODEL__OPTIONAL_ASSOCIATIONS:
				return getOptionalAssociations();
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
			case ReferenceProcessPackage.MODEL__META_MODEL:
				setMetaModel((MetaModel)newValue);
				return;
			case ReferenceProcessPackage.MODEL__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends Model>)newValue);
				return;
			case ReferenceProcessPackage.MODEL__IS_INCLUDED_IN:
				getIsIncludedIn().clear();
				getIsIncludedIn().addAll((Collection<? extends Model>)newValue);
				return;
			case ReferenceProcessPackage.MODEL__MANDATORY_ELEMENTS:
				getMandatoryElements().clear();
				getMandatoryElements().addAll((Collection<? extends MetaModelElement>)newValue);
				return;
			case ReferenceProcessPackage.MODEL__MANDATORY_ATTRIBUTES:
				getMandatoryAttributes().clear();
				getMandatoryAttributes().addAll((Collection<? extends MetaModelAttribute>)newValue);
				return;
			case ReferenceProcessPackage.MODEL__MANDATORY_ASSOCIATIONS:
				getMandatoryAssociations().clear();
				getMandatoryAssociations().addAll((Collection<? extends MetaModelAssociation>)newValue);
				return;
			case ReferenceProcessPackage.MODEL__OPTIONAL_ELEMENTS:
				getOptionalElements().clear();
				getOptionalElements().addAll((Collection<? extends MetaModelElement>)newValue);
				return;
			case ReferenceProcessPackage.MODEL__OPTIONAL_ATTRIBUTES:
				getOptionalAttributes().clear();
				getOptionalAttributes().addAll((Collection<? extends MetaModelAttribute>)newValue);
				return;
			case ReferenceProcessPackage.MODEL__OPTIONAL_ASSOCIATIONS:
				getOptionalAssociations().clear();
				getOptionalAssociations().addAll((Collection<? extends MetaModelAssociation>)newValue);
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
			case ReferenceProcessPackage.MODEL__META_MODEL:
				setMetaModel((MetaModel)null);
				return;
			case ReferenceProcessPackage.MODEL__INCLUDES:
				getIncludes().clear();
				return;
			case ReferenceProcessPackage.MODEL__IS_INCLUDED_IN:
				getIsIncludedIn().clear();
				return;
			case ReferenceProcessPackage.MODEL__MANDATORY_ELEMENTS:
				getMandatoryElements().clear();
				return;
			case ReferenceProcessPackage.MODEL__MANDATORY_ATTRIBUTES:
				getMandatoryAttributes().clear();
				return;
			case ReferenceProcessPackage.MODEL__MANDATORY_ASSOCIATIONS:
				getMandatoryAssociations().clear();
				return;
			case ReferenceProcessPackage.MODEL__OPTIONAL_ELEMENTS:
				getOptionalElements().clear();
				return;
			case ReferenceProcessPackage.MODEL__OPTIONAL_ATTRIBUTES:
				getOptionalAttributes().clear();
				return;
			case ReferenceProcessPackage.MODEL__OPTIONAL_ASSOCIATIONS:
				getOptionalAssociations().clear();
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
			case ReferenceProcessPackage.MODEL__META_MODEL:
				return metaModel != null;
			case ReferenceProcessPackage.MODEL__INCLUDES:
				return includes != null && !includes.isEmpty();
			case ReferenceProcessPackage.MODEL__IS_INCLUDED_IN:
				return isIncludedIn != null && !isIncludedIn.isEmpty();
			case ReferenceProcessPackage.MODEL__MANDATORY_ELEMENTS:
				return mandatoryElements != null && !mandatoryElements.isEmpty();
			case ReferenceProcessPackage.MODEL__MANDATORY_ATTRIBUTES:
				return mandatoryAttributes != null && !mandatoryAttributes.isEmpty();
			case ReferenceProcessPackage.MODEL__MANDATORY_ASSOCIATIONS:
				return mandatoryAssociations != null && !mandatoryAssociations.isEmpty();
			case ReferenceProcessPackage.MODEL__OPTIONAL_ELEMENTS:
				return optionalElements != null && !optionalElements.isEmpty();
			case ReferenceProcessPackage.MODEL__OPTIONAL_ATTRIBUTES:
				return optionalAttributes != null && !optionalAttributes.isEmpty();
			case ReferenceProcessPackage.MODEL__OPTIONAL_ASSOCIATIONS:
				return optionalAssociations != null && !optionalAssociations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
