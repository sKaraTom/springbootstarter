package com.capgemini.springbootstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.springbootstarter.domain.User;
import com.capgemini.springbootstarter.repository.custom.UserCustomRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository {

	User findByLogin(String login);
}
