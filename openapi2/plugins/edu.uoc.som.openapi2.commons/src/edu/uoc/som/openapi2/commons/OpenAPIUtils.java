package edu.uoc.som.openapi2.commons;

import static java.util.Objects.nonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import edu.uoc.som.openapi2.API;
import edu.uoc.som.openapi2.JSONDataType;
import edu.uoc.som.openapi2.Operation;
import edu.uoc.som.openapi2.Parameter;
import edu.uoc.som.openapi2.ParameterLocation;
import edu.uoc.som.openapi2.Path;
import edu.uoc.som.openapi2.Property;
import edu.uoc.som.openapi2.Response;
import edu.uoc.som.openapi2.Schema;
import edu.uoc.som.openapi2.SecurityRequirement;
import edu.uoc.som.openapi2.SecurityScheme;
import edu.uoc.som.openapi2.SecurityScope;

public class OpenAPIUtils {

	/**
	 * Get the list of operations which include security
	 * 
	 * @param api The input API
	 * @return The list of operations
	 */
	public static List<Operation> getOperationsIncludingSecurity(API api) {

		List<Operation> result = new ArrayList<Operation>();
		for (Operation operation : api.getAllOperations()) {
			if (!operation.getSecurity().isEmpty()) {
				result.add(operation);
			}
		}
		return null;

	}

	/**
	 * Returns whether the operation need authentication or not
	 * 
	 * @param operation The input operation
	 * @return	{true} if the operation needs authentication or {false} otherwise
	 */
	public static boolean isAuthenticationRequired(Operation operation) {
		API api = ((Path) operation.eContainer()).getApi();
		if (!api.getSecurity().isEmpty()) {
			if (operation.getSecurity().size() == 1 && operation.getSecurity().get(0).getSecuritySchemes().isEmpty())
				return false;
			else
				return true;
		} else if (operation.getSecurity().isEmpty())
			return false;
		else if (operation.getSecurity().get(0).getSecuritySchemes().isEmpty())
			return false;
		else
			return true;
	}

	public static List<SecurityRequirement> getAuthentication(Operation operation) {
		API api = ((Path) operation.eContainer()).getApi();
		if (!api.getSecurity().isEmpty()) {
			if (operation.getSecurity().size() == 1 && operation.getSecurity().get(0).getSecuritySchemes().isEmpty())
				return new ArrayList<SecurityRequirement>();
			if (!operation.getSecurity().isEmpty())
				return operation.getSecurity();
			else
				return api.getSecurity();
		} else
			return operation.getSecurity();
	}

	public static List<Operation> getAllOperationsOnPath(Path path) {
		List<Operation> operations = new ArrayList<>();
		if (nonNull(path.getGet())) {
			operations.add(path.getGet());
		}
		if (nonNull(path.getPost())) {
			operations.add(path.getPost());
		}
		if (nonNull(path.getDelete())) {
			operations.add(path.getDelete());
		}
		if (nonNull(path.getPatch())) {
			operations.add(path.getPatch());
		}
		if (nonNull(path.getOptions())) {
			operations.add(path.getOptions());
		}
		if (nonNull(path.getPut())) {
			operations.add(path.getPut());
		}
		if (nonNull(path.getHead())) {
			operations.add(path.getHead());
		}
		return operations;
	}

	public static Operation getOperationByPathAndHTTPMethod(String relativePath, String httpMethod, API api) {
		Path path = api.getPathByRelativePath(relativePath);
		if (nonNull(path)) {
			return path.getOperationByHTTPMethod(httpMethod);
		}
		return null;

	}


	public static List<Operation> getAllOperationsReturningSchema(API api, Schema schema) {
		List<Operation> operationList = new ArrayList<Operation>();
		for(Operation operation: api.getAllOperations()) {
			Schema s = getReturnedSchema(operation);
			if(s!= null && s.equals(schema))
			operationList.add(operation);
		}
		return operationList;
		
	}
	
	public static List<Operation> getAllOperationsConsumingSchema(API api,Schema schema) {
		List<Operation> operationList = new ArrayList<Operation>();
		for(Operation operation: api.getAllOperations()) {
			Schema s = getConsumedSchema(operation);
			if(s!= null && s.equals(schema))
			operationList.add(operation);
		}
		return operationList;
		
	}
	

	
	public static SecurityScope getSecurityScopeByName(String scope, SecurityScheme securityScheme) {
		for(SecurityScope s: securityScheme.getScopes())
				if(scope.equals(s.getName()))
					return s;
		return null;
	}
	
