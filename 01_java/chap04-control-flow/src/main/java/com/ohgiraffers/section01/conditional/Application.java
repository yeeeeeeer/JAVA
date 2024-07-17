package main.java.com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {

        A_if a = new A_if();
//        a.testSimpleIfStatement();      // 짝수
//        a.testNestedIfStatment();       // 양수 + 짝수

        B_ifElse b = new B_ifElse();
//        b.testSimpleIfElseStatment();         // 짝 홀
//        b.testNestedIfElseStatment();         // 양수 음수 0

        C_ifElseif c = new C_ifElseif();
//        c.testSimpleIfElseIfStatement();          // 금도끼은도끼
//        c.testNestedIfElseIfStatement();          // 성적 등급

        D_switch d = new D_switch();
//        d.restSimpleSwitchStatement();         // switch문 계산기
        d.restSwichVendingMachine();           // switch문 음료 자판기
    }
}
