package com.tak.study;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double arr[] = new double[sc.nextInt()];

        //점수 입력
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }

        sc.close();

        //모든 점수 합계
        double sum = 0;

        //오름차순으로 정렬 후 맨 마지막에 있는 가장 큰 점수 도출하기 위함
        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {

            //가장 큰 점수
            sum += ((arr[i] / arr[arr.length - 1]) * 100);
            
        }

        System.out.println(sum / arr.length);

    }

}
