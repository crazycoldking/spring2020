package org.codeboy.config;

import org.codeboy.bean.Person;
import org.codeboy.bean.Salary;
import org.codeboy.conditon.ActorCondition;
import org.codeboy.conditon.FarmerCondition;
import org.codeboy.conditon.MyImportSelector;
import org.codeboy.conditon.ProgramerCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({Salary.class, MyImportSelector.class})
@Configuration
public class SampleAnnotationConfiguration2 {
    @Conditional(FarmerCondition.class)
    @Bean
    public Person person() {
        System.out.println("Create a new Person instance!");
        return new Person("Joy", 25);
    }

    @Conditional(ProgramerCondition.class)
    @Bean
    public Person person2() {
        System.out.println("Create a new Person instance!");
        return new Person("Gosling", 35);
    }

    @Conditional(ActorCondition.class)
    @Bean
    public Person person3() {
        System.out.println("Create a new Person instance!");
        return new Person("Megan Fox", 35);
    }
}
