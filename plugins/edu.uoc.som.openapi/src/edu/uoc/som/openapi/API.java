/**
 */
package edu.uoc.som.openapi;

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
 *   <li>{@link edu.uoc.som.openapi.API#getSwagger <em>Swagger</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.API#getInfo <em>Info</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.API#getHost <em>Host</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.API#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.API#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.API#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.API#getProduces <em>Produces</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.API#getPaths <em>Paths</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.API#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.API#getResponses <em>Responses</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.API#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.API#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requiredSwaggerVersion correctSwaggerVersion requiredInfoReference requiredPaths'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL requiredSwaggerVersion='not self.swagger.oclIsUndefined()' requiredInfoReference='not self.info.oclIsUndefined()' correctSwaggerVersion='self.swagger = \'2.0\'' requiredPaths='pathsIsSet()'"
 *        extendedMetaData="name='API'"
 * @generated
 */
public interface API extends ParameterDeclaringContext, SchemaDeclaringContext, SecurityContext, ParameterContext, ExternalDocsContext, ResponseDeclaringContext {
	/**
	 * Returns the value of the '<em><b>Swagger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swagger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swagger</em>' attribute.
	 * @see #setSwagger(String)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI_Swagger()
	 * @model
	 * @generated
	 */
	String getSwagger();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.API#getSwagger <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swagger</em>' attribute.
	 * @see #getSwagger()
	 * @generated
	 */
	void setSwagger(String value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(Info)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI_Info()
	 * @model containment="true"
	 * @generated
	 */
	Info getInfo();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.API#getInfo <em>Info</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.API#getHost <em>Host</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI_BasePath()
	 * @model
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.API#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Schemes</b></em>' attribute list.
	 * The list contents are of type {@link edu.uoc.som.openapi.SchemeType}.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi.SchemeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemes</em>' attribute list.
	 * @see edu.uoc.som.openapi.SchemeType
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI_Schemes()
	 * @model
	 * @generated
	 */
	EList<SchemeType> getSchemes();

	/**
	 * Returns the value of the '<em><b>Consumes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes</em>' attribute list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI_Consumes()
	 * @model
	 * @generated
	 */
	EList<String> getConsumes();

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produces</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' attribute list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI_Produces()
	 * @model
	 * @generated
	 */
	EList<String> getProduces();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.Path}.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.openapi.Path#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see #isSetPaths()
	 * @see #unsetPaths()
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI_Paths()
	 * @see edu.uoc.som.openapi.Path#getApi
	 * @model opposite="api" containment="true" unsettable="true"
	 * @generated
	 */
	EList<Path> getPaths();

	/**
	 * Unsets the value of the '{@link edu.uoc.som.openapi.API#getPaths <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPaths()
	 * @see #getPaths()
	 * @generated
	 */
	void unsetPaths();

	/**
	 * Returns whether the value of the '{@link edu.uoc.som.openapi.API#getPaths <em>Paths</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Paths</em>' containment reference list is set.
	 * @see #unsetPaths()
	 * @see #getPaths()
	 * @generated
	 */
	boolean isSetPaths();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.Response}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI_Responses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Response> getResponses();

	/**
	 * Returns the value of the '<em><b>Security Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.SecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Definitions</em>' containment reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI_SecurityDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityScheme> getSecurityDefinitions();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getAPI_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return pathsIsSet();'"
	 * @generated
	 */
	boolean pathsIsSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='TreeIterator&lt;EObject&gt; allElements = this.eAllContents();\r\nEList&lt;Operation&gt; allOperations = ECollections.newBasicEList();\r\nwhile (allElements.hasNext()) {\r\n\torg.eclipse.emf.ecore.EObject object = allElements.next();\r\n\tif (object instanceof Operation) {\r\n\t\tallOperations.add((Operation) object);\r\n\t}\r\n}\r\nreturn allOperations;'"
	 * @generated
	 */
	EList<Operation> getAllOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tList&lt;Schema&gt; definitions = this.getDefinitions();\n\t\tfor (Schema definition : definitions) {\n\t\t\tString temp = definition.getRef();\n\t\t\tif (temp.equalsIgnoreCase(ref))\n\t\t\t\treturn definition;\n\t\t}\n\t\treturn null;'"
	 * @generated
	 */
	Schema getSchemaByReference(String ref);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='EList&lt;Operation&gt; allOperations = getAllOperations();\r\nfor (Operation operation : allOperations) {\r\n\tif (operation.getOperationId().equals(operationId))\r\n\t\treturn operation;\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Operation getOperationById(String operationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for(Path path: getPaths()) {\r\n\tif(path.getRelativePath().equalsIgnoreCase(relativePath)) {\r\n\t\treturn path;\r\n\t}\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Path getPathByRelativePath(String relativePath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tfor (Schema definition : getDefinitions()) {\n\t\t\t\t\tif (definition.getReferenceName().equalsIgnoreCase(name))\n\t\t\t\t\t\treturn definition;\n\t\t\t\t}\n\t\t\t\treturn null;'"
	 * @generated
	 */
	Schema getSchemaByName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String referenceName = ref.substring(ref.lastIndexOf(\"/\")+1);\r\nfor (Parameter parameter : getParameters()) {\r\nif(parameter.getReferenceName().equals(referenceName))\r\n\treturn parameter;\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Parameter getParameterByRef(String ref);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for(SecurityScheme securityScheme: getSecurityDefinitions())\n\t\t\tif(securityScheme.getReferenceName().equals(name))\n\t\t\t\treturn securityScheme;\n\t\treturn null\t;'"
	 * @generated
	 */
	SecurityScheme getSecuritySchemaByName(String name);

} // API
