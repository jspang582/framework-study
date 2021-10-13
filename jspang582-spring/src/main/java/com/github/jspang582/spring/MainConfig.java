package com.github.jspang582.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/7/4 22:24
 */
@Configuration
@ComponentScan(basePackages = "com.jspang.spring",nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class)
//@Import(MyImportBeanDefinitionRegistrar.class)
//@EnableTank
public class MainConfig {
}
