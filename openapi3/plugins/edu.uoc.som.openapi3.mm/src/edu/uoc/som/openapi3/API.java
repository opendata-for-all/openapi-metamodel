/**
 */
package edu.uoc.som.openapi3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.API#getOpenapi <em>Openapi</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.API#getInfo <em>Info</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.API#getHost <em>Host</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.API#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.API#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.API#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.API#getProduces <em>Produces</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.API#getPaths <em>Paths</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.API#getTags <em>Tags</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.API#getComponents <em>Components</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.API#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.API#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI()
 * @model
 * @generated
 */
public interface API extends ParameterContainer, SchemaContainer, ParameterContext, ExternalDocsContext, ResponseContainer {
	/**
	 * Returns the value of the '<em><b>Openapi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Openapi</em>' attribute.
	 * @see #setOpenapi(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI_Openapi()
	 * @model
	 * @generated
	 */
	String getOpenapi();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.API#getOpenapi <em>Openapi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openapi</em>' attribute.
	 * @see #getOpenapi()
	 * @generated
	 */
	void setOpenapi(String value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(Info)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI_Info()
	 * @model containment="true"
	 * @generated
	 */
	Info getInfo();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.API#getInfo <em>Info</em>}' containment reference.
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
	 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.API#getHost <em>Host</em>}' attribute.
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
	 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI_BasePath()
	 * @model
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.API#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Schemes</b></em>' attribute list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.SchemeType}.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi3.SchemeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemes</em>' attribute list.
	 * @see edu.uoc.som.openapi3.SchemeType
	 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI_Schemes()
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
	 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI_Consumes()
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
	 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI_Produces()
	 * @model
	 * @generated
	 */
	EList<String> getProduces();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.Path}.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.openapi3.Path#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see #isSetPaths()
	 * @see #unsetPaths()
	 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI_Paths()
	 * @see edu.uoc.som.openapi3.Path#getApi
	 * @model opposite="api" containment="true" unsettable="true"
	 * @generated
	 */
	EList<Path> getPaths();

	/**
	 * Unsets the value of the '{@link edu.uoc.som.openapi3.API#getPaths <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPaths()
	 * @see #getPaths()
	 * @generated
	 */
	void unsetPaths();

	/**
	 * Returns whether the value of the '{@link edu.uoc.som.openapi3.API#getPaths <em>Paths</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Paths</em>' containment reference list is set.
	 * @see #unsetPaths()
	 * @see #getPaths()
	 * @generated
	 */
	boolean isSetPaths();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference.
	 * @see #setComponents(Components)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI_Components()
	 * @model containment="true"
	 * @generated
	 */
	Components getComponents();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.API#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(Components value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.SecurityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI_Security()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRequirement> getSecurity();

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.Server}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getAPI_Servers()
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
	ResponseDefinition getResponseDefinitionByReference(String ref);

} // API
