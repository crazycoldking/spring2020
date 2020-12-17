package org.codeboy.config;

import org.codeboy.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// @Import annotation indicates one or more @Configuration classes to import.
// components will be registered into container automatically
@Import({Role.class, Salary.class, Title.class, Capability.class})
@Configuration
public class SampleAnnotationConfiguration1 {

    @Bean(value = {"farmer"})
    public Person person() {
        System.out.println("Create a new Person instance!");
        return new Person("Joy", 25);
    }

    @Bean(value = {"programmer"})
    public Person person2() {
        System.out.println("Create a new Person instance!");
        return new Person("Gosling", 35);
    }

    @Bean(value = {"actor"})
    public Person person3() {
        System.out.println("Create a new Person instance!");
        return new Person("Megan Fox", 35);
    }
}
