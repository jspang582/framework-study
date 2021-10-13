package com.github.jspang582.spring;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/7/4 23:29
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import(MyTankRegistrar.class)
public @interface EnableTank {


    String tank() default "tank1";
}
