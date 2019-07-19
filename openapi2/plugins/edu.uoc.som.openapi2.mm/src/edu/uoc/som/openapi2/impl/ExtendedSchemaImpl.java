package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.Property;
import edu.uoc.som.openapi2.SchemaContainer;

public class ExtendedSchemaImpl extends SchemaImpl {

	
	@Override
	public Property getPropertyByName(String name) {
		for (Property property : getProperties())
			if (property.getName().equals(name))
				return property;
		return null;
	}
	
	@Override
	public String getRef() {
		SchemaContainer schemaContext = getDeclaringContext();
		if(schemaContext instanceof SchemaEntryImpl)
			return "#/definitions/"+((SchemaEntryImpl)schemaContext).getKey();
		return "unknown";
	}
}
