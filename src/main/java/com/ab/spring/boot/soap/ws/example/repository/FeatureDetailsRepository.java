package com.ab.spring.boot.soap.ws.example.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.ab.spring.boot.soap.ws.example.model.FeatureDetailsInput;
import com.howtodoinjava.xml.feature.FeatureDetailType;
import com.howtodoinjava.xml.feature.FeatureDetailsType;
import com.howtodoinjava.xml.feature.StatusType;

@Component
public class FeatureDetailsRepository {
	
	private static final Map<FeatureDetailsInput, FeatureDetailsType> featureDeatilsData = new HashMap<>();
	private static final Map<FeatureDetailsInput, StatusType> statusTypeData = new HashMap<>();
	
	@PostConstruct
    public void initData() {
		FeatureDetailsInput featureDetailsInput = new FeatureDetailsInput();
		
		// Data-1
		featureDetailsInput.setDate("24-03-2021");
		featureDetailsInput.setEntity("MyEntity1");
		featureDetailsInput.setFeatureId("MyFeature1");
		featureDetailsInput.setApplication("MyApp1");
		
		FeatureDetailType featureDetailType = new FeatureDetailType();
		featureDetailType.setFeatureAbbr("F1");
		featureDetailType.setFeatureAppId("MyApp1");
		featureDetailType.setFeatureDescription("My description 1");
		featureDetailType.setFeatureEFD("24-03-2021");
		featureDetailType.setFeatureEntity("MyEntity1");
		featureDetailType.setFeatureEXD("31-12-9999");
		featureDetailType.setFeatureId("MyFeature1");
		featureDetailType.setFeatureUPD("24-03-2021");
		featureDetailType.setFeatureValue("My Feature Value 1");
		
		FeatureDetailsType featureDetailsType = new FeatureDetailsType();
		featureDetailsType.getFeatureDetail().add(featureDetailType);
		
		featureDeatilsData.put(featureDetailsInput, featureDetailsType);
		
		StatusType statusType = new StatusType();
		statusType.setStatus("Status1");
		statusType.setErrorDesc("ErrorDescription1");
		
		statusTypeData.put(featureDetailsInput, statusType);
		
		// Data-2
		featureDetailsInput = new FeatureDetailsInput();
		featureDetailsInput.setDate("24-03-2021");
		featureDetailsInput.setEntity("MyEntity2");
		featureDetailsInput.setFeatureId("MyFeature2");
		featureDetailsInput.setApplication("MyApp2");
		
		featureDetailType = new FeatureDetailType();
		featureDetailType.setFeatureAbbr("F2");
		featureDetailType.setFeatureAppId("MyApp2");
		featureDetailType.setFeatureDescription("My description 2");
		featureDetailType.setFeatureEFD("24-03-2021");
		featureDetailType.setFeatureEntity("MyEntity2");
		featureDetailType.setFeatureEXD("31-12-9999");
		featureDetailType.setFeatureId("MyFeature2");
		featureDetailType.setFeatureUPD("24-03-2021");
		featureDetailType.setFeatureValue("My Feature Value 2");
		
		featureDetailsType = new FeatureDetailsType();
		featureDetailsType.getFeatureDetail().add(featureDetailType);
		
		featureDeatilsData.put(featureDetailsInput, featureDetailsType);
		
		statusType = new StatusType();
		statusType.setStatus("Status2");
		statusType.setErrorDesc("ErrorDescription2");
		
		statusTypeData.put(featureDetailsInput, statusType);
		
		// Data-3
		featureDetailsInput = new FeatureDetailsInput();
		featureDetailsInput.setDate("23-03-2021");
		featureDetailsInput.setEntity("MyEntity3");
		featureDetailsInput.setFeatureId("MyFeature3");
		featureDetailsInput.setApplication("MyApp3");
		
		featureDetailType = new FeatureDetailType();
		featureDetailType.setFeatureAbbr("F3");
		featureDetailType.setFeatureAppId("MyApp3");
		featureDetailType.setFeatureDescription("My description 3");
		featureDetailType.setFeatureEFD("23-03-2021");
		featureDetailType.setFeatureEntity("MyEntity3");
		featureDetailType.setFeatureEXD("31-12-9999");
		featureDetailType.setFeatureId("MyFeature3");
		featureDetailType.setFeatureUPD("23-03-2021");
		featureDetailType.setFeatureValue("My Feature Value 3");
		
		featureDetailsType = new FeatureDetailsType();
		featureDetailsType.getFeatureDetail().add(featureDetailType);
		
		featureDeatilsData.put(featureDetailsInput, featureDetailsType);
		
		statusType = new StatusType();
		statusType.setStatus("Status3");
		statusType.setErrorDesc("ErrorDescription3");
		
		statusTypeData.put(featureDetailsInput, statusType);
		
		// Data-4
		featureDetailsInput = new FeatureDetailsInput();
		featureDetailsInput.setDate("25-03-2021");
		featureDetailsInput.setEntity("MyEntity4");
		featureDetailsInput.setFeatureId("MyFeature4");
		featureDetailsInput.setApplication("MyApp4");
		
		featureDetailType = new FeatureDetailType();
		featureDetailType.setFeatureAbbr("F4");
		featureDetailType.setFeatureAppId("MyApp4");
		featureDetailType.setFeatureDescription("My description 4");
		featureDetailType.setFeatureEFD("25-03-2021");
		featureDetailType.setFeatureEntity("MyEntity4");
		featureDetailType.setFeatureEXD("31-12-9999");
		featureDetailType.setFeatureId("MyFeature4");
		featureDetailType.setFeatureUPD("25-03-2021");
		featureDetailType.setFeatureValue("My Feature Value 4");
		
		featureDetailsType = new FeatureDetailsType();
		featureDetailsType.getFeatureDetail().add(featureDetailType);
		
		featureDeatilsData.put(featureDetailsInput, featureDetailsType);
		
		statusType = new StatusType();
		statusType.setStatus("Status4");
		statusType.setErrorDesc("ErrorDescription4");
		
		statusTypeData.put(featureDetailsInput, statusType);
	}
	
	public FeatureDetailsType getFeatureDetailsType(FeatureDetailsInput featureDetailsInput) {
		Assert.notNull(featureDetailsInput, "The input must not be null.");
		FeatureDetailsType ftType = new FeatureDetailsType();
		ftType = featureDeatilsData.get(featureDetailsInput);
		return ftType;
	}
	
	public StatusType getStatusType(FeatureDetailsInput featureDetailsInput) {
		Assert.notNull(featureDetailsInput, "The input must not be null.");
		StatusType sType = new StatusType();
		sType = statusTypeData.get(featureDetailsInput);
		return sType;
	}

}
