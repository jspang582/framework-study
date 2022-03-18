package com.github.jspang582.spring.imports;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author lifeng
 * @Description:
 * @date 2022/3/17 13:25
 */
@Configuration
@Import(DogImportSelector.class)
public class DogConfig {

}
