/**
 */
package edu.uoc.som.openapi2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.Property#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.OpenAPIPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends ReferenceableElement, SchemaContext, SchemaDeclaringContext {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(Boolean)
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getProperty_Required()
	 * @model
	 * @generated
	 */
	Boolean getRequired();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.Property#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Boolean value);

} // Property
