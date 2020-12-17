package org.codeboy.config;

import org.codeboy.bean.People;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleApplicationConfiguration {
    @Bean("Alice")
    public People people() {
        return new People("Alice", 18);
    }
}
