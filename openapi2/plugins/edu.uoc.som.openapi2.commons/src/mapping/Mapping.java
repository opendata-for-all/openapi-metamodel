/**
 */
package mapping;

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
 *   <li>{@link mapping.Mapping#getPropertyToParameterMappings <em>Property To Parameter Mappings</em>}</li>
 *   <li>{@link mapping.Mapping#getPropertyToPropertyMapping <em>Property To Property Mapping</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Property To Parameter Mappings</b></em>' reference list.
	 * The list contents are of type {@link mapping.PropertyToParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property To Parameter Mappings</em>' reference list.
	 * @see mapping.MappingPackage#getMapping_PropertyToParameterMappings()
	 * @model
	 * @generated
	 */
	EList<PropertyToParameter> getPropertyToParameterMappings();

	/**
	 * Returns the value of the '<em><b>Property To Property Mapping</b></em>' reference list.
	 * The list contents are of type {@link mapping.PropertyToProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property To Property Mapping</em>' reference list.
	 * @see mapping.MappingPackage#getMapping_PropertyToPropertyMapping()
	 * @model
	 * @generated
	 */
	EList<PropertyToProperty> getPropertyToPropertyMapping();

} // Mapping
