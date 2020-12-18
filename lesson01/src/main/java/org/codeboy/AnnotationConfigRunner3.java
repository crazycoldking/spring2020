package org.codeboy;

import org.codeboy.config.SampleApplicationConfiguration3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigRunner3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleApplicationConfiguration3.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String s : beanDefinitionNames) {
            System.out.println(s);
        }
    }
}
