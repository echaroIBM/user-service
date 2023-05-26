package com.userprocess.user.resource;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.userprocess.user.model.User;


@Configuration
@ComponentScan("com.userprocess.user.model")
public class UserResource {
	
	@Bean
	public User user() {
		return new User("FakeUser", "FakeLastName", LocalDate.of(1988, 05, 17),"fakeUserName", null);
		
	}
}

