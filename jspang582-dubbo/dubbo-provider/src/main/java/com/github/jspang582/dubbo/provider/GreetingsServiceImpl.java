package com.github.jspang582.dubbo.provider;

import com.github.jspang582.dubbo.api.GreetingsService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/13 14:50
 */
@DubboService
public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayHi(String name) {
        return "hi, " + name;
    }
}
