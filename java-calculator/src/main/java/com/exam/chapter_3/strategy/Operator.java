package com.exam.chapter_3.strategy;

public interface Operator {
    int apply(int leftOperand, int rightOperand);
    String symbol();
}