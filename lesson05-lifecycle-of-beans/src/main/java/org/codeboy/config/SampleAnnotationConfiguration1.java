package org.codeboy.config;

import org.codeboy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleAnnotationConfiguration1 {
    /**
     * Get a person bean
     * initMethod - can be used to specify the action to initialize bean after construction
     *            - be called after construction
     * destroyMethod - can be used to release resource while destroying IoC container
     *            - be called after application context do Close
     * @return a new person
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Person person() {
        return new Person();
    }

}
