/**
 */
package metaModel.referenceProcess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.RequiredDocument#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getRequiredDocument()
 * @model
 * @generated
 */
public interface RequiredDocument extends Requirement {
	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getRequiredDocument_Artifacts()
	 * @model
	 * @generated
	 */
	EList<Artifact> getArtifacts();

} // RequiredDocument
