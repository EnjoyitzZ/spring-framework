package com.tong;

import com.tong.autowired.A;
import com.tong.config.UserConfig;
import com.tong.entity.Person;
import com.tong.entity.Student;
import com.tong.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("--------------------------");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		// User user = (User) context.getBean("user");
		// System.out.println(user.toString());
		// System.out.println(context.getBean("person"));
		// System.out.println(context.getBean(Student.class));
		// System.out.println(context.getBean(Person.class));

		/*验证@Autowired不是自动装配*/
		System.out.println(context.getBean(A.class).getI());

	}
}
