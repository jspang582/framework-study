package com.github.jspang582.dubbo.provider;

import org.apache.dubbo.config.ApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/13 16:18
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        ApplicationConfig applicationConfig = context.getBean(ApplicationConfig.class);
        System.out.println(applicationConfig);
    }
}
