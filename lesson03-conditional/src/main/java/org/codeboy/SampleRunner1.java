package org.codeboy;

import org.codeboy.config.SampleAnnotationConfiguration1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleRunner1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleAnnotationConfiguration1.class);
        // Default Scope: singleton
        // Lazy(false)
        // a new Person instance will be create even without getting bean

    }
}
