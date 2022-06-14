/**
 */
package metaModel.terms;

import metaModel.referenceProcess.ProcessModule;
import metaModel.suptertype.Named;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.terms.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link metaModel.terms.Parameter#getBinding <em>Binding</em>}</li>
 *   <li>{@link metaModel.terms.Parameter#getValueFromListParameter <em>Value From List Parameter</em>}</li>
 *   <li>{@link metaModel.terms.Parameter#getIteratorParameters <em>Iterator Parameters</em>}</li>
 *   <li>{@link metaModel.terms.Parameter#getReusingProcessModules <em>Reusing Process Modules</em>}</li>
 * </ul>
 *
 * @see metaModel.terms.TermsPackage#getParameter()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypesOK'"
 * @generated
 */
public interface Parameter extends Named {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.terms.Type#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see metaModel.terms.TermsPackage#getParameter_Type()
	 * @see metaModel.terms.Type#getParameters
	 * @model opposite="Parameters"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link metaModel.terms.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference list.
	 * The list contents are of type {@link metaModel.terms.Binding}.
	 * It is bidirectional and its opposite is '{@link metaModel.terms.Binding#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference list.
	 * @see metaModel.terms.TermsPackage#getParameter_Binding()
	 * @see metaModel.terms.Binding#getParameter
	 * @model opposite="Parameter"
	 * @generated
	 */
	EList<Binding> getBinding();

	/**
	 * Returns the value of the '<em><b>Value From List Parameter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.terms.Parameter#getIteratorParameters <em>Iterator Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value From List Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value From List Parameter</em>' reference.
	 * @see #setValueFromListParameter(Parameter)
	 * @see metaModel.terms.TermsPackage#getParameter_ValueFromListParameter()
	 * @see metaModel.terms.Parameter#getIteratorParameters
	 * @model opposite="IteratorParameters"
	 * @generated
	 */
	Parameter getValueFromListParameter();

	/**
	 * Sets the value of the '{@link metaModel.terms.Parameter#getValueFromListParameter <em>Value From List Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value From List Parameter</em>' reference.
	 * @see #getValueFromListParameter()
	 * @generated
	 */
	void setValueFromListParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Iterator Parameters</b></em>' reference list.
	 * The list contents are of type {@link metaModel.terms.Parameter}.
	 * It is bidirectional and its opposite is '{@link metaModel.terms.Parameter#getValueFromListParameter <em>Value From List Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator Parameters</em>' reference list.
	 * @see metaModel.terms.TermsPackage#getParameter_IteratorParameters()
	 * @see metaModel.terms.Parameter#getValueFromListParameter
	 * @model opposite="ValueFromListParameter"
	 * @generated
	 */
	EList<Parameter> getIteratorParameters();

	/**
	 * Returns the value of the '<em><b>Reusing Process Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getParameterReferences <em>Parameter References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reusing Process Modules</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reusing Process Modules</em>' reference list.
	 * @see metaModel.terms.TermsPackage#getParameter_ReusingProcessModules()
	 * @see metaModel.referenceProcess.ProcessModule#getParameterReferences
	 * @model opposite="parameterReferences"
	 * @generated
	 */
	EList<ProcessModule> getReusingProcessModules();

} // Parameter
