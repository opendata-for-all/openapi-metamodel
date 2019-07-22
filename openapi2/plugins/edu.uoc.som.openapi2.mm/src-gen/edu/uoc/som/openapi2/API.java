/**
 */
package edu.uoc.som.openapi2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.API#getInfo <em>Info</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.API#getHost <em>Host</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.API#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.API#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.API#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.API#getProduces <em>Produces</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.API#getPaths <em>Paths</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.API#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.API#getResponses <em>Responses</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.API#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.API#getTags <em>Tags</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.API#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.API#getContainedCollections <em>Contained Collections</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI()
 * @model
 * @generated
 */
public interface API extends ExternalDocsContainer, SecurityContainer, ParameterContainer, ResponseContainer, SchemaContainer {
	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(Info)
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_Info()
	 * @model containment="true"
	 * @generated
	 */
	Info getInfo();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.API#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(Info value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.API#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_BasePath()
	 * @model
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.API#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Schemes</b></em>' attribute list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.SchemeType}.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi2.SchemeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemes</em>' attribute list.
	 * @see edu.uoc.som.openapi2.SchemeType
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_Schemes()
	 * @model
	 * @generated
	 */
	EList<SchemeType> getSchemes();

	/**
	 * Returns the value of the '<em><b>Consumes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes</em>' attribute list.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_Consumes()
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
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_Produces()
	 * @model
	 * @generated
	 */
	EList<String> getProduces();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.Path}.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.openapi2.Path#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see #isSetPaths()
	 * @see #unsetPaths()
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_Paths()
	 * @see edu.uoc.som.openapi2.Path#getApi
	 * @model opposite="api" containment="true" unsettable="true"
	 * @generated
	 */
	EList<Path> getPaths();

	/**
	 * Unsets the value of the '{@link edu.uoc.som.openapi2.API#getPaths <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPaths()
	 * @see #getPaths()
	 * @generated
	 */
	void unsetPaths();

	/**
	 * Returns whether the value of the '{@link edu.uoc.som.openapi2.API#getPaths <em>Paths</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Paths</em>' containment reference list is set.
	 * @see #unsetPaths()
	 * @see #getPaths()
	 * @generated
	 */
	boolean isSetPaths();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi2.Schema},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' map.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_Definitions()
	 * @model mapType="edu.uoc.som.openapi2.SchemaEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi2.Schema&gt;"
	 * @generated
	 */
	EMap<String, Schema> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi2.Response},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' map.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_Responses()
	 * @model mapType="edu.uoc.som.openapi2.ResponseDefinitionEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi2.Response&gt;"
	 * @generated
	 */
	EMap<String, Response> getResponses();

	/**
	 * Returns the value of the '<em><b>Security Definitions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi2.SecurityScheme},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Definitions</em>' map.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_SecurityDefinitions()
	 * @model mapType="edu.uoc.som.openapi2.SecuritySchemeEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi2.SecurityScheme&gt;"
	 * @generated
	 */
	EMap<String, SecurityScheme> getSecurityDefinitions();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi2.Parameter},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' map.
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_Parameters()
	 * @model mapType="edu.uoc.som.openapi2.ParameterEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi2.Parameter&gt;"
	 * @generated
	 */
	EMap<String, Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Contained Collections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Collections</em>' containment reference.
	 * @see #setContainedCollections(ContainedCollections)
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#getAPI_ContainedCollections()
	 * @model containment="true"
	 * @generated
	 */
	ContainedCollections getContainedCollections();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.API#getContainedCollections <em>Contained Collections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Collections</em>' containment reference.
	 * @see #getContainedCollections()
	 * @generated
	 */
	void setContainedCollections(ContainedCollections value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Operation> getAllOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Schema getSchemaByReference(String ref);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Operation getOperationById(String operationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Path getPathByRelativePath(String relativePath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Parameter getParameterByReference(String ref);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Response getResponseDefinitionByReference(String ref);

} // API
