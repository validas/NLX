/**
 */
package metaModel.referenceProcess;

import metaModel.modellDescr.MetaModel;
import metaModel.modellDescr.MetaModelAssociation;
import metaModel.modellDescr.MetaModelAttribute;
import metaModel.modellDescr.MetaModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.Model#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Model#getIncludes <em>Includes</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Model#getIsIncludedIn <em>Is Included In</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Model#getMandatoryElements <em>Mandatory Elements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Model#getMandatoryAttributes <em>Mandatory Attributes</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Model#getMandatoryAssociations <em>Mandatory Associations</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Model#getOptionalElements <em>Optional Elements</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Model#getOptionalAttributes <em>Optional Attributes</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Model#getOptionalAssociations <em>Optional Associations</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MMConsistent MMConsistentIncluded MMAttributesInElements MMAssociationsInElements'"
 * @generated
 */
public interface Model extends Artifact {
	/**
	 * Returns the value of the '<em><b>Meta Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model</em>' containment reference.
	 * @see #setMetaModel(MetaModel)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getModel_MetaModel()
	 * @model containment="true"
	 * @generated
	 */
	MetaModel getMetaModel();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Model#getMetaModel <em>Meta Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model</em>' containment reference.
	 * @see #getMetaModel()
	 * @generated
	 */
	void setMetaModel(MetaModel value);

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Model}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Model#getIsIncludedIn <em>Is Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getModel_Includes()
	 * @see metaModel.referenceProcess.Model#getIsIncludedIn
	 * @model opposite="IsIncludedIn"
	 * @generated
	 */
	EList<Model> getIncludes();

	/**
	 * Returns the value of the '<em><b>Is Included In</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Model}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Model#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Included In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Included In</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getModel_IsIncludedIn()
	 * @see metaModel.referenceProcess.Model#getIncludes
	 * @model opposite="Includes"
	 * @generated
	 */
	EList<Model> getIsIncludedIn();

	/**
	 * Returns the value of the '<em><b>Mandatory Elements</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelElement}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MetaModelElement#getMandatoryInModels <em>Mandatory In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Elements</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getModel_MandatoryElements()
	 * @see metaModel.modellDescr.MetaModelElement#getMandatoryInModels
	 * @model opposite="MandatoryInModels"
	 * @generated
	 */
	EList<MetaModelElement> getMandatoryElements();

	/**
	 * Returns the value of the '<em><b>Mandatory Attributes</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelAttribute}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MetaModelAttribute#getMandatoryInModels <em>Mandatory In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Attributes</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getModel_MandatoryAttributes()
	 * @see metaModel.modellDescr.MetaModelAttribute#getMandatoryInModels
	 * @model opposite="MandatoryInModels"
	 * @generated
	 */
	EList<MetaModelAttribute> getMandatoryAttributes();

	/**
	 * Returns the value of the '<em><b>Mandatory Associations</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelAssociation}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MetaModelAssociation#getMandatoryInModels <em>Mandatory In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Associations</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getModel_MandatoryAssociations()
	 * @see metaModel.modellDescr.MetaModelAssociation#getMandatoryInModels
	 * @model opposite="MandatoryInModels"
	 * @generated
	 */
	EList<MetaModelAssociation> getMandatoryAssociations();

	/**
	 * Returns the value of the '<em><b>Optional Elements</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelElement}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MetaModelElement#getOptionalInModels <em>Optional In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Elements</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getModel_OptionalElements()
	 * @see metaModel.modellDescr.MetaModelElement#getOptionalInModels
	 * @model opposite="OptionalInModels"
	 * @generated
	 */
	EList<MetaModelElement> getOptionalElements();

	/**
	 * Returns the value of the '<em><b>Optional Attributes</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelAttribute}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MetaModelAttribute#getOptionalInModels <em>Optional In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Attributes</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getModel_OptionalAttributes()
	 * @see metaModel.modellDescr.MetaModelAttribute#getOptionalInModels
	 * @model opposite="OptionalInModels"
	 * @generated
	 */
	EList<MetaModelAttribute> getOptionalAttributes();

	/**
	 * Returns the value of the '<em><b>Optional Associations</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelAssociation}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MetaModelAssociation#getOptionalInModels <em>Optional In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Associations</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getModel_OptionalAssociations()
	 * @see metaModel.modellDescr.MetaModelAssociation#getOptionalInModels
	 * @model opposite="OptionalInModels"
	 * @generated
	 */
	EList<MetaModelAssociation> getOptionalAssociations();

} // Model
