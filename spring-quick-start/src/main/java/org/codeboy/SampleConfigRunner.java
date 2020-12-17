package org.codeboy;

import org.codeboy.bean.People;
import org.codeboy.config.SampleApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleConfigRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleApplicationConfiguration .class);
//        People bean = applicationContext.getBean(People.class);
//        System.out.println(bean);
        Object alice = applicationContext.getBean("Alice");
        System.out.println(alice);

        String[] beanNamesForType = applicationContext.getBeanNamesForType(People.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}
