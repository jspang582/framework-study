package com.github.jspang582.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/9/6 0:23
 */

public class User {

    @JsonProperty(value = "姓名",access = JsonProperty.Access.READ_WRITE)
    private String name;
    @JsonProperty("年龄")
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
