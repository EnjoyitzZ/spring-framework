package com.tong;

import com.tong.autowire.xml.C;
import com.tong.autowire.xml.D;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTest {
	public static void main(String[] args) {
		System.out.println("--------------------------");
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// User user = (User) context.getBean("user");
		// System.out.println(user.toString());
		// System.out.println(context.getBean("person"));
		// System.out.println(context.getBean(Student.class));
		// System.out.println(context.getBean(Person.class));

		/*xml自动为属性装配bean*/
		GenericBeanDefinition c = (GenericBeanDefinition) context.getBeanFactory().getBeanDefinition("c");
		System.out.println("C mode = " + c.getAutowireMode());
//		System.out.println(context.getBean(C.class).getI());
		System.out.println(context.getBean(C.class).getI1());
		System.out.println(context.getBean(C.class).getI2());
		System.out.println(context.getBean(D.class).getI1());
		System.out.println(context.getBean(D.class).getI2());
	}
}
