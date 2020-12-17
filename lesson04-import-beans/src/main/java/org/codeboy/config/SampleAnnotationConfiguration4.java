package org.codeboy.config;

import org.codeboy.bean.Person;
import org.codeboy.bean.Salary;
import org.codeboy.bean.TitleFactoryBean;
import org.codeboy.conditon.ActorCondition;
import org.codeboy.conditon.FarmerCondition;
import org.codeboy.conditon.MyImportBeanDefinitionRegistrar;
import org.codeboy.conditon.ProgramerCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({Salary.class})
@Configuration
public class SampleAnnotationConfiguration4 {
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

    @Bean("tt")
    public TitleFactoryBean titleFactoryBean() {
        return new TitleFactoryBean();
    }
}
