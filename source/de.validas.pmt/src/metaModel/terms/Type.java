/**
 */
package metaModel.terms;

import metaModel.suptertype.Named;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.terms.Type#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see metaModel.terms.TermsPackage#getType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypesOK'"
 * @generated
 */
public interface Type extends Named {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link metaModel.terms.Parameter}.
	 * It is bidirectional and its opposite is '{@link metaModel.terms.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see metaModel.terms.TermsPackage#getType_Parameters()
	 * @see metaModel.terms.Parameter#getType
	 * @model opposite="Type"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Type
