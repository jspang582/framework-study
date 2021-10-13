package com.github.jspang582.dubbo.consumer;

import com.github.jspang582.dubbo.api.GreetingsService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 普通调用
 *
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/13 16:32
 */
@EnableAutoConfiguration
public class DubboConsumer {


    @DubboReference
    private GreetingsService greetingsService;


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboConsumer.class, args);
        GreetingsService greetingsService = context.getBean(GreetingsService.class);

        System.out.println(greetingsService.sayHi("dubbo"));

        context.close();
    }
}
