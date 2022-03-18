package com.github.jspang582.spring.imports;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lifeng
 * @Description:
 * @date 2022/3/17 13:26
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DogConfig.class);
        Dog dog = applicationContext.getBean(Dog.class);
        // 输出 dog
        System.out.println(dog.getName());
    }
}
