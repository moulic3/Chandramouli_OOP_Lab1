package com.gl.service;
import java.util.Random;
import com.gl.model.Employee;

public class CredentialServiceImpl implements CredentialService {
	
	private String uppercaseAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String lowercaseAlphabets = "abcdefghijklmnopqrstuvwxyz"; 
	private String specialCharacters = "~!@#$%^&*" ;
	private String password = "";
	
	Random r = new Random();

	@Override
	public void generateEmailAddress(Employee emp) {
		// TODO Auto-generated method stub
		String firstName = emp.getFirstName();
		String lastName  = emp.getLastName(); 
		String dept = emp.getDepartment();
		String email = firstName + lastName + "@" + dept + ".gl" + ".com";
		emp.setEmail(email);
		
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String combinedAlphabets = uppercaseAlphabets + lowercaseAlphabets + specialCharacters ;
		for ( int i = 0; i < 8; i++ ) {
			password += combinedAlphabets.charAt(r.nextInt(combinedAlphabets.length()));
		}
		
		return password;
	}

	@Override
	public void showCredentials(Employee emp) {
		// TODO Auto-generated method stub
		
		System.out.println("Dear " + emp.getFirstName().toUpperCase() + " your generated credentials are as follows:" );
		System.out.println("Your email is - " + emp.getEmail());
		System.out.println("Passowrd is - " + emp.getPassword());
		
		
	}
	
}
