package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        // 자판기를 만들어보자.
        /*
         * 원하는 음료수를 입력 받는다.
         * 음료수는 사이다, 콜라, 환타, 박카스, 핫식스
         *         500   600   700   800   900
         * 잘못된 음료수를 선택한 경우는 다시 입력 받는다.
         *
         * 계산하시겠습니까? (y/n)
         * y : "총 금액은 ~원 입니다."
         * n : "음료수를 더 선택해주세요" - 음료수종류를 보여준다
         * 사이다
         * 계산하시겠습니까? (y/n)
         * 먼저 고른 음료수랑 사이다 값을 더해서 "총 금액을 ~원입니다." 출력
         * */

        /*
         * 음료수 입력 받는 스캐너
         * 음료 선택
         * 잘못된 음료를 선택하면 처음으로 돌아간다
         * 음료 선택 후 계산하겠냐? y/n
         * y - 총 금액 알려주고 종료.
         * n - 음료 더 선택해라. -> 음료 입력받는 스캐너로 돌아간다.
         * */

        Scanner sc = new Scanner(System.in);

        // for(;;)  포문 무한 반복
        int totalPrice = 0;   // 고른 음료들의 총 가격. // for문 밖에 놓기.

        for (; ; ) {
            System.out.println("사이다 500원 / 콜라 600원 / 환타 700원 / 박카스 800원 / 핫식스 900원");
            System.out.println("음료를 선택해주세요.");
            String first = sc.nextLine();

            int price = 0;    // 고른 음료 1개의 가격 출력

            if (first.equals("사이다")) {
                price += 500;
            } else if (first.equals("콜라")) {
                price += 600;
            } else if (first.equals("환타")) {
                price += 700;
            } else if (first.equals("박카스")) {
                price += 800;
            } else if (first.equals("핫식스")) {
                price += 900;
            } else {
                System.out.println("잘못된 음료입니다. 다시 입력 해주세요.");
                continue; // 멈추고 다시 처음으로 돌아가 반복한다
            }

            System.out.println("계산하시겠습니까? (Y/N)");
            String second = sc.nextLine();   // 대답 입력받음
            totalPrice += price;   // 누적된 음료값들의 총 급액의 합계 코드
            if (second.equals("Y")) {
                System.out.println("총 금액은 " + totalPrice + " 원 입니다.");
                break; // 반복문 끝남
            } else if (second.equals("N")) {
                System.out.println("음료를 더 선택 해주세요.");
            } else {
                System.out.println("정확하게 입력 해주세요.");
            }
        }

    }
}
