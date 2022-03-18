package com.jspang582.springboot.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfigurationImportFilter;
import org.springframework.boot.autoconfigure.AutoConfigurationMetadata;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author lifeng
 * @Description:
 * @date 2022/3/17 16:22
 */
public class MyConfigurationImportFilter implements AutoConfigurationImportFilter, EnvironmentAware {

    private Environment environment;

    /**
     * 如果配置文件中my-auto-configuration.enabled值为true时,则装载MyAutoConfiguration自动配置类
     */
    @Override
    public boolean[] match(String[] autoConfigurationClasses, AutoConfigurationMetadata autoConfigurationMetadata) {
        boolean[] matches = new boolean[autoConfigurationClasses.length];
        for (int i = 0; i < matches.length; i++) {
            // 当读取到MyAutoConfiguration自动配置类时, 如果配置文件中my-auto-configuration.enabled为true,则加载该自动配置类
            matches[i] = MyAutoConfiguration.class.getName().equals(autoConfigurationClasses[i]) ? environment.getProperty("my-auto-configuration.enabled", Boolean.class, true) : true;
        }
        return matches;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
