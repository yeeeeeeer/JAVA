package main.java.com.ohgiraffers.section02.looping;

public class Application {
    public static void main(String[] args) {


        A_for a = new A_for();
//        a.testsimpleForStatement();
//        a.testForExample1();      // 10명의 학생이름 출력
//        a.testForExample2();      // 1 ~ 10 합계
//        a.testForExample3();      // 숫자 두개. 작은수 ~ 큰수 합계
//        a.printGugudan();         // 구구단만들기

        A_nestedFor a2 = new A_nestedFor();
//        a2.printGugudanFromTwoTNine();    //중첩for문 구구단
//        a2.printUpgradeGugudan();
//        a2.printTriangleStars();       //별찍기

        B_while b = new B_while();
//        b.testSimpleWhileStatement();    //while문 1~10 출력
//        b.testWhileExample();           //입력한 문자열의 인덱스를 이용하여 하나씩 출력
//        b.testWhileExample2();        //1~입력받은 정수까지의 합계

        C_doWhile c = new C_doWhile();
//        c.testSimpleDoWhileStatement();
        c.testDoWhile();


    }


}
