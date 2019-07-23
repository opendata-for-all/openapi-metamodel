package edu.uoc.som.openapi2.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import edu.uoc.som.openapi2.API;
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
	
	public API fromFile(File file) throws IOException {
		OpenAPI2Importer importer = new OpenAPI2Importer();
		return importer.createOpenAPI2ModelFromFile(file, serializationFormat);
		
	}

	public API fromText(String text) {
		OpenAPI2Importer importer = new OpenAPI2Importer();
		return importer.createOpenAPI2ModelFromText(text, serializationFormat);
	}
	
	
}
