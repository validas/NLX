/**
 */
package de.validas.vvt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Severity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.validas.vvt.VvtPackage#getSeverity()
 * @model
 * @generated
 */
public enum Severity implements Enumerator {
	/**
	 * The '<em><b>BLOCKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKER_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCKER(0, "BLOCKER", "BLOCKER"),

	/**
	 * The '<em><b>CRITICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL(1, "CRITICAL", "CRITICAL"),

	/**
	 * The '<em><b>MAJOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR_VALUE
	 * @generated
	 * @ordered
	 */
	MAJOR(2, "MAJOR", "MAJOR"),

	/**
	 * The '<em><b>MINOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR(3, "MINOR", "MINOR");

	/**
	 * The '<em><b>BLOCKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLOCKER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLOCKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKER_VALUE = 0;

	/**
	 * The '<em><b>CRITICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CRITICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRITICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_VALUE = 1;

	/**
	 * The '<em><b>MAJOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAJOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAJOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAJOR_VALUE = 2;

	/**
	 * The '<em><b>MINOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Severity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Severity[] VALUES_ARRAY = new Severity[] { BLOCKER, CRITICAL, MAJOR, MINOR, };

	/**
	 * A public read-only list of all the '<em><b>Severity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Severity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Severity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Severity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Severity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Severity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Severity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Severity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Severity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Severity get(int value) {
		switch (value) {
		case BLOCKER_VALUE:
			return BLOCKER;
		case CRITICAL_VALUE:
			return CRITICAL;
		case MAJOR_VALUE:
			return MAJOR;
		case MINOR_VALUE:
			return MINOR;
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
	private Severity(int value, String name, String literal) {
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

} //Severity
