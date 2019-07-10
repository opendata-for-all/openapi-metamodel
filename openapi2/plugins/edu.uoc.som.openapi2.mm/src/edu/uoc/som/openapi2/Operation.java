/**
 */
package edu.uoc.som.openapi2;

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
 *   <li>{@link edu.uoc.som.openapi2.Operation#getTagReferences <em>Tag References</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getSummary <em>Summary</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getProduces <em>Produces</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getResponses <em>Responses</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Operation#getDeprecated <em>Deprecated</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.OpenAPIPackage#getOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneBodyParameterAllowed oneFormDataParameterAllowed hasUniqueParameters xorFormAndBody requiredResponses'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL oneBodyParameterAllowed='self.parameters-&gt; select(e | e.location = ParameterLocation::\'_body\') -&gt; size() &lt;= 1' oneFormDataParameterAllowed='self.parameters-&gt; select(e | e.location = ParameterLocation::\'_formData\') -&gt; size() &lt;= 1' hasUniqueParameters='self.parameters -&gt; collect(t | Tuple{name : String = t.name,location : ParameterLocation = t.location})-&gt;asSet() -&gt; size() = self.parameters -&gt; size()' xorFormAndBody='(parameters-&gt; select(e | e.location =  ParameterLocation::_\'body\') -&gt; size()=1 and parameters-&gt; select(e | e.location =  ParameterLocation::_\'formData\') -&gt; size()=0)\r\n\tor \r\n\t(parameters-&gt; select(e | e.location =  ParameterLocation::_\'body\') -&gt; size()=0 and parameters-&gt; select(e | e.location =  ParameterLocation::_\'formData\') -&gt; size()=1)\r\n\tor \r\n\t(parameters-&gt; select(e | e.location =  ParameterLocation::_\'body\') -&gt; size()=0 and parameters-&gt; select(e | e.location =  ParameterLocation::_\'formData\') -&gt; size()=0)\r\n\t' requiredResponses='self.responses -&gt; size() &lt;&gt; 0'"
 * @generated
 */
public interface Operation extends ParameterDeclaringContext, SecurityContext, ParameterContext, ExternalDocsContext {
	/**
	 * Returns the value of the '<em><b>Tag References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag References</em>' attribute list.
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getOperation_TagReferences()
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
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getOperation_Summary()
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
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getOperation_Description()
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
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getOperation_OperationId()
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
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getOperation_Consumes()
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
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getOperation_Produces()
	 * @model
	 * @generated
	 */
	EList<String> getProduces();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.Response}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference list.
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getOperation_Responses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Response> getResponses();

	/**
	 * Returns the value of the '<em><b>Schemes</b></em>' attribute list.
	 * The list contents are of type {@link edu.uoc.som.openapi2.SchemeType}.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi2.SchemeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemes</em>' attribute list.
	 * @see edu.uoc.som.openapi2.SchemeType
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getOperation_Schemes()
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
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getOperation_Deprecated()
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
	Schema getConsumedSchema();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Schema getProducedSchema();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean IsProducingList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getMethod();

} // Operation
