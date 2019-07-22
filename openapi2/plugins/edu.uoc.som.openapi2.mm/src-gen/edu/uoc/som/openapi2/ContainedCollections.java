/**
 */
package edu.uoc.som.openapi2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contained Collections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.ContainedCollections#getParamters <em>Paramters</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.ContainedCollections#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.ContainedCollections#getResponses <em>Responses</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.OpenAPI2Package#getContainedCollections()
 * @model
 * @generated
 */
public interface ContainedCollections extends EObject {
	/**
	 * Returns the value of the '<em><b>Paramters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paramters</em>' containment reference list.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getContainedCollections_Paramters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParamters();

	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference list.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getContainedCollections_Schemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchemas();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.Response}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference list.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getContainedCollections_Responses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Response> getResponses();

} // ContainedCollections
