package edu.uoc.som.openapi.io;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import edu.uoc.som.openapi.API;
import edu.uoc.som.openapi.APIKeyLocation;
import edu.uoc.som.openapi.CollectionFormat;
import edu.uoc.som.openapi.Example;
import edu.uoc.som.openapi.ExternalDocs;
import edu.uoc.som.openapi.Header;
import edu.uoc.som.openapi.Info;
import edu.uoc.som.openapi.ItemsDefinition;
import edu.uoc.som.openapi.JSONDataType;
import edu.uoc.som.openapi.OAuth2FlowType;
import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Parameter;
import edu.uoc.som.openapi.ParameterLocation;
import edu.uoc.som.openapi.Path;
import edu.uoc.som.openapi.Property;
import edu.uoc.som.openapi.Response;
import edu.uoc.som.openapi.Schema;
import edu.uoc.som.openapi.SchemeType;
import edu.uoc.som.openapi.SecurityRequirement;
import edu.uoc.som.openapi.SecurityScheme;
import edu.uoc.som.openapi.SecuritySchemeType;
import edu.uoc.som.openapi.SecurityScope;
import edu.uoc.som.openapi.Tag;

public class OpenAPIExporter {

	Map<String, Schema> schemaMap = new HashMap<String, Schema>();

	public JsonObject toJson(API api) {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("swagger", api.getSwagger());
		if (api.getInfo() != null) {
			JsonObject infoJson = new JsonObject();
			jsonObject.add("info", infoJson);
			generateInfo(api.getInfo(), infoJson);
		}
		jsonObject.addProperty("host", api.getHost());
		jsonObject.addProperty("basePath", api.getBasePath());

		if (!api.getSchemes().isEmpty()) {
			JsonArray schemes = new JsonArray();
			for (SchemeType scheme : api.getSchemes())
				schemes.add(scheme.getLiteral());
			jsonObject.add("schemes", schemes);
		}
		if (!api.getConsumes().isEmpty()) {
			JsonArray consumesList = new JsonArray();
			for (String consume : api.getConsumes())
				consumesList.add(consume);
			jsonObject.add("consumes", consumesList);
		}
		if (!api.getProduces().isEmpty()) {
			JsonArray producesList = new JsonArray();
			for (String produces : api.getConsumes())
				producesList.add(produces);
			jsonObject.add("produces", producesList);
		}
		if (!api.getPaths().isEmpty()) {
			JsonObject jsonPaths = new JsonObject();
			jsonObject.add("paths", jsonPaths);
			generatePaths(api, jsonPaths);

		}
		if (!api.getDefinitions().isEmpty()) {
			JsonObject jsonDefintions = new JsonObject();
			jsonObject.add("definitions", jsonDefintions);
			generateDefinitions(api, jsonDefintions);
		}
		if (!api.getParameters().isEmpty()) {
			JsonObject jsonParameters = new JsonObject();
			jsonObject.add("parameters", jsonParameters);
			generateParameters(api, jsonParameters);
		}
		if (!api.getResponses().isEmpty()) {
			JsonObject jsonResponses = new JsonObject();
			jsonObject.add("responses", jsonResponses);
			generateResponses(api, jsonResponses);
		}

		if (!api.getSecurityDefinitions().isEmpty()) {
			JsonObject securityDefinitions = new JsonObject();
			jsonObject.add("securityDefinitions", securityDefinitions);
			generateSecurityDefinitions(api, securityDefinitions);
		}
		if (!api.getSecurity().isEmpty()) {
			JsonArray security = new JsonArray();
			jsonObject.add("security", security);
			for (SecurityRequirement securityRequirement : api.getSecurity()) {
				JsonObject securityRequirementJson = new JsonObject();
				generateSecurity(securityRequirement, securityRequirementJson);
				security.add(securityRequirementJson);

			}

		}
		if (!api.getTags().isEmpty()) {
			JsonArray tags = new JsonArray();
			jsonObject.add("tags", tags);
			for (Tag tag : api.getTags()) {
				JsonObject jsonTag = new JsonObject();
				if (tag.getName() != null)
					jsonTag.addProperty("name", tag.getName());
				if (tag.getDescription() != null)
					jsonTag.addProperty("description", tag.getDescription());
				if (tag.getExternalDocs() != null) {
					JsonObject externalDocs = new JsonObject();
					jsonTag.add("externalDocs", externalDocs);
					generateExternalDocs(tag.getExternalDocs(), externalDocs);
				}
				tags.add(jsonTag);
			}
		}
		if (api.getExternalDocs() != null) {
			JsonObject externalDocs = new JsonObject();
			generateExternalDocs(api.getExternalDocs(), externalDocs);
			jsonObject.add("externalDocs", externalDocs);
		}

		return jsonObject;

	}

