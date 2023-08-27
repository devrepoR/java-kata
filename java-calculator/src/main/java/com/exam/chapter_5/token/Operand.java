package com.exam.chapter_5.token;

public class Operand implements Token {
    private final int value;

     public Operand(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}