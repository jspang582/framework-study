package com.jspang582.springboot.autoconfigure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lifeng
 * @Description:
 * @date 2022/3/17 16:29
 */
@Configuration
public class MyAutoConfiguration {

    /**
     * 注册bean
     */
    @Bean
    public User user() {
        return new User();
    }
}
