package scanner;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("이름 입력 (종료 입력하면 종료됨) ");
            String name = sc.nextLine();

            if (name.equals("종료")) {
                System.out.println("--- 프로그램을 종료합니다 ---");
                break;
            }

            System.out.println("나이 입력 ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("이름은 " + name + ", 나이는 " + age);

        }


    }
}
