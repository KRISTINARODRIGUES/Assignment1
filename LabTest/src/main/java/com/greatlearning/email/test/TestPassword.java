package com.greatlearning.email.test;

import java.util.Random;

public class TestPassword {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/-.?<>)";
		String passwordRange = capitalLetters + smallLetters + numbers + specialCharacters;
		
		char[] password = new char[8];
		
		for(int i=0; i<20; i++) {
			for(int j=0; j<8; j++) {
					password[j] = passwordRange.charAt(random.nextInt(passwordRange.length()));
			}
		System.out.println(password);
		}
		
	}

}
	
