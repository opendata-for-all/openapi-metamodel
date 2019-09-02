package edu.uoc.som.openapi2.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.IOUtils;

import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import edu.uoc.som.openapi2.API;
import edu.uoc.som.openapi2.APIKeyLocation;
import edu.uoc.som.openapi2.CollectionFormat;
import edu.uoc.som.openapi2.Contact;
import edu.uoc.som.openapi2.Example;
import edu.uoc.som.openapi2.ExtendedOpenAPI2Factory;
import edu.uoc.som.openapi2.ExternalDocs;
import edu.uoc.som.openapi2.Header;
import edu.uoc.som.openapi2.Info;
import edu.uoc.som.openapi2.ItemsDefinition;
import edu.uoc.som.openapi2.JSONDataType;
import edu.uoc.som.openapi2.License;
import edu.uoc.som.openapi2.OAuth2FlowType;
import edu.uoc.som.openapi2.OpenAPI2Package;
import edu.uoc.som.openapi2.Operation;
import edu.uoc.som.openapi2.Parameter;
import edu.uoc.som.openapi2.ParameterLocation;
import edu.uoc.som.openapi2.Path;
import edu.uoc.som.openapi2.Property;
import edu.uoc.som.openapi2.RequiredSecurityScheme;
import edu.uoc.som.openapi2.Response;
import edu.uoc.som.openapi2.Schema;
import edu.uoc.som.openapi2.SchemeType;
import edu.uoc.som.openapi2.SecurityRequirement;
import edu.uoc.som.openapi2.SecurityScheme;
import edu.uoc.som.openapi2.SecuritySchemeType;
import edu.uoc.som.openapi2.SecurityScope;
import edu.uoc.som.openapi2.Tag;
import edu.uoc.som.openapi2.XMLElement;
import edu.uoc.som.openapi2.impl.ExtendedOpenAPI2FactoryImpl;
import edu.uoc.som.openapi2.impl.ParameterEntryImpl;
import edu.uoc.som.openapi2.impl.ResponseDefinitionEntryImpl;
import edu.uoc.som.openapi2.impl.SchemaEntryImpl;
import edu.uoc.som.openapi2.io.exceptions.OpenAPIProcessingException;
import edu.uoc.som.openapi2.io.exceptions.OpenAPIValidationException;
import edu.uoc.som.openapi2.io.model.OpenAPIValidationReport;
import edu.uoc.som.openapi2.io.model.SerializationFormat;
import edu.uoc.som.openapi2.io.utils.Utils;

public class OpenAPI2Importer {

	private API openAPI2Model;
	ExtendedOpenAPI2FactoryImpl factory = (ExtendedOpenAPI2FactoryImpl) ExtendedOpenAPI2Factory.eINSTANCE;
	private Map<Property, String> propertiesToResolve;
	private Map<Schema, String> additionalPropertiesToResolve;
	private Map<Schema, String> itemsToResolve;
	private Map<Schema, Map<Integer, String>> allOfToResolve;

	public OpenAPI2Importer() {
		openAPI2Model = factory.createAPI();
		propertiesToResolve = new HashMap<Property, String>();
		additionalPropertiesToResolve = new HashMap<Schema, String>();
		itemsToResolve = new HashMap<Schema, String>();
		allOfToResolve = new HashMap<Schema, Map<Integer, String>>();

	}

	public API createOpenAPI2ModelFromFile(File inputFile, SerializationFormat serializationFormat)
			throws IOException, OpenAPIValidationException, OpenAPIProcessingException {

		InputStream in = new FileInputStream(inputFile);
		Reader reader = new InputStreamReader(in, "UTF-8");
		if (serializationFormat == null || serializationFormat.equals(SerializationFormat.JSON)) {
			JsonParser parser = new JsonParser();
			JsonElement jsonElement = parser.parse(reader);
			openAPI2Model = createOpenAPIModelFromJson(jsonElement.getAsJsonObject());
		} else {
			String yamlSring = IOUtils.toString(reader);
			openAPI2Model = createOpenAPIModelFromYaml(yamlSring);
		}
		reader.close();
		return openAPI2Model;

	}

	public API createOpenAPI2ModelFromText(String text, SerializationFormat serializationFormat)
			throws IOException, OpenAPIValidationException, OpenAPIProcessingException {

		if (serializationFormat == null || serializationFormat.equals(SerializationFormat.JSON)) {

			JsonElement jsonElement;
			JsonParser parser = new JsonParser();
			jsonElement = parser.parse(text);
			openAPI2Model = createOpenAPIModelFromJson(jsonElement.getAsJsonObject());
		} else {
			openAPI2Model = createOpenAPIModelFromYaml(text);
		}
		return openAPI2Model;

	}

	private API createOpenAPIModelFromYaml(String yamlSring)
			throws IOException, OpenAPIValidationException, OpenAPIProcessingException {

		JsonElement jsonObject = Utils.convertYamlToGson(yamlSring);
		OpenAPIValidationReport report;

		try {

			OpenAPIValidator openAPIValidator = new OpenAPIValidator();
			report = openAPIValidator.validate(jsonObject.toString());
		} catch (ProcessingException e) {
			throw new OpenAPIProcessingException(e.getProcessingMessage().getMessage());
		}
		if (!report.isSuccess()) {
			throw new OpenAPIValidationException("Invalid OpenAPI definition\n" + report.getError());
		}
		openAPI2Model = createOpenAPIModelFromJson(jsonObject.getAsJsonObject());
		return openAPI2Model;

	}

