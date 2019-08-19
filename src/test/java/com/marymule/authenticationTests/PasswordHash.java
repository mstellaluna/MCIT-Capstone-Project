package com.marymule.authenticationTests;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import junit.framework.TestCase;



public class PasswordHash extends TestCase {
	
	public void testBCryptHash() {
		String password = "kittykat";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		System.out.println(hashedPassword);
	}


}
