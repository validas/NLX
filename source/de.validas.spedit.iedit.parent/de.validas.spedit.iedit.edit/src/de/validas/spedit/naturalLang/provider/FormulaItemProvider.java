/**
 * generated by Xtext 2.16.0
 */
package de.validas.spedit.naturalLang.provider;


import de.validas.spedit.naturalLang.Formula;
import de.validas.spedit.naturalLang.NaturalLangFactory;
import de.validas.spedit.naturalLang.NaturalLangPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.validas.spedit.naturalLang.Formula} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FormulaItemProvider extends NoNElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulaItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(NaturalLangPackage.Literals.FORMULA__NAME);
			childrenFeatures.add(NaturalLangPackage.Literals.FORMULA__PARAMETERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Formula.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Formula"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Formula)object).getNl();
		return label == null || label.length() == 0 ?
			getString("_UI_Formula_type") :
			getString("_UI_Formula_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Formula.class)) {
			case NaturalLangPackage.FORMULA__NAME:
			case NaturalLangPackage.FORMULA__PARAMETERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createSentenceType()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createParagraphBlock()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createBlockElement()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createFootNote()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createTableBorder()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createTableLine()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createTableRow()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createTableColumnSeparator()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createLineSentenceChain()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createSentenceChain()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createSentenceChainX()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createLineSentence()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createSentence()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createFreeSentence()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createSentenceX()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createListSentence()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createChapterSentence()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createTrailSubSentence()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createSubSentence()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createFreeSubSentence()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createLineSubSentence()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createNoNElementX()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createNoNElement()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createBrackets()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createAllElements()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createElements()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createNoNElementX2()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createBracketSentence()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createWord()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createWordShort()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createItWord()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createQuote()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createUnit()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createSimpleUnit()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createChapter_Unit_HI()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createChapter_Unit_Low()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createHashNumber()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createChapterAlpha()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createSymbolsX()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createSymbols()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createShortcutGen()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createShortcutLib()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createShortCut()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createIgnoredText()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createUrlAdress()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createEmailAT()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createMailAdress()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createFormula()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createNew_Line()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createExtBracketSentence()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__NAME,
				 NaturalLangFactory.eINSTANCE.createEString()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__PARAMETERS,
				 NaturalLangFactory.eINSTANCE.createBracketSentence()));

		newChildDescriptors.add
			(createChildParameter
				(NaturalLangPackage.Literals.FORMULA__PARAMETERS,
				 NaturalLangFactory.eINSTANCE.createExtBracketSentence()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == NaturalLangPackage.Literals.FORMULA__NAME ||
			childFeature == NaturalLangPackage.Literals.FORMULA__PARAMETERS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}