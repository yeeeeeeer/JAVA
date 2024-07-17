package main.java.com.ohgiraffers.section01.arithmetic;

public class Application01 {
    public static void main(String[] args) {

        /*
         * 산술 연산자
         * 산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서
         * 가장 많이 사용되는 연산자이다.
         * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자(항이 두개 필요한)로 분류되며
         * 피연산자들의 방향은 왼쪽에서 오른쪽이다.
         * */


        /*
         *  + - * / %
         * */

        int num1 = 20;
        int num2 = 7;
        System.out.println("num1 + num2 : " + num1 + num2);   //문자열과 숫자가 더해져서 더큰 자료형인 문자열로 형변환이 일어남.-> 문자열로 인식
        System.out.println("num1 + num2 : " + (num1 + num2));   //괄호 씌워서 높은 우선순위 만들어주기
//        System.out.println("num1 - num2 : " + num1 - num2);    //에러발생 -> 문자열은 더하기연산만 가능하기 때문에 빼기는 에러발생된다
        System.out.println("num1 * num2 : " + num1 * num2);
        System.out.println("num1 / num2 : " + num1 / num2);
        System.out.println("num1 % num2 : " + num1 % num2);

    }
}
