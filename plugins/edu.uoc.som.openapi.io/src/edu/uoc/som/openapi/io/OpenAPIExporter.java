package edu.uoc.som.openapi.io;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import edu.uoc.som.openapi.API;
import edu.uoc.som.openapi.Info;
import edu.uoc.som.openapi.JSONDataType;
import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Parameter;
import edu.uoc.som.openapi.ParameterLocation;
import edu.uoc.som.openapi.Path;
import edu.uoc.som.openapi.Property;
import edu.uoc.som.openapi.Response;
import edu.uoc.som.openapi.Schema;
import edu.uoc.som.openapi.SchemeType;


public class OpenAPIExporter {


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
		
		return jsonObject;

	}

	private void generateInfo(Info info, JsonObject jsonInfo) {
		
		jsonInfo.addProperty("title", info.getTitle());	
		if(info.getTermsOfService() != null)
			jsonInfo.addProperty("termsOfService", info.getTermsOfService());
		if(info.getContact()!= null) {
			JsonObject jsonContact = new JsonObject();
			if(info.getContact().getName()!=null)
				jsonContact.addProperty("name", info.getContact().getName());
			if(info.getContact().getUrl()!=null)
				jsonContact.addProperty("url", info.getContact().getUrl());
			if(info.getContact().getEmail()!=null)
				jsonContact.addProperty("email", info.getContact().getEmail());
			jsonInfo.add("contact", jsonContact);
		}
		if(info.getLicense()!= null) {
			JsonObject jsonLicense = new JsonObject();
			if(info.getLicense().getName()!= null)
				jsonLicense.addProperty("name", info.getLicense().getName());
			if(info.getLicense().getUrl() != null)
				jsonLicense.addProperty("url", info.getLicense().getUrl());
			jsonInfo.add("license", jsonLicense);
		}
			jsonInfo.addProperty("version", info.getVersion());
	}

	private void generatePaths(API api, JsonObject jsonPaths) {
		for (Path path : api.getPaths()) {
			JsonObject jsonOperations = new JsonObject();
			jsonPaths.add(path.getRelativePath(), jsonOperations);
			generateOperations(api, path, jsonOperations);
		}

	}

	private  void generateOperations(API api, Path path, JsonObject jsonOperations) {
		if (path.getGet() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("get", jsonOperation);
			generateOperation(api, path.getGet(), jsonOperation);

		}
		if (path.getPost() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("post", jsonOperation);
			generateOperation(api, path.getPost(), jsonOperation);

		}
		if (path.getPut() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("put", jsonOperation);
			generateOperation(api, path.getPut(), jsonOperation);

		}
		if (path.getDelete() != null) {
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("delete", jsonOperation);
			generateOperation(api, path.getDelete(), jsonOperation);

		}
	}

	private static void generateOperation(API api, Operation operation, JsonObject jsonOperation) {
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
		// TODO externalDocs
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
		// TODO deprecated
		// TODO security

	}

	private static void generateParameter(API api, Parameter parameter, JsonObject parameterJson) {
		parameterJson.addProperty("name", parameter.getName());
		parameterJson.addProperty("in", parameter.getLocation().getLiteral());
		if (!parameter.getType().equals(JSONDataType.UNSPECIFIED))
			parameterJson.addProperty("type", parameter.getType().getLiteral());
		if (parameter.getType().equals(JSONDataType.ARRAY)) {
			parameterJson.addProperty("collectionFormat", "multi");
			JsonObject items = new JsonObject();
			items.addProperty("type", parameter.getItems().getType().getLiteral());
			parameterJson.add("items", items);
		}
		if (parameter.getDescription() != null)
			parameterJson.addProperty("description", parameter.getDescription());
		if (parameter.getRequired() != null)
			parameterJson.addProperty("required", parameter.getRequired());
		if (parameter.getLocation().equals(ParameterLocation.BODY)) {
			if (parameter.getSchema().getType().equals(JSONDataType.OBJECT)) {
				JsonObject refSchema = new JsonObject();
				refSchema.addProperty("$ref", parameter.getSchema().getRef());
				parameterJson.add("schema", refSchema);

			} else {
				// TODO array and primitive
			}
		}

	}

	private static void generateResponse(API api, Response response, JsonObject responseJson) {
		responseJson.addProperty("description", response.getDescription());
		if (response.getSchema() != null) {
			if (response.getSchema().getType().equals(JSONDataType.OBJECT)) {
				if(response.getSchema().getDeclaringContext()== api) {
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
						refSchema.addProperty("$ref",response.getSchema().getItems().getRef());
						schemaArray.add("items", refSchema);
					}

				}
			}

		}

	}

	private static void generateDefinitions(API api, JsonObject jsonDefinitions) {
		for (Schema definition : api.getDefinitions()) {
			JsonObject schemaJson = new JsonObject();
			jsonDefinitions.add(definition.getReferenceName(), schemaJson);
			generateSchema(api, definition, schemaJson);
		}

	}

	private static void generateSchema(API api, Schema schema, JsonObject schemaJson) {
		schemaJson.addProperty("type", schema.getType().getLiteral());
		if (!schema.getProperties().isEmpty()) {
			JsonObject propertiesJson = new JsonObject();
			schemaJson.add("properties", propertiesJson);
			for (Property property : schema.getProperties()) {
				JsonObject propertyJson = new JsonObject();
				propertiesJson.add(property.getReferenceName(), propertyJson);
				generateSchemaProperty(api,property.getSchema(), propertyJson);
			}

		}
	}

	private static void generateSchemaProperty(API api, Schema property, JsonObject propertyJson) {
		if (property.getType().equals(JSONDataType.OBJECT)) {
			propertyJson.addProperty("$ref", property.getRef());
		} else {
			if (property.getType().equals(JSONDataType.ARRAY)) {
				propertyJson.addProperty("type", JSONDataType.ARRAY.getLiteral());
				JsonObject items = new JsonObject();
				if (property.getItems().getType().equals(JSONDataType.OBJECT))
					items.addProperty("$ref", property.getItems().getRef());
				else
					items.addProperty("type", property.getItems().getType().getLiteral());
				propertyJson.add("items", items);

			} else {
				propertyJson.addProperty("type", property.getType().getLiteral());
			}
		}
	}

}
