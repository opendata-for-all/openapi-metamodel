/**
 */
package edu.uoc.som.openapi3;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.Callback#getCallbacks <em>Callbacks</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getCallback()
 * @model
 * @generated
 */
public interface Callback extends EObject {
	/**
	 * Returns the value of the '<em><b>Callbacks</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;java.lang.String, edu.uoc.som.openapi3.Path&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callbacks</em>' reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getCallback_Callbacks()
	 * @model mapType="edu.uoc.som.openapi3.ExpressionToPath&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.Path&gt;"
	 * @generated
	 */
	EList<Map.Entry<String, Path>> getCallbacks();

} // Callback
