package com.tong.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class X {

	@Autowired
	Y y;

	public X() {
		System.out.println("X 实例化 无参");
	}

}
