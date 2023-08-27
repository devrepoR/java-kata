package com.exam.chapter_3.strategy;

public class Operators {
    public static Operator fromSymbol(String symbol) {
        return switch (symbol) {
            case "+" -> new Add();
            case "-" -> new Subtract();
            case "*" -> new Multiply();
            case "/" -> new Divide();
            default -> throw new IllegalArgumentException("Invalid operator: " + symbol);
        };
    }
}