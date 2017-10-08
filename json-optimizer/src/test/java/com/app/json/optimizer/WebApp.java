package com.app.json.optimizer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "servlet", "servlet-mapping", "taglib" })
public class WebApp {

	@JsonProperty("servlet")
	private List<Servlet> servlet = null;
	@JsonProperty("servlet-mapping")
	private ServletMapping servletMapping;
	@JsonProperty("taglib")
	private Taglib taglib;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("servlet")
	public List<Servlet> getServlet() {
		return servlet;
	}

	@JsonProperty("servlet")
	public void setServlet(List<Servlet> servlet) {
		this.servlet = servlet;
	}

	@JsonProperty("servlet-mapping")
	public ServletMapping getServletMapping() {
		return servletMapping;
	}

	@JsonProperty("servlet-mapping")
	public void setServletMapping(ServletMapping servletMapping) {
		this.servletMapping = servletMapping;
	}

	@JsonProperty("taglib")
	public Taglib getTaglib() {
		return taglib;
	}

	@JsonProperty("taglib")
	public void setTaglib(Taglib taglib) {
		this.taglib = taglib;
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
