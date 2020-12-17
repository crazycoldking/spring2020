package org.codeboy;

import org.codeboy.bean.People;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleComponentScanRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleComponentScanRunner.class);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(People.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}
