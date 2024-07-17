package main.java.com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args) {

        /*
         * 메소드란?
         * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이다.  //메인 스코프안에서만 만들기 가능.
         * */

        System.out.println("main() 메소드 시작됨...");

        Application01 app = new Application01();  //클래스도 하나의 자료형이다. 클래스 안에 값(자기자신 클래스) 을 넣어서 초기화해야함.
        app.methodA();

        System.out.println("main() 메소드 종료됨...");
    }

    
    // static 있는건 클래스초기화해서 main 밖에있는 method를 불러온다.  **
    // main 밖에 있는건 그냥 이름만 불러서 호출한다    **

    // public void  ????
    public void methodA() {
        System.out.println("methodA() 호출");
        methodB();
        System.out.println("methodA() 종료");
    }

    public void methodB(){
        System.out.println("methodB() 호출");
        System.out.println("methodB() 종료");
    }
}
