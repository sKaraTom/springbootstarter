package com.capgemini.springbootstarter.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.springbootstarter.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByName(String name);
	
//	Stream<Role> getAllRolesStream();
	
}
