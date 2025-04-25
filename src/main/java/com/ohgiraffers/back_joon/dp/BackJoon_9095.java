package com.ohgiraffers.back_joon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BackJoon_9095 {

    static  int[] main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];
        int[] contain  = new int[12];
        Arrays.fill(contain, -1);
        contain[0] = 1;
        contain[1] = 1;
        contain[2] = 2;
        contain[3] = 4;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            int number = Integer.parseInt(s);
            answer[i] = getNumber(number, contain);
            System.out.println(answer[i]);
        }

        return answer;
    }

    // 점화식
    private static int getNumber(int N, int[] contain) {
        int answer = 0;

        for(int i=0; i<=N; i++){
            if(i >= 3 && contain[i]== -1){
                contain[i] = contain[i-1] + contain[i-2] + contain[i-3];
            }

        }
        return contain[N];

    }
}


/**
 *1.  1,1,1,1,1
 *2.  1,1,2,1
 *3.  1,2,1,1
 *4.  2,1,1,1
 *5.  2,2,1
 *6.  1,3,1
 *7.  3,1,1
 *8. 1,1,1,2
 * 1,1,3
 * 1,2,2
 * 2,1,2,
 * 2,3
 * 3,2,
 *
 * */