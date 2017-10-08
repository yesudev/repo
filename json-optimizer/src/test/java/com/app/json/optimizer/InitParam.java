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
@JsonPropertyOrder({ "configGlossary:installationAt", "configGlossary:adminEmail", "configGlossary:poweredBy",
		"configGlossary:poweredByIcon", "configGlossary:staticPath", "templateProcessorClass", "templateLoaderClass",
		"templatePath", "templateOverridePath", "defaultListTemplate", "defaultFileTemplate", "useJSP",
		"jspListTemplate", "jspFileTemplate", "cachePackageTagsTrack", "cachePackageTagsStore",
		"cachePackageTagsRefresh", "cacheTemplatesTrack", "cacheTemplatesStore", "cacheTemplatesRefresh",
		"cachePagesTrack", "cachePagesStore", "cachePagesRefresh", "cachePagesDirtyRead", "searchEngineListTemplate",
		"searchEngineFileTemplate", "searchEngineRobotsDb", "useDataStore", "dataStoreClass", "redirectionClass",
		"dataStoreName", "dataStoreDriver", "dataStoreUrl", "dataStoreUser", "dataStorePassword", "dataStoreTestQuery",
		"dataStoreLogFile", "dataStoreInitConns", "dataStoreMaxConns", "dataStoreConnUsageLimit", "dataStoreLogLevel",
		"maxUrlLength", "mailHost", "mailHostOverride", "log", "logLocation", "logMaxSize", "dataLog",
		"dataLogLocation", "dataLogMaxSize", "removePageCache", "removeTemplateCache", "fileTransferFolder",
		"lookInContext", "adminGroupID", "betaServer" })
public class InitParam {

