package main.java.com.ohgiraffers.section02.looping.Question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /*
         * 입력한 숫자 범위 내에서 소수를 찾아 출력하는 프로그램을 작성해보자.
         * 사용자로부터 시작 숫자와 끝 숫자를 입력받습니다.
         * 프로그램은 해당 범위 내에 존재하는 모든 소수를 출력합니다.
         * 소수 = 1과 자기 자신을 제외한 수로 나누어 떨어지는 수
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("시작숫자 입력 : ");
        int start = sc.nextInt();
        System.out.println("끝 숫자 입력 : ");
        int end = sc.nextInt();

        System.out.println(start + "부터" + end + "까지의 소수 : ");

        int count = 0;

        // 시작~끝수
        for (int i = start; i < end; i++) {

            boolean isTrue = true;
            // 2~끝 범위
            for (int j = 2; j < i; j++) {

                // 소수 고르기 (약수가 자기자신)
                if (i % j == 0) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue == true) {
                System.out.println(i + " ");
            }
        }


    }
}

