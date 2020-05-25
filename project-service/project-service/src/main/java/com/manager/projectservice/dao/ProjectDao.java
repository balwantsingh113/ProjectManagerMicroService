/**
 * 
 */
package com.manager.projectservice.dao;

import java.util.List;

import com.manager.projectservice.model.Project;

/**
 * @author Balwant Singh
 *
 */

public interface ProjectDao {
	
	// Method to add project
	public Project addProject(Project project);
	
	// Method to update project
	public Project updateProject(Project project);
	
	// Method to get tasks list from the database
	public List<Project> getProjects();
	
	// Method to get project
	public Project getProject(int id);
	
	public Project updateProjectStatus(Project project);

}
