package com.ynn.muscirecords;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ynn.muscirecords.model.User;

@SpringBootApplication
public class YnnRecordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(YnnRecordsApplication.class, args);
		
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        
//        System.out.println("Admin pass:");
//        System.out.println(passwordEncoder.encode("admin"));
	
	
	}

}
