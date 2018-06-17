package com.test.SpringIntegrationHttpObjectTest.integration.gateway;

import java.util.Date;

import com.test.SpringIntegrationHttpObjectTest.model.TestData;

public interface TestDataHttpFlowGateway {

	public TestData getTestData() throws RuntimeException;
	
}
