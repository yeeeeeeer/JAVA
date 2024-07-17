package array;

import java.util.Scanner;

public class Quiz03_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력받을 숫자의 갯수 입력");
        int count = sc.nextInt();
        int[] arr = new int[count];
        int sum = 0;
        double avg;

        System.out.println(count + " 개의 정수를 입력하세요");
        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            sum += n;
        }

        avg = sum / arr.length;

        System.out.println("입력정수 합계 : " + sum);
        System.out.println("입력정수 평균 : " + avg);

    }
}
