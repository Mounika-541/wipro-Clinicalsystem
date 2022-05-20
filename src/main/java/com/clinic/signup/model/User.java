package com.clinic.signup.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "signup")
public class User {

private String name;
private String number;
@Id	
private String email;
private String dob;
private String password;


public User() {
	
}

public User(String name, String number, String email, String dob, String password) {
	super();
	this.name = name;
	this.number = number;
	this.email = email;
	this.dob = dob;
	this.password = password; 
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
