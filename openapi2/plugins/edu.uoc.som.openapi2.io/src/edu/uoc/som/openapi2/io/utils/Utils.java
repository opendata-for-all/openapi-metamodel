package edu.uoc.som.openapi2.io.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

import edu.uoc.som.openapi2.io.model.OpenAPIVersion;
import edu.uoc.som.openapi2.io.model.SerializationFormat;

public class Utils {

	public static void saveOpenAPIDefintion(String jsonOutput, File output) throws IOException {
		FileWriter fileWritter = new FileWriter(output.getPath(), false);
		BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
		bufferWritter.write(jsonOutput);
		bufferWritter.close();

	}

	@SuppressWarnings("unchecked")
	public static JsonElement convertYamlToGson(String yamlString) {
		Yaml yaml = new Yaml();
		Map<String, Object> map = (Map<String, Object>) yaml.load(yamlString);

		return wrapSnakeObject(map);
	}

	@SuppressWarnings("unchecked")
	public static String convertJsonToYaml(String jsonText, boolean pretty) {
		DumperOptions options = new DumperOptions();
		options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
		options.setPrettyFlow(pretty);
		Yaml yaml = new Yaml(options);
		Map<String, Object> map = (Map<String, Object>) yaml.load(jsonText);
		return yaml.dump(map);
	}

	@SuppressWarnings("unchecked")
	public static SerializationFormat discoverFormat(String definition) {
		try {
			new JsonParser().parse(definition);
			return SerializationFormat.JSON;
		} catch (JsonParseException e) {
			// Not a json
		}
		try {
			Yaml yaml = new Yaml();
			Map<String, Object> map = (Map<String, Object>) yaml.load(definition);
			return SerializationFormat.YAML;
		} catch (Exception e) {
			// Not a yaml
		}
		return null;
	}

	public static OpenAPIVersion discoverOpenAPIVerison(JsonObject jsonObject) {
		if (jsonObject.has("swagger"))
			switch (jsonObject.get("swagger").getAsString()) {
			case "1.2":
				return OpenAPIVersion.V1_2;
			case "2.0":
				return OpenAPIVersion.V2_0;
			default:
				return null;
			}
		if (jsonObject.has("openapi"))
			switch (jsonObject.get("openapi").getAsString()) {
			case "3.0.0":
				return OpenAPIVersion.V3_0_0;
			case "3.0.1":
				return OpenAPIVersion.V3_0_1;
			case "3.0.2":
				return OpenAPIVersion.V3_0_2;

			default:
				return null;
			}
		return null;

	}

	public static String printOpenPIVersion(OpenAPIVersion openAPIVersion) {
		switch (openAPIVersion) {
		case V1_2:
			return "1.2";
		case V2_0:
			return "2.0";
		case V3_0_0:
			return "3.0.0";
		case V3_0_1:
			return "3.0.1";
		case V3_0_2:
			return "3.0.2";

		default:
			return null;
		}
	}

	// taken from
	// https://stackoverflow.com/questions/23744216/how-do-i-convert-from-yaml-to-json-in-java
	public static JsonElement wrapSnakeObject(Object o) {

		// NULL => JsonNull
		if (o == null)
			return JsonNull.INSTANCE;

		// Collection => JsonArray
		if (o instanceof Collection) {
			JsonArray array = new JsonArray();
			for (Object childObj : (Collection<?>) o)
				array.add(wrapSnakeObject(childObj));
			return array;
		}

		// Array => JsonArray
		if (o.getClass().isArray()) {
			JsonArray array = new JsonArray();

			int length = Array.getLength(array);
			for (int i = 0; i < length; i++)
				array.add(wrapSnakeObject(Array.get(array, i)));

			return array;
		}

		// Map => JsonObject
		if (o instanceof Map) {
			Map<?, ?> map = (Map<?, ?>) o;

			JsonObject jsonObject = new JsonObject();
			for (final Map.Entry<?, ?> entry : map.entrySet()) {
				final String name = String.valueOf(entry.getKey());
				final Object value = entry.getValue();
				jsonObject.add(name, wrapSnakeObject(value));
			}

			return jsonObject;
		}

		// everything else => JsonPrimitive
		if (o instanceof String)
			return new JsonPrimitive((String) o);
		if (o instanceof Number)
			return new JsonPrimitive((Number) o);
		if (o instanceof Character)
			return new JsonPrimitive((Character) o);
		if (o instanceof Boolean)
			return new JsonPrimitive((Boolean) o);

		// otherwise.. string is a good guess
		return new JsonPrimitive(String.valueOf(o));
	}
}
