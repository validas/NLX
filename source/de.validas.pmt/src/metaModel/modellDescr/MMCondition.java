/**
 */
package metaModel.modellDescr;

import metaModel.suptertype.Named;

import metaModel.terms.BoolTerm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MM Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.modellDescr.MMCondition#getMetaModellElements <em>Meta Modell Elements</em>}</li>
 *   <li>{@link metaModel.modellDescr.MMCondition#getMetaModellAttributes <em>Meta Modell Attributes</em>}</li>
 *   <li>{@link metaModel.modellDescr.MMCondition#getMetaModellAssociations <em>Meta Modell Associations</em>}</li>
 *   <li>{@link metaModel.modellDescr.MMCondition#getVariant <em>Variant</em>}</li>
 *   <li>{@link metaModel.modellDescr.MMCondition#getProcessCondition <em>Process Condition</em>}</li>
 * </ul>
 *
 * @see metaModel.modellDescr.ModellDescrPackage#getMMCondition()
 * @model
 * @generated
 */
public interface MMCondition extends Named {
	/**
	 * Returns the value of the '<em><b>Meta Modell Elements</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelElement}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MetaModelElement#getMMConditions <em>MM Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Modell Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Modell Elements</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMMCondition_MetaModellElements()
	 * @see metaModel.modellDescr.MetaModelElement#getMMConditions
	 * @model opposite="MMConditions"
	 * @generated
	 */
	EList<MetaModelElement> getMetaModellElements();

	/**
	 * Returns the value of the '<em><b>Meta Modell Attributes</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelAttribute}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MetaModelAttribute#getMMConditions <em>MM Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Modell Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Modell Attributes</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMMCondition_MetaModellAttributes()
	 * @see metaModel.modellDescr.MetaModelAttribute#getMMConditions
	 * @model opposite="MMConditions"
	 * @generated
	 */
	EList<MetaModelAttribute> getMetaModellAttributes();

	/**
	 * Returns the value of the '<em><b>Meta Modell Associations</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelAssociation}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MetaModelAssociation#getMMConditions <em>MM Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Modell Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Modell Associations</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMMCondition_MetaModellAssociations()
	 * @see metaModel.modellDescr.MetaModelAssociation#getMMConditions
	 * @model opposite="MMConditions"
	 * @generated
	 */
	EList<MetaModelAssociation> getMetaModellAssociations();

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
	 * @see metaModel.modellDescr.ModellDescrPackage#getMMCondition_Variant()
	 * @model containment="true"
	 * @generated
	 */
	BoolTerm getVariant();

	/**
	 * Sets the value of the '{@link metaModel.modellDescr.MMCondition#getVariant <em>Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' containment reference.
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(BoolTerm value);

	/**
	 * Returns the value of the '<em><b>Process Condition</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.ProzessCondition}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.ProzessCondition#getMMConditions <em>MM Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Condition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Condition</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMMCondition_ProcessCondition()
	 * @see metaModel.modellDescr.ProzessCondition#getMMConditions
	 * @model opposite="MMConditions"
	 * @generated
	 */
	EList<ProzessCondition> getProcessCondition();

} // MMCondition
