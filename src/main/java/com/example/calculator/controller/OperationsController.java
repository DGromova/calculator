package com.example.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public CharSequence plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "+" + num2 + "=" + operationsService.getPlus(num1, num2);
    }
    @GetMapping("/minus")
    public CharSequence minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "-" + num2 + "=" + operationsService.getMinus(num1, num2);
    }
    @GetMapping("/multiply")
    public CharSequence multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "*" + num2 + "=" + operationsService.getMultiply(num1, num2);
    }
    @GetMapping("/divide")
    public CharSequence divide(@RequestParam int num1, @RequestParam int num2) throws RuntimeException {
        if (num2 == 0) return "Ошибка. Деление на ноль";
        return num1 + "/" + num2 + "=" + operationsService.getDivide(num1, num2);
    }
}
