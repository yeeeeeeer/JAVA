package main.java.com.ohgiraffers.section05.typecasting;

public class Application01 {
    public static void main(String[] args) {
        /*
         * 데이터 형 변환
         * 자바에서 다른 타입끼리의 연산은 피 연산자들의 모두 같은 타입인 경우 실행할 수 있다.
         * 즉 같은 데이터 타입끼리만 연산을 수행할 수 있다.
         * */

        /*
         * 형 변환의 종류와 규칙
         * 1. 자동 형 변환 - 컴파일러가 자동으로 수행해주는 타입변환
         *   1-1. 작은 자료형에서 큰 자료형으로 자동 형 변환된다.
         *   1-2. 정수는 실수로 자동 형 변환된다.
         *   1-3. 문자형은 int 형으로 자동 형 변환된다.
         *   1-4. 논리형은 형변환 규칙에서 제외된다.
         *
         * 2. 강제 형 변환 - 형 변환 cast 연산자를 이용한 강제적으로 수행하는 형 변환
         * */

        //1-1. 정수끼리의 형 변환
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;        //큰 자료형으로 자동 형 변환해준다. - byte>short=char=boolean>int>long >float>double
        long lnum = inum;
        int num1 = 10;
        long num2 = 20L;

        long result = num1 + num2;      //연산에도 자동형변환 적용된다.
        // int result2 = num1 + num2;

        //1-2. 정수와 실수의 형 변환         * 실수가 정수보다 큰 존재임.

        long eight = 8L;
        float four = eight;          // 롱타입이 실수형으로 변환됨.
        System.out.println(four);

        float result3 = eight + four;
        System.out.println(result3);

        char ch1 = 'a';
        int charNumber = 97;

        char chValue = (char) charNumber;     //숫자를 문자로 변환
        System.out.println(chValue);
        System.out.println((int) ch1);    //문자를 숫자로 변환
        System.out.println((char) charNumber);

        char ch2 = 65;
        System.out.println(ch2);

        // 논리형은 형변환 규칙에서 "제외" 된다.
//        boolean isTrue = false;
//        byte b = isTrue;
//        String test = isTrue;
//        int i = isTrue;
    }
}
