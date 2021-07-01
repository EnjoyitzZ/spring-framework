package com.tong.autowire.annotation;

import org.springframework.stereotype.Component;

@Component
public class B {

	A a;

	public B(A a) {
		System.out.println("B 实例化 无参");
		this.a = a;
		System.out.println("通过构造器向B注入A");
	}

	public A getA() {
		return a;
	}
}
