package com.github.jspang582.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/7/4 22:23
 */
public class MainCLass {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Tank tank = (Tank) applicationContext.getBean("tank");
        System.out.println(tank);
    }
}
