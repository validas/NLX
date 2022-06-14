/**
 */
package de.validas.vvt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.CheckResult#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link de.validas.vvt.CheckResult#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.validas.vvt.CheckResult#getArtifactRevisionOrDate <em>Artifact Revision Or Date</em>}</li>
 *   <li>{@link de.validas.vvt.CheckResult#getJustification <em>Justification</em>}</li>
 *   <li>{@link de.validas.vvt.CheckResult#getInstances <em>Instances</em>}</li>
 *   <li>{@link de.validas.vvt.CheckResult#getIssues <em>Issues</em>}</li>
 *   <li>{@link de.validas.vvt.CheckResult#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see de.validas.vvt.VvtPackage#getCheckResult()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VerdictOK InstancesComplete JustificationPresent DateOK OutDated'"
 * @generated
 */
public interface CheckResult extends Described {
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
	 * @see de.validas.vvt.VvtPackage#getCheckResult_Verdict()
	 * @model
	 * @generated
	 */
	CheckStatus getVerdict();

	/**
	 * Sets the value of the '{@link de.validas.vvt.CheckResult#getVerdict <em>Verdict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verdict</em>' attribute.
	 * @see de.validas.vvt.CheckStatus
	 * @see #getVerdict()
	 * @generated
	 */
	void setVerdict(CheckStatus value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(String)
	 * @see de.validas.vvt.VvtPackage#getCheckResult_TimeStamp()
	 * @model
	 * @generated
	 */
	String getTimeStamp();

	/**
	 * Sets the value of the '{@link de.validas.vvt.CheckResult#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Revision Or Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Revision Or Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Revision Or Date</em>' attribute.
	 * @see #setArtifactRevisionOrDate(String)
	 * @see de.validas.vvt.VvtPackage#getCheckResult_ArtifactRevisionOrDate()
	 * @model
	 * @generated
	 */
	String getArtifactRevisionOrDate();

	/**
	 * Sets the value of the '{@link de.validas.vvt.CheckResult#getArtifactRevisionOrDate <em>Artifact Revision Or Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Revision Or Date</em>' attribute.
	 * @see #getArtifactRevisionOrDate()
	 * @generated
	 */
	void setArtifactRevisionOrDate(String value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justification</em>' attribute.
	 * @see #setJustification(String)
	 * @see de.validas.vvt.VvtPackage#getCheckResult_Justification()
	 * @model
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link de.validas.vvt.CheckResult#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link de.validas.vvt.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see de.validas.vvt.VvtPackage#getCheckResult_Instances()
	 * @model
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference list.
	 * The list contents are of type {@link de.validas.vvt.Issue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issues</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' reference list.
	 * @see de.validas.vvt.VvtPackage#getCheckResult_Issues()
	 * @model
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Person)
	 * @see de.validas.vvt.VvtPackage#getCheckResult_Author()
	 * @model
	 * @generated
	 */
	Person getAuthor();

	/**
	 * Sets the value of the '{@link de.validas.vvt.CheckResult#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Person value);

} // CheckResult
