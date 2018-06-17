package com.test.SpringIntegrationHttpObjectTest.restController;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.SpringIntegrationHttpObjectTest.integration.gateway.TestDataHttpFlowGateway;
import com.test.SpringIntegrationHttpObjectTest.model.TestData;

@RestController
@RequestMapping("/api")
public class GetTestDataIntegrationController {

	@Autowired
	protected TestDataHttpFlowGateway gateway;
	
	public GetTestDataIntegrationController() {
		super();
	}
	
	@RequestMapping(value="/startFlow",
						method=RequestMethod.GET,
						produces="application/json")
	public TestData getTestData() {
		TestData result = this.gateway.getTestData();
		
		return result;
	}
	
}
