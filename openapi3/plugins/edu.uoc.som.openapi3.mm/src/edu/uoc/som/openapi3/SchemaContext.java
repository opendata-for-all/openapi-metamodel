/**
 */
package edu.uoc.som.openapi3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.SchemaContext#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getSchemaContext()
 * @model abstract="true"
 * @generated
 */
public interface SchemaContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' reference.
	 * @see #setSchema(Schema)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchemaContext_Schema()
	 * @model
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.SchemaContext#getSchema <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

} // SchemaContext
