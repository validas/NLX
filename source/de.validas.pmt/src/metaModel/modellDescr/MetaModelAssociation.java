/**
 */
package metaModel.modellDescr;

import metaModel.referenceProcess.Model;
import metaModel.suptertype.Named;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Modell Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.modellDescr.MetaModelAssociation#getMMConditions <em>MM Conditions</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelAssociation#getMandatoryInModels <em>Mandatory In Models</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelAssociation#getToElement <em>To Element</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelAssociation#isContainment <em>Containment</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelAssociation#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelAssociation#getOptionalInModels <em>Optional In Models</em>}</li>
 * </ul>
 *
 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypeCheck'"
 * @generated
 */
public interface MetaModelAssociation extends Named {
	/**
	 * Returns the value of the '<em><b>MM Conditions</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MMCondition}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MMCondition#getMetaModellAssociations <em>Meta Modell Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MM Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MM Conditions</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelAssociation_MMConditions()
	 * @see metaModel.modellDescr.MMCondition#getMetaModellAssociations
	 * @model opposite="MetaModellAssociations"
	 * @generated
	 */
	EList<MMCondition> getMMConditions();

	/**
	 * Returns the value of the '<em><b>Mandatory In Models</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Model}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Model#getMandatoryAssociations <em>Mandatory Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used In Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory In Models</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelAssociation_MandatoryInModels()
	 * @see metaModel.referenceProcess.Model#getMandatoryAssociations
	 * @model opposite="MandatoryAssociations"
	 * @generated
	 */
	EList<Model> getMandatoryInModels();

	/**
	 * Returns the value of the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Element</em>' reference.
	 * @see #setToElement(MetaModelElement)
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelAssociation_ToElement()
	 * @model
	 * @generated
	 */
	MetaModelElement getToElement();

	/**
	 * Sets the value of the '{@link metaModel.modellDescr.MetaModelAssociation#getToElement <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element</em>' reference.
	 * @see #getToElement()
	 * @generated
	 */
	void setToElement(MetaModelElement value);

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelAssociation_Containment()
	 * @model
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link metaModel.modellDescr.MetaModelAssociation#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link metaModel.modellDescr.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see metaModel.modellDescr.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelAssociation_Cardinality()
	 * @model
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link metaModel.modellDescr.MetaModelAssociation#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see metaModel.modellDescr.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Optional In Models</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Model}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Model#getOptionalAssociations <em>Optional Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional In Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional In Models</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelAssociation_OptionalInModels()
	 * @see metaModel.referenceProcess.Model#getOptionalAssociations
	 * @model opposite="OptionalAssociations"
	 * @generated
	 */
	EList<Model> getOptionalInModels();

} // MetaModellAssociation
