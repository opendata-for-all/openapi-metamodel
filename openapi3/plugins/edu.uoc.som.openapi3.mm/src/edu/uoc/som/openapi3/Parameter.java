/**
 */
package edu.uoc.som.openapi3;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Parameter#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Parameter#getRequired <em>Required</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Parameter#getAllowEmplyValue <em>Allow Emply Value</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Parameter#getDeclaringContext <em>Declaring Context</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Parameter#getExample <em>Example</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Parameter#getStyle <em>Style</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Parameter#getExplode <em>Explode</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Parameter#getAllowReserved <em>Allow Reserved</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Parameter#getExamples <em>Examples</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Parameter#getSchema <em>Schema</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Parameter#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends SchemaContainer, JSONSchemaSubset, ArrayContext {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi3.ParameterLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see edu.uoc.som.openapi3.ParameterLocation
	 * @see #setLocation(ParameterLocation)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter_Location()
	 * @model
	 * @generated
	 */
	ParameterLocation getLocation();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Parameter#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see edu.uoc.som.openapi3.ParameterLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(ParameterLocation value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(Boolean)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter_Required()
	 * @model
	 * @generated
	 */
	Boolean getRequired();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Parameter#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Emply Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Emply Value</em>' attribute.
	 * @see #setAllowEmplyValue(Boolean)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter_AllowEmplyValue()
	 * @model
	 * @generated
	 */
	Boolean getAllowEmplyValue();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Parameter#getAllowEmplyValue <em>Allow Emply Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Emply Value</em>' attribute.
	 * @see #getAllowEmplyValue()
	 * @generated
	 */
	void setAllowEmplyValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Context</em>' reference.
	 * @see #setDeclaringContext(ParameterContainer)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter_DeclaringContext()
	 * @model
	 * @generated
	 */
	ParameterContainer getDeclaringContext();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Parameter#getDeclaringContext <em>Declaring Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Context</em>' reference.
	 * @see #getDeclaringContext()
	 * @generated
	 */
	void setDeclaringContext(ParameterContainer value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter_Example()
	 * @model
	 * @generated
	 */
	String getExample();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Parameter#getExample <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' attribute.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Parameter#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Explode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explode</em>' attribute.
	 * @see #setExplode(Boolean)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter_Explode()
	 * @model
	 * @generated
	 */
	Boolean getExplode();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Parameter#getExplode <em>Explode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explode</em>' attribute.
	 * @see #getExplode()
	 * @generated
	 */
	void setExplode(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Reserved</em>' attribute.
	 * @see #setAllowReserved(Boolean)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter_AllowReserved()
	 * @model
	 * @generated
	 */
	Boolean getAllowReserved();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Parameter#getAllowReserved <em>Allow Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Reserved</em>' attribute.
	 * @see #getAllowReserved()
	 * @generated
	 */
	void setAllowReserved(Boolean value);

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;java.lang.String, edu.uoc.som.openapi3.Example&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter_Examples()
	 * @model mapType="edu.uoc.som.openapi3.ExampleEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.Example&gt;"
	 * @generated
	 */
	EList<Map.Entry<String, Example>> getExamples();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' reference.
	 * @see #setSchema(Schema)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter_Schema()
	 * @model
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Parameter#getSchema <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;java.lang.String, edu.uoc.som.openapi3.MediaType&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getParameter_Content()
	 * @model mapType="edu.uoc.som.openapi3.MediaTypeEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.MediaType&gt;"
	 * @generated
	 */
	EList<Map.Entry<String, MediaType>> getContent();

} // Parameter
