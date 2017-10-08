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
@JsonPropertyOrder({ "servlet-name", "servlet-class", "init-param" })
public class Servlet {

	@JsonProperty("servlet-name")
	private String servletName;
	@JsonProperty("servlet-class")
	private String servletClass;
	@JsonProperty("init-param")
	private InitParam initParam;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("servlet-name")
	public String getServletName() {
		return servletName;
	}

	@JsonProperty("servlet-name")
	public void setServletName(String servletName) {
		this.servletName = servletName;
	}

	@JsonProperty("servlet-class")
	public String getServletClass() {
		return servletClass;
	}

	@JsonProperty("servlet-class")
	public void setServletClass(String servletClass) {
		this.servletClass = servletClass;
	}

	@JsonProperty("init-param")
	public InitParam getInitParam() {
		return initParam;
	}

	@JsonProperty("init-param")
	public void setInitParam(InitParam initParam) {
		this.initParam = initParam;
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
