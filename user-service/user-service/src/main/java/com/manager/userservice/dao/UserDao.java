/**
 * 
 */
package com.manager.userservice.dao;

import java.util.List;

import com.manager.userservice.model.User;

/**
 * @author Balwant Singh
 *
 */

public interface UserDao {
	
	// Method to add user
	public User addUser(User user);
	
	// Method to update user
	public User updateUser(User user);
	
	// Method to get tasks list from the database
	public List<User> getUsers();
	
	// Method to get user
	public User getUser(int id);
	
	public void deleteUser(int id);

}
