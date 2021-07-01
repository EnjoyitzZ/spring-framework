package com.tong;

import com.tong.config.AppConfig;
import com.tong.lifecycle.X;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.logging.LogManager;

public class LifeCycleTest {
	public static void main(String[] args) {
//		try {
//			LogManager.getLogManager().readConfiguration(new ClassPathResource("logging.properties").getInputStream());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		// 实例化Spring容器对象
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		// 初始化Spring容器
		context.refresh();

		System.out.println(context.getBean(X.class));
	}
}
