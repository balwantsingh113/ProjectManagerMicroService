/**
 * 
 */
package com.manager.projectservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manager.projectservice.model.Project;
import com.manager.projectservice.service.ProjectService;

/**
 * @author Balwant Singh
 *
 */

@CrossOrigin(
	    allowCredentials = "true",
	    origins = "*", 
	    allowedHeaders = "*", 
	    methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT}
	)
@RestController
@RequestMapping("/v1")
public class ProjectController {

	/** Initialize the LOGGER object */
	// private static final Log logger = LogFactory.getLog(ProjectService.class);

	@Autowired
	private ProjectService projectService;

	@PostMapping(value = "/addproject", produces = MediaType.APPLICATION_JSON_VALUE)
	public Project addProject(@Valid @RequestBody Project project) {
		return projectService.addProject(project);
	}

	@PostMapping(value = "/updateproject", produces = MediaType.APPLICATION_JSON_VALUE)
	public Project updateProject(@Valid @RequestBody Project project) {
		
		return projectService.updateProject(project);
	}

	@GetMapping(value = "/projects", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Project> getProjects() {
		
		List<Project> projectList = new ArrayList<Project>();
		projectList = projectService.getProjects();
		return projectList;
	}
	
	@GetMapping(value = "/project/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Project getProject(@PathVariable int id) {
		
		Project project = new Project();
		project = projectService.getProject(id);
		return project;
	}
	
	@PutMapping(value = "/projectstatus", produces = MediaType.APPLICATION_JSON_VALUE)
	public Project updateProjectStatus(@Valid @RequestBody Project project) {
	
		return projectService.updateProjectStatus(project);
	}

}
