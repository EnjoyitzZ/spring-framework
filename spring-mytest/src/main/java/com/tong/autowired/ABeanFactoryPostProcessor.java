package com.tong.autowired;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName ABeanFactoryPostprocessor
 * @Description TODO
 * @Author Tong
 * @Date 2021/6/25 2:03
 */
@Component
public class ABeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition a = (GenericBeanDefinition) beanFactory.getBeanDefinition("a");
		// 打印a的注入模型
		System.out.println("a mode = " + a.getAutowireMode());
	}
}
