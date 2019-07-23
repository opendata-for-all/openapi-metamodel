package edu.uoc.som.openapi2;

import org.eclipse.emf.common.util.EList;

public interface ExtendedAPI extends API {
	 
	EList<Operation> getAllOperations();
	 
	 Schema getSchemaByReference(String ref);
	 
	 Operation getOperationById(String operationId);
	 
	 Path getPathByRelativePath(String relativePath);
	 
	 Parameter getParameterByReference(String ref);
	 
	 Response getResponseDefinitionByReference(String ref);

}
