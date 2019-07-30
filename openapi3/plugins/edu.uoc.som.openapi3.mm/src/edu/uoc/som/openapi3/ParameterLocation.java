/**
 */
package edu.uoc.som.openapi3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.openapi3.Openapi3Package#getParameterLocation()
 * @model
 * @generated
 */
public enum ParameterLocation implements Enumerator {
	/**
	 * The '<em><b>Unspecified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(0, "unspecified", "unspecified"),

	/**
	 * The '<em><b>Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY(1, "query", "query"),

	/**
	 * The '<em><b>Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	HEADER(2, "header", "header"),

	/**
	 * The '<em><b>Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_VALUE
	 * @generated
	 * @ordered
	 */
	PATH(3, "path", "path"),

	/**
	 * The '<em><b>Cookie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOKIE_VALUE
	 * @generated
	 * @ordered
	 */
	COOKIE(4, "cookie", "cookie");

	/**
	 * The '<em><b>Unspecified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED
	 * @model name="unspecified"
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY
	 * @model name="query"
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_VALUE = 1;

	/**
	 * The '<em><b>Header</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER
	 * @model name="header"
	 * @generated
	 * @ordered
	 */
	public static final int HEADER_VALUE = 2;

	/**
	 * The '<em><b>Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH
	 * @model name="path"
	 * @generated
	 * @ordered
	 */
	public static final int PATH_VALUE = 3;

	/**
	 * The '<em><b>Cookie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOKIE
	 * @model name="cookie"
	 * @generated
	 * @ordered
	 */
	public static final int COOKIE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Parameter Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterLocation[] VALUES_ARRAY =
		new ParameterLocation[] {
			UNSPECIFIED,
			QUERY,
			HEADER,
			PATH,
			COOKIE,
		};

	/**
	 * A public read-only list of all the '<em><b>Parameter Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParameterLocation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterLocation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterLocation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterLocation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterLocation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterLocation get(int value) {
		switch (value) {
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case QUERY_VALUE: return QUERY;
			case HEADER_VALUE: return HEADER;
			case PATH_VALUE: return PATH;
			case COOKIE_VALUE: return COOKIE;
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
	private ParameterLocation(int value, String name, String literal) {
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
	
} //ParameterLocation
