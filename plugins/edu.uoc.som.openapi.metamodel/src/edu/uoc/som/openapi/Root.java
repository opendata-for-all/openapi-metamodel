/**
 */
package edu.uoc.som.openapi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi.Root#getApi <em>Api</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Root#getParamters <em>Paramters</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Root#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Root#getResponses <em>Responses</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi.OpenAPIPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' containment reference.
	 * @see #setApi(API)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getRoot_Api()
	 * @model containment="true"
	 * @generated
	 */
	API getApi();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Root#getApi <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' containment reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(API value);

	/**
	 * Returns the value of the '<em><b>Paramters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paramters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paramters</em>' containment reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getRoot_Paramters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParamters();

	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getRoot_Schemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchemas();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.Response}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getRoot_Responses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Response> getResponses();

} // Root
