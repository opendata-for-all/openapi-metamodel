/**
 */
package edu.uoc.som.openapi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi.Response#getCode <em>Code</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Response#getResponseDefinition <em>Response Definition</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Response#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi.OpenAPIPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends ResponseDeclaringContext {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Integer)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getResponse_Code()
	 * @model
	 * @generated
	 */
	Integer getCode();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Response#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Response Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Definition</em>' reference.
	 * @see #setResponseDefinition(ResponseDefinition)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getResponse_ResponseDefinition()
	 * @model
	 * @generated
	 */
	ResponseDefinition getResponseDefinition();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Response#getResponseDefinition <em>Response Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Definition</em>' reference.
	 * @see #getResponseDefinition()
	 * @generated
	 */
	void setResponseDefinition(ResponseDefinition value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(Boolean)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getResponse_Default()
	 * @model
	 * @generated
	 */
	Boolean getDefault();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Response#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Boolean value);

} // Response
