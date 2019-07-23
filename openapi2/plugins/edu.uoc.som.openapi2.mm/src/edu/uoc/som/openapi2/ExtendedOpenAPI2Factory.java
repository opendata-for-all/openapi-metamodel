package edu.uoc.som.openapi2;

import edu.uoc.som.openapi2.OpenAPI2Factory;

public interface ExtendedOpenAPI2Factory extends OpenAPI2Factory{
	
	ExtendedOpenAPI2Factory eINSTANCE = edu.uoc.som.openapi2.impl.ExtendedOpenAPI2FactoryImpl.init();

	
	ExtendedAPI createAPI();
	
	Path createPath();
	
	Schema createSchema();
	
	Parameter createParameter();
	

}
