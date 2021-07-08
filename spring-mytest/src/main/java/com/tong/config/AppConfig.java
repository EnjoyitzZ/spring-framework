package com.tong.config;

import com.tong.entity.User;
import com.tong.mybatis.MyImportBeanDefinitionRegistrar;
import com.tong.mybatis.MyScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.tong")
@MyScan
public class AppConfig {

	@Bean("user")
	public User getUser() {
		return  new User("Tong", 1);
	}
}
