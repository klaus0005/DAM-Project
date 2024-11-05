package org.scrum.domain.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

//JUnit.5
@SpringBootTest
public class TestJupiterProjectDomainService {
	private static Logger logger = Logger.getLogger(TestJupiterProjectDomainService.class.getName());

	@Autowired
	private IProjectDomainService service;

	@Test
	public void testProjectDomainService() {
		logger.info("Service implementation object:: " + service);
		logger.info("Service implementation class:: " + service.getClass().getName());
		assertNotNull(service);
		//
		Integer featureCount = service.getProjectFeaturesCount(1);
		assertTrue(featureCount > 0, "Features not counting...");

	}
	

}