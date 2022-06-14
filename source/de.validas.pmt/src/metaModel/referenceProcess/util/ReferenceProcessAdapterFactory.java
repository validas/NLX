/**
 */
package metaModel.referenceProcess.util;

import metaModel.referenceProcess.Alternative;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.Criterion;
import metaModel.referenceProcess.IVerified;
import metaModel.referenceProcess.IVerifier;
import metaModel.referenceProcess.Method;
import metaModel.referenceProcess.Model;
import metaModel.referenceProcess.Parallel;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.RequiredDocument;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.Tool;
import metaModel.referenceProcess.VerificationModule;
import metaModel.suptertype.Named;

import metaModel.suptertype.Variantable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metaModel.referenceProcess.ReferenceProcessPackage
 * @generated
 */
public class ReferenceProcessAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReferenceProcessPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceProcessAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReferenceProcessPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceProcessSwitch<Adapter> modelSwitch =
		new ReferenceProcessSwitch<Adapter>() {
			@Override
			public Adapter caseProcess(metaModel.referenceProcess.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseTool(Tool object) {
				return createToolAdapter();
			}
			@Override
			public Adapter caseStakeHolder(StakeHolder object) {
				return createStakeHolderAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseProcessModule(ProcessModule object) {
				return createProcessModuleAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseAlternative(Alternative object) {
				return createAlternativeAdapter();
			}
			@Override
			public Adapter caseParallel(Parallel object) {
				return createParallelAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseIVerified(IVerified object) {
				return createIVerifiedAdapter();
			}
			@Override
			public Adapter caseIVerifier(IVerifier object) {
				return createIVerifierAdapter();
			}
			@Override
			public Adapter caseCompliance(Compliance object) {
				return createComplianceAdapter();
			}
			@Override
			public Adapter caseVerificationModule(VerificationModule object) {
				return createVerificationModuleAdapter();
			}
			@Override
			public Adapter caseRequiredDocument(RequiredDocument object) {
				return createRequiredDocumentAdapter();
			}
			@Override
			public Adapter caseCriterion(Criterion object) {
				return createCriterionAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseVariantable(Variantable object) {
				return createVariantableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.StakeHolder <em>Stake Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.StakeHolder
	 * @generated
	 */
	public Adapter createStakeHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.ProcessModule <em>Process Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.ProcessModule
	 * @generated
	 */
	public Adapter createProcessModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.Alternative
	 * @generated
	 */
	public Adapter createAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.Parallel
	 * @generated
	 */
	public Adapter createParallelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.IVerified <em>IVerified</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.IVerified
	 * @generated
	 */
	public Adapter createIVerifiedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.IVerifier <em>IVerifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.IVerifier
	 * @generated
	 */
	public Adapter createIVerifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.Compliance <em>Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.Compliance
	 * @generated
	 */
	public Adapter createComplianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.VerificationModule <em>Verification Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.VerificationModule
	 * @generated
	 */
	public Adapter createVerificationModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.RequiredDocument <em>Required Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.RequiredDocument
	 * @generated
	 */
	public Adapter createRequiredDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.referenceProcess.Criterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.referenceProcess.Criterion
	 * @generated
	 */
	public Adapter createCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.suptertype.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.suptertype.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.suptertype.Variantable <em>Variantable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.suptertype.Variantable
	 * @generated
	 */
	public Adapter createVariantableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ReferenceProcessAdapterFactory
