package org.codeboy;

import org.codeboy.bean.Person;
import org.codeboy.config.SampleApplicationConfiguration1;
import org.codeboy.config.SampleApplicationConfiguration2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigRunner2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleApplicationConfiguration2.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String s : beanDefinitionNames) {
            System.out.println(s);
        }

        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        Object worker = applicationContext.getBean("worker");
        System.out.println(worker);

        Object bookDao = applicationContext.getBean("bookDao");
        System.out.println((bookDao == null));
    }
}
