package com.github.jspang582.spring;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/7/4 23:09
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {Tank.class.getName()};
    }
}
