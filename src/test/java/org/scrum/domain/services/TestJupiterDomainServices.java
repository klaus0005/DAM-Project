package org.scrum.domain.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.scrum.domain.project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.logging.Logger;

//JUnit.5
@SpringBootTest
public class TestJupiterDomainServices {
	private static Logger logger = Logger.getLogger(TestJupiterDomainServices.class.getName());

	@Autowired
	private IProjectDomainService service;
	
	@Autowired
	private IProjectEntityRepository repository;
	
	@Autowired
	private IProjectEntityFactory factory;

	@Test
	public void testProjectEntityFactory() {
		assertNotNull(factory);
		// CDI -> AppContextConfig -> @Produces IProjectEntityFactory :: initDomainServiceEntities -- Repository
		Integer projectCounts = factory.getProjectEntityRepository().size();
		assertTrue(projectCounts > 0, "Projects not counting...");
		logger.info("Project count:: " + projectCounts);
	}

	@Test
	public void testProjectEntityRepository() {
		assertNotNull(repository);
		Collection<Project> projects = repository.toCollection();
		assertTrue(projects.size() > 0, "Projects not in repository...");

	}

	@Test
	public void testProjectDomainService() {
		logger.info("Repository implementation object:: " + repository);
		logger.info("Repository implementation class:: " + repository.getClass().getName());
		assertNotNull(repository);
		//
		logger.info("Factory implementation object:: " + factory);
		logger.info("Factory implementation class:: " + factory.getClass().getName());
		assertNotNull(factory);
		// CDI -> Service -> Factory @PostConstruct :: initDomainServiceEntities -- Repository
		logger.info("Service implementation object:: " + service);
		logger.info("Service implementation class:: " + service.getClass().getName());
		assertNotNull(service);
		//
		Integer featureCount = service.getProjectFeaturesCount(1);
		assertTrue(featureCount > 0, "Features not counting...");

	}
	

}