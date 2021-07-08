package com.tong;

import com.tong.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MapperTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

		System.out.println("myDao = " + context.getBean("myDao"));
		System.out.println("indexDao = " + context.getBean("indexDao"));
	}
}
