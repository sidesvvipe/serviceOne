package com.microservices.serviceOne;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

public class BaseTestClass {

	public BaseTestClass() {
		RestAssuredMockMvc.standaloneSetup(ServiceOneController.class);
	}

}