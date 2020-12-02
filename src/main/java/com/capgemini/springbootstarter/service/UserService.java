package com.capgemini.springbootstarter.service;

import java.util.List;

import com.capgemini.springbootstarter.domain.User;

public interface UserService {
	
	List<User> getAllUsers();
	
	User getUserById(Long id);
	
	User findByLogin(String login);
	
	User saveOrUpdateUser(User user);
	
	void deleteUser(Long id);
	
	void changeFirstname(Long id, String name);
}


