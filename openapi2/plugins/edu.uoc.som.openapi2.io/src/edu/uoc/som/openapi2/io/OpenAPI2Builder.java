package edu.uoc.som.openapi2.io;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import edu.uoc.som.openapi2.API;
import edu.uoc.som.openapi2.io.exceptions.OpenAPIProcessingException;
import edu.uoc.som.openapi2.io.exceptions.OpenAPIValidationException;
import edu.uoc.som.openapi2.io.exceptions.UnsupportedOpenAPIVersionException;
import edu.uoc.som.openapi2.io.model.SerializationFormat;

public class OpenAPI2Builder {


	private SerializationFormat serializationFormat;
	
	

	
	public OpenAPI2Builder setSerializationFormat(SerializationFormat serializationFormat){
		this.serializationFormat = serializationFormat;
		return this;
	}
	
	public API fromFile(File file) throws OpenAPIValidationException, IOException, OpenAPIProcessingException, UnsupportedOpenAPIVersionException {
		OpenAPI2Importer importer = new OpenAPI2Importer();
		return importer.createOpenAPI2ModelFromFile(file, serializationFormat);
		
	}

	public API fromText(String text) throws IOException, OpenAPIValidationException,  OpenAPIProcessingException, UnsupportedOpenAPIVersionException {
		OpenAPI2Importer importer = new OpenAPI2Importer();
		return importer.createOpenAPI2ModelFromText(text, serializationFormat);
	}
	
	public API fromURL(String url) throws MalformedURLException, IOException, OpenAPIValidationException, OpenAPIProcessingException, UnsupportedOpenAPIVersionException {
		OpenAPI2Importer importer = new OpenAPI2Importer();
		return importer.createOpenAPI2ModelFromURL(url, serializationFormat);
		
	}
	
	
}
