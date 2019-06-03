/**
 */
package edu.uoc.som.openapi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi.SecurityContext#getSecurity <em>Security</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi.OpenAPIPackage#getSecurityContext()
 * @model abstract="true"
 * @generated
 */
public interface SecurityContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.SecurityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSecurityContext_Security()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRequirement> getSecurity();

} // SecurityContext
