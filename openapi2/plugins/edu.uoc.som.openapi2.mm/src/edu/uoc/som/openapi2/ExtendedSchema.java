package edu.uoc.som.openapi2;

public interface ExtendedSchema extends Schema {

	Property getPropertyByName(String name);
	
	String getRef();
	
	String getName();
}
