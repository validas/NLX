/**
 */
package de.validas.vvt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.Check#getCheckResults <em>Check Results</em>}</li>
 *   <li>{@link de.validas.vvt.Check#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link de.validas.vvt.Check#getCheckedArtifact <em>Checked Artifact</em>}</li>
 *   <li>{@link de.validas.vvt.Check#getRequiredArtifacts <em>Required Artifacts</em>}</li>
 *   <li>{@link de.validas.vvt.Check#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.validas.vvt.Check#getInstances <em>Instances</em>}</li>
 *   <li>{@link de.validas.vvt.Check#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.validas.vvt.Check#getSubChecks <em>Sub Checks</em>}</li>
 *   <li>{@link de.validas.vvt.Check#isImplicit <em>Implicit</em>}</li>
 * </ul>
 *
 * @see de.validas.vvt.VvtPackage#getCheck()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VerdictOK InstancesComplete AuthorOrImplicit ArtifactOrImplicit'"
 * @generated
 */
public interface Check extends Described {

	/**
	 * Returns the value of the '<em><b>Check Results</b></em>' containment reference list.
	 * The list contents are of type {@link de.validas.vvt.CheckResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Results</em>' containment reference list.
	 * @see de.validas.vvt.VvtPackage#getCheck_CheckResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<CheckResult> getCheckResults();

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
	 * @see de.validas.vvt.VvtPackage#getCheck_Verdict()
	 * @model
	 * @generated
	 */
	CheckStatus getVerdict();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Check#getVerdict <em>Verdict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verdict</em>' attribute.
	 * @see de.validas.vvt.CheckStatus
	 * @see #getVerdict()
	 * @generated
	 */
	void setVerdict(CheckStatus value);

	/**
	 * Returns the value of the '<em><b>Checked Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked Artifact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked Artifact</em>' reference.
	 * @see #setCheckedArtifact(Artifact)
	 * @see de.validas.vvt.VvtPackage#getCheck_CheckedArtifact()
	 * @model
	 * @generated
	 */
	Artifact getCheckedArtifact();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Check#getCheckedArtifact <em>Checked Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked Artifact</em>' reference.
	 * @see #getCheckedArtifact()
	 * @generated
	 */
	void setCheckedArtifact(Artifact value);

	/**
	 * Returns the value of the '<em><b>Required Artifacts</b></em>' reference list.
	 * The list contents are of type {@link de.validas.vvt.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Artifacts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Artifacts</em>' reference list.
	 * @see de.validas.vvt.VvtPackage#getCheck_RequiredArtifacts()
	 * @model
	 * @generated
	 */
	EList<Artifact> getRequiredArtifacts();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference list.
	 * The list contents are of type {@link de.validas.vvt.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference list.
	 * @see de.validas.vvt.VvtPackage#getCheck_Author()
	 * @model
	 * @generated
	 */
	EList<Person> getAuthor();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.validas.vvt.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see de.validas.vvt.VvtPackage#getCheck_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link de.validas.vvt.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see de.validas.vvt.VvtPackage#getCheck_Parameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Sub Checks</b></em>' containment reference list.
	 * The list contents are of type {@link de.validas.vvt.Check}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Checks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Checks</em>' containment reference list.
	 * @see de.validas.vvt.VvtPackage#getCheck_SubChecks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Check> getSubChecks();

	/**
	 * Returns the value of the '<em><b>Implicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit</em>' attribute.
	 * @see #setImplicit(boolean)
	 * @see de.validas.vvt.VvtPackage#getCheck_Implicit()
	 * @model
	 * @generated
	 */
	boolean isImplicit();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Check#isImplicit <em>Implicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit</em>' attribute.
	 * @see #isImplicit()
	 * @generated
	 */
	void setImplicit(boolean value);
} // Check
