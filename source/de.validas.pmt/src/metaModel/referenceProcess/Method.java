/**
 */
package metaModel.referenceProcess;

import metaModel.suptertype.Variantable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.Method#getTools <em>Tools</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Variantable {
	/**
	 * Returns the value of the '<em><b>Tools</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Tool}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Tool#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tools</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getMethod_Tools()
	 * @see metaModel.referenceProcess.Tool#getMethods
	 * @model opposite="Methods"
	 * @generated
	 */
	EList<Tool> getTools();

} // Method
