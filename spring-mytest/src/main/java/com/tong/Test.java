package com.tong;

import com.tong.config.UserConfig;
import com.tong.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("--------------------------");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
}
