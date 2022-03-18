package com.jspang582.springboot.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfigurationImportEvent;
import org.springframework.boot.autoconfigure.AutoConfigurationImportListener;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import java.util.List;
import java.util.Set;

/**
 * @author lifeng
 * @Description:
 * @date 2022/3/18 22:43
 */
public class MyAutoConfigurationImportListener implements AutoConfigurationImportListener, EnvironmentAware {

    private Environment environment;

    @Override
    public void onAutoConfigurationImportEvent(AutoConfigurationImportEvent event) {
        List<String> candidateConfigurations = event.getCandidateConfigurations();
        Set<String> exclusions = event.getExclusions();
        System.out.println("candidateConfigurations size :" + candidateConfigurations.size());
        System.out.println("exclusions size :" + exclusions.size());
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
