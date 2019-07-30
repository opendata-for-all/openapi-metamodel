/**
 */
package edu.uoc.som.openapi3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.link#getOperation <em>Operation</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.link#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getlink()
 * @model
 * @generated
 */
public interface link extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getlink_Operation()
	 * @model
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.link#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(Server)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getlink_Server()
	 * @model
	 * @generated
	 */
	Server getServer();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.link#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Server value);

} // link
