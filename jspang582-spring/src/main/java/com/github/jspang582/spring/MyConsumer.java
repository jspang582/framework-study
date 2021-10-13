package com.github.jspang582.spring;

import java.util.function.Consumer;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/8/28 9:51
 */
public class MyConsumer implements Consumer<Student> {


    @Override
    public void accept(Student student) {
        System.out.println(student);
    }
}
