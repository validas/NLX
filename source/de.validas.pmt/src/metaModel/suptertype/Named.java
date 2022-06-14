/**
 */
package metaModel.suptertype;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.suptertype.Named#getName <em>Name</em>}</li>
 *   <li>{@link metaModel.suptertype.Named#getDescription <em>Description</em>}</li>
 *   <li>{@link metaModel.suptertype.Named#getID <em>ID</em>}</li>
 *   <li>{@link metaModel.suptertype.Named#getComment <em>Comment</em>}</li>
 *   <li>{@link metaModel.suptertype.Named#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link metaModel.suptertype.Named#isDeactivated <em>Deactivated</em>}</li>
 * </ul>
 *
 * @see metaModel.suptertype.SuptertypePackage#getNamed()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DescriptionOK TypeUniqueName GlobalUniqueName'"
 * @generated
 */
public interface Named extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metaModel.suptertype.SuptertypePackage#getNamed_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metaModel.suptertype.Named#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see metaModel.suptertype.SuptertypePackage#getNamed_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link metaModel.suptertype.Named#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see metaModel.suptertype.SuptertypePackage#getNamed_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link metaModel.suptertype.Named#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see metaModel.suptertype.SuptertypePackage#getNamed_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link metaModel.suptertype.Named#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' attribute.
	 * @see #setLongDescription(String)
	 * @see metaModel.suptertype.SuptertypePackage#getNamed_LongDescription()
	 * @model
	 * @generated
	 */
	String getLongDescription();

	/**
	 * Sets the value of the '{@link metaModel.suptertype.Named#getLongDescription <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Description</em>' attribute.
	 * @see #getLongDescription()
	 * @generated
	 */
	void setLongDescription(String value);

	/**
	 * Returns the value of the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deactivated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deactivated</em>' attribute.
	 * @see #setDeactivated(boolean)
	 * @see metaModel.suptertype.SuptertypePackage#getNamed_Deactivated()
	 * @model
	 * @generated
	 */
	boolean isDeactivated();

	/**
	 * Sets the value of the '{@link metaModel.suptertype.Named#isDeactivated <em>Deactivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deactivated</em>' attribute.
	 * @see #isDeactivated()
	 * @generated
	 */
	void setDeactivated(boolean value);

} // Named
