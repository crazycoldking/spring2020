package org.codeboy;

import org.codeboy.config.SampleAnnotationConfiguration3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleRunner3 {
    public static void main(String[] args) {
        System.setProperty("role", "Programmer");
//        System.setProperty("role", "Actor");
//        System.setProperty("role", "Farmer");

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleAnnotationConfiguration3.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }
}
