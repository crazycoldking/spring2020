package org.codeboy.controller;

import lombok.extern.java.Log;
import org.codeboy.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;

@Log
public class CalculatorController {
    @Autowired
    public CalculatorService calculatorService;

    public int divide(int a, int b){
        log.info("> Divide operation is running ...");
        return calculatorService.divide(a, b);
    }

}
