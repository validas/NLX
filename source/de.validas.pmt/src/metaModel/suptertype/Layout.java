/**
 */
package metaModel.suptertype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Layout</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see metaModel.suptertype.SuptertypePackage#getLayout()
 * @model
 * @generated
 */
public enum Layout implements Enumerator {
	/**
	 * The '<em><b>TOP BOTTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_BOTTOM(0, "TOP_BOTTOM", "TOP_BOTTOM"),

	/**
	 * The '<em><b>BOTTOM TOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_TOP(0, "BOTTOM_TOP", "BOTTOM_TOP"),

	/**
	 * The '<em><b>LEFT RIGTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_RIGTH_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_RIGTH(0, "LEFT_RIGTH", "LEFT_RIGTH"),

	/**
	 * The '<em><b>RIGHT LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_LEFT(0, "RIGHT_LEFT", "RIGHT_LEFT");

	/**
	 * The '<em><b>TOP BOTTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOP BOTTOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_BOTTOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOP_BOTTOM_VALUE = 0;

	/**
	 * The '<em><b>BOTTOM TOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTTOM TOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_TOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_TOP_VALUE = 0;

	/**
	 * The '<em><b>LEFT RIGTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEFT RIGTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_RIGTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_RIGTH_VALUE = 0;

	/**
	 * The '<em><b>RIGHT LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RIGHT LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_LEFT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Layout</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Layout[] VALUES_ARRAY =
		new Layout[] {
			TOP_BOTTOM,
			BOTTOM_TOP,
			LEFT_RIGTH,
			RIGHT_LEFT,
		};

	/**
	 * A public read-only list of all the '<em><b>Layout</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Layout> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Layout</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Layout get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Layout result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Layout</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Layout getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Layout result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Layout</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Layout get(int value) {
		switch (value) {
			case TOP_BOTTOM_VALUE: return TOP_BOTTOM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Layout(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Layout
