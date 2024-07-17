package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfElseStatment() {
        /*
         * [if-else 조건식]
         * if(조건식){
         * 조건식이 true일 때 실행할 명령문;
         * } else {
         * 조건식이 false일 때 실행할 명령문;
         * }
         * */

        /*
         * 정수 한 개를 입력받아 그 수가 홀수이면 "입력하신 숫자는 홀수다."라고 출력하고
         * 홀수가 아니면 "입력하신 숫자는 짝수다."라고 출력하는 프로그램을 작성해보자.
         * 단, 조건과 상관없이 프로그램이 종료될때 "프로그램 종료"라고 출력되도록 한다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 하나 입력해주세요");
        int num = sc.nextInt();

        if (num % 2 != 0) {
            System.out.println("입력하신 숫자는 홀수다.");
        } else {
            System.out.println("입력하신 숫자는 짝수다.");
        }
        System.out.println("프로그램 종료");
    }

    public void testNestedIfElseStatment() {
        // if-Else 중첩

        /*
         * 숫자를 하나 입력받아서 "입력하신 숫자는 양수다.",
         * 음수이면 "입력하신 숫자는 음수다." 출력
         * 단, 0이면 "0입니다"를 출력합니다.
         * 조건과 상관없이 프로그램이 종료될 때 "프로그램 종료"라고 출력되도록 한다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 하나를 입력해주세요");
        int num = sc.nextInt();

        if (num != 0) {
            if (num > 0) {
                System.out.println("입력하신 숫자는 양수다");
            } else {
                System.out.println("입력하신 숫자는 음수다");
            }
        } else {
            System.out.println("입력하신 숫자는 0입니다.");
        }
        System.out.println("프로그램 종료");
    }
}
