package edu.uoc.som.openapi2;

import edu.uoc.som.openapi2.OpenAPI2Factory;

public interface ExtendedOpenAPI2Factory extends OpenAPI2Factory {
	
	API createAPI();
	
	Path createPath();
	
	Schema createSchema();
	
	Parameter createParameter();
	

}
