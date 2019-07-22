package edu.uoc.som.openapi2.io;

import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import edu.uoc.som.openapi2.API;
import edu.uoc.som.openapi2.APIKeyLocation;
import edu.uoc.som.openapi2.CollectionFormat;
import edu.uoc.som.openapi2.Example;
import edu.uoc.som.openapi2.ExternalDocs;
import edu.uoc.som.openapi2.Header;
import edu.uoc.som.openapi2.Info;
import edu.uoc.som.openapi2.ItemsDefinition;
import edu.uoc.som.openapi2.JSONDataType;
import edu.uoc.som.openapi2.OAuth2FlowType;
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
import edu.uoc.som.openapi2.impl.ParameterEntryImpl;

public class OpenAPI2Exporter {

	private API openAPI2Model;
	private boolean prettyPrinting;

	public OpenAPI2Exporter(API openAPI2Model, boolean prettyPrinting) {
		this.openAPI2Model = openAPI2Model;
		this.prettyPrinting = prettyPrinting;
	}

	public String toJsonFormat() {
		JsonObject jsonObject = toJsonObject();
		GsonBuilder gsonBuilder = new GsonBuilder();
		if(prettyPrinting)
			gsonBuilder.setPrettyPrinting();
		Gson gson = gsonBuilder.create();
		return gson.toJson(jsonObject); 
		
	}
	public JsonObject toJsonObject() {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("swagger", "2.0");
		if (openAPI2Model.getInfo() != null) {
			JsonObject infoJson = new JsonObject();
			jsonObject.add("info", infoJson);
			generateInfo(openAPI2Model.getInfo(), infoJson);
		}
		jsonObject.addProperty("host", openAPI2Model.getHost());
		jsonObject.addProperty("basePath", openAPI2Model.getBasePath());

		if (!openAPI2Model.getSchemes().isEmpty()) {
			JsonArray schemes = new JsonArray();
			for (SchemeType scheme : openAPI2Model.getSchemes())
				schemes.add(scheme.getLiteral());
			jsonObject.add("schemes", schemes);
		}
		if (!openAPI2Model.getConsumes().isEmpty()) {
			JsonArray consumesList = new JsonArray();
			for (String consume : openAPI2Model.getConsumes())
				consumesList.add(consume);
			jsonObject.add("consumes", consumesList);
		}
		if (!openAPI2Model.getProduces().isEmpty()) {
			JsonArray producesList = new JsonArray();
			for (String produces : openAPI2Model.getConsumes())
				producesList.add(produces);
			jsonObject.add("produces", producesList);
		}
		if (!openAPI2Model.getPaths().isEmpty()) {
			JsonObject jsonPaths = new JsonObject();
			jsonObject.add("paths", jsonPaths);
			generatePaths(jsonPaths);

		}
		if (!openAPI2Model.getDefinitions().isEmpty()) {
			JsonObject jsonDefintions = new JsonObject();
			jsonObject.add("definitions", jsonDefintions);
			generateDefinitions(jsonDefintions);
		}
		if (!openAPI2Model.getParameters().isEmpty()) {
			JsonObject jsonParameters = new JsonObject();
			jsonObject.add("parameters", jsonParameters);
			generateParameters(jsonParameters);
		}
		if (!openAPI2Model.getResponses().isEmpty()) {
			JsonObject jsonResponses = new JsonObject();
			jsonObject.add("responses", jsonResponses);
			generateResponses(jsonResponses);
		}

		if (!openAPI2Model.getSecurityDefinitions().isEmpty()) {
			JsonObject securityDefinitions = new JsonObject();
			jsonObject.add("securityDefinitions", securityDefinitions);
			generateSecurityDefinitions(openAPI2Model, securityDefinitions);
		}
		if (!openAPI2Model.getSecurity().isEmpty()) {
			JsonArray security = new JsonArray();
			jsonObject.add("security", security);
			for (SecurityRequirement securityRequirement : openAPI2Model.getSecurity()) {
				JsonObject securityRequirementJson = new JsonObject();
				generateSecurity(securityRequirement, securityRequirementJson);
				security.add(securityRequirementJson);

			}

		}
		if (!openAPI2Model.getTags().isEmpty()) {
			JsonArray tags = new JsonArray();
			jsonObject.add("tags", tags);
			for (Tag tag : openAPI2Model.getTags()) {
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
		if (openAPI2Model.getExternalDocs() != null) {
			JsonObject externalDocs = new JsonObject();
			generateExternalDocs(openAPI2Model.getExternalDocs(), externalDocs);
			jsonObject.add("externalDocs", externalDocs);
		}

		return jsonObject;

	}

	private void generateSecurity(SecurityRequirement securityRequirement, JsonObject securityRequirementJson) {
		if (!securityRequirement.getSecuritySchemes().isEmpty()) {
			for(RequiredSecurityScheme requiredSecurityScheme: securityRequirement.getSecuritySchemes()) {
			JsonArray scopes = new JsonArray();
			securityRequirementJson.add(((ParameterEntryImpl)requiredSecurityScheme.getSecurityScheme().eContainer()).getKey(), scopes);
				for (SecurityScope scope : requiredSecurityScheme.getSecurityScopes())
					scopes.add(scope.getName());

		}

		}
	}

	private void generateExternalDocs(ExternalDocs externalDocs, JsonObject jsonExternalDocs) {
		if (externalDocs.getDescription() != null)
			jsonExternalDocs.addProperty("description", externalDocs.getDescription());
		if (externalDocs.getUrl() != null)
			jsonExternalDocs.addProperty("url", externalDocs.getUrl());

	}

	private void generateParameters(JsonObject jsonParameters) {
		for (Entry<String, Parameter> parameterEntry : openAPI2Model.getParameters().entrySet()) {
			JsonObject jsonParameter = new JsonObject();
			jsonParameters.add(parameterEntry.getKey(), jsonParameter);
			generateParameter(parameterEntry.getValue(), jsonParameter, true);
		}

	}

	private void generateResponses(JsonObject jsonResponses) {
		for (Entry<String, Response> responseEntry : openAPI2Model.getResponses().entrySet()) {
			JsonObject jsonResponse = new JsonObject();
			jsonResponses.add(responseEntry.getKey(), jsonResponse);
			generateResponse(responseEntry.getValue(), jsonResponse, true);
		}

	}

	private void generateSecurityDefinitions(API api, JsonObject jsonSecurityDefinitions) {
		for (Entry<String, SecurityScheme> securitySchemeEntry : api.getSecurityDefinitions().entrySet()) {
			JsonObject jsonSecurityDefinition = new JsonObject();
			jsonSecurityDefinitions.add(securitySchemeEntry.getKey(), jsonSecurityDefinition);
			generateSecurityScheme(securitySchemeEntry.getValue(), jsonSecurityDefinition);
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

	private void generatePaths(JsonObject jsonPaths) {
		for (Path path : openAPI2Model.getPaths()) {
			JsonObject jsonPathItem = new JsonObject();
			jsonPaths.add(path.getRelativePath(), jsonPathItem);
			generatePathItem(path, jsonPathItem);
		}

	}

	private void generatePathItem(Path path, JsonObject jsonOperations) {
		if (path.getGet() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("get", jsonOperation);
			generateOperation(path.getGet(), jsonOperation);

		}
		if (path.getPut() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("put", jsonOperation);
			generateOperation(path.getPut(), jsonOperation);

		}
		if (path.getPost() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("post", jsonOperation);
			generateOperation(path.getPost(), jsonOperation);

		}
		if (path.getDelete() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("delete", jsonOperation);
			generateOperation(path.getDelete(), jsonOperation);

		}
		if (path.getOptions() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("options", jsonOperation);
			generateOperation(path.getOptions(), jsonOperation);
		}
		if (path.getHead() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("head", jsonOperation);
			generateOperation(path.getHead(), jsonOperation);
		}
		if (path.getPatch() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("delete", jsonOperation);
			generateOperation(path.getPatch(), jsonOperation);
		}
		if (!path.getParameters().isEmpty()) {
			JsonArray paramatersJson = new JsonArray();
			for (Parameter parameter : path.getParameters()) {
				JsonObject parameterJson = new JsonObject();
				paramatersJson.add(parameterJson);
				boolean s = path.equals(parameter.getDeclaringContext());
				generateParameter(parameter, parameterJson, s);
			}
			jsonOperations.add("parameters", paramatersJson);
		}
	}

	private void generateOperation(Operation operation, JsonObject jsonOperation) {
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
				boolean s = operation.equals(parameter.getDeclaringContext())
						|| (parameter.getDeclaringContext() == null);
				generateParameter(parameter, parameterJson, s);
			}
			jsonOperation.add("parameters", paramatersJson);
		}
		if (!operation.getResponses().isEmpty()) {
			JsonObject responsesJson = new JsonObject();
			jsonOperation.add("responses", responsesJson);
			for (Entry<String, Response> responseEntry : operation.getResponses().entrySet()) {
				JsonObject responseJson = new JsonObject();
				responsesJson.add(responseEntry.getKey(), responseJson);
				boolean s = operation.equals(responseEntry.getValue().getDeclaringContext())
						|| (responseEntry.getValue().getDeclaringContext() == null);
				generateResponse(responseEntry.getValue(), responseJson, s);
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

	private void generateParameter(Parameter parameter, JsonObject parameterJson, boolean isDeclaringContext) {
		if (isDeclaringContext) {
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
				if (parameter.getSchema() != null) {
					boolean s = parameter.equals(parameter.getSchema().getDeclaringContext())
							|| (parameter.getSchema().getDeclaringContext() == null);
					JsonObject schemaJson = new JsonObject();
					parameterJson.add("schema", schemaJson);
					generateSchema(parameter.getSchema(), schemaJson, s);
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
		} else {
			parameterJson.addProperty("$ref", parameter.getRef());
		}

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

	private void generateResponse(Response responseDefinition,
			JsonObject responseJson , boolean isDeclaringContext) {
		if (isDeclaringContext) {
			responseJson.addProperty("description", responseDefinition.getDescription());
			if (responseDefinition.getSchema() != null) {
				boolean s = responseDefinition.equals(responseDefinition.getSchema().getDeclaringContext())
						|| (responseDefinition.getSchema().getDeclaringContext() == null);
				JsonObject schemaJson = new JsonObject();
				responseJson.add("schema", schemaJson);
				generateSchema(responseDefinition.getSchema(), schemaJson, s);
			}
			if (!responseDefinition.getHeaders().isEmpty()) {
				JsonObject headerJson = new JsonObject();
				for (Header header : responseDefinition.getHeaders()) {
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
			if (!responseDefinition.getExamples().isEmpty()) {
				JsonObject exampleJson = new JsonObject();
				for (Example example : responseDefinition.getExamples()) {
					exampleJson.addProperty(example.getMimeType(), example.getValue());
				}
				responseJson.add("examples", exampleJson);
			}
		} else {
			responseJson.addProperty("$ref", responseDefinition.getRef());

		}

	}

	private void generateDefinitions(JsonObject jsonDefinitions) {
		for (Entry<String, Schema> definitionEntry : openAPI2Model.getDefinitions().entrySet()) {
			JsonObject schemaJson = new JsonObject();
			jsonDefinitions.add(definitionEntry.getKey(), schemaJson);
			generateSchema(definitionEntry.getValue(), schemaJson, true);
		}

	}

	private void generateSchema(Schema schema, JsonObject schemaJson, boolean isDeclaringContext) {
		if (schema != null) {
			if (isDeclaringContext) {
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

				JsonArray requiredProperties = new JsonArray();
				for (Property property : schema.getProperties())
					if (property.getRequired() != null && property.getRequired() == true)
						requiredProperties.add(property.getName());
				if (requiredProperties.size() != 0)
					schemaJson.add("required", requiredProperties);

				if (!schema.getEnum().isEmpty()) {
					JsonArray enumArray = new JsonArray();
					for (String enumItem : schema.getEnum())
						enumArray.add(enumItem);
					schemaJson.add("enum", enumArray);
				}

				if (schema.getItems() != null) {
					JsonObject itemsJson = new JsonObject();
					boolean s = schema.equals(schema.getItems().getDeclaringContext())
							|| (schema.getItems().getDeclaringContext() == null);
					generateSchema(schema.getItems(), itemsJson, s);
					schemaJson.add("items", itemsJson);
				}
				if (!schema.getAllOf().isEmpty()) {
					JsonArray allOfJson = new JsonArray();
					for (Schema allOfItem : schema.getAllOf()) {
						JsonObject allOfItemJson = new JsonObject();
						boolean s = schema.equals(allOfItem.getDeclaringContext())
								|| (allOfItem.getDeclaringContext() == null);
						generateSchema(allOfItem, allOfItemJson, s);
						allOfJson.add(allOfItemJson);
					}
					schemaJson.add("allOf", allOfJson);
				}
				if (!schema.getProperties().isEmpty()) {
					JsonObject propertiesJson = new JsonObject();
					schemaJson.add("properties", propertiesJson);
					for (Property property : schema.getProperties()) {
						JsonObject propertyJson = new JsonObject();
						propertiesJson.add(property.getName(), propertyJson);
						boolean s = property.equals(property.getSchema().getDeclaringContext())
								|| (property.getSchema().getDeclaringContext() == null);
						generateSchema(property.getSchema(), propertyJson, s);
					}
				}
				if (schema.getAdditonalPropertiesAllowed() != null) {
					schemaJson.addProperty("additionalProperties", schema.getAdditonalPropertiesAllowed());
				}
				if (schema.getAdditonalProperties() != null) {
					JsonObject additionalProperties = new JsonObject();
					boolean s = schema.equals(schema.getAdditonalProperties().getDeclaringContext())
							|| (schema.getAdditonalProperties().getDeclaringContext() == null);
					generateSchema(schema.getAdditonalProperties(), additionalProperties, s);
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
					schemaJson.addProperty("example", schema.getExample());
			} else {
				schemaJson.addProperty("$ref", schema.getRef());
			}

		}

	}

	private void generateSecurityScheme(SecurityScheme securityScheme, JsonObject jsonSecurityScheme) {
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
