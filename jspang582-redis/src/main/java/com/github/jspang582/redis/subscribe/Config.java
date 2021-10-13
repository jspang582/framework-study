package com.github.jspang582.redis.subscribe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/9/1 14:08
 */
@Configuration
public class Config {

    @Autowired
    private MyListener myListener;
    @Autowired
    private MyListener2 myListener2;


    /**
     * 创建连接工厂
     */
    @Bean("container1")
    public RedisMessageListenerContainer container1(RedisConnectionFactory connectionFactory){
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        //接受消息的key
        container.addMessageListener(new MessageListenerAdapter(myListener),new ChannelTopic("test"));
        return container;
    }


    /**
     * 创建连接工厂
     */
    @Bean("container2")
    public RedisMessageListenerContainer container2(RedisConnectionFactory connectionFactory){
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        //接受消息的key
        container.addMessageListener(new MessageListenerAdapter(myListener2),new ChannelTopic("test2"));
        return container;
    }


}
