package edu.uoc.som.openapi2.io.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class IOUtils {

	public static void saveOpenAPIDefintion(JsonObject jsonDefinition, File output) throws IOException {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonOutput = gson.toJson(jsonDefinition); 
		FileWriter fileWritter = new FileWriter(output.getPath(), false);
		BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
		bufferWritter.write(jsonOutput);
		bufferWritter.close();
		
	}
}
