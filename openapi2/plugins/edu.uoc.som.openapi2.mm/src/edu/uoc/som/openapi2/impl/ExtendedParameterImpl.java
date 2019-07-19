package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.ParameterContainer;

public class ExtendedParameterImpl extends ParameterImpl {

	
	@Override
	public String getRef() {
		ParameterContainer declaringContainer = getDeclaringContext();
		if(declaringContext instanceof ParameterEntryImpl)
			return "#/parameters/"+ ((ParameterEntryImpl) declaringContainer).getKey();
		return "unknown";
	}
}
