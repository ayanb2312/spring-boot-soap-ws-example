package com.ab.spring.boot.soap.ws.example.model;

public class FeatureDetailsInput {
	
	public String date;
	public String featureId;
	public String entity;
	public String application;
	
	public FeatureDetailsInput() {
		//Do nothing
	}
	
	public FeatureDetailsInput(String dateStr, String entityStr, String featureStr, String appStr) {
		this.date = dateStr;
		this.entity = entityStr;
		this.featureId = featureStr;
		this.application = appStr;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFeatureId() {
		return featureId;
	}
	public void setFeatureId(String featureId) {
		this.featureId = featureId;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}

}
