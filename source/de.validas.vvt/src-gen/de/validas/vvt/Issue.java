/**
 */
package de.validas.vvt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.validas.vvt.Issue#getLink <em>Link</em>}</li>
 *   <li>{@link de.validas.vvt.Issue#getWorkaround <em>Workaround</em>}</li>
 *   <li>{@link de.validas.vvt.Issue#getFoundInRevisionOrDate <em>Found In Revision Or Date</em>}</li>
 *   <li>{@link de.validas.vvt.Issue#getFixedInRevisionOrDate <em>Fixed In Revision Or Date</em>}</li>
 *   <li>{@link de.validas.vvt.Issue#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link de.validas.vvt.Issue#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @see de.validas.vvt.VvtPackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends Described {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see de.validas.vvt.VvtPackage#getIssue_Link()
	 * @model
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Issue#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

	/**
	 * Returns the value of the '<em><b>Workaround</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workaround</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workaround</em>' attribute.
	 * @see #setWorkaround(String)
	 * @see de.validas.vvt.VvtPackage#getIssue_Workaround()
	 * @model
	 * @generated
	 */
	String getWorkaround();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Issue#getWorkaround <em>Workaround</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workaround</em>' attribute.
	 * @see #getWorkaround()
	 * @generated
	 */
	void setWorkaround(String value);

	/**
	 * Returns the value of the '<em><b>Found In Revision Or Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Found In Revision Or Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Found In Revision Or Date</em>' attribute.
	 * @see #setFoundInRevisionOrDate(String)
	 * @see de.validas.vvt.VvtPackage#getIssue_FoundInRevisionOrDate()
	 * @model
	 * @generated
	 */
	String getFoundInRevisionOrDate();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Issue#getFoundInRevisionOrDate <em>Found In Revision Or Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Found In Revision Or Date</em>' attribute.
	 * @see #getFoundInRevisionOrDate()
	 * @generated
	 */
	void setFoundInRevisionOrDate(String value);

	/**
	 * Returns the value of the '<em><b>Fixed In Revision Or Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed In Revision Or Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed In Revision Or Date</em>' attribute.
	 * @see #setFixedInRevisionOrDate(String)
	 * @see de.validas.vvt.VvtPackage#getIssue_FixedInRevisionOrDate()
	 * @model
	 * @generated
	 */
	String getFixedInRevisionOrDate();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Issue#getFixedInRevisionOrDate <em>Fixed In Revision Or Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed In Revision Or Date</em>' attribute.
	 * @see #getFixedInRevisionOrDate()
	 * @generated
	 */
	void setFixedInRevisionOrDate(String value);

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' reference.
	 * @see #setArtifact(Artifact)
	 * @see de.validas.vvt.VvtPackage#getIssue_Artifact()
	 * @model
	 * @generated
	 */
	Artifact getArtifact();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Issue#getArtifact <em>Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' reference.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(Artifact value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The default value is <code>"MAJOR"</code>.
	 * The literals are from the enumeration {@link de.validas.vvt.Severity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see de.validas.vvt.Severity
	 * @see #setSeverity(Severity)
	 * @see de.validas.vvt.VvtPackage#getIssue_Severity()
	 * @model default="MAJOR"
	 * @generated
	 */
	Severity getSeverity();

	/**
	 * Sets the value of the '{@link de.validas.vvt.Issue#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see de.validas.vvt.Severity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Severity value);

} // Issue
