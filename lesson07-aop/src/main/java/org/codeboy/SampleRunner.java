package org.codeboy;

import org.codeboy.config.SampleAopConfig;
import org.codeboy.controller.CalculatorController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleRunner {
    public static void main(String[] args) {
        try (final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleAopConfig.class)) {
            final CalculatorController calculatorController = applicationContext.getBean(CalculatorController.class);
            final int divide = calculatorController.divide(1, 1);
            System.out.println(divide);
        }
    }
}
