/**
 */
package edu.uoc.som.openapi2.util;

import edu.uoc.som.openapi2.*;

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
 * @see edu.uoc.som.openapi2.OpenAPI2Package
 * @generated
 */
public class OpenAPI2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenAPI2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAPI2Switch() {
		if (modelPackage == null) {
			modelPackage = OpenAPI2Package.eINSTANCE;
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
			case OpenAPI2Package.JSON_SCHEMA_SUBSET: {
				JSONSchemaSubset jsonSchemaSubset = (JSONSchemaSubset)theEObject;
				T result = caseJSONSchemaSubset(jsonSchemaSubset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.CONTAINED_COLLECTIONS: {
				ContainedCollections containedCollections = (ContainedCollections)theEObject;
				T result = caseContainedCollections(containedCollections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.API: {
				API api = (API)theEObject;
				T result = caseAPI(api);
				if (result == null) result = caseExternalDocsContainer(api);
				if (result == null) result = caseSecurityContainer(api);
				if (result == null) result = caseParameterContainer(api);
				if (result == null) result = caseResponseContainer(api);
				if (result == null) result = caseSchemaContainer(api);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.INFO: {
				Info info = (Info)theEObject;
				T result = caseInfo(info);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.CONTACT: {
				Contact contact = (Contact)theEObject;
				T result = caseContact(contact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.LICENSE: {
				License license = (License)theEObject;
				T result = caseLicense(license);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.PATH: {
				Path path = (Path)theEObject;
				T result = casePath(path);
				if (result == null) result = caseParameterContainer(path);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseParameterContainer(operation);
				if (result == null) result = caseExternalDocsContainer(operation);
				if (result == null) result = caseSecurityContainer(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.EXTERNAL_DOCS: {
				ExternalDocs externalDocs = (ExternalDocs)theEObject;
				T result = caseExternalDocs(externalDocs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseSchemaContainer(parameter);
				if (result == null) result = caseJSONSchemaSubset(parameter);
				if (result == null) result = caseArrayContainer(parameter);
				if (result == null) result = caseJSONPointer(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.ITEMS_DEFINITION: {
				ItemsDefinition itemsDefinition = (ItemsDefinition)theEObject;
				T result = caseItemsDefinition(itemsDefinition);
				if (result == null) result = caseJSONSchemaSubset(itemsDefinition);
				if (result == null) result = caseArrayContainer(itemsDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = caseJSONSchemaSubset(schema);
				if (result == null) result = caseSchemaContainer(schema);
				if (result == null) result = caseExternalDocsContainer(schema);
				if (result == null) result = caseJSONPointer(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = caseSchemaContainer(response);
				if (result == null) result = caseJSONPointer(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = caseJSONSchemaSubset(header);
				if (result == null) result = caseArrayContainer(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseExternalDocsContainer(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.SECURITY_SCHEME: {
				SecurityScheme securityScheme = (SecurityScheme)theEObject;
				T result = caseSecurityScheme(securityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.EXAMPLE: {
				Example example = (Example)theEObject;
				T result = caseExample(example);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.XML_ELEMENT: {
				XMLElement xmlElement = (XMLElement)theEObject;
				T result = caseXMLElement(xmlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.SECURITY_SCOPE: {
				SecurityScope securityScope = (SecurityScope)theEObject;
				T result = caseSecurityScope(securityScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.PARAMETER_CONTAINER: {
				ParameterContainer parameterContainer = (ParameterContainer)theEObject;
				T result = caseParameterContainer(parameterContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.SCHEMA_CONTAINER: {
				SchemaContainer schemaContainer = (SchemaContainer)theEObject;
				T result = caseSchemaContainer(schemaContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.RESPONSE_CONTAINER: {
				ResponseContainer responseContainer = (ResponseContainer)theEObject;
				T result = caseResponseContainer(responseContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.EXTERNAL_DOCS_CONTAINER: {
				ExternalDocsContainer externalDocsContainer = (ExternalDocsContainer)theEObject;
				T result = caseExternalDocsContainer(externalDocsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.ARRAY_CONTAINER: {
				ArrayContainer arrayContainer = (ArrayContainer)theEObject;
				T result = caseArrayContainer(arrayContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.SECURITY_REQUIREMENT: {
				SecurityRequirement securityRequirement = (SecurityRequirement)theEObject;
				T result = caseSecurityRequirement(securityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.JSON_POINTER: {
				JSONPointer jsonPointer = (JSONPointer)theEObject;
				T result = caseJSONPointer(jsonPointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseJSONPointer(property);
				if (result == null) result = caseSchemaContainer(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.RESPONSE_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Response> responseEntry = (Map.Entry<String, Response>)theEObject;
				T result = caseResponseEntry(responseEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.SCHEMA_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Schema> schemaEntry = (Map.Entry<String, Schema>)theEObject;
				T result = caseSchemaEntry(schemaEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.RESPONSE_DEFINITION_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Response> responseDefinitionEntry = (Map.Entry<String, Response>)theEObject;
				T result = caseResponseDefinitionEntry(responseDefinitionEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.PARAMETER_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Parameter> parameterEntry = (Map.Entry<String, Parameter>)theEObject;
				T result = caseParameterEntry(parameterEntry);
				if (result == null) result = caseParameterContainer((ParameterContainer)parameterEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.SECURITY_CONTAINER: {
				SecurityContainer securityContainer = (SecurityContainer)theEObject;
				T result = caseSecurityContainer(securityContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenAPI2Package.SECURITY_SCHEME_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, SecurityScheme> securitySchemeEntry = (Map.Entry<String, SecurityScheme>)theEObject;
				T result = caseSecuritySchemeEntry(securitySchemeEntry);
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
	 * Returns the result of interpreting the object as an instance of '<em>External Docs Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Docs Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDocsContainer(ExternalDocsContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayContainer(ArrayContainer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>JSON Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONPointer(JSONPointer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Response Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseEntry(Map.Entry<String, Response> object) {
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
	public T caseResponseDefinitionEntry(Map.Entry<String, Response> object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Security Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityContainer(SecurityContainer object) {
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

} //OpenAPI2Switch
