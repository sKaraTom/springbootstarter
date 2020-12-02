package com.capgemini.springbootstarter.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.capgemini.springbootstarter.domain.Role;
import com.capgemini.springbootstarter.domain.User;
import com.capgemini.springbootstarter.repository.UserRepository;

@Component
public class DataInit implements ApplicationRunner {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		addUsers();
	}
	
	private void addUsers() {
		long totalCount = userRepo.count();
		
		if(totalCount == 0) {
			List<User>users = new ArrayList<>();
			
			for(int i=0; i<10; i++) {
				User user = new User();
				user.setFirstName("firstName"+i);
				user.setLastName("lastName"+i);
				user.setLogin("login"+i);
				user.setPassword("password"+i);
				users.add(user);
			}
			userRepo.saveAll(users);
		}
	}
	
}
