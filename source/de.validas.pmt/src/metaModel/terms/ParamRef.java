/**
 */
package metaModel.terms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.terms.ParamRef#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see metaModel.terms.TermsPackage#getParamRef()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ReferenceOK'"
 * @generated
 */
public interface ParamRef extends Term {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see metaModel.terms.TermsPackage#getParamRef_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link metaModel.terms.ParamRef#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ParamRef