	private static void generateSecurity(SecurityRequirement securityRequirement, JsonObject securityRequirementJson) {
		if (securityRequirement.getSecurityScheme() != null) {
			JsonArray scopes = new JsonArray();
			securityRequirementJson.add(securityRequirement.getSecurityScheme().getReferenceName(), scopes);
			if (securityRequirement.getSecurityScopes() != null)
				for (SecurityScope scope : securityRequirement.getSecurityScopes())
					scopes.add(scope.getName());

		}

	}

	private static void generateExternalDocs(ExternalDocs externalDocs, JsonObject jsonExternalDocs) {
		if (externalDocs.getDescription() != null)
			jsonExternalDocs.addProperty("description", externalDocs.getDescription());
		if (externalDocs.getUrl() != null)
			jsonExternalDocs.addProperty("url", externalDocs.getUrl());

	}

	private void generateParameters(API api, JsonObject jsonParameters) {
		for (Parameter parameter : api.getParameters()) {
			JsonObject jsonParameter = new JsonObject();
			jsonParameters.add(parameter.getReferenceName(), jsonParameter);
			generateParameter(api, parameter, jsonParameter);
		}

	}

	private void generateResponses(API api, JsonObject jsonResponses) {
		for (Response response : api.getResponses()) {
			JsonObject jsonResponse = new JsonObject();
			jsonResponses.add(response.getReferenceName(), jsonResponse);
			generateResponse(api, response, jsonResponse);
		}

	}

	private void generateSecurityDefinitions(API api, JsonObject jsonSecurityDefinitions) {
		for (SecurityScheme securityScheme : api.getSecurityDefinitions()) {
			JsonObject jsonSecurityDefinition = new JsonObject();
			jsonSecurityDefinitions.add(securityScheme.getReferenceName(), jsonSecurityDefinition);
			generateSecurityScheme(api, securityScheme, jsonSecurityDefinition);
		}

	}

	private void generateInfo(Info info, JsonObject jsonInfo) {

		jsonInfo.addProperty("title", info.getTitle());
		jsonInfo.addProperty("description", info.getDescription());
		if (info.getTermsOfService() != null)
			jsonInfo.addProperty("termsOfService", info.getTermsOfService());
		if (info.getContact() != null) {
			JsonObject jsonContact = new JsonObject();
			if (info.getContact().getName() != null)
				jsonContact.addProperty("name", info.getContact().getName());
			if (info.getContact().getUrl() != null)
				jsonContact.addProperty("url", info.getContact().getUrl());
			if (info.getContact().getEmail() != null)
				jsonContact.addProperty("email", info.getContact().getEmail());
			jsonInfo.add("contact", jsonContact);
		}
		if (info.getLicense() != null) {
			JsonObject jsonLicense = new JsonObject();
			if (info.getLicense().getName() != null)
				jsonLicense.addProperty("name", info.getLicense().getName());
			if (info.getLicense().getUrl() != null)
				jsonLicense.addProperty("url", info.getLicense().getUrl());
			jsonInfo.add("license", jsonLicense);
		}
		jsonInfo.addProperty("version", info.getVersion());
	}

	private void generatePaths(API api, JsonObject jsonPaths) {
		for (Path path : api.getPaths()) {
			JsonObject jsonPathItem = new JsonObject();
			jsonPaths.add(path.getRelativePath(), jsonPathItem);
			generatePathItem(api, path, jsonPathItem);
		}

	}

