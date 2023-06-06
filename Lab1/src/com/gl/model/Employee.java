package com.gl.model;

import com.gl.service.CredentialService;

public class Employee {
	private String FirstName;
	private String LastName;
	private String department;
	private String password;
	private String email;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String firstName, String lastName, String department) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.department = department;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setPassword(CredentialService credentials) {
		password = credentials.generatePassword();
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	
	
	
}
