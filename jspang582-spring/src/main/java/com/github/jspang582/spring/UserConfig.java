package com.github.jspang582.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lifeng
 * @Description:
 * @date 2022/3/16 19:27
 */
@Configuration
public class UserConfig {

    @Bean
     public DefaultUser user() {
        return new DefaultUser();
    }
}
