
package edu.uoc.som.openapi2.tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.google.gson.JsonObject;

import edu.uoc.som.openapi2.API;
import edu.uoc.som.openapi2.io.OpenAPI2Builder;
import edu.uoc.som.openapi2.io.OpenAPI2Exporter;
import edu.uoc.som.openapi2.io.exceptions.OpenAPIProcessingException;
import edu.uoc.som.openapi2.io.exceptions.OpenAPIValidationException;
import edu.uoc.som.openapi2.io.model.SerializationFormat;

public class TestSecurity {

	public TestSecurity() {
	}

	@Test
	public void test() throws OpenAPIValidationException, OpenAPIProcessingException, IOException {

	
			File input = new File("resources/inputs/openapi-security.json");
			API apiModel = new OpenAPI2Builder().setSerializationFormat(SerializationFormat.JSON).fromFile(input);
			OpenAPI2Exporter export = new OpenAPI2Exporter(apiModel,false);
			JsonObject def = export.toJsonObject();
			JsonObject removeSecurityOperation = def.get("paths").getAsJsonObject().get("/path").getAsJsonObject().get("post").getAsJsonObject();
			assertTrue(removeSecurityOperation.has("security"));
			assertTrue(removeSecurityOperation.get("security").isJsonArray());
			assertTrue(removeSecurityOperation.get("security").getAsJsonArray().size() == 0);
		

	}

}
