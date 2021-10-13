package com.github.jspang582.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/8/20 17:20
 */
public class MyAnnotationConfigApplicationContext extends AnnotationConfigApplicationContext {


    @Override
    protected void onRefresh() throws BeansException {
        System.out.println("ssssssssssssssssssssssssssssssssssssssss");
    }
}
