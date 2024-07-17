package main.java.com.ohgiraffers.section05.logical;

public class Application02 {
    public static void main(String[] args) {

        /*
         * 논리 연산자의 우선순위
         * && : 11순위
         * || : 12순위
         * */

        int num1 = 55;
        // 1 < num1 < 100 --- 불가능
        System.out.println("1부터 100 사이에 있는지 확인 : " + (num1 >= 1 && num1 <= 100));

        // 영어 대문자 확인
        char ch1 = 'G';
        System.out.println("영어 대문자 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));
        // 영어 소문자 확인
        char ch2 = 'g';
        System.out.println("영어 소문자 확인 : " + (ch2 >= 'A' && ch2 <= 'Z')); // flase : 영어소문자 선언 - 연산자에 영어대문자여서 false -> 영어 대소문자 구분해야함

        // 영문자 y 확인
        char ch3 = 'Y';
        char ch4 = 'y';
        System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));
        System.out.println("영문자 y인지 확인 : " + (ch4 == 'y' || ch4 == 'Y'));

        // 문자는 아스키코드로 숫자값도 있다
        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
        System.out.println("영문자인지 확인 : " + ((ch5 >= 65 && ch5 <= 90) || (ch5 >= 97 && ch5 <= 122)));

        char ch6 = 'F';
        System.out.println("영문자인지 확인 : " + ((ch6 >= 'A' && ch6 <= 'Z') || (ch6 >= 'a' && ch6 <= 'z')));
        System.out.println("영문자인지 확인 : " + ((ch6 >= 65 && ch6 <= 90) || (ch6 >= 97 && ch6 <= 122)));

    }
}
