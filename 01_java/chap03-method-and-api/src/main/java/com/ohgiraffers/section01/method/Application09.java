package main.java.com.ohgiraffers.section01.method;

public class Application09 {
    public static void main(String[] args) {

        /*
         * 다른 클래스에 작성한 메소드 호출   -> calculator class 호출
         * */

        // 최솟값, 최댓값을 비교할 두 정수 선언
        int first = 100;
        int second = 50;

        // non-static 메소드의 경우
        Calculator calc = new Calculator();
        int min = calc.minNumber0f(first, second);
        System.out.println(min);

        // static 메소드인 경우    - static 명시하면 ram에서 읽어들임
        int max = Calculator.maxNumber0f(first, second);
        System.out.println(max);

        // int max2 = calc.maxNumber0f(first, second);  <- 이렇게 부르는건 권장 안 함

    }
}
