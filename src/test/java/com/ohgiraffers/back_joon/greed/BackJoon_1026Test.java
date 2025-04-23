package com.ohgiraffers.back_joon.greed;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@SpringBootTest
class BackJoon_1026Test {


    static private String input1;
    static private String input2;
    static private String input3;
    static private Integer output1;
    static private Integer output2;
    static private Integer output3;
    ;


    @BeforeAll
    public static void  setUp1() {
//             Input in   =new Input(3, new int[]{2, 3, 1}, new int[]{5, 2, 4,1});
        input1 = "5\n" +
                "1 1  1 6 0\n" +
                "2 7 8 3 1";
        output1=18;


        input2 = "3\n" +
                "1 1 3\n" +
                "10 30 20";
        output2=80;


        input3 = "9\n" +
                "5 15 100 31 39 0 0 3 26\n" +
                "11 12 13 2 3 4 5 9 1";
        output3 =528;


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

      int result = BackJoon_1026.main("");

        Assertions.assertEquals(output1, result);
    }

    @DisplayName("보물 테스트2")
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
    @Test
    public void Test2()  throws Exception{
        provideInputs(input2);

        int result = BackJoon_1026.main("");

        Assertions.assertEquals(output2, result);
    }

    @DisplayName("보물 테스트3")
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
    @Test
    public void Test3()  throws Exception{
        provideInputs(input3);

        int result = BackJoon_1026.main("");

        Assertions.assertEquals(output3, result);
    }
}