/**
 */
package metaModel.referenceProcess.impl;

import java.util.Collection;

import metaModel.modellDescr.MetaModel;
import metaModel.modellDescr.ModellDescrPackage;
import metaModel.referenceProcess.Method;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.Tool;
import metaModel.suptertype.impl.VariantableImpl;
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
 * An implementation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.impl.ToolImpl#getProcessModules <em>Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ToolImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ToolImpl#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ToolImpl#getPreliminaryClassification <em>Preliminary Classification</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ToolImpl#getClassificationExplanation <em>Classification Explanation</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ToolImpl#getToolOwner <em>Tool Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolImpl extends VariantableImpl implements Tool {
	/**
	 * The cached value of the '{@link #getProcessModules() <em>Process Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> processModules;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getMetaModel() <em>Meta Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModel()
	 * @generated
	 * @ordered
	 */
	protected MetaModel metaModel;

	/**
	 * The default value of the '{@link #getPreliminaryClassification() <em>Preliminary Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String PRELIMINARY_CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreliminaryClassification() <em>Preliminary Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryClassification()
	 * @generated
	 * @ordered
	 */
	protected String preliminaryClassification = PRELIMINARY_CLASSIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassificationExplanation() <em>Classification Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationExplanation()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_EXPLANATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassificationExplanation() <em>Classification Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationExplanation()
	 * @generated
	 * @ordered
	 */
	protected String classificationExplanation = CLASSIFICATION_EXPLANATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToolOwner() <em>Tool Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolOwner()
	 * @generated
	 * @ordered
	 */
	protected StakeHolder toolOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferenceProcessPackage.Literals.TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessModule> getProcessModules() {
		if (processModules == null) {
			processModules = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.TOOL__PROCESS_MODULES, ReferenceProcessPackage.PROCESS_MODULE__TOOLS);
		}
		return processModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectWithInverseResolvingEList.ManyInverse<Method>(Method.class, this, ReferenceProcessPackage.TOOL__METHODS, ReferenceProcessPackage.METHOD__TOOLS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaModel getMetaModel() {
		if (metaModel != null && metaModel.eIsProxy()) {
			InternalEObject oldMetaModel = (InternalEObject)metaModel;
			metaModel = (MetaModel)eResolveProxy(oldMetaModel);
			if (metaModel != oldMetaModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferenceProcessPackage.TOOL__META_MODEL, oldMetaModel, metaModel));
			}
		}
		return metaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModel basicGetMetaModel() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.TOOL__META_MODEL, oldMetaModel, newMetaModel);
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
				msgs = ((InternalEObject)metaModel).eInverseRemove(this, ModellDescrPackage.META_MODEL__TOOL, MetaModel.class, msgs);
			if (newMetaModel != null)
				msgs = ((InternalEObject)newMetaModel).eInverseAdd(this, ModellDescrPackage.META_MODEL__TOOL, MetaModel.class, msgs);
			msgs = basicSetMetaModel(newMetaModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.TOOL__META_MODEL, newMetaModel, newMetaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreliminaryClassification() {
		return preliminaryClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreliminaryClassification(String newPreliminaryClassification) {
		String oldPreliminaryClassification = preliminaryClassification;
		preliminaryClassification = newPreliminaryClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.TOOL__PRELIMINARY_CLASSIFICATION, oldPreliminaryClassification, preliminaryClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassificationExplanation() {
		return classificationExplanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassificationExplanation(String newClassificationExplanation) {
		String oldClassificationExplanation = classificationExplanation;
		classificationExplanation = newClassificationExplanation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.TOOL__CLASSIFICATION_EXPLANATION, oldClassificationExplanation, classificationExplanation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StakeHolder getToolOwner() {
		if (toolOwner != null && toolOwner.eIsProxy()) {
			InternalEObject oldToolOwner = (InternalEObject)toolOwner;
			toolOwner = (StakeHolder)eResolveProxy(oldToolOwner);
			if (toolOwner != oldToolOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferenceProcessPackage.TOOL__TOOL_OWNER, oldToolOwner, toolOwner));
			}
		}
		return toolOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeHolder basicGetToolOwner() {
		return toolOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolOwner(StakeHolder newToolOwner, NotificationChain msgs) {
		StakeHolder oldToolOwner = toolOwner;
		toolOwner = newToolOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.TOOL__TOOL_OWNER, oldToolOwner, newToolOwner);
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
	public void setToolOwner(StakeHolder newToolOwner) {
		if (newToolOwner != toolOwner) {
			NotificationChain msgs = null;
			if (toolOwner != null)
				msgs = ((InternalEObject)toolOwner).eInverseRemove(this, ReferenceProcessPackage.STAKE_HOLDER__OWNED_TOOLS, StakeHolder.class, msgs);
			if (newToolOwner != null)
				msgs = ((InternalEObject)newToolOwner).eInverseAdd(this, ReferenceProcessPackage.STAKE_HOLDER__OWNED_TOOLS, StakeHolder.class, msgs);
			msgs = basicSetToolOwner(newToolOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.TOOL__TOOL_OWNER, newToolOwner, newToolOwner));
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
			case ReferenceProcessPackage.TOOL__PROCESS_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessModules()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.TOOL__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.TOOL__META_MODEL:
				if (metaModel != null)
					msgs = ((InternalEObject)metaModel).eInverseRemove(this, ModellDescrPackage.META_MODEL__TOOL, MetaModel.class, msgs);
				return basicSetMetaModel((MetaModel)otherEnd, msgs);
			case ReferenceProcessPackage.TOOL__TOOL_OWNER:
				if (toolOwner != null)
					msgs = ((InternalEObject)toolOwner).eInverseRemove(this, ReferenceProcessPackage.STAKE_HOLDER__OWNED_TOOLS, StakeHolder.class, msgs);
				return basicSetToolOwner((StakeHolder)otherEnd, msgs);
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
			case ReferenceProcessPackage.TOOL__PROCESS_MODULES:
				return ((InternalEList<?>)getProcessModules()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.TOOL__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.TOOL__META_MODEL:
				return basicSetMetaModel(null, msgs);
			case ReferenceProcessPackage.TOOL__TOOL_OWNER:
				return basicSetToolOwner(null, msgs);
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
			case ReferenceProcessPackage.TOOL__PROCESS_MODULES:
				return getProcessModules();
			case ReferenceProcessPackage.TOOL__METHODS:
				return getMethods();
			case ReferenceProcessPackage.TOOL__META_MODEL:
				if (resolve) return getMetaModel();
				return basicGetMetaModel();
			case ReferenceProcessPackage.TOOL__PRELIMINARY_CLASSIFICATION:
				return getPreliminaryClassification();
			case ReferenceProcessPackage.TOOL__CLASSIFICATION_EXPLANATION:
				return getClassificationExplanation();
			case ReferenceProcessPackage.TOOL__TOOL_OWNER:
				if (resolve) return getToolOwner();
				return basicGetToolOwner();
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
			case ReferenceProcessPackage.TOOL__PROCESS_MODULES:
				getProcessModules().clear();
				getProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ReferenceProcessPackage.TOOL__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case ReferenceProcessPackage.TOOL__META_MODEL:
				setMetaModel((MetaModel)newValue);
				return;
			case ReferenceProcessPackage.TOOL__PRELIMINARY_CLASSIFICATION:
				setPreliminaryClassification((String)newValue);
				return;
			case ReferenceProcessPackage.TOOL__CLASSIFICATION_EXPLANATION:
				setClassificationExplanation((String)newValue);
				return;
			case ReferenceProcessPackage.TOOL__TOOL_OWNER:
				setToolOwner((StakeHolder)newValue);
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
			case ReferenceProcessPackage.TOOL__PROCESS_MODULES:
				getProcessModules().clear();
				return;
			case ReferenceProcessPackage.TOOL__METHODS:
				getMethods().clear();
				return;
			case ReferenceProcessPackage.TOOL__META_MODEL:
				setMetaModel((MetaModel)null);
				return;
			case ReferenceProcessPackage.TOOL__PRELIMINARY_CLASSIFICATION:
				setPreliminaryClassification(PRELIMINARY_CLASSIFICATION_EDEFAULT);
				return;
			case ReferenceProcessPackage.TOOL__CLASSIFICATION_EXPLANATION:
				setClassificationExplanation(CLASSIFICATION_EXPLANATION_EDEFAULT);
				return;
			case ReferenceProcessPackage.TOOL__TOOL_OWNER:
				setToolOwner((StakeHolder)null);
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
			case ReferenceProcessPackage.TOOL__PROCESS_MODULES:
				return processModules != null && !processModules.isEmpty();
			case ReferenceProcessPackage.TOOL__METHODS:
				return methods != null && !methods.isEmpty();
			case ReferenceProcessPackage.TOOL__META_MODEL:
				return metaModel != null;
			case ReferenceProcessPackage.TOOL__PRELIMINARY_CLASSIFICATION:
				return PRELIMINARY_CLASSIFICATION_EDEFAULT == null ? preliminaryClassification != null : !PRELIMINARY_CLASSIFICATION_EDEFAULT.equals(preliminaryClassification);
			case ReferenceProcessPackage.TOOL__CLASSIFICATION_EXPLANATION:
				return CLASSIFICATION_EXPLANATION_EDEFAULT == null ? classificationExplanation != null : !CLASSIFICATION_EXPLANATION_EDEFAULT.equals(classificationExplanation);
			case ReferenceProcessPackage.TOOL__TOOL_OWNER:
				return toolOwner != null;
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
		result.append(" (PreliminaryClassification: ");
		result.append(preliminaryClassification);
		result.append(", ClassificationExplanation: ");
		result.append(classificationExplanation);
		result.append(')');
		return result.toString();
	}

} //ToolImpl
