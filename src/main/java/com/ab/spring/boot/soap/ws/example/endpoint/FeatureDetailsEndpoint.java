package com.ab.spring.boot.soap.ws.example.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.ab.spring.boot.soap.ws.example.model.FeatureDetailsInput;
import com.ab.spring.boot.soap.ws.example.repository.FeatureDetailsRepository;
import com.howtodoinjava.xml.feature.GetFeatureDetailRequestType;
import com.howtodoinjava.xml.feature.GetFeatureDetailResponseType;

@Endpoint
public class FeatureDetailsEndpoint {
	
	private static final String NAMESPACE_URI = "http://www.howtodoinjava.com/xml/feature";
	private FeatureDetailsRepository fdRepo;
	
	@Autowired
    public FeatureDetailsEndpoint(FeatureDetailsRepository featureDetailsRepository) {
        this.fdRepo = featureDetailsRepository;
    }
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getFeatureDetailRequest")
    @ResponsePayload
    public GetFeatureDetailResponseType getFeatureDetails(@RequestPayload GetFeatureDetailRequestType request) {
		GetFeatureDetailResponseType response = new GetFeatureDetailResponseType();
		
		FeatureDetailsInput fdInput = new FeatureDetailsInput();
		fdInput.setDate(request.getDates().getDate().get(0));
		fdInput.setEntity(request.getEntities().getEntity().get(0));
		fdInput.setFeatureId(request.getFeatures().getFeature().get(0));
		fdInput.setApplication(request.getApplications().getApplication().get(0));
		
        response.setFeatureDetails(fdRepo.getFeatureDetailsType(fdInput));
        response.setStatus(fdRepo.getStatusType(fdInput));
 
        return response;
    }

}
