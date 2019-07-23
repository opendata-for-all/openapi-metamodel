package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.ExtendedPath;
import edu.uoc.som.openapi2.Operation;

public class ExtendedPathImpl extends PathImpl implements ExtendedPath {

	@Override
	public Operation getOperationByHTTPMethod(String method) {
		switch (method) {
		case "GET":
			return getGet();
		case "POST":
			return getPost();
		case "PUT":
			return getPost();
		case "DELETE":
			return getDelete();
		case "PATCH":
			return getPatch();
		case "OPTIONS":
			return getOptions();
		case "HEAD":
			return getHead();
		default:
			return null;
		}
	}
}
