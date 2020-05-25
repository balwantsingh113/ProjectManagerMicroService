package com.manager.projectservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.projectservice.dao.ProjectDaoImpl;
import com.manager.projectservice.model.Project;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectDaoImpl projectDaoImpl;

	public Project addProject(Project project) {
		return projectDaoImpl.addProject(project);
	}

	public Project updateProject(Project project) {
		return projectDaoImpl.updateProject(project);
	}

	public List<Project> getProjects() {
		return projectDaoImpl.getProjects();
	}

	public Project getProject(int id) {
		return projectDaoImpl.getProject(id);
	}

	public Project updateProjectStatus(Project project) {
		return projectDaoImpl.updateProjectStatus(project);
	}
	
	


}
