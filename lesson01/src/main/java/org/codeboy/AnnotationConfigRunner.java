package org.codeboy;

import org.codeboy.bean.Person;
import org.codeboy.config.SampleApplicationConfiguration1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleApplicationConfiguration1.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String s : beanDefinitionNames) {
            System.out.println(s);
        }

        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        Object worker = applicationContext.getBean("worker");
        System.out.println(worker);
    }
}
