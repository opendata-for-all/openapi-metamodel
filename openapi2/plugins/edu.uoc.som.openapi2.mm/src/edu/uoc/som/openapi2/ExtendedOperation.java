package edu.uoc.som.openapi2;

public interface ExtendedOperation  extends Operation {
	String getFullPath();
	String getHTTPMethod();
	
}
