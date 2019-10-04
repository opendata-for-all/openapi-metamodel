/**
 */
package edu.uoc.som.openapi2.flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.flow.Sequence#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.flow.OpenAPI2FlowPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.flow.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' reference list.
	 * @see edu.uoc.som.openapi2.flow.OpenAPI2FlowPackage#getSequence_Steps()
	 * @model
	 * @generated
	 */
	EList<Step> getSteps();

} // Sequence
