package edu.uoc.som.openapi2.commons;

import java.util.Map;
import java.util.Objects;

import edu.uoc.som.openapi2.API;
import edu.uoc.som.openapi2.Operation;
import edu.uoc.som.openapi2.Parameter;
import edu.uoc.som.openapi2.Property;
import edu.uoc.som.openapi2.Schema;
import edu.uoc.som.openapi2.commons.comparators.BasicComparator;
import edu.uoc.som.openapi2.mapping.Mapping;
import edu.uoc.som.openapi2.mapping.OpenAPI2MappingFactory;
import edu.uoc.som.openapi2.mapping.PropertyToParameter;
import edu.uoc.som.openapi2.mapping.PropertyToProperty;

public class Heuristics {

	
	public static OpenAPI2MappingFactory factory = OpenAPI2MappingFactory.eINSTANCE;
	
	/**
	 * Discovers links between the properties and the parameters
	 * 
	 * @param api source API
	 * @return a {@link Mapping} instance holding the discovered links
	 */
	public static Mapping discoverLinks(API api) {
		Mapping mapping = factory.createMapping();
		
		for(Map.Entry<String, Schema> sourceDefinition: api.getDefinitions()) {
			for(Property sourceSchemaProperty: sourceDefinition.getValue().getProperties()) {
				//We compare properties with properties;
				for(Map.Entry<String, Schema> targetDefinition: api.getDefinitions()) {
					for(Property targetSchemaProperty: targetDefinition.getValue().getProperties()) { 
						
						if(Objects.compare(sourceSchemaProperty.getName(), targetSchemaProperty.getName(), new BasicComparator(sourceDefinition.getKey(), null, true))==0) {
							PropertyToProperty propertyToProperty = factory.createPropertyToProperty();
							propertyToProperty.setSource(sourceSchemaProperty);
							propertyToProperty.setTarget(targetSchemaProperty);
							mapping.getPropertyToPropertyMappings().add(propertyToProperty);
						}
					}
			}
				//We compare properties with parameters
				for(Operation operation : api.getAllOperations())
					for(Parameter parameter: operation.getParameters()) {
						if(Objects.compare(sourceSchemaProperty.getName(), parameter.getName(), new BasicComparator(sourceDefinition.getKey(), null, false))==0) {
							PropertyToParameter propertyToParameter = factory.createPropertyToParameter();
							propertyToParameter.setSource(sourceSchemaProperty);
							propertyToParameter.setTarget(parameter);
							mapping.getPropertyToParameterMappings().add(propertyToParameter);
						}
					}
				
		}
		
		}
		return mapping;
		
	}
}