	private void generatePathItem(API api, Path path, JsonObject jsonOperations) {
		if (path.getGet() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("get", jsonOperation);
			generateOperation(api, path.getGet(), jsonOperation);

		}
		if (path.getPut() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("put", jsonOperation);
			generateOperation(api, path.getPut(), jsonOperation);

		}
		if (path.getPost() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("post", jsonOperation);
			generateOperation(api, path.getPost(), jsonOperation);

		}
		if (path.getDelete() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("delete", jsonOperation);
			generateOperation(api, path.getDelete(), jsonOperation);

		}
		if (path.getOptions() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("options", jsonOperation);
			generateOperation(api, path.getOptions(), jsonOperation);
		}
		if (path.getHead() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("head", jsonOperation);
			generateOperation(api, path.getHead(), jsonOperation);
		}
		if (path.getPatch() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("delete", jsonOperation);
			generateOperation(api, path.getPatch(), jsonOperation);
		}
		// TODO parameters
	}

	private void generateOperation(API api, Operation operation, JsonObject jsonOperation) {
		if (!operation.getTagReferences().isEmpty()) {
			JsonArray tags = new JsonArray();
			for (String tag : operation.getTagReferences())
				tags.add(tag);
			jsonOperation.add("tags", tags);
		}
		if (operation.getSummary() != null) {
			jsonOperation.addProperty("summary", operation.getSummary());
		}
		if (operation.getDescription() != null) {
			jsonOperation.addProperty("description", operation.getDescription());
		}
		if (operation.getExternalDocs() != null) {
			JsonObject externalDocs = new JsonObject();
			generateExternalDocs(operation.getExternalDocs(), externalDocs);
			jsonOperation.add("externalDocs", externalDocs);

		}
		if (operation.getOperationId() != null) {
			jsonOperation.addProperty("operationId", operation.getOperationId());
		}
		if (!operation.getConsumes().isEmpty()) {
			JsonArray consumesList = new JsonArray();
			for (String consume : operation.getConsumes())
				consumesList.add(consume);
			jsonOperation.add("consumes", consumesList);
		}
		if (!operation.getProduces().isEmpty()) {
			JsonArray producesList = new JsonArray();
			for (String produces : operation.getProduces())
				producesList.add(produces);
			jsonOperation.add("produces", producesList);
		}
		if (!operation.getParameters().isEmpty()) {
			JsonArray paramatersJson = new JsonArray();
			for (Parameter parameter : operation.getParameters()) {
				JsonObject parameterJson = new JsonObject();
				paramatersJson.add(parameterJson);
				generateParameter(api, parameter, parameterJson);
			}
			jsonOperation.add("parameters", paramatersJson);
		}
		if (!operation.getResponses().isEmpty()) {
			JsonObject responsesJson = new JsonObject();
			jsonOperation.add("responses", responsesJson);
			for (Response response : operation.getResponses()) {
				JsonObject responseJson = new JsonObject();
				responsesJson.add(response.getCode(), responseJson);
				generateResponse(api, response, responseJson);
			}
		}
		if (!operation.getSchemes().isEmpty()) {
			JsonArray schemes = new JsonArray();
			for (SchemeType scheme : operation.getSchemes())
				schemes.add(scheme.getLiteral());
			jsonOperation.add("schemes", schemes);
		}
		if (operation.getDeprecated() != null)
			jsonOperation.addProperty("deprecated", operation.getDeprecated());
		if (!operation.getSecurity().isEmpty()) {
			JsonArray security = new JsonArray();
			jsonOperation.add("security", security);
			for (SecurityRequirement securityRequirement : operation.getSecurity()) {
				JsonObject securityRequirementJson = new JsonObject();
				generateSecurity(securityRequirement, securityRequirementJson);
				security.add(securityRequirementJson);

			}

		}

	}

