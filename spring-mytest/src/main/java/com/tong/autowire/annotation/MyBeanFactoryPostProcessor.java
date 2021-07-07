package com.tong.autowire.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName ABeanFactoryPostprocessor
 * @Description TODO
 * @Author Tong
 * @Date 2021/6/25 2:03
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition a = (GenericBeanDefinition) beanFactory.getBeanDefinition("a");
		// 打印a的注入模型
		System.out.println("a mode = " + a.getAutowireMode());

		GenericBeanDefinition b = (GenericBeanDefinition) beanFactory.getBeanDefinition("b");
		// 打印a的注入模型
		System.out.println("b mode = " + b.getAutowireMode());

		GenericBeanDefinition s = (GenericBeanDefinition) beanFactory.getBeanDefinition("s");
		s.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
	}
}
