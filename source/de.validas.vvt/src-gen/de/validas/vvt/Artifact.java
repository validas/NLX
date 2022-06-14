/**
 */
package de.validas.vvt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.Artifact#getPath <em>Path</em>}</li>
 *   <li>{@link de.validas.vvt.Artifact#getModified <em>Modified</em>}</li>
 *   <li>{@link de.validas.vvt.Artifact#getRepository <em>Repository</em>}</li>
 *   <li>{@link de.validas.vvt.Artifact#getDevleopers <em>Devleopers</em>}</li>
 *   <li>{@link de.validas.vvt.Artifact#getRevision <em>Revision</em>}</li>
 * </ul>
 *
 * @see de.validas.vvt.VvtPackage#getArtifact()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DateOrRevision'"
 * @generated
 */
public interface Artifact extends Described {

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.validas.vvt.VvtPackage#getArtifact_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Artifact#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(String)
	 * @see de.validas.vvt.VvtPackage#getArtifact_Modified()
	 * @model
	 * @generated
	 */
	String getModified();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Artifact#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see de.validas.vvt.VvtPackage#getArtifact_Repository()
	 * @model
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Artifact#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Devleopers</b></em>' reference list.
	 * The list contents are of type {@link de.validas.vvt.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devleopers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devleopers</em>' reference list.
	 * @see de.validas.vvt.VvtPackage#getArtifact_Devleopers()
	 * @model
	 * @generated
	 */
	EList<Person> getDevleopers();

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(String)
	 * @see de.validas.vvt.VvtPackage#getArtifact_Revision()
	 * @model
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Artifact#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);
} // Artifact
