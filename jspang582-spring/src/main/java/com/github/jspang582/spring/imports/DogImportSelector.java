package com.github.jspang582.spring.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * @author lifeng
 * @Description:
 * @date 2022/3/17 13:33
 */
public class DogImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 返回Dog的全限定类名
        return new String[] {Dog.class.getName()};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return (className) -> false;
       // return (className) -> Dog.class.getName().equals(className);
    }
}
