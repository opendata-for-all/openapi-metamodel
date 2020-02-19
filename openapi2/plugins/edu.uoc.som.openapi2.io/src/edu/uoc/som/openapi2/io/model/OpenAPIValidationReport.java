package edu.uoc.som.openapi2.io.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.networknt.schema.ValidationMessage;

public class OpenAPIValidationReport {

	private boolean success = false; 
	private Set<ValidationMessage> errors;
	private List<String> errorMessages;
	
	
	public OpenAPIValidationReport(Set<ValidationMessage> errors) {
		this.errors = errors;
		errorMessages = new LinkedList<String>();
		success = (errors.size()>0)?false:true;
		if(!success) {
			errors.forEach(e -> errorMessages.add(e.getMessage()));
		}
		
		
	}



	public boolean isSuccess() {
		return success;
	}

	public Set<ValidationMessage> getErrors() {
		return errors;
	}






	
	

	
}
