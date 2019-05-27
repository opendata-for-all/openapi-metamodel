package edu.uoc.som.openapi.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import edu.uoc.som.openapi.API;
import edu.uoc.som.openapi.APIKeyLocation;
import edu.uoc.som.openapi.CollectionFormat;
import edu.uoc.som.openapi.Contact;
import edu.uoc.som.openapi.Example;
import edu.uoc.som.openapi.ExternalDocs;
import edu.uoc.som.openapi.Header;
import edu.uoc.som.openapi.Info;
import edu.uoc.som.openapi.ItemsDefinition;
import edu.uoc.som.openapi.JSONDataType;
import edu.uoc.som.openapi.License;
import edu.uoc.som.openapi.OAuth2FlowType;
import edu.uoc.som.openapi.OpenAPIFactory;
import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Parameter;
import edu.uoc.som.openapi.ParameterLocation;
import edu.uoc.som.openapi.Path;
import edu.uoc.som.openapi.Response;
import edu.uoc.som.openapi.Root;
import edu.uoc.som.openapi.Schema;
import edu.uoc.som.openapi.SchemeType;
import edu.uoc.som.openapi.SecurityRequirement;
import edu.uoc.som.openapi.SecuritySchema;
import edu.uoc.som.openapi.SecuritySchemeType;
import edu.uoc.som.openapi.SecurityScope;
import edu.uoc.som.openapi.Tag;
import edu.uoc.som.openapi.XMLElement;



public class OpenAPIImporter {
	OpenAPIFactory openAPIFactory;

	public OpenAPIImporter() {
		openAPIFactory = OpenAPIFactory.eINSTANCE;
		
	}
	public Root createOpenAPIModelFromJson(File jsonFile) throws FileNotFoundException, UnsupportedEncodingException {
		   InputStream in = new FileInputStream(jsonFile);
	        Reader reader = new InputStreamReader(in, "UTF-8");
			JsonParser parser = new JsonParser();
			JsonElement jsonElement =  parser.parse(reader);
		
		return createOpenAPIModelFromJson(jsonElement.getAsJsonObject());
		
	}
	public Root createOpenAPIModelFromJson(JsonObject jsonObject) {

		Root root = openAPIFactory.createRoot();
		API api = openAPIFactory.createAPI();
		root.setApi(api);
		if (jsonObject.has("swagger"))
			api.setSwagger(jsonObject.get("swagger").getAsString());
		if (jsonObject.has("info")) {
			Info info = openAPIFactory.createInfo();
			api.setInfo(info);
			importInfo(jsonObject.get("info"), info);
		}
		if (jsonObject.has("host"))
			api.setHost(jsonObject.get("host").getAsString());

		if (jsonObject.has("basePath"))
			api.setBasePath(jsonObject.get("basePath").getAsString());
		if (jsonObject.has("schemes")) {
			JsonArray schemes = jsonObject.get("schemes").getAsJsonArray();
			for (JsonElement scheme : schemes) {
				api.getSchemes().add(SchemeType.get(scheme.getAsString()));
			}
		}
		if (jsonObject.has("consumes")) {
			JsonArray mimeTypes = jsonObject.get("consumes").getAsJsonArray();
			for (JsonElement mimeType : mimeTypes) {
				api.getConsumes().add(mimeType.getAsString());
			}
		}

		if (jsonObject.has("produces")) {
			JsonArray mimeTypes = jsonObject.get("produces").getAsJsonArray();
			for (JsonElement mimeType : mimeTypes) {
				api.getProduces().add(mimeType.getAsString());
			}
		}
		if (jsonObject.has("definitions")) {
			importDefinitions(jsonObject.get("definitions"), root);
		}
		if (jsonObject.has("responses")) {
			importResponses(jsonObject.get("responses"), root);
		}
		if (jsonObject.has("securityDefinitions")) {
			importSecurityDefinitions(jsonObject.get("securityDefinitions"), root);
		}
		if (jsonObject.has("paths")) {
			importPaths(jsonObject.get("paths"), root);
		}
		
		if (jsonObject.has("parameters")) {
			importParameters(jsonObject.get("parameters"), root);
		}
		
	

		if (jsonObject.has("security")) {
			importSecurity(jsonObject.get("security"), api);
		}
		if (jsonObject.has("tags")) {
			importTags(jsonObject.get("tags"), root);
		}
		if (jsonObject.has("externalDocs")) {
			ExternalDocs externalDocs = openAPIFactory.createExternalDocs();
			api.setExternalDocs(externalDocs);
			importExternalDocs(jsonObject.get("externalDocs"), externalDocs);
		}
		return root;

	}

