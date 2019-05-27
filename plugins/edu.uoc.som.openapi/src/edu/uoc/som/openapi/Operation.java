/**
 */
package edu.uoc.som.openapi;

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
 *   <li>{@link edu.uoc.som.openapi.Operation#getTagReferences <em>Tag References</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Operation#getSummary <em>Summary</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Operation#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Operation#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Operation#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Operation#getProduces <em>Produces</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Operation#getResponses <em>Responses</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Operation#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Operation#getDeprecated <em>Deprecated</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi.OpenAPIPackage#getOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneBodyParameterAllowed oneFormDataParameterAllowed hasUniqueParameters xorFormAndBody requiredResponses'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL oneBodyParameterAllowed='self.parameters-&gt; select(e | e.location = ParameterLocation::\'_body\') -&gt; size() &lt;= 1' oneFormDataParameterAllowed='self.parameters-&gt; select(e | e.location = ParameterLocation::\'_formData\') -&gt; size() &lt;= 1' hasUniqueParameters='self.parameters -&gt; collect(t | Tuple{name : String = t.name,location : ParameterLocation = t.location})-&gt;asSet() -&gt; size() = self.parameters -&gt; size()' xorFormAndBody='(parameters-&gt; select(e | e.location =  ParameterLocation::_\'body\') -&gt; size()=1 and parameters-&gt; select(e | e.location =  ParameterLocation::_\'formData\') -&gt; size()=0)\r\n\tor \r\n\t(parameters-&gt; select(e | e.location =  ParameterLocation::_\'body\') -&gt; size()=0 and parameters-&gt; select(e | e.location =  ParameterLocation::_\'formData\') -&gt; size()=1)\r\n\tor \r\n\t(parameters-&gt; select(e | e.location =  ParameterLocation::_\'body\') -&gt; size()=0 and parameters-&gt; select(e | e.location =  ParameterLocation::_\'formData\') -&gt; size()=0)\r\n\t' requiredResponses='self.responses -&gt; size() &lt;&gt; 0'"
 * @generated
 */
public interface Operation extends ParameterDeclaringContext, SecurityContext, ParameterContext, ExternalDocsContext, ResponseDeclaringContext {
	/**
	 * Returns the value of the '<em><b>Tag References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag References</em>' attribute list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getOperation_TagReferences()
	 * @model
	 * @generated
	 */
	EList<String> getTagReferences();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getOperation_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Operation#getSummary <em>Summary</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getOperation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Operation#getDescription <em>Description</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Operation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Id</em>' attribute.
	 * @see #setOperationId(String)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getOperation_OperationId()
	 * @model
	 * @generated
	 */
	String getOperationId();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Operation#getOperationId <em>Operation Id</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Consumes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes</em>' attribute list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getOperation_Consumes()
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
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getOperation_Produces()
	 * @model
	 * @generated
	 */
	EList<String> getProduces();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi.Response}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' reference list.
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getOperation_Responses()
	 * @model required="true"
	 * @generated
	 */
	EList<Response> getResponses();

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
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getOperation_Schemes()
	 * @model
	 * @generated
	 */
	EList<SchemeType> getSchemes();

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(Boolean)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getOperation_Deprecated()
	 * @model
	 * @generated
	 */
	Boolean getDeprecated();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Operation#getDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #getDeprecated()
	 * @generated
	 */
	void setDeprecated(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((Path)eContainer).getApi().getHost()\r\n\t\t\t\t+ ((Path)eContainer).getApi().getBasePath() + ((Path)eContainer).getRelativePath();'"
	 * @generated
	 */
	String getFullPath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='for(Parameter parameter: getParameters())\r\n\t{\r\n\tif(parameter.getLocation().equals(ParameterLocation.BODY))\r\n\t\tif(parameter.getSchema().getType().equals(JSONDataType.ARRAY))\r\n\t\t\treturn parameter.getSchema().getItems();\r\n\t\t\telse\r\n\t\t\t\treturn parameter.getSchema();\r\n\t}\r\nreturn null;'"
	 * @generated
	 */
	Schema getConsumedSchema();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='for(Response response: getResponses()) {\r\n\tif((response.getCode().equals(\"200\") ||response.getCode().equals(\"201\"))   &amp;&amp; (response.getSchema()!= null &amp;&amp; response.getSchema().getType().equals(JSONDataType.ARRAY))) {\r\n\t\treturn response.getSchema().getItems();\r\n\t\r\n\t}\r\n\tif((response.getCode().equals(\"200\") ||response.getCode().equals(\"201\")) &amp;&amp; (response.getSchema()!= null &amp;&amp; response.getSchema().getType().equals(JSONDataType.OBJECT))) {\r\n\t\treturn response.getSchema();\r\n\t}\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Schema getProducedSchema();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for (Response response : getResponses()) {\r\n\tif ((response.getCode().equals(\"200\") || response.getCode().equals(\"201\"))\r\n\t\t\t&amp;&amp; (response.getSchema() != null &amp;&amp; response.getSchema().getType().equals(JSONDataType.ARRAY))) {\r\n\t\treturn true;\r\n\t}\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean IsProducingList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Path path = ((Path)eContainer);\r\nif(path.getGet().equals(this))\r\n\treturn \"GET\";\r\nif(path.getPost().equals(this))\r\n\treturn \"POST\";\r\nif(path.getPut().equals(this))\r\n\treturn \"PUT\";\r\nif(path.getDelete().equals(this))\r\n\treturn \"DELETE\";\r\nif(path.getOptions().equals(this))\r\n\treturn \"OPTIONS\";\r\nif(path.getHead().equals(this))\r\n\treturn \"HEAD\";\r\nif(path.getPatch().equals(this))\r\n\treturn \"PATCH\";\r\nreturn null;'"
	 * @generated
	 */
	String getMethod();

} // Operation
