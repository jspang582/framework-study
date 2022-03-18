package com.jspang582.springboot.autoconfigure;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

/**
 * @author lifeng
 * @Description:
 * @date 2022/3/18 23:57
 */
@Order(Ordered.HIGHEST_PRECEDENCE + 1)
public class MyInitializerListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("MyInitializerListener execute.");
        System.out.println(Arrays.toString(event.getArgs()));
    }
}
