package com.capgemini.springbootstarter.dto;

import lombok.Data;

@Data
public class UserDTO {

	private Long id;
	
	private String login;
	
	private String password;
	
	private String userType;
	
}
