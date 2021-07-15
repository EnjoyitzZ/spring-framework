package com.tong.instance;

public class Animal {
	public String name = "动物";
	private static int age = 1;

	{
		System.out.println("父类-非静态变量name=" + name);
		name = "新动物";
		System.out.println("父类-非静态代码块");
	}

	static {
		System.out.println("父类-静态变量age=" + age);
		age = 3;
		System.out.println("父类-静态代码块");
	}

	public Animal() {
		System.out.println("调用父类构造方法的对象=" + this);
		say(); // 如果子类重写了say()，则此处调用的是子类重写的say()，
		eat(); // 如果子类重写了eat()，则此处调用的是子类重写的eat()，否则调用父类的eat()
	}

	public void say() {
		System.out.println("调用父类的say()：" + name + "饿了，吼叫。。。");
	}

	public void eat() {
		System.out.println("调用父类的eat()：" + name + "吃东西。");
	}

}
