package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

        // 자판기를 만들어보자.
        // 음료 종류 보여주기
        // 음료 선택 입력 받기
        // 계산 y/n ?
        // y : 음료 금액 알려준다
        // n : 다시 선택하라고 말하기
        //



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

        for (;;) {





        }

    }
}
