/**
 */
package metaModel.terms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.terms.Binding#getParameter <em>Parameter</em>}</li>
 *   <li>{@link metaModel.terms.Binding#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see metaModel.terms.TermsPackage#getBinding()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypesOK OccursCheck'"
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.terms.Parameter#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see metaModel.terms.TermsPackage#getBinding_Parameter()
	 * @see metaModel.terms.Parameter#getBinding
	 * @model opposite="Binding"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link metaModel.terms.Binding#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Term)
	 * @see metaModel.terms.TermsPackage#getBinding_Value()
	 * @model containment="true"
	 * @generated
	 */
	Term getValue();

	/**
	 * Sets the value of the '{@link metaModel.terms.Binding#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Term value);

} // Binding
