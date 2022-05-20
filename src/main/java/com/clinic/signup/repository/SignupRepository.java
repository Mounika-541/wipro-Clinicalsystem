package com.clinic.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinic.signup.model.User;

public interface SignupRepository extends JpaRepository<User, Integer> {

	public User findByEmail(String email);
	public User findByEmailAndPassword(String email, String password);
}
