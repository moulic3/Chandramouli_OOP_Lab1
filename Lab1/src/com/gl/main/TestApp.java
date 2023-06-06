package com.gl.main;
import com.gl.service.*;
import java.util.*;
import com.gl.model.*;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String Dept = "";
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Employee First Name");
		String firstName = sc.next().toLowerCase(); 
		System.out.println("Enter Employee Last Name");
		String lastName = sc.next().toLowerCase();
		System.out.println("Section option for employee department: 1) Technical 2) Admin 3) HumanResource 4)Legal");
		int option = sc.nextInt();
		switch (option) {
		case 1: 
			Dept = "Technical"; 
			break;
		
		case 2:
			Dept = "Admin"; 
			break;
		case 3:
			Dept = "HumanResource" ;
			break;
		case 4:
			Dept = "Legal";
			break; 
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
		Employee emp = new Employee(firstName, lastName, Dept);
		CredentialService credentials = new CredentialServiceImpl();
		credentials.generateEmailAddress(emp);
		emp.setPassword(credentials);
		credentials.showCredentials(emp);
		
	}

}
