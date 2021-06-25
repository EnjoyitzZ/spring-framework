package com.tong.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

	@Autowired
	A a;

	public B() {
		System.out.println("B 实例化");
	}
}
