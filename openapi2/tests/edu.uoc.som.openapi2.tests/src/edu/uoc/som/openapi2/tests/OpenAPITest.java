
package edu.uoc.som.openapi2.tests;

import static org.junit.Assert.fail;

import java.io.File;

import org.junit.Test;

import edu.uoc.som.openapi2.API;
import edu.uoc.som.openapi2.io.ExporterBuilder;
import edu.uoc.som.openapi2.io.OpenAPI2Builder;
import edu.uoc.som.openapi2.io.model.SerializationFormat;
import edu.uoc.som.openapi2.io.utils.Utils;

public class OpenAPITest {

	public OpenAPITest() {
	}

	@Test
	public void test() {

		try {
			File input = new File("resources/inputs/petstore.json");
			File output = File.createTempFile("petstore-gen", ".json");
			API apiModel = new OpenAPI2Builder().setSerializationFormat(SerializationFormat.JSON).fromFile(input);
			Utils.saveOpenAPIDefintion(new ExporterBuilder().setJsonPrettyPrinting().exportJson(apiModel), output);
		} catch (Exception e) {

			fail(e.getMessage());
		}

	}

}
