/**
 */
package edu.uoc.som.openapi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi.ArrayContext#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.ArrayContext#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi.OpenAPIPackage#getArrayContext()
 * @model abstract="true"
 * @generated
 */
public interface ArrayContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Collection Format</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi.CollectionFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Format</em>' attribute.
	 * @see edu.uoc.som.openapi.CollectionFormat
	 * @see #setCollectionFormat(CollectionFormat)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getArrayContext_CollectionFormat()
	 * @model
	 * @generated
	 */
	CollectionFormat getCollectionFormat();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.ArrayContext#getCollectionFormat <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Format</em>' attribute.
	 * @see edu.uoc.som.openapi.CollectionFormat
	 * @see #getCollectionFormat()
	 * @generated
	 */
	void setCollectionFormat(CollectionFormat value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(ItemsDefinition)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getArrayContext_Items()
	 * @model containment="true"
	 * @generated
	 */
	ItemsDefinition getItems();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.ArrayContext#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(ItemsDefinition value);

} // ArrayContext
