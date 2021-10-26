package com.github.jspang582.redis.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * 测试
 *
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/26 17:24
 */
@Import(RedisStackImpl.class)
@EnableAutoConfiguration
public class StackTest {


    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(StackTest.class, args);
        com.github.jspang582.data.Stack<String>  stack= applicationContext.getBean(RedisStackImpl.class);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        applicationContext.close();
    }
}
