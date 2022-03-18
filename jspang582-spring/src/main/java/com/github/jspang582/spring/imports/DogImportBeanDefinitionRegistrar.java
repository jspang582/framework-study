package com.github.jspang582.spring.imports;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author lifeng
 * @Description:
 * @date 2022/3/17 13:42
 */
public class DogImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // 注册dog的bean定义,其中beanName为dogBean
        registry.registerBeanDefinition("dogBean", BeanDefinitionBuilder.genericBeanDefinition(Dog.class).getBeanDefinition());
    }


}
