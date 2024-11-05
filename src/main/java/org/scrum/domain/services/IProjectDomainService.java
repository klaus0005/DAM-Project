package org.scrum.domain.services;

import org.scrum.domain.project.Feature;
import org.scrum.domain.project.Project;

import java.util.List;

public interface IProjectDomainService {
	List<Feature> getProjectFeatures(Project project);
	Integer getProjectFeaturesCount(Project project);
	//
	List<Feature> getProjectFeatures(Integer projectID);
	Integer getProjectFeaturesCount(Integer projectID);
	//
	Feature getProjectFeature(Project project, String featureName);
	// Dependencies to get IDs
	void setProjectEntityRepository(IProjectEntityRepository repository);
}
