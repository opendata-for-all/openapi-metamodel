/**
 */
package edu.uoc.som.openapi3;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.Components#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Components#getResponses <em>Responses</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Components#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Components#getExamples <em>Examples</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Components#getRequestBodies <em>Request Bodies</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Components#getSecuritySchemes <em>Security Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Components#getLinks <em>Links</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Components#getCallBacks <em>Call Backs</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getComponents()
 * @model
 * @generated
 */
public interface Components extends EObject {
	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi3.Schema},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' map.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getComponents_Schemas()
	 * @model mapType="edu.uoc.som.openapi3.SchemaEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.Schema&gt;"
	 * @generated
	 */
	EMap<String, Schema> getSchemas();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi3.ResponseDefinition},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' map.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getComponents_Responses()
	 * @model mapType="edu.uoc.som.openapi3.ResponseDefinitionEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.ResponseDefinition&gt;"
	 * @generated
	 */
	EMap<String, ResponseDefinition> getResponses();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi3.Parameter},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' map.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getComponents_Parameters()
	 * @model mapType="edu.uoc.som.openapi3.ParameterEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.Parameter&gt;"
	 * @generated
	 */
	EMap<String, Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi3.Example},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' map.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getComponents_Examples()
	 * @model mapType="edu.uoc.som.openapi3.ExampleEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.Example&gt;"
	 * @generated
	 */
	EMap<String, Example> getExamples();

	/**
	 * Returns the value of the '<em><b>Request Bodies</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi3.RequestBody},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Bodies</em>' map.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getComponents_RequestBodies()
	 * @model mapType="edu.uoc.som.openapi3.RequestBodyEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.RequestBody&gt;"
	 * @generated
	 */
	EMap<String, RequestBody> getRequestBodies();

	/**
	 * Returns the value of the '<em><b>Security Schemes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi3.SecurityScheme},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Schemes</em>' map.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getComponents_SecuritySchemes()
	 * @model mapType="edu.uoc.som.openapi3.SecuritySchemeEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.SecurityScheme&gt;"
	 * @generated
	 */
	EMap<String, SecurityScheme> getSecuritySchemes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi3.link},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' map.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getComponents_Links()
	 * @model mapType="edu.uoc.som.openapi3.LinkEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.link&gt;"
	 * @generated
	 */
	EMap<String, link> getLinks();

	/**
	 * Returns the value of the '<em><b>Call Backs</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link edu.uoc.som.openapi3.Callback},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Backs</em>' map.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getComponents_CallBacks()
	 * @model mapType="edu.uoc.som.openapi3.CallbackEntry&lt;org.eclipse.emf.ecore.EString, edu.uoc.som.openapi3.Callback&gt;"
	 * @generated
	 */
	EMap<String, Callback> getCallBacks();

} // Components
