package org.codeboy;

import org.codeboy.bean.Person;
import org.codeboy.config.SampleAnnotationConfiguration2;
import org.codeboy.config.SampleAnnotationConfiguration3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleRunner3 {
    public static void main(String[] args) {
        System.setProperty("role", "Programmer");
//        System.setProperty("role", "Actor");
//        System.setProperty("role", "Farmer");

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleAnnotationConfiguration3.class);

        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
            System.out.println(applicationContext.getBean(s));
        }

    }
}
