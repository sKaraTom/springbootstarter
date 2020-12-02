package com.capgemini.springbootstarter.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springbootstarter.domain.User;
import com.capgemini.springbootstarter.service.UserService;

@RestController
@RequestMapping("users")
@Transactional
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getAll() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/{id}/{name}")
	public ResponseEntity<Void> changeFirstName(@PathVariable Long id, @PathVariable String name) {
		userService.changeFirstname(id, name);
		return ResponseEntity.noContent().build();
	}
	
}
