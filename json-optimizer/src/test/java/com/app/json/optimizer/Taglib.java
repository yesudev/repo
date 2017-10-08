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
@JsonPropertyOrder({ "taglib-uri", "taglib-location" })
public class Taglib {

	@JsonProperty("taglib-uri")
	private String taglibUri;
	@JsonProperty("taglib-location")
	private String taglibLocation;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("taglib-uri")
	public String getTaglibUri() {
		return taglibUri;
	}

	@JsonProperty("taglib-uri")
	public void setTaglibUri(String taglibUri) {
		this.taglibUri = taglibUri;
	}

	@JsonProperty("taglib-location")
	public String getTaglibLocation() {
		return taglibLocation;
	}

	@JsonProperty("taglib-location")
	public void setTaglibLocation(String taglibLocation) {
		this.taglibLocation = taglibLocation;
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
