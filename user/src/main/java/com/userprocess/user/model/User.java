package com.userprocess.user.model;

import java.time.LocalDate;

	
public class User {
	private String name;
	private String lastName;
	private LocalDate dob;
	private String username;
	
	//this is for testing our app
	private String password;

	public User(String name, String lastName, LocalDate dob, String username, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.dob = dob;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
