package org.codeboy.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int divide(int a, int b) {
        return a / b;
    }
}
