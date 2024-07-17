package main.java.com.ohgiraffers.section01.conditional.question;

import java.util.Scanner;

public class Point {

    // 점수입력 메소드 > 평균메소드 호출 > 결과메소드 호출
    public void point() {

        Scanner sc = new Scanner(System.in);
        System.out.println(" A 점수를 입력해주세요");
        int a = sc.nextInt();
        System.out.println(" B 점수를 입력해주세요");
        int b = sc.nextInt();
        System.out.println(" C 점수를 입력해주세요");
        int c = sc.nextInt();

        // 평균구하는 메소드 호출
        Average aver = new Average();
        int average = aver.aver(a, b, c);   // 점수인자 변수로 넣음

        // 결과나오는 메소드 호출
        PassNonpass result = new PassNonpass();
        result.result(a, b, c, average);
    }
}
