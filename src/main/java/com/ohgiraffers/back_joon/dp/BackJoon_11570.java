package com.ohgiraffers.back_joon.dp;


// 처음 생각: N개를 탐색하면 A,B 집합에 1개씩 값을 넣어줌 (차이가 가장 적은 곳에) =>  근데 이러면 GREED 아니가?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BackJoon_11570 {
    static int totalA = 0;
    static int totalB = 0;
    static Stack<Integer> A = new Stack();
    static Stack<Integer> B = new Stack();


    static  int main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] container = new int[N];
        int answer = 0;

        StringTokenizer strT =new StringTokenizer ( br.readLine());
        for (int i = 0; i < N; i++) {
            int n =Integer.parseInt (strT.nextToken());

            container[i] = n;
        }
        for (int i = 0; i < container.length; i++) {
            int n = container[i];

            // 1. 언제나 A부터 채움
            if(A.isEmpty()) addA(n);
            else if(B.isEmpty()&&
                    Math.abs(n-container[i+1]) < Math.abs(n-A.peek()))
            {
                addB(n);
            }

            // 2. |A.peek() - n| > |B.peek() -n| 비교
            else if(!A.isEmpty() &&!B.isEmpty()&&
                    Math.abs(A.peek() - n) > Math.abs(B.peek() - n))
            {
                addB(n);
            }
            else {addA(n);}
        }




        return totalB + totalA;
    }

    static void addA(int num){
        if(!A.isEmpty()) {

            totalA += Math.abs(A.peek() -num);
        }
        A.push(num);
    }

    static void addB(int num){

        if(!B.isEmpty()) {

            totalB += Math.abs(B.peek() -num);
//            totalB += num;

        }
        B.push(num);
    }
}
