package com.tong.entity;

import org.springframework.stereotype.Component;

@Component
public class Student extends Person {
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
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.doSomething();
	}
}
