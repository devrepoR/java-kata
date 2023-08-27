package com.exam.chapter_3.strategy;

class Subtract implements Operator {
    @Override
    public int apply(int left, int right) {
        return left - right;
    }

    @Override
    public String symbol() {
        return "-";
    }
}


