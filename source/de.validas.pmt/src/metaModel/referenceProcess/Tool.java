/**
 */
package metaModel.referenceProcess;

import metaModel.modellDescr.MetaModel;
import metaModel.suptertype.Variantable;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.referenceProcess.Tool#getProcessModules <em>Process Modules</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Tool#getMethods <em>Methods</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Tool#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Tool#getPreliminaryClassification <em>Preliminary Classification</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Tool#getClassificationExplanation <em>Classification Explanation</em>}</li>
 *   <li>{@link metaModel.referenceProcess.Tool#getToolOwner <em>Tool Owner</em>}</li>
 * </ul>
 *
 * @see metaModel.referenceProcess.ReferenceProcessPackage#getTool()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ToolUsedInProcess'"
 * @generated
 */
public interface Tool extends Variantable {
	/**
	 * Returns the value of the '<em><b>Process Modules</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.ProcessModule}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.ProcessModule#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Modules</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getTool_ProcessModules()
	 * @see metaModel.referenceProcess.ProcessModule#getTools
	 * @model opposite="tools"
	 * @generated
	 */
	EList<ProcessModule> getProcessModules();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' reference list.
	 * The list contents are of type {@link metaModel.referenceProcess.Method}.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.Method#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' reference list.
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getTool_Methods()
	 * @see metaModel.referenceProcess.Method#getTools
	 * @model opposite="Tools"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Meta Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.modellDescr.MetaModel#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model</em>' reference.
	 * @see #setMetaModel(MetaModel)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getTool_MetaModel()
	 * @see metaModel.modellDescr.MetaModel#getTool
	 * @model opposite="Tool"
	 * @generated
	 */
	MetaModel getMetaModel();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Tool#getMetaModel <em>Meta Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model</em>' reference.
	 * @see #getMetaModel()
	 * @generated
	 */
	void setMetaModel(MetaModel value);

	/**
	 * Returns the value of the '<em><b>Preliminary Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preliminary Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preliminary Classification</em>' attribute.
	 * @see #setPreliminaryClassification(String)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getTool_PreliminaryClassification()
	 * @model
	 * @generated
	 */
	String getPreliminaryClassification();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Tool#getPreliminaryClassification <em>Preliminary Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preliminary Classification</em>' attribute.
	 * @see #getPreliminaryClassification()
	 * @generated
	 */
	void setPreliminaryClassification(String value);

	/**
	 * Returns the value of the '<em><b>Classification Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Explanation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Explanation</em>' attribute.
	 * @see #setClassificationExplanation(String)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getTool_ClassificationExplanation()
	 * @model
	 * @generated
	 */
	String getClassificationExplanation();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Tool#getClassificationExplanation <em>Classification Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Explanation</em>' attribute.
	 * @see #getClassificationExplanation()
	 * @generated
	 */
	void setClassificationExplanation(String value);

	/**
	 * Returns the value of the '<em><b>Tool Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.referenceProcess.StakeHolder#getOwnedTools <em>Owned Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Owner</em>' reference.
	 * @see #setToolOwner(StakeHolder)
	 * @see metaModel.referenceProcess.ReferenceProcessPackage#getTool_ToolOwner()
	 * @see metaModel.referenceProcess.StakeHolder#getOwnedTools
	 * @model opposite="OwnedTools"
	 * @generated
	 */
	StakeHolder getToolOwner();

	/**
	 * Sets the value of the '{@link metaModel.referenceProcess.Tool#getToolOwner <em>Tool Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Owner</em>' reference.
	 * @see #getToolOwner()
	 * @generated
	 */
	void setToolOwner(StakeHolder value);

} // Tool
