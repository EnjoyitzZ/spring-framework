package com.tong.entity;

import org.springframework.stereotype.Component;

@Component
public class Student extends Person {
	/**
	 * super和this指向的是同一个对象，即当前对象；
	 * super只能调用从父类继承而来的属性或方法，而且是直接通过子类调用，而不是父类。
	 */
	private long id;
	private String name;

	public Student() {
		System.out.println("Student 实例化");
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String getName() {
		System.out.println("Student#getName");
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public void doSomething() {
		System.out.println("this----------");
		this.getName();
		System.out.println("super---------");
		super.getName();
		super.getAge();
		System.out.println(super.getClass());
		"".concat("");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.doSomething();
	}
}
