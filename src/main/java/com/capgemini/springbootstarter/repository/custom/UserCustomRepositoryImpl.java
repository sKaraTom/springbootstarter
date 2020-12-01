package com.capgemini.springbootstarter.repository.custom;

import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.capgemini.springbootstarter.domain.User;

public class UserCustomRepositoryImpl implements UserCustomRepository {

	private static final Logger log = LoggerFactory.getLogger(UserCustomRepositoryImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public EntityManager getEntityManager() {
		return entityManager;
	}


	@Override
	public void changeFirstName(Long id, String firstName) {
		User user = entityManager.find(User.class, id);
		if(Objects.nonNull(user)) {
			user.setFirstName(firstName);
		} else {
			log.info("no user found");
		}
		
	}
}
