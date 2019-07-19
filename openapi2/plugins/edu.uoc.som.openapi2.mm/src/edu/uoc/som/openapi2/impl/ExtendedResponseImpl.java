package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.ResponseContainer;

public class ExtendedResponseImpl extends ResponseImpl {

	@Override
	public String getRef() {
		ResponseContainer responseContainer = getDeclaringContext();
		if (responseContainer instanceof ResponseDefinitionEntryImpl)
			return "#/responses/" + ((ResponseDefinitionEntryImpl) responseContainer).getKey();

		return "unkown";
	}

}
