/**
 */
package edu.uoc.som.openapi3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.ParameterContext#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getParameterContext()
 * @model abstract="true"
 * @generated
 */
public interface ParameterContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameterContext_Parameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameters();

} // ParameterContext
