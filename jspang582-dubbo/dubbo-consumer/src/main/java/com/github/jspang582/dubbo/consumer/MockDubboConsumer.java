package com.github.jspang582.dubbo.consumer;

import com.github.jspang582.dubbo.api.GreetingsService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/13 16:54
 */
@EnableAutoConfiguration
public class MockDubboConsumer {

    @DubboReference(mock = "fail: return 123")
    private GreetingsService greetingsService;


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MockDubboConsumer.class, args);
        GreetingsService greetingsService = context.getBean(GreetingsService.class);

        System.out.println(greetingsService.sayHi("dubbo"));

        context.close();
    }
}
