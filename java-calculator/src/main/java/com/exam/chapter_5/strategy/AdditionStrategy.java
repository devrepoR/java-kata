package com.exam.chapter_5.strategy;

public class AdditionStrategy implements OperatorPolicy {
    @Override
    public int execute(int left, int right) {
        return left + right;
    }
}