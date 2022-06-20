package com.greatlearning.email.service;

import com.greatlearning.email.model.Employee;

public interface CredentialService {

	public String generateEmailAddress(Employee emp, String department);
	
	public char[] generatePassword();
		
	public void showCredential(Employee emp, String email, char[] generatePassword);
	
}
