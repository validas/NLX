/**
 * generated by Xtext 2.16.0
 */
package de.validas.spedit.naturalLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.validas.spedit.naturalLang.SentenceType#getPEnd <em>PEnd</em>}</li>
 * </ul>
 *
 * @see de.validas.spedit.naturalLang.NaturalLangPackage#getSentenceType()
 * @model
 * @generated
 */
public interface SentenceType extends EObject
{
  /**
   * Returns the value of the '<em><b>PEnd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PEnd</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PEnd</em>' attribute.
   * @see #setPEnd(String)
   * @see de.validas.spedit.naturalLang.NaturalLangPackage#getSentenceType_PEnd()
   * @model
   * @generated
   */
  String getPEnd();

  /**
   * Sets the value of the '{@link de.validas.spedit.naturalLang.SentenceType#getPEnd <em>PEnd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PEnd</em>' attribute.
   * @see #getPEnd()
   * @generated
   */
  void setPEnd(String value);

} // SentenceType
