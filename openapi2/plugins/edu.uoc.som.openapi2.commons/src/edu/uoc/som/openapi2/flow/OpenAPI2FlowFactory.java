/**
 */
package edu.uoc.som.openapi2.flow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.openapi2.flow.OpenAPI2FlowPackage
 * @generated
 */
public interface OpenAPI2FlowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenAPI2FlowFactory eINSTANCE = edu.uoc.som.openapi2.flow.impl.OpenAPI2FlowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns a new object of class '<em>Property Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Transfer</em>'.
	 * @generated
	 */
	PropertyTransfer createPropertyTransfer();

	/**
	 * Returns a new object of class '<em>Header Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Property</em>'.
	 * @generated
	 */
	HeaderProperty createHeaderProperty();

	/**
	 * Returns a new object of class '<em>Response Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Property</em>'.
	 * @generated
	 */
	ResponseProperty createResponseProperty();

	/**
	 * Returns a new object of class '<em>Parameter Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Property</em>'.
	 * @generated
	 */
	ParameterProperty createParameterProperty();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	Flow createFlow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpenAPI2FlowPackage getOpenAPI2FlowPackage();

} //OpenAPI2FlowFactory
