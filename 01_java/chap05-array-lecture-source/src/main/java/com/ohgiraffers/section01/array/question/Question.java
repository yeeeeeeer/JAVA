package main.java.com.ohgiraffers.section01.array.question;

import java.util.Enumeration;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        // 배열의 최솟값, 최댓값 찾기

        // 배열 길이는 스캐너로 입력받아 요소마다 임의의 정수를 넣어줌.
        // 해당 배열의 최솟값과 최댓값을 출력해주는 기능을 만들어주세요.

        // + 플러스문제. 배열의 두번째로 큰 값 출력하기.

        // 배열 길이 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 길이 : ");
        int size = sc.nextInt();

        // 입력받은 배열 길이 - 배열 생성 - new 연산자사용
        int[] arr = new int[size];

        // 생성한 배열에 정수 넣기 - 정수에 슷자입력 받기
        for (int i = 0; i < size; i++) {
            System.out.println("정수 입력 : ");
            arr[i] = sc.nextInt();
        }

        // 배열의 최솟값, 최댓값 출력 기능
        // 최솟값, 최댓값 변수 생성
        int min = arr[0];
        int max = arr[0];
        // 두번째 큰 수 변수 생성
        int secondMax = arr[0];
        int second = arr[0];

        // 배열을 하나씩 도는 반복문
        for (int i = 0; i < size; i++) {
            // 배열 하나씩 돌면서 비교 - 최솟값, 최댓값
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] >= max) {
                secondMax = max;
                max = arr[i];
            }

            if (arr[i] != max) {
                secondMax = arr[i];
                int[] arr2 = new int[secondMax];
                for (int j = 0; j < secondMax; j++) {
//                    if(arr[j]);
                }
            }
        }
        System.out.println("min: " + min + " max: " + max);
        System.out.println("secondMax: " + secondMax);
        // 배열의 두번째로 큰 값 출력하기

    }
}



