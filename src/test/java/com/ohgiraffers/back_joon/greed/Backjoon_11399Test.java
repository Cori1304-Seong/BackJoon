package com.ohgiraffers.back_joon.greed;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Backjoon_11399Test {
    static private String input1;
    static private String input2;
    static private String input3;
    static private Integer output1;
    static private Integer output2;
    static private Integer output3;

    @BeforeAll
    public static void  setUp1() {
        input1 = "5\n" +
                "3 1 4 3 2";
        output1=32;
    }

    public  static void provideInputs(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in); // Syst
    }
    @DisplayName("보물 테스트1")
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
    @Test
    public void Test1()  throws Exception{
        provideInputs(input1);

        int result = Backjoon_11399.main(new String[0]);

        Assertions.assertEquals(output1, result);
    }
}