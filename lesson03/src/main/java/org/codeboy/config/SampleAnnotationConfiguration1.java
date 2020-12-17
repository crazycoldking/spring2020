package org.codeboy.config;

import org.codeboy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

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
