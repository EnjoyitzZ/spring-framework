package com.tong.autowired;

/**
 * @ClassName C
 * @Description TODO
 * @Author Tong
 * @Date 2021/6/25 1:01
 */
public class C {
//	I i;
	I1 i1;
	I2 i2;
	public C() {
		System.out.println("C 实例化");
	}

	public C(I1 i1) {
		this.i1 = i1;
		System.out.println("C 实例化 有参");
	 }

//	public I getI() {
//		return i;
//	}

	public void setI1(I1 i1) {
		System.out.println("通过setter向C中注入i1");
		this.i1 = i1;
	}

	public void setI2(I2 i2) {
		System.out.println("通过setter向C中注入i2");
		this.i2 = i2;
	}

	public I1 getI1() {
		return i1;
	}
	public I2 getI2() {
		return i2;
	}
}
