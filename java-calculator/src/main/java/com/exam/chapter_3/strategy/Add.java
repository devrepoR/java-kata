package com.exam.chapter_3.strategy;

public class Add implements Operator {
    @Override
    public int apply(int left, int right) {
        return left + right;
    }

    @Override
    public String symbol() {
        return "+";
    }
}