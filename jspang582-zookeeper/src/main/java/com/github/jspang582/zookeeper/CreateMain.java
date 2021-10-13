package com.github.jspang582.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryForever;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/13 11:26
 */
public class CreateMain {

    public static void main(String[] args) throws Exception {
        CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:2181", new RetryForever(1000));
        client.start();
        String s = client.create().forPath("/zhangsan", "123".getBytes());
        System.out.println(s);
    }
}
