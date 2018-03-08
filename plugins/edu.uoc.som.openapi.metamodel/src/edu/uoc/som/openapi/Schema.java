/**
 */
package edu.uoc.som.openapi;

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
 *   <li>{@link edu.uoc.som.openapi.Schema#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getMaxProperties <em>Max Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getMinProperties <em>Min Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getExample <em>Example</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getProperties <em>Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getAllOf <em>All Of</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getItems <em>Items</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getXml <em>Xml</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getAdditonalProperties <em>Additonal Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getDeclaringContext <em>Declaring Context</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getRequired <em>Required</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#getValue <em>Value</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Schema#isAdditonalPropertiesAllowed <em>Additonal Properties Allowed</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends JSONSchemaSubset, SchemaDeclaringContext, JSONPointer, ExternalDocsContext {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#getTitle <em>Title</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Max Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Properties</em>' attribute.
	 * @see #setMaxProperties(Integer)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_MaxProperties()
	 * @model
	 * @generated
	 */
	Integer getMaxProperties();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#getMaxProperties <em>Max Properties</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Min Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Properties</em>' attribute.
	 * @see #setMinProperties(Integer)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_MinProperties()
	 * @model
	 * @generated
	 */
	Integer getMinProperties();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#getMinProperties <em>Min Properties</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Example</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_Example()
	 * @model
	 * @generated
	 */
	String getExample();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#getExample <em>Example</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Discriminator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator</em>' attribute.
	 * @see #setDiscriminator(String)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_Discriminator()
	 * @model
	 * @generated
	 */
	String getDiscriminator();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#getDiscriminator <em>Discriminator</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(Boolean)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_ReadOnly()
	 * @model
	 * @generated
	 */
	Boolean getReadOnly();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#getReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_Properties()
	 * @model
	 * @generated
	 */
	EList<Schema> getProperties();

	/**
	 * Returns the value of the '<em><b>All Of</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Of</em>' reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_AllOf()
	 * @model
	 * @generated
	 */
	EList<Schema> getAllOf();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference.
	 * @see #setItems(Schema)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_Items()
	 * @model
	 * @generated
	 */
	Schema getItems();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#getItems <em>Items</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Xml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml</em>' containment reference.
	 * @see #setXml(XMLElement)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_Xml()
	 * @model containment="true"
	 * @generated
	 */
	XMLElement getXml();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#getXml <em>Xml</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Additonal Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additonal Properties</em>' reference.
	 * @see #setAdditonalProperties(Schema)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_AdditonalProperties()
	 * @model
	 * @generated
	 */
	Schema getAdditonalProperties();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#getAdditonalProperties <em>Additonal Properties</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Declaring Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Context</em>' reference.
	 * @see #setDeclaringContext(SchemaDeclaringContext)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_DeclaringContext()
	 * @model
	 * @generated
	 */
	SchemaDeclaringContext getDeclaringContext();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#getDeclaringContext <em>Declaring Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Context</em>' reference.
	 * @see #getDeclaringContext()
	 * @generated
	 */
	void setDeclaringContext(SchemaDeclaringContext value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_Required()
	 * @model
	 * @generated
	 */
	EList<Schema> getRequired();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Schema)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_Value()
	 * @model
	 * @generated
	 */
	Schema getValue();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Schema value);

	/**
	 * Returns the value of the '<em><b>Additonal Properties Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additonal Properties Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additonal Properties Allowed</em>' attribute.
	 * @see #setAdditonalPropertiesAllowed(boolean)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getSchema_AdditonalPropertiesAllowed()
	 * @model
	 * @generated
	 */
	boolean isAdditonalPropertiesAllowed();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Schema#isAdditonalPropertiesAllowed <em>Additonal Properties Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additonal Properties Allowed</em>' attribute.
	 * @see #isAdditonalPropertiesAllowed()
	 * @generated
	 */
	void setAdditonalPropertiesAllowed(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getDeclaringContext() instanceof edu.uoc.som.openapi.API) {\r\n\treturn ((edu.uoc.som.openapi.API) getDeclaringContext()).getRef() + \"/definitions/\" + getName();\r\n\t} else if (getDeclaringContext() instanceof Schema) {\r\nSchema context = (Schema) getDeclaringContext();\t\r\nif (context.getProperties().contains(this))\r\n\treturn context.getRef() + \"/properties/\" + getName();\r\nelse if (context.getItems().equals(this))\r\n\treturn context.getRef() + \"/items\";\r\nelse if (context.getAdditonalProperties().equals(this))\r\n\treturn context.getRef() + \"/additionalProperties\";\r\n\t\t\t}\r\n\treturn \"\";'"
	 * @generated
	 */
	String getRef();

} // Schema
