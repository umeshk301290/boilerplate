package com.digital.telco.boilerplate.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
public class BoilerPlateTest {

	@InjectMocks
	BoilerPlateController boilerPlateController;
	
	@Test
	public void checkCodeCoverageTest() {
	//assertTrue(boilerPlateController.getMessage() instanceof ResponseEntity);

	}

}
