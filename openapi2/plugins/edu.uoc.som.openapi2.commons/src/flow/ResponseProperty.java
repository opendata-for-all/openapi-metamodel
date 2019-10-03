/**
 */
package flow;

import edu.uoc.som.openapi2.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.ResponseProperty#getSchemaProperty <em>Schema Property</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getResponseProperty()
 * @model
 * @generated
 */
public interface ResponseProperty extends OutputProperty {
	/**
	 * Returns the value of the '<em><b>Schema Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Property</em>' reference.
	 * @see #setSchemaProperty(Property)
	 * @see flow.FlowPackage#getResponseProperty_SchemaProperty()
	 * @model
	 * @generated
	 */
	Property getSchemaProperty();

	/**
	 * Sets the value of the '{@link flow.ResponseProperty#getSchemaProperty <em>Schema Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Property</em>' reference.
	 * @see #getSchemaProperty()
	 * @generated
	 */
	void setSchemaProperty(Property value);

} // ResponseProperty
