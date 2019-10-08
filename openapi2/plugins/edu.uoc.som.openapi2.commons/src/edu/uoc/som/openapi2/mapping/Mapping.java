/**
 */
package edu.uoc.som.openapi2.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.mapping.Mapping#getPropertyToParameterMappings <em>Property To Parameter Mappings</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.mapping.Mapping#getPropertyToPropertyMappings <em>Property To Property Mappings</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.mapping.OpenAPI2MappingPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Property To Parameter Mappings</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.mapping.PropertyToParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property To Parameter Mappings</em>' reference list.
	 * @see edu.uoc.som.openapi2.mapping.OpenAPI2MappingPackage#getMapping_PropertyToParameterMappings()
	 * @model
	 * @generated
	 */
	EList<PropertyToParameter> getPropertyToParameterMappings();

	/**
	 * Returns the value of the '<em><b>Property To Property Mappings</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.mapping.PropertyToProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property To Property Mappings</em>' reference list.
	 * @see edu.uoc.som.openapi2.mapping.OpenAPI2MappingPackage#getMapping_PropertyToPropertyMappings()
	 * @model
	 * @generated
	 */
	EList<PropertyToProperty> getPropertyToPropertyMappings();

} // Mapping
