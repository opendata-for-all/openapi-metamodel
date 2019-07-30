/**
 */
package edu.uoc.som.openapi3.util;

import edu.uoc.som.openapi3.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.openapi3.Openapi3Package
 * @generated
 */
public class Openapi3AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Openapi3Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Openapi3AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Openapi3Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Openapi3Switch<Adapter> modelSwitch =
		new Openapi3Switch<Adapter>() {
			@Override
			public Adapter caseJSONSchemaSubset(JSONSchemaSubset object) {
				return createJSONSchemaSubsetAdapter();
			}
			@Override
			public Adapter caseContainedCollections(ContainedCollections object) {
				return createContainedCollectionsAdapter();
			}
			@Override
			public Adapter caseAPI(API object) {
				return createAPIAdapter();
			}
			@Override
			public Adapter caseInfo(Info object) {
				return createInfoAdapter();
			}
			@Override
			public Adapter caseContact(Contact object) {
				return createContactAdapter();
			}
			@Override
			public Adapter caseLicense(License object) {
				return createLicenseAdapter();
			}
			@Override
			public Adapter casePath(Path object) {
				return createPathAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseExternalDocs(ExternalDocs object) {
				return createExternalDocsAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseItemsDefinition(ItemsDefinition object) {
				return createItemsDefinitionAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseResponseDefinition(ResponseDefinition object) {
				return createResponseDefinitionAdapter();
			}
			@Override
			public Adapter caseHeader(Header object) {
				return createHeaderAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseSecurityScheme(SecurityScheme object) {
				return createSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseExample(Example object) {
				return createExampleAdapter();
			}
			@Override
			public Adapter caseXMLElement(XMLElement object) {
				return createXMLElementAdapter();
			}
			@Override
			public Adapter caseSecurityScope(SecurityScope object) {
				return createSecurityScopeAdapter();
			}
			@Override
			public Adapter caseParameterContainer(ParameterContainer object) {
				return createParameterContainerAdapter();
			}
			@Override
			public Adapter caseSchemaContainer(SchemaContainer object) {
				return createSchemaContainerAdapter();
			}
			@Override
			public Adapter caseResponseContainer(ResponseContainer object) {
				return createResponseContainerAdapter();
			}
			@Override
			public Adapter caseParameterContext(ParameterContext object) {
				return createParameterContextAdapter();
			}
			@Override
			public Adapter caseSchemaContext(SchemaContext object) {
				return createSchemaContextAdapter();
			}
			@Override
			public Adapter caseExternalDocsContext(ExternalDocsContext object) {
				return createExternalDocsContextAdapter();
			}
			@Override
			public Adapter caseArrayContext(ArrayContext object) {
				return createArrayContextAdapter();
			}
			@Override
			public Adapter caseSecurityRequirement(SecurityRequirement object) {
				return createSecurityRequirementAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseResponse(Response object) {
				return createResponseAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseServerVariableEntry(Map.Entry<String, ServerVariable> object) {
				return createServerVariableEntryAdapter();
			}
			@Override
			public Adapter caseServerVariable(ServerVariable object) {
				return createServerVariableAdapter();
			}
			@Override
			public Adapter caseComponents(Components object) {
				return createComponentsAdapter();
			}
			@Override
			public Adapter caseSchemaEntry(Map.Entry<String, Schema> object) {
				return createSchemaEntryAdapter();
			}
			@Override
			public Adapter caseResponseDefinitionEntry(Map.Entry<String, ResponseDefinition> object) {
				return createResponseDefinitionEntryAdapter();
			}
			@Override
			public Adapter caseParameterEntry(Map.Entry<String, Parameter> object) {
				return createParameterEntryAdapter();
			}
			@Override
			public Adapter caseExampleEntry(Map.Entry<String, Example> object) {
				return createExampleEntryAdapter();
			}
			@Override
			public Adapter caseRequestBodyEntry(Map.Entry<String, RequestBody> object) {
				return createRequestBodyEntryAdapter();
			}
			@Override
			public Adapter caseHeaderEntry(Map.Entry<String, Header> object) {
				return createHeaderEntryAdapter();
			}
			@Override
			public Adapter caseSecuritySchemeEntry(Map.Entry<String, SecurityScheme> object) {
				return createSecuritySchemeEntryAdapter();
			}
			@Override
			public Adapter caseLinkEntry(Map.Entry<String, link> object) {
				return createLinkEntryAdapter();
			}
			@Override
			public Adapter caseCallbackEntry(Map.Entry<String, Callback> object) {
				return createCallbackEntryAdapter();
			}
			@Override
			public Adapter caseRequestBody(RequestBody object) {
				return createRequestBodyAdapter();
			}
			@Override
			public Adapter caselink(link object) {
				return createlinkAdapter();
			}
			@Override
			public Adapter caseCallback(Callback object) {
				return createCallbackAdapter();
			}
			@Override
			public Adapter caseServerContainer(ServerContainer object) {
				return createServerContainerAdapter();
			}
			@Override
			public Adapter caseMediaType(MediaType object) {
				return createMediaTypeAdapter();
			}
			@Override
			public Adapter caseMediaTypeEntry(Map.Entry<String, MediaType> object) {
				return createMediaTypeEntryAdapter();
			}
			@Override
			public Adapter caseEncoding(Encoding object) {
				return createEncodingAdapter();
			}
			@Override
			public Adapter caseEncodingEntry(Map.Entry<String, Encoding> object) {
				return createEncodingEntryAdapter();
			}
			@Override
			public Adapter caseRuntimeExpression(RuntimeExpression object) {
				return createRuntimeExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionToPath(Map.Entry<String, Path> object) {
				return createExpressionToPathAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.JSONSchemaSubset <em>JSON Schema Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset
	 * @generated
	 */
	public Adapter createJSONSchemaSubsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.ContainedCollections <em>Contained Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.ContainedCollections
	 * @generated
	 */
	public Adapter createContainedCollectionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.API
	 * @generated
	 */
	public Adapter createAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Info
	 * @generated
	 */
	public Adapter createInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Contact
	 * @generated
	 */
	public Adapter createContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.License
	 * @generated
	 */
	public Adapter createLicenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.ExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.ExternalDocs
	 * @generated
	 */
	public Adapter createExternalDocsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.ItemsDefinition <em>Items Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.ItemsDefinition
	 * @generated
	 */
	public Adapter createItemsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.ResponseDefinition <em>Response Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.ResponseDefinition
	 * @generated
	 */
	public Adapter createResponseDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.SecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.SecurityScheme
	 * @generated
	 */
	public Adapter createSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Example
	 * @generated
	 */
	public Adapter createExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.XMLElement <em>XML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.XMLElement
	 * @generated
	 */
	public Adapter createXMLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.SecurityScope <em>Security Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.SecurityScope
	 * @generated
	 */
	public Adapter createSecurityScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.ParameterContainer <em>Parameter Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.ParameterContainer
	 * @generated
	 */
	public Adapter createParameterContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.SchemaContainer <em>Schema Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.SchemaContainer
	 * @generated
	 */
	public Adapter createSchemaContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.ResponseContainer <em>Response Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.ResponseContainer
	 * @generated
	 */
	public Adapter createResponseContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.ParameterContext <em>Parameter Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.ParameterContext
	 * @generated
	 */
	public Adapter createParameterContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.SchemaContext <em>Schema Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.SchemaContext
	 * @generated
	 */
	public Adapter createSchemaContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.ExternalDocsContext <em>External Docs Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.ExternalDocsContext
	 * @generated
	 */
	public Adapter createExternalDocsContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.ArrayContext <em>Array Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.ArrayContext
	 * @generated
	 */
	public Adapter createArrayContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.SecurityRequirement
	 * @generated
	 */
	public Adapter createSecurityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Server Variable Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createServerVariableEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.ServerVariable <em>Server Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.ServerVariable
	 * @generated
	 */
	public Adapter createServerVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Components <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Components
	 * @generated
	 */
	public Adapter createComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Schema Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createSchemaEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Response Definition Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createResponseDefinitionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Parameter Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createParameterEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Example Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createExampleEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Request Body Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createRequestBodyEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Header Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createHeaderEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Security Scheme Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createSecuritySchemeEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Link Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createLinkEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Callback Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createCallbackEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.RequestBody <em>Request Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.RequestBody
	 * @generated
	 */
	public Adapter createRequestBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.link <em>link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.link
	 * @generated
	 */
	public Adapter createlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Callback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Callback
	 * @generated
	 */
	public Adapter createCallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.ServerContainer <em>Server Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.ServerContainer
	 * @generated
	 */
	public Adapter createServerContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.MediaType
	 * @generated
	 */
	public Adapter createMediaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Media Type Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createMediaTypeEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.Encoding
	 * @generated
	 */
	public Adapter createEncodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Encoding Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEncodingEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.openapi3.RuntimeExpression <em>Runtime Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.openapi3.RuntimeExpression
	 * @generated
	 */
	public Adapter createRuntimeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Expression To Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createExpressionToPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Openapi3AdapterFactory
