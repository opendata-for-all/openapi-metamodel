package edu.uoc.som.openapi2.io;

import java.io.File;
import java.io.IOException;

import com.github.fge.jsonschema.core.exceptions.ProcessingException;

import edu.uoc.som.openapi2.API;
import edu.uoc.som.openapi2.io.exceptions.OpenAPIValidationException;
import edu.uoc.som.openapi2.io.model.SerializationFormat;

public class OpenAPI2Builder {


	private SerializationFormat serializationFormat;
	
	
	public OpenAPI2Builder() {
		//JSON is the default format
		serializationFormat = SerializationFormat.JSON;
	}
	
	public OpenAPI2Builder setSerializationFormat(SerializationFormat serializationFormat){
		this.serializationFormat = serializationFormat;
		return this;
	}
	
	public API fromFile(File file) throws IOException, ProcessingException, OpenAPIValidationException {
		OpenAPI2Importer importer = new OpenAPI2Importer();
		return importer.createOpenAPI2ModelFromFile(file, serializationFormat);
		
	}

	public API fromText(String text) throws ProcessingException, IOException, OpenAPIValidationException {
		OpenAPI2Importer importer = new OpenAPI2Importer();
		return importer.createOpenAPI2ModelFromText(text, serializationFormat);
	}
	
	
}
