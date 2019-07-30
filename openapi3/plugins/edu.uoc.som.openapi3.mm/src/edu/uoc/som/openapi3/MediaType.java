/**
 */
package edu.uoc.som.openapi3;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.MediaType#getSchema <em>Schema</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.MediaType#getExample <em>Example</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.MediaType#getExamples <em>Examples</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.MediaType#getEncoding <em>Encoding</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getMediaType()
 * @model
 * @generated
 */
public interface MediaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' reference.
	 * @see #setSchema(Schema)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getMediaType_Schema()
	 * @model
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.MediaType#getSchema <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getMediaType_Example()
	 * @model
	 * @generated
	 */
	String getExample();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.MediaType#getExample <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' attribute.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(String value);

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;java.lang.String, edu.uoc.som.openapi3.Example&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getMediaType_Examples()
	 * @model mapType="edu.uoc.som.openapi3.ExampleEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.Example&gt;"
	 * @generated
	 */
	EList<Map.Entry<String, Example>> getExamples();

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;java.lang.String, edu.uoc.som.openapi3.Encoding&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getMediaType_Encoding()
	 * @model mapType="edu.uoc.som.openapi3.EncodingEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.Encoding&gt;"
	 * @generated
	 */
	EList<Map.Entry<String, Encoding>> getEncoding();

} // MediaType
