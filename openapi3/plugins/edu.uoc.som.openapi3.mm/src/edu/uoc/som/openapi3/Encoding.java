/**
 */
package edu.uoc.som.openapi3;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encoding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.Encoding#getContentType <em>Content Type</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Encoding#getHeaders <em>Headers</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Encoding#getStyle <em>Style</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Encoding#getExplode <em>Explode</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Encoding#getAllowReserved <em>Allow Reserved</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getEncoding()
 * @model
 * @generated
 */
public interface Encoding extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getEncoding_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Encoding#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;java.lang.String, edu.uoc.som.openapi3.Header&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getEncoding_Headers()
	 * @model mapType="edu.uoc.som.openapi3.HeaderEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.Header&gt;"
	 * @generated
	 */
	EList<Map.Entry<String, Header>> getHeaders();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getEncoding_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Encoding#getStyle <em>Style</em>}' attribute.
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
	 * @see edu.uoc.som.openapi3.Openapi3Package#getEncoding_Explode()
	 * @model
	 * @generated
	 */
	Boolean getExplode();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Encoding#getExplode <em>Explode</em>}' attribute.
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
	 * @see edu.uoc.som.openapi3.Openapi3Package#getEncoding_AllowReserved()
	 * @model
	 * @generated
	 */
	Boolean getAllowReserved();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Encoding#getAllowReserved <em>Allow Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Reserved</em>' attribute.
	 * @see #getAllowReserved()
	 * @generated
	 */
	void setAllowReserved(Boolean value);

} // Encoding
