package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {

        /*
         * 변수의 종류
         *
         * 1. 지역 변수 -- 메인 안에서만 있는 변수
         * 2. 매개 변수 -- 전달받은 인자(값) 담겨지는부분. 메인 안에서만 가능.
         * 3. 전역 변수(필드) -- 클래스에서 선언된 변수. 클래스 안에서는 전부 사용가능.
         * 4. 클래스(static) 변수 -- static이 들어간 변수. 거의 안써서 굳이 기억 x,,
         *
         * */

        Application03 app3 = new Application03();
        app3.testMethod(28);
        // app3.testMethod(20, 30);     // 매개변수와 인자의 갯수가 다를때 에러발생
        // app3.testMethod("40");       // 자료형이 다를때 에러발생.
        // app3.testMethod();          // 인자 값이 없어도 에러발생.

        // 변수에 저장한 값 전달 테스트
        int age = 20;
        app3.testMethod(age);

        // 자동 형 변환 이용한 값 전달 테스트
        byte byteAge =20;
        app3.testMethod(byteAge);
        
        // 강제 형 변환을 이용한 값 전달 테스트
        long longAge =30;
        app3.testMethod((int)longAge);    // int로 형 변환 시킴

        // 연산 결과를 이용한 값 전달 테스트
        app3.testMethod(byteAge*2);
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }

}
