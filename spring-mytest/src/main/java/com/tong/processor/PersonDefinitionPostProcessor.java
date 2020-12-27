package com.tong.processor;

import com.tong.entity.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 在BeanDefinition生成后，Bean实例化前，可从beanFactory获取某一个beanDefinition，
 * 并修改相应bean的属性，包括bean所属的class
 */
@Component
public class PersonDefinitionPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("person");
		beanDefinition.setBeanClass(Student.class);
	}
}
