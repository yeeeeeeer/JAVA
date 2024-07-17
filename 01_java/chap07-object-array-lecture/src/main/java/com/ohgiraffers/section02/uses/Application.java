package main.java.com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        
        /*
        * 시스템의 요구사항
        * 1. 여러 명의 회원 정보를 받아 "한 번에 회원 정보를 등록"
        * 2. 전체 회원조회 시 여러 명의 회원 정보를 반환
        *
        * 회원 정보는 10명까지만 저장할 수 있다. (제한을 둠)
        *
        * Scanner 으로 입력값 받을 예정
        * 1. 회원 등록, 2. 회원 전체 조회, 9. 프로그램 종료 / 그 외의 값 - 잘못된 번호를 입력하셨습니다.
        * */

        Scanner sc = new Scanner(System.in);

        MemberService memberService = new MemberService();    // application 명령 실행하는 클래스 호출

        // 안내 메세지와 입력값을 연속으로 받기위한 무한 루핑
        while (true){
            System.out.println("========== 회원 관리 프로그램 ==========");
            System.out.println("1번 회원 등록");
            System.out.println("2번 회원 전체 조회");
            System.out.println("9번 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = sc.nextInt();
            
            switch (no){
                case 1 :
                    memberService.signUpMembers(); break;    // 회원 등록
                case 2:
                    memberService.showAllMembers(); break;    // 회원 조회
                case 9 :
                    System.out.println("프로그램 종료");  return;  // return 하면 메소드 밖으로 나가면서 종료됨
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다."); break;
            }
        }


    }
}
