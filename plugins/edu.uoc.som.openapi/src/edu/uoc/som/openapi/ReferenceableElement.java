/**
 */
package edu.uoc.som.openapi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenceable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi.ReferenceableElement#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi.OpenAPIPackage#getReferenceableElement()
 * @model abstract="true"
 * @generated
 */
public interface ReferenceableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getReferenceableElement_ReferenceName()
	 * @model required="true"
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.ReferenceableElement#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(this instanceof Schema)\n\t\t\treturn \"#/definitions/\"+referenceName;\n\t\tif(this instanceof Parameter)\n\t\t\treturn \"#/parameters/\"+referenceName;\n\t\tif(this instanceof Response)\n\t\t\treturn \"#/responses/\"+referenceName;\n\t\tif(this instanceof SecurityScheme)\n\t\t\treturn \"#/securityDefinitions/\"+referenceName;\n\t\treturn \"unkown\";'"
	 * @generated
	 */
	String getRef();

} // ReferenceableElement
