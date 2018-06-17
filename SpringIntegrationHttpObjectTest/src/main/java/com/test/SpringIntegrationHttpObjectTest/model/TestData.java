package com.test.SpringIntegrationHttpObjectTest.model;

import java.io.Serializable;

public class TestData implements Serializable {

	private static final long serialVersionUID = 2583404920899551058L;

	protected String testString;
	
	protected Integer testInteger;
	
	public TestData() {
		super();
	}

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}

	public Integer getTestInteger() {
		return testInteger;
	}

	public void setTestInteger(Integer testInteger) {
		this.testInteger = testInteger;
	}
	
}
