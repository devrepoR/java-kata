package com.exam.chapter_4.token;

public class Operand implements Token {
    private final int value;

     public Operand(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}