	private void generateParameter(API api, Parameter parameter, JsonObject parameterJson) {
		parameterJson.addProperty("name", parameter.getName());
		parameterJson.addProperty("in", parameter.getLocation().getLiteral());
		if (!parameter.getType().equals(JSONDataType.UNSPECIFIED))
			parameterJson.addProperty("type", parameter.getType().getLiteral());
		if (parameter.getFormat() != null)
			parameterJson.addProperty("format", parameter.getFormat());

		if (parameter.getDescription() != null)
			parameterJson.addProperty("description", parameter.getDescription());
		if (parameter.getRequired() != null)
			parameterJson.addProperty("required", parameter.getRequired());
		if (parameter.getLocation().equals(ParameterLocation.BODY)) {
			if(parameter.getSchema()!= null)
			if (parameter.getSchema().getType().equals(JSONDataType.OBJECT)) {
				JsonObject refSchema = new JsonObject();
				refSchema.addProperty("$ref", parameter.getSchema().getRef());
				parameterJson.add("schema", refSchema);

			} else {
				// TODO array and primitive
			}
		}
		if (parameter.getAllowEmplyValue() != null)
			parameterJson.addProperty("allowEmptyValue", parameter.getAllowEmplyValue());
		if (parameter.getItems() != null) {
			ItemsDefinition itemsDefinition = parameter.getItems();
			JsonObject items = new JsonObject();
			generateItems(itemsDefinition, items);
			parameterJson.add("items", items);
		}
		if (!parameter.getCollectionFormat().equals(CollectionFormat.UNSPECIFIED))
			parameterJson.addProperty("collectionFormat", parameter.getCollectionFormat().getLiteral());
		if (parameter.getDefault() != null) {
			parameterJson.addProperty("default", parameter.getDefault());
		}
		if (parameter.getMaximum() != null)
			parameterJson.addProperty("maximum", parameter.getMaximum());
		if (parameter.getExclusiveMaximum() != null)
			parameterJson.addProperty("exclusiveMaximum", parameter.getExclusiveMaximum());
		if (parameter.getMinimum() != null)
			parameterJson.addProperty("minimum", parameter.getMinimum());
		if (parameter.getExclusiveMaximum() != null)
			parameterJson.addProperty("exclusiveMinimum", parameter.getExclusiveMinimum());
		if (parameter.getMaxLength() != null)
			parameterJson.addProperty("maxLength", parameter.getMaxLength());
		if (parameter.getMinLength() != null)
			parameterJson.addProperty("minLength", parameter.getMinLength());
		if (parameter.getPattern() != null)
			parameterJson.addProperty("pattern", parameter.getPattern());
		if (parameter.getMaxItems() != null)
			parameterJson.addProperty("maxItems", parameter.getMaxItems());
		if (parameter.getMinItems() != null)
			parameterJson.addProperty("minItems", parameter.getMinItems());
		if (parameter.getUniqueItems() != null)
			parameterJson.addProperty("uniqueItems", parameter.getUniqueItems());
		if (!parameter.getEnum().isEmpty()) {
			JsonArray enumArray = new JsonArray();
			for (String enumItem : parameter.getEnum())
				enumArray.add(enumItem);
			parameterJson.add("enum", enumArray);
		}
		if (parameter.getMultipleOf() != null)
			parameterJson.addProperty("multipleOf", parameter.getMultipleOf());

	}

	private void generateItems(ItemsDefinition itemsDefinition, JsonObject itemsDefinitionJson) {
		if (!itemsDefinition.getType().equals(JSONDataType.UNSPECIFIED))
			itemsDefinitionJson.addProperty("type", itemsDefinition.getType().getLiteral());
		if (itemsDefinition.getFormat() != null)
			itemsDefinitionJson.addProperty("format", itemsDefinition.getFormat());
		if (itemsDefinition.getItems() != null) {
			ItemsDefinition items = itemsDefinition.getItems();
			JsonObject itemsJson = new JsonObject();
			generateItems(items, itemsJson);
			itemsDefinitionJson.add("items", itemsJson);
		}
		if (!itemsDefinition.getCollectionFormat().equals(CollectionFormat.UNSPECIFIED))
			itemsDefinitionJson.addProperty("collectionFormat", itemsDefinition.getCollectionFormat().getLiteral());
		if (itemsDefinition.getDefault() != null) {
			itemsDefinitionJson.addProperty("default", itemsDefinition.getDefault());
		}
		if (itemsDefinition.getMaximum() != null)
			itemsDefinitionJson.addProperty("maximum", itemsDefinition.getMaximum());
		if (itemsDefinition.getExclusiveMaximum() != null)
			itemsDefinitionJson.addProperty("exclusiveMaximum", itemsDefinition.getExclusiveMaximum());
		if (itemsDefinition.getMinimum() != null)
			itemsDefinitionJson.addProperty("minimum", itemsDefinition.getMinimum());
		if (itemsDefinition.getExclusiveMaximum() != null)
			itemsDefinitionJson.addProperty("exclusiveMinimum", itemsDefinition.getExclusiveMinimum());
		if (itemsDefinition.getMaxLength() != null)
			itemsDefinitionJson.addProperty("maxLength", itemsDefinition.getMaxLength());
		if (itemsDefinition.getMinLength() != null)
			itemsDefinitionJson.addProperty("minLength", itemsDefinition.getMinLength());
		if (itemsDefinition.getPattern() != null)
			itemsDefinitionJson.addProperty("pattern", itemsDefinition.getPattern());
		if (itemsDefinition.getMaxItems() != null)
			itemsDefinitionJson.addProperty("maxItems", itemsDefinition.getMaxItems());
		if (itemsDefinition.getMinItems() != null)
			itemsDefinitionJson.addProperty("minItems", itemsDefinition.getMinItems());
		if (itemsDefinition.getUniqueItems() != null)
			itemsDefinitionJson.addProperty("uniqueItems", itemsDefinition.getUniqueItems());
		if (!itemsDefinition.getEnum().isEmpty()) {
			JsonArray enumArray = new JsonArray();
			for (String enumItem : itemsDefinition.getEnum())
				enumArray.add(enumItem);
			itemsDefinitionJson.add("enum", enumArray);
		}
		if (itemsDefinition.getMultipleOf() != null)
			itemsDefinitionJson.addProperty("multipleOf", itemsDefinition.getMultipleOf());

	}

