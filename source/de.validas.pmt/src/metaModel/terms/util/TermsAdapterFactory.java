/**
 */
package metaModel.terms.util;

import metaModel.suptertype.Named;

import metaModel.terms.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metaModel.terms.TermsPackage
 * @generated
 */
public class TermsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TermsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TermsPackage.eINSTANCE;
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
	protected TermsSwitch<Adapter> modelSwitch =
		new TermsSwitch<Adapter>() {
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseBoolTerm(BoolTerm object) {
				return createBoolTermAdapter();
			}
			@Override
			public Adapter caseListTerm(ListTerm object) {
				return createListTermAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseParamRef(ParamRef object) {
				return createParamRefAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseEnumType(EnumType object) {
				return createEnumTypeAdapter();
			}
			@Override
			public Adapter caseEnumValue(EnumValue object) {
				return createEnumValueAdapter();
			}
			@Override
			public Adapter caseANDTerm(ANDTerm object) {
				return createANDTermAdapter();
			}
			@Override
			public Adapter caseORTerm(ORTerm object) {
				return createORTermAdapter();
			}
			@Override
			public Adapter caseEQTerm(EQTerm object) {
				return createEQTermAdapter();
			}
			@Override
			public Adapter caseNOTTerm(NOTTerm object) {
				return createNOTTermAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseEnumValueRef(EnumValueRef object) {
				return createEnumValueRefAdapter();
			}
			@Override
			public Adapter caseProjectParameter(ProjectParameter object) {
				return createProjectParameterAdapter();
			}
			@Override
			public Adapter caseProcessParameter(ProcessParameter object) {
				return createProcessParameterAdapter();
			}
			@Override
			public Adapter caseListType(ListType object) {
				return createListTypeAdapter();
			}
			@Override
			public Adapter casePlanningParameter(PlanningParameter object) {
				return createPlanningParameterAdapter();
			}
			@Override
			public Adapter caseInList(InList object) {
				return createInListAdapter();
			}
			@Override
			public Adapter caseProcessVariable(ProcessVariable object) {
				return createProcessVariableAdapter();
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
	 * Creates a new adapter for an object of class '{@link metaModel.terms.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.BoolTerm <em>Bool Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.BoolTerm
	 * @generated
	 */
	public Adapter createBoolTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.ListTerm <em>List Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.ListTerm
	 * @generated
	 */
	public Adapter createListTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.ParamRef <em>Param Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.ParamRef
	 * @generated
	 */
	public Adapter createParamRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.EnumType
	 * @generated
	 */
	public Adapter createEnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.EnumValue
	 * @generated
	 */
	public Adapter createEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.ANDTerm <em>AND Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.ANDTerm
	 * @generated
	 */
	public Adapter createANDTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.ORTerm <em>OR Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.ORTerm
	 * @generated
	 */
	public Adapter createORTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.EQTerm <em>EQ Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.EQTerm
	 * @generated
	 */
	public Adapter createEQTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.NOTTerm <em>NOT Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.NOTTerm
	 * @generated
	 */
	public Adapter createNOTTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.EnumValueRef <em>Enum Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.EnumValueRef
	 * @generated
	 */
	public Adapter createEnumValueRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.ProjectParameter <em>Project Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.ProjectParameter
	 * @generated
	 */
	public Adapter createProjectParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.ProcessParameter <em>Process Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.ProcessParameter
	 * @generated
	 */
	public Adapter createProcessParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.ListType
	 * @generated
	 */
	public Adapter createListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.InList <em>In List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.InList
	 * @generated
	 */
	public Adapter createInListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.ProcessVariable <em>Process Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.ProcessVariable
	 * @generated
	 */
	public Adapter createProcessVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.terms.PlanningParameter <em>Planning Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.terms.PlanningParameter
	 * @generated
	 */
	public Adapter createPlanningParameterAdapter() {
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

} //TermsAdapterFactory
