/**
 */
package edu.uoc.som.openapi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see edu.uoc.som.openapi.OpenAPIPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends NamedElement, SchemaContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"#/definitions/\"+name;'"
	 * @generated
	 */
	String getRef();

} // Definition
