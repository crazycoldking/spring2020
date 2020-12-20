package org.codeboy.config;

import org.codeboy.bean.Person;
import org.codeboy.bean.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigOfPropertyValues {

    @Bean("ABC")
    public Teacher teacher() {
        return new Teacher();
    }

    @Bean("Jack")
    public Person person() {
        return new Person("Jack", 20, "M");
    }

}
