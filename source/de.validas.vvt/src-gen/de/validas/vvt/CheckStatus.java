/**
 */
package de.validas.vvt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Check Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.validas.vvt.VvtPackage#getCheckStatus()
 * @model
 * @generated
 */
public enum CheckStatus implements Enumerator {
	/**
	 * The '<em><b>CREATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATED_VALUE
	 * @generated
	 * @ordered
	 */
	CREATED(0, "CREATED", "CREATED"),

	/**
	 * The '<em><b>ASSIGNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNED(1, "ASSIGNED", "ASSIGNED"),

	/**
	 * The '<em><b>FAILED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED(2, "FAILED", "FAILED"),

	/**
	 * The '<em><b>ANALYZED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALYZED_VALUE
	 * @generated
	 * @ordered
	 */
	ANALYZED(3, "ANALYZED", "ANALYZED"),

	/**
	 * The '<em><b>PASSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSED_VALUE
	 * @generated
	 * @ordered
	 */
	PASSED(4, "PASSED", "PASSED"),
	/**
	 * The '<em><b>UPDATED FROM FAILED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #UPDATED_FROM_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATED_FROM_FAILED(5, "UPDATED_FROM_FAILED", "UPDATED_FROM_FAILED"),
	/**
	 * The '<em><b>UPDATED FROM PASSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #UPDATED_FROM_PASSED_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATED_FROM_PASSED(6, "UPDATED_FROM_PASSED", "UPDATED_FROM_PASSED"),
	/**
	 * The '<em><b>UPDATED FROM ANALYZED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #UPDATED_FROM_ANALYZED_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATED_FROM_ANALYZED(7, "UPDATED_FROM_ANALYZED", "UPDATED_FROM_ANALYZED");

	/**
	 * The '<em><b>CREATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREATED_VALUE = 0;

	/**
	 * The '<em><b>ASSIGNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSIGNED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNED_VALUE = 1;

	/**
	 * The '<em><b>FAILED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAILED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_VALUE = 2;

	/**
	 * The '<em><b>ANALYZED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANALYZED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALYZED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANALYZED_VALUE = 3;

	/**
	 * The '<em><b>PASSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PASSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PASSED_VALUE = 4;

	/**
	 * The '<em><b>UPDATED FROM FAILED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPDATED FROM FAILED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATED_FROM_FAILED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPDATED_FROM_FAILED_VALUE = 5;

	/**
	 * The '<em><b>UPDATED FROM PASSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPDATED FROM PASSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATED_FROM_PASSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPDATED_FROM_PASSED_VALUE = 6;

	/**
	 * The '<em><b>UPDATED FROM ANALYZED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPDATED FROM ANALYZED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATED_FROM_ANALYZED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPDATED_FROM_ANALYZED_VALUE = 7;

	/**
	 * An array of all the '<em><b>Check Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CheckStatus[] VALUES_ARRAY = new CheckStatus[] { CREATED, ASSIGNED, FAILED, ANALYZED, PASSED,
			UPDATED_FROM_FAILED, UPDATED_FROM_PASSED, UPDATED_FROM_ANALYZED, };

	/**
	 * A public read-only list of all the '<em><b>Check Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CheckStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Check Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CheckStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CheckStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Check Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CheckStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CheckStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Check Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CheckStatus get(int value) {
		switch (value) {
		case CREATED_VALUE:
			return CREATED;
		case ASSIGNED_VALUE:
			return ASSIGNED;
		case FAILED_VALUE:
			return FAILED;
		case ANALYZED_VALUE:
			return ANALYZED;
		case PASSED_VALUE:
			return PASSED;
		case UPDATED_FROM_FAILED_VALUE:
			return UPDATED_FROM_FAILED;
		case UPDATED_FROM_PASSED_VALUE:
			return UPDATED_FROM_PASSED;
		case UPDATED_FROM_ANALYZED_VALUE:
			return UPDATED_FROM_ANALYZED;
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
	private CheckStatus(int value, String name, String literal) {
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

} //CheckStatus
