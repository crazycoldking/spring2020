package org.codeboy.config;

import org.codeboy.aop.CalculatorAspect1;
import org.codeboy.aop.CalculatorAspect2;
import org.codeboy.controller.CalculatorController;
import org.codeboy.service.CalculatorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class SampleAopConfig {

    @Bean
    public CalculatorService calculatorService() {
        return new CalculatorService();
    }

    @Bean
    public CalculatorController calculatorController() {
        return new CalculatorController();
    }

//    @Bean
//    public CalculatorAspect1 calculatorAspect1() {
//        return new CalculatorAspect1();
//    }

    @Bean
    public CalculatorAspect2 calculatorAspect2() {
        return new CalculatorAspect2();
    }
}
