package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement() {
        /*
         * [while문 표현식]
         *
         * 초기식;
         * while(조건식){
         *       조건을 만족할때 수행할 구문(반복 구문);
         *       증감식;
         * }
         *
         * */

        // 1~10까지 증가시키면서 출력하는 기본 반복문 (while문)
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void testWhileExample() {
        // 입력한 문자열의 인덱스를 이용하여 하나씩 출력해보자

        // 문자열 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력해주세요 : ");
        String str = sc.nextLine();

        /*
         * charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 바꿔주는 기능  (인덱스라 0부터 시작)
         * length() : String "문자열의 길이"를 반환  (length라 1부터 시작)
         * */

        System.out.println("--------- for문 ---------");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);     // charAt을 ch 변수에 담음

            System.out.println(ch + " " + i);
        }

        System.out.println(" -------- while문 ---------");
        int index = 0;
        while (index < str.length()) {
            char ch = str.charAt(index);

            System.out.println(ch + " " + index);
            index++;
        }
    }

    // 정수 하나를 입력받아 1~입력받은 정수까지의 합계 구하기
    public void testWhileExample2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 하나를 입력 : ");
        int num = sc.nextInt();
        int i = 1;   // 초기식
        int sum = 0;
        while (i <= num) {
            sum += i;   //더한 합계
            i++;    //증감식
        }
        System.out.println("1부터 입력받은 정수까지의 합 : "+sum);
    }
}
