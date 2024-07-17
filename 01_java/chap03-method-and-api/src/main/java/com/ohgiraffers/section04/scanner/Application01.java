package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /*
         * java.util.Scanner
         * 콘솔 화면에 값을 입력 받는 기능을 제공한다.
         * */

        Scanner sc = new Scanner(System.in);    //system.in : 권한을 부여해주는 기능 가짐

        System.out.println("이름을 입력해주세요 : ");
        String name = sc.nextLine();         // 텍스트 입력칸을 문자열로 받아서 실행 <-문자열이 가장 커서 어떤 값을 받아도 형변환을 시켜준다.
        System.out.println("안녕하세요 " + name + "님!");

        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "세 입니다.");

        System.out.println("원하는 금액을 입력해주세요 : ");
        long lnum = sc.nextLong();
        System.out.println("입력한 long 타입 금액 : " + lnum);

        System.out.println("원하는 실수를 입력하세요 : ");
        double dnum = sc.nextDouble();
        System.out.println("입력한 실수는 :" + dnum + "이다.");

        System.out.println("참과 거짓 중에 한 가지를 true 아니면 false로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println((isTrue) ? "참" : "거짓");

        sc.nextLine();  // 이거 써줘야함 왜????
        System.out.println("아무 문자나 입력해주세요 : ");
        char charValue = sc.nextLine().charAt(0);       // charAt : 받은 값의 0번째 인덱스를 알려줌.
        System.out.println(charValue);
    }

}
