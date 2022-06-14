/**
 */
package metaModel.modellDescr.impl;

import java.util.Collection;
import metaModel.modellDescr.MMCondition;
import metaModel.modellDescr.ModellDescrPackage;
import metaModel.modellDescr.ProzessCondition;

import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.suptertype.impl.NamedImpl;
import metaModel.terms.BoolTerm;

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
 * An implementation of the model object '<em><b>Prozess Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.modellDescr.impl.ProzessConditionImpl#getArtefakt <em>Artefakt</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.ProzessConditionImpl#getProcessmodule <em>Processmodule</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.ProzessConditionImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.ProzessConditionImpl#getMMConditions <em>MM Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProzessConditionImpl extends NamedImpl implements ProzessCondition {
	/**
	 * The cached value of the '{@link #getArtefakt() <em>Artefakt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefakt()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artefakt;

	/**
	 * The cached value of the '{@link #getProcessmodule() <em>Processmodule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessmodule()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> processmodule;

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
	 * The cached value of the '{@link #getMMConditions() <em>MM Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<MMCondition> mmConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProzessConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModellDescrPackage.Literals.PROZESS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getArtefakt() {
		if (artefakt == null) {
			artefakt = new EObjectWithInverseResolvingEList.ManyInverse<Artifact>(Artifact.class, this, ModellDescrPackage.PROZESS_CONDITION__ARTEFAKT, ReferenceProcessPackage.ARTIFACT__PROCESS_CONDITIONS);
		}
		return artefakt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessModule> getProcessmodule() {
		if (processmodule == null) {
			processmodule = new EObjectResolvingEList<ProcessModule>(ProcessModule.class, this, ModellDescrPackage.PROZESS_CONDITION__PROCESSMODULE);
		}
		return processmodule;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModellDescrPackage.PROZESS_CONDITION__VARIANT, oldVariant, newVariant);
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
				msgs = ((InternalEObject)variant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModellDescrPackage.PROZESS_CONDITION__VARIANT, null, msgs);
			if (newVariant != null)
				msgs = ((InternalEObject)newVariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModellDescrPackage.PROZESS_CONDITION__VARIANT, null, msgs);
			msgs = basicSetVariant(newVariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellDescrPackage.PROZESS_CONDITION__VARIANT, newVariant, newVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MMCondition> getMMConditions() {
		if (mmConditions == null) {
			mmConditions = new EObjectWithInverseResolvingEList.ManyInverse<MMCondition>(MMCondition.class, this, ModellDescrPackage.PROZESS_CONDITION__MM_CONDITIONS, ModellDescrPackage.MM_CONDITION__PROCESS_CONDITION);
		}
		return mmConditions;
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
			case ModellDescrPackage.PROZESS_CONDITION__ARTEFAKT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArtefakt()).basicAdd(otherEnd, msgs);
			case ModellDescrPackage.PROZESS_CONDITION__MM_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMMConditions()).basicAdd(otherEnd, msgs);
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
			case ModellDescrPackage.PROZESS_CONDITION__ARTEFAKT:
				return ((InternalEList<?>)getArtefakt()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.PROZESS_CONDITION__VARIANT:
				return basicSetVariant(null, msgs);
			case ModellDescrPackage.PROZESS_CONDITION__MM_CONDITIONS:
				return ((InternalEList<?>)getMMConditions()).basicRemove(otherEnd, msgs);
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
			case ModellDescrPackage.PROZESS_CONDITION__ARTEFAKT:
				return getArtefakt();
			case ModellDescrPackage.PROZESS_CONDITION__PROCESSMODULE:
				return getProcessmodule();
			case ModellDescrPackage.PROZESS_CONDITION__VARIANT:
				return getVariant();
			case ModellDescrPackage.PROZESS_CONDITION__MM_CONDITIONS:
				return getMMConditions();
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
			case ModellDescrPackage.PROZESS_CONDITION__ARTEFAKT:
				getArtefakt().clear();
				getArtefakt().addAll((Collection<? extends Artifact>)newValue);
				return;
			case ModellDescrPackage.PROZESS_CONDITION__PROCESSMODULE:
				getProcessmodule().clear();
				getProcessmodule().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ModellDescrPackage.PROZESS_CONDITION__VARIANT:
				setVariant((BoolTerm)newValue);
				return;
			case ModellDescrPackage.PROZESS_CONDITION__MM_CONDITIONS:
				getMMConditions().clear();
				getMMConditions().addAll((Collection<? extends MMCondition>)newValue);
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
			case ModellDescrPackage.PROZESS_CONDITION__ARTEFAKT:
				getArtefakt().clear();
				return;
			case ModellDescrPackage.PROZESS_CONDITION__PROCESSMODULE:
				getProcessmodule().clear();
				return;
			case ModellDescrPackage.PROZESS_CONDITION__VARIANT:
				setVariant((BoolTerm)null);
				return;
			case ModellDescrPackage.PROZESS_CONDITION__MM_CONDITIONS:
				getMMConditions().clear();
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
			case ModellDescrPackage.PROZESS_CONDITION__ARTEFAKT:
				return artefakt != null && !artefakt.isEmpty();
			case ModellDescrPackage.PROZESS_CONDITION__PROCESSMODULE:
				return processmodule != null && !processmodule.isEmpty();
			case ModellDescrPackage.PROZESS_CONDITION__VARIANT:
				return variant != null;
			case ModellDescrPackage.PROZESS_CONDITION__MM_CONDITIONS:
				return mmConditions != null && !mmConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProzessConditionImpl
