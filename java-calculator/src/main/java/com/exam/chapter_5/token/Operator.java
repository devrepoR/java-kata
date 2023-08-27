package com.exam.chapter_5.token;

import com.exam.chapter_5.strategy.*;

public class Operator implements Token {
    char operationSymbol;
    OperatorPolicy strategy;

    public Operator(char operation) {
        this.operationSymbol = operation;

        switch (operation) {
            case '+':
                strategy = new AdditionStrategy();
                break;
            case '-':
                strategy = new SubtractionStrategy();
                break;
            case '*':
                strategy = new MultiplicationStrategy();
                break;
            case '/':
                strategy = new DivisionStrategy();
                break;
        }
    }

    public int operate(int left, int right) {
        return strategy.execute(left, right);
    }
}