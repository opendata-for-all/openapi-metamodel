/**
 */
package edu.uoc.som.openapi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi.SecurityScheme#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.SecurityScheme#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.SecurityScheme#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.SecurityScheme#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.SecurityScheme#getFlow <em>Flow</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.SecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.SecurityScheme#getTokenUrl <em>Token Url</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.SecurityScheme#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi.OpenAPIPackage#getSecurityScheme()
 * @model
 * @generated
 */
public interface SecurityScheme extends ReferenceableElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi.SecuritySchemeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.uoc.som.openapi.SecuritySchemeType
	 * @see #setType(SecuritySchemeType)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSecurityScheme_Type()
	 * @model
	 * @generated
	 */
	SecuritySchemeType getType();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.SecurityScheme#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.uoc.som.openapi.SecuritySchemeType
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
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSecurityScheme_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.SecurityScheme#getDescription <em>Description</em>}' attribute.
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
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSecurityScheme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.SecurityScheme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi.APIKeyLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see edu.uoc.som.openapi.APIKeyLocation
	 * @see #setLocation(APIKeyLocation)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSecurityScheme_Location()
	 * @model
	 * @generated
	 */
	APIKeyLocation getLocation();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.SecurityScheme#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see edu.uoc.som.openapi.APIKeyLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(APIKeyLocation value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi.OAuth2FlowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' attribute.
	 * @see edu.uoc.som.openapi.OAuth2FlowType
	 * @see #setFlow(OAuth2FlowType)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSecurityScheme_Flow()
	 * @model
	 * @generated
	 */
	OAuth2FlowType getFlow();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.SecurityScheme#getFlow <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' attribute.
	 * @see edu.uoc.som.openapi.OAuth2FlowType
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
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSecurityScheme_AuthorizationUrl()
	 * @model
	 * @generated
	 */
	String getAuthorizationUrl();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.SecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}' attribute.
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
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSecurityScheme_TokenUrl()
	 * @model
	 * @generated
	 */
	String getTokenUrl();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.SecurityScheme#getTokenUrl <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Url</em>' attribute.
	 * @see #getTokenUrl()
	 * @generated
	 */
	void setTokenUrl(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.SecurityScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' containment reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSecurityScheme_Scopes()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityScope> getScopes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for(SecurityScope securityScope: getScopes())\r\n\tif(securityScope.getName().equals(name))\r\n\t\treturn securityScope;\r\nreturn null;'"
	 * @generated
	 */
	SecurityScope getSecurityScopeByName(String name);

} // SecurityScheme
