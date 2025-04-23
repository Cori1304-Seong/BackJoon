package com.ohgiraffers.back_joon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


// 첫번째 해결책: A를 sort후 B를 탐색하면 가장 적은 값을 유지한다.
//  - B가 사용될 수 있는 가장 작은 값을 매번 찾아서 A와 연결

/*
 * 아니 문제에 "S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.
 * S의 최솟값을 출력하는 프로그램을 작성하시오." 라고 되어 있는데 A,B 2개다 정렬하는 것도 답이라고 해주네... ㅠㅠ
 * */
public class BackJoon_1026 {

    static public int main(String args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        List<Integer> B = new ArrayList<>();
        int[] copyB = new int[N];


        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st1.nextToken());
            A[i] = num;
        }
        Arrays.sort(A);

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st2.nextToken());
            B.add(num);
        }


        for (int a : A) {
            int max = -1;
            int maxIdx = -1;
            for (int i = 0; i < B.size(); i++) {
                if (max < B.get(i)) {
                    max = B.get(i);
                    maxIdx = i;
                }

            }

            answer += a * max;
            B.remove(maxIdx);
        }

        return answer;
    }
}
