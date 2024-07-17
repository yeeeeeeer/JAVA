package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class LoginService {
    static Scanner sc = new Scanner(System.in);

    // 회원가입
    public static void gaip() {


        // 스캐너 id name pwd pwd2
        System.out.println("==== 회원가입 화면 =====");
        System.out.println("아이디 : ");
        String id = sc.nextLine();
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("비밀번호 : ");
        int pwd = sc.nextInt();
        System.out.println("비밀번호 확인 : ");
        int pwd2 = sc.nextInt();

        // pwd == pwd2 가입 유무 (if문)
        if (pwd == pwd2) {
            System.out.println("회원가입 진행,,");

            // 회원가입된 회원 등록
            // User에 있는 생성자를 불러서 값을 할당한거임
            User users = new User(id, pwd);


        } else {
            System.out.println("비밀번호 다시 확인해주세요.");
            // 회원가입 입력
        }
    }


    // 로그인
    public static void login() {

        // 스캐너 id pwd
        System.out.println("아이디 입력 : ");
        String id = sc.nextLine();
        System.out.println("비밀번호 입력 : ");
        int pwd = sc.nextInt();



        // 로그인 시 가입 유무 확인 알려주는 출력 메소드
        if (LoginRepository.store()) {
            System.out.println("로그인 성공");
            // 프로그램 종료 시키기

        } else {
            System.out.println("아이디, 비밀번호 다시 입력하세요");
        }
    }
}
