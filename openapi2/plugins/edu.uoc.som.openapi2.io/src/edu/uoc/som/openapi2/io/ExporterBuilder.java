package edu.uoc.som.openapi2.io;

import edu.uoc.som.openapi2.API;

public class ExporterBuilder {
	
	
	private boolean prettyPrinting;
	
	public ExporterBuilder() {
		
	}
	
	public ExporterBuilder setJsonPrettyPrinting() {
		prettyPrinting = true;
		return this;
	}
  
	public String exportJson(API openAPI2Model) {
		OpenAPI2Exporter export = new OpenAPI2Exporter(openAPI2Model,prettyPrinting);
		return export.toJsonFormat();
	}
	public String exportYaml(API openAPI2Model) {
		OpenAPI2Exporter export = new OpenAPI2Exporter(openAPI2Model,prettyPrinting);
		return export.toYamlFormat();
	}
}
