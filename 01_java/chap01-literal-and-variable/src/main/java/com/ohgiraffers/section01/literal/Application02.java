package main.java.com.ohgiraffers.section01.literal;

public class Application02 {
    public static void main(String[] args) {
        /*정수 리터럴 연산 형식의 값을 직접 연산한다*/

        /*
         * 1. 123 + 456
         * 2. 123 - 456
         * 3. 123 * 456
         * 4. 40 / 10
         * 5. 10 % 2
         * */

        /*정수와 실수 연산*/
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);      //정수와 실수가 연산을 하면 실수로 바뀐다

        System.out.println("--------------------");
        /*문자와 문자의 연산*/
        /*문자끼리의 연산도 사칙연산 가능하다*/
        /*지금은 계산 결과가 왜 이렇게 나왔는지 보다 연산 사용이 가능하다는 것에 집중하자.*/
        System.out.println('a' + 'b');
        System.out.println('ㄱ' + 'ㄴ');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("--------------------");
        /*문자열은 +(플러스) 연산만 가능하다.*/       //문자열 > 숫자, 연산자 -> 때문에 문자열로 바뀐다
        System.out.println("hello" + 123);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'a');
        System.out.println("hello" + true);

        System.out.println("123" + "456");

        /*논리값 연산*/
//        System.out.println(true + false);    --불가능
        System.out.println(true + "false");
//        System.out.println(true + 1);    --불가능
        System.out.println("안녕" + "하세" + "요");

    }
}
