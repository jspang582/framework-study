package com.github.jspang582.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lifeng
 * @Description:
 * @date 2022/3/16 19:27
 */
public class UserMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
        DefaultUser user = applicationContext.getBean(DefaultUser.class);
        System.out.println(user.getName());
    }
}
