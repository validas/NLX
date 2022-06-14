/**
 */
package metaModel.modellDescr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cardinality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see metaModel.modellDescr.ModellDescrPackage#getCardinality()
 * @model
 * @generated
 */
public enum Cardinality implements Enumerator {
	/**
	 * The '<em><b>CARDINALITY 0to 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDINALITY_0TO_1_VALUE
	 * @generated
	 * @ordered
	 */
	CARDINALITY_0TO_1(0, "CARDINALITY_0_to_1", "CARDINALITY_0_to_1"),

	/**
	 * The '<em><b>CARDINALITY 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDINALITY_1_VALUE
	 * @generated
	 * @ordered
	 */
	CARDINALITY_1(0, "CARDINALITY_1", "CARDINALITY_1"),

	/**
	 * The '<em><b>CARDINALITY N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDINALITY_N_VALUE
	 * @generated
	 * @ordered
	 */
	CARDINALITY_N(0, "CARDINALITY_N", "CARDINALITY_N"),

	/**
	 * The '<em><b>CARDINALITY 0to N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDINALITY_0TO_N_VALUE
	 * @generated
	 * @ordered
	 */
	CARDINALITY_0TO_N(0, "CARDINALITY_0_to_N", "CARDINALITY_0_to_N");

	/**
	 * The '<em><b>CARDINALITY 0to 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARDINALITY 0to 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARDINALITY_0TO_1
	 * @model name="CARDINALITY_0_to_1"
	 * @generated
	 * @ordered
	 */
	public static final int CARDINALITY_0TO_1_VALUE = 0;

	/**
	 * The '<em><b>CARDINALITY 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARDINALITY 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARDINALITY_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARDINALITY_1_VALUE = 0;

	/**
	 * The '<em><b>CARDINALITY N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARDINALITY N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARDINALITY_N
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARDINALITY_N_VALUE = 0;

	/**
	 * The '<em><b>CARDINALITY 0to N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARDINALITY 0to N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARDINALITY_0TO_N
	 * @model name="CARDINALITY_0_to_N"
	 * @generated
	 * @ordered
	 */
	public static final int CARDINALITY_0TO_N_VALUE = 0;

	/**
	 * An array of all the '<em><b>Cardinality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Cardinality[] VALUES_ARRAY =
		new Cardinality[] {
			CARDINALITY_0TO_1,
			CARDINALITY_1,
			CARDINALITY_N,
			CARDINALITY_0TO_N,
		};

	/**
	 * A public read-only list of all the '<em><b>Cardinality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Cardinality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cardinality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Cardinality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Cardinality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cardinality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Cardinality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Cardinality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cardinality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Cardinality get(int value) {
		switch (value) {
			case CARDINALITY_0TO_1_VALUE: return CARDINALITY_0TO_1;
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
	private Cardinality(int value, String name, String literal) {
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
	
} //Cardinality
