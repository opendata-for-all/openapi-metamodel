/**
 */
package edu.uoc.som.openapi3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.SecurityScheme#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.SecurityScheme#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.SecurityScheme#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.SecurityScheme#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.SecurityScheme#getFlow <em>Flow</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.SecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.SecurityScheme#getTokenUrl <em>Token Url</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.SecurityScheme#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getSecurityScheme()
 * @model
 * @generated
 */
public interface SecurityScheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi3.SecuritySchemeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.uoc.som.openapi3.SecuritySchemeType
	 * @see #setType(SecuritySchemeType)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSecurityScheme_Type()
	 * @model
	 * @generated
	 */
	SecuritySchemeType getType();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.SecurityScheme#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.uoc.som.openapi3.SecuritySchemeType
	 * @see #getType()
	 * @generated
	 */
	void setType(SecuritySchemeType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSecurityScheme_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.SecurityScheme#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSecurityScheme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.SecurityScheme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi3.APIKeyLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see edu.uoc.som.openapi3.APIKeyLocation
	 * @see #setLocation(APIKeyLocation)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSecurityScheme_Location()
	 * @model
	 * @generated
	 */
	APIKeyLocation getLocation();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.SecurityScheme#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see edu.uoc.som.openapi3.APIKeyLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(APIKeyLocation value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi3.OAuth2FlowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' attribute.
	 * @see edu.uoc.som.openapi3.OAuth2FlowType
	 * @see #setFlow(OAuth2FlowType)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSecurityScheme_Flow()
	 * @model
	 * @generated
	 */
	OAuth2FlowType getFlow();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.SecurityScheme#getFlow <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' attribute.
	 * @see edu.uoc.som.openapi3.OAuth2FlowType
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(OAuth2FlowType value);

	/**
	 * Returns the value of the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Url</em>' attribute.
	 * @see #setAuthorizationUrl(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSecurityScheme_AuthorizationUrl()
	 * @model
	 * @generated
	 */
	String getAuthorizationUrl();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.SecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Url</em>' attribute.
	 * @see #getAuthorizationUrl()
	 * @generated
	 */
	void setAuthorizationUrl(String value);

	/**
	 * Returns the value of the '<em><b>Token Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Url</em>' attribute.
	 * @see #setTokenUrl(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSecurityScheme_TokenUrl()
	 * @model
	 * @generated
	 */
	String getTokenUrl();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.SecurityScheme#getTokenUrl <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Url</em>' attribute.
	 * @see #getTokenUrl()
	 * @generated
	 */
	void setTokenUrl(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.SecurityScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' containment reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSecurityScheme_Scopes()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityScope> getScopes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SecurityScope getSecurityScopeByName(String name);

} // SecurityScheme
