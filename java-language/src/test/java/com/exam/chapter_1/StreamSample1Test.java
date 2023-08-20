package com.exam.chapter_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StreamSample1Test {

    @Test
    void helloWorldTest() {
        // given
        StreamSample1 streamSample1 = new StreamSample1();

        // when
        String returnHelloWorld = streamSample1.helloWorld();

        // then
        assertThat(returnHelloWorld).isEqualTo("Hello World");
    }
}