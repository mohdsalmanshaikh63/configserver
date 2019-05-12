package com.fullerton.configserver.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder passEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passEncoder.encode("reload-you");
		System.out.println(hashedPassword);

	}

}
