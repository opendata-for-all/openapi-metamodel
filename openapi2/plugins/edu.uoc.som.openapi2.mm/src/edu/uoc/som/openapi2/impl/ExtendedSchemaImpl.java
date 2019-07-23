package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.ExtendedSchema;
import edu.uoc.som.openapi2.Property;

public class ExtendedSchemaImpl extends SchemaImpl implements ExtendedSchema {

	
	@Override
	public Property getPropertyByName(String name) {
		for (Property property : getProperties())
			if (property.getName().equals(name))
				return property;
		return null;
	}
	
	@Override
	public String getRef() {
		if(declaringContext instanceof SchemaEntryImpl)
			return "#/definitions/"+((SchemaEntryImpl)declaringContext).getKey();
		return "unknown";
	}
}
