/**
 */
package metaModel.referenceProcess.impl;

import java.util.Collection;

import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.Tool;
import metaModel.suptertype.Layout;
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
 * An implementation of the model object '<em><b>Stake Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.impl.StakeHolderImpl#getOwnedModules <em>Owned Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.StakeHolderImpl#getInvolvedModules <em>Involved Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.StakeHolderImpl#getCompliances <em>Compliances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.StakeHolderImpl#getAssignedPerson <em>Assigned Person</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.StakeHolderImpl#getOwnedArtifacts <em>Owned Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.StakeHolderImpl#getInvolvedArtifacts <em>Involved Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.StakeHolderImpl#getOwnedTools <em>Owned Tools</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.StakeHolderImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeHolderImpl extends VariantableImpl implements StakeHolder {
	/**
	 * The cached value of the '{@link #getOwnedModules() <em>Owned Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> ownedModules;

	/**
	 * The cached value of the '{@link #getInvolvedModules() <em>Involved Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> involvedModules;

	/**
	 * The cached value of the '{@link #getCompliances() <em>Compliances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliances()
	 * @generated
	 * @ordered
	 */
	protected EList<Compliance> compliances;

	/**
	 * The default value of the '{@link #getAssignedPerson() <em>Assigned Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedPerson()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNED_PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignedPerson() <em>Assigned Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedPerson()
	 * @generated
	 * @ordered
	 */
	protected String assignedPerson = ASSIGNED_PERSON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedArtifacts() <em>Owned Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> ownedArtifacts;

	/**
	 * The cached value of the '{@link #getInvolvedArtifacts() <em>Involved Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> involvedArtifacts;

	/**
	 * The cached value of the '{@link #getOwnedTools() <em>Owned Tools</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTools()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> ownedTools;

	/**
	 * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected static final Layout LAYOUT_EDEFAULT = Layout.TOP_BOTTOM;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout = LAYOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferenceProcessPackage.Literals.STAKE_HOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getOwnedModules() {
		if (ownedModules == null) {
			ownedModules = new EObjectWithInverseResolvingEList<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.STAKE_HOLDER__OWNED_MODULES, ReferenceProcessPackage.PROCESS_MODULE__STAKE_HOLDER);
		}
		return ownedModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getInvolvedModules() {
		if (involvedModules == null) {
			involvedModules = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_MODULES, ReferenceProcessPackage.PROCESS_MODULE__INVOLVED_STAKE_HOLDERS);
		}
		return involvedModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Compliance> getCompliances() {
		if (compliances == null) {
			compliances = new EObjectWithInverseResolvingEList.ManyInverse<Compliance>(Compliance.class, this, ReferenceProcessPackage.STAKE_HOLDER__COMPLIANCES, ReferenceProcessPackage.COMPLIANCE__STAKE_HOLDERS);
		}
		return compliances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssignedPerson() {
		return assignedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignedPerson(String newAssignedPerson) {
		String oldAssignedPerson = assignedPerson;
		assignedPerson = newAssignedPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.STAKE_HOLDER__ASSIGNED_PERSON, oldAssignedPerson, assignedPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getOwnedArtifacts() {
		if (ownedArtifacts == null) {
			ownedArtifacts = new EObjectWithInverseResolvingEList<Artifact>(Artifact.class, this, ReferenceProcessPackage.STAKE_HOLDER__OWNED_ARTIFACTS, ReferenceProcessPackage.ARTIFACT__STAKE_HOLDER);
		}
		return ownedArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getInvolvedArtifacts() {
		if (involvedArtifacts == null) {
			involvedArtifacts = new EObjectWithInverseResolvingEList.ManyInverse<Artifact>(Artifact.class, this, ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_ARTIFACTS, ReferenceProcessPackage.ARTIFACT__INVOLVED_STAKE_HOLDERS);
		}
		return involvedArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tool> getOwnedTools() {
		if (ownedTools == null) {
			ownedTools = new EObjectWithInverseResolvingEList<Tool>(Tool.class, this, ReferenceProcessPackage.STAKE_HOLDER__OWNED_TOOLS, ReferenceProcessPackage.TOOL__TOOL_OWNER);
		}
		return ownedTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayout(Layout newLayout) {
		Layout oldLayout = layout;
		layout = newLayout == null ? LAYOUT_EDEFAULT : newLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.STAKE_HOLDER__LAYOUT, oldLayout, layout));
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
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedModules()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvolvedModules()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.STAKE_HOLDER__COMPLIANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompliances()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_ARTIFACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedArtifacts()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_ARTIFACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvolvedArtifacts()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_TOOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedTools()).basicAdd(otherEnd, msgs);
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
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_MODULES:
				return ((InternalEList<?>)getOwnedModules()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_MODULES:
				return ((InternalEList<?>)getInvolvedModules()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.STAKE_HOLDER__COMPLIANCES:
				return ((InternalEList<?>)getCompliances()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_ARTIFACTS:
				return ((InternalEList<?>)getOwnedArtifacts()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_ARTIFACTS:
				return ((InternalEList<?>)getInvolvedArtifacts()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_TOOLS:
				return ((InternalEList<?>)getOwnedTools()).basicRemove(otherEnd, msgs);
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
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_MODULES:
				return getOwnedModules();
			case ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_MODULES:
				return getInvolvedModules();
			case ReferenceProcessPackage.STAKE_HOLDER__COMPLIANCES:
				return getCompliances();
			case ReferenceProcessPackage.STAKE_HOLDER__ASSIGNED_PERSON:
				return getAssignedPerson();
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_ARTIFACTS:
				return getOwnedArtifacts();
			case ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_ARTIFACTS:
				return getInvolvedArtifacts();
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_TOOLS:
				return getOwnedTools();
			case ReferenceProcessPackage.STAKE_HOLDER__LAYOUT:
				return getLayout();
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
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_MODULES:
				getOwnedModules().clear();
				getOwnedModules().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_MODULES:
				getInvolvedModules().clear();
				getInvolvedModules().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__COMPLIANCES:
				getCompliances().clear();
				getCompliances().addAll((Collection<? extends Compliance>)newValue);
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__ASSIGNED_PERSON:
				setAssignedPerson((String)newValue);
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_ARTIFACTS:
				getOwnedArtifacts().clear();
				getOwnedArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_ARTIFACTS:
				getInvolvedArtifacts().clear();
				getInvolvedArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_TOOLS:
				getOwnedTools().clear();
				getOwnedTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__LAYOUT:
				setLayout((Layout)newValue);
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
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_MODULES:
				getOwnedModules().clear();
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_MODULES:
				getInvolvedModules().clear();
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__COMPLIANCES:
				getCompliances().clear();
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__ASSIGNED_PERSON:
				setAssignedPerson(ASSIGNED_PERSON_EDEFAULT);
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_ARTIFACTS:
				getOwnedArtifacts().clear();
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_ARTIFACTS:
				getInvolvedArtifacts().clear();
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_TOOLS:
				getOwnedTools().clear();
				return;
			case ReferenceProcessPackage.STAKE_HOLDER__LAYOUT:
				setLayout(LAYOUT_EDEFAULT);
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
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_MODULES:
				return ownedModules != null && !ownedModules.isEmpty();
			case ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_MODULES:
				return involvedModules != null && !involvedModules.isEmpty();
			case ReferenceProcessPackage.STAKE_HOLDER__COMPLIANCES:
				return compliances != null && !compliances.isEmpty();
			case ReferenceProcessPackage.STAKE_HOLDER__ASSIGNED_PERSON:
				return ASSIGNED_PERSON_EDEFAULT == null ? assignedPerson != null : !ASSIGNED_PERSON_EDEFAULT.equals(assignedPerson);
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_ARTIFACTS:
				return ownedArtifacts != null && !ownedArtifacts.isEmpty();
			case ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_ARTIFACTS:
				return involvedArtifacts != null && !involvedArtifacts.isEmpty();
			case ReferenceProcessPackage.STAKE_HOLDER__OWNED_TOOLS:
				return ownedTools != null && !ownedTools.isEmpty();
			case ReferenceProcessPackage.STAKE_HOLDER__LAYOUT:
				return layout != LAYOUT_EDEFAULT;
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
		result.append(" (AssignedPerson: ");
		result.append(assignedPerson);
		result.append(", Layout: ");
		result.append(layout);
		result.append(')');
		return result.toString();
	}

} //StakeHolderImpl
