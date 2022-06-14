/**
 */
package metaModel.suptertype.impl;

import java.util.Collection;
import metaModel.suptertype.SuptertypePackage;
import metaModel.suptertype.Variantable;

import metaModel.terms.BoolTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variantable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.suptertype.impl.VariantableImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link metaModel.suptertype.impl.VariantableImpl#getLayoutBefore <em>Layout Before</em>}</li>
 *   <li>{@link metaModel.suptertype.impl.VariantableImpl#getLayoutAfter <em>Layout After</em>}</li>
 *   <li>{@link metaModel.suptertype.impl.VariantableImpl#getLayoutPriority <em>Layout Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariantableImpl extends NamedImpl implements Variantable {
	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<BoolTerm> variants;

	/**
	 * The cached value of the '{@link #getLayoutBefore() <em>Layout Before</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<Variantable> layoutBefore;
	/**
	 * The cached value of the '{@link #getLayoutAfter() <em>Layout After</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<Variantable> layoutAfter;

	/**
	 * The default value of the '{@link #getLayoutPriority() <em>Layout Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int LAYOUT_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLayoutPriority() <em>Layout Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutPriority()
	 * @generated
	 * @ordered
	 */
	protected int layoutPriority = LAYOUT_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariantableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuptertypePackage.Literals.VARIANTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoolTerm> getVariants() {
		if (variants == null) {
			variants = new EObjectContainmentEList<BoolTerm>(BoolTerm.class, this, SuptertypePackage.VARIANTABLE__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variantable> getLayoutBefore() {
		if (layoutBefore == null) {
			layoutBefore = new EObjectWithInverseResolvingEList.ManyInverse<Variantable>(Variantable.class, this, SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE, SuptertypePackage.VARIANTABLE__LAYOUT_AFTER);
		}
		return layoutBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variantable> getLayoutAfter() {
		if (layoutAfter == null) {
			layoutAfter = new EObjectWithInverseResolvingEList.ManyInverse<Variantable>(Variantable.class, this, SuptertypePackage.VARIANTABLE__LAYOUT_AFTER, SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE);
		}
		return layoutAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLayoutPriority() {
		return layoutPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayoutPriority(int newLayoutPriority) {
		int oldLayoutPriority = layoutPriority;
		layoutPriority = newLayoutPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY, oldLayoutPriority, layoutPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLayoutBefore()).basicAdd(otherEnd, msgs);
			case SuptertypePackage.VARIANTABLE__LAYOUT_AFTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLayoutAfter()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuptertypePackage.VARIANTABLE__VARIANTS:
				return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
			case SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE:
				return ((InternalEList<?>)getLayoutBefore()).basicRemove(otherEnd, msgs);
			case SuptertypePackage.VARIANTABLE__LAYOUT_AFTER:
				return ((InternalEList<?>)getLayoutAfter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuptertypePackage.VARIANTABLE__VARIANTS:
				return getVariants();
			case SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE:
				return getLayoutBefore();
			case SuptertypePackage.VARIANTABLE__LAYOUT_AFTER:
				return getLayoutAfter();
			case SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY:
				return getLayoutPriority();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SuptertypePackage.VARIANTABLE__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends BoolTerm>)newValue);
				return;
			case SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE:
				getLayoutBefore().clear();
				getLayoutBefore().addAll((Collection<? extends Variantable>)newValue);
				return;
			case SuptertypePackage.VARIANTABLE__LAYOUT_AFTER:
				getLayoutAfter().clear();
				getLayoutAfter().addAll((Collection<? extends Variantable>)newValue);
				return;
			case SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY:
				setLayoutPriority((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SuptertypePackage.VARIANTABLE__VARIANTS:
				getVariants().clear();
				return;
			case SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE:
				getLayoutBefore().clear();
				return;
			case SuptertypePackage.VARIANTABLE__LAYOUT_AFTER:
				getLayoutAfter().clear();
				return;
			case SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY:
				setLayoutPriority(LAYOUT_PRIORITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SuptertypePackage.VARIANTABLE__VARIANTS:
				return variants != null && !variants.isEmpty();
			case SuptertypePackage.VARIANTABLE__LAYOUT_BEFORE:
				return layoutBefore != null && !layoutBefore.isEmpty();
			case SuptertypePackage.VARIANTABLE__LAYOUT_AFTER:
				return layoutAfter != null && !layoutAfter.isEmpty();
			case SuptertypePackage.VARIANTABLE__LAYOUT_PRIORITY:
				return layoutPriority != LAYOUT_PRIORITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (LayoutPriority: ");
		result.append(layoutPriority);
		result.append(')');
		return result.toString();
	}

} //VariantableImpl