	private void generateResponse(API api, Response response, JsonObject responseJson) {
		responseJson.addProperty("description", response.getDescription());
		if (response.getSchema() != null) {
			if (response.getSchema().getType().equals(JSONDataType.OBJECT)) {
				if (response.getSchema().getDeclaringContext() == api) {
					JsonObject refSchema = new JsonObject();
					refSchema.addProperty("$ref", response.getSchema().getRef());
					responseJson.add("schema", refSchema);
				}

			} else {
				if (response.getSchema().getType().equals(JSONDataType.ARRAY)) {
					JsonObject schemaArray = new JsonObject();
					responseJson.add("schema", schemaArray);
					schemaArray.addProperty("type", JSONDataType.ARRAY.getLiteral());
					if (response.getSchema().getItems().getType().equals(JSONDataType.OBJECT)) {
						JsonObject refSchema = new JsonObject();
						refSchema.addProperty("$ref", response.getSchema().getItems().getRef());
						schemaArray.add("items", refSchema);
					}

				}
			}

		}
		if (!response.getHeaders().isEmpty()) {
			JsonObject headerJson = new JsonObject();
			for (Header header : response.getHeaders()) {
				JsonObject headerItem = new JsonObject();
				if (header.getDescription() != null)
					headerItem.addProperty("description", header.getDescription());
				if (!header.getType().equals(JSONDataType.UNSPECIFIED))
					headerItem.addProperty("type", header.getType().getLiteral());
				if (header.getFormat() != null)
					headerItem.addProperty("format", header.getFormat());
				if (header.getItems() != null) {
					ItemsDefinition items = header.getItems();
					JsonObject itemsJson = new JsonObject();
					generateItems(items, itemsJson);
					headerItem.add("items", itemsJson);
				}
				if (!header.getCollectionFormat().equals(CollectionFormat.UNSPECIFIED))
					headerItem.addProperty("collectionFormat", header.getCollectionFormat().getLiteral());
				if (header.getDefault() != null) {
					headerItem.addProperty("default", header.getDefault());
				}
				if (header.getMaximum() != null)
					headerItem.addProperty("maximum", header.getMaximum());
				if (header.getExclusiveMaximum() != null)
					headerItem.addProperty("exclusiveMaximum", header.getExclusiveMaximum());
				if (header.getMinimum() != null)
					headerItem.addProperty("minimum", header.getMinimum());
				if (header.getExclusiveMaximum() != null)
					headerItem.addProperty("exclusiveMinimum", header.getExclusiveMinimum());
				if (header.getMaxLength() != null)
					headerItem.addProperty("maxLength", header.getMaxLength());
				if (header.getMinLength() != null)
					headerItem.addProperty("minLength", header.getMinLength());
				if (header.getPattern() != null)
					headerItem.addProperty("pattern", header.getPattern());
				if (header.getMaxItems() != null)
					headerItem.addProperty("maxItems", header.getMaxItems());
				if (header.getMinItems() != null)
					headerItem.addProperty("minItems", header.getMinItems());
				if (header.getUniqueItems() != null)
					headerItem.addProperty("uniqueItems", header.getUniqueItems());
				if (!header.getEnum().isEmpty()) {
					JsonArray enumArray = new JsonArray();
					for (String enumItem : header.getEnum())
						enumArray.add(enumItem);
					headerItem.add("enum", enumArray);
				}
				if (header.getMultipleOf() != null)
					headerItem.addProperty("multipleOf", header.getMultipleOf());

				headerJson.add(header.getName(), headerItem);
			}
			responseJson.add("headers", headerJson);
		}
		if (!response.getExamples().isEmpty()) {
			JsonObject exampleJson = new JsonObject();
			for (Example example : response.getExamples()) {
				exampleJson.addProperty(example.getMimeType(), example.getValue());
			}
			responseJson.add("examples", exampleJson);
		}

	}

