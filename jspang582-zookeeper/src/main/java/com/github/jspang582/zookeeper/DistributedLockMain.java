package com.github.jspang582.zookeeper;

import lombok.SneakyThrows;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.RetryForever;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * 分布式锁用例
 *
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/13 13:22
 */
public class DistributedLockMain {

    static InterProcessMutex lock;

    static {
        CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:2181", new RetryForever(1000));
        client.start();
        lock = new InterProcessMutex(client, "/myLock");
    }

    public static void main(String[] args) throws Exception {
        IncrementTask task = new IncrementTask();
        IntStream.range(0, 5).forEach(i -> {
            new Thread(task).start();
        });
    }


    static class IncrementTask implements Runnable {
        int i = 0;

        @SneakyThrows
        @Override
        public void run() {
            if (lock.acquire(1000 * 5, TimeUnit.SECONDS)) {
                try {
                    System.out.println(i++);
                } finally {
                    lock.release();
                }
            }
        }
    }
}
