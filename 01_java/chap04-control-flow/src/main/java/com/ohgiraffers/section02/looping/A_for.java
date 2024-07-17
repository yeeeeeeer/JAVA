package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testsimpleForStatement() {
        /*
         * [for문 표현식]
         * for(초기식; 조건식; 증감식){
         * 조건을 만족하는 경우 수행할 구문 (반복 구문) ;
         * }
         * */

        // 1부터 10까지 증가시키면서 출력될 기본 반복문
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }


    // 언제 반복문을 사용하는가?!
    public void testForExample1() {
        //10명의 학생이름을 받아 출력해보자
        Scanner sc = new Scanner(System.in);

//        System.out.println("1번째 학생 이름을 입력해주세요");
//        String stu1 = sc.nextLine();
//        System.out.println("1번째 학생의 이름은 " + stu1 + " 입니다.");

        // 반복되는 것들
        // 1. 입력 안내 메세지
        // 2. 학생 이름 입력받는 변수
        // 3. 이름 출력

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " 번째 학생의 이름을 입력 해주세요");
            String student = sc.nextLine();
            System.out.println(i + " 번째 학생의 이름은 " + student + " 입니다.");
        }
    }


    public void testForExample2() {
        // 1 ~ 10 합 구하기

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        // 합산해줄 변수
        int sum = 0;
        // sum에 변수로 선언한 값을 담기
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        sum += num6;
        sum += num7;
        sum += num8;
        sum += num9;
        sum += num10;
        System.out.println(sum);

        /*
         * 반복되는 부분
         * 1. 1씩 증가하는 값을 변수에 저장
         * 2. sum에 누적시키기
         * 3. 10번 반복
         * */

        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 += i;
        }
        System.out.println(sum2);
    }

    // 숫자 두 개를 입력받아 작은 수부터 큰 수까지의 합계를 구한다.
    public void testForExample3() {

        // 1. 스캐너를 이용해 숫자 두 개 입력받기
        // 2. 큰 수 확인 (조건문)
        // 3. 작은 수를 초기식에 넣고, 큰 수가 될때까지 반복
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수 입력: ");
        int first = sc.nextInt();
        System.out.println("두번째 정수 입력: ");
        int second = sc.nextInt();

        // 결과 담을 변수 생성
        int sum = 0;

        if (first > second) {
            for (int i = second; i <= first; i++) {
                sum += i;
            }
        } else {
            for (int i = first; i <= second; i++) {
                sum += i;
            }
        }
        System.out.println("합계: " + sum);
    }

    // 구구단 만들기
    public void printGugudan() {
        // 2 ~ 9 사이의 값을 입력 받아
        // 2 ~ 9 사이의 값이 제대로 들어왔으면 해당 구구단 출력하고,
        // 그렇지 않은경우는 "반드시 2 ~ 9사이의 양수를 입력해야 합니다" 라고 출력.

        // 단은 입력값으로 받기 - 숫자
        // 단에 2 ~ 9만 들어오는 조건문 - if else
        // 1 ~ 9 까지는 반복문에 넣기 - for

        Scanner sc = new Scanner(System.in);
        System.out.println("단을 입력해주세요 : ");
        int dan = sc.nextInt();

        if (2 <= dan && dan <= 9) {
            for (int i = 1; i < 10; i++) {
                System.out.println(dan + "*" + i + "=" + (dan * i));
            }
        } else {
            System.out.println("반드시 2 ~ 9 사이의 양수를 입력해야 합니다.");
        }
    }
}
