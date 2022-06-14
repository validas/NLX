/**
 */
package metaModel.referenceProcess;

import metaModel.suptertype.Named;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.Parallel#getProcessModules <em>Process Modules</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends Named, ProcessModule {
	/**
	 * Returns the value of the '<em><b>Process Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Modules</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getParallel_ProcessModules()
	 * @model
	 * @generated
	 */
	EList<ProcessModule> getProcessModules();

} // Parallel
