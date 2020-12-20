package org.codeboy;

import org.codeboy.config.ConfigOfAutowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleRunner2 {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigOfAutowired.class)) {
            final String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
            for (String beanDefinitionName : beanDefinitionNames) {
                System.out.println(beanDefinitionName);
            }

            System.out.println(applicationContext.getBean("controllerA"));
        }
    }
}
