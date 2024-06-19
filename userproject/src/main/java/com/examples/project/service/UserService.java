package com.examples.project.service;

import com.examples.project.model.User;

public interface UserService {
	
	public boolean validateUser(User user);
	public User registerUser(User user);

}
