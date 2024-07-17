package main.java.com.ohgiraffers.section05.logical;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 논리식 && : 앞의 결과가 false이면 뒤의 연산을 실행하지 않음.
        * 논리식 || : 앞의 결과가 true이면 뒤의 연산을 실행하지 않음.
        * */

        // 삼항 연산자
        int num1 = 10;
        int result = (false && ++num1 > 0)? num1 : 20;

        System.out.println(result);
        System.out.println(num1);  // && 조건식에 증감연산자보다 false가 먼저 있기때문에 false만 실행되고 뒤에 연산은 실행되지 않음

        int num2 =20;
        int result2 = (true || ++num2 > 0)? num2 : 30;
        System.out.println(result2);
        System.out.println(num2);

    }
}
