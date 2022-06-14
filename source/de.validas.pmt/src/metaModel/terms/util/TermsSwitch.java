/**
 */
package metaModel.terms.util;

import metaModel.suptertype.Named;

import metaModel.terms.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see metaModel.terms.TermsPackage
 * @generated
 */
public class TermsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TermsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsSwitch() {
		if (modelPackage == null) {
			modelPackage = TermsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TermsPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.BOOL_TERM: {
				BoolTerm boolTerm = (BoolTerm)theEObject;
				T result = caseBoolTerm(boolTerm);
				if (result == null) result = caseTerm(boolTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.LIST_TERM: {
				ListTerm listTerm = (ListTerm)theEObject;
				T result = caseListTerm(listTerm);
				if (result == null) result = caseTerm(listTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseTerm(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.PARAM_REF: {
				ParamRef paramRef = (ParamRef)theEObject;
				T result = caseParamRef(paramRef);
				if (result == null) result = caseTerm(paramRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseNamed(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseNamed(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.ENUM_TYPE: {
				EnumType enumType = (EnumType)theEObject;
				T result = caseEnumType(enumType);
				if (result == null) result = caseType(enumType);
				if (result == null) result = caseNamed(enumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.ENUM_VALUE: {
				EnumValue enumValue = (EnumValue)theEObject;
				T result = caseEnumValue(enumValue);
				if (result == null) result = caseNamed(enumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.AND_TERM: {
				ANDTerm andTerm = (ANDTerm)theEObject;
				T result = caseANDTerm(andTerm);
				if (result == null) result = caseBoolTerm(andTerm);
				if (result == null) result = caseTerm(andTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.OR_TERM: {
				ORTerm orTerm = (ORTerm)theEObject;
				T result = caseORTerm(orTerm);
				if (result == null) result = caseBoolTerm(orTerm);
				if (result == null) result = caseTerm(orTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.EQ_TERM: {
				EQTerm eqTerm = (EQTerm)theEObject;
				T result = caseEQTerm(eqTerm);
				if (result == null) result = caseBoolTerm(eqTerm);
				if (result == null) result = caseTerm(eqTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.NOT_TERM: {
				NOTTerm notTerm = (NOTTerm)theEObject;
				T result = caseNOTTerm(notTerm);
				if (result == null) result = caseBoolTerm(notTerm);
				if (result == null) result = caseTerm(notTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.ENUM_VALUE_REF: {
				EnumValueRef enumValueRef = (EnumValueRef)theEObject;
				T result = caseEnumValueRef(enumValueRef);
				if (result == null) result = caseTerm(enumValueRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.PROJECT_PARAMETER: {
				ProjectParameter projectParameter = (ProjectParameter)theEObject;
				T result = caseProjectParameter(projectParameter);
				if (result == null) result = caseParameter(projectParameter);
				if (result == null) result = caseNamed(projectParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.PROCESS_PARAMETER: {
				ProcessParameter processParameter = (ProcessParameter)theEObject;
				T result = caseProcessParameter(processParameter);
				if (result == null) result = caseParameter(processParameter);
				if (result == null) result = caseNamed(processParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.LIST_TYPE: {
				ListType listType = (ListType)theEObject;
				T result = caseListType(listType);
				if (result == null) result = caseType(listType);
				if (result == null) result = caseNamed(listType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.PLANNING_PARAMETER: {
				PlanningParameter planningParameter = (PlanningParameter)theEObject;
				T result = casePlanningParameter(planningParameter);
				if (result == null) result = caseParameter(planningParameter);
				if (result == null) result = caseNamed(planningParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.IN_LIST: {
				InList inList = (InList)theEObject;
				T result = caseInList(inList);
				if (result == null) result = caseBoolTerm(inList);
				if (result == null) result = caseTerm(inList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TermsPackage.PROCESS_VARIABLE: {
				ProcessVariable processVariable = (ProcessVariable)theEObject;
				T result = caseProcessVariable(processVariable);
				if (result == null) result = caseParameter(processVariable);
				if (result == null) result = caseNamed(processVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolTerm(BoolTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListTerm(ListTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamRef(ParamRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumType(EnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValue(EnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANDTerm(ANDTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORTerm(ORTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EQ Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EQ Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEQTerm(EQTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NOT Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NOT Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNOTTerm(NOTTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValueRef(EnumValueRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectParameter(ProjectParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessParameter(ProcessParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListType(ListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInList(InList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessVariable(ProcessVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planning Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planning Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanningParameter(PlanningParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TermsSwitch
