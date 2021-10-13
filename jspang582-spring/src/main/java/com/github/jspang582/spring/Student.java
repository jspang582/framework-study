package com.github.jspang582.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/7/4 22:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements ApplicationContextAware {

    private String id;
    private String name;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.name = "王五";
    }
}
