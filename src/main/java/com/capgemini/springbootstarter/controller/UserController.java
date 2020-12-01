package com.capgemini.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springbootstarter.domain.User;
import com.capgemini.springbootstarter.repository.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping
	public List<User> getAll() {
		return userRepo.findAll();
	}
}