	public static Schema getConsumedSchema(Operation operation) {
		for(Parameter parameter: operation.getParameters()) {
			if(parameter.getLocation().equals(ParameterLocation.BODY))
				if(parameter.getSchema().getType().equals(JSONDataType.ARRAY))
					return parameter.getSchema().getItems();
					else
						return parameter.getSchema();
			}
		return null;
	}


	public static Schema getReturnedSchema(Operation operation) {
		for(Entry<String, Response> response: operation.getResponses()) {
			if(((response.getKey().equals("200") || response.getKey().equals("200") ))   && response.getValue()!=null && response.getValue().getSchema()!= null && response.getValue().getSchema().getType().equals(JSONDataType.ARRAY)) {
				return response.getValue().getSchema().getItems();
			
			}
			if(((response.getKey().equals("200") || response.getKey().equals("200") ))  &&  response.getValue()!=null  && response.getValue().getSchema()!= null && response.getValue().getSchema().getType().equals(JSONDataType.OBJECT)) {
				return response.getValue().getSchema();
			}
		}
		return null;
	}


	public static String getDecoratedName(Schema schema) {
		if( schema.getType().equals(JSONDataType.OBJECT)) {
			if(schema.getName()!= null)
				return schema.getName();
			else 
				return "undefined";
		}
		if(schema.getType().equals(JSONDataType.ARRAY))
			return getDecoratedName(schema.getItems())+" [*]";
		return "undefined";
	
	}
	
	public static boolean isObject(Schema schema) {
		if (schema.getType().equals(JSONDataType.OBJECT))
			return true;

		if (!schema.getProperties().isEmpty())
			return true;

		if (!schema.getAllOf().isEmpty())
			return true;

		return false;
	}

	public static boolean isArrayOfObjects(Schema schema) {

		if (schema.getType().equals(JSONDataType.ARRAY) && isObject(schema.getItems()))
			return true;

		return false;
	}
	
	public static boolean isPrimitive(Schema property) {
		if (property.getType().equals(JSONDataType.BOOLEAN) || property.getType().equals(JSONDataType.INTEGER)
				|| property.getType().equals(JSONDataType.NUMBER) || property.getType().equals(JSONDataType.STRING))
			return true;
		if (property.getType().equals(JSONDataType.ARRAY) && (property.getItems().getType().equals(JSONDataType.BOOLEAN)
				|| property.getItems().getType().equals(JSONDataType.INTEGER)
				|| property.getItems().getType().equals(JSONDataType.NUMBER)
				|| property.getItems().getType().equals(JSONDataType.STRING)))
			return true;
		return false;
	}
	
	public static boolean isSingleValuedPrimitive(Schema schema) {
		if (schema.getType().equals(JSONDataType.BOOLEAN) || schema.getType().equals(JSONDataType.INTEGER)
				|| schema.getType().equals(JSONDataType.NUMBER) || schema.getType().equals(JSONDataType.STRING))
			return true;
		return false;
	}
	
	public static boolean isMultiValuedPrimitive(Schema schema) {
		if (schema.getType().equals(JSONDataType.ARRAY) && (schema.getItems().getType().equals(JSONDataType.BOOLEAN)
				|| schema.getItems().getType().equals(JSONDataType.INTEGER)
				|| schema.getItems().getType().equals(JSONDataType.NUMBER)
				|| schema.getItems().getType().equals(JSONDataType.STRING)))
			return true;
		return false;
	}
	
	public static List<Property> getSingleValuedPrimitiveProperties(Schema schema){
		List<Property> properties = new ArrayList<Property>();
		for(Property property: schema.getProperties()) 
			if(isSingleValuedPrimitive(property.getSchema()))
				properties.add(property);
			return properties;	
	}
	
	public static List<Property> getMultiValuedPrimitiveProperties(Schema schema){
		List<Property> properties = new ArrayList<Property>();
		for(Property property: schema.getProperties()) 
			if(isMultiValuedPrimitive(property.getSchema()))
				properties.add(property);
			return properties;	
		
	}

}
