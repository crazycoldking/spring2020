package org.codeboy;

import org.codeboy.config.ConfigOfPropertyValues;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleRunner1 {

    public static void main(String[] args) {

        System.setProperty("name", "ABC");

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigOfPropertyValues.class)) {
            final String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
            for (String beanDefinitionName : beanDefinitionNames) {
                System.out.println(beanDefinitionName);
            }

            final Object abc = applicationContext.getBean("ABC");
            System.out.println(abc);

            final Object jack = applicationContext.getBean("Jack");
            System.out.println(jack);
        }
    }
}
