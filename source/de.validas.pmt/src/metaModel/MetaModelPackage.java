/**
 */
package metaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metaModel.MetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface MetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.validas.de/spedit/metaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.validas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaModelPackage eINSTANCE = metaModel.impl.MetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModel.impl.WorkaroundImpl <em>Workaround</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.WorkaroundImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getWorkaround()
	 * @generated
	 */
	int WORKAROUND = 0;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKAROUND__ISSUE = 0;

	/**
	 * The number of structural features of the '<em>Workaround</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKAROUND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Workaround</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKAROUND_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link metaModel.Workaround <em>Workaround</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workaround</em>'.
	 * @see metaModel.Workaround
	 * @generated
	 */
	EClass getWorkaround();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Workaround#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see metaModel.Workaround#getIssue()
	 * @see #getWorkaround()
	 * @generated
	 */
	EAttribute getWorkaround_Issue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaModelFactory getMetaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metaModel.impl.WorkaroundImpl <em>Workaround</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.WorkaroundImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getWorkaround()
		 * @generated
		 */
		EClass WORKAROUND = eINSTANCE.getWorkaround();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKAROUND__ISSUE = eINSTANCE.getWorkaround_Issue();

	}

} //MetaModelPackage
