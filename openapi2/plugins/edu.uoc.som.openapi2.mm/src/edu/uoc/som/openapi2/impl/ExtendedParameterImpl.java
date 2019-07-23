package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.ExtendedParameter;

public class ExtendedParameterImpl extends ParameterImpl implements ExtendedParameter{

	
	@Override
	public String getRef() {
		if(declaringContext instanceof ParameterEntryImpl)
			return "#/parameters/"+ ((ParameterEntryImpl) declaringContext).getKey();
		return "unknown";
	}
}
