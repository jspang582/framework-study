package com.github.jspang582.jdk.juc.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

    public static void main(String[] args) {
        //addTest();
        removeTest();
    }

    private static void addTest() {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(2);
        System.out.println(blockingQueue.add(1));
        System.out.println(blockingQueue.add(2));
        System.out.println(blockingQueue.add(3));
    }

    private static void removeTest() {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(2);
        blockingQueue.add(1);
        blockingQueue.add(2);
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
    }
}
