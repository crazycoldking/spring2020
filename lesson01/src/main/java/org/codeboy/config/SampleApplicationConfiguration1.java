package org.codeboy.config;

import org.codeboy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Use @Configuration annotation and @Bean/@Autowired annotation to register beans
 */
@Configuration
public class SampleApplicationConfiguration1 {
    // register component, take value as the bean id
    @Bean(value = {"worker"})
    public Person person() {
        // constructor injection
        return new Person("Jack", 20);
    }

}
