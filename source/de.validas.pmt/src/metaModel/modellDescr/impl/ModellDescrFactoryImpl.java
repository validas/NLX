/**
 */
package metaModel.modellDescr.impl;

import metaModel.modellDescr.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModellDescrFactoryImpl extends EFactoryImpl implements ModellDescrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModellDescrFactory init() {
		try {
			ModellDescrFactory theModellDescrFactory = (ModellDescrFactory)EPackage.Registry.INSTANCE.getEFactory(ModellDescrPackage.eNS_URI);
			if (theModellDescrFactory != null) {
				return theModellDescrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModellDescrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModellDescrFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModellDescrPackage.MM_CONDITION: return createMMCondition();
			case ModellDescrPackage.META_MODEL_ELEMENT: return createMetaModelElement();
			case ModellDescrPackage.META_MODEL_ASSOCIATION: return createMetaModelAssociation();
			case ModellDescrPackage.META_MODEL_ATTRIBUTE: return createMetaModelAttribute();
			case ModellDescrPackage.PROZESS_CONDITION: return createProzessCondition();
			case ModellDescrPackage.META_MODEL: return createMetaModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModellDescrPackage.CARDINALITY:
				return createCardinalityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModellDescrPackage.CARDINALITY:
				return convertCardinalityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMCondition createMMCondition() {
		MMConditionImpl mmCondition = new MMConditionImpl();
		return mmCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaModelElement createMetaModelElement() {
		MetaModelElementImpl metaModelElement = new MetaModelElementImpl();
		return metaModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaModelAssociation createMetaModelAssociation() {
		MetaModelAssociationImpl metaModelAssociation = new MetaModelAssociationImpl();
		return metaModelAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaModelAttribute createMetaModelAttribute() {
		MetaModelAttributeImpl metaModelAttribute = new MetaModelAttributeImpl();
		return metaModelAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProzessCondition createProzessCondition() {
		ProzessConditionImpl prozessCondition = new ProzessConditionImpl();
		return prozessCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaModel createMetaModel() {
		MetaModelImpl metaModel = new MetaModelImpl();
		return metaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinalityFromString(EDataType eDataType, String initialValue) {
		Cardinality result = Cardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModellDescrPackage getModellDescrPackage() {
		return (ModellDescrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModellDescrPackage getPackage() {
		return ModellDescrPackage.eINSTANCE;
	}

} //ModellDescrFactoryImpl
