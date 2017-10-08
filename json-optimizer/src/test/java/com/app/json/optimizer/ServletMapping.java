package com.app.json.optimizer;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "cofaxCDS", "cofaxEmail", "cofaxAdmin", "fileServlet", "cofaxTools" })
public class ServletMapping {

	@JsonProperty("cofaxCDS")
	private String cofaxCDS;
	@JsonProperty("cofaxEmail")
	private String cofaxEmail;
	@JsonProperty("cofaxAdmin")
	private String cofaxAdmin;
	@JsonProperty("fileServlet")
	private String fileServlet;
	@JsonProperty("cofaxTools")
	private String cofaxTools;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("cofaxCDS")
	public String getCofaxCDS() {
		return cofaxCDS;
	}

	@JsonProperty("cofaxCDS")
	public void setCofaxCDS(String cofaxCDS) {
		this.cofaxCDS = cofaxCDS;
	}

	@JsonProperty("cofaxEmail")
	public String getCofaxEmail() {
		return cofaxEmail;
	}

	@JsonProperty("cofaxEmail")
	public void setCofaxEmail(String cofaxEmail) {
		this.cofaxEmail = cofaxEmail;
	}

	@JsonProperty("cofaxAdmin")
	public String getCofaxAdmin() {
		return cofaxAdmin;
	}

	@JsonProperty("cofaxAdmin")
	public void setCofaxAdmin(String cofaxAdmin) {
		this.cofaxAdmin = cofaxAdmin;
	}

	@JsonProperty("fileServlet")
	public String getFileServlet() {
		return fileServlet;
	}

	@JsonProperty("fileServlet")
	public void setFileServlet(String fileServlet) {
		this.fileServlet = fileServlet;
	}

	@JsonProperty("cofaxTools")
	public String getCofaxTools() {
		return cofaxTools;
	}

	@JsonProperty("cofaxTools")
	public void setCofaxTools(String cofaxTools) {
		this.cofaxTools = cofaxTools;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
