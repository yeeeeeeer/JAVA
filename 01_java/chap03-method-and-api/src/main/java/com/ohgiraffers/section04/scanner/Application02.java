package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        /*
         * nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행문자(줄넘김) 전까지 읽어서 문자열로 반환한다.  <- 줄넘김 전까지만 반환
         * next() : 공백문자나 개행문자 전까지를 읽어서 문자열로 반환한다.  <- 띄어쓰기 전까지도 반환
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력해주세요 : ");   //안녕하세요 반가워요
        String greeting = sc.nextLine();
        System.out.println(greeting);    //안녕하세요 반가워요

        System.out.println("두번째 값을 입력해주세요 : ");    //안녕하세요 반가워요
        String greeting2 = sc.next();
        System.out.println(greeting2);    // 안녕하세요
    }
}
