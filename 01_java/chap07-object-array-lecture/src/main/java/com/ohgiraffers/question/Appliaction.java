package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Appliaction {
    public static void main(String[] args) {

        /*
        * 사용자 로그인 및 회원가입 시스템을 스캐너를 이용해 객체지향 적으로 구현해보자.
        *
        * - 회원가입은 10명까지만 가능
        * - 가입한 회원이 없는 상태에서 로그인을 시도하면 - 가입한 회원이 없습니다. 출력
        * - 정상적으로 가입 후 로그인 시 "로그인 완료" 출력된 후 프로그램 종료
        * - 스캐너로 아이디, 이름, 비밀번호, 비밀번호 확인 을 물어본 후 "비밀번호와 비밀번호 확인" 이 같을 시 가입 진행
        *
        * Application
        * - 스캐너로 로그인, 회원가입, 프로그램 종료 구현
        * LoginService
        * - 회원 가입, 로그인 메소드 연결
        *
        * LoginRepository
        * - 회원 가입, 로그인 처리
        *
        * User
        * - 회원의 id, pwd, name 을 받을 DTO
        *
        * */

        /*
        * 회원 정보 id, pwd, name 받기 / 회원정보 회원가입 시키기 - 회원가입 10명까지 / 로그인 시키기 - 회원가입 유무(if문)
        *
        * 회원 정보 id, name, pwd, pwdcheck 물어보기 -> pwd == pwdcheck -> 가입 진행 (조건문)
        *
        * Application 메인 - (Scanner 입력) 1.회원가입(비번, 비번확인 확인) / 2.로그인("가입 무 출력") / 3.프로그램 종료("로그인 완료") / 메뉴선택
        *
        * User 클래스 - 필드작성 / 기본생성자, 매개변수받는 생성자 / getset 생성 / getInfo 회원정보 리턴
        *
        * LoginServie 클래스(Application 수행 명령 실행) - 회원 가입 / 로그인
        *
        * LoginRepository 클래스(데이터 받아서 반환) - 회원 가입 진행시키는 조건문
        *
        * User /
        * Application -> Service -> Repository
        *
        * */

        Scanner sc = new Scanner(System.in);

        LoginService loginService = new LoginService();

        // 안내메세지 및 회원가입 / 로그인 / 종료 / 그 외는 다시 안내메세지
        while(true){
            System.out.println("======= 회원가입 및 로그인 프로그램 =======");
            System.out.println("1번. 회원가입");
            System.out.println("2번. 로그인");
            System.out.println("3번. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = sc.nextInt();   // 번호 입력 받기

            switch (no){
                case 1 : LoginService.gaip(); break;   // 회원가입 - id pwd pwd2 name 입력 - pwd pwd2 확인 - 가입 성공
                case 2 : LoginService.login(); break;   // 로그인 - 가입유무 따지기
                case 3 :
                    System.out.println("프로그램 종료"); return;  // 메소드 밖으로 - 끝
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다."); break;

            }
        }




    }
}
