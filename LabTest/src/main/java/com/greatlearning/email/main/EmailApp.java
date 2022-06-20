package com.greatlearning.email.main;

import java.util.Scanner;

import com.greatlearning.email.model.Employee;
//import com.greatlearning.email.model.Employee;
import com.greatlearning.email.service.CredentialService;
import com.greatlearning.email.service.CredentialServiceImpl;

public class EmailApp {
	private static String department;

	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		CredentialService service = new CredentialServiceImpl();
		String getEmail;
		char[] getPassword;
		
		System.out.print("Enter your first name: ");
		String firstName = input.next().toLowerCase();
	   
		System.out.print("Enter your last name: ");
		String lastName = input.next().toLowerCase();
		
		Employee emp = new Employee(firstName, lastName);

		System.out.println();
		System.out.println("Please enter the department from the following \n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
	
		int method = input.nextInt();
		String generateEmailAddress;
		char[] generatePassword;
		switch(method){
			case 0:
				System.out.println("Invalid details, please enter the details again");
				System.exit(0);
			break;
			case 1:
				department = "tech";
				generateEmailAddress = service.generateEmailAddress(emp, department);
				generatePassword =  service.generatePassword();
				service.showCredential(emp, generateEmailAddress, generatePassword);
			break;
			case 2:
				department = "admin";
				generateEmailAddress = service.generateEmailAddress(emp, department);
				generatePassword =  service.generatePassword();
				service.showCredential(emp, generateEmailAddress, generatePassword);
				break;
			case 3:

				department = "hr";
				generateEmailAddress = service.generateEmailAddress(emp, department);
				generatePassword =  service.generatePassword();
				service.showCredential(emp, generateEmailAddress, generatePassword);
				break;
		}
	
		
	}
}
