package com.tong.autowired;

/**
 * @ClassName C
 * @Description TODO
 * @Author Tong
 * @Date 2021/6/25 1:01
 */
public class D {

	I1 i1;
	I2 i2;

	public D(I1 i1) {
		System.out.println("D 实例化 有参");
		this.i1 = i1;
		System.out.println("通过构造器向D中注入i1");
	}
	public D(I1 i1, I2 i2) {
		System.out.println("D 实例化 有参");
		this.i1 = i1;
		this.i2 = i2;
		System.out.println("通过构造器向D中注入i1、i2");
	}
	public I1 getI1() {
		return i1;
	}
	public I2 getI2() {
		return i2;
	}
}
