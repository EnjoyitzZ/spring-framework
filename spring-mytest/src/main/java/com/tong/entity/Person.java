package com.tong.entity;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name;
	private int age;
	private double height;

	public Person() {
		System.out.println("Person 实例化");
	}

	public String getName() {
		System.out.println("Person#getName");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		System.out.println("Person#getAge");
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
