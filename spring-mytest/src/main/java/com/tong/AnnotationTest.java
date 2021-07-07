package com.tong;

import com.tong.autowire.annotation.A;
import com.tong.autowire.annotation.B;
import com.tong.autowire.annotation.S;
import com.tong.config.AppConfig;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.logging.LogManager;

public class AnnotationTest {
	public static void main(String[] args) {
		try {
			LogManager.getLogManager().readConfiguration(new ClassPathResource("logging.properties").getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

		// User user = (User) context.getBean("user");
		// System.out.println(user.toString());
		// System.out.println(context.getBean("person"));
		// System.out.println(context.getBean(Student.class));
		// System.out.println(context.getBean(Person.class));

		/*验证@Autowired不是自动装配，通过反射注入*/
		GenericBeanDefinition abd = (GenericBeanDefinition) context.getBeanDefinition("a");
		System.out.println("A mode = " + abd.getAutowireMode());
		A a = (A) context.getBean("a");
		System.out.println("A = " + a);
		System.out.println("A.getB() = " + a.getB());

		GenericBeanDefinition bbd = (GenericBeanDefinition) context.getBeanDefinition("b");
		System.out.println("B mode = " + bbd.getAutowireMode());
		B b = (B) context.getBean("b");
		System.out.println("B = " + b);
		System.out.println("B.getA() = " + b.getA());

		S s = (S) context.getBean("s");
		System.out.println("S.getA() = " + s.getA());
	}
}
