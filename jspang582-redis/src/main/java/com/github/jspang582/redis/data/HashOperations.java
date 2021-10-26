package com.github.jspang582.data;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * hash操作
 *
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/26 15:34
 */
@EnableAutoConfiguration
public class HashOperations {

    private StringRedisTemplate stringRedisTemplate;

    private ConfigurableApplicationContext applicationContext;


    @Before
    public void init() {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(HashOperations.class);
        this.applicationContext = applicationContext;
        this.stringRedisTemplate = applicationContext.getBean(StringRedisTemplate.class);
    }

    @After
    public void close() {
        applicationContext.close();
    }

    /**
     * HINCRBY  key  field  increment
     */
    @Test
    public void hincrby() {
        Long num = stringRedisTemplate.boundHashOps("cart:1001").increment("10088", 2);
        System.out.println(num);
    }

    /**
     * HGET  key field
     */
    @Test
    public void hget(){
        Object num = stringRedisTemplate.boundHashOps("cart:1001")
                .get("10088");
        System.out.println(num);

    }
}
