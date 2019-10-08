/**
 */
package edu.uoc.som.openapi2.mapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.openapi2.mapping.OpenAPI2MappingPackage
 * @generated
 */
public interface OpenAPI2MappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenAPI2MappingFactory eINSTANCE = edu.uoc.som.openapi2.mapping.impl.OpenAPI2MappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Property To Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property To Parameter</em>'.
	 * @generated
	 */
	PropertyToParameter createPropertyToParameter();

	/**
	 * Returns a new object of class '<em>Property To Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property To Property</em>'.
	 * @generated
	 */
	PropertyToProperty createPropertyToProperty();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpenAPI2MappingPackage getOpenAPI2MappingPackage();

} //OpenAPI2MappingFactory
