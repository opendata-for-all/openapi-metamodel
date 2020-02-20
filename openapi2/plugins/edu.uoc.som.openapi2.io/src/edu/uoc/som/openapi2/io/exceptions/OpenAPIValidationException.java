package edu.uoc.som.openapi2.io.exceptions;

import edu.uoc.som.openapi2.io.model.OpenAPIValidationReport;

public class OpenAPIValidationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private OpenAPIValidationReport report; 
	
	public OpenAPIValidationException(String message, OpenAPIValidationReport report) {
		super(message);
		this.report = report;	
	}
	public OpenAPIValidationReport getReport() {
		return report;
	}

	
}
