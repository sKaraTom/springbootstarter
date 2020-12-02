package com.capgemini.springbootstarter.service;

import java.util.Collection;
import java.util.stream.Stream;

import com.capgemini.springbootstarter.domain.Role;

public interface RoleService {

	Role findByRoleName(String roleName);
	
	Collection<Role> getAllRoles();
	
	Stream<Role> getAllRolesStream();
}
