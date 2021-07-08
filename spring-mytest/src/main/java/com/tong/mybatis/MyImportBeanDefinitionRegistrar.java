package com.tong.mybatis;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(MyDao.class);
		AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
		registry.registerBeanDefinition("myDao", beanDefinition);

		builder = BeanDefinitionBuilder.genericBeanDefinition(IndexDao.class);
		beanDefinition = builder.getBeanDefinition();
		beanDefinition.setBeanClass(MyFactoryBean.class);
		registry.registerBeanDefinition("indexDao", beanDefinition);
	}
}
