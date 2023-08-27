package com.exam.chapter_3.strategy;

interface Operator {
    int apply(int leftOperand, int rightOperand);
    String symbol();
}