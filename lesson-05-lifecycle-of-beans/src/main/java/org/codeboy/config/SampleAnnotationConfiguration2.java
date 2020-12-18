package org.codeboy.config;

import org.codeboy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SampleAnnotationConfiguration2 {

    /**
     * destroy method won't be called with prototype scope
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    public Person person() {
        return new Person();
    }
}
