/**
 */
package metaModel.impl;

import metaModel.MetaModelFactory;
import metaModel.MetaModelPackage;
import metaModel.Workaround;

import metaModel.modellDescr.ModellDescrPackage;

import metaModel.modellDescr.impl.ModellDescrPackageImpl;

import metaModel.referenceProcess.ReferenceProcessPackage;

import metaModel.referenceProcess.impl.ReferenceProcessPackageImpl;

import metaModel.suptertype.SuptertypePackage;

import metaModel.suptertype.impl.SuptertypePackageImpl;

import metaModel.terms.TermsPackage;

import metaModel.terms.impl.TermsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaModelPackageImpl extends EPackageImpl implements MetaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workaroundEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see metaModel.MetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetaModelPackageImpl() {
		super(eNS_URI, MetaModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetaModelPackage init() {
		if (isInited) return (MetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(MetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetaModelPackageImpl theMetaModelPackage = registeredMetaModelPackage instanceof MetaModelPackageImpl ? (MetaModelPackageImpl)registeredMetaModelPackage : new MetaModelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SuptertypePackage.eNS_URI);
		SuptertypePackageImpl theSuptertypePackage = (SuptertypePackageImpl)(registeredPackage instanceof SuptertypePackageImpl ? registeredPackage : SuptertypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferenceProcessPackage.eNS_URI);
		ReferenceProcessPackageImpl theReferenceProcessPackage = (ReferenceProcessPackageImpl)(registeredPackage instanceof ReferenceProcessPackageImpl ? registeredPackage : ReferenceProcessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModellDescrPackage.eNS_URI);
		ModellDescrPackageImpl theModellDescrPackage = (ModellDescrPackageImpl)(registeredPackage instanceof ModellDescrPackageImpl ? registeredPackage : ModellDescrPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(registeredPackage instanceof TermsPackageImpl ? registeredPackage : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theMetaModelPackage.createPackageContents();
		theSuptertypePackage.createPackageContents();
		theReferenceProcessPackage.createPackageContents();
		theModellDescrPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theMetaModelPackage.initializePackageContents();
		theSuptertypePackage.initializePackageContents();
		theReferenceProcessPackage.initializePackageContents();
		theModellDescrPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetaModelPackage.eNS_URI, theMetaModelPackage);
		return theMetaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkaround() {
		return workaroundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkaround_Issue() {
		return (EAttribute)workaroundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaModelFactory getMetaModelFactory() {
		return (MetaModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workaroundEClass = createEClass(WORKAROUND);
		createEAttribute(workaroundEClass, WORKAROUND__ISSUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SuptertypePackage theSuptertypePackage = (SuptertypePackage)EPackage.Registry.INSTANCE.getEPackage(SuptertypePackage.eNS_URI);
		ReferenceProcessPackage theReferenceProcessPackage = (ReferenceProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ReferenceProcessPackage.eNS_URI);
		ModellDescrPackage theModellDescrPackage = (ModellDescrPackage)EPackage.Registry.INSTANCE.getEPackage(ModellDescrPackage.eNS_URI);
		TermsPackage theTermsPackage = (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSuptertypePackage);
		getESubpackages().add(theReferenceProcessPackage);
		getESubpackages().add(theModellDescrPackage);
		getESubpackages().add(theTermsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(workaroundEClass, Workaround.class, "Workaround", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkaround_Issue(), ecorePackage.getEString(), "issue", null, 0, 1, Workaround.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MetaModelPackageImpl
