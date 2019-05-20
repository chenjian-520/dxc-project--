package com.zte.demo;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yzh.demo.model.CometdServletInfo;

import io.dropwizard.Configuration;

public class DemoConfiguration extends Configuration {
	@NotEmpty
    private String template;
    
    @NotEmpty
    private String defaultName = "yzn Demo";
 
    private boolean saveTaskToFile = false;
    
    @Valid
    private CometdServletInfo cometdServletInfo;
    
    @JsonProperty
    public String getTemplate() {
        return template;
    }
 
    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }
    
    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }
 
    @JsonProperty
    public void setDefaultName(String name) {
        this.defaultName = name;
    }
 
    @JsonProperty
	public CometdServletInfo getCometdServletInfo() {
		return cometdServletInfo;
	}
 
    @JsonProperty
	public void setCometdServletInfo(CometdServletInfo cometdServletInfo) {
		this.cometdServletInfo = cometdServletInfo;
	}
 
	public boolean isSaveTaskToFile() {
		return saveTaskToFile;
	}
 
	public void setSaveTaskToFile(boolean saveTaskToFile) {
		this.saveTaskToFile = saveTaskToFile;
	}

}
