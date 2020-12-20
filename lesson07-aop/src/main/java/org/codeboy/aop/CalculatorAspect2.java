package org.codeboy.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;
import java.util.List;

@Log
@Aspect
public class CalculatorAspect2 {

    @Pointcut("execution(public int org.codeboy.controller.CalculatorController.*(int, int))")
    public void cutPoint() {

    }

    @Before("org.codeboy.aop.CalculatorAspect2.cutPoint()")
    public void beforeCalculate(JoinPoint joinPoint) {
        final String name = joinPoint.getSignature().getName();
        final List<Object> args = Arrays.asList(joinPoint.getArgs());
        log.info(String.format("> Before %s %s ...", name, args));
    }

    @After("org.codeboy.aop.CalculatorAspect2.cutPoint()")
    public void afterCalculate(JoinPoint joinPoint) {
        log.info(String.format("> After %s ...", joinPoint.getSignature().getName()));
    }

    @AfterReturning(value = "org.codeboy.aop.CalculatorAspect2.cutPoint()", returning = "result")
    public void returnCalculateResult(Object result) {
        log.info(String.format("> Return %s ...", result));
    }

    @AfterThrowing(value = "org.codeboy.aop.CalculatorAspect2.cutPoint()", throwing = "exception")
    public void calculateThrowing(Exception exception) {
        log.info(String.format("> Throwing %s ...", exception.getMessage()));
    }
}
