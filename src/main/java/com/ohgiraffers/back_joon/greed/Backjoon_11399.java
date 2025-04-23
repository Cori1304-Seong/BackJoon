package com.ohgiraffers.back_joon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * N만큼 p가 있을때
 * total Time = P1 + (P1+P2) + (P1+P2+P3) + ... + (P1+...PN)
 */
// P1이 커질 수록 뒤에 대기 시간은 길어진다. 그렇기에 오름차순 정렬 후 total time을 구하면 끝

public class Backjoon_11399 {

   public static int main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        int N = Integer.parseInt(br.readLine());

        int[] times = new int[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st1.nextToken());
            times[i] = num;
        }

        Arrays.sort(times);

        int waitTime = 0;
        for(int time: times) {
            answer += time + waitTime;
            waitTime += time;
        }


        return answer;
    }
}
