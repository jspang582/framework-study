package com.github.jspang582.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/9/6 0:27
 */
public class Main {

    transient static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
        User user = new User();
        user.setAge(18);
        user.setName("张三");
        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);
        user = objectMapper.readValue(json, User.class);
        System.out.println(user);
    }
}
