package com.github.jspang582.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryForever;
import org.apache.zookeeper.data.Stat;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/13 11:51
 */
public class UpdateMain {


    public static void main(String[] args) throws Exception {
        CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:2181", new RetryForever(1000 * 10));
        client.start();
        Stat stat = client.setData().forPath("/zhangsan", "abc".getBytes());
        System.out.println(stat);
    }
}
