/**
 */
package metaModel.modellDescr;

import metaModel.referenceProcess.Model;
import metaModel.suptertype.Named;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Modell Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.modellDescr.MetaModelElement#getMMConditions <em>MM Conditions</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelElement#getMetaModelAttributes <em>Meta Model Attributes</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelElement#getMetaModelAssociations <em>Meta Model Associations</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelElement#getMandatoryInModels <em>Mandatory In Models</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelElement#getParents <em>Parents</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelElement#isIsRoot <em>Is Root</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelElement#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModelElement#getOptionalInModels <em>Optional In Models</em>}</li>
 * </ul>
 *
 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CycleCheck ContainedCheck'"
 * @generated
 */
public interface MetaModelElement extends Named {
	/**
	 * Returns the value of the '<em><b>MM Conditions</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MMCondition}.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MMCondition#getMetaModellElements <em>Meta Modell Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MM Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MM Conditions</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelElement_MMConditions()
	 * @see metaModel.modellDescr.MMCondition#getMetaModellElements
	 * @model opposite="MetaModellElements"
	 * @generated
	 */
	EList<MMCondition> getMMConditions();

	/**
	 * Returns the value of the '<em><b>Meta Model Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Modell Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model Attributes</em>' containment reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelElement_MetaModelAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaModelAttribute> getMetaModelAttributes();

	/**
	 * Returns the value of the '<em><b>Meta Model Associations</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Modell Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model Associations</em>' containment reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelElement_MetaModelAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaModelAssociation> getMetaModelAssociations();

	/**
	 * Returns the value of the '<em><b>Mandatory In Models</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Model}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Model#getMandatoryElements <em>Mandatory Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used In Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory In Models</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelElement_MandatoryInModels()
	 * @see metaModel.referenceProcess.Model#getMandatoryElements
	 * @model opposite="MandatoryElements"
	 * @generated
	 */
	EList<Model> getMandatoryInModels();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelElement_Parents()
	 * @model
	 * @generated
	 */
	EList<MetaModelElement> getParents();

	/**
	 * Returns the value of the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Root</em>' attribute.
	 * @see #setIsRoot(boolean)
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelElement_IsRoot()
	 * @model
	 * @generated
	 */
	boolean isIsRoot();

	/**
	 * Sets the value of the '{@link metaModel.modellDescr.MetaModelElement#isIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #isIsRoot()
	 * @generated
	 */
	void setIsRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelElement_IsAbstract()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link metaModel.modellDescr.MetaModelElement#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Optional In Models</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Model}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Model#getOptionalElements <em>Optional Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional In Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional In Models</em>' reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModelElement_OptionalInModels()
	 * @see metaModel.referenceProcess.Model#getOptionalElements
	 * @model opposite="OptionalElements"
	 * @generated
	 */
	EList<Model> getOptionalInModels();

} // MetaModellElement