	private  void importTags(JsonElement jsonElement, Root root) {
		JsonArray tagArray = jsonElement.getAsJsonArray();
		for (JsonElement tagElement : tagArray) {
			Tag tag = openAPIFactory.createTag();
			root.getApi().getTags().add(tag);
			importTag(tagElement, tag);
		}

	}

	private  void importTag(JsonElement tagElement, Tag tag) {
		JsonObject tagObject = tagElement.getAsJsonObject();
		if (tagObject.has("name"))
			tag.setName(tagObject.get("name").getAsString());
		if (tagObject.has("description"))
			tag.setDescription(tagObject.get("description").getAsString());
		if (tagObject.has("externalDocs")) {
			ExternalDocs externalDocs = openAPIFactory.createExternalDocs();
			tag.setExternalDocs(externalDocs);
			importExternalDocs(tagObject.get("externalDocs"), externalDocs);
		}

	}

	private  void importSecurity(JsonElement jsonElement, API api) {
		JsonArray securityArray = jsonElement.getAsJsonArray();
		for (JsonElement securityElement : securityArray) {
			SecurityRequirement security = openAPIFactory.createSecurityRequirement();
			api.getSecurityRequirements().add(security);
			importSecurityRequirement(securityElement, security, api);
		}

	}

	private  void importParameters(JsonElement jsonElement, Root root) {
		JsonObject aPIParametersObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> aPIParameters = aPIParametersObject.entrySet();
		for (Entry<String, JsonElement> aPIParameterElement : aPIParameters) {
			Parameter aPIParameter = openAPIFactory.createParameter();
			aPIParameter.setReferenceName(aPIParameterElement.getKey());
			aPIParameter.setDeclaringContext(root.getApi());
			root.getApi().getParameters().add(aPIParameter);
			root.getParamters().add(aPIParameter);
			importParameter(aPIParameterElement.getValue(), aPIParameter, root);
		}

	}

	private  void importSecurityDefinitions(JsonElement jsonElement, Root root) {
		JsonObject securityDefinitionsObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> securityDefinitions = securityDefinitionsObject.entrySet();
		for (Entry<String, JsonElement> securityDefinitionElement : securityDefinitions) {
			SecuritySchema securityDefinition = openAPIFactory.createSecuritySchema();
			securityDefinition.setReferenceName(securityDefinitionElement.getKey());
			root.getApi().getSecurityDefinitions().add(securityDefinition);
			importSecuritySchema(securityDefinitionElement.getValue(), securityDefinition);
		}

	}

