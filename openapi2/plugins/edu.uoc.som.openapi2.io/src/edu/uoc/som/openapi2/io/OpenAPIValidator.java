package edu.uoc.som.openapi2.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.ValidationMessage;

import edu.uoc.som.openapi2.io.model.OpenAPIValidationReport;


public class OpenAPIValidator {
	JsonSchema openAPIschema = null;

	public OpenAPIValidator() throws IOException {
		JsonSchemaFactory factory = JsonSchemaFactory.getInstance();
		InputStream stream = this.getClass().getResourceAsStream("/resources/schema.json");
		if(stream == null)
			stream = this.getClass().getResourceAsStream("/schema.json");
		openAPIschema = factory.getSchema(stream);
	}

	public OpenAPIValidationReport validate(File openAPIDef) throws  IOException {
		   ObjectMapper mapper = new ObjectMapper();
		  JsonNode node = mapper.readTree(openAPIDef);
		return new OpenAPIValidationReport(openAPIschema.validate(node));
	}

	public OpenAPIValidationReport validate(String openAPIDef) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return new OpenAPIValidationReport(openAPIschema.validate(mapper.readTree(openAPIDef)));
	}
}
