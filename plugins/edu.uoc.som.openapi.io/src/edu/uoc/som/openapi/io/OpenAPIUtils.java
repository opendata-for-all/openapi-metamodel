package edu.uoc.som.openapi.io;

import edu.uoc.som.openapi.API;
import edu.uoc.som.openapi.Definition;
import edu.uoc.som.openapi.Schema;

public class OpenAPIUtils {
	public static Definition getDefinitionFromSchema(API api, Schema schema) {
		for(Definition definition: api.getDefinitions()) {
			if(definition.getSchema().equals(schema))
				return definition;
		}
		return null;
	}
}
