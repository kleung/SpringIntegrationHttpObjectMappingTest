package com.test.SpringIntegrationHttpObjectTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value={"classpath:/integration/HttpIntegrationContext.xml"})
public class SpringIntegrationHttpObjectTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationHttpObjectTestApplication.class, args);
	}
}
