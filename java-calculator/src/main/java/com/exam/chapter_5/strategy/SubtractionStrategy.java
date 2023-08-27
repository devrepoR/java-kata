package com.exam.chapter_5.strategy;

public class SubtractionStrategy implements OperatorPolicy {
    @Override
    public int execute(int left, int right) {
        return left - right;
    }
}

