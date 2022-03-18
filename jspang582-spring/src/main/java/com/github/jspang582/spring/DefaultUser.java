package com.github.jspang582.spring;

/**
 * @author lifeng
 * @Description:
 * @date 2022/3/16 19:26
 */
public class DefaultUser implements User {
    @Override
    public String getName() {
        return "zhangsan";
    }
}
