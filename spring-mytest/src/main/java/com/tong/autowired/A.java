package com.tong.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName A
 * @Description TODO
 * @Author Tong
 * @Date 2021/6/25 1:01
 */
 @Component
public class A {

	/**
	 * spring允许循环依赖(前提是单例的情况下的,非构造方法注入的情况下)
	 *
	 * 1.自动装配需要提供setter方法或构造器
	 * 2.@Autowired 不是自动装配，所以不需要提供setter方法或构造器；
	 * 而是利用了java的反射，通过field.set(value,targetObject)完成注入，
	 * 是setter的一种变体。
	 */
	@Autowired
	B b;

	public A() {
		System.out.println("A 实例化");
	}

	public B getB() {
		return b;
	}

}
