package edu.uoc.som.openapi2.io.exceptions;

import edu.uoc.som.openapi2.io.model.OpenAPIVersion;

public class UnsupportedOpenAPIVersionException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private OpenAPIVersion openAPIVersion;
	
	public UnsupportedOpenAPIVersionException(String message, OpenAPIVersion openAPIVersion) {
		super(message);
		this.openAPIVersion  = openAPIVersion;
	}

	public OpenAPIVersion getOpenAPIVersion() {
		return openAPIVersion;
	}


	

}
