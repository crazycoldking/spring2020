package org.codeboy.config;

import org.codeboy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleApplicationConfiguration1 {
    // register component
    @Bean("worker")
    public Person person() {
        return new Person("Jack", 20);
    }

}
