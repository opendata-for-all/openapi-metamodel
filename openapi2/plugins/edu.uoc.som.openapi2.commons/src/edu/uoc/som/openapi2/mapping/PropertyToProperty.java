/**
 */
package edu.uoc.som.openapi2.mapping;

import edu.uoc.som.openapi2.Property;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property To Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.mapping.PropertyToProperty#getSource <em>Source</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.mapping.PropertyToProperty#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.mapping.OpenAPI2MappingPackage#getPropertyToProperty()
 * @model
 * @generated
 */
public interface PropertyToProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Property)
	 * @see edu.uoc.som.openapi2.mapping.OpenAPI2MappingPackage#getPropertyToProperty_Source()
	 * @model
	 * @generated
	 */
	Property getSource();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.mapping.PropertyToProperty#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Property value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Property)
	 * @see edu.uoc.som.openapi2.mapping.OpenAPI2MappingPackage#getPropertyToProperty_Target()
	 * @model
	 * @generated
	 */
	Property getTarget();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.mapping.PropertyToProperty#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Property value);

} // PropertyToProperty
