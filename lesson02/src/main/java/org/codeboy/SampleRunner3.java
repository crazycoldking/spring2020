package org.codeboy;

import org.codeboy.bean.Person;
import org.codeboy.config.SampleAnnotationConfiguration3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleRunner3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleAnnotationConfiguration3.class);
        // Scope: prototype
        // different Person instance will be create each time getting a bean

        System.out.println("IoC container created!");

        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
        Object programmer = applicationContext.getBean("actor");
        System.out.println(programmer);
        System.out.println(bean == programmer);

    }
}
