package main.java.com.ohgiraffers.section03.constant;

public class Application02 {
    public static void main(String[] args) {

        /*
         * 상수의 명명 규칙
         * 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다.
         * 2. 단어와 단어 연결은 언더스코어(_)를 사용한다. (snake case)
         *
         * */

        final int AGE1 = 10;
        final int AGE2 = 20;

        final int MAX_AGE = 50;   // 상수에서 언더스코어 사용하기    
        final int maxAge = 10;    // 상수에서는 카멜케이스 사용 안하는게 좋음
    }
}
