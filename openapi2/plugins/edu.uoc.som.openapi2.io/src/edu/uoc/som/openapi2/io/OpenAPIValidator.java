package edu.uoc.som.openapi2.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import edu.uoc.som.openapi2.io.model.OpenAPIValidationReport;

public class OpenAPIValidator {
	JsonSchema openAPIschema = null;

	public OpenAPIValidator() throws IOException, ProcessingException {
		JsonNode openAPIJson = null;
		InputStream stream = this.getClass().getResourceAsStream("/resources/schema.json");
		if(stream == null)
			stream = this.getClass().getResourceAsStream("/schema.json");
		openAPIJson = JsonLoader.fromReader(new InputStreamReader(stream));
		JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
		openAPIschema = factory.getJsonSchema(openAPIJson);
	}

	public OpenAPIValidationReport validate(File openAPIDef) throws ProcessingException, IOException {
		return new OpenAPIValidationReport(openAPIschema.validate(JsonLoader.fromFile(openAPIDef)));
	}

	public OpenAPIValidationReport validate(String openAPIDef) throws ProcessingException, IOException {
		return new OpenAPIValidationReport(openAPIschema.validate(JsonLoader.fromString(openAPIDef)));
	}
}
