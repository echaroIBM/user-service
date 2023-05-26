package com.userprocess.user.controller;

import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.userprocess.user.model.User;
import com.userprocess.user.resource.UserResource;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public ResponseEntity<String> isValidUser(@RequestParam String username, 
@RequestParam String password) {
		System.out.println(username + " "+ password);
		ApplicationContext context = new AnnotationConfigApplicationContext(UserResource.class);
		User user = context.getBean("user", User.class);
		Boolean result = Optional.ofNullable(username).map(s1 -> s1.equals(user.getUsername())).orElse(false);
		
		if(result) {
			return new ResponseEntity<>("Valid", 
					   HttpStatus.OK);
		}
		return new ResponseEntity<>("Invalid", 
				   HttpStatus.OK);
	}

}