	private API createOpenAPIModelFromJson(JsonObject jsonObject)
			throws IOException, OpenAPIValidationException, OpenAPIProcessingException {
		OpenAPIValidator openAPIValidator;
		try {
			openAPIValidator = new OpenAPIValidator();
			OpenAPIValidationReport report = openAPIValidator.validate(jsonObject.toString());
			if (!report.isSuccess()) {
				throw new OpenAPIValidationException("Invalid OpenAPI definition\n" + report.getError());
			}
		} catch (ProcessingException e) {
			throw new OpenAPIProcessingException(e.getProcessingMessage().getMessage());
		}

		openAPI2Model = factory.createAPI();
		openAPI2Model.setContainedCollections(ExtendedOpenAPI2Factory.eINSTANCE.createContainedCollections());
		if (jsonObject.has("info")) {
			Info info = ExtendedOpenAPI2Factory.eINSTANCE.createInfo();
			openAPI2Model.setInfo(info);
			importInfo(jsonObject.get("info"), info);
		}
		if (jsonObject.has("host"))
			openAPI2Model.setHost(jsonObject.get("host").getAsString());

		if (jsonObject.has("basePath"))
			openAPI2Model.setBasePath(jsonObject.get("basePath").getAsString());
		if (jsonObject.has("schemes")) {
			JsonArray schemes = jsonObject.get("schemes").getAsJsonArray();
			for (JsonElement scheme : schemes) {
				openAPI2Model.getSchemes().add(SchemeType.get(scheme.getAsString()));
			}
		}
		if (jsonObject.has("consumes")) {
			JsonArray mimeTypes = jsonObject.get("consumes").getAsJsonArray();
			for (JsonElement mimeType : mimeTypes) {
				openAPI2Model.getConsumes().add(mimeType.getAsString());
			}
		}

		if (jsonObject.has("produces")) {
			JsonArray mimeTypes = jsonObject.get("produces").getAsJsonArray();
			for (JsonElement mimeType : mimeTypes) {
				openAPI2Model.getProduces().add(mimeType.getAsString());
			}
		}
		if (jsonObject.has("definitions")) {
			importDefinitions(jsonObject.get("definitions"));
			resolveRefs();
		}
		if (jsonObject.has("securityDefinitions")) {
			importSecurityDefinitions(jsonObject.get("securityDefinitions"));
		}
		if (jsonObject.has("responses")) {
			importResponses(jsonObject.get("responses"));
		}
		if (jsonObject.has("parameters")) {
			importParameters(jsonObject.get("parameters"));
		}

		if (jsonObject.has("paths")) {
			importPaths(jsonObject.get("paths"));
		}

		if (jsonObject.has("security")) {
			importSecurity(jsonObject.get("security"));
		}
		if (jsonObject.has("tags")) {
			importTags(jsonObject.get("tags"));
		}
		if (jsonObject.has("externalDocs")) {
			ExternalDocs externalDocs = ExtendedOpenAPI2Factory.eINSTANCE.createExternalDocs();
			openAPI2Model.setExternalDocs(externalDocs);
			importExternalDocs(jsonObject.get("externalDocs"), externalDocs);
		}
		return openAPI2Model;

	}

	private void importTags(JsonElement jsonElement) {
		JsonArray tagArray = jsonElement.getAsJsonArray();
		for (JsonElement tagElement : tagArray) {
			Tag tag = ExtendedOpenAPI2Factory.eINSTANCE.createTag();
			openAPI2Model.getTags().add(tag);
			importTag(tagElement, tag);
		}

	}

	private void importTag(JsonElement tagElement, Tag tag) {
		JsonObject tagObject = tagElement.getAsJsonObject();
		if (tagObject.has("name"))
			tag.setName(tagObject.get("name").getAsString());
		if (tagObject.has("description"))
			tag.setDescription(tagObject.get("description").getAsString());
		if (tagObject.has("externalDocs")) {
			ExternalDocs externalDocs = ExtendedOpenAPI2Factory.eINSTANCE.createExternalDocs();
			tag.setExternalDocs(externalDocs);
			importExternalDocs(tagObject.get("externalDocs"), externalDocs);
		}

	}

	private void importSecurity(JsonElement jsonElement) {
		JsonArray securityArray = jsonElement.getAsJsonArray();
		for (JsonElement securityElement : securityArray) {
			SecurityRequirement security = ExtendedOpenAPI2Factory.eINSTANCE.createSecurityRequirement();
			openAPI2Model.getSecurity().add(security);
			importSecurityRequirement(securityElement, security);
		}

	}

	private void importParameters(JsonElement jsonElement) {
		JsonObject aPIParametersObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> aPIParameters = aPIParametersObject.entrySet();
		for (Entry<String, JsonElement> aPIParameterElement : aPIParameters) {
			Parameter parameter = ExtendedOpenAPI2Factory.eINSTANCE.createParameter();
			ParameterEntryImpl parameterEntry = (ParameterEntryImpl) factory
					.create(OpenAPI2Package.Literals.PARAMETER_ENTRY);
			parameterEntry.setKey(aPIParameterElement.getKey());
			parameterEntry.setValue(parameter);
			openAPI2Model.getParameters().add(parameterEntry);
//			openAPI2Model.getParameters().put(aPIParameterElement.getKey(), parameter);
			parameter.setDeclaringContext(parameterEntry);
			openAPI2Model.getContainedCollections().getParamters().add(parameter);
			importParameter(aPIParameterElement.getValue(), parameter);
		}

	}

	private void importSecurityDefinitions(JsonElement jsonElement) {
		JsonObject securityDefinitionsObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> securityDefinitions = securityDefinitionsObject.entrySet();
		for (Entry<String, JsonElement> securityDefinitionElement : securityDefinitions) {
			SecurityScheme securityDefinition = ExtendedOpenAPI2Factory.eINSTANCE.createSecurityScheme();
			openAPI2Model.getSecurityDefinitions().put(securityDefinitionElement.getKey(), securityDefinition);
			importSecurityScheme(securityDefinitionElement.getValue(), securityDefinition);
		}

	}

