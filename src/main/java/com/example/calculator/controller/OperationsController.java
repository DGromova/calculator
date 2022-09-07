package com.example.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class OperationsController {
    private final OperationsService operationsService;

    public OperationsController(OperationsService operationsInterface) {
        this.operationsService = operationsInterface;
    }

    @GetMapping()
        public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public CharSequence plus(int num1, int num2) {
        return num1 + "+" + num2 + "=" + operationsService.getPlus(num1, num2);
    }
    @GetMapping("/minus")
    public CharSequence minus(int num1, int num2) {
        return num1 + "-" + num2 + "=" + operationsService.getMinus(num1, num2);
    }
    @GetMapping("/multiply")
    public CharSequence multiply(int num1, int num2) {
        return num1 + "*" + num2 + "=" + operationsService.getMultiply(num1, num2);
    }
    @GetMapping("/divide")
    public CharSequence divide(int num1, int num2) {
        return num1 + "/" + num2 + "=" + operationsService.getDivide(num1, num2);
    }
}
