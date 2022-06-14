/**
 * generated by Xtext 2.16.0
 */
package de.validas.spedit.naturalLang.impl;

import de.validas.spedit.naturalLang.AllElements;
import de.validas.spedit.naturalLang.Elements;
import de.validas.spedit.naturalLang.IgnoredText;
import de.validas.spedit.naturalLang.NaturalLangPackage;
import de.validas.spedit.naturalLang.New_Line;
import de.validas.spedit.naturalLang.NoNElement;
import de.validas.spedit.naturalLang.NoNElementX;
import de.validas.spedit.naturalLang.NoNElementX2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ignored Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.validas.spedit.naturalLang.impl.IgnoredTextImpl#getNl <em>Nl</em>}</li>
 *   <li>{@link de.validas.spedit.naturalLang.impl.IgnoredTextImpl#getIgnored <em>Ignored</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IgnoredTextImpl extends BlockElementImpl implements IgnoredText
{
  /**
   * The default value of the '{@link #getNl() <em>Nl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNl()
   * @generated
   * @ordered
   */
  protected static final String NL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNl() <em>Nl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNl()
   * @generated
   * @ordered
   */
  protected String nl = NL_EDEFAULT;

  /**
   * The default value of the '{@link #getIgnored() <em>Ignored</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIgnored()
   * @generated
   * @ordered
   */
  protected static final String IGNORED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIgnored() <em>Ignored</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIgnored()
   * @generated
   * @ordered
   */
  protected String ignored = IGNORED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IgnoredTextImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NaturalLangPackage.Literals.IGNORED_TEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNl()
  {
    return nl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNl(String newNl)
  {
    String oldNl = nl;
    nl = newNl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NaturalLangPackage.IGNORED_TEXT__NL, oldNl, nl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIgnored()
  {
    return ignored;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIgnored(String newIgnored)
  {
    String oldIgnored = ignored;
    ignored = newIgnored;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NaturalLangPackage.IGNORED_TEXT__IGNORED, oldIgnored, ignored));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NaturalLangPackage.IGNORED_TEXT__NL:
        return getNl();
      case NaturalLangPackage.IGNORED_TEXT__IGNORED:
        return getIgnored();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NaturalLangPackage.IGNORED_TEXT__NL:
        setNl((String)newValue);
        return;
      case NaturalLangPackage.IGNORED_TEXT__IGNORED:
        setIgnored((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NaturalLangPackage.IGNORED_TEXT__NL:
        setNl(NL_EDEFAULT);
        return;
      case NaturalLangPackage.IGNORED_TEXT__IGNORED:
        setIgnored(IGNORED_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NaturalLangPackage.IGNORED_TEXT__NL:
        return NL_EDEFAULT == null ? nl != null : !NL_EDEFAULT.equals(nl);
      case NaturalLangPackage.IGNORED_TEXT__IGNORED:
        return IGNORED_EDEFAULT == null ? ignored != null : !IGNORED_EDEFAULT.equals(ignored);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == NoNElementX.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AllElements.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == New_Line.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Elements.class)
    {
      switch (derivedFeatureID)
      {
        case NaturalLangPackage.IGNORED_TEXT__NL: return NaturalLangPackage.ELEMENTS__NL;
        default: return -1;
      }
    }
    if (baseClass == NoNElementX2.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == NoNElement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == NoNElementX.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AllElements.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == New_Line.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Elements.class)
    {
      switch (baseFeatureID)
      {
        case NaturalLangPackage.ELEMENTS__NL: return NaturalLangPackage.IGNORED_TEXT__NL;
        default: return -1;
      }
    }
    if (baseClass == NoNElementX2.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == NoNElement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (nl: ");
    result.append(nl);
    result.append(", ignored: ");
    result.append(ignored);
    result.append(')');
    return result.toString();
  }

} //IgnoredTextImpl