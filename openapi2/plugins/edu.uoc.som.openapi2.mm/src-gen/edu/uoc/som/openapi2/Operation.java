/**
 */
package edu.uoc.som.openapi2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getTagReferences <em>Tag References</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getSummary <em>Summary</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getProduces <em>Produces</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getResponses <em>Responses</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.OpenAPI2Package#getOperation()
 * @model
 * @generated
 */
public interface Operation extends ParameterContainer, ExternalDocsContainer, SecurityContainer, ResponseContainer {
	/**
	 * Returns the value of the '<em><b>Tag References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag References</em>' attribute list.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getOperation_TagReferences()
	 * @model
	 * @generated
	 */
	EList<String> getTagReferences();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getOperation_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.Operation#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getOperation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.Operation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Id</em>' attribute.
	 * @see #setOperationId(String)
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getOperation_OperationId()
	 * @model
	 * @generated
	 */
	String getOperationId();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.Operation#getOperationId <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Id</em>' attribute.
	 * @see #getOperationId()
	 * @generated
	 */
	void setOperationId(String value);

	/**
	 * Returns the value of the '<em><b>Consumes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes</em>' attribute list.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getOperation_Consumes()
	 * @model
	 * @generated
	 */
	EList<String> getConsumes();

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' attribute list.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getOperation_Produces()
	 * @model
	 * @generated
	 */
	EList<String> getProduces();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi2.Response},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' map.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getOperation_Responses()
	 * @model mapType="edu.uoc.som.openapi2.ResponseEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi2.Response&gt;"
	 * @generated
	 */
	EMap<String, Response> getResponses();

	/**
	 * Returns the value of the '<em><b>Schemes</b></em>' attribute list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.SchemeType}.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi2.SchemeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemes</em>' attribute list.
	 * @see edu.uoc.som.openapi2.SchemeType
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getOperation_Schemes()
	 * @model
	 * @generated
	 */
	EList<SchemeType> getSchemes();

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(Boolean)
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getOperation_Deprecated()
	 * @model
	 * @generated
	 */
	Boolean getDeprecated();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.Operation#getDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #getDeprecated()
	 * @generated
	 */
	void setDeprecated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getOperation_Parameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getFullPath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getHTTPMethod();

} // Operation
