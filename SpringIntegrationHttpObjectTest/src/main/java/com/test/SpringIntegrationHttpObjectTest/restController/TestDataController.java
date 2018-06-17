package com.test.SpringIntegrationHttpObjectTest.restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.SpringIntegrationHttpObjectTest.model.TestData;

@RestController
@RequestMapping("/api")
public class TestDataController {
	
	public TestDataController() {
		super();
	}
	
	@RequestMapping(value="/getTestData", 
						method=RequestMethod.GET,
						produces="application/json")
	public TestData getTestData() {
		TestData result = new TestData();
		result.setTestString("This is a test.");
		result.setTestInteger(new Integer(1));
		
		return result;
	}

}
