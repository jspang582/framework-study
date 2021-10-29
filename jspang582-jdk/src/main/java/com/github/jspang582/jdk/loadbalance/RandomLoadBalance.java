package com.github.jspang582.jdk.loadbalance;


/**
 * 随机算法
 *
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/29 14:55
 */
public class RandomLoadBalance {

    public static String getServer() {
        // 生成一个随机数作为list的下标值
        java.util.Random random = new java.util.Random();
        int randomPos = random.nextInt(ServerIps.LIST.size());
        return ServerIps.LIST.get(randomPos);
    }

    public static void main(String[] args) {
        // 连续调用10次
        for (int i = 0; i < 10; i++) {
            System.out.println(getServer());
        }
    }
}
