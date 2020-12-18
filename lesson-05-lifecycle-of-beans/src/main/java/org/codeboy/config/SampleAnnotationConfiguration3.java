package org.codeboy.config;

import org.codeboy.bean.NewPerson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Usage of InitializingBean & DisposableBean interfaces
 */
@Configuration
public class SampleAnnotationConfiguration3 {

    @Bean("joker")
    public NewPerson person() {
        System.out.println("Create a new Person instance!");
        return new NewPerson("Jone", 25);
    }

}
