/**
 */
package metaModel.terms;

import metaModel.referenceProcess.ProcessModule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.terms.ProcessVariable#getDeterminedByProcessModules <em>Determined By Process Modules</em>}</li>
 * </ul>
 *
 * @see metaModel.terms.TermsPackage#getProcessVariable()
 * @model
 * @generated
 */
public interface ProcessVariable extends Parameter {
	/**
	 * Returns the value of the '<em><b>Determined By Process Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getDeterminedVariables <em>Determined Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Determined By Process Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Determined By Process Modules</em>' reference list.
	 * @see metaModel.terms.TermsPackage#getProcessVariable_DeterminedByProcessModules()
	 * @see metaModel.referenceProcess.ProcessModule#getDeterminedVariables
	 * @model opposite="DeterminedVariables"
	 * @generated
	 */
	EList<ProcessModule> getDeterminedByProcessModules();

} // ProcessVariable
