/**
 */
package metaModel.modellDescr;

import metaModel.referenceProcess.Model;
import metaModel.suptertype.Named;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Modell Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.modellDescr.MetaModelAttribute#getMMConditions <em>MM Conditions</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelAttribute#getMandatoryInModels <em>Mandatory In Models</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelAttribute#getType <em>Type</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelAttribute#getOptionalInModels <em>Optional In Models</em>}</li>
 * </ul>
 *
 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypeCheck'"
 * @generated
 */
public interface MetaModelAttribute extends Named {
	/**
	 * Returns the value of the '<em><b>MM Conditions</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MMCondition}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MMCondition#getMetaModellAttributes <em>Meta Modell Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MM Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MM Conditions</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelAttribute_MMConditions()
	 * @see metaModel.modellDescr.MMCondition#getMetaModellAttributes
	 * @model opposite="MetaModellAttributes"
	 * @generated
	 */
	EList<MMCondition> getMMConditions();

	/**
	 * Returns the value of the '<em><b>Mandatory In Models</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Model}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Model#getMandatoryAttributes <em>Mandatory Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used In Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory In Models</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelAttribute_MandatoryInModels()
	 * @see metaModel.referenceProcess.Model#getMandatoryAttributes
	 * @model opposite="MandatoryAttributes"
	 * @generated
	 */
	EList<Model> getMandatoryInModels();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelAttribute_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link metaModel.modellDescr.MetaModelAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Optional In Models</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Model}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Model#getOptionalAttributes <em>Optional Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional In Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional In Models</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelAttribute_OptionalInModels()
	 * @see metaModel.referenceProcess.Model#getOptionalAttributes
	 * @model opposite="OptionalAttributes"
	 * @generated
	 */
	EList<Model> getOptionalInModels();

} // MetaModellAttribute
