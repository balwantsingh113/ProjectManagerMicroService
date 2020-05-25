package com.manager.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.userservice.dao.UserDaoImpl;
import com.manager.userservice.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDaoImpl userDaoImpl;

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.addUser(user);
	}

	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateUser(user);
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDaoImpl.getUsers();
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUser(id);
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDaoImpl.deleteUser(id);
	}
	

}
