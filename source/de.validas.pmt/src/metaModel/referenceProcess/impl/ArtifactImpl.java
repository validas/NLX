/**
 */
package metaModel.referenceProcess.impl;

import java.util.Collection;

import metaModel.modellDescr.ModellDescrPackage;
import metaModel.modellDescr.ProzessCondition;

import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.IVerified;
import metaModel.referenceProcess.IVerifier;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ProcessStatus;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.StakeHolder;

import metaModel.suptertype.Layout;
import metaModel.suptertype.impl.VariantableImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getReadByProcessModules <em>Read By Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getProcessConditions <em>Process Conditions</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getCreatedByProcessModules <em>Created By Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getSubArtifacts <em>Sub Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getSubArtifactReferences <em>Sub Artifact References</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getCompliances <em>Compliances</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getInvolvedStakeHolders <em>Involved Stake Holders</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getStakeHolder <em>Stake Holder</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getPath <em>Path</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#isPartOfProduct <em>Part Of Product</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getReferedByArtifacts <em>Refered By Artifacts</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#isProjectInput <em>Project Input</em>}</li>
 *   <li>{@link metaModel.referenceProcess.impl.ArtifactImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends VariantableImpl implements Artifact {
	/**
	 * The cached value of the '{@link #getVerifiedBy() <em>Verified By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<IVerifier> verifiedBy;

	/**
	 * The default value of the '{@link #getDocumentStatus() <em>Document Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentStatus() <em>Document Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatus()
	 * @generated
	 * @ordered
	 */
	protected String documentStatus = DOCUMENT_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadByProcessModules() <em>Read By Process Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadByProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> readByProcessModules;

	/**
	 * The cached value of the '{@link #getProcessConditions() <em>Process Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProzessCondition> processConditions;

	/**
	 * The cached value of the '{@link #getCreatedByProcessModules() <em>Created By Process Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByProcessModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModule> createdByProcessModules;

	/**
	 * The cached value of the '{@link #getSubArtifacts() <em>Sub Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> subArtifacts;

	/**
	 * The cached value of the '{@link #getSubArtifactReferences() <em>Sub Artifact References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubArtifactReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> subArtifactReferences;

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
	 * The cached value of the '{@link #getInvolvedStakeHolders() <em>Involved Stake Holders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedStakeHolders()
	 * @generated
	 * @ordered
	 */
	protected EList<StakeHolder> involvedStakeHolders;

	/**
	 * The cached value of the '{@link #getStakeHolder() <em>Stake Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeHolder()
	 * @generated
	 * @ordered
	 */
	protected StakeHolder stakeHolder;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessStatus STATUS_EDEFAULT = ProcessStatus.DEFINED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ProcessStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPartOfProduct() <em>Part Of Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartOfProduct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PART_OF_PRODUCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPartOfProduct() <em>Part Of Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartOfProduct()
	 * @generated
	 * @ordered
	 */
	protected boolean partOfProduct = PART_OF_PRODUCT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferedByArtifacts() <em>Refered By Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferedByArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> referedByArtifacts;

	/**
	 * The default value of the '{@link #isProjectInput() <em>Project Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProjectInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROJECT_INPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProjectInput() <em>Project Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProjectInput()
	 * @generated
	 * @ordered
	 */
	protected boolean projectInput = PROJECT_INPUT_EDEFAULT;

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
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferenceProcessPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IVerifier> getVerifiedBy() {
		if (verifiedBy == null) {
			verifiedBy = new EObjectWithInverseResolvingEList.ManyInverse<IVerifier>(IVerifier.class, this, ReferenceProcessPackage.ARTIFACT__VERIFIED_BY, ReferenceProcessPackage.IVERIFIER__VERIFIES);
		}
		return verifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentStatus() {
		return documentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentStatus(String newDocumentStatus) {
		String oldDocumentStatus = documentStatus;
		documentStatus = newDocumentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.ARTIFACT__DOCUMENT_STATUS, oldDocumentStatus, documentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.ARTIFACT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getReadByProcessModules() {
		if (readByProcessModules == null) {
			readByProcessModules = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.ARTIFACT__READ_BY_PROCESS_MODULES, ReferenceProcessPackage.PROCESS_MODULE__INPUT_ARTIFACTS);
		}
		return readByProcessModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProzessCondition> getProcessConditions() {
		if (processConditions == null) {
			processConditions = new EObjectWithInverseResolvingEList.ManyInverse<ProzessCondition>(ProzessCondition.class, this, ReferenceProcessPackage.ARTIFACT__PROCESS_CONDITIONS, ModellDescrPackage.PROZESS_CONDITION__ARTEFAKT);
		}
		return processConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModule> getCreatedByProcessModules() {
		if (createdByProcessModules == null) {
			createdByProcessModules = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModule>(ProcessModule.class, this, ReferenceProcessPackage.ARTIFACT__CREATED_BY_PROCESS_MODULES, ReferenceProcessPackage.PROCESS_MODULE__OUTPUT_ARTIFACTS);
		}
		return createdByProcessModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getSubArtifacts() {
		if (subArtifacts == null) {
			subArtifacts = new EObjectContainmentEList<Artifact>(Artifact.class, this, ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACTS);
		}
		return subArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getSubArtifactReferences() {
		if (subArtifactReferences == null) {
			subArtifactReferences = new EObjectWithInverseResolvingEList.ManyInverse<Artifact>(Artifact.class, this, ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACT_REFERENCES, ReferenceProcessPackage.ARTIFACT__REFERED_BY_ARTIFACTS);
		}
		return subArtifactReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Compliance> getCompliances() {
		if (compliances == null) {
			compliances = new EObjectWithInverseResolvingEList.ManyInverse<Compliance>(Compliance.class, this, ReferenceProcessPackage.ARTIFACT__COMPLIANCES, ReferenceProcessPackage.COMPLIANCE__ARTIFATCS);
		}
		return compliances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StakeHolder> getInvolvedStakeHolders() {
		if (involvedStakeHolders == null) {
			involvedStakeHolders = new EObjectWithInverseResolvingEList.ManyInverse<StakeHolder>(StakeHolder.class, this, ReferenceProcessPackage.ARTIFACT__INVOLVED_STAKE_HOLDERS, ReferenceProcessPackage.STAKE_HOLDER__INVOLVED_ARTIFACTS);
		}
		return involvedStakeHolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StakeHolder getStakeHolder() {
		if (stakeHolder != null && stakeHolder.eIsProxy()) {
			InternalEObject oldStakeHolder = (InternalEObject)stakeHolder;
			stakeHolder = (StakeHolder)eResolveProxy(oldStakeHolder);
			if (stakeHolder != oldStakeHolder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferenceProcessPackage.ARTIFACT__STAKE_HOLDER, oldStakeHolder, stakeHolder));
			}
		}
		return stakeHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeHolder basicGetStakeHolder() {
		return stakeHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStakeHolder(StakeHolder newStakeHolder, NotificationChain msgs) {
		StakeHolder oldStakeHolder = stakeHolder;
		stakeHolder = newStakeHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.ARTIFACT__STAKE_HOLDER, oldStakeHolder, newStakeHolder);
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
	public void setStakeHolder(StakeHolder newStakeHolder) {
		if (newStakeHolder != stakeHolder) {
			NotificationChain msgs = null;
			if (stakeHolder != null)
				msgs = ((InternalEObject)stakeHolder).eInverseRemove(this, ReferenceProcessPackage.STAKE_HOLDER__OWNED_ARTIFACTS, StakeHolder.class, msgs);
			if (newStakeHolder != null)
				msgs = ((InternalEObject)newStakeHolder).eInverseAdd(this, ReferenceProcessPackage.STAKE_HOLDER__OWNED_ARTIFACTS, StakeHolder.class, msgs);
			msgs = basicSetStakeHolder(newStakeHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.ARTIFACT__STAKE_HOLDER, newStakeHolder, newStakeHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.ARTIFACT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ProcessStatus newStatus) {
		ProcessStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.ARTIFACT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPartOfProduct() {
		return partOfProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartOfProduct(boolean newPartOfProduct) {
		boolean oldPartOfProduct = partOfProduct;
		partOfProduct = newPartOfProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.ARTIFACT__PART_OF_PRODUCT, oldPartOfProduct, partOfProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getReferedByArtifacts() {
		if (referedByArtifacts == null) {
			referedByArtifacts = new EObjectWithInverseResolvingEList.ManyInverse<Artifact>(Artifact.class, this, ReferenceProcessPackage.ARTIFACT__REFERED_BY_ARTIFACTS, ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACT_REFERENCES);
		}
		return referedByArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProjectInput() {
		return projectInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectInput(boolean newProjectInput) {
		boolean oldProjectInput = projectInput;
		projectInput = newProjectInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.ARTIFACT__PROJECT_INPUT, oldProjectInput, projectInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceProcessPackage.ARTIFACT__LAYOUT, oldLayout, layout));
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
			case ReferenceProcessPackage.ARTIFACT__VERIFIED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVerifiedBy()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__READ_BY_PROCESS_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReadByProcessModules()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__PROCESS_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessConditions()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__CREATED_BY_PROCESS_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCreatedByProcessModules()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACT_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubArtifactReferences()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__COMPLIANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompliances()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__INVOLVED_STAKE_HOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvolvedStakeHolders()).basicAdd(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__STAKE_HOLDER:
				if (stakeHolder != null)
					msgs = ((InternalEObject)stakeHolder).eInverseRemove(this, ReferenceProcessPackage.STAKE_HOLDER__OWNED_ARTIFACTS, StakeHolder.class, msgs);
				return basicSetStakeHolder((StakeHolder)otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__REFERED_BY_ARTIFACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferedByArtifacts()).basicAdd(otherEnd, msgs);
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
			case ReferenceProcessPackage.ARTIFACT__VERIFIED_BY:
				return ((InternalEList<?>)getVerifiedBy()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__READ_BY_PROCESS_MODULES:
				return ((InternalEList<?>)getReadByProcessModules()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__PROCESS_CONDITIONS:
				return ((InternalEList<?>)getProcessConditions()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__CREATED_BY_PROCESS_MODULES:
				return ((InternalEList<?>)getCreatedByProcessModules()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACTS:
				return ((InternalEList<?>)getSubArtifacts()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACT_REFERENCES:
				return ((InternalEList<?>)getSubArtifactReferences()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__COMPLIANCES:
				return ((InternalEList<?>)getCompliances()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__INVOLVED_STAKE_HOLDERS:
				return ((InternalEList<?>)getInvolvedStakeHolders()).basicRemove(otherEnd, msgs);
			case ReferenceProcessPackage.ARTIFACT__STAKE_HOLDER:
				return basicSetStakeHolder(null, msgs);
			case ReferenceProcessPackage.ARTIFACT__REFERED_BY_ARTIFACTS:
				return ((InternalEList<?>)getReferedByArtifacts()).basicRemove(otherEnd, msgs);
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
			case ReferenceProcessPackage.ARTIFACT__VERIFIED_BY:
				return getVerifiedBy();
			case ReferenceProcessPackage.ARTIFACT__DOCUMENT_STATUS:
				return getDocumentStatus();
			case ReferenceProcessPackage.ARTIFACT__VERSION:
				return getVersion();
			case ReferenceProcessPackage.ARTIFACT__READ_BY_PROCESS_MODULES:
				return getReadByProcessModules();
			case ReferenceProcessPackage.ARTIFACT__PROCESS_CONDITIONS:
				return getProcessConditions();
			case ReferenceProcessPackage.ARTIFACT__CREATED_BY_PROCESS_MODULES:
				return getCreatedByProcessModules();
			case ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACTS:
				return getSubArtifacts();
			case ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACT_REFERENCES:
				return getSubArtifactReferences();
			case ReferenceProcessPackage.ARTIFACT__COMPLIANCES:
				return getCompliances();
			case ReferenceProcessPackage.ARTIFACT__INVOLVED_STAKE_HOLDERS:
				return getInvolvedStakeHolders();
			case ReferenceProcessPackage.ARTIFACT__STAKE_HOLDER:
				if (resolve) return getStakeHolder();
				return basicGetStakeHolder();
			case ReferenceProcessPackage.ARTIFACT__PATH:
				return getPath();
			case ReferenceProcessPackage.ARTIFACT__STATUS:
				return getStatus();
			case ReferenceProcessPackage.ARTIFACT__PART_OF_PRODUCT:
				return isPartOfProduct();
			case ReferenceProcessPackage.ARTIFACT__REFERED_BY_ARTIFACTS:
				return getReferedByArtifacts();
			case ReferenceProcessPackage.ARTIFACT__PROJECT_INPUT:
				return isProjectInput();
			case ReferenceProcessPackage.ARTIFACT__LAYOUT:
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
			case ReferenceProcessPackage.ARTIFACT__VERIFIED_BY:
				getVerifiedBy().clear();
				getVerifiedBy().addAll((Collection<? extends IVerifier>)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__DOCUMENT_STATUS:
				setDocumentStatus((String)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__VERSION:
				setVersion((String)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__READ_BY_PROCESS_MODULES:
				getReadByProcessModules().clear();
				getReadByProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__PROCESS_CONDITIONS:
				getProcessConditions().clear();
				getProcessConditions().addAll((Collection<? extends ProzessCondition>)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__CREATED_BY_PROCESS_MODULES:
				getCreatedByProcessModules().clear();
				getCreatedByProcessModules().addAll((Collection<? extends ProcessModule>)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACTS:
				getSubArtifacts().clear();
				getSubArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACT_REFERENCES:
				getSubArtifactReferences().clear();
				getSubArtifactReferences().addAll((Collection<? extends Artifact>)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__COMPLIANCES:
				getCompliances().clear();
				getCompliances().addAll((Collection<? extends Compliance>)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__INVOLVED_STAKE_HOLDERS:
				getInvolvedStakeHolders().clear();
				getInvolvedStakeHolders().addAll((Collection<? extends StakeHolder>)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__STAKE_HOLDER:
				setStakeHolder((StakeHolder)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__PATH:
				setPath((String)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__STATUS:
				setStatus((ProcessStatus)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__PART_OF_PRODUCT:
				setPartOfProduct((Boolean)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__REFERED_BY_ARTIFACTS:
				getReferedByArtifacts().clear();
				getReferedByArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__PROJECT_INPUT:
				setProjectInput((Boolean)newValue);
				return;
			case ReferenceProcessPackage.ARTIFACT__LAYOUT:
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
			case ReferenceProcessPackage.ARTIFACT__VERIFIED_BY:
				getVerifiedBy().clear();
				return;
			case ReferenceProcessPackage.ARTIFACT__DOCUMENT_STATUS:
				setDocumentStatus(DOCUMENT_STATUS_EDEFAULT);
				return;
			case ReferenceProcessPackage.ARTIFACT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ReferenceProcessPackage.ARTIFACT__READ_BY_PROCESS_MODULES:
				getReadByProcessModules().clear();
				return;
			case ReferenceProcessPackage.ARTIFACT__PROCESS_CONDITIONS:
				getProcessConditions().clear();
				return;
			case ReferenceProcessPackage.ARTIFACT__CREATED_BY_PROCESS_MODULES:
				getCreatedByProcessModules().clear();
				return;
			case ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACTS:
				getSubArtifacts().clear();
				return;
			case ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACT_REFERENCES:
				getSubArtifactReferences().clear();
				return;
			case ReferenceProcessPackage.ARTIFACT__COMPLIANCES:
				getCompliances().clear();
				return;
			case ReferenceProcessPackage.ARTIFACT__INVOLVED_STAKE_HOLDERS:
				getInvolvedStakeHolders().clear();
				return;
			case ReferenceProcessPackage.ARTIFACT__STAKE_HOLDER:
				setStakeHolder((StakeHolder)null);
				return;
			case ReferenceProcessPackage.ARTIFACT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ReferenceProcessPackage.ARTIFACT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ReferenceProcessPackage.ARTIFACT__PART_OF_PRODUCT:
				setPartOfProduct(PART_OF_PRODUCT_EDEFAULT);
				return;
			case ReferenceProcessPackage.ARTIFACT__REFERED_BY_ARTIFACTS:
				getReferedByArtifacts().clear();
				return;
			case ReferenceProcessPackage.ARTIFACT__PROJECT_INPUT:
				setProjectInput(PROJECT_INPUT_EDEFAULT);
				return;
			case ReferenceProcessPackage.ARTIFACT__LAYOUT:
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
			case ReferenceProcessPackage.ARTIFACT__VERIFIED_BY:
				return verifiedBy != null && !verifiedBy.isEmpty();
			case ReferenceProcessPackage.ARTIFACT__DOCUMENT_STATUS:
				return DOCUMENT_STATUS_EDEFAULT == null ? documentStatus != null : !DOCUMENT_STATUS_EDEFAULT.equals(documentStatus);
			case ReferenceProcessPackage.ARTIFACT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ReferenceProcessPackage.ARTIFACT__READ_BY_PROCESS_MODULES:
				return readByProcessModules != null && !readByProcessModules.isEmpty();
			case ReferenceProcessPackage.ARTIFACT__PROCESS_CONDITIONS:
				return processConditions != null && !processConditions.isEmpty();
			case ReferenceProcessPackage.ARTIFACT__CREATED_BY_PROCESS_MODULES:
				return createdByProcessModules != null && !createdByProcessModules.isEmpty();
			case ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACTS:
				return subArtifacts != null && !subArtifacts.isEmpty();
			case ReferenceProcessPackage.ARTIFACT__SUB_ARTIFACT_REFERENCES:
				return subArtifactReferences != null && !subArtifactReferences.isEmpty();
			case ReferenceProcessPackage.ARTIFACT__COMPLIANCES:
				return compliances != null && !compliances.isEmpty();
			case ReferenceProcessPackage.ARTIFACT__INVOLVED_STAKE_HOLDERS:
				return involvedStakeHolders != null && !involvedStakeHolders.isEmpty();
			case ReferenceProcessPackage.ARTIFACT__STAKE_HOLDER:
				return stakeHolder != null;
			case ReferenceProcessPackage.ARTIFACT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ReferenceProcessPackage.ARTIFACT__STATUS:
				return status != STATUS_EDEFAULT;
			case ReferenceProcessPackage.ARTIFACT__PART_OF_PRODUCT:
				return partOfProduct != PART_OF_PRODUCT_EDEFAULT;
			case ReferenceProcessPackage.ARTIFACT__REFERED_BY_ARTIFACTS:
				return referedByArtifacts != null && !referedByArtifacts.isEmpty();
			case ReferenceProcessPackage.ARTIFACT__PROJECT_INPUT:
				return projectInput != PROJECT_INPUT_EDEFAULT;
			case ReferenceProcessPackage.ARTIFACT__LAYOUT:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IVerified.class) {
			switch (derivedFeatureID) {
				case ReferenceProcessPackage.ARTIFACT__VERIFIED_BY: return ReferenceProcessPackage.IVERIFIED__VERIFIED_BY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IVerified.class) {
			switch (baseFeatureID) {
				case ReferenceProcessPackage.IVERIFIED__VERIFIED_BY: return ReferenceProcessPackage.ARTIFACT__VERIFIED_BY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (documentStatus: ");
		result.append(documentStatus);
		result.append(", version: ");
		result.append(version);
		result.append(", Path: ");
		result.append(path);
		result.append(", Status: ");
		result.append(status);
		result.append(", PartOfProduct: ");
		result.append(partOfProduct);
		result.append(", ProjectInput: ");
		result.append(projectInput);
		result.append(", Layout: ");
		result.append(layout);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
