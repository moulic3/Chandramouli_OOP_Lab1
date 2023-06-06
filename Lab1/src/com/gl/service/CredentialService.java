package com.gl.service;

import com.gl.model.Employee;

public interface CredentialService {
	public void generateEmailAddress(Employee emp);
	public String generatePassword();
	public void showCredentials(Employee emp);
	
}
