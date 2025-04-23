package com.ohgiraffers.back_joon;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.provider.Arguments;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.stream.Stream;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Input{
    public int cityCount;
    public int[] needOil;
    public int[] oilPrice;

    Input(int cityCount, int[] needOil, int[] oilPrice) {
        this.cityCount = cityCount;
        this.needOil = needOil;
        this.oilPrice = oilPrice;
    }

}


@SpringBootTest
class BackJoonApplicationTests {
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


}
