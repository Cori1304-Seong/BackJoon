package com.ohgiraffers.back_joon.greed;


// 실패한 해결책: 전체 피료한 양을 구하고 가장 기름이 싼 곳까지 이동후 모두 구매한 가격 리턴 (단 마지막 도시는 싼 기름에서 제외)
// 성고한 해결책: 주유소 탐색을 계속하면서 돌아딘 곳에 가장싼 가격만큼 기름 구매


import java.io.*;
import java.util.*;

public class BackJoon_13305 {

    static public long main(String args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] cityDistance = new int[N];
        int[] oilPrices = new int[N + 1];
        int totalDistance = 0;


        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N - 1; i++) {
            int dist = Integer.parseInt(st1.nextToken());
            cityDistance[i] = dist;
            totalDistance += dist;

        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            oilPrices[i] = Integer.parseInt(st2.nextToken());

        }

        int minPrice = Integer.MAX_VALUE;
        long totalPrice = 0;
        for (int i = 1; i < N; i++) {
            if (minPrice > oilPrices[i]) minPrice = oilPrices[i];

            totalPrice += minPrice * cityDistance[i];
        }


        System.out.println("총 도시수" + N + ", 총거리" + totalDistance);
        System.out.println("총 비용" + totalPrice);
        return totalPrice;
    }


    public static void main11(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cityDistance = new int[N];
        int[] oilPrices = new int[N + 1];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N - 1; i++) {
            int dist = Integer.parseInt(st1.nextToken());
            cityDistance[i] = dist;

        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            oilPrices[i] = Integer.parseInt(st2.nextToken());

        }

        int minPrice = Integer.MAX_VALUE;
        int totalPrice = 0;
        for (int i = 1; i < N; i++) {
            if (minPrice > oilPrices[i]) minPrice = oilPrices[i];

            totalPrice += minPrice * cityDistance[i];
        }
        //System.out.println("총 도시수"+N +", 총거리" +totalDistance);
        System.out.println(totalPrice);

    }

}
