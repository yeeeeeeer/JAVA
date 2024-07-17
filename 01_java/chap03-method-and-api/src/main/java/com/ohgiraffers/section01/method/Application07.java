package main.java.com.ohgiraffers.section01.method;

import jdk.swing.interop.SwingInterOpUtils;

public class Application07 {
    public static void main(String[] args) {

        /*
         * 실습
         * 두 수를 매개변수로 받아 더한 값을 반환하는 메소드
         * 두 수를 매개변수로 받아 뺀 값을 반환하는 메소드
         * 두 수를 매개변수로 받아 곱한 값을 반환하는 메소드
         * 두 수를 매개변수로 받아 나누 값을 반환하는 메소드
         *
         * 반환받아서 메인 메소드에 System.out.println 을 이용해 출력해주시면 됩니다.
         * */

        Application07 app07 = new Application07();
        System.out.println("더하기: " + app07.plus(3, 4));
        System.out.println("빼기: " + app07.minus(5, 2));
        System.out.println("곱하기: " + app07.multiply(3, 7));
        System.out.println("나누기: " + app07.divide(12, 4));

        int plus = app07.plus(4, 5);
        int minus = app07.minus(5, 5);
        int multiply = app07.multiply(6, 3);
        int divide = app07.divide(56, 4);
        System.out.println("더하기: " + plus);
        System.out.println("빼기: " + minus);
        System.out.println("곱하기: " + multiply);
        System.out.println("나누기: " + divide);

    }

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }


}
