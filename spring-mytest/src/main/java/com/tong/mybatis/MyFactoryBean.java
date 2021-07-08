package com.tong.mybatis;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

@Component
public class MyFactoryBean<T> implements FactoryBean<T> {

	private Class<T> clazz;

	public MyFactoryBean() {}

	public MyFactoryBean(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public T getObject() throws Exception {
		Object obj = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{IndexDao.class}, new MyInvocationHandler());
		return null;
	}

	@Override
	public Class<T> getObjectType() {
		return clazz;
	}
}
