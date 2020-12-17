package org.codeboy.config;

import org.codeboy.bean.Person;
import org.codeboy.conditon.ProgramerCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional(ProgramerCondition.class)
@Configuration
public class SampleAnnotationConfiguration3 {
    @Bean("Angular Developer")
    public Person person() {
        System.out.println("Create a new Person instance!");
        return new Person("Joy", 25);
    }

    @Bean("Java Developer")
    public Person person2() {
        System.out.println("Create a new Person instance!");
        return new Person("Gosling", 35);
    }

    @Bean("AI Developer")
    public Person person3() {
        System.out.println("Create a new Person instance!");
        return new Person("Megan Fox", 35);
    }
}
