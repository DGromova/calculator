package com.example.calculator;

import controller.FirstController;import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstController.CalculatorApplication.class, args);
    }
}