	private void importSecurityScheme(JsonElement jsonElement, SecurityScheme securitySchema) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if (jsonObject.has("type"))
			securitySchema.setType(SecuritySchemeType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("description"))
			securitySchema.setDescription(jsonObject.get("description").getAsString());
		if (jsonObject.has("name"))
			securitySchema.setName(jsonObject.get("name").getAsString());
		if (jsonObject.has("in"))
			securitySchema.setLocation(APIKeyLocation.get(jsonObject.get("in").getAsString()));
		if (jsonObject.has("flow"))
			securitySchema.setFlow(OAuth2FlowType.get(jsonObject.get("flow").getAsString()));
		if (jsonObject.has("authorizationUrl"))
			securitySchema.setAuthorizationUrl(jsonObject.get("authorizationUrl").getAsString());
		if (jsonObject.has("tokenUrl"))
			securitySchema.setTokenUrl(jsonObject.get("tokenUrl").getAsString());
		if (jsonObject.has("scopes")) {
			Set<Entry<String, JsonElement>> scopesElements = jsonObject.get("scopes").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> scopeElement : scopesElements) {
				SecurityScope scope = ExtendedOpenAPI2Factory.eINSTANCE.createSecurityScope();
				securitySchema.getScopes().add(scope);

				scope.setName(scopeElement.getKey());

				scope.setDescription(scopeElement.getValue().getAsString());
			}
		}

	}

	private void importResponses(JsonElement jsonElement) {
		JsonObject responsesObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> responses = responsesObject.entrySet();
		for (Entry<String, JsonElement> responseElement : responses) {
			Response responseDefinition = ExtendedOpenAPI2Factory.eINSTANCE.createResponse();
			ResponseDefinitionEntryImpl responseDefinitionEntry = (ResponseDefinitionEntryImpl) factory
					.create(OpenAPI2Package.Literals.RESPONSE_DEFINITION_ENTRY);
			responseDefinitionEntry.setKey(responseElement.getKey());
			responseDefinitionEntry.setValue(responseDefinition);
			openAPI2Model.getResponses().add(responseDefinitionEntry);
			responseDefinition.setDeclaringContext(responseDefinitionEntry);
			openAPI2Model.getContainedCollections().getResponses().add(responseDefinition);
			importResponse(responseElement.getValue(), responseDefinition);
		}
	}

	private void importDefinitions(JsonElement jsonElement) {
		JsonObject definitionsObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> definitions = definitionsObject.entrySet();
		for (Entry<String, JsonElement> definitionElement : definitions) {
			Schema schema = ExtendedOpenAPI2Factory.eINSTANCE.createSchema();
			SchemaEntryImpl schemaEntry = (SchemaEntryImpl) factory.create(OpenAPI2Package.Literals.SCHEMA_ENTRY);
			schemaEntry.setKey(definitionElement.getKey());
			schemaEntry.setValue(schema);
			openAPI2Model.getDefinitions().add(schemaEntry);
			openAPI2Model.getContainedCollections().getSchemas().add(schema);
			schema.setDeclaringContext(schemaEntry);
			importSchema(definitionElement.getValue().getAsJsonObject(), schema);
		}

	}

	private void importSchema(JsonObject schemaObject, Schema schema) {
		if (schemaObject.has("format"))
			schema.setFormat(schemaObject.get("format").getAsString());
		if (schemaObject.has("description"))
			schema.setDescription(schemaObject.get("description").getAsString());
		if (schemaObject.has("title"))
			schema.setTitle(schemaObject.get("title").getAsString());
		if (schemaObject.has("type"))
			schema.setType(JSONDataType.get(schemaObject.get("type").getAsString()));
		if (schemaObject.has("default"))
			schema.setDefault(schemaObject.get("default").toString());
		if (schemaObject.has("maximum"))
			schema.setMaximum(schemaObject.get("maximum").getAsDouble());
		if (schemaObject.has("exclusiveMaximum"))
			schema.setExclusiveMaximum(schemaObject.get("exclusiveMaximum").getAsBoolean());
		if (schemaObject.has("minimum"))
			schema.setMinimum(schemaObject.get("minimum").getAsDouble());
		if (schemaObject.has("exclusiveMinimum"))
			schema.setExclusiveMinimum(schemaObject.get("exclusiveMinimum").getAsBoolean());
		if (schemaObject.has("maxLength"))
			schema.setMaxLength(schemaObject.get("maxLength").getAsInt());
		if (schemaObject.has("minLength"))
			schema.setMinLength(schemaObject.get("minLength").getAsInt());
		if (schemaObject.has("pattern"))
			schema.setPattern(schemaObject.get("pattern").getAsString());
		if (schemaObject.has("maxItems"))
			schema.setMaxItems(schemaObject.get("maxItems").getAsInt());
		if (schemaObject.has("minItems"))
			schema.setMinItems(schemaObject.get("minItems").getAsInt());
		if (schemaObject.has("uniqueItems"))
			schema.setUniqueItems(schemaObject.get("uniqueItems").getAsBoolean());
		if (schemaObject.has("enum")) {
			JsonArray enumItems = schemaObject.get("enum").getAsJsonArray();
			for (JsonElement item : enumItems)
				schema.getEnum().add(item.getAsString());
		}
		if (schemaObject.has("multipleOf"))
			schema.setMultipleOf(Double.valueOf(schemaObject.get("multipleOf").getAsDouble()));
		if (schemaObject.has("maxProperties"))
			schema.setMaxProperties(schemaObject.get("maxProperties").getAsInt());
		if (schemaObject.has("minProperties"))
			schema.setMinProperties(schemaObject.get("minProperties").getAsInt());

		if (schemaObject.has("properties")) {
			Set<Entry<String, JsonElement>> properties = schemaObject.get("properties").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> jsonProperty : properties) {
				Property property = ExtendedOpenAPI2Factory.eINSTANCE.createProperty();
				property.setName(jsonProperty.getKey());
				schema.getProperties().add(property);
				JsonObject value = jsonProperty.getValue().getAsJsonObject();
				if (value.has("$ref")) {
					String ref = value.get("$ref").getAsString();
					Schema referencedSchema = openAPI2Model.getSchemaByReference(ref);
					if (referencedSchema != null)
						property.setSchema(referencedSchema);
					else
						propertiesToResolve.put(property, ref);
				} else {
					Schema propertyValue = ExtendedOpenAPI2Factory.eINSTANCE.createSchema();
					property.setSchema(propertyValue);
					propertyValue.setDeclaringContext(property);
					openAPI2Model.getContainedCollections().getSchemas().add(propertyValue);
					importSchema(jsonProperty.getValue().getAsJsonObject(), property.getSchema());
				}

			}
		}
		if (schemaObject.has("additionalProperties")) {
			JsonElement additionalProperties = schemaObject.get("additionalProperties");

			if (additionalProperties.isJsonPrimitive())
				schema.setAdditonalPropertiesAllowed(additionalProperties.getAsBoolean());
			else {
				JsonObject additionalPropertiesObject = additionalProperties.getAsJsonObject();
				if (additionalPropertiesObject.has("$ref")) {
					String ref = additionalPropertiesObject.get("$ref").getAsString();
					Schema referencedSchema = openAPI2Model.getSchemaByReference(ref);
					if (referencedSchema != null)
						schema.setAdditonalProperties(referencedSchema);
					else
						additionalPropertiesToResolve.put(schema, ref);
				} else {
					Schema additionalPropertieSchema = ExtendedOpenAPI2Factory.eINSTANCE.createSchema();
					schema.setAdditonalProperties(additionalPropertieSchema);
					openAPI2Model.getContainedCollections().getSchemas().add(additionalPropertieSchema);
					additionalPropertieSchema.setDeclaringContext(schema);
					importSchema(additionalPropertiesObject, additionalPropertieSchema);
				}
			}

		}
		if (schemaObject.has("allOf")) {
			JsonArray allOfArray = schemaObject.get("allOf").getAsJsonArray();
			Map<Integer, String> allOfRefs = new HashMap<Integer, String>();
			for (int i = 0; i < allOfArray.size(); i++) {
				JsonObject allOfObject = allOfArray.get(i).getAsJsonObject();
				if (allOfObject.has("$ref")) {
					Schema referencedSchema = openAPI2Model.getSchemaByReference(allOfObject.get("$ref").getAsString());
					if (referencedSchema != null)
						schema.getAllOf().add(i, referencedSchema);
					else
						allOfRefs.put(i, allOfObject.get("$ref").getAsString());
				} else {
					Schema allOfSchema = ExtendedOpenAPI2Factory.eINSTANCE.createSchema();
					schema.getAllOf().add(allOfSchema);
					openAPI2Model.getContainedCollections().getSchemas().add(allOfSchema);
					allOfSchema.setDeclaringContext(schema);
					importSchema(allOfObject, allOfSchema);
				}

			}
			if (!allOfRefs.isEmpty())
				allOfToResolve.put(schema, allOfRefs);
		}
		if (schemaObject.has("items")) {
			JsonObject itemsObject = schemaObject.get("items").getAsJsonObject();
			if (itemsObject.has("$ref")) {
				Schema referencedSchema = openAPI2Model.getSchemaByReference(itemsObject.get("$ref").getAsString());
				if (referencedSchema != null)
					schema.setItems(referencedSchema);
				else
					itemsToResolve.put(schema, itemsObject.get("$ref").getAsString());
			} else {
				Schema itemsSchema = ExtendedOpenAPI2Factory.eINSTANCE.createSchema();
				schema.setItems(itemsSchema);
				openAPI2Model.getContainedCollections().getSchemas().add(itemsSchema);
				itemsSchema.setDeclaringContext(schema);
				importSchema(itemsObject, itemsSchema);
			}
		}
		if (schemaObject.has("discriminator")) {
			schema.setDiscriminator(schemaObject.get("discriminator").getAsString());
		}
		if (schemaObject.has("readOnly"))
			schema.setReadOnly(schemaObject.get("readOnly").getAsBoolean());
		if (schemaObject.has("xml")) {
			XMLElement xml = ExtendedOpenAPI2Factory.eINSTANCE.createXMLElement();
			JsonObject xmlObject = schemaObject.get("xml").getAsJsonObject();
			if (xmlObject.has("name"))
				xml.setName(xmlObject.get("name").getAsString());
			if (xmlObject.has("namespace"))
				xml.setNamespace(xmlObject.get("namespace").getAsString());
			if (xmlObject.has("prefix"))
				xml.setPrefix(xmlObject.get("prefix").getAsString());
			if (xmlObject.has("attribute"))
				xml.setAttribute(xmlObject.get("attribute").getAsBoolean());
			if (xmlObject.has("wrapped"))
				xml.setWrapped(xmlObject.get("wrapped").getAsBoolean());
			schema.setXml(xml);
		}
		if (schemaObject.has("externalDocs")) {
			ExternalDocs externalDocs = ExtendedOpenAPI2Factory.eINSTANCE.createExternalDocs();
			schema.setExternalDocs(externalDocs);
			importExternalDocs(schemaObject.get("externalDocs"), externalDocs);
		}
		if (schemaObject.has("example"))
			schema.setExample(schemaObject.get("example").toString());
		if (schemaObject.has("required")) {
			for (JsonElement requiredItem : schemaObject.get("required").getAsJsonArray()) {
				Property property = schema.getPropertyByName(requiredItem.getAsString());
				if (property != null)
					property.setRequired(true);
			}
		}
	}

	private void importPaths(JsonElement jsonElement) {
		JsonObject pathsObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> paths = pathsObject.entrySet();
		for (Entry<String, JsonElement> pathElement : paths) {
			JsonObject pathObject = pathElement.getValue().getAsJsonObject();
			Path path = ExtendedOpenAPI2Factory.eINSTANCE.createPath();
			openAPI2Model.getPaths().add(path);
			path.setRelativePath(pathElement.getKey());
			if (pathObject.has("get")) {
				Operation getAPIOperation = ExtendedOpenAPI2Factory.eINSTANCE.createOperation();
				path.setGet(getAPIOperation);
				importOperation(pathObject.get("get"), getAPIOperation);
			}
			if (pathObject.has("put")) {
				Operation putAPIOperation = ExtendedOpenAPI2Factory.eINSTANCE.createOperation();
				path.setPut(putAPIOperation);
				importOperation(pathObject.get("put"), putAPIOperation);
			}
			if (pathObject.has("post")) {
				Operation aPIOperation = ExtendedOpenAPI2Factory.eINSTANCE.createOperation();
				path.setPost(aPIOperation);
				importOperation(pathObject.get("post"), aPIOperation);
			}
			if (pathObject.has("delete")) {
				Operation aPIOperation = ExtendedOpenAPI2Factory.eINSTANCE.createOperation();
				path.setDelete(aPIOperation);
				importOperation(pathObject.get("delete"), aPIOperation);
			}
			if (pathObject.has("options")) {
				Operation aPIOperation = ExtendedOpenAPI2Factory.eINSTANCE.createOperation();
				path.setOptions(aPIOperation);
				importOperation(pathObject.get("options"), aPIOperation);
			}
			if (pathObject.has("head")) {
				Operation aPIOperation = ExtendedOpenAPI2Factory.eINSTANCE.createOperation();
				path.setHead(aPIOperation);
				importOperation(pathObject.get("head"), aPIOperation);
			}
			if (pathObject.has("patch")) {
				Operation aPIOperation = ExtendedOpenAPI2Factory.eINSTANCE.createOperation();
				path.setPatch(aPIOperation);
				importOperation(pathObject.get("patch"), aPIOperation);
			}
			if (pathObject.has("parameters")) {
				JsonArray aPIParametersArray = pathObject.get("parameters").getAsJsonArray();
				for (JsonElement aPIParameterElement : aPIParametersArray) {

					if (aPIParameterElement.getAsJsonObject().has("$ref")) {
						openAPI2Model.getParameterByReference(
								aPIParameterElement.getAsJsonObject().get("$ref").getAsString());

					} else {
						Parameter aPIParameter = ExtendedOpenAPI2Factory.eINSTANCE.createParameter();
						aPIParameter.setDeclaringContext(path);
						path.getParameters().add(aPIParameter);
						openAPI2Model.getContainedCollections().getParamters().add(aPIParameter);
						importParameter(aPIParameterElement, aPIParameter);
					}

				}
			}

		}

	}

	private void importOperation(JsonElement jsonElement, Operation aPIOperation) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if (jsonObject.has("tags")) {
			JsonArray tagsArray = jsonObject.get("tags").getAsJsonArray();
			for (JsonElement tagElement : tagsArray)
				aPIOperation.getTagReferences().add(tagElement.getAsString());
		}
		if (jsonObject.has("summary"))
			aPIOperation.setSummary(jsonObject.get("summary").getAsString());

		if (jsonObject.has("description"))
			aPIOperation.setDescription(jsonObject.get("description").getAsString());
		if (jsonObject.has("externalDocs")) {
			ExternalDocs externalDocs = ExtendedOpenAPI2Factory.eINSTANCE.createExternalDocs();
			aPIOperation.setExternalDocs(externalDocs);
			importExternalDocs(jsonObject.get("externalDocs"), externalDocs);
		}
		if (jsonObject.has("operationId"))
			aPIOperation.setOperationId(jsonObject.get("operationId").getAsString());

		if (jsonObject.has("consumes")) {
			JsonArray mimeArray = jsonObject.get("consumes").getAsJsonArray();
			for (JsonElement mimeType : mimeArray)
				aPIOperation.getConsumes().add(mimeType.getAsString());
		}
		if (jsonObject.has("produces")) {
			JsonArray mimeArray = jsonObject.get("produces").getAsJsonArray();
			for (JsonElement mimeType : mimeArray)
				aPIOperation.getProduces().add(mimeType.getAsString());
		}
		if (jsonObject.has("parameters")) {
			JsonArray aPIParameterArray = jsonObject.get("parameters").getAsJsonArray();
			for (JsonElement aPIParameterElement : aPIParameterArray) {
				if (aPIParameterElement.getAsJsonObject().has("$ref")) {
					openAPI2Model
							.getParameterByReference(aPIParameterElement.getAsJsonObject().get("$ref").getAsString());

				} else {
					Parameter aPIParameter = ExtendedOpenAPI2Factory.eINSTANCE.createParameter();
					aPIParameter.setDeclaringContext(aPIOperation);
					aPIOperation.getParameters().add(aPIParameter);
					openAPI2Model.getContainedCollections().getParamters().add(aPIParameter);
					importParameter(aPIParameterElement, aPIParameter);
				}
			}

		}
		if (jsonObject.has("responses")) {
			Set<Entry<String, JsonElement>> responses = jsonObject.get("responses").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> responseElement : responses) {
				JsonObject responseJson = responseElement.getValue().getAsJsonObject();
				if (responseJson.has("$ref")) {
					Response responseDefinition = openAPI2Model
							.getResponseDefinitionByReference(responseJson.get("$ref").getAsString());
					aPIOperation.getResponses().put(responseElement.getKey(), responseDefinition);

				} else {
					Response responseDefinition = ExtendedOpenAPI2Factory.eINSTANCE.createResponse();
					aPIOperation.getResponses().put(responseElement.getKey(), responseDefinition);
					responseDefinition.setDeclaringContext(aPIOperation);
					openAPI2Model.getContainedCollections().getResponses().add(responseDefinition);
					importResponse(responseJson, responseDefinition);
				}
			}
		}
		if (jsonObject.has("schemes")) {
			JsonArray schemeArray = jsonObject.get("schemes").getAsJsonArray();
			for (JsonElement schemeElement : schemeArray)
				aPIOperation.getSchemes().add(SchemeType.get(schemeElement.getAsString()));
		}
		if (jsonObject.has("deprecated")) {
			aPIOperation.setDeprecated(jsonObject.get("deprecated").getAsBoolean());
		}
		if (jsonObject.has("security")) {
			JsonArray securityArray = jsonObject.get("security").getAsJsonArray();
			// This operation remove the authentication declared at the top level.
			if (securityArray.size() == 0) {
				// in this case we just need to add an instances of SecurityRequirement with
				// empty list of schemes
				SecurityRequirement security = ExtendedOpenAPI2Factory.eINSTANCE.createSecurityRequirement();
				aPIOperation.getSecurity().add(security);

			} else
				for (JsonElement securityElement : securityArray) {
					SecurityRequirement security = ExtendedOpenAPI2Factory.eINSTANCE.createSecurityRequirement();
					aPIOperation.getSecurity().add(security);
					importSecurityRequirement(securityElement, security);

				}

		}
	}

	private void importSecurityRequirement(JsonElement securityElement, SecurityRequirement securityRequirement) {
		Set<Entry<String, JsonElement>> securityRequirementObjects = securityElement.getAsJsonObject().entrySet();
		for (Entry<String, JsonElement> securityRequirementObject : securityRequirementObjects) {
			RequiredSecurityScheme requiredSecurityScheme = ExtendedOpenAPI2Factory.eINSTANCE
					.createRequiredSecurityScheme();
			requiredSecurityScheme
					.setSecurityScheme(openAPI2Model.getSecurityDefinitions().get(securityRequirementObject.getKey()));
			for (JsonElement value : securityRequirementObject.getValue().getAsJsonArray())
				requiredSecurityScheme.getSecurityScopes()
						.add(requiredSecurityScheme.getSecurityScheme().getSecurityScopeByName(value.getAsString()));
			securityRequirement.getSecuritySchemes().add(requiredSecurityScheme);
		}

	}

	private void importResponse(JsonElement responseElement, Response responseDefinition) {
		JsonObject responseObject = responseElement.getAsJsonObject();
		if (responseObject.has("description"))
			responseDefinition.setDescription(responseObject.get("description").getAsString());
		if (responseObject.has("schema")) {
			JsonObject schemaObject = responseObject.get("schema").getAsJsonObject();
			if (schemaObject.has("$ref"))
				responseDefinition
						.setSchema(openAPI2Model.getSchemaByReference(schemaObject.get("$ref").getAsString()));
			else {
				Schema schema = ExtendedOpenAPI2Factory.eINSTANCE.createSchema();
				responseDefinition.setSchema(schema);
				schema.setDeclaringContext(responseDefinition);
				openAPI2Model.getContainedCollections().getSchemas().add(schema);
				importSchema(responseObject.get("schema").getAsJsonObject(), schema);
			}
		}
		if (responseObject.has("headers")) {
			Set<Entry<String, JsonElement>> headers = responseObject.get("headers").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> headerEntry : headers) {
				Header header = ExtendedOpenAPI2Factory.eINSTANCE.createHeader();
				header.setName(headerEntry.getKey());
				responseDefinition.getHeaders().add(header);
				importHeader(headerEntry.getValue(), header);
			}
		}
		if (responseObject.has("example")) {
			Set<Entry<String, JsonElement>> examples = responseObject.get("example").getAsJsonObject().entrySet();

			for (Entry<String, JsonElement> exampleEntry : examples) {
				Example example = ExtendedOpenAPI2Factory.eINSTANCE.createExample();
				example.setMimeType(exampleEntry.getKey());
				example.setValue(exampleEntry.getValue().toString());
				responseDefinition.getExamples().add(example);
			}

		}

	}

	private void importHeader(JsonElement jsonElement, Header header) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();

		if (jsonObject.has("description"))
			header.setDescription(jsonObject.get("description").getAsString());

		if (jsonObject.has("type"))
			header.setType(JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("format"))
			header.setFormat(jsonObject.get("format").getAsString());

		if (jsonObject.has("items")) {
			ItemsDefinition items = ExtendedOpenAPI2Factory.eINSTANCE.createItemsDefinition();
			header.setItems(items);
			importItems(jsonObject.get("items"), items);
		}
		if (jsonObject.has("collectionFormat"))
			header.setCollectionFormat(CollectionFormat.get(jsonObject.get("collectionFormat").getAsString()));
		if (jsonObject.has("default"))
			header.setDefault(jsonObject.get("default").toString());
		if (jsonObject.has("maximum"))
			header.setMaximum(jsonObject.get("maximum").getAsDouble());
		if (jsonObject.has("exclusiveMaximum"))
			header.setExclusiveMaximum(jsonObject.get("exclusiveMaximum").getAsBoolean());// to fix
		if (jsonObject.has("minimum"))
			header.setMinimum(jsonObject.get("minimum").getAsDouble());
		if (jsonObject.has("exclusiveMinimum"))
			header.setExclusiveMinimum(jsonObject.get("exclusiveMinimum").getAsBoolean());
		if (jsonObject.has("maxLength"))
			header.setMaxLength(jsonObject.get("maxLength").getAsInt());
		if (jsonObject.has("minLength"))
			header.setMinLength(jsonObject.get("minLength").getAsInt());
		if (jsonObject.has("pattern"))
			header.setPattern(jsonObject.get("pattern").getAsString());
		if (jsonObject.has("maxItems"))
			header.setMaxItems(jsonObject.get("maxItems").getAsInt());
		if (jsonObject.has("minItems"))
			header.setMinItems(jsonObject.get("minItems").getAsInt());
		if (jsonObject.has("uniqueItems"))
			header.setUniqueItems(jsonObject.get("uniqueItems").getAsBoolean());
		if (jsonObject.has("enum")) {
			JsonArray enumItems = jsonObject.get("enum").getAsJsonArray();
			for (JsonElement item : enumItems)
				header.getEnum().add(item.getAsString());
		}
		if (jsonObject.has("multipleOf"))
			header.setMultipleOf(Double.valueOf(jsonObject.get("multipleOf").getAsDouble()));

	}

	private void importParameter(JsonElement aPIParameterElement, Parameter aPIParameter) {
		JsonObject jsonObject = aPIParameterElement.getAsJsonObject();
		if (jsonObject.has("name"))
			aPIParameter.setName(jsonObject.get("name").getAsString());

		if (jsonObject.has("in")) {
			aPIParameter.setLocation(ParameterLocation.get(jsonObject.get("in").getAsString()));
		}
		if (jsonObject.has("description"))
			aPIParameter.setDescription(jsonObject.get("description").getAsString());
		if (jsonObject.has("required"))
			aPIParameter.setRequired(jsonObject.get("required").getAsBoolean());
		if (jsonObject.has("schema")) {
			JsonObject schemaObject = jsonObject.get("schema").getAsJsonObject();
			if (schemaObject.has("$ref"))
				aPIParameter.setSchema(openAPI2Model.getSchemaByReference(schemaObject.get("$ref").getAsString()));
			else {
				Schema schema = ExtendedOpenAPI2Factory.eINSTANCE.createSchema();
				aPIParameter.setSchema(schema);
				openAPI2Model.getContainedCollections().getSchemas().add(schema);
				schema.setDeclaringContext(aPIParameter);
				importSchema(jsonObject.get("schema").getAsJsonObject(), schema);
			}
		}
		if (jsonObject.has("type"))
			aPIParameter.setType(JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("format"))
			aPIParameter.setFormat(jsonObject.get("format").getAsString());
		if (jsonObject.has("allowEmptyValue"))
			aPIParameter.setAllowEmplyValue(jsonObject.get("allowEmptyValue").getAsBoolean());
		if (jsonObject.has("items")) {
			ItemsDefinition items = ExtendedOpenAPI2Factory.eINSTANCE.createItemsDefinition();
			aPIParameter.setItems(items);
			importItems(jsonObject.get("items"), items);
		}
		if (jsonObject.has("collectionFormat"))
			aPIParameter.setCollectionFormat(CollectionFormat.get(jsonObject.get("collectionFormat").getAsString()));
		if (jsonObject.has("default"))
			aPIParameter.setDefault(jsonObject.get("default").toString());
		if (jsonObject.has("maximum"))
			aPIParameter.setMaximum(jsonObject.get("maximum").getAsDouble());
		if (jsonObject.has("exclusiveMaximum"))
			aPIParameter.setExclusiveMaximum(jsonObject.get("exclusiveMaximum").getAsBoolean());
		if (jsonObject.has("minimum"))
			aPIParameter.setMinimum(jsonObject.get("minimum").getAsDouble());
		if (jsonObject.has("exclusiveMinimum"))
			aPIParameter.setExclusiveMinimum(jsonObject.get("exclusiveMinimum").getAsBoolean());
		if (jsonObject.has("maxLength"))
			aPIParameter.setMaxLength(jsonObject.get("maxLength").getAsInt());
		if (jsonObject.has("minLength"))
			aPIParameter.setMinLength(jsonObject.get("minLength").getAsInt());
		if (jsonObject.has("pattern"))
			aPIParameter.setPattern(jsonObject.get("pattern").getAsString());
		if (jsonObject.has("maxItems"))
			aPIParameter.setMaxItems(jsonObject.get("maxItems").getAsInt());
		if (jsonObject.has("minItems"))
			aPIParameter.setMinItems(jsonObject.get("minItems").getAsInt());
		if (jsonObject.has("uniqueItems"))
			aPIParameter.setUniqueItems(jsonObject.get("uniqueItems").getAsBoolean());
		if (jsonObject.has("enum")) {
			JsonArray enumItems = jsonObject.get("enum").getAsJsonArray();
			for (JsonElement item : enumItems)
				aPIParameter.getEnum().add(item.getAsString());
		}
		if (jsonObject.has("multipleOf"))
			aPIParameter.setMultipleOf(Double.valueOf(jsonObject.get("multipleOf").getAsDouble()));

	}

	private void importItems(JsonElement jsonElement, ItemsDefinition items) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if (jsonObject.has("type"))
			items.setType(JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("format"))
			items.setFormat(jsonObject.get("format").getAsString());
		if (jsonObject.has("items")) {
			ItemsDefinition innerItmes = ExtendedOpenAPI2Factory.eINSTANCE.createItemsDefinition();
			items.setItems(innerItmes);
			importItems(jsonObject.get("items"), innerItmes);
		}
		if (jsonObject.has("collectionFormat"))
			items.setCollectionFormat(CollectionFormat.get(jsonObject.get("collectionFormat").getAsString()));
		if (jsonObject.has("default"))
			items.setDefault(jsonObject.get("default").toString());
		if (jsonObject.has("maximum"))
			items.setMaximum(jsonObject.get("maximum").getAsDouble());
		if (jsonObject.has("exclusiveMaximum"))
			items.setExclusiveMaximum(jsonObject.get("exclusiveMaximum").getAsBoolean());
		if (jsonObject.has("minimum"))
			items.setMinimum(jsonObject.get("minimum").getAsDouble());
		if (jsonObject.has("exclusiveMinimum"))
			items.setExclusiveMinimum(jsonObject.get("exclusiveMinimum").getAsBoolean());
		if (jsonObject.has("maxLength"))
			items.setMaxLength(jsonObject.get("maxLength").getAsInt());
		if (jsonObject.has("minLength"))
			items.setMinLength(jsonObject.get("minLength").getAsInt());
		if (jsonObject.has("pattern"))
			items.setPattern(jsonObject.get("pattern").getAsString());
		if (jsonObject.has("maxItems"))
			items.setMaxItems(jsonObject.get("maxItems").getAsInt());
		if (jsonObject.has("minItems"))
			items.setMinItems(jsonObject.get("minItems").getAsInt());
		if (jsonObject.has("uniqueItems"))
			items.setUniqueItems(jsonObject.get("uniqueItems").getAsBoolean());
		if (jsonObject.has("enum")) {
			JsonArray enumItems = jsonObject.get("enum").getAsJsonArray();
			for (JsonElement item : enumItems)
				items.getEnum().add(item.getAsString());
		}
		if (jsonObject.has("multipleOf"))
			items.setMultipleOf(Double.valueOf(jsonObject.get("multipleOf").getAsDouble()));
	}

	private void importExternalDocs(JsonElement jsonElement, ExternalDocs externalDocs) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if (jsonObject.has("description"))
			externalDocs.setDescription(jsonObject.get("description").getAsString());

		if (jsonObject.has("url"))
			externalDocs.setUrl(jsonObject.get("url").getAsString());

	}

	private void importInfo(JsonElement jsonElement, Info info) {
		JsonObject infoObject = jsonElement.getAsJsonObject();
		if (infoObject.has("title")) {
			info.setTitle(infoObject.get("title").getAsString());
		}
		if (infoObject.has("description"))
			info.setDescription(infoObject.get("description").getAsString());
		if (infoObject.has("termsOfService"))
			info.setTermsOfService(infoObject.get("termsOfService").getAsString());
		if (infoObject.has("contact"))
			importContact(infoObject.get("contact"), info);
		if (infoObject.has("license"))
			importLicense(infoObject.get("license"), info);
		if (infoObject.has("version"))
			info.setVersion(infoObject.get("version").getAsString());

	}

	private void importLicense(JsonElement jsonElement, Info info) {
		JsonObject licenseObject = jsonElement.getAsJsonObject();
		License license = ExtendedOpenAPI2Factory.eINSTANCE.createLicense();
		info.setLicense(license);
		if (licenseObject.has("name"))
			license.setName(licenseObject.get("name").getAsString());
		if (licenseObject.has("url"))
			license.setUrl(licenseObject.get("url").getAsString());
	}

	private void importContact(JsonElement jsonElement, Info info) {
		JsonObject contactObject = jsonElement.getAsJsonObject();
		Contact contact = ExtendedOpenAPI2Factory.eINSTANCE.createContact();
		info.setContact(contact);
		if (contactObject.has("name"))
			contact.setName(contactObject.get("name").getAsString());
		if (contactObject.has("url"))
			contact.setUrl(contactObject.get("url").getAsString());
		if (contactObject.has("email"))
			contact.setEmail(contactObject.get("email").getAsString());

	}

	private void resolveRefs() {
		for (Map.Entry<Property, String> entry : propertiesToResolve.entrySet()) {
			Schema referencedchema = openAPI2Model.getSchemaByReference(entry.getValue());
			if (referencedchema != null) {
				entry.getKey().setSchema(referencedchema);
			}
		}
		for (Map.Entry<Schema, String> entry : additionalPropertiesToResolve.entrySet()) {
			Schema referencedchema = openAPI2Model.getSchemaByReference(entry.getValue());
			if (referencedchema != null) {
				entry.getKey().setAdditonalProperties(referencedchema);
			}
		}
		for (Map.Entry<Schema, String> entry : itemsToResolve.entrySet()) {
			Schema referencedchema = openAPI2Model.getSchemaByReference(entry.getValue());
			if (referencedchema != null) {
				entry.getKey().setItems(referencedchema);
			}
		}
		for (Entry<Schema, Map<Integer, String>> entry : allOfToResolve.entrySet()) {
			for (Entry<Integer, String> ref : entry.getValue().entrySet()) {
				Schema referencedchema = openAPI2Model.getSchemaByReference(ref.getValue());
				if (referencedchema != null) {
					entry.getKey().getAllOf().add(ref.getKey(), referencedchema);
				}
			}
		}
	}

}
