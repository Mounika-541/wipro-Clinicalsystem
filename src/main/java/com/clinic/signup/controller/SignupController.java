package com.clinic.signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.signup.model.User;
import com.clinic.signup.service.SignupService;

@RestController
public class SignupController {
	
	@Autowired
	private SignupService service;
	
	@PostMapping("/signup")
	public User signupUser(@RequestBody User user) throws Exception {
		 
		String tempEmailId =user.getEmail();
		if( tempEmailId != null && !"".equals(tempEmailId)) {
			User userobj = service.fetchUserByEmailId(tempEmailId);
			if (userobj != null) {
				throw new Exception("user with "+tempEmailId+" is already exist");
			}
		
		}
		
		
		User userObj=null;
		userObj=service.saveUser(user);
		return userObj;
	}
	
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId =user.getEmail();
		String temppassword =user.getPassword();
		
		User userObj =null;
		if(tempEmailId !=null && temppassword!= null) {
			userObj= service.fetchUserByEmailIdAndPassword(tempEmailId, temppassword);
		}
		if(userObj == null)
		{
			throw new Exception("bad credentials");
		}
		return userObj;
		
	}

}



