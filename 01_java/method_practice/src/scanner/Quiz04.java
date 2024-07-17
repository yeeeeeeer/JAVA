package scanner;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 구구단의 단 입력 ");
        int n = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }


    }
}
