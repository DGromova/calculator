package com.example.calculator.controller;

import org.springframework.stereotype.Service;

@Service

public class OperationsInterfaceImpl implements OperationsInterface {
    @Override
    public int getPlus(int num1, int num2) {
        return num1 + num2;
    }
    @Override
    public int getMinus(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public int getMultiply(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public int getDivide(int num1, int num2) {
        return num1 / num2;
    }
}
