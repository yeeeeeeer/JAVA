package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromTwoTNine() {

        // 2단부터 단을 1단씩 증가시키는 반복문 만들기

        // 1단씩 증가 (2~9단)
        for (int dan = 2; dan < 10; dan++) {
            // 단수의 1~9까지 곱하기
            for (int su = 1; su < 10; su++) {
                System.out.println(dan + "*" + su + "=" + (dan * su));
            }
        }
    }


// 단과 곱하기를 각각의 메소드로 나누었다.

    public void printUpgradeGugudan() {
        // 2~9 단 증가
        // 단을 매개변수로 전달
        for (int dan = 2; dan < 10; dan++) {

            // 밑의 메소드를 호출했다.
            // (dan) <- 매개변수임
            printGugudan(dan);
            System.out.println(" ");
        }
    }

    // 단을 인자로 받을 메소드   // int dan <- 매개변수임
    public void printGugudan(int dan) {
        for (int su = 2; su < 10; su++) {
            System.out.println(dan + "*" + su + "=" + (dan * su));
        }
    }


    // 별찍기
    public void printTriangleStars() {

        // 키보드로 정수를 하나 입력받아 해당 정수만큼 한 행에 "*"을
        // 행의 번호만큼 열을 별로 출력하세요
        // 중첩 for문 사용

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해주세요");
        int row = sc.nextInt();

        // 출력할 행 반복문
        for (int i = 1; i <= row; i++) {

            // 행 수만큼 별(열) 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
