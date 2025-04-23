package com.ohgiraffers.back_joon.greed;

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
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@SpringBootTest
class BackJoon_13305Test {
    static private String input1;
    static private String input2;
    static private Integer output1;
    static private Integer output2;


    @BeforeAll
    public static void  setUp1() {
//             Input in   =new Input(3, new int[]{2, 3, 1}, new int[]{5, 2, 4,1});
        input1 = "4\n" +
                "2 3 1\n" +
                "5 2 4 1";
        output1=18;
    }

    public  static Stream<Arguments> provideInputs1() {
        return Stream.of(
                arguments(input1, output1)
        );
    }

    @DisplayName("주유소")
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideInputs1")
    void contextLoads(String input, Integer output)  throws Exception {

        // 테스트 입력 문자열
//        String input = "Hello, world!\n";
        // 문자열을 입력 스트림으로 변환
        ByteArrayInputStream in = new ByteArrayInputStream(input1.getBytes());
        System.setIn(in); // System.in을 우리가 만든 스트림으로 대체

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long Sresult =BackJoon_13305.main(input);
    }


}