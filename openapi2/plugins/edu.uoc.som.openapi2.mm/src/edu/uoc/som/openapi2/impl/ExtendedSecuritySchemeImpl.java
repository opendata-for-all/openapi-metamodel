package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.ExtendedSecurityScheme;
import edu.uoc.som.openapi2.SecurityScope;

public class ExtendedSecuritySchemeImpl extends SecuritySchemeImpl implements ExtendedSecurityScheme{
	
	@Override
	public SecurityScope getSecurityScopeByName(String name) {
		for(SecurityScope securityScope: getScopes())
			if(securityScope.getName().equals(name))
				return securityScope;
		return null;
	}

}
