/**
 */
package metaModel.modellDescr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metaModel.modellDescr.ModellDescrPackage
 * @generated
 */
public interface ModellDescrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModellDescrFactory eINSTANCE = metaModel.modellDescr.impl.ModellDescrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MM Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MM Condition</em>'.
	 * @generated
	 */
	MMCondition createMMCondition();

	/**
	 * Returns a new object of class '<em>Meta Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Model Element</em>'.
	 * @generated
	 */
	MetaModelElement createMetaModelElement();

	/**
	 * Returns a new object of class '<em>Meta Model Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Model Association</em>'.
	 * @generated
	 */
	MetaModelAssociation createMetaModelAssociation();

	/**
	 * Returns a new object of class '<em>Meta Model Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Model Attribute</em>'.
	 * @generated
	 */
	MetaModelAttribute createMetaModelAttribute();

	/**
	 * Returns a new object of class '<em>Prozess Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prozess Condition</em>'.
	 * @generated
	 */
	ProzessCondition createProzessCondition();

	/**
	 * Returns a new object of class '<em>Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Model</em>'.
	 * @generated
	 */
	MetaModel createMetaModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModellDescrPackage getModellDescrPackage();

} //ModellDescrFactory
