package com.capgemini.springbootstarter.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.springbootstarter.domain.User;
import com.capgemini.springbootstarter.repository.UserRepository;
import com.capgemini.springbootstarter.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByLogin(String login) {
		return userRepo.findByLogin(login);
	}

	@Override
	public User saveOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeFirstname(Long id, String name) {
		Optional<User> optUser = userRepo.findById(id);
		if(optUser.isPresent()) {
			User user = optUser.get();
			user.setFirstName(name);
			userRepo.save(user);
		} else {
			log.info("no user found");
		}
	}

}
