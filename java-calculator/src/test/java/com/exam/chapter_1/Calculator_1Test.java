package com.exam.chapter_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Calculator_1Test {

    @Test
    void calculatorTest() {
        // given
        Calculator_1 calculator_1 = new Calculator_1();

        // when
        String helloWorld = calculator_1.helloWorld();

        // then
        assertThat(helloWorld).isEqualTo("Hello World");
    }
}