package com.tong;

import com.tong.autowired.A;
import com.tong.config.UserConfig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class AnnotationTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);

		// User user = (User) context.getBean("user");
		// System.out.println(user.toString());
		// System.out.println(context.getBean("person"));
		// System.out.println(context.getBean(Student.class));
		// System.out.println(context.getBean(Person.class));

		/*验证@Autowired不是自动装配，通过反射注入*/
		A a = (A) context.getBean("a");
		System.out.println(a);
		System.out.println(a.getB());

	}
}
