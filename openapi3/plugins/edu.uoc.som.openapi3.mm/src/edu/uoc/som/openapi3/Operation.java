/**
 */
package edu.uoc.som.openapi3;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getTagReferences <em>Tag References</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getSummary <em>Summary</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getProduces <em>Produces</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getResponses <em>Responses</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getRequestBody <em>Request Body</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getCallbacks <em>Callbacks</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Operation#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation()
 * @model
 * @generated
 */
public interface Operation extends ParameterContainer, ParameterContext, ExternalDocsContext {
	/**
	 * Returns the value of the '<em><b>Tag References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag References</em>' attribute list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_TagReferences()
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
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Operation#getSummary <em>Summary</em>}' attribute.
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
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Operation#getDescription <em>Description</em>}' attribute.
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
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_OperationId()
	 * @model
	 * @generated
	 */
	String getOperationId();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Operation#getOperationId <em>Operation Id</em>}' attribute.
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
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_Consumes()
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
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_Produces()
	 * @model
	 * @generated
	 */
	EList<String> getProduces();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.Response}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_Responses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Response> getResponses();

	/**
	 * Returns the value of the '<em><b>Schemes</b></em>' attribute list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.SchemeType}.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi3.SchemeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemes</em>' attribute list.
	 * @see edu.uoc.som.openapi3.SchemeType
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_Schemes()
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
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_Deprecated()
	 * @model
	 * @generated
	 */
	Boolean getDeprecated();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Operation#getDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #getDeprecated()
	 * @generated
	 */
	void setDeprecated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.SecurityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_Security()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRequirement> getSecurity();

	/**
	 * Returns the value of the '<em><b>Request Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Body</em>' reference.
	 * @see #setRequestBody(RequestBody)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_RequestBody()
	 * @model
	 * @generated
	 */
	RequestBody getRequestBody();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Operation#getRequestBody <em>Request Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Body</em>' reference.
	 * @see #getRequestBody()
	 * @generated
	 */
	void setRequestBody(RequestBody value);

	/**
	 * Returns the value of the '<em><b>Callbacks</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;java.lang.String, edu.uoc.som.openapi3.Callback&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callbacks</em>' reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_Callbacks()
	 * @model mapType="edu.uoc.som.openapi3.CallbackEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.Callback&gt;"
	 * @generated
	 */
	EList<Map.Entry<String, Callback>> getCallbacks();

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.Server}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getOperation_Servers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Server> getServers();

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
