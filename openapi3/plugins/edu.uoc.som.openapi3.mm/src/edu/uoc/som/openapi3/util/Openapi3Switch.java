/**
 */
package edu.uoc.som.openapi3.util;

import edu.uoc.som.openapi3.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.openapi3.Openapi3Package
 * @generated
 */
public class Openapi3Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Openapi3Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Openapi3Switch() {
		if (modelPackage == null) {
			modelPackage = Openapi3Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Openapi3Package.JSON_SCHEMA_SUBSET: {
				JSONSchemaSubset jsonSchemaSubset = (JSONSchemaSubset)theEObject;
				T result = caseJSONSchemaSubset(jsonSchemaSubset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.CONTAINED_COLLECTIONS: {
				ContainedCollections containedCollections = (ContainedCollections)theEObject;
				T result = caseContainedCollections(containedCollections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.API: {
				API api = (API)theEObject;
				T result = caseAPI(api);
				if (result == null) result = caseParameterContainer(api);
				if (result == null) result = caseSchemaContainer(api);
				if (result == null) result = caseParameterContext(api);
				if (result == null) result = caseExternalDocsContext(api);
				if (result == null) result = caseResponseContainer(api);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.INFO: {
				Info info = (Info)theEObject;
				T result = caseInfo(info);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.CONTACT: {
				Contact contact = (Contact)theEObject;
				T result = caseContact(contact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.LICENSE: {
				License license = (License)theEObject;
				T result = caseLicense(license);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.PATH: {
				Path path = (Path)theEObject;
				T result = casePath(path);
				if (result == null) result = caseParameterContainer(path);
				if (result == null) result = caseParameterContext(path);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseParameterContainer(operation);
				if (result == null) result = caseParameterContext(operation);
				if (result == null) result = caseExternalDocsContext(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.EXTERNAL_DOCS: {
				ExternalDocs externalDocs = (ExternalDocs)theEObject;
				T result = caseExternalDocs(externalDocs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseSchemaContainer(parameter);
				if (result == null) result = caseJSONSchemaSubset(parameter);
				if (result == null) result = caseArrayContext(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.ITEMS_DEFINITION: {
				ItemsDefinition itemsDefinition = (ItemsDefinition)theEObject;
				T result = caseItemsDefinition(itemsDefinition);
				if (result == null) result = caseJSONSchemaSubset(itemsDefinition);
				if (result == null) result = caseArrayContext(itemsDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = caseJSONSchemaSubset(schema);
				if (result == null) result = caseSchemaContainer(schema);
				if (result == null) result = caseExternalDocsContext(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.RESPONSE_DEFINITION: {
				ResponseDefinition responseDefinition = (ResponseDefinition)theEObject;
				T result = caseResponseDefinition(responseDefinition);
				if (result == null) result = caseSchemaContainer(responseDefinition);
				if (result == null) result = caseSchemaContext(responseDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = caseJSONSchemaSubset(header);
				if (result == null) result = caseArrayContext(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseExternalDocsContext(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.SECURITY_SCHEME: {
				SecurityScheme securityScheme = (SecurityScheme)theEObject;
				T result = caseSecurityScheme(securityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.EXAMPLE: {
				Example example = (Example)theEObject;
				T result = caseExample(example);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.XML_ELEMENT: {
				XMLElement xmlElement = (XMLElement)theEObject;
				T result = caseXMLElement(xmlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.SECURITY_SCOPE: {
				SecurityScope securityScope = (SecurityScope)theEObject;
				T result = caseSecurityScope(securityScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.PARAMETER_CONTAINER: {
				ParameterContainer parameterContainer = (ParameterContainer)theEObject;
				T result = caseParameterContainer(parameterContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.SCHEMA_CONTAINER: {
				SchemaContainer schemaContainer = (SchemaContainer)theEObject;
				T result = caseSchemaContainer(schemaContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.RESPONSE_CONTAINER: {
				ResponseContainer responseContainer = (ResponseContainer)theEObject;
				T result = caseResponseContainer(responseContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.PARAMETER_CONTEXT: {
				ParameterContext parameterContext = (ParameterContext)theEObject;
				T result = caseParameterContext(parameterContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.SCHEMA_CONTEXT: {
				SchemaContext schemaContext = (SchemaContext)theEObject;
				T result = caseSchemaContext(schemaContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.EXTERNAL_DOCS_CONTEXT: {
				ExternalDocsContext externalDocsContext = (ExternalDocsContext)theEObject;
				T result = caseExternalDocsContext(externalDocsContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.ARRAY_CONTEXT: {
				ArrayContext arrayContext = (ArrayContext)theEObject;
				T result = caseArrayContext(arrayContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.SECURITY_REQUIREMENT: {
				SecurityRequirement securityRequirement = (SecurityRequirement)theEObject;
				T result = caseSecurityRequirement(securityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseSchemaContext(property);
				if (result == null) result = caseSchemaContainer(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = caseResponseContainer(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.SERVER_VARIABLE_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, ServerVariable> serverVariableEntry = (Map.Entry<String, ServerVariable>)theEObject;
				T result = caseServerVariableEntry(serverVariableEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.SERVER_VARIABLE: {
				ServerVariable serverVariable = (ServerVariable)theEObject;
				T result = caseServerVariable(serverVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.COMPONENTS: {
				Components components = (Components)theEObject;
				T result = caseComponents(components);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.SCHEMA_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Schema> schemaEntry = (Map.Entry<String, Schema>)theEObject;
				T result = caseSchemaEntry(schemaEntry);
				if (result == null) result = caseSchemaContainer((SchemaContainer)schemaEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.RESPONSE_DEFINITION_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, ResponseDefinition> responseDefinitionEntry = (Map.Entry<String, ResponseDefinition>)theEObject;
				T result = caseResponseDefinitionEntry(responseDefinitionEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.PARAMETER_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Parameter> parameterEntry = (Map.Entry<String, Parameter>)theEObject;
				T result = caseParameterEntry(parameterEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.EXAMPLE_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Example> exampleEntry = (Map.Entry<String, Example>)theEObject;
				T result = caseExampleEntry(exampleEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.REQUEST_BODY_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, RequestBody> requestBodyEntry = (Map.Entry<String, RequestBody>)theEObject;
				T result = caseRequestBodyEntry(requestBodyEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.HEADER_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Header> headerEntry = (Map.Entry<String, Header>)theEObject;
				T result = caseHeaderEntry(headerEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.SECURITY_SCHEME_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, SecurityScheme> securitySchemeEntry = (Map.Entry<String, SecurityScheme>)theEObject;
				T result = caseSecuritySchemeEntry(securitySchemeEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.LINK_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, link> linkEntry = (Map.Entry<String, link>)theEObject;
				T result = caseLinkEntry(linkEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.CALLBACK_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Callback> callbackEntry = (Map.Entry<String, Callback>)theEObject;
				T result = caseCallbackEntry(callbackEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.REQUEST_BODY: {
				RequestBody requestBody = (RequestBody)theEObject;
				T result = caseRequestBody(requestBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.LINK: {
				link link = (link)theEObject;
				T result = caselink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.CALLBACK: {
				Callback callback = (Callback)theEObject;
				T result = caseCallback(callback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.SERVER_CONTAINER: {
				ServerContainer serverContainer = (ServerContainer)theEObject;
				T result = caseServerContainer(serverContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.MEDIA_TYPE: {
				MediaType mediaType = (MediaType)theEObject;
				T result = caseMediaType(mediaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.MEDIA_TYPE_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, MediaType> mediaTypeEntry = (Map.Entry<String, MediaType>)theEObject;
				T result = caseMediaTypeEntry(mediaTypeEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.ENCODING: {
				Encoding encoding = (Encoding)theEObject;
				T result = caseEncoding(encoding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.ENCODING_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Encoding> encodingEntry = (Map.Entry<String, Encoding>)theEObject;
				T result = caseEncodingEntry(encodingEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.RUNTIME_EXPRESSION: {
				RuntimeExpression runtimeExpression = (RuntimeExpression)theEObject;
				T result = caseRuntimeExpression(runtimeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Openapi3Package.EXPRESSION_TO_PATH: {
				@SuppressWarnings("unchecked") Map.Entry<String, Path> expressionToPath = (Map.Entry<String, Path>)theEObject;
				T result = caseExpressionToPath(expressionToPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Schema Subset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Schema Subset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONSchemaSubset(JSONSchemaSubset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contained Collections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contained Collections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainedCollections(ContainedCollections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPI(API object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfo(Info object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContact(Contact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>License</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>License</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicense(License object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Docs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Docs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDocs(ExternalDocs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Items Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Items Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemsDefinition(ItemsDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseDefinition(ResponseDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityScheme(SecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExample(Example object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLElement(XMLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityScope(SecurityScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterContainer(ParameterContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaContainer(SchemaContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseContainer(ResponseContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterContext(ParameterContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaContext(SchemaContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Docs Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Docs Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDocsContext(ExternalDocsContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayContext(ArrayContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRequirement(SecurityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Variable Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Variable Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerVariableEntry(Map.Entry<String, ServerVariable> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerVariable(ServerVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponents(Components object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaEntry(Map.Entry<String, Schema> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Definition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Definition Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseDefinitionEntry(Map.Entry<String, ResponseDefinition> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterEntry(Map.Entry<String, Parameter> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleEntry(Map.Entry<String, Example> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Body Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Body Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestBodyEntry(Map.Entry<String, RequestBody> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderEntry(Map.Entry<String, Header> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Scheme Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Scheme Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecuritySchemeEntry(Map.Entry<String, SecurityScheme> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEntry(Map.Entry<String, link> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callback Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callback Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallbackEntry(Map.Entry<String, Callback> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestBody(RequestBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselink(link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallback(Callback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerContainer(ServerContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaType(MediaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Type Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Type Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaTypeEntry(Map.Entry<String, MediaType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncoding(Encoding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoding Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoding Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncodingEntry(Map.Entry<String, Encoding> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeExpression(RuntimeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression To Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression To Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionToPath(Map.Entry<String, Path> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Openapi3Switch
