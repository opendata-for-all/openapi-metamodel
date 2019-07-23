package edu.uoc.som.openapi2;

public interface ExtendedSecurityScheme extends SecurityScheme{
	
	SecurityScope getSecurityScopeByName(String name);

}