	private void generateDefinitions(API api, JsonObject jsonDefinitions) {
		for (Schema definition : api.getDefinitions()) {
			JsonObject schemaJson = new JsonObject();
			jsonDefinitions.add(definition.getReferenceName(), schemaJson);
			generateSchema(api, definition, schemaJson);
		}

	}

	private void generateSchema(API api, Schema schema, JsonObject schemaJson) {
		if (schema != null) {
			if (schema.getReferenceName() != null) {
				Schema referencedSchema = schemaMap.get(schema.getRef());
				if (referencedSchema != null) {
					schemaJson.addProperty("$ref", referencedSchema.getRef());
					return;
				} else
					schemaMap.put(schema.getRef(), schema);
			}
		if (!schema.getType().equals(JSONDataType.UNSPECIFIED))
			schemaJson.addProperty("type", schema.getType().getLiteral());
		if (schema.getFormat() != null)
			schemaJson.addProperty("format", schema.getFormat());
		if (schema.getTitle() != null)
			schemaJson.addProperty("title", schema.getTitle());
		if (schema.getDescription() != null)
			schemaJson.addProperty("description", schema.getDescription());
		if (schema.getDefault() != null)
			schemaJson.addProperty("default", schema.getDefault());
		if (schema.getMultipleOf() != null)
			schemaJson.addProperty("multipleOf", schema.getMultipleOf());
		if (schema.getMaximum() != null)
			schemaJson.addProperty("maximum", schema.getMaximum());
		if (schema.getExclusiveMaximum() != null)
			schemaJson.addProperty("exclusiveMaximum", schema.getExclusiveMaximum());
		if (schema.getMinimum() != null)
			schemaJson.addProperty("minimum", schema.getMinimum());
		if (schema.getExclusiveMinimum() != null)
			schemaJson.addProperty("exclusiveMinimum", schema.getExclusiveMinimum());
		if (schema.getMaxLength() != null)
			schemaJson.addProperty("maxLength", schema.getMaxLength());
		if (schema.getMinLength() != null)
			schemaJson.addProperty("minLength", schema.getMinLength());
		if (schema.getPattern() != null)
			schemaJson.addProperty("pattern", schema.getPattern());
		if (schema.getMaxItems() != null)
			schemaJson.addProperty("maxItems", schema.getMaxItems());
		if (schema.getMinItems() != null)
			schemaJson.addProperty("minItems", schema.getMinItems());
		if (schema.getUniqueItems() != null)
			schemaJson.addProperty("uniqueItems", schema.getUniqueItems());
		if (schema.getMaxProperties() != null)
			schemaJson.addProperty("maxProperties", schema.getMaxProperties());
		if (schema.getMinProperties() != null)
			schemaJson.addProperty("minProperties", schema.getMinProperties());
		if (!schema.getRequired().isEmpty()) {
			JsonArray requiredProperties = new JsonArray();
			for (Property property : schema.getRequired())
				requiredProperties.add(property.getReferenceName());
			schemaJson.add("required", requiredProperties);
		}
		if (!schema.getEnum().isEmpty()) {
			JsonArray enumArray = new JsonArray();
			for (String enumItem : schema.getEnum())
				enumArray.add(enumItem);
			schemaJson.add("enum", enumArray);
		}

		if (schema.getItems() != null) {
			JsonObject itemsJson = new JsonObject();
			generateSchema(api, schema.getItems(), itemsJson);
			schemaJson.add("items", itemsJson);
		}
		if (!schema.getAllOf().isEmpty()) {
			JsonArray allOfJson = new JsonArray();
			for (Schema allOfItem : schema.getAllOf()) {
				JsonObject allOfItemJson = new JsonObject();
				generateSchema(api, allOfItem, allOfItemJson);
				allOfJson.add(allOfItemJson);
			}
		}
		if (!schema.getProperties().isEmpty()) {
			JsonObject propertiesJson = new JsonObject();
			schemaJson.add("properties", propertiesJson);
			for (Property property : schema.getProperties()) {
				JsonObject propertyJson = new JsonObject();
				propertiesJson.add(property.getReferenceName(), propertyJson);
//				generateSchemaProperty(api,property.getSchema(), propertyJson);
				generateSchema(api, property.getSchema(), propertyJson);
			}
		}
		if (schema.getAdditonalPropertiesAllowed() != null) {
			schemaJson.addProperty("additionalProperties", schema.getAdditonalPropertiesAllowed());
		}
		if (schema.getAdditonalProperties() != null) {
			JsonObject additionalProperties = new JsonObject();
			generateSchema(api, schema.getAdditonalProperties(), additionalProperties);
			schemaJson.add("additionalProperties", additionalProperties);
		}
		if (schema.getDiscriminator() != null)
			schemaJson.addProperty("discriminator", schema.getDiscriminator());
		if (schema.getReadOnly() != null)
			schemaJson.addProperty("readOnly", schema.getReadOnly());
		if (schema.getXml() != null) {
			JsonObject xmlJson = new JsonObject();
			if (schema.getXml().getName() != null)
				xmlJson.addProperty("name", schema.getXml().getName());
			if (schema.getXml().getNamespace() != null)
				xmlJson.addProperty("namespace", schema.getXml().getNamespace());
			if (schema.getXml().getPrefix() != null)
				xmlJson.addProperty("prefix", schema.getXml().getPrefix());
			if (schema.getXml().getAttribute() != null)
				xmlJson.addProperty("attribute", schema.getXml().getAttribute());
			if (schema.getXml().getWrapped() != null)
				xmlJson.addProperty("wrapped", schema.getXml().getWrapped());
			schemaJson.add("xml", xmlJson);

		}
		if (schema.getExternalDocs() != null) {
			JsonObject externalDocs = new JsonObject();
			generateExternalDocs(schema.getExternalDocs(), externalDocs);
			schemaJson.add("externalDocs", externalDocs);
		}
		if (schema.getExample() != null)
			schemaJson.addProperty("example", schema.getExample());}
		
	}

