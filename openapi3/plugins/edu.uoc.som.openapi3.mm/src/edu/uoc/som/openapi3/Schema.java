/**
 */
package edu.uoc.som.openapi3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getMaxProperties <em>Max Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getMinProperties <em>Min Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getExample <em>Example</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getProperties <em>Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getAllOf <em>All Of</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getItems <em>Items</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getXml <em>Xml</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getAdditonalProperties <em>Additonal Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getDeclaringContext <em>Declaring Context</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Schema#getAdditonalPropertiesAllowed <em>Additonal Properties Allowed</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema()
 * @model
 * @generated
 */
public interface Schema extends JSONSchemaSubset, SchemaContainer, ExternalDocsContext {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Schema#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Max Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Properties</em>' attribute.
	 * @see #setMaxProperties(Integer)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_MaxProperties()
	 * @model
	 * @generated
	 */
	Integer getMaxProperties();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Schema#getMaxProperties <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Properties</em>' attribute.
	 * @see #getMaxProperties()
	 * @generated
	 */
	void setMaxProperties(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Properties</em>' attribute.
	 * @see #setMinProperties(Integer)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_MinProperties()
	 * @model
	 * @generated
	 */
	Integer getMinProperties();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Schema#getMinProperties <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Properties</em>' attribute.
	 * @see #getMinProperties()
	 * @generated
	 */
	void setMinProperties(Integer value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_Example()
	 * @model
	 * @generated
	 */
	String getExample();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Schema#getExample <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' attribute.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(String value);

	/**
	 * Returns the value of the '<em><b>Discriminator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator</em>' attribute.
	 * @see #setDiscriminator(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_Discriminator()
	 * @model
	 * @generated
	 */
	String getDiscriminator();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Schema#getDiscriminator <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator</em>' attribute.
	 * @see #getDiscriminator()
	 * @generated
	 */
	void setDiscriminator(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(Boolean)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_ReadOnly()
	 * @model
	 * @generated
	 */
	Boolean getReadOnly();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Schema#getReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>All Of</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Of</em>' reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_AllOf()
	 * @model
	 * @generated
	 */
	EList<Schema> getAllOf();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference.
	 * @see #setItems(Schema)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_Items()
	 * @model
	 * @generated
	 */
	Schema getItems();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Schema#getItems <em>Items</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Schema value);

	/**
	 * Returns the value of the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml</em>' containment reference.
	 * @see #setXml(XMLElement)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_Xml()
	 * @model containment="true"
	 * @generated
	 */
	XMLElement getXml();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Schema#getXml <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml</em>' containment reference.
	 * @see #getXml()
	 * @generated
	 */
	void setXml(XMLElement value);

	/**
	 * Returns the value of the '<em><b>Additonal Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additonal Properties</em>' reference.
	 * @see #setAdditonalProperties(Schema)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_AdditonalProperties()
	 * @model
	 * @generated
	 */
	Schema getAdditonalProperties();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Schema#getAdditonalProperties <em>Additonal Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additonal Properties</em>' reference.
	 * @see #getAdditonalProperties()
	 * @generated
	 */
	void setAdditonalProperties(Schema value);

	/**
	 * Returns the value of the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Context</em>' reference.
	 * @see #setDeclaringContext(SchemaContainer)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_DeclaringContext()
	 * @model
	 * @generated
	 */
	SchemaContainer getDeclaringContext();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Schema#getDeclaringContext <em>Declaring Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Context</em>' reference.
	 * @see #getDeclaringContext()
	 * @generated
	 */
	void setDeclaringContext(SchemaContainer value);

	/**
	 * Returns the value of the '<em><b>Additonal Properties Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additonal Properties Allowed</em>' attribute.
	 * @see #setAdditonalPropertiesAllowed(Boolean)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getSchema_AdditonalPropertiesAllowed()
	 * @model
	 * @generated
	 */
	Boolean getAdditonalPropertiesAllowed();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Schema#getAdditonalPropertiesAllowed <em>Additonal Properties Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additonal Properties Allowed</em>' attribute.
	 * @see #getAdditonalPropertiesAllowed()
	 * @generated
	 */
	void setAdditonalPropertiesAllowed(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Property getPropertyByName(String name);

} // Schema
