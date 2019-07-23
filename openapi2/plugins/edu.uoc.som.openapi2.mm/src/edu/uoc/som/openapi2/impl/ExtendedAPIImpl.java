package edu.uoc.som.openapi2.impl;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import edu.uoc.som.openapi2.ExtendedAPI;
import edu.uoc.som.openapi2.Operation;
import edu.uoc.som.openapi2.Parameter;
import edu.uoc.som.openapi2.Path;
import edu.uoc.som.openapi2.Response;
import edu.uoc.som.openapi2.Schema;

public class ExtendedAPIImpl extends APIImpl implements ExtendedAPI {
	
	@Override
	public EList<Operation> getAllOperations() {
		
		TreeIterator<EObject> allElements = this.eAllContents();
		EList<Operation> allOperations = ECollections.newBasicEList();
		while (allElements.hasNext()) {
			EObject object = allElements.next();
			if (object instanceof Operation) {
				allOperations.add((Operation) object);
			}
		}
		return allOperations;
	}
	
	@Override
	public Schema getSchemaByReference(String ref) {
		Set<Map.Entry<String,Schema>> definitions = this.getDefinitions().entrySet();
		for (Entry<String, Schema> definition : definitions) {
			String temp = definition.getValue().getRef();
			if (temp.equalsIgnoreCase(ref))
				return definition.getValue();
		}
		return null;
	}
	
	@Override
	public Operation getOperationById(String operationId) {
		EList<Operation> allOperations = getAllOperations();
		for (Operation operation : allOperations) {
			if (operation.getOperationId()!= null && operation.getOperationId().equals(operationId))
				return operation;
		}
		return null;
	}
	
	@Override
	public Path getPathByRelativePath(String relativePath) {
		for(Path path: getPaths()) {
			if(path.getRelativePath() != null && path.getRelativePath().equalsIgnoreCase(relativePath)) {
				return path;
			}
		}
		return null;
	}
	
	@Override
	public Parameter getParameterByReference(String ref) {
		Set<Map.Entry<String,Parameter>> parameters = this.getParameters().entrySet();
		for (Entry<String, Parameter> parameter : parameters) {
			String temp = parameter.getValue().getRef();
			if (temp.equalsIgnoreCase(ref))
				return parameter.getValue();
		}
		return null;
	}
	
	
@Override
public Response getResponseDefinitionByReference(String ref) {
	Set<Entry<String, Response>> responses = this.getResponses().entrySet();
	for (Entry<String, Response> response : responses) {
		String temp = response.getValue().getRef();
		if (temp.equalsIgnoreCase(ref))
			return response.getValue();
	}
	return null;
}

}
