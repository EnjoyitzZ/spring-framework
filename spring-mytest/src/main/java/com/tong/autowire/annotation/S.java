package com.tong.autowire.annotation;

import org.springframework.stereotype.Component;

@Component
public class S {

	A a;

	public S() {
		System.out.println("A 实例化 无参");
	}

	public void setA(A a) {
		this.a = a;
	}

	public A getA() {
		return a;
	}

}
