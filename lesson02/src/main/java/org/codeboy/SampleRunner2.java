package org.codeboy;

import org.codeboy.bean.Person;
import org.codeboy.config.SampleAnnotationConfiguration2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleRunner2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleAnnotationConfiguration2.class);
        // Scope: singleton
        // Lazy(true)
        // a new Person instance will be create once getting the first bean
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
        Object programmer = applicationContext.getBean("programmer");
        System.out.println(programmer);
        System.out.println(bean == programmer);

    }
}