	@JsonProperty("configGlossary:installationAt")
	private String configGlossaryInstallationAt;
	@JsonProperty("configGlossary:adminEmail")
	private String configGlossaryAdminEmail;
	@JsonProperty("configGlossary:poweredBy")
	private String configGlossaryPoweredBy;
	@JsonProperty("configGlossary:poweredByIcon")
	private String configGlossaryPoweredByIcon;
	@JsonProperty("configGlossary:staticPath")
	private String configGlossaryStaticPath;
	@JsonProperty("templateProcessorClass")
	private String templateProcessorClass;
	@JsonProperty("templateLoaderClass")
	private String templateLoaderClass;
	@JsonProperty("templatePath")
	private String templatePath;
	@JsonProperty("templateOverridePath")
	private String templateOverridePath;
	@JsonProperty("defaultListTemplate")
	private String defaultListTemplate;
	@JsonProperty("defaultFileTemplate")
	private String defaultFileTemplate;
	@JsonProperty("useJSP")
	private Boolean useJSP;
	@JsonProperty("jspListTemplate")
	private String jspListTemplate;
	@JsonProperty("jspFileTemplate")
	private String jspFileTemplate;
	@JsonProperty("cachePackageTagsTrack")
	private Integer cachePackageTagsTrack;
	@JsonProperty("cachePackageTagsStore")
	private Integer cachePackageTagsStore;
	@JsonProperty("cachePackageTagsRefresh")
	private Integer cachePackageTagsRefresh;
	@JsonProperty("cacheTemplatesTrack")
	private Integer cacheTemplatesTrack;
	@JsonProperty("cacheTemplatesStore")
	private Integer cacheTemplatesStore;
	@JsonProperty("cacheTemplatesRefresh")
	private Integer cacheTemplatesRefresh;
	@JsonProperty("cachePagesTrack")
	private Integer cachePagesTrack;
	@JsonProperty("cachePagesStore")
	private Integer cachePagesStore;
	@JsonProperty("cachePagesRefresh")
	private Integer cachePagesRefresh;
	@JsonProperty("cachePagesDirtyRead")
	private Integer cachePagesDirtyRead;
	@JsonProperty("searchEngineListTemplate")
	private String searchEngineListTemplate;
	@JsonProperty("searchEngineFileTemplate")
	private String searchEngineFileTemplate;
	@JsonProperty("searchEngineRobotsDb")
	private String searchEngineRobotsDb;
	@JsonProperty("useDataStore")
	private Boolean useDataStore;
	@JsonProperty("dataStoreClass")
	private String dataStoreClass;
	@JsonProperty("redirectionClass")
	private String redirectionClass;
	@JsonProperty("dataStoreName")
	private String dataStoreName;
	@JsonProperty("dataStoreDriver")
	private String dataStoreDriver;
	@JsonProperty("dataStoreUrl")
	private String dataStoreUrl;
	@JsonProperty("dataStoreUser")
	private String dataStoreUser;
	@JsonProperty("dataStorePassword")
	private String dataStorePassword;
	@JsonProperty("dataStoreTestQuery")
	private String dataStoreTestQuery;
	@JsonProperty("dataStoreLogFile")
	private String dataStoreLogFile;
	@JsonProperty("dataStoreInitConns")
	private Integer dataStoreInitConns;
	@JsonProperty("dataStoreMaxConns")
	private Integer dataStoreMaxConns;
	@JsonProperty("dataStoreConnUsageLimit")
	private Integer dataStoreConnUsageLimit;
	@JsonProperty("dataStoreLogLevel")
	private String dataStoreLogLevel;
	@JsonProperty("maxUrlLength")
	private Integer maxUrlLength;
	@JsonProperty("mailHost")
	private String mailHost;
	@JsonProperty("mailHostOverride")
	private String mailHostOverride;
	@JsonProperty("log")
	private Integer log;
	@JsonProperty("logLocation")
	private String logLocation;
	@JsonProperty("logMaxSize")
	private String logMaxSize;
	@JsonProperty("dataLog")
	private Integer dataLog;
	@JsonProperty("dataLogLocation")
	private String dataLogLocation;
	@JsonProperty("dataLogMaxSize")
	private String dataLogMaxSize;
	@JsonProperty("removePageCache")
	private String removePageCache;
	@JsonProperty("removeTemplateCache")
	private String removeTemplateCache;
	@JsonProperty("fileTransferFolder")
	private String fileTransferFolder;
	@JsonProperty("lookInContext")
	private Integer lookInContext;
	@JsonProperty("adminGroupID")
	private Integer adminGroupID;
	@JsonProperty("betaServer")
	private Boolean betaServer;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("configGlossary:installationAt")
	public String getConfigGlossaryInstallationAt() {
		return configGlossaryInstallationAt;
	}

	@JsonProperty("configGlossary:installationAt")
	public void setConfigGlossaryInstallationAt(String configGlossaryInstallationAt) {
		this.configGlossaryInstallationAt = configGlossaryInstallationAt;
	}

	@JsonProperty("configGlossary:adminEmail")
	public String getConfigGlossaryAdminEmail() {
		return configGlossaryAdminEmail;
	}

	@JsonProperty("configGlossary:adminEmail")
	public void setConfigGlossaryAdminEmail(String configGlossaryAdminEmail) {
		this.configGlossaryAdminEmail = configGlossaryAdminEmail;
	}

	@JsonProperty("configGlossary:poweredBy")
	public String getConfigGlossaryPoweredBy() {
		return configGlossaryPoweredBy;
	}

	@JsonProperty("configGlossary:poweredBy")
	public void setConfigGlossaryPoweredBy(String configGlossaryPoweredBy) {
		this.configGlossaryPoweredBy = configGlossaryPoweredBy;
	}

	@JsonProperty("configGlossary:poweredByIcon")
	public String getConfigGlossaryPoweredByIcon() {
		return configGlossaryPoweredByIcon;
	}

	@JsonProperty("configGlossary:poweredByIcon")
	public void setConfigGlossaryPoweredByIcon(String configGlossaryPoweredByIcon) {
		this.configGlossaryPoweredByIcon = configGlossaryPoweredByIcon;
	}

