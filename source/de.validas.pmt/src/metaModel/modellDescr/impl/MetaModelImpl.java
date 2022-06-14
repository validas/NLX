/**
 */
package metaModel.modellDescr.impl;

import java.util.Collection;

import metaModel.modellDescr.MetaModel;
import metaModel.modellDescr.MetaModelElement;
import metaModel.modellDescr.ModellDescrPackage;

import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.Tool;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelImpl#getMetaModelElements <em>Meta Model Elements</em>}</li>
 *   <li>{@link metaModel.modellDescr.impl.MetaModelImpl#getTool <em>Tool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaModelImpl extends MinimalEObjectImpl.Container implements MetaModel {
	/**
	 * The cached value of the '{@link #getMetaModelElements() <em>Meta Model Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelElement> metaModelElements;
	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected Tool tool;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModellDescrPackage.Literals.META_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaModelElement> getMetaModelElements() {
		if (metaModelElements == null) {
			metaModelElements = new EObjectContainmentEList<MetaModelElement>(MetaModelElement.class, this, ModellDescrPackage.META_MODEL__META_MODEL_ELEMENTS);
		}
		return metaModelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tool getTool() {
		if (tool != null && tool.eIsProxy()) {
			InternalEObject oldTool = (InternalEObject)tool;
			tool = (Tool)eResolveProxy(oldTool);
			if (tool != oldTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModellDescrPackage.META_MODEL__TOOL, oldTool, tool));
			}
		}
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool basicGetTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTool(Tool newTool, NotificationChain msgs) {
		Tool oldTool = tool;
		tool = newTool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModellDescrPackage.META_MODEL__TOOL, oldTool, newTool);
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
	public void setTool(Tool newTool) {
		if (newTool != tool) {
			NotificationChain msgs = null;
			if (tool != null)
				msgs = ((InternalEObject)tool).eInverseRemove(this, ReferenceProcessPackage.TOOL__META_MODEL, Tool.class, msgs);
			if (newTool != null)
				msgs = ((InternalEObject)newTool).eInverseAdd(this, ReferenceProcessPackage.TOOL__META_MODEL, Tool.class, msgs);
			msgs = basicSetTool(newTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellDescrPackage.META_MODEL__TOOL, newTool, newTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModellDescrPackage.META_MODEL__TOOL:
				if (tool != null)
					msgs = ((InternalEObject)tool).eInverseRemove(this, ReferenceProcessPackage.TOOL__META_MODEL, Tool.class, msgs);
				return basicSetTool((Tool)otherEnd, msgs);
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
			case ModellDescrPackage.META_MODEL__META_MODEL_ELEMENTS:
				return ((InternalEList<?>)getMetaModelElements()).basicRemove(otherEnd, msgs);
			case ModellDescrPackage.META_MODEL__TOOL:
				return basicSetTool(null, msgs);
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
			case ModellDescrPackage.META_MODEL__META_MODEL_ELEMENTS:
				return getMetaModelElements();
			case ModellDescrPackage.META_MODEL__TOOL:
				if (resolve) return getTool();
				return basicGetTool();
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
			case ModellDescrPackage.META_MODEL__META_MODEL_ELEMENTS:
				getMetaModelElements().clear();
				getMetaModelElements().addAll((Collection<? extends MetaModelElement>)newValue);
				return;
			case ModellDescrPackage.META_MODEL__TOOL:
				setTool((Tool)newValue);
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
			case ModellDescrPackage.META_MODEL__META_MODEL_ELEMENTS:
				getMetaModelElements().clear();
				return;
			case ModellDescrPackage.META_MODEL__TOOL:
				setTool((Tool)null);
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
			case ModellDescrPackage.META_MODEL__META_MODEL_ELEMENTS:
				return metaModelElements != null && !metaModelElements.isEmpty();
			case ModellDescrPackage.META_MODEL__TOOL:
				return tool != null;
		}
		return super.eIsSet(featureID);
	}

} //MetaModelImpl
