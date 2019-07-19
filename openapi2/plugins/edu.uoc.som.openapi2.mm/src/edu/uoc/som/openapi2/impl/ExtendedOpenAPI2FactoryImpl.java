package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.API;
import edu.uoc.som.openapi2.Parameter;
import edu.uoc.som.openapi2.Path;
import edu.uoc.som.openapi2.Schema;

public class ExtendedOpenAPI2FactoryImpl extends OpenAPI2FactoryImpl {

	public ExtendedOpenAPI2FactoryImpl() {
		super();
	}
	
	@Override
	public API createAPI() {
		return new ExtendedAPIImpl();
	}
	
	@Override
	public Path createPath() {
		return new ExtendedPathImpl();
	}
	
	@Override
	public Schema createSchema() {
		return new ExtendedSchemaImpl();
	}
	
	@Override
	public Parameter createParameter() {
		return new ExtendedParameterImpl();
	}
	
}
