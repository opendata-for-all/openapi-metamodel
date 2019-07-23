package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.ExtendedResponse;

public class ExtendedResponseImpl extends ResponseImpl implements ExtendedResponse {

	@Override
	public String getRef() {
		if (declaringContext instanceof ResponseDefinitionEntryImpl)
			return "#/responses/" + ((ResponseDefinitionEntryImpl) declaringContext).getKey();

		return "unkown";
	}

}
