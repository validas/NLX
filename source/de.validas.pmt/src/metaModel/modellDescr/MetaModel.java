/**
 */
package metaModel.modellDescr;

import metaModel.referenceProcess.Tool;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.modellDescr.MetaModel#getMetaModelElements <em>Meta Model Elements</em>}</li>
 *   <li>{@link metaModel.modellDescr.MetaModel#getTool <em>Tool</em>}</li>
 * </ul>
 *
 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RootCheck'"
 * @generated
 */
public interface MetaModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.modellDescr.MetaModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Modell Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model Elements</em>' containment reference list.
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModel_MetaModelElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaModelElement> getMetaModelElements();

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Tool#getMetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' reference.
	 * @see #setTool(Tool)
	 * @see metaModel.modellDescr.ModellDescrPackage#getMetaModel_Tool()
	 * @see metaModel.referenceProcess.Tool#getMetaModel
	 * @model opposite="MetaModel"
	 * @generated
	 */
	Tool getTool();

	/**
	 * Sets the value of the '{@link metaModel.modellDescr.MetaModel#getTool <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' reference.
	 * @see #getTool()
	 * @generated
	 */
	void setTool(Tool value);

} // MetaModel
