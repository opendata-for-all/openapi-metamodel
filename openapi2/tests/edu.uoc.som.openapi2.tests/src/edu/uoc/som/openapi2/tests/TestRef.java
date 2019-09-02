package edu.uoc.som.openapi2.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import org.junit.Test;

import edu.uoc.som.openapi2.API;
import edu.uoc.som.openapi2.Operation;
import edu.uoc.som.openapi2.Property;
import edu.uoc.som.openapi2.Schema;
import edu.uoc.som.openapi2.io.OpenAPI2Builder;
import edu.uoc.som.openapi2.io.model.SerializationFormat;

public class TestRef {

	@Test
	public void testRefProperty() {

		try {
			File input = new File("resources/inputs/allOf-with-ref.json");
			API apiModel = new OpenAPI2Builder().setSerializationFormat(SerializationFormat.JSON).fromFile(input);
			Schema fish = apiModel.getSchemaByReference("#/definitions/Fish");
			Property categoty = fish.getAllOf().get(1).getPropertyByName("category");
			assertTrue(categoty.getSchema()!=null);
	
		} catch (Exception e) {
			fail(e.getLocalizedMessage());
		}

	}
	
	@Test
	public void testRefResponse() {

		try {
			File input = new File("resources/inputs/allOf-with-ref.json");
			API apiModel = new OpenAPI2Builder().setSerializationFormat(SerializationFormat.JSON).fromFile(input);
			Operation getCats = apiModel.getOperationById("getCats");
			Schema response = getCats.getResponses().get("200").getSchema();
			
			assertTrue(response.getItems()!=null);
	
		} catch (Exception e) {
			fail(e.getLocalizedMessage());
		}

	}

}
