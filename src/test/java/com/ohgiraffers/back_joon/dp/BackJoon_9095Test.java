package com.ohgiraffers.back_joon.dp;

import com.ohgiraffers.back_joon.greed.BackJoon_13305;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@SpringBootTest
class BackJoon_9095Test {
    static private String input1;
    static private String input2;
    static private Integer[] output1;
    static private Integer output2;

    @BeforeAll
   static void setup(){
        input1 = "3\n" +
                 "4\n" +
                 "7\n" +
                 "10";
        output1=new Integer[]{7,44,274};
    }

    public  static Stream<Arguments> provideInputs1() {
        return Stream.of(
                arguments(input1, output1)
        );
    }

    @DisplayName("1,2,3 더하기")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideInputs1")
    void contextLoads()  throws Exception {

        // 테스트 입력 문자열
        // String input = "Hello, world!\n";
        // 문자열을 입력 스트림으로 변환
        ByteArrayInputStream in = new ByteArrayInputStream(input1.getBytes());
        System.setIn(in); // System.in을 우리가 만든 스트림으로 대체

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] res = BackJoon_9095.main(new String[0]);

        Assertions.assertEquals(Arrays.toString( output1), Arrays.toString(res));

    }



}