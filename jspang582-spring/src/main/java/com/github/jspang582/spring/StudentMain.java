package com.github.jspang582.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/8/20 9:15
 */
@Configuration
@Import(StudentBeanDefinitionRegistrar.class)
public class StudentMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new MyAnnotationConfigApplicationContext();
        context.register(StudentMain.class);
        context.refresh();
        Student student = (Student)context.getBean("student1");
        System.out.println(student);
        student.setName("李四啊");
        student = (Student)context.getBean("student1");
        System.out.println(student);
/*        MyConsumer consumer = new MyConsumer();
        consumer.accept(new Student("1","张三"));
        Consumer<Student> consumer1 = consumer.andThen(new MyConsumer());
        consumer1.accept(new Student("2","李四"));*/
    }
}
