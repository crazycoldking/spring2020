package org.codeboy.config;

import org.codeboy.bean.SuperMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Usage of @PreDestroy and @PostConstruct annotations within bean definition
 */
@Configuration
public class SampleAnnotationConfiguration4 {

    @Bean("Christopher Reeve")
    public SuperMan person() {
        System.out.println("Create a new SuperMan instance!");
        return new SuperMan("Christopher Reeve", 25);
    }
}
