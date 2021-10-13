package com.github.jspang582.spring;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/7/4 23:32
 */
public class MyTankRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        AnnotationAttributes attributes = AnnotationAttributes.fromMap(metadata.getAnnotationAttributes(EnableTank.class.getName()));
        String tank = (String)attributes.get("tank");
        System.out.println(tank);
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(Tank.class);
        builder.addPropertyValue("type",tank+"1111111111111");
        registry.registerBeanDefinition(tank,builder.getBeanDefinition());
    }
}
