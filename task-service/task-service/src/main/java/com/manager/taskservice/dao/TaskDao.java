/**
 * 
 */
package com.manager.taskservice.dao;

import java.util.List;

import com.manager.taskservice.model.Task;

/**
 * @author Balwant Singh 
 *
 */

public interface TaskDao {
	
	// Method to add task
	public Task addTask(Task task);
	
	// Method to update task
	public Task updateTask(Task task);
	
	// Method to get tasks list from the database
	public List<Task> getTasks();
	
	// Method to update end task status
	public Task updateEndTask(Task task);
	
	// Method to get task
	public Task getTask(int id);

}
