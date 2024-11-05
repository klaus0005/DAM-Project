package org.scrum.domain.services;

import java.util.Collection;

public interface IProjectEntityRepository {
	Integer getNextID() ;
	//
	Project getById(Integer id);
	Project get(Project sample);
	Collection<Project> toCollection(); // getAll
	//
	Project add(Project entity);
	Collection<Project> addAll(Collection<Project> entities);
	boolean remove(Project entity);
	boolean removeAll(Collection<Project> entities);
	//
	int size();
	
}
