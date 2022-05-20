package com.clinic.signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.signup.model.User;
import com.clinic.signup.repository.SignupRepository;

@Service
public class SignupService {
	
	@Autowired
	private SignupRepository repo;
	
	public User saveUser(User user) {
		
		return repo.save(user);
	}
	public User fetchUserByEmailId(String email) {
		return repo.findByEmail(email);
	}

	public User fetchUserByEmailIdAndPassword(String email, String password) {
		return repo.findByEmailAndPassword(email,password);
	}

}
