package com.ohgiraffers.back_joon.dp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BackJoon_11570Test {

    static private String input1;
    static private String input2;
    static private Integer output1;
    static private Integer output2;

    @BeforeAll
    static void setup(){
        input1 = "5\n" +
                "1 3 8 12 13\n";

        output1=7;

        input2 = "5\n" +
                "1 5 6 2 1\n";

        output2=3;
    }


    @Test
    void test1() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(input1.getBytes());
        System.setIn(in); // System.in을 우리가 만든 스트림으로 대체

       int result = BackJoon_11570.main(new String[0]);

       assertEquals(output1, result);
    }

    @Test
    void test2() throws IOException {

        ByteArrayInputStream in = new ByteArrayInputStream(input2.getBytes());
        System.setIn(in); // System.in을 우리가 만든 스트림으로 대체

        int result = BackJoon_11570.main(new String[0]);

        assertEquals(output2, result);
    }

}