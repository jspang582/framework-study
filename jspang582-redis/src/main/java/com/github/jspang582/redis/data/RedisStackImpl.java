package com.github.jspang582.redis.data;

import lombok.AllArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * redis实现栈
 *
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/26 14:30
 */
@AllArgsConstructor
public class RedisStackImpl implements Stack<String> {

    private StringRedisTemplate stringRedisTemplate;


    @Override
    public String push(String item) {
        stringRedisTemplate.boundListOps("ids")
               .leftPush(item);
        return item;
    }

    @Override
    public String pop() {
        String item = stringRedisTemplate.boundListOps("ids").leftPop();
        return item;
    }
}