	private static void generateSecurityScheme(API api, SecurityScheme securityScheme, JsonObject jsonSecurityScheme) {
		if (!securityScheme.getType().equals(SecuritySchemeType.UNSPECIFIED))
			jsonSecurityScheme.addProperty("type", securityScheme.getType().getLiteral());
		if (securityScheme.getDescription() != null)
			jsonSecurityScheme.addProperty("description", securityScheme.getDescription());
		if (securityScheme.getName() != null)
			jsonSecurityScheme.addProperty("name", securityScheme.getName());
		if (!securityScheme.getLocation().equals(APIKeyLocation.UNSPECIFIED))
			jsonSecurityScheme.addProperty("in", securityScheme.getLocation().getLiteral());
		if (!securityScheme.getFlow().equals(OAuth2FlowType.UNSPECIFIED))
			jsonSecurityScheme.addProperty("flow", securityScheme.getFlow().getLiteral());
		if (securityScheme.getAuthorizationUrl() != null)
			jsonSecurityScheme.addProperty("authorizationUrl", securityScheme.getAuthorizationUrl());
		if (securityScheme.getTokenUrl() != null)
			jsonSecurityScheme.addProperty("tokenUrl", securityScheme.getAuthorizationUrl());
		if (!securityScheme.getScopes().isEmpty()) {
			JsonObject scopes = new JsonObject();
			for (SecurityScope scope : securityScheme.getScopes())
				if (scope.getName() != null && scope.getDescription() != null)
					scopes.addProperty(scope.getName(), scope.getDescription());
			jsonSecurityScheme.add("scopes", scopes);
		}
	}

}
