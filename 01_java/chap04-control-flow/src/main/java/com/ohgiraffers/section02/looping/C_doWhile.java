package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_doWhile {
    public void testSimpleDoWhileStatement(){

        /*
        * [do-while 표현식]
        *
        * 초기식;
        * do {
        *   1회차에는 무조건 실행, 이후에는 조건식 만족할 때 실행할 구문
        *
        *   증감식;
        *   } while(조건식);
        *
        * */

        do {
            System.out.println("최초 한번 동작");
        } while(false);
        System.out.println("반복문 종료 확인");
    }

    // 문자열 입력받고, 반복적으로 출력
    // 단, exit가 입력되면 반복문을 종료.
    public void testDoWhile(){

        Scanner sc = new Scanner(System.in);
        String str = "";

        do {
            System.out.println("문자열 입력 : ");
            str = sc.nextLine();      // 이건 왜 여기있는건지,,,
            System.out.println(str);
        } while (!str.equals("exit"));
        System.out.println("프로그램 종료");
    }
}
