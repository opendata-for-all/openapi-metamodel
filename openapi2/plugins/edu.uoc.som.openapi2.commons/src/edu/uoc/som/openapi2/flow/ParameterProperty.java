/**
 */
package edu.uoc.som.openapi2.flow;

import edu.uoc.som.openapi2.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.flow.ParameterProperty#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.flow.OpenAPI2FlowPackage#getParameterProperty()
 * @model
 * @generated
 */
public interface ParameterProperty extends InputProperty {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see edu.uoc.som.openapi2.flow.OpenAPI2FlowPackage#getParameterProperty_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.flow.ParameterProperty#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ParameterProperty
