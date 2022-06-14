/**
 */
package metaModel.modellDescr;

import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.ProcessModule;

import metaModel.suptertype.Named;

import metaModel.terms.BoolTerm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prozess Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.modellDescr.ProzessCondition#getArtefakt <em>Artefakt</em>}</li>
 *   <li>{@link metaModel.modellDescr.ProzessCondition#getProcessmodule <em>Processmodule</em>}</li>
 *   <li>{@link metaModel.modellDescr.ProzessCondition#getVariant <em>Variant</em>}</li>
 *   <li>{@link metaModel.modellDescr.ProzessCondition#getMMConditions <em>MM Conditions</em>}</li>
 * </ul>
 *
 * @see metaModel.modellDescr.ModellDescrPackage#getProzessCondition()
 * @model
 * @generated
 */
public interface ProzessCondition extends Named {
	/**
	 * Returns the value of the '<em><b>Artefakt</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Artifact}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Artifact#getProcessConditions <em>Process Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artefakt</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefakt</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getProzessCondition_Artefakt()
	 * @see metaModel.referenceProcess.Artifact#getProcessConditions
	 * @model opposite="processConditions"
	 * @generated
	 */
	EList<Artifact> getArtefakt();

	/**
	 * Returns the value of the '<em><b>Processmodule</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processmodule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processmodule</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getProzessCondition_Processmodule()
	 * @model
	 * @generated
	 */
	EList<ProcessModule> getProcessmodule();

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' containment reference.
	 * @see #setVariant(BoolTerm)
	 * @see metaModel.modellDescr.ModellDescrPackage#getProzessCondition_Variant()
	 * @model containment="true"
	 * @generated
	 */
	BoolTerm getVariant();

	/**
	 * Sets the value of the '{@link metaModel.modellDescr.ProzessCondition#getVariant <em>Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' containment reference.
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(BoolTerm value);

	/**
	 * Returns the value of the '<em><b>MM Conditions</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MMCondition}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MMCondition#getProcessCondition <em>Process Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MM Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MM Conditions</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getProzessCondition_MMConditions()
	 * @see metaModel.modellDescr.MMCondition#getProcessCondition
	 * @model opposite="ProcessCondition"
	 * @generated
	 */
	EList<MMCondition> getMMConditions();

} // ProzessCondition
