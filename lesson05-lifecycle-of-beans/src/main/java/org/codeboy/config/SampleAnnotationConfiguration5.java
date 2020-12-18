package org.codeboy.config;

import lombok.extern.java.Log;
import org.codeboy.bean.CustomBeanPostProcessor;
import org.codeboy.bean.SuperMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Usage of Spring BeanPostProcessor interface
 * - postProcessBeforeInitialization
 * - postProcessAfterInitialization
 */
@Log
@ComponentScan(basePackageClasses = {CustomBeanPostProcessor.class})
public class SampleAnnotationConfiguration5 {

    @Bean("Christopher Reeve")
    public SuperMan person() {
        log.info("Create a new SuperMan instance!");
        return new SuperMan("Christopher Reeve", 25);
    }
}
