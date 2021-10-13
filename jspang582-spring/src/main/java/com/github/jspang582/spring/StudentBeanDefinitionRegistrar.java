package com.github.jspang582.spring;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/8/20 9:19
 */
public class StudentBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(Student.class);
        builder.addPropertyValue("id","1");
        builder.addPropertyValue("name","张三");
        registry.registerBeanDefinition("student1",builder.getBeanDefinition());
    }
}
