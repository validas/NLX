/**
 */
package metaModel.modellDescr.util;

import metaModel.modellDescr.*;

import metaModel.suptertype.Named;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metaModel.modellDescr.ModellDescrPackage
 * @generated
 */
public class ModellDescrAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModellDescrPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModellDescrAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModellDescrPackage.eINSTANCE;
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
	protected ModellDescrSwitch<Adapter> modelSwitch =
		new ModellDescrSwitch<Adapter>() {
			@Override
			public Adapter caseMMCondition(MMCondition object) {
				return createMMConditionAdapter();
			}
			@Override
			public Adapter caseMetaModelElement(MetaModelElement object) {
				return createMetaModelElementAdapter();
			}
			@Override
			public Adapter caseMetaModelAssociation(MetaModelAssociation object) {
				return createMetaModelAssociationAdapter();
			}
			@Override
			public Adapter caseMetaModelAttribute(MetaModelAttribute object) {
				return createMetaModelAttributeAdapter();
			}
			@Override
			public Adapter caseProzessCondition(ProzessCondition object) {
				return createProzessConditionAdapter();
			}
			@Override
			public Adapter caseMetaModel(MetaModel object) {
				return createMetaModelAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
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
	 * Creates a new adapter for an object of class '{@link metaModel.modellDescr.MMCondition <em>MM Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.modellDescr.MMCondition
	 * @generated
	 */
	public Adapter createMMConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.modellDescr.MetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.modellDescr.MetaModelElement
	 * @generated
	 */
	public Adapter createMetaModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.modellDescr.MetaModelAssociation <em>Meta Model Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.modellDescr.MetaModelAssociation
	 * @generated
	 */
	public Adapter createMetaModelAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.modellDescr.MetaModelAttribute <em>Meta Model Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.modellDescr.MetaModelAttribute
	 * @generated
	 */
	public Adapter createMetaModelAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.modellDescr.ProzessCondition <em>Prozess Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.modellDescr.ProzessCondition
	 * @generated
	 */
	public Adapter createProzessConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.modellDescr.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.modellDescr.MetaModel
	 * @generated
	 */
	public Adapter createMetaModelAdapter() {
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

} //ModellDescrAdapterFactory
