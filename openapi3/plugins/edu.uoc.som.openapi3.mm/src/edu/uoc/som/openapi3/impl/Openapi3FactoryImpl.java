/**
 */
package edu.uoc.som.openapi3.impl;

import edu.uoc.som.openapi3.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Openapi3FactoryImpl extends EFactoryImpl implements Openapi3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Openapi3Factory init() {
		try {
			Openapi3Factory theOpenapi3Factory = (Openapi3Factory)EPackage.Registry.INSTANCE.getEFactory(Openapi3Package.eNS_URI);
			if (theOpenapi3Factory != null) {
				return theOpenapi3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Openapi3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Openapi3FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Openapi3Package.CONTAINED_COLLECTIONS: return createContainedCollections();
			case Openapi3Package.API: return createAPI();
			case Openapi3Package.INFO: return createInfo();
			case Openapi3Package.CONTACT: return createContact();
			case Openapi3Package.LICENSE: return createLicense();
			case Openapi3Package.PATH: return createPath();
			case Openapi3Package.OPERATION: return createOperation();
			case Openapi3Package.EXTERNAL_DOCS: return createExternalDocs();
			case Openapi3Package.PARAMETER: return createParameter();
			case Openapi3Package.ITEMS_DEFINITION: return createItemsDefinition();
			case Openapi3Package.SCHEMA: return createSchema();
			case Openapi3Package.RESPONSE_DEFINITION: return createResponseDefinition();
			case Openapi3Package.HEADER: return createHeader();
			case Openapi3Package.TAG: return createTag();
			case Openapi3Package.SECURITY_SCHEME: return createSecurityScheme();
			case Openapi3Package.EXAMPLE: return createExample();
			case Openapi3Package.XML_ELEMENT: return createXMLElement();
			case Openapi3Package.SECURITY_SCOPE: return createSecurityScope();
			case Openapi3Package.SECURITY_REQUIREMENT: return createSecurityRequirement();
			case Openapi3Package.PROPERTY: return createProperty();
			case Openapi3Package.RESPONSE: return createResponse();
			case Openapi3Package.SERVER: return createServer();
			case Openapi3Package.SERVER_VARIABLE_ENTRY: return (EObject)createServerVariableEntry();
			case Openapi3Package.SERVER_VARIABLE: return createServerVariable();
			case Openapi3Package.COMPONENTS: return createComponents();
			case Openapi3Package.SCHEMA_ENTRY: return (EObject)createSchemaEntry();
			case Openapi3Package.RESPONSE_DEFINITION_ENTRY: return (EObject)createResponseDefinitionEntry();
			case Openapi3Package.PARAMETER_ENTRY: return (EObject)createParameterEntry();
			case Openapi3Package.EXAMPLE_ENTRY: return (EObject)createExampleEntry();
			case Openapi3Package.REQUEST_BODY_ENTRY: return (EObject)createRequestBodyEntry();
			case Openapi3Package.HEADER_ENTRY: return (EObject)createHeaderEntry();
			case Openapi3Package.SECURITY_SCHEME_ENTRY: return (EObject)createSecuritySchemeEntry();
			case Openapi3Package.LINK_ENTRY: return (EObject)createLinkEntry();
			case Openapi3Package.CALLBACK_ENTRY: return (EObject)createCallbackEntry();
			case Openapi3Package.REQUEST_BODY: return createRequestBody();
			case Openapi3Package.LINK: return createlink();
			case Openapi3Package.CALLBACK: return createCallback();
			case Openapi3Package.SERVER_CONTAINER: return createServerContainer();
			case Openapi3Package.MEDIA_TYPE: return createMediaType();
			case Openapi3Package.MEDIA_TYPE_ENTRY: return (EObject)createMediaTypeEntry();
			case Openapi3Package.ENCODING: return createEncoding();
			case Openapi3Package.ENCODING_ENTRY: return (EObject)createEncodingEntry();
			case Openapi3Package.RUNTIME_EXPRESSION: return createRuntimeExpression();
			case Openapi3Package.EXPRESSION_TO_PATH: return (EObject)createExpressionToPath();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Openapi3Package.SCHEME_TYPE:
				return createSchemeTypeFromString(eDataType, initialValue);
			case Openapi3Package.PARAMETER_LOCATION:
				return createParameterLocationFromString(eDataType, initialValue);
			case Openapi3Package.COLLECTION_FORMAT:
				return createCollectionFormatFromString(eDataType, initialValue);
			case Openapi3Package.OAUTH2_FLOW_TYPE:
				return createOAuth2FlowTypeFromString(eDataType, initialValue);
			case Openapi3Package.API_KEY_LOCATION:
				return createAPIKeyLocationFromString(eDataType, initialValue);
			case Openapi3Package.SECURITY_SCHEME_TYPE:
				return createSecuritySchemeTypeFromString(eDataType, initialValue);
			case Openapi3Package.JSON_DATA_TYPE:
				return createJSONDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Openapi3Package.SCHEME_TYPE:
				return convertSchemeTypeToString(eDataType, instanceValue);
			case Openapi3Package.PARAMETER_LOCATION:
				return convertParameterLocationToString(eDataType, instanceValue);
			case Openapi3Package.COLLECTION_FORMAT:
				return convertCollectionFormatToString(eDataType, instanceValue);
			case Openapi3Package.OAUTH2_FLOW_TYPE:
				return convertOAuth2FlowTypeToString(eDataType, instanceValue);
			case Openapi3Package.API_KEY_LOCATION:
				return convertAPIKeyLocationToString(eDataType, instanceValue);
			case Openapi3Package.SECURITY_SCHEME_TYPE:
				return convertSecuritySchemeTypeToString(eDataType, instanceValue);
			case Openapi3Package.JSON_DATA_TYPE:
				return convertJSONDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainedCollections createContainedCollections() {
		ContainedCollectionsImpl containedCollections = new ContainedCollectionsImpl();
		return containedCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public API createAPI() {
		APIImpl api = new APIImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Info createInfo() {
		InfoImpl info = new InfoImpl();
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public License createLicense() {
		LicenseImpl license = new LicenseImpl();
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalDocs createExternalDocs() {
		ExternalDocsImpl externalDocs = new ExternalDocsImpl();
		return externalDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemsDefinition createItemsDefinition() {
		ItemsDefinitionImpl itemsDefinition = new ItemsDefinitionImpl();
		return itemsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseDefinition createResponseDefinition() {
		ResponseDefinitionImpl responseDefinition = new ResponseDefinitionImpl();
		return responseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityScheme createSecurityScheme() {
		SecuritySchemeImpl securityScheme = new SecuritySchemeImpl();
		return securityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Example createExample() {
		ExampleImpl example = new ExampleImpl();
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLElement createXMLElement() {
		XMLElementImpl xmlElement = new XMLElementImpl();
		return xmlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityScope createSecurityScope() {
		SecurityScopeImpl securityScope = new SecurityScopeImpl();
		return securityScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityRequirement createSecurityRequirement() {
		SecurityRequirementImpl securityRequirement = new SecurityRequirementImpl();
		return securityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, ServerVariable> createServerVariableEntry() {
		ServerVariableEntryImpl serverVariableEntry = new ServerVariableEntryImpl();
		return serverVariableEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerVariable createServerVariable() {
		ServerVariableImpl serverVariable = new ServerVariableImpl();
		return serverVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Components createComponents() {
		ComponentsImpl components = new ComponentsImpl();
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Schema> createSchemaEntry() {
		SchemaEntryImpl schemaEntry = new SchemaEntryImpl();
		return schemaEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, ResponseDefinition> createResponseDefinitionEntry() {
		ResponseDefinitionEntryImpl responseDefinitionEntry = new ResponseDefinitionEntryImpl();
		return responseDefinitionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Parameter> createParameterEntry() {
		ParameterEntryImpl parameterEntry = new ParameterEntryImpl();
		return parameterEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Example> createExampleEntry() {
		ExampleEntryImpl exampleEntry = new ExampleEntryImpl();
		return exampleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, RequestBody> createRequestBodyEntry() {
		RequestBodyEntryImpl requestBodyEntry = new RequestBodyEntryImpl();
		return requestBodyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Header> createHeaderEntry() {
		HeaderEntryImpl headerEntry = new HeaderEntryImpl();
		return headerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, SecurityScheme> createSecuritySchemeEntry() {
		SecuritySchemeEntryImpl securitySchemeEntry = new SecuritySchemeEntryImpl();
		return securitySchemeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, link> createLinkEntry() {
		LinkEntryImpl linkEntry = new LinkEntryImpl();
		return linkEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Callback> createCallbackEntry() {
		CallbackEntryImpl callbackEntry = new CallbackEntryImpl();
		return callbackEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestBody createRequestBody() {
		RequestBodyImpl requestBody = new RequestBodyImpl();
		return requestBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public link createlink() {
		linkImpl link = new linkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Callback createCallback() {
		CallbackImpl callback = new CallbackImpl();
		return callback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerContainer createServerContainer() {
		ServerContainerImpl serverContainer = new ServerContainerImpl();
		return serverContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MediaType createMediaType() {
		MediaTypeImpl mediaType = new MediaTypeImpl();
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, MediaType> createMediaTypeEntry() {
		MediaTypeEntryImpl mediaTypeEntry = new MediaTypeEntryImpl();
		return mediaTypeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Encoding createEncoding() {
		EncodingImpl encoding = new EncodingImpl();
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Encoding> createEncodingEntry() {
		EncodingEntryImpl encodingEntry = new EncodingEntryImpl();
		return encodingEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeExpression createRuntimeExpression() {
		RuntimeExpressionImpl runtimeExpression = new RuntimeExpressionImpl();
		return runtimeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Path> createExpressionToPath() {
		ExpressionToPathImpl expressionToPath = new ExpressionToPathImpl();
		return expressionToPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemeType createSchemeTypeFromString(EDataType eDataType, String initialValue) {
		SchemeType result = SchemeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLocation createParameterLocationFromString(EDataType eDataType, String initialValue) {
		ParameterLocation result = ParameterLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFormat createCollectionFormatFromString(EDataType eDataType, String initialValue) {
		CollectionFormat result = CollectionFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuth2FlowType createOAuth2FlowTypeFromString(EDataType eDataType, String initialValue) {
		OAuth2FlowType result = OAuth2FlowType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOAuth2FlowTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIKeyLocation createAPIKeyLocationFromString(EDataType eDataType, String initialValue) {
		APIKeyLocation result = APIKeyLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAPIKeyLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySchemeType createSecuritySchemeTypeFromString(EDataType eDataType, String initialValue) {
		SecuritySchemeType result = SecuritySchemeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecuritySchemeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONDataType createJSONDataTypeFromString(EDataType eDataType, String initialValue) {
		JSONDataType result = JSONDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJSONDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Openapi3Package getOpenapi3Package() {
		return (Openapi3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Openapi3Package getPackage() {
		return Openapi3Package.eINSTANCE;
	}

} //Openapi3FactoryImpl
