/**
 */
package metaModel.modellDescr.impl;

import java.util.Collection;

import metaModel.modellDescr.MMCondition;
import metaModel.modellDescr.MetaModelAssociation;
import metaModel.modellDescr.MetaModelAttribute;
import metaModel.modellDescr.MetaModelElement;
import metaModel.modellDescr.ModellDescrPackage;
import metaModel.modellDescr.ProzessCondition;
import metaModel.suptertype.impl.NamedImpl;
import metaModel.terms.BoolTerm;

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
 * An implementation of the model object '<em><b>MM Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.modellDescr.impl.MMConditionImpl#getMetaModellElements <em>Meta Modell Elements</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MMConditionImpl#getMetaModellAttributes <em>Meta Modell Attributes</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MMConditionImpl#getMetaModellAssociations <em>Meta Modell Associations</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MMConditionImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MMConditionImpl#getProcessCondition <em>Process Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMConditionImpl extends NamedImpl implements MMCondition {
	/**
	 * The cached value of the '{@link #getMetaModellElements() <em>Meta Modell Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModellElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelElement> metaModellElements;

	/**
	 * The cached value of the '{@link #getMetaModellAttributes() <em>Meta Modell Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModellAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelAttribute> metaModellAttributes;

	/**
	 * The cached value of the '{@link #getMetaModellAssociations() <em>Meta Modell Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModellAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelAssociation> metaModellAssociations;

	/**
	 * The cached value of the '{@link #getVariant() <em>Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected BoolTerm variant;

	/**
	 * The cached value of the '{@link #getProcessCondition() <em>Process Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ProzessCondition> processCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModellDescrPackage.Literals.MM_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelElement> getMetaModellElements() {
		if (metaModellElements == null) {
			metaModellElements = new EObjectWithInverseResolvingEList.ManyInverse<MetaModelElement>(MetaModelElement.class, this, ModellDescrPackage.MM_CONDITION__META_MODELL_ELEMENTS, ModellDescrPackage.META_MODEL_ELEMENT__MM_CONDITIONS);
		}
		return metaModellElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelAttribute> getMetaModellAttributes() {
		if (metaModellAttributes == null) {
			metaModellAttributes = new EObjectWithInverseResolvingEList.ManyInverse<MetaModelAttribute>(MetaModelAttribute.class, this, ModellDescrPackage.MM_CONDITION__META_MODELL_ATTRIBUTES, ModellDescrPackage.META_MODEL_ATTRIBUTE__MM_CONDITIONS);
		}
		return metaModellAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelAssociation> getMetaModellAssociations() {
		if (metaModellAssociations == null) {
			metaModellAssociations = new EObjectWithInverseResolvingEList.ManyInverse<MetaModelAssociation>(MetaModelAssociation.class, this, ModellDescrPackage.MM_CONDITION__META_MODELL_ASSOCIATIONS, ModellDescrPackage.META_MODEL_ASSOCIATION__MM_CONDITIONS);
		}
		return metaModellAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolTerm getVariant() {
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariant(BoolTerm newVariant, NotificationChain msgs) {
		BoolTerm oldVariant = variant;
		variant = newVariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModellDescrPackage.MM_CONDITION__VARIANT, oldVariant, newVariant);
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
	public void setVariant(BoolTerm newVariant) {
		if (newVariant != variant) {
			NotificationChain msgs = null;
			if (variant != null)
				msgs = ((InternalEObject)variant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModellDescrPackage.MM_CONDITION__VARIANT, null, msgs);
			if (newVariant != null)
				msgs = ((InternalEObject)newVariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModellDescrPackage.MM_CONDITION__VARIANT, null, msgs);
			msgs = basicSetVariant(newVariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellDescrPackage.MM_CONDITION__VARIANT, newVariant, newVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProzessCondition> getProcessCondition() {
		if (processCondition == null) {
			processCondition = new EObjectWithInverseResolvingEList.ManyInverse<ProzessCondition>(ProzessCondition.class, this, ModellDescrPackage.MM_CONDITION__PROCESS_CONDITION, ModellDescrPackage.PROZESS_CONDITION__MM_CONDITIONS);
		}
		return processCondition;
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
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetaModellElements()).basicAdd(otherEnd, msgs);
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetaModellAttributes()).basicAdd(otherEnd, msgs);
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetaModellAssociations()).basicAdd(otherEnd, msgs);
			case ModellDescrPackage.MM_CONDITION__PROCESS_CONDITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessCondition()).basicAdd(otherEnd, msgs);
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
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ELEMENTS:
				return ((InternalEList<?>)getMetaModellElements()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ATTRIBUTES:
				return ((InternalEList<?>)getMetaModellAttributes()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ASSOCIATIONS:
				return ((InternalEList<?>)getMetaModellAssociations()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.MM_CONDITION__VARIANT:
				return basicSetVariant(null, msgs);
			case ModellDescrPackage.MM_CONDITION__PROCESS_CONDITION:
				return ((InternalEList<?>)getProcessCondition()).basicRemove(otherEnd, msgs);
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
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ELEMENTS:
				return getMetaModellElements();
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ATTRIBUTES:
				return getMetaModellAttributes();
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ASSOCIATIONS:
				return getMetaModellAssociations();
			case ModellDescrPackage.MM_CONDITION__VARIANT:
				return getVariant();
			case ModellDescrPackage.MM_CONDITION__PROCESS_CONDITION:
				return getProcessCondition();
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
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ELEMENTS:
				getMetaModellElements().clear();
				getMetaModellElements().addAll((Collection<? extends MetaModelElement>)newValue);
				return;
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ATTRIBUTES:
				getMetaModellAttributes().clear();
				getMetaModellAttributes().addAll((Collection<? extends MetaModelAttribute>)newValue);
				return;
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ASSOCIATIONS:
				getMetaModellAssociations().clear();
				getMetaModellAssociations().addAll((Collection<? extends MetaModelAssociation>)newValue);
				return;
			case ModellDescrPackage.MM_CONDITION__VARIANT:
				setVariant((BoolTerm)newValue);
				return;
			case ModellDescrPackage.MM_CONDITION__PROCESS_CONDITION:
				getProcessCondition().clear();
				getProcessCondition().addAll((Collection<? extends ProzessCondition>)newValue);
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
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ELEMENTS:
				getMetaModellElements().clear();
				return;
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ATTRIBUTES:
				getMetaModellAttributes().clear();
				return;
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ASSOCIATIONS:
				getMetaModellAssociations().clear();
				return;
			case ModellDescrPackage.MM_CONDITION__VARIANT:
				setVariant((BoolTerm)null);
				return;
			case ModellDescrPackage.MM_CONDITION__PROCESS_CONDITION:
				getProcessCondition().clear();
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
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ELEMENTS:
				return metaModellElements != null && !metaModellElements.isEmpty();
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ATTRIBUTES:
				return metaModellAttributes != null && !metaModellAttributes.isEmpty();
			case ModellDescrPackage.MM_CONDITION__META_MODELL_ASSOCIATIONS:
				return metaModellAssociations != null && !metaModellAssociations.isEmpty();
			case ModellDescrPackage.MM_CONDITION__VARIANT:
				return variant != null;
			case ModellDescrPackage.MM_CONDITION__PROCESS_CONDITION:
				return processCondition != null && !processCondition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MMConditionImpl
