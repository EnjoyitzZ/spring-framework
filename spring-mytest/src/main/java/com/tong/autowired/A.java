package com.tong.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName A
 * @Description TODO
 * @Author Tong
 * @Date 2021/6/25 1:01
 */
// @Component
public class A {

	// @Autowired
	I i;

	public I getI() {
		return i;
	}

	public void setI(I i) {
		this.i = i;
	}

	// public A() {}
	//
	// public A(I i) {
	//
	// }
}
