/**
 */
package edu.uoc.som.openapi3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.ServerContainer#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getServerContainer()
 * @model
 * @generated
 */
public interface ServerContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.Server}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getServerContainer_Servers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Server> getServers();

} // ServerContainer
