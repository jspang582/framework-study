package com.jspang582.springboot.autoconfigure.app;

import com.jspang582.springboot.autoconfigure.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author lifeng
 * @Description:
 * @date 2022/3/17 16:32
 */
@EnableAutoConfiguration
public class Test {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Test.class, args);
        User user = applicationContext.getBean(User.class);
        System.out.println(user.getName());
    }
}
