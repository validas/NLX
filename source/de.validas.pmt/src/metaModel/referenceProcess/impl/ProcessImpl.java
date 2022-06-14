/**
 */
package metaModel.referenceProcess.impl;

import java.util.Collection;

import metaModel.modellDescr.ProzessCondition;

import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Method;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.Tool;

import metaModel.suptertype.Preference;
import metaModel.suptertype.SafetyLevel;
import metaModel.suptertype.impl.NamedImpl;

import metaModel.terms.Binding;
import metaModel.terms.Parameter;
import metaModel.terms.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getProcessModules <em>Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getStakeHolders <em>Stake Holders</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getProcessConditions <em>Process Conditions</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getMaximalSafetyLevel <em>Maximal Safety Level</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ProcessImpl#getFilterScope <em>Filter Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends NamedImpl implements metaModel.referenceProcess.Process {
	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> tools;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifacts;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getProcessModules() <em>Process Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> processModules;

	/**
	 * The cached value of the '{@link #getStakeHolders() <em>Stake Holders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeHolders()
	 * @generated
	 * @ordered
	 */
	protected EList<StakeHolder> stakeHolders;

	/**
	 * The cached value of the '{@link #getProcessConditions() <em>Process Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProzessCondition> processConditions;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindings;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The default value of the '{@link #getMaximalSafetyLevel() <em>Maximal Safety Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximalSafetyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final SafetyLevel MAXIMAL_SAFETY_LEVEL_EDEFAULT = SafetyLevel.ASIL_D;

	/**
	 * The cached value of the '{@link #getMaximalSafetyLevel() <em>Maximal Safety Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximalSafetyLevel()
	 * @generated
	 * @ordered
	 */
	protected SafetyLevel maximalSafetyLevel = MAXIMAL_SAFETY_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreferences() <em>Preferences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Preference> preferences;

	/**
	 * The cached value of the '{@link #getFilterScope() <em>Filter Scope</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterScope()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> filterScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferenceProcessPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tool> getTools() {
		if (tools == null) {
			tools = new EObjectContainmentEList<Tool>(Tool.class, this, ReferenceProcessPackage.PROCESS__TOOLS);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, ReferenceProcessPackage.PROCESS__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<Artifact>(Artifact.class, this, ReferenceProcessPackage.PROCESS__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this, ReferenceProcessPackage.PROCESS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getProcessModules() {
		if (processModules == null) {
			processModules = new EObjectContainmentEList<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.PROCESS__PROCESS_MODULES);
		}
		return processModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StakeHolder> getStakeHolders() {
		if (stakeHolders == null) {
			stakeHolders = new EObjectContainmentEList<StakeHolder>(StakeHolder.class, this, ReferenceProcessPackage.PROCESS__STAKE_HOLDERS);
		}
		return stakeHolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProzessCondition> getProcessConditions() {
		if (processConditions == null) {
			processConditions = new EObjectContainmentEList<ProzessCondition>(ProzessCondition.class, this, ReferenceProcessPackage.PROCESS__PROCESS_CONDITIONS);
		}
		return processConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ReferenceProcessPackage.PROCESS__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<Binding>(Binding.class, this, ReferenceProcessPackage.PROCESS__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, ReferenceProcessPackage.PROCESS__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyLevel getMaximalSafetyLevel() {
		return maximalSafetyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximalSafetyLevel(SafetyLevel newMaximalSafetyLevel) {
		SafetyLevel oldMaximalSafetyLevel = maximalSafetyLevel;
		maximalSafetyLevel = newMaximalSafetyLevel == null ? MAXIMAL_SAFETY_LEVEL_EDEFAULT : newMaximalSafetyLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.PROCESS__MAXIMAL_SAFETY_LEVEL, oldMaximalSafetyLevel, maximalSafetyLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Preference> getPreferences() {
		if (preferences == null) {
			preferences = new EObjectResolvingEList<Preference>(Preference.class, this, ReferenceProcessPackage.PROCESS__PREFERENCES);
		}
		return preferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getFilterScope() {
		if (filterScope == null) {
			filterScope = new EObjectResolvingEList<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.PROCESS__FILTER_SCOPE);
		}
		return filterScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReferenceProcessPackage.PROCESS__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PROCESS__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PROCESS__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PROCESS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PROCESS__PROCESS_MODULES:
				return ((InternalEList<?>)getProcessModules()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PROCESS__STAKE_HOLDERS:
				return ((InternalEList<?>)getStakeHolders()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PROCESS__PROCESS_CONDITIONS:
				return ((InternalEList<?>)getProcessConditions()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PROCESS__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PROCESS__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.PROCESS__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case ReferenceProcessPackage.PROCESS__TOOLS:
				return getTools();
			case ReferenceProcessPackage.PROCESS__REQUIREMENTS:
				return getRequirements();
			case ReferenceProcessPackage.PROCESS__ARTIFACTS:
				return getArtifacts();
			case ReferenceProcessPackage.PROCESS__METHODS:
				return getMethods();
			case ReferenceProcessPackage.PROCESS__PROCESS_MODULES:
				return getProcessModules();
			case ReferenceProcessPackage.PROCESS__STAKE_HOLDERS:
				return getStakeHolders();
			case ReferenceProcessPackage.PROCESS__PROCESS_CONDITIONS:
				return getProcessConditions();
			case ReferenceProcessPackage.PROCESS__PARAMETERS:
				return getParameters();
			case ReferenceProcessPackage.PROCESS__BINDINGS:
				return getBindings();
			case ReferenceProcessPackage.PROCESS__TYPES:
				return getTypes();
			case ReferenceProcessPackage.PROCESS__MAXIMAL_SAFETY_LEVEL:
				return getMaximalSafetyLevel();
			case ReferenceProcessPackage.PROCESS__PREFERENCES:
				return getPreferences();
			case ReferenceProcessPackage.PROCESS__FILTER_SCOPE:
				return getFilterScope();
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
			case ReferenceProcessPackage.PROCESS__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case ReferenceProcessPackage.PROCESS__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case ReferenceProcessPackage.PROCESS__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case ReferenceProcessPackage.PROCESS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case ReferenceProcessPackage.PROCESS__PROCESS_MODULES:
				getProcessModules().clear();
				getProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ReferenceProcessPackage.PROCESS__STAKE_HOLDERS:
				getStakeHolders().clear();
				getStakeHolders().addAll((Collection<? extends StakeHolder>)newValue);
				return;
			case ReferenceProcessPackage.PROCESS__PROCESS_CONDITIONS:
				getProcessConditions().clear();
				getProcessConditions().addAll((Collection<? extends ProzessCondition>)newValue);
				return;
			case ReferenceProcessPackage.PROCESS__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ReferenceProcessPackage.PROCESS__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Binding>)newValue);
				return;
			case ReferenceProcessPackage.PROCESS__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case ReferenceProcessPackage.PROCESS__MAXIMAL_SAFETY_LEVEL:
				setMaximalSafetyLevel((SafetyLevel)newValue);
				return;
			case ReferenceProcessPackage.PROCESS__PREFERENCES:
				getPreferences().clear();
				getPreferences().addAll((Collection<? extends Preference>)newValue);
				return;
			case ReferenceProcessPackage.PROCESS__FILTER_SCOPE:
				getFilterScope().clear();
				getFilterScope().addAll((Collection<? extends ProcessModule>)newValue);
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
			case ReferenceProcessPackage.PROCESS__TOOLS:
				getTools().clear();
				return;
			case ReferenceProcessPackage.PROCESS__REQUIREMENTS:
				getRequirements().clear();
				return;
			case ReferenceProcessPackage.PROCESS__ARTIFACTS:
				getArtifacts().clear();
				return;
			case ReferenceProcessPackage.PROCESS__METHODS:
				getMethods().clear();
				return;
			case ReferenceProcessPackage.PROCESS__PROCESS_MODULES:
				getProcessModules().clear();
				return;
			case ReferenceProcessPackage.PROCESS__STAKE_HOLDERS:
				getStakeHolders().clear();
				return;
			case ReferenceProcessPackage.PROCESS__PROCESS_CONDITIONS:
				getProcessConditions().clear();
				return;
			case ReferenceProcessPackage.PROCESS__PARAMETERS:
				getParameters().clear();
				return;
			case ReferenceProcessPackage.PROCESS__BINDINGS:
				getBindings().clear();
				return;
			case ReferenceProcessPackage.PROCESS__TYPES:
				getTypes().clear();
				return;
			case ReferenceProcessPackage.PROCESS__MAXIMAL_SAFETY_LEVEL:
				setMaximalSafetyLevel(MAXIMAL_SAFETY_LEVEL_EDEFAULT);
				return;
			case ReferenceProcessPackage.PROCESS__PREFERENCES:
				getPreferences().clear();
				return;
			case ReferenceProcessPackage.PROCESS__FILTER_SCOPE:
				getFilterScope().clear();
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
			case ReferenceProcessPackage.PROCESS__TOOLS:
				return tools != null && !tools.isEmpty();
			case ReferenceProcessPackage.PROCESS__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case ReferenceProcessPackage.PROCESS__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
			case ReferenceProcessPackage.PROCESS__METHODS:
				return methods != null && !methods.isEmpty();
			case ReferenceProcessPackage.PROCESS__PROCESS_MODULES:
				return processModules != null && !processModules.isEmpty();
			case ReferenceProcessPackage.PROCESS__STAKE_HOLDERS:
				return stakeHolders != null && !stakeHolders.isEmpty();
			case ReferenceProcessPackage.PROCESS__PROCESS_CONDITIONS:
				return processConditions != null && !processConditions.isEmpty();
			case ReferenceProcessPackage.PROCESS__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ReferenceProcessPackage.PROCESS__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case ReferenceProcessPackage.PROCESS__TYPES:
				return types != null && !types.isEmpty();
			case ReferenceProcessPackage.PROCESS__MAXIMAL_SAFETY_LEVEL:
				return maximalSafetyLevel != MAXIMAL_SAFETY_LEVEL_EDEFAULT;
			case ReferenceProcessPackage.PROCESS__PREFERENCES:
				return preferences != null && !preferences.isEmpty();
			case ReferenceProcessPackage.PROCESS__FILTER_SCOPE:
				return filterScope != null && !filterScope.isEmpty();
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
		result.append(" (MaximalSafetyLevel: ");
		result.append(maximalSafetyLevel);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
