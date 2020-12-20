package org.codeboy.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Log
@Aspect
public class CalculatorAspect1 {

    @Before("execution(public int org.codeboy.controller.CalculatorController.divide(int, int))")
    public void beforeCalculate(JoinPoint joinPoint) {
        final String name = joinPoint.getSignature().getName();
        log.info(String.format("> Before %s ...", name));
    }

    @After("execution(public int org.codeboy.controller.CalculatorController.divide(int, int))")
    public void afterCalculate(JoinPoint joinPoint) {
        log.info(String.format("> After %s ...", joinPoint.getSignature().getName()));
    }

    @AfterReturning("execution(public int org.codeboy.controller.CalculatorController.divide(int, int))")
    public void returnCalculateResult() {
        log.info("> Return ...");
    }

    @AfterThrowing("execution(public int org.codeboy.controller.CalculatorController.divide(int, int))")
    public void calculateThrowing() {
        log.info("> Throwing ...");
    }
}
