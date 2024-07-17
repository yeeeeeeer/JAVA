package main.java.com.ohgiraffers.section04.question;

import main.java.com.ohgiraffers.section04.question2.Question02;

import java.util.Random;

public class Question {
    public static void main(String[] args) {
        /*
         * -100 에서 100 사이의 난수를 발생시켜서 매개변수로 전달하면 (0은 고려안함)
         * 매개변수가  양수면서 짝수면, x는 양수면서 짝수입니다. 양수면서 홀수면, 양수면서 홀수입니다.
         *           음수면서 짝수면, x는 음수면서 짝수입니다. 음수면서 홀수면, 음수면서 홀수입니다.
         * 를 반환하는 메소드를 복습을 위해 다른 패키지에 클래스를 생성해 임포트 시킨 후 메인 메소드를 출력해보자.
         *
         * */
        
        // 매개변수 / 임포트 / 난수 / 삼항연산자 개념 사용

        // 난수 발생
        Random random = new Random();

        int randomNumber = random.nextInt(201) - 100;
        System.out.println(randomNumber);

        // 임포트 사용해서 다른패키지클래스 가져오기
       Question02 result = new Question02();
       String result2  = result.randomNumber(randomNumber);
       System.out.println(result2);

    }
}
