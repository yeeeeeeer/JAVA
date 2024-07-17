package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatement() {

        /*
         * [if 조건문]
         * if(조건식){
         * 조건식이 true일 때 실행할 명령문
         * }
         * */

        /*
         * 조건식 : true or false 가 나오는 연산식을 조건식이라고 한다.
         * if문은 조건식의 결과 값이 true가 나오면 {} 안에 있는 코드를 실행하고,
         * 조건식의 결과 값이 거짓이면 {} 안에 있는 코드를 무시하고 넘어간다.
         * */

        /*
         * 정수 한 개를 입력 받아 그 수가 짝수면 "입력하신 숫자는 짝수입니다"라고 출력하고,
         * 짝수가 아니면 출력하지 않는 구문을 작성해보자.
         * 단, 조건과 상관없이 프로그램이 종료될 때 "프로그램이 종료됩니다"라고 출력되게 한다.
         * */

        Scanner scr = new Scanner(System.in);  // Scanner scr 이라는 지역변수. 다른 스코프에선 사용못함.
        int first = scr.nextInt();

        if (first % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다");
        }
        System.out.println("프로그램을 종료합니다");
    }

    public void testNestedIfStatment() {
        // 중첩된 if문 실행 흐름 확인

        /*
         * 정수 한개를 입력받아서 그 수가 양수인 경우에만 짝수인지를 확인하여
         * 짝수면, "입력하신 숫자는 양수면서 짝수입니다" 라고 출력하고,
         * 둘 중 하나라도 해당되지않으면 아무 내용도 출력하지 않는 구문을 작성해보자.
         * 단, 조건과 상관없이 프로그램이 종료될 때 "프로그램 종료"라고 출력되도록 한다.
         * */

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        // 조건1. 양수 / 조건2. 짝수
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("입력하신 숫자는 양수면서 짝수입니다");
            }
        }
        System.out.println("프로그램 종료");
    }
}
