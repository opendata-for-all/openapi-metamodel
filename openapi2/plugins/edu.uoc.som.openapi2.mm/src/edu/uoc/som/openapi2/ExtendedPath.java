package edu.uoc.som.openapi2;

public interface ExtendedPath extends Path {

	Operation getOperationByHTTPMethod(String method);
}
