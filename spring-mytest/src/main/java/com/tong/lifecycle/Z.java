package com.tong.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Z implements ApplicationContextAware {

	@Autowired
	X x;

	public Z() {
		System.out.println("Z 实例化 无参");
	}

	//生命周期初始化回调方法
	@PostConstruct
	public void init(){
		System.out.println("call z lifecycle init callback");
	}

	//ApplicationContextAware 回调方法
	@Override
	public void setApplicationContext(ApplicationContext ac) {
		System.out.println("call aware callback");
	}

}
