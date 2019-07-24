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
import com.google.gson.JsonPrimitive;

public class Utils {

	public static void saveOpenAPIDefintion(String jsonOutput, File output) throws IOException {
		FileWriter fileWritter = new FileWriter(output.getPath(), false);
		BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
		bufferWritter.write(jsonOutput);
		bufferWritter.close();
		
	}
	@SuppressWarnings("unchecked")
	public static JsonElement convertYamlToGson(String yamlString) {
	    Yaml yaml= new Yaml();
	    Map<String, Object>  map = (Map<String, Object>) yaml.load(yamlString);

	    return wrapSnakeObject(map);
	}
	@SuppressWarnings("unchecked")
	public static String convertJsonToYaml(String jsonText, boolean pretty) {
		DumperOptions options = new DumperOptions();
	      options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
	      options.setPrettyFlow(pretty);
		 Yaml yaml= new Yaml(options);
		Map<String, Object>  map = (Map<String, Object>) yaml.load(jsonText);
		return yaml.dump(map);
	}
	
	// taken from https://stackoverflow.com/questions/23744216/how-do-i-convert-from-yaml-to-json-in-java
	public static JsonElement wrapSnakeObject(Object o) {

	    //NULL => JsonNull
	    if (o == null)
	        return JsonNull.INSTANCE;

	    // Collection => JsonArray
	    if (o instanceof Collection) {
	        JsonArray array = new JsonArray();
	        for (Object childObj : (Collection<?>)o)
	            array.add(wrapSnakeObject(childObj));
	        return array;
	    }

	    // Array => JsonArray
	    if (o.getClass().isArray()) {
	        JsonArray array = new JsonArray();

	        int length = Array.getLength(array);
	        for (int i=0; i<length; i++)
	            array.add(wrapSnakeObject(Array.get(array, i)));

	        return array;
	    }

	    // Map => JsonObject
	    if (o instanceof Map) {
	        Map<?, ?> map = (Map<?, ?>)o;

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
	        return new JsonPrimitive((String)o);
	    if (o instanceof Number)
	        return new JsonPrimitive((Number)o);
	    if (o instanceof Character)
	        return new JsonPrimitive((Character)o);
	    if (o instanceof Boolean)
	        return new JsonPrimitive((Boolean)o);

	    // otherwise.. string is a good guess
	    return new JsonPrimitive(String.valueOf(o));
	}
}
