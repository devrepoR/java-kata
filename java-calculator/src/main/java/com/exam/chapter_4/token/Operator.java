package com.exam.chapter_4.token;

public class Operator implements Token {
    private final char operation;

    public Operator(char operation) {
        this.operation = operation;
    }

    public char getOperation() {
        return operation;
    }
}