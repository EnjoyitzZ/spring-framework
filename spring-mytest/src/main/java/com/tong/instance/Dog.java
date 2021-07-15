package com.tong.instance;

public class Dog extends Animal {
	/*
	类的实例化顺序
	1． 父类静态成员和静态初始化块 ，按在代码中出现的顺序依次执行
	2． 子类静态成员和静态初始化块 ，按在代码中出现的顺序依次执行
	3． 父类实例成员和实例初始化块 ，按在代码中出现的顺序依次执行
	4． 父类构造方法
	5． 子类实例成员和实例初始化块 ，按在代码中出现的顺序依次执行
	6． 子类构造方法
	 */

	public String name = "狗";
	private static String sex = "公";

	{
		System.out.println("子类-非静态变量name=" + name);
		name = "公狗";
		System.out.println("子类-非静态代码块");
	}

	static {
		System.out.println("子类-静态变量sex=" + sex);
		sex = "母";
		System.out.println("子类-静态代码块");
	}

	public Dog() {
		System.out.println("调用子类的构造器的对象=" + this);
		say();
		eat();
	}

	public void say() {
		System.out.println("调用子类重写的say()：" + name + "饿了，汪汪汪。。。");
	}

	public void eat(String name) {
		System.out.println("调用子类的eat()：" + name + "啃骨头。");
	}

	public static void main(String[] args) {
		System.out.println("***********************进入main方法************************");
		System.out.println("***********************new Dog()**************************");
		Animal animal = new Dog();
		System.out.println("Animal animal = new Dog()中animal=" + animal);
		// 通过父类的引用类型变量指向子类类型对象，访问被子类重载的方法时是访问子类的方法。
		animal.say();
		// 通过父类的引用类型变量指向子类类型对象，访问成员变量时是访问的父类的成员变量。
		System.out.println("name=" + animal.name);
		System.out.println("***********************new Animal()***********************");
		new Animal();
	}
}
