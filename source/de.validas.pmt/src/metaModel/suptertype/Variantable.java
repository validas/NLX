/**
 */
package metaModel.suptertype;

import metaModel.terms.BoolTerm;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variantable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.suptertype.Variantable#getVariants <em>Variants</em>}</li>
 *   <li>{@link metaModel.suptertype.Variantable#getLayoutBefore <em>Layout Before</em>}</li>
 *   <li>{@link metaModel.suptertype.Variantable#getLayoutAfter <em>Layout After</em>}</li>
 *   <li>{@link metaModel.suptertype.Variantable#getLayoutPriority <em>Layout Priority</em>}</li>
 * </ul>
 *
 * @see metaModel.suptertype.SuptertypePackage#getVariantable()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypesOK'"
 * @generated
 */
public interface Variantable extends Named {
	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.terms.BoolTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference list.
	 * @see metaModel.suptertype.SuptertypePackage#getVariantable_Variants()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoolTerm> getVariants();

	/**
	 * Returns the value of the '<em><b>Layout Before</b></em>' reference list.
	 * The list contents are of type {@link metaModel.suptertype.Variantable}.
	 * It is bidirectional and its opposite is '{@link metaModel.suptertype.Variantable#getLayoutAfter <em>Layout After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Before</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Before</em>' reference list.
	 * @see metaModel.suptertype.SuptertypePackage#getVariantable_LayoutBefore()
	 * @see metaModel.suptertype.Variantable#getLayoutAfter
	 * @model opposite="LayoutAfter"
	 * @generated
	 */
	EList<Variantable> getLayoutBefore();

	/**
	 * Returns the value of the '<em><b>Layout After</b></em>' reference list.
	 * The list contents are of type {@link metaModel.suptertype.Variantable}.
	 * It is bidirectional and its opposite is '{@link metaModel.suptertype.Variantable#getLayoutBefore <em>Layout Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout After</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout After</em>' reference list.
	 * @see metaModel.suptertype.SuptertypePackage#getVariantable_LayoutAfter()
	 * @see metaModel.suptertype.Variantable#getLayoutBefore
	 * @model opposite="LayoutBefore"
	 * @generated
	 */
	EList<Variantable> getLayoutAfter();

	/**
	 * Returns the value of the '<em><b>Layout Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Priority</em>' attribute.
	 * @see #setLayoutPriority(int)
	 * @see metaModel.suptertype.SuptertypePackage#getVariantable_LayoutPriority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getLayoutPriority();

	/**
	 * Sets the value of the '{@link metaModel.suptertype.Variantable#getLayoutPriority <em>Layout Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Priority</em>' attribute.
	 * @see #getLayoutPriority()
	 * @generated
	 */
	void setLayoutPriority(int value);

} // Variantable
