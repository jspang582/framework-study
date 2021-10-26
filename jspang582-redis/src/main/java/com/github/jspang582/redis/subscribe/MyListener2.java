package com.github.jspang582.redis.subscribe;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/9/1 14:07
 */
@Component
public class MyListener2 implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] pattern) {
        System.out.println( "Message received2: " + message.toString() );
    }
}
