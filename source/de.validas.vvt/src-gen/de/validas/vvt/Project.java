/**
 */
package de.validas.vvt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.Project#getChecks <em>Checks</em>}</li>
 *   <li>{@link de.validas.vvt.Project#getRepository <em>Repository</em>}</li>
 *   <li>{@link de.validas.vvt.Project#getPersons <em>Persons</em>}</li>
 *   <li>{@link de.validas.vvt.Project#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link de.validas.vvt.Project#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.validas.vvt.Project#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link de.validas.vvt.Project#getIssues <em>Issues</em>}</li>
 *   <li>{@link de.validas.vvt.Project#getIssueTracker <em>Issue Tracker</em>}</li>
 *   <li>{@link de.validas.vvt.Project#getProduct <em>Product</em>}</li>
 *   <li>{@link de.validas.vvt.Project#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see de.validas.vvt.VvtPackage#getProject()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RepositorySpecified VerdictOK'"
 * @generated
 */
public interface Project extends Described {
	/**
	 * Returns the value of the '<em><b>Checks</b></em>' containment reference list.
	 * The list contents are of type {@link de.validas.vvt.Check}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checks</em>' containment reference list.
	 * @see de.validas.vvt.VvtPackage#getProject_Checks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Check> getChecks();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference list.
	 * The list contents are of type {@link de.validas.vvt.Repository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference list.
	 * @see de.validas.vvt.VvtPackage#getProject_Repository()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepository();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link de.validas.vvt.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see de.validas.vvt.VvtPackage#getProject_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link de.validas.vvt.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see de.validas.vvt.VvtPackage#getProject_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link de.validas.vvt.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see de.validas.vvt.VvtPackage#getProject_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Verdict</b></em>' attribute.
	 * The literals are from the enumeration {@link de.validas.vvt.CheckStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verdict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verdict</em>' attribute.
	 * @see de.validas.vvt.CheckStatus
	 * @see #setVerdict(CheckStatus)
	 * @see de.validas.vvt.VvtPackage#getProject_Verdict()
	 * @model
	 * @generated
	 */
	CheckStatus getVerdict();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Project#getVerdict <em>Verdict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verdict</em>' attribute.
	 * @see de.validas.vvt.CheckStatus
	 * @see #getVerdict()
	 * @generated
	 */
	void setVerdict(CheckStatus value);

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link de.validas.vvt.Issue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see de.validas.vvt.VvtPackage#getProject_Issues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Issue Tracker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Tracker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Tracker</em>' attribute.
	 * @see #setIssueTracker(String)
	 * @see de.validas.vvt.VvtPackage#getProject_IssueTracker()
	 * @model
	 * @generated
	 */
	String getIssueTracker();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Project#getIssueTracker <em>Issue Tracker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Tracker</em>' attribute.
	 * @see #getIssueTracker()
	 * @generated
	 */
	void setIssueTracker(String value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' attribute.
	 * @see #setProduct(String)
	 * @see de.validas.vvt.VvtPackage#getProject_Product()
	 * @model
	 * @generated
	 */
	String getProduct();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Project#getProduct <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' attribute.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.validas.vvt.VvtPackage#getProject_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Project#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Project