	@JsonProperty("configGlossary:staticPath")
	public String getConfigGlossaryStaticPath() {
		return configGlossaryStaticPath;
	}

	@JsonProperty("configGlossary:staticPath")
	public void setConfigGlossaryStaticPath(String configGlossaryStaticPath) {
		this.configGlossaryStaticPath = configGlossaryStaticPath;
	}

	@JsonProperty("templateProcessorClass")
	public String getTemplateProcessorClass() {
		return templateProcessorClass;
	}

	@JsonProperty("templateProcessorClass")
	public void setTemplateProcessorClass(String templateProcessorClass) {
		this.templateProcessorClass = templateProcessorClass;
	}

	@JsonProperty("templateLoaderClass")
	public String getTemplateLoaderClass() {
		return templateLoaderClass;
	}

	@JsonProperty("templateLoaderClass")
	public void setTemplateLoaderClass(String templateLoaderClass) {
		this.templateLoaderClass = templateLoaderClass;
	}

	@JsonProperty("templatePath")
	public String getTemplatePath() {
		return templatePath;
	}

	@JsonProperty("templatePath")
	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}

	@JsonProperty("templateOverridePath")
	public String getTemplateOverridePath() {
		return templateOverridePath;
	}

	@JsonProperty("templateOverridePath")
	public void setTemplateOverridePath(String templateOverridePath) {
		this.templateOverridePath = templateOverridePath;
	}

	@JsonProperty("defaultListTemplate")
	public String getDefaultListTemplate() {
		return defaultListTemplate;
	}

	@JsonProperty("defaultListTemplate")
	public void setDefaultListTemplate(String defaultListTemplate) {
		this.defaultListTemplate = defaultListTemplate;
	}

	@JsonProperty("defaultFileTemplate")
	public String getDefaultFileTemplate() {
		return defaultFileTemplate;
	}

	@JsonProperty("defaultFileTemplate")
	public void setDefaultFileTemplate(String defaultFileTemplate) {
		this.defaultFileTemplate = defaultFileTemplate;
	}

	@JsonProperty("useJSP")
	public Boolean getUseJSP() {
		return useJSP;
	}

	@JsonProperty("useJSP")
	public void setUseJSP(Boolean useJSP) {
		this.useJSP = useJSP;
	}

	@JsonProperty("jspListTemplate")
	public String getJspListTemplate() {
		return jspListTemplate;
	}

	@JsonProperty("jspListTemplate")
	public void setJspListTemplate(String jspListTemplate) {
		this.jspListTemplate = jspListTemplate;
	}

	@JsonProperty("jspFileTemplate")
	public String getJspFileTemplate() {
		return jspFileTemplate;
	}

	@JsonProperty("jspFileTemplate")
	public void setJspFileTemplate(String jspFileTemplate) {
		this.jspFileTemplate = jspFileTemplate;
	}

	@JsonProperty("cachePackageTagsTrack")
	public Integer getCachePackageTagsTrack() {
		return cachePackageTagsTrack;
	}

	@JsonProperty("cachePackageTagsTrack")
	public void setCachePackageTagsTrack(Integer cachePackageTagsTrack) {
		this.cachePackageTagsTrack = cachePackageTagsTrack;
	}

	@JsonProperty("cachePackageTagsStore")
	public Integer getCachePackageTagsStore() {
		return cachePackageTagsStore;
	}

	@JsonProperty("cachePackageTagsStore")
	public void setCachePackageTagsStore(Integer cachePackageTagsStore) {
		this.cachePackageTagsStore = cachePackageTagsStore;
	}

	@JsonProperty("cachePackageTagsRefresh")
	public Integer getCachePackageTagsRefresh() {
		return cachePackageTagsRefresh;
	}

	@JsonProperty("cachePackageTagsRefresh")
	public void setCachePackageTagsRefresh(Integer cachePackageTagsRefresh) {
		this.cachePackageTagsRefresh = cachePackageTagsRefresh;
	}

	@JsonProperty("cacheTemplatesTrack")
	public Integer getCacheTemplatesTrack() {
		return cacheTemplatesTrack;
	}

	@JsonProperty("cacheTemplatesTrack")
	public void setCacheTemplatesTrack(Integer cacheTemplatesTrack) {
		this.cacheTemplatesTrack = cacheTemplatesTrack;
	}

	@JsonProperty("cacheTemplatesStore")
	public Integer getCacheTemplatesStore() {
		return cacheTemplatesStore;
	}

	@JsonProperty("cacheTemplatesStore")
	public void setCacheTemplatesStore(Integer cacheTemplatesStore) {
		this.cacheTemplatesStore = cacheTemplatesStore;
	}

	@JsonProperty("cacheTemplatesRefresh")
	public Integer getCacheTemplatesRefresh() {
		return cacheTemplatesRefresh;
	}

	@JsonProperty("cacheTemplatesRefresh")
	public void setCacheTemplatesRefresh(Integer cacheTemplatesRefresh) {
		this.cacheTemplatesRefresh = cacheTemplatesRefresh;
	}

	@JsonProperty("cachePagesTrack")
	public Integer getCachePagesTrack() {
		return cachePagesTrack;
	}

	@JsonProperty("cachePagesTrack")
	public void setCachePagesTrack(Integer cachePagesTrack) {
		this.cachePagesTrack = cachePagesTrack;
	}

	@JsonProperty("cachePagesStore")
	public Integer getCachePagesStore() {
		return cachePagesStore;
	}

	@JsonProperty("cachePagesStore")
	public void setCachePagesStore(Integer cachePagesStore) {
		this.cachePagesStore = cachePagesStore;
	}

	@JsonProperty("cachePagesRefresh")
	public Integer getCachePagesRefresh() {
		return cachePagesRefresh;
	}

	@JsonProperty("cachePagesRefresh")
	public void setCachePagesRefresh(Integer cachePagesRefresh) {
		this.cachePagesRefresh = cachePagesRefresh;
	}

	@JsonProperty("cachePagesDirtyRead")
	public Integer getCachePagesDirtyRead() {
		return cachePagesDirtyRead;
	}

	@JsonProperty("cachePagesDirtyRead")
	public void setCachePagesDirtyRead(Integer cachePagesDirtyRead) {
		this.cachePagesDirtyRead = cachePagesDirtyRead;
	}

	@JsonProperty("searchEngineListTemplate")
	public String getSearchEngineListTemplate() {
		return searchEngineListTemplate;
	}

	@JsonProperty("searchEngineListTemplate")
	public void setSearchEngineListTemplate(String searchEngineListTemplate) {
		this.searchEngineListTemplate = searchEngineListTemplate;
	}

	@JsonProperty("searchEngineFileTemplate")
	public String getSearchEngineFileTemplate() {
		return searchEngineFileTemplate;
	}

	@JsonProperty("searchEngineFileTemplate")
	public void setSearchEngineFileTemplate(String searchEngineFileTemplate) {
		this.searchEngineFileTemplate = searchEngineFileTemplate;
	}

	@JsonProperty("searchEngineRobotsDb")
	public String getSearchEngineRobotsDb() {
		return searchEngineRobotsDb;
	}

	@JsonProperty("searchEngineRobotsDb")
	public void setSearchEngineRobotsDb(String searchEngineRobotsDb) {
		this.searchEngineRobotsDb = searchEngineRobotsDb;
	}

	@JsonProperty("useDataStore")
	public Boolean getUseDataStore() {
		return useDataStore;
	}

	@JsonProperty("useDataStore")
	public void setUseDataStore(Boolean useDataStore) {
		this.useDataStore = useDataStore;
	}

	@JsonProperty("dataStoreClass")
	public String getDataStoreClass() {
		return dataStoreClass;
	}

	@JsonProperty("dataStoreClass")
	public void setDataStoreClass(String dataStoreClass) {
		this.dataStoreClass = dataStoreClass;
	}

	@JsonProperty("redirectionClass")
	public String getRedirectionClass() {
		return redirectionClass;
	}

	@JsonProperty("redirectionClass")
	public void setRedirectionClass(String redirectionClass) {
		this.redirectionClass = redirectionClass;
	}

	@JsonProperty("dataStoreName")
	public String getDataStoreName() {
		return dataStoreName;
	}

	@JsonProperty("dataStoreName")
	public void setDataStoreName(String dataStoreName) {
		this.dataStoreName = dataStoreName;
	}

	@JsonProperty("dataStoreDriver")
	public String getDataStoreDriver() {
		return dataStoreDriver;
	}

	@JsonProperty("dataStoreDriver")
	public void setDataStoreDriver(String dataStoreDriver) {
		this.dataStoreDriver = dataStoreDriver;
	}

	@JsonProperty("dataStoreUrl")
	public String getDataStoreUrl() {
		return dataStoreUrl;
	}

	@JsonProperty("dataStoreUrl")
	public void setDataStoreUrl(String dataStoreUrl) {
		this.dataStoreUrl = dataStoreUrl;
	}

	@JsonProperty("dataStoreUser")
	public String getDataStoreUser() {
		return dataStoreUser;
	}

	@JsonProperty("dataStoreUser")
	public void setDataStoreUser(String dataStoreUser) {
		this.dataStoreUser = dataStoreUser;
	}

	@JsonProperty("dataStorePassword")
	public String getDataStorePassword() {
		return dataStorePassword;
	}

	@JsonProperty("dataStorePassword")
	public void setDataStorePassword(String dataStorePassword) {
		this.dataStorePassword = dataStorePassword;
	}

	@JsonProperty("dataStoreTestQuery")
	public String getDataStoreTestQuery() {
		return dataStoreTestQuery;
	}

	@JsonProperty("dataStoreTestQuery")
	public void setDataStoreTestQuery(String dataStoreTestQuery) {
		this.dataStoreTestQuery = dataStoreTestQuery;
	}

	@JsonProperty("dataStoreLogFile")
	public String getDataStoreLogFile() {
		return dataStoreLogFile;
	}

	@JsonProperty("dataStoreLogFile")
	public void setDataStoreLogFile(String dataStoreLogFile) {
		this.dataStoreLogFile = dataStoreLogFile;
	}

	@JsonProperty("dataStoreInitConns")
	public Integer getDataStoreInitConns() {
		return dataStoreInitConns;
	}

	@JsonProperty("dataStoreInitConns")
	public void setDataStoreInitConns(Integer dataStoreInitConns) {
		this.dataStoreInitConns = dataStoreInitConns;
	}

	@JsonProperty("dataStoreMaxConns")
	public Integer getDataStoreMaxConns() {
		return dataStoreMaxConns;
	}

	@JsonProperty("dataStoreMaxConns")
	public void setDataStoreMaxConns(Integer dataStoreMaxConns) {
		this.dataStoreMaxConns = dataStoreMaxConns;
	}

	@JsonProperty("dataStoreConnUsageLimit")
	public Integer getDataStoreConnUsageLimit() {
		return dataStoreConnUsageLimit;
	}

	@JsonProperty("dataStoreConnUsageLimit")
	public void setDataStoreConnUsageLimit(Integer dataStoreConnUsageLimit) {
		this.dataStoreConnUsageLimit = dataStoreConnUsageLimit;
	}

	@JsonProperty("dataStoreLogLevel")
	public String getDataStoreLogLevel() {
		return dataStoreLogLevel;
	}

	@JsonProperty("dataStoreLogLevel")
	public void setDataStoreLogLevel(String dataStoreLogLevel) {
		this.dataStoreLogLevel = dataStoreLogLevel;
	}

	@JsonProperty("maxUrlLength")
	public Integer getMaxUrlLength() {
		return maxUrlLength;
	}

	@JsonProperty("maxUrlLength")
	public void setMaxUrlLength(Integer maxUrlLength) {
		this.maxUrlLength = maxUrlLength;
	}

	@JsonProperty("mailHost")
	public String getMailHost() {
		return mailHost;
	}

	@JsonProperty("mailHost")
	public void setMailHost(String mailHost) {
		this.mailHost = mailHost;
	}

	@JsonProperty("mailHostOverride")
	public String getMailHostOverride() {
		return mailHostOverride;
	}

	@JsonProperty("mailHostOverride")
	public void setMailHostOverride(String mailHostOverride) {
		this.mailHostOverride = mailHostOverride;
	}

	@JsonProperty("log")
	public Integer getLog() {
		return log;
	}

	@JsonProperty("log")
	public void setLog(Integer log) {
		this.log = log;
	}

	@JsonProperty("logLocation")
	public String getLogLocation() {
		return logLocation;
	}

	@JsonProperty("logLocation")
	public void setLogLocation(String logLocation) {
		this.logLocation = logLocation;
	}

	@JsonProperty("logMaxSize")
	public String getLogMaxSize() {
		return logMaxSize;
	}

	@JsonProperty("logMaxSize")
	public void setLogMaxSize(String logMaxSize) {
		this.logMaxSize = logMaxSize;
	}

	@JsonProperty("dataLog")
	public Integer getDataLog() {
		return dataLog;
	}

	@JsonProperty("dataLog")
	public void setDataLog(Integer dataLog) {
		this.dataLog = dataLog;
	}

	@JsonProperty("dataLogLocation")
	public String getDataLogLocation() {
		return dataLogLocation;
	}

	@JsonProperty("dataLogLocation")
	public void setDataLogLocation(String dataLogLocation) {
		this.dataLogLocation = dataLogLocation;
	}

	@JsonProperty("dataLogMaxSize")
	public String getDataLogMaxSize() {
		return dataLogMaxSize;
	}

	@JsonProperty("dataLogMaxSize")
	public void setDataLogMaxSize(String dataLogMaxSize) {
		this.dataLogMaxSize = dataLogMaxSize;
	}

	@JsonProperty("removePageCache")
	public String getRemovePageCache() {
		return removePageCache;
	}

	@JsonProperty("removePageCache")
	public void setRemovePageCache(String removePageCache) {
		this.removePageCache = removePageCache;
	}

	@JsonProperty("removeTemplateCache")
	public String getRemoveTemplateCache() {
		return removeTemplateCache;
	}

	@JsonProperty("removeTemplateCache")
	public void setRemoveTemplateCache(String removeTemplateCache) {
		this.removeTemplateCache = removeTemplateCache;
	}

	@JsonProperty("fileTransferFolder")
	public String getFileTransferFolder() {
		return fileTransferFolder;
	}

	@JsonProperty("fileTransferFolder")
	public void setFileTransferFolder(String fileTransferFolder) {
		this.fileTransferFolder = fileTransferFolder;
	}

	@JsonProperty("lookInContext")
	public Integer getLookInContext() {
		return lookInContext;
	}

	@JsonProperty("lookInContext")
	public void setLookInContext(Integer lookInContext) {
		this.lookInContext = lookInContext;
	}

	@JsonProperty("adminGroupID")
	public Integer getAdminGroupID() {
		return adminGroupID;
	}

	@JsonProperty("adminGroupID")
	public void setAdminGroupID(Integer adminGroupID) {
		this.adminGroupID = adminGroupID;
	}

	@JsonProperty("betaServer")
	public Boolean getBetaServer() {
		return betaServer;
	}

	@JsonProperty("betaServer")
	public void setBetaServer(Boolean betaServer) {
		this.betaServer = betaServer;
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
