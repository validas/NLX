/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workaround</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.Workaround#getIssue <em>Issue</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getWorkaround()
 * @model
 * @generated
 */
public interface Workaround extends EObject {
	/**
	 * Returns the value of the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' attribute.
	 * @see #setIssue(String)
	 * @see metaModel.MetaModelPackage#getWorkaround_Issue()
	 * @model
	 * @generated
	 */
	String getIssue();

	/**
	 * Sets the value of the '{@link metaModel.Workaround#getIssue <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' attribute.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(String value);

} // Workaround
