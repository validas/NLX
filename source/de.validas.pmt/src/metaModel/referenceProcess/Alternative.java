/**
 */
package metaModel.referenceProcess;

import metaModel.suptertype.Named;

import metaModel.terms.BoolTerm;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.Alternative#getProcessModules <em>Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Alternative#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends Named, ProcessModule {
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
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getAlternative_ProcessModules()
	 * @model
	 * @generated
	 */
	EList<ProcessModule> getProcessModules();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(BoolTerm)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getAlternative_Condition()
	 * @model containment="true"
	 * @generated
	 */
	BoolTerm getCondition();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Alternative#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(BoolTerm value);

} // Alternative