	private  void importSecuritySchema(JsonElement jsonElement, SecuritySchema securitySchema) {
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
				SecurityScope scope = openAPIFactory.createSecurityScope();
				securitySchema.getScopes().add(scope);

				scope.setName(scopeElement.getKey());

				scope.setDescription(scopeElement.getValue().getAsString());
			}
		}

	}

	private  void importResponses(JsonElement jsonElement, Root root) {
		JsonObject responsesObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> responses = responsesObject.entrySet();
		for (Entry<String, JsonElement> responseElement : responses) {
			Response response = openAPIFactory.createResponse();
			response.setCode(responseElement.getKey());
			root.getApi().getResponses().add(response);
			importResponse(responseElement.getValue(), response, root);
		}
	}

	private  void importDefinitions(JsonElement jsonElement, Root root) {
		JsonObject definitionsObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> definitions = definitionsObject.entrySet();
		for (Entry<String, JsonElement> definitionElement : definitions) {
			Schema schema = openAPIFactory.createSchema();
			schema.setName(definitionElement.getKey());
			root.getSchemas().add(schema);
			schema.setDeclaringContext(root.getApi());
			root.getApi().getDefinitions().add(schema);
		}
		for (Entry<String, JsonElement> definitionElement : definitions) {
			importSchema(definitionElement.getValue().getAsJsonObject(),root.getApi().getSchemaByName(definitionElement.getKey()),root);
		}
	}

	private  void importSchema(JsonObject schemaObject, Schema schema,  Root root) {
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
			schema.setMultipleOf( new Double(schemaObject.get("multipleOf").getAsDouble()));
		if (schemaObject.has("maxProperties"))
			schema.setMaxProperties(schemaObject.get("maxProperties").getAsInt());
		if (schemaObject.has("minProperties"))
			schema.setMinProperties(schemaObject.get("minProperties").getAsInt());
	
		if (schemaObject.has("properties")) {
			Set<Entry<String, JsonElement>> properties = schemaObject.get("properties").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> jsonProperty : properties) {
				Schema property = openAPIFactory.createSchema();
				property.setName(jsonProperty.getKey());
				property.setDeclaringContext(schema);
				root.getSchemas().add(property);
				schema.getProperties().add(property);
				JsonObject value = jsonProperty.getValue().getAsJsonObject();
				if(value.has("$ref")) {
					String ref = value.get("$ref").getAsString();
					Schema referencedchema = root.getApi().getSchemaByReference(ref);
					if(value != null) {
						property.setValue(referencedchema);
					}
				}
				else
				importSchema(jsonProperty.getValue().getAsJsonObject(), property, root);
			}
		}
		if (schemaObject.has("additionalProperties")) {
			JsonElement additionalProperties = schemaObject.get("additionalProperties");
			
			if(additionalProperties.isJsonPrimitive())
				schema.setAdditonalPropertiesAllowed(additionalProperties.getAsBoolean());
			else 
			{
				JsonObject additionalPropertiesObject = additionalProperties.getAsJsonObject();
				if(additionalPropertiesObject.has("$ref")) {
					String ref = additionalPropertiesObject.get("$ref").getAsString();
					Schema referencedchema = root.getApi().getSchemaByReference(ref);
					schema.setAdditonalProperties(referencedchema);
				}
				else {
					Schema additionalPropertieSchema = openAPIFactory.createSchema();
					schema.setAdditonalProperties(additionalPropertieSchema);
					root.getSchemas().add(additionalPropertieSchema);
					importSchema(additionalPropertiesObject, additionalPropertieSchema, root);
				}
			}
				
		
		}
		if (schemaObject.has("allOf")) {
			JsonArray allOfArray = schemaObject.get("allOf").getAsJsonArray();
			for (JsonElement allOfElement : allOfArray) {
				JsonObject allOfObject = allOfElement.getAsJsonObject();
				if(allOfObject.has("$ref")) {
					Schema allOfRef = root.getApi().getSchemaByReference(allOfObject.get("$ref").getAsString());
					schema.getAllOf().add(allOfRef);
				}
				else {
					Schema allOfSchema = openAPIFactory.createSchema();
					schema.getAllOf().add(allOfSchema);
					root.getSchemas().add(allOfSchema);
					allOfSchema.setDeclaringContext(schema);
					importSchema(allOfObject, allOfSchema, root);
				}
				
			
			}
		}
		if (schemaObject.has("items")) {
			JsonObject itemsObject = schemaObject.get("items").getAsJsonObject();
			if(itemsObject.has("$ref")) {
				schema.setItems(root.getApi().getSchemaByReference(itemsObject.get("$ref").getAsString()));
			}
			else {
				Schema itemsSchema = openAPIFactory.createSchema();
				schema.setItems(itemsSchema);
				root.getSchemas().add(itemsSchema);
				importSchema(itemsObject,itemsSchema, root);
			}
		}
		if (schemaObject.has("discriminator")) {
			schema.setDiscriminator(schemaObject.get("discriminator").getAsString());
		}
		if (schemaObject.has("readOnly"))
			schema.setReadOnly(schemaObject.get("readOnly").getAsBoolean());
		if (schemaObject.has("xml")) {
			XMLElement xml = openAPIFactory.createXMLElement();
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
			ExternalDocs externalDocs = openAPIFactory.createExternalDocs();
			schema.setExternalDocs(externalDocs);
			importExternalDocs(schemaObject.get("externalDocs"), externalDocs);
		}
		if (schemaObject.has("example"))
			schema.setExample(schemaObject.get("example").toString());
		if (schemaObject.has("required")) {
			for (JsonElement requiredItem : schemaObject.get("required").getAsJsonArray()) {
				schema.getRequired().add(schema.getPropertyByName(requiredItem.getAsString()));
			
			}
		}
	}

	private  void importPaths(JsonElement jsonElement, Root root) {
		JsonObject pathsObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> paths = pathsObject.entrySet();
		for (Entry<String, JsonElement> pathElement : paths) {
			JsonObject pathObject = pathElement.getValue().getAsJsonObject();
			Path path = openAPIFactory.createPath();
			root.getApi().getPaths().add(path);
			path.setRelativePath(pathElement.getKey());
			if (pathObject.has("get")) {
			Operation getAPIOperation = openAPIFactory.createOperation();
				path.setGet(getAPIOperation);
				importOperation(pathObject.get("get"), getAPIOperation, root);
			}
			if (pathObject.has("put")) {
				Operation putAPIOperation = openAPIFactory.createOperation();
				path.setPut(putAPIOperation);
				importOperation(pathObject.get("put"), putAPIOperation, root);
			}
			if (pathObject.has("post")) {
				Operation aPIOperation = openAPIFactory.createOperation();
				path.setPost(aPIOperation);
				importOperation(pathObject.get("post"), aPIOperation, root);
			}
			if (pathObject.has("delete")) {
				Operation aPIOperation = openAPIFactory.createOperation();
				path.setDelete(aPIOperation);
				importOperation(pathObject.get("delete"), aPIOperation, root);
			}
			if (pathObject.has("options")) {
				Operation aPIOperation = openAPIFactory.createOperation();
				path.setOptions(aPIOperation);
				importOperation(pathObject.get("options"), aPIOperation, root);
			}
			if (pathObject.has("head")) {
				Operation aPIOperation = openAPIFactory.createOperation();
				path.setHead(aPIOperation);
				importOperation(pathObject.get("head"), aPIOperation, root);
			}
			if (pathObject.has("patch")) {
				Operation aPIOperation = openAPIFactory.createOperation();
				path.setPatch(aPIOperation);
				importOperation(pathObject.get("patch"), aPIOperation, root);
			}
			if (pathObject.has("parameters")) {
				JsonArray aPIParametersArray = pathObject.get("parameters").getAsJsonArray();
				for (JsonElement aPIParameterElement : aPIParametersArray) {
					Parameter aPIParameter = openAPIFactory.createParameter();
					path.getParameters().add(aPIParameter);
					importParameter(aPIParameterElement, aPIParameter, root);
				}
			}

		}

	}

	private  void importOperation(JsonElement jsonElement, Operation aPIOperation, Root root) {
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
			ExternalDocs externalDocs = openAPIFactory.createExternalDocs();
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
				if(aPIParameterElement.getAsJsonObject().has("$ref")) {
					root.getApi().getParameterByRef(aPIParameterElement.getAsJsonObject().get("$ref").getAsString());
					
				} else {
				Parameter aPIParameter = openAPIFactory.createParameter();
				aPIOperation.getParameters().add(aPIParameter);
				root.getParamters().add(aPIParameter);
				importParameter(aPIParameterElement, aPIParameter, root);}
			}

		}
		if (jsonObject.has("responses")) {
			Set<Entry<String, JsonElement>> responses = jsonObject.get("responses").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> responseElement : responses) {
				Response response = openAPIFactory.createResponse();
				aPIOperation.getResponses().add(response);
				root.getResponses().add(response);
				response.setCode(responseElement.getKey());
				importResponse(responseElement.getValue(), response, root);
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
			for (JsonElement securityElement : securityArray) {
				SecurityRequirement security = openAPIFactory.createSecurityRequirement();
				aPIOperation.getSecurityRequirements().add(security);
				importSecurityRequirement(securityElement, security, root.getApi());

			}

		}
	}

	private  void importSecurityRequirement(JsonElement securityElement, SecurityRequirement security, API api) {
		Set<Entry<String, JsonElement>> securityAttributes = securityElement.getAsJsonObject().entrySet();
		Entry<String, JsonElement> first = (Entry<String, JsonElement>) securityAttributes.toArray()[0];
		SecuritySchema securitySchema = api.getSecuritySchemaByName(first.getKey());
		security.setSecuritySchema(securitySchema);
		for (JsonElement value : first.getValue().getAsJsonArray())
			security.getSecurityScopes().add(securitySchema.getSecurityScopeByName( value.getAsString()));

	}

	private  void importResponse(JsonElement responseElement, Response response, Root root) {
		JsonObject responseObject = responseElement.getAsJsonObject();
		if (responseObject.has("description"))
			response.setDescription(responseObject.get("description").getAsString());
		if (responseObject.has("schema")) {
			JsonObject schemaObject = responseObject.get("schema").getAsJsonObject();
			if(schemaObject.has("$ref"))
				response.setSchema(root.getApi().getSchemaByReference(schemaObject.get("$ref").getAsString()));
				else {
			Schema schema = openAPIFactory.createSchema();
			response.setSchema(schema);
			root.getSchemas().add(schema);
			importSchema(responseObject.get("schema").getAsJsonObject(), schema, root);}
		}
		if (responseObject.has("headers")) {
			Set<Entry<String, JsonElement>> headers = responseObject.get("headers").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> headerEntry : headers) {
				Header header = openAPIFactory.createHeader();
				header.setName(headerEntry.getKey());
				importHeader(headerEntry.getValue(), header);
			}
		}
		if (responseObject.has("example")) {
			Set<Entry<String, JsonElement>> examples = responseObject.get("example").getAsJsonObject().entrySet();

			for (Entry<String, JsonElement> exampleEntry : examples) {
				Example example = openAPIFactory.createExample();
				example.setMimeType(exampleEntry.getKey());
				example.setValue(exampleEntry.getValue().toString());
				response.getExamples().add(example);
			}

		}

	}

	private  void importHeader(JsonElement jsonElement, Header header) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();

		if (jsonObject.has("description"))
			header.setDescription(jsonObject.get("description").getAsString());

		if (jsonObject.has("type"))
			header.setType(JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("format"))
			header.setFormat(jsonObject.get("format").getAsString());

		if (jsonObject.has("items")) {
			ItemsDefinition items = openAPIFactory.createItemsDefinition();
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
			header.setExclusiveMaximum(jsonObject.get("exclusiveMaximum").getAsBoolean());//to fix 
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
			header.setMultipleOf(new Double(jsonObject.get("multipleOf").getAsDouble()));

	}

	private  void importParameter(JsonElement aPIParameterElement,Parameter aPIParameter, Root root) {
		JsonObject jsonObject = aPIParameterElement.getAsJsonObject();
		if (jsonObject.has("name"))
			aPIParameter.setName(jsonObject.get("name").getAsString());

		if (jsonObject.has("in")){
			aPIParameter.setLocation(ParameterLocation.get(jsonObject.get("in").getAsString()));
		}
		if (jsonObject.has("description"))
			aPIParameter.setDescription(jsonObject.get("description").getAsString());
		if (jsonObject.has("required"))
			aPIParameter.setRequired(jsonObject.get("required").getAsBoolean());
		if (jsonObject.has("schema")) {
			JsonObject schemaObject = jsonObject.get("schema").getAsJsonObject();
			if(schemaObject.has("$ref"))
				aPIParameter.setSchema(root.getApi().getSchemaByReference(schemaObject.get("$ref").getAsString()));
				else {
			Schema schema = openAPIFactory.createSchema();
			aPIParameter.setSchema(schema);
			root.getSchemas().add(schema);
			importSchema(jsonObject.get("schema").getAsJsonObject(), schema, root);}
		}
		if (jsonObject.has("type"))
			aPIParameter.setType(JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("format"))
			aPIParameter.setFormat(jsonObject.get("format").getAsString());
		if (jsonObject.has("allowEmptyValue")) 
			aPIParameter.setAllowEmplyValue(jsonObject.get("allowEmptyValue").getAsBoolean());
			if (jsonObject.has("items")) {
				ItemsDefinition items = openAPIFactory.createItemsDefinition();
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
				aPIParameter.setMultipleOf(new Double(jsonObject.get("multipleOf").getAsDouble()));

		
	}

	private  void importItems(JsonElement jsonElement, ItemsDefinition items) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if (jsonObject.has("type"))
			items.setType(JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("format"))
			items.setFormat(jsonObject.get("format").getAsString());
		if (jsonObject.has("items")) {
			ItemsDefinition innerItmes = openAPIFactory.createItemsDefinition();
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

	private  void importExternalDocs(JsonElement jsonElement, ExternalDocs externalDocs) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if (jsonObject.has("description"))
			externalDocs.setDescription(jsonObject.get("description").getAsString());

		if (jsonObject.has("url"))
			externalDocs.setUrl(jsonObject.get("url").getAsString());

	}

	private  void importInfo(JsonElement jsonElement, Info info) {
		JsonObject infoObject = jsonElement.getAsJsonObject();
		if (infoObject.has("title")) {
			info.setTitle(infoObject.get("title").getAsString());
		}
		if (infoObject.has("description"))
			info.setDescription(infoObject.get("description").getAsString());
		if (infoObject.has("termsOfServices"))
			info.setTermsOfServices(infoObject.get("termsOfService").getAsString());
		if (infoObject.has("contact"))
			importContact(infoObject.get("contact"), info);
		if (infoObject.has("license"))
			importLicense(infoObject.get("license"), info);
		if (infoObject.has("version"))
			info.setVersion(infoObject.get("version").getAsString());

	}

	private  void importLicense(JsonElement jsonElement, Info info) {
		JsonObject licenseObject = jsonElement.getAsJsonObject();
		License license = openAPIFactory.createLicense();
		info.setLicense(license);
		if (licenseObject.has("name"))
			license.setName(licenseObject.get("name").getAsString());
		if (licenseObject.has("url"))
			license.setUrl(licenseObject.get("url").getAsString());
	}

	private  void importContact(JsonElement jsonElement, Info info) {
		JsonObject contactObject = jsonElement.getAsJsonObject();
		Contact contact = openAPIFactory.createContact();
		info.setContact(contact);
		if (contactObject.has("name"))
			contact.setName(contactObject.get("name").getAsString());
		if (contactObject.has("url"))
			contact.setUrl(contactObject.get("url").getAsString());
		if (contactObject.has("email"))
			contact.setEmail(contactObject.get("email").getAsString());

	}
	public Root createOpenAPIModelFromYaml() {
		return null;
		
	}

}
