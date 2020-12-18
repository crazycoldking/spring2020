package org.codeboy;

import lombok.extern.java.Log;
import org.codeboy.config.SampleAnnotationConfiguration4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log
public class SampleRunner4 {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleAnnotationConfiguration4.class)) {
            String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
            StringBuilder stringBuilder = new StringBuilder();
            for (String beanDefinitionName : beanDefinitionNames) {
                stringBuilder.append("Bean: ").append(beanDefinitionName).append('\n');
            }

            log.info(stringBuilder.toString());
        }
    }
}
