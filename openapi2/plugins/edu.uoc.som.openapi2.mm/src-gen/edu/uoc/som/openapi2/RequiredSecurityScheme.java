/**
 */
package edu.uoc.som.openapi2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.RequiredSecurityScheme#getSecurityScopes <em>Security Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.RequiredSecurityScheme#getSecurityScheme <em>Security Scheme</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.OpenAPI2Package#getRequiredSecurityScheme()
 * @model
 * @generated
 */
public interface RequiredSecurityScheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Scopes</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.SecurityScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Scopes</em>' reference list.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getRequiredSecurityScheme_SecurityScopes()
	 * @model
	 * @generated
	 */
	EList<SecurityScope> getSecurityScopes();

	/**
	 * Returns the value of the '<em><b>Security Scheme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Scheme</em>' reference.
	 * @see #setSecurityScheme(SecurityScheme)
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getRequiredSecurityScheme_SecurityScheme()
	 * @model
	 * @generated
	 */
	SecurityScheme getSecurityScheme();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.RequiredSecurityScheme#getSecurityScheme <em>Security Scheme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Scheme</em>' reference.
	 * @see #getSecurityScheme()
	 * @generated
	 */
	void setSecurityScheme(SecurityScheme value);

} // RequiredSecurityScheme
