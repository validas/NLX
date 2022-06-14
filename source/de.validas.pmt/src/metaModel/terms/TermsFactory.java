/**
 */
package metaModel.terms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metaModel.terms.TermsPackage
 * @generated
 */
public interface TermsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TermsFactory eINSTANCE = metaModel.terms.impl.TermsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	Term createTerm();

	/**
	 * Returns a new object of class '<em>Bool Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Term</em>'.
	 * @generated
	 */
	BoolTerm createBoolTerm();

	/**
	 * Returns a new object of class '<em>List Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Term</em>'.
	 * @generated
	 */
	ListTerm createListTerm();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>Param Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Ref</em>'.
	 * @generated
	 */
	ParamRef createParamRef();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Type</em>'.
	 * @generated
	 */
	EnumType createEnumType();

	/**
	 * Returns a new object of class '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Value</em>'.
	 * @generated
	 */
	EnumValue createEnumValue();

	/**
	 * Returns a new object of class '<em>AND Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND Term</em>'.
	 * @generated
	 */
	ANDTerm createANDTerm();

	/**
	 * Returns a new object of class '<em>OR Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR Term</em>'.
	 * @generated
	 */
	ORTerm createORTerm();

	/**
	 * Returns a new object of class '<em>EQ Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EQ Term</em>'.
	 * @generated
	 */
	EQTerm createEQTerm();

	/**
	 * Returns a new object of class '<em>NOT Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NOT Term</em>'.
	 * @generated
	 */
	NOTTerm createNOTTerm();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns a new object of class '<em>Enum Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Value Ref</em>'.
	 * @generated
	 */
	EnumValueRef createEnumValueRef();

	/**
	 * Returns a new object of class '<em>Project Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Parameter</em>'.
	 * @generated
	 */
	ProjectParameter createProjectParameter();

	/**
	 * Returns a new object of class '<em>Process Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Parameter</em>'.
	 * @generated
	 */
	ProcessParameter createProcessParameter();

	/**
	 * Returns a new object of class '<em>List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Type</em>'.
	 * @generated
	 */
	ListType createListType();

	/**
	 * Returns a new object of class '<em>In List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In List</em>'.
	 * @generated
	 */
	InList createInList();

	/**
	 * Returns a new object of class '<em>Process Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Variable</em>'.
	 * @generated
	 */
	ProcessVariable createProcessVariable();

	/**
	 * Returns a new object of class '<em>Planning Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planning Parameter</em>'.
	 * @generated
	 */
	PlanningParameter createPlanningParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TermsPackage getTermsPackage();

} //TermsFactory
