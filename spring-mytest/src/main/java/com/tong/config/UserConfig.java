package com.tong.config;

import com.tong.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tong")
public class UserConfig {

	@Bean("user")
	public User getUser() {
		return  new User("Tong", 1);
	}
}
