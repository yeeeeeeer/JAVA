package main.java.com.ohgiraffers.section03.math;

import java.util.Random;

public class Application01 {
    public static void main(String[] args) {
        /*
         * api 란?
         * Application programing interface 는 응용 프로그램에서 사용할 수 있도록,
         * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
         * 쉽게 말해 우리가 구현할 수 없거나, 구현하기 번거로운 기능들을 jdk 를 설치하면 자동으로 사용할 수 있도록
         * 제공해놓은 소스코드들을 의미한다.
         * 더 쉽게 말해 누가 작성해놓은 소스 코드들을 가져다 쓰는 방법을 본다는 말이다.
         * 모든 코드를 개발자들이 다 외울 수 없기 때문에 api 문서를 별도로 제공해주고 있다.
         */

        /*
         * java.lang.Math    <- Math라는 api 중 하나
         * Math 클래스는 수학에서 자주 사용되는 상수들과 함수들을 미리 구현해놓은 클래스이다.
         * 모든 메소드는 static 메소드로 정의되어있다.
         * */

        System.out.println("-7의 절대값: " + (java.lang.Math.abs(-7)));

        // import 를 사용해서 사용하기.  -> java.lang. 안쳐도된다
        // Math의 기능을 사용해본다 (abs, min, max, PI..)
        System.out.println("-1.25의 절대값: " + (Math.abs(-1.25)));
        System.out.println("10과 20중 더 작은 값은? : " + (Math.min(10, 20)));
        System.out.println("10과 20중 더 큰 값은? : " + (Math.max(30, 50)));

        System.out.println("원주율 : " + (Math.PI));

        /*
         * 원하는 범위의 난수를 구하는 공식
         * */

        // 난수 발생(0 ~ 10)  <- 개발환경에서 자주 쓰임(ex. 로또추첨)
        System.out.println("난수 발생 : " + (int) (Math.random() * 10));    // double 0.xxx 형식이어서 int로 형 변환하여 소숫점아래를 빼주었다.

        Random random = new Random();
        int randomNumber = random.nextInt(100);      //자릿수의 범위를 설정해서 넣어주면 됨.
        System.out.println("난수 발생 : " + randomNumber);

        // -128 ~ 127 사이의 난수를 발생시키기.
        int randomNumber1 = new Random().nextInt(256) - 128;
        System.out.println(randomNumber1);


    }
}